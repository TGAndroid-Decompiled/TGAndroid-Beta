package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43834a;
    public int f43835b;
    public final org.telegram.ui.ActionBar.z f43836c;
    public final yn d;

    public zk(yn ynVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = ynVar;
        this.f43836c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43835b - 1;
        this.f43835b = i11;
        if (i11 == 0 && this.f43834a != null) {
            this.f43836c.getViewTreeObserver().removeOnPreDrawListener(this.f43834a);
            this.f43834a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43835b == 0 && this.f43834a == null) {
            this.f43834a = new yk(this, 0);
            this.f43836c.getViewTreeObserver().addOnPreDrawListener(this.f43834a);
        }
        this.f43835b++;
    }
}
