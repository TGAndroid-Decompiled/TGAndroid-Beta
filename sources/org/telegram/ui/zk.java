package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43977a;
    public int f43978b;
    public final org.telegram.ui.ActionBar.z f43979c;
    public final xn d;

    public zk(xn xnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = xnVar;
        this.f43979c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43978b - 1;
        this.f43978b = i11;
        if (i11 == 0 && this.f43977a != null) {
            this.f43979c.getViewTreeObserver().removeOnPreDrawListener(this.f43977a);
            this.f43977a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43978b == 0 && this.f43977a == null) {
            this.f43977a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.p2) zk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f43979c.getViewTreeObserver().addOnPreDrawListener(this.f43977a);
        }
        this.f43978b++;
    }
}
