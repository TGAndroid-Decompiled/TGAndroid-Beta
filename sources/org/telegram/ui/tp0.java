package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class tp0 implements lq0 {
    public final HashMap f38571a;
    public final ArrayList f38572b;
    public final wp0 f38573c;

    public tp0(wp0 wp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38573c = wp0Var;
        this.f38571a = hashMap;
        this.f38572b = arrayList;
    }

    @Override
    public final void c(Editable editable) {
        wp0 wp0Var = this.f38573c;
        org.telegram.ui.Components.cu cuVar = wp0Var.J;
        wp0Var.f39747a = editable;
        cuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.f38573c;
        wp0Var.removeSelfFromStack();
        if (!z4) {
            wp0Var.V(this.f38571a, this.f38572b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }
}
