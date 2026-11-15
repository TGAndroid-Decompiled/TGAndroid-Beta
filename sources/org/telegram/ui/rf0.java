package org.telegram.ui;

import android.content.Context;
public final class rf0 extends org.telegram.ui.Components.jg {
    public final org.telegram.ui.Components.jg f50947w0;
    public final boolean f50948x0;
    public final bg0 f50949y0;

    public rf0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.jg jgVar, boolean z10) {
        super(i7, context, e6Var, false);
        this.f50949y0 = bg0Var;
        this.f50947w0 = jgVar;
        this.f50948x0 = z10;
    }

    @Override
    public final boolean b() {
        return this.f50947w0.b();
    }

    @Override
    public final boolean c() {
        return this.f50947w0.c();
    }

    @Override
    public final boolean d() {
        if (this.f50948x0 && this.f50949y0.f45739u0 && this.f36002w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f50947w0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f50947w0.j();
    }
}
