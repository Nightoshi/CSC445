package csc445.lye.edu.missouriwestern.ly_softball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SoftballListFragment extends Fragment {

    private RecyclerView mSoftballRecyclerView;
    private SoftballAdapter mSoftballAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_softball_list, container, false);

        mSoftballRecyclerView = (RecyclerView) view
                .findViewById(R.id.softball_recycler_view);
        mSoftballRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private class SoftballHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitleTextView;
        private CheckBox mCheckBox;
        private Softball mSoftball;


        public SoftballHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView)
                    itemView.findViewById(R.id.list_item_softball_title_text_view);
            mCheckBox = (CheckBox)
                    itemView.findViewById(R.id.list_item_softball_check_box);
        }

        @Override
        public void onClick(View v) {
//            Toast.makeText(getActivity(),
//                    mSoftball.getTitle()+ " clicked!", Toast.LENGTH_SHORT)
//                    .show();
            Intent intent = SoftballActivity.newIntent(getActivity(),mSoftball.getId());
            startActivity(intent);

    }

        public void bindSoftball(Softball softball){
            mSoftball = softball;
            mTitleTextView.setText(mSoftball.getTitle());
        }
    }

    private class SoftballAdapter extends RecyclerView.Adapter<SoftballHolder>{
        private List<Softball> mSoftballs;

        public SoftballAdapter(List <Softball> softballs){
            mSoftballs = softballs;
        }

        @Override
        public SoftballHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(R.layout.list_item_softball, parent, false);
            return new SoftballHolder(view);
        }

        @Override
        public void onBindViewHolder(SoftballHolder holder, int position){
            Softball softball = mSoftballs.get(position);
            holder.bindSoftball(softball);
        }

        @Override
        public int getItemCount(){
            return mSoftballs.size();
        }
    }

    private void updateUI(){
        SoftballLab softballLab = SoftballLab.get(getActivity());
        List<Softball> softBall = softballLab.getSoftBall();

        mSoftballAdapter = new SoftballAdapter(softBall);
        mSoftballRecyclerView.setAdapter(mSoftballAdapter);
    }

}
