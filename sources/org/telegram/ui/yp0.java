package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class yp0 implements sq0 {
    public final HashMap f40327a;
    public final ArrayList f40328b;
    public final cq0 f40329c;

    public yp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40329c = cq0Var;
        this.f40327a = hashMap;
        this.f40328b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f40329c;
        org.telegram.ui.Components.mu muVar = cq0Var.M;
        cq0Var.f32849a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f40329c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(this.f40327a, this.f40328b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
