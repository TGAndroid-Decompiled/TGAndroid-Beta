package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43949a;
    public int f43950b;
    public final org.telegram.ui.ActionBar.z f43951c;
    public final xn d;

    public zk(xn xnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = xnVar;
        this.f43951c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43950b - 1;
        this.f43950b = i11;
        if (i11 == 0 && this.f43949a != null) {
            this.f43951c.getViewTreeObserver().removeOnPreDrawListener(this.f43949a);
            this.f43949a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43950b == 0 && this.f43949a == null) {
            this.f43949a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.p2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f43951c.getViewTreeObserver().addOnPreDrawListener(this.f43949a);
        }
        this.f43950b++;
    }
}
