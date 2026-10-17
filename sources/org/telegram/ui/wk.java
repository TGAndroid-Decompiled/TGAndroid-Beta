package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class wk implements LayoutTransition.TransitionListener {
    public vk f42885a;
    public int f42886b;
    public final org.telegram.ui.ActionBar.y f42887c;
    public final sn d;

    public wk(sn snVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = snVar;
        this.f42887c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42886b - 1;
        this.f42886b = i11;
        if (i11 == 0 && this.f42885a != null) {
            this.f42887c.getViewTreeObserver().removeOnPreDrawListener(this.f42885a);
            this.f42885a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42886b == 0 && this.f42885a == null) {
            this.f42885a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) wk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42887c.getViewTreeObserver().addOnPreDrawListener(this.f42885a);
        }
        this.f42886b++;
    }
}
