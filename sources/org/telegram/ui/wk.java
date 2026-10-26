package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class wk implements LayoutTransition.TransitionListener {
    public vk f45506a;
    public int f45507b;
    public final org.telegram.ui.ActionBar.z f45508c;
    public final un d;

    public wk(un unVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = unVar;
        this.f45508c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f45507b - 1;
        this.f45507b = i11;
        if (i11 == 0 && this.f45506a != null) {
            this.f45508c.getViewTreeObserver().removeOnPreDrawListener(this.f45506a);
            this.f45506a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f45507b == 0 && this.f45506a == null) {
            this.f45506a = new vk(this, 0);
            this.f45508c.getViewTreeObserver().addOnPreDrawListener(this.f45506a);
        }
        this.f45507b++;
    }
}
