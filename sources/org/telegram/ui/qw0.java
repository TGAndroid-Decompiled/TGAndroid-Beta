package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class qw0 implements org.telegram.messenger.ec {
    public final Runnable[] f48967a;

    public qw0(Runnable[] runnableArr) {
        this.f48967a = runnableArr;
    }

    @Override
    public final void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f48967a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.ch0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.B0 = new pu0(runnableArr, 6);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void D(ImageReceiver imageReceiver) {
    }

    @Override
    public final void F0(int i3, Drawable drawable) {
    }
}
