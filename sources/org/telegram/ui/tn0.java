package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class tn0 implements io0 {
    public final int f41677a;
    public final HashMap f41678b;
    public final ArrayList f41679c;
    public final wn0 d;

    public tn0(wn0 wn0Var, HashMap hashMap, ArrayList arrayList, int i10) {
        this.f41677a = i10;
        this.d = wn0Var;
        this.f41678b = hashMap;
        this.f41679c = arrayList;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f41677a) {
            case 0:
                wn0 wn0Var = this.d;
                org.telegram.ui.Components.wt wtVar = wn0Var.M;
                wn0Var.f43131a = editable;
                wtVar.setText(editable);
                return;
            default:
                wn0 wn0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = wn0Var2.M;
                wn0Var2.f43131a = editable;
                wtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f41677a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void h0() {
        int i10 = this.f41677a;
    }

    @Override
    public final void u0(int i10, boolean z10, boolean z11) {
        switch (this.f41677a) {
            case 0:
                wn0 wn0Var = this.d;
                wn0Var.removeSelfFromStack();
                if (!z10) {
                    wn0Var.a0(this.f41678b, this.f41679c, z11, i10);
                    return;
                }
                return;
            default:
                wn0 wn0Var2 = this.d;
                wn0Var2.removeSelfFromStack();
                if (!z10) {
                    wn0Var2.a0(this.f41678b, this.f41679c, z11, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void y() {
        int i10 = this.f41677a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
