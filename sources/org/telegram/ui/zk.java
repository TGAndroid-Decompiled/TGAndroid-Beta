package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f40519a;
    public int f40520b;
    public final org.telegram.ui.ActionBar.y f40521c;
    public final wn d;

    public zk(wn wnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = wnVar;
        this.f40521c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f40520b - 1;
        this.f40520b = i11;
        if (i11 == 0 && this.f40519a != null) {
            this.f40521c.getViewTreeObserver().removeOnPreDrawListener(this.f40519a);
            this.f40519a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f40520b == 0 && this.f40519a == null) {
            this.f40519a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f40521c.getViewTreeObserver().addOnPreDrawListener(this.f40519a);
        }
        this.f40520b++;
    }
}
