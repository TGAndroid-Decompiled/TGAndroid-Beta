package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class zp0 implements sq0 {
    public final HashMap f40564a;
    public final ArrayList f40565b;
    public final cq0 f40566c;

    public zp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40566c = cq0Var;
        this.f40564a = hashMap;
        this.f40565b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f40566c;
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
        cq0 cq0Var = this.f40566c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(this.f40564a, this.f40565b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
