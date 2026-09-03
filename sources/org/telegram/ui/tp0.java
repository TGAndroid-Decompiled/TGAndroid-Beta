package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class tp0 implements lq0 {
    public final HashMap f41616a;
    public final ArrayList f41617b;
    public final wp0 f41618c;

    public tp0(wp0 wp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f41618c = wp0Var;
        this.f41616a = hashMap;
        this.f41617b = arrayList;
    }

    @Override
    public final void c(Editable editable) {
        wp0 wp0Var = this.f41618c;
        org.telegram.ui.Components.fu fuVar = wp0Var.J;
        wp0Var.f42832a = editable;
        fuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.f41618c;
        wp0Var.removeSelfFromStack();
        if (!z4) {
            wp0Var.V(this.f41616a, this.f41617b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }
}
