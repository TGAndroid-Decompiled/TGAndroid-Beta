package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class tp0 implements qq0 {
    public final HashMap f43881a;
    public final ArrayList f43882b;
    public final aq0 f43883c;

    public tp0(aq0 aq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f43883c = aq0Var;
        this.f43881a = hashMap;
        this.f43882b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        aq0 aq0Var = this.f43883c;
        org.telegram.ui.Components.ru ruVar = aq0Var.M;
        aq0Var.f37875a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.f43883c;
        aq0Var.removeSelfFromStack();
        if (!z10) {
            aq0Var.W(this.f43881a, this.f43882b, z11, i10);
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
