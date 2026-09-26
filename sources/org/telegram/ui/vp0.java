package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class vp0 implements sq0 {
    public final HashMap f38789a;
    public final ArrayList f38790b;
    public final cq0 f38791c;

    public vp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38791c = cq0Var;
        this.f38789a = hashMap;
        this.f38790b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f38791c;
        org.telegram.ui.Components.ku kuVar = cq0Var.M;
        cq0Var.f32771a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f38791c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(this.f38789a, this.f38790b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
