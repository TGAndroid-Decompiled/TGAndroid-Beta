package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class rp0 implements lq0 {
    public final HashMap f41216a;
    public final ArrayList f41217b;
    public final vp0 f41218c;

    public rp0(vp0 vp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f41218c = vp0Var;
        this.f41216a = hashMap;
        this.f41217b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        vp0 vp0Var = this.f41218c;
        org.telegram.ui.Components.qu quVar = vp0Var.M;
        vp0Var.f42804a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        vp0 vp0Var = this.f41218c;
        vp0Var.removeSelfFromStack();
        if (!z10) {
            vp0Var.V(this.f41216a, this.f41217b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
