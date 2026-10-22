package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class uk implements LayoutTransition.TransitionListener {
    public tk f42010a;
    public int f42011b;
    public final org.telegram.ui.ActionBar.y f42012c;
    public final qn d;

    public uk(qn qnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = qnVar;
        this.f42012c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42011b - 1;
        this.f42011b = i11;
        if (i11 == 0 && this.f42010a != null) {
            this.f42012c.getViewTreeObserver().removeOnPreDrawListener(this.f42010a);
            this.f42010a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42011b == 0 && this.f42010a == null) {
            this.f42010a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) uk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42012c.getViewTreeObserver().addOnPreDrawListener(this.f42010a);
        }
        this.f42011b++;
    }
}
