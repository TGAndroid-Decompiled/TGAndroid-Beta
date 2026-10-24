package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class vk implements LayoutTransition.TransitionListener {
    public uk f42754a;
    public int f42755b;
    public final org.telegram.ui.ActionBar.y f42756c;
    public final sn d;

    public vk(sn snVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = snVar;
        this.f42756c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42755b - 1;
        this.f42755b = i11;
        if (i11 == 0 && this.f42754a != null) {
            this.f42756c.getViewTreeObserver().removeOnPreDrawListener(this.f42754a);
            this.f42754a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42755b == 0 && this.f42754a == null) {
            this.f42754a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.o2) vk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42756c.getViewTreeObserver().addOnPreDrawListener(this.f42754a);
        }
        this.f42755b++;
    }
}
