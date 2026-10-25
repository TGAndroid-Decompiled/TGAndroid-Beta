package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class wk implements LayoutTransition.TransitionListener {
    public vk f45503a;
    public int f45504b;
    public final org.telegram.ui.ActionBar.z f45505c;
    public final un d;

    public wk(un unVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = unVar;
        this.f45505c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f45504b - 1;
        this.f45504b = i11;
        if (i11 == 0 && this.f45503a != null) {
            this.f45505c.getViewTreeObserver().removeOnPreDrawListener(this.f45503a);
            this.f45503a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f45504b == 0 && this.f45503a == null) {
            this.f45503a = new vk(this, 0);
            this.f45505c.getViewTreeObserver().addOnPreDrawListener(this.f45503a);
        }
        this.f45504b++;
    }
}
