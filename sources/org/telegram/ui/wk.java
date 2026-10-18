package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class wk implements LayoutTransition.TransitionListener {
    public vk f42909a;
    public int f42910b;
    public final org.telegram.ui.ActionBar.y f42911c;
    public final sn d;

    public wk(sn snVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = snVar;
        this.f42911c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42910b - 1;
        this.f42910b = i11;
        if (i11 == 0 && this.f42909a != null) {
            this.f42911c.getViewTreeObserver().removeOnPreDrawListener(this.f42909a);
            this.f42909a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42910b == 0 && this.f42909a == null) {
            this.f42909a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) wk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42911c.getViewTreeObserver().addOnPreDrawListener(this.f42909a);
        }
        this.f42910b++;
    }
}
