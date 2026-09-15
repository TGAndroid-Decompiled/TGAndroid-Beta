package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f40157a;
    public final bo f40158b;
    public final ArrayList f40159c;

    public zf(bo boVar, ArrayList arrayList, int i10) {
        this.f40157a = i10;
        this.f40158b = boVar;
        this.f40159c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40157a) {
            case 0:
                bo boVar = this.f40158b;
                pi piVar = new pi(boVar, boVar, boVar.getParentActivity(), boVar.f32297ea, this.f40159c);
                piVar.setCalcMandatoryInsets(boVar.x9());
                piVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(piVar);
                return;
            default:
                bo boVar2 = this.f40158b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.f32297ea, this.f40159c).show();
                    boVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
