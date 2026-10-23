package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class vk implements LayoutTransition.TransitionListener {
    public uk f42783a;
    public int f42784b;
    public final org.telegram.ui.ActionBar.y f42785c;
    public final sn d;

    public vk(sn snVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = snVar;
        this.f42785c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42784b - 1;
        this.f42784b = i11;
        if (i11 == 0 && this.f42783a != null) {
            this.f42785c.getViewTreeObserver().removeOnPreDrawListener(this.f42783a);
            this.f42783a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42784b == 0 && this.f42783a == null) {
            this.f42783a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.o2) vk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42785c.getViewTreeObserver().addOnPreDrawListener(this.f42783a);
        }
        this.f42784b++;
    }
}
