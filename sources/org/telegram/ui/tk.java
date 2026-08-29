package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class tk implements LayoutTransition.TransitionListener {
    public sk f42719a;
    public int f42720b;
    public final org.telegram.ui.ActionBar.a0 f42721c;
    public final tn d;

    public tk(tn tnVar, org.telegram.ui.ActionBar.a0 a0Var) {
        this.d = tnVar;
        this.f42721c = a0Var;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42720b - 1;
        this.f42720b = i11;
        if (i11 == 0 && this.f42719a != null) {
            this.f42721c.getViewTreeObserver().removeOnPreDrawListener(this.f42719a);
            this.f42719a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42720b == 0 && this.f42719a == null) {
            this.f42719a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.l lVar;
                    lVar = ((org.telegram.ui.ActionBar.o2) tk.this.d).actionBar;
                    lVar.invalidate();
                    return true;
                }
            };
            this.f42721c.getViewTreeObserver().addOnPreDrawListener(this.f42719a);
        }
        this.f42720b++;
    }
}
