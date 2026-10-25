package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class tp0 implements qq0 {
    public final HashMap f43878a;
    public final ArrayList f43879b;
    public final aq0 f43880c;

    public tp0(aq0 aq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f43880c = aq0Var;
        this.f43878a = hashMap;
        this.f43879b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        aq0 aq0Var = this.f43880c;
        org.telegram.ui.Components.ru ruVar = aq0Var.M;
        aq0Var.f37872a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.f43880c;
        aq0Var.removeSelfFromStack();
        if (!z10) {
            aq0Var.W(this.f43878a, this.f43879b, z11, i10);
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
