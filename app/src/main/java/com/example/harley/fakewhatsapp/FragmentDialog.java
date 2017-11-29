package com.example.harley.fakewhatsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class FragmentDialog extends Fragment{
    public FragmentDialog(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dialog, container, false);

        ListView listview = (ListView)root.findViewById(R.id.list);

        List<ListDialog> lista = new ArrayList<>(7);
        lista.add(new ListDialog(R.drawable.aquaman, "Fala com peixes..", "Para de ser mongolóide! Quantas vezes eu vou ter que dizer que salmão não é pra fazer na panela."));
        lista.add(new ListDialog(R.drawable.cyborg, "Homem Lata", "Mano, preciso de uns lubrificador aí. Tava tentando dar uma bronhada aí o negócio estourou aqui, sério conta pra Diana não."));
        lista.add(new ListDialog(R.drawable.flash, "Cotoco", "Oi.....................oi...oi...oioi....ioioioioi..................oooooooooooooooi......oioi"));
        lista.add(new ListDialog(R.drawable.mulher, "Rabetuda", "Nem comenta de ontem, foi maravilhoso, pena que vc nunca da conta do recado."));
        lista.add(new ListDialog(R.drawable.superman, "Bolado e Puto", "Vc tá querendo morrer? Eu ja disse que vc não aguenta a Diana, eu vou fazer vc lembrar quem que sangra."));
        DialogAdapter adapter = new DialogAdapter(root.getContext(), lista);
        listview.setAdapter(adapter);

        return root;


    }
}
