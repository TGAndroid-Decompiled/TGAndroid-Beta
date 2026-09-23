package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class wp0 implements tq0 {
    public final HashMap f39069a;
    public final ArrayList f39070b;
    public final dq0 f39071c;

    public wp0(dq0 dq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39071c = dq0Var;
        this.f39069a = hashMap;
        this.f39070b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        dq0 dq0Var = this.f39071c;
        org.telegram.ui.Components.ku kuVar = dq0Var.M;
        dq0Var.f32695a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        dq0 dq0Var = this.f39071c;
        dq0Var.removeSelfFromStack();
        if (!z10) {
            dq0Var.V(this.f39069a, this.f39070b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
