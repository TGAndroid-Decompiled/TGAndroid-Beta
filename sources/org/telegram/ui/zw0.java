package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zw0 implements org.telegram.messenger.jc {
    public final Runnable[] f54740a;

    public zw0(Runnable[] runnableArr) {
        this.f54740a = runnableArr;
    }

    @Override
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.J()) {
            Runnable[] runnableArr = this.f54740a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.nh0 C = imageReceiver.C();
                if (C == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (C.y()) {
                    C.B0 = new qu0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void J(int i7, Drawable drawable) {
    }
}
