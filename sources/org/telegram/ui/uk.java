package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class uk implements LayoutTransition.TransitionListener {
    public tk f42001a;
    public int f42002b;
    public final org.telegram.ui.ActionBar.y f42003c;
    public final qn d;

    public uk(qn qnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = qnVar;
        this.f42003c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42002b - 1;
        this.f42002b = i11;
        if (i11 == 0 && this.f42001a != null) {
            this.f42003c.getViewTreeObserver().removeOnPreDrawListener(this.f42001a);
            this.f42001a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42002b == 0 && this.f42001a == null) {
            this.f42001a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) uk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42003c.getViewTreeObserver().addOnPreDrawListener(this.f42001a);
        }
        this.f42002b++;
    }
}
