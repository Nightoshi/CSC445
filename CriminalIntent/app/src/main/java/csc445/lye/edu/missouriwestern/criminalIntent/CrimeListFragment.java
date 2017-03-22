public class CrimeListFragment extends Fragment {
	private RecyclerView mCrimeRecyclerView;
	private CrimeAdapter mCrimeAdapter;
	
	@Override
	public view OnCreateView(LayoutInFlater inflater, ViewGroup container container, Bundle savedInstanceState){
	
		View view = inflater.inflate(R.layout.fragment_crime_list, container, false);
		
		mCrimeRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
		
		mCrimeRecyclerView.setLayoutManager(new LinearLayoutManager (getActivity()));
		
		updateUI();

		return view;
	}
	
	private void updateUI(){
		CrimeLab crimeLab = CrimeLab.get(getActivity());
		List<Crime> crimes = crimeLab.getCrimes();
		
		mAdapter = new CrimeAdapter (crimes);
		mCrimeRecyclerView.setAdapter(mAdapter);
	}
	
	private class CrimeHolder extends RecyclerView.ViewHolder{
		public TextView mTitleTextView;
	
		public CrimeHolder(view itemView){
			super(itemView);
			mTitleTextView = (TextView) itemView;
		}
	}
	
	private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {
		private List<Crime> mCrimes;
	
		public CrimeAdapter(List<Crime> crimes){
			mCrimes = crimes;
		}
	}
	
	@Override
	public CrimeHolder OnCreateViewHolder(viewGroup parent, int viewType){
		LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
		View view = layoutInflater.inflate(android.R.layout.simple_list_items_1, parent, false);
		return new CrimeHolder (view);
	}
	
	@Override
	public void onBindViewHolder(CrimeHolder holder, int position) {
		Crime crime = mCrimes.get(position);
		holder.mTitleTextView.setText(crime.getTitle());
	}
	
	@Override
	public int getItemCount(){
		return mCrimes.seize();
	}
	
	
	
	
}
