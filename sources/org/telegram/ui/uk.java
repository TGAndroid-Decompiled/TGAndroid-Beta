package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class uk implements LayoutTransition.TransitionListener {
    public tk f42007a;
    public int f42008b;
    public final org.telegram.ui.ActionBar.y f42009c;
    public final qn d;

    public uk(qn qnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = qnVar;
        this.f42009c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42008b - 1;
        this.f42008b = i11;
        if (i11 == 0 && this.f42007a != null) {
            this.f42009c.getViewTreeObserver().removeOnPreDrawListener(this.f42007a);
            this.f42007a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42008b == 0 && this.f42007a == null) {
            this.f42007a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) uk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42009c.getViewTreeObserver().addOnPreDrawListener(this.f42007a);
        }
        this.f42008b++;
    }
}
