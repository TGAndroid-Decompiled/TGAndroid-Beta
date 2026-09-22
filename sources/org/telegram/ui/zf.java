package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f40163a;
    public final bo f40164b;
    public final ArrayList f40165c;

    public zf(bo boVar, ArrayList arrayList, int i10) {
        this.f40163a = i10;
        this.f40164b = boVar;
        this.f40165c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40163a) {
            case 0:
                bo boVar = this.f40164b;
                pi piVar = new pi(boVar, boVar, boVar.getParentActivity(), boVar.f32293ea, this.f40165c);
                piVar.setCalcMandatoryInsets(boVar.x9());
                piVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(piVar);
                return;
            default:
                bo boVar2 = this.f40164b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.f32293ea, this.f40165c).show();
                    boVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
