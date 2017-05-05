package csc445.lye.edu.missouriwestern.ly_softball;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

public class SoftballListFragment extends Fragment {

    private RecyclerView mSoftballRecyclerView;
    private SoftballAdapter mSoftballAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_softball_list, container, false);

        mSoftballRecyclerView = (RecyclerView) view .findViewById(R.id.softball_recycler_view);
        mSoftballRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private class SoftballHolder extends RecyclerView.ViewHolder{
        public EditText mLastNameEdit;

        public SoftballHolder(View itemView){
            super(itemView);

            mLastNameEdit = (EditText) itemView;
        }

    }

    private class SoftballAdapter extends RecyclerView.Adapter<SoftballHolder>{
        private List<Players> mPlayers;

        public SoftballAdapter(List<Players> players){
            mPlayers = players;
        }

        @Override
        public SoftballHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater= LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(android.R.layout.simple_list_item_1, parent, false);
            return new SoftballHolder(view);
        }

        @Override
        public void onBindViewHolder(SoftballHolder holder, int position){
            Players players = mPlayers.get(position);
            holder.mLastNameEdit.setText(players.getLastName());
        }

        @Override
        public int getItemCount(){
            return mPlayers.size();
        }
    }

    private void updateUI(){
        SoftballLab softballLab = SoftballLab.get(getActivity());
        List<Players> players = softballLab.getPlayers();

        mSoftballAdapter = new SoftballAdapter(players);
        mSoftballRecyclerView.setAdapter(mSoftballAdapter);
    }

}
