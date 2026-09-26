package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class zp0 implements sq0 {
    public final HashMap f40562a;
    public final ArrayList f40563b;
    public final cq0 f40564c;

    public zp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40564c = cq0Var;
        this.f40562a = hashMap;
        this.f40563b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f40564c;
        org.telegram.ui.Components.lu luVar = cq0Var.M;
        cq0Var.f32770a = editable;
        luVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f40564c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(this.f40562a, this.f40563b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
