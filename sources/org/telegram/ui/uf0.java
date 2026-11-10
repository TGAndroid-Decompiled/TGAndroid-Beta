package org.telegram.ui;

import android.content.Context;
public final class uf0 extends org.telegram.ui.Components.cg {
    public final org.telegram.ui.Components.cg f50493n0;
    public final boolean f50494o0;
    public final eg0 f50495p0;

    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.cg cgVar, boolean z9) {
        super(i7, context, h6Var, false);
        this.f50495p0 = eg0Var;
        this.f50493n0 = cgVar;
        this.f50494o0 = z9;
    }

    @Override
    public final boolean b() {
        return this.f50493n0.b();
    }

    @Override
    public final boolean c() {
        return this.f50493n0.c();
    }

    @Override
    public final boolean d() {
        if (this.f50494o0 && this.f50495p0.f45288p0 && this.f32576r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f50493n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f50493n0.j();
    }
}
