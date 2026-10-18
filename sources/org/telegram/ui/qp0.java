package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class qp0 implements kq0 {
    public final HashMap f40498a;
    public final ArrayList f40499b;
    public final up0 f40500c;

    public qp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40500c = up0Var;
        this.f40498a = hashMap;
        this.f40499b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        up0 up0Var = this.f40500c;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.f42041a = editable;
        quVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f40500c;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(this.f40498a, this.f40499b, z11, i10);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }
}
