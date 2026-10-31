package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class vn0 implements ko0 {
    public final int f42774a;
    public final HashMap f42775b;
    public final ArrayList f42776c;
    public final yn0 d;

    public vn0(yn0 yn0Var, HashMap hashMap, ArrayList arrayList, int i10) {
        this.f42774a = i10;
        this.d = yn0Var;
        this.f42775b = hashMap;
        this.f42776c = arrayList;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f42774a) {
            case 0:
                yn0 yn0Var = this.d;
                org.telegram.ui.Components.wt wtVar = yn0Var.M;
                yn0Var.f43864a = editable;
                wtVar.setText(editable);
                return;
            default:
                yn0 yn0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = yn0Var2.M;
                yn0Var2.f43864a = editable;
                wtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f42774a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void h0() {
        int i10 = this.f42774a;
    }

    @Override
    public final void u0(int i10, boolean z10, boolean z11) {
        switch (this.f42774a) {
            case 0:
                yn0 yn0Var = this.d;
                yn0Var.removeSelfFromStack();
                if (!z10) {
                    yn0Var.Z(this.f42775b, this.f42776c, z11, i10);
                    return;
                }
                return;
            default:
                yn0 yn0Var2 = this.d;
                yn0Var2.removeSelfFromStack();
                if (!z10) {
                    yn0Var2.Z(this.f42775b, this.f42776c, z11, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void y() {
        int i10 = this.f42774a;
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
