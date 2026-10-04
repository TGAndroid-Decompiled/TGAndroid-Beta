package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class zk implements LayoutTransition.TransitionListener {
    public yk f43841a;
    public int f43842b;
    public final org.telegram.ui.ActionBar.z f43843c;
    public final yn d;

    public zk(yn ynVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = ynVar;
        this.f43843c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f43842b - 1;
        this.f43842b = i11;
        if (i11 == 0 && this.f43841a != null) {
            this.f43843c.getViewTreeObserver().removeOnPreDrawListener(this.f43841a);
            this.f43841a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f43842b == 0 && this.f43841a == null) {
            this.f43841a = new yk(this, 0);
            this.f43843c.getViewTreeObserver().addOnPreDrawListener(this.f43841a);
        }
        this.f43842b++;
    }
}
