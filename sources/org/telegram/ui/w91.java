package org.telegram.ui;

import android.content.Context;
public final class w91 extends i91 {
    public final int v;
    public final int f44576w;
    public int f44577x;
    public rh f44578y;

    public w91(Context context, int i10, int i11, kg.g gVar, int i12) {
        super(context, i11, gVar, null);
        this.v = i10;
        this.f44576w = i12;
    }

    @Override
    public final void b(k91 k91Var) {
        int i10;
        if (k91Var != null && (i10 = this.f44577x) >= 0) {
            k91Var.a(this.v, this.f44576w, i10, this.f44578y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
