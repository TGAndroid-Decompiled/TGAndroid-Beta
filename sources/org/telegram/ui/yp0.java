package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class yp0 implements vq0 {
    public final HashMap f40291a;
    public final ArrayList f40292b;
    public final fq0 f40293c;

    public yp0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40293c = fq0Var;
        this.f40291a = hashMap;
        this.f40292b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f40293c;
        org.telegram.ui.Components.lu luVar = fq0Var.M;
        fq0Var.f33607a = editable;
        luVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f40293c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.V(this.f40291a, this.f40292b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
