package org.telegram.ui;

import android.content.Context;
public final class r91 extends d91 {
    public final int v;
    public final int f42015w;
    public int f42016x;
    public org.telegram.ui.Components.g51 f42017y;

    public r91(Context context, int i10, int i11, tf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f42015w = i12;
    }

    @Override
    public final void b(f91 f91Var) {
        int i10;
        if (f91Var != null && (i10 = this.f42016x) >= 0) {
            f91Var.a(this.v, this.f42015w, i10, this.f42017y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
