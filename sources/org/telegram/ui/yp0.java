package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class yp0 implements vq0 {
    public final HashMap f43594a;
    public final ArrayList f43595b;
    public final fq0 f43596c;

    public yp0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f43596c = fq0Var;
        this.f43594a = hashMap;
        this.f43595b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f43596c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.f36360a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f43596c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.T(this.f43594a, this.f43595b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
