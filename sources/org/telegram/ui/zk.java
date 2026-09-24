package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f40505a;
    public int f40506b;
    public final org.telegram.ui.ActionBar.y f40507c;
    public final wn d;

    public zk(wn wnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = wnVar;
        this.f40507c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f40506b - 1;
        this.f40506b = i11;
        if (i11 == 0 && this.f40505a != null) {
            this.f40507c.getViewTreeObserver().removeOnPreDrawListener(this.f40505a);
            this.f40505a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f40506b == 0 && this.f40505a == null) {
            this.f40505a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f40507c.getViewTreeObserver().addOnPreDrawListener(this.f40505a);
        }
        this.f40506b++;
    }
}
