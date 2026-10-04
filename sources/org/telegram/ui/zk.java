package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43833a;
    public int f43834b;
    public final org.telegram.ui.ActionBar.z f43835c;
    public final yn d;

    public zk(yn ynVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = ynVar;
        this.f43835c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43834b - 1;
        this.f43834b = i11;
        if (i11 == 0 && this.f43833a != null) {
            this.f43835c.getViewTreeObserver().removeOnPreDrawListener(this.f43833a);
            this.f43833a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43834b == 0 && this.f43833a == null) {
            this.f43833a = new yk(this, 0);
            this.f43835c.getViewTreeObserver().addOnPreDrawListener(this.f43833a);
        }
        this.f43834b++;
    }
}
