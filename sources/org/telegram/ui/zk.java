package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f40818a;
    public int f40819b;
    public final org.telegram.ui.ActionBar.z f40820c;
    public final xn d;

    public zk(xn xnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = xnVar;
        this.f40820c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f40819b - 1;
        this.f40819b = i11;
        if (i11 == 0 && this.f40818a != null) {
            this.f40820c.getViewTreeObserver().removeOnPreDrawListener(this.f40818a);
            this.f40818a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f40819b == 0 && this.f40818a == null) {
            this.f40818a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.p2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f40820c.getViewTreeObserver().addOnPreDrawListener(this.f40818a);
        }
        this.f40819b++;
    }
}
