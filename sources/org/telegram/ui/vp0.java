package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class vp0 implements sq0 {
    public final HashMap f38790a;
    public final ArrayList f38791b;
    public final cq0 f38792c;

    public vp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38792c = cq0Var;
        this.f38790a = hashMap;
        this.f38791b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f38792c;
        org.telegram.ui.Components.ku kuVar = cq0Var.M;
        cq0Var.f32772a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f38792c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(this.f38790a, this.f38791b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
