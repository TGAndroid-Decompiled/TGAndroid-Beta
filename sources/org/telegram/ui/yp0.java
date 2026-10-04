package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class yp0 implements vq0 {
    public final HashMap f43602a;
    public final ArrayList f43603b;
    public final fq0 f43604c;

    public yp0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f43604c = fq0Var;
        this.f43602a = hashMap;
        this.f43603b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f43604c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.f36366a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f43604c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.T(this.f43602a, this.f43603b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
