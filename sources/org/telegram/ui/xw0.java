package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xw0 implements org.telegram.messenger.kc {
    public final Runnable[] f53342a;

    public xw0(Runnable[] runnableArr) {
        this.f53342a = runnableArr;
    }

    @Override
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f53342a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.ch0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.B0 = new pu0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void A(ImageReceiver imageReceiver) {
    }

    @Override
    public final void O(int i7, Drawable drawable) {
    }
}
