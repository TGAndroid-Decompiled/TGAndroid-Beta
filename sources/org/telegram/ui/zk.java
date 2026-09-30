package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f40521a;
    public int f40522b;
    public final org.telegram.ui.ActionBar.y f40523c;
    public final wn d;

    public zk(wn wnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = wnVar;
        this.f40523c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f40522b - 1;
        this.f40522b = i11;
        if (i11 == 0 && this.f40521a != null) {
            this.f40523c.getViewTreeObserver().removeOnPreDrawListener(this.f40521a);
            this.f40521a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f40522b == 0 && this.f40521a == null) {
            this.f40521a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f40523c.getViewTreeObserver().addOnPreDrawListener(this.f40521a);
        }
        this.f40522b++;
    }
}
