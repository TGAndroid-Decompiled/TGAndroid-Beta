package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class vp0 implements sq0 {
    public final HashMap f44393a;
    public final ArrayList f44394b;
    public final cq0 f44395c;

    public vp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f44395c = cq0Var;
        this.f44393a = hashMap;
        this.f44394b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f44395c;
        org.telegram.ui.Components.ru ruVar = cq0Var.M;
        cq0Var.f38432a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f44395c;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.W(this.f44393a, this.f44394b, z11, i10);
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
