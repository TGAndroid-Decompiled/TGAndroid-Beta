package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yw0 implements org.telegram.messenger.lc {
    public final Runnable[] f52334a;

    public yw0(Runnable[] runnableArr) {
        this.f52334a = runnableArr;
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f52334a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.zg0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.A0 = new ru0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
    }
}
