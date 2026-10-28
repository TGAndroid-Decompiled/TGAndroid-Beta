package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class zp0 implements sq0 {
    public final HashMap f46336a;
    public final ArrayList f46337b;
    public final cq0 f46338c;

    public zp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f46338c = cq0Var;
        this.f46336a = hashMap;
        this.f46337b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f46338c;
        org.telegram.ui.Components.ru ruVar = cq0Var.M;
        cq0Var.f38432a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f46338c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.W(this.f46336a, this.f46337b, z11, i10);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }
}
