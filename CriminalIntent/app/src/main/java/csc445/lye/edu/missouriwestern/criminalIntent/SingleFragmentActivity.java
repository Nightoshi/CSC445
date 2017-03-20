public abstract class SingleFragmentActivity extends FragmentActivity{
	protected abstract fragment createFragment();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
		
		FragmentManager fm = getSupportFragmentManager();
		Fragment Fragment = fm.findFragmentById(R.id.fragment_container);
		
		if (fragment == null){
			fragment = createFragment();
			fm.beginTransaction()
				.add(R.id.fragment_container, fragment)
				.commit();
		}
	}
}
