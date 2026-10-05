package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43849a;
    public int f43850b;
    public final org.telegram.ui.ActionBar.z f43851c;
    public final yn d;

    public zk(yn ynVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = ynVar;
        this.f43851c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43850b - 1;
        this.f43850b = i11;
        if (i11 == 0 && this.f43849a != null) {
            this.f43851c.getViewTreeObserver().removeOnPreDrawListener(this.f43849a);
            this.f43849a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43850b == 0 && this.f43849a == null) {
            this.f43849a = new yk(this, 0);
            this.f43851c.getViewTreeObserver().addOnPreDrawListener(this.f43849a);
        }
        this.f43850b++;
    }
}
