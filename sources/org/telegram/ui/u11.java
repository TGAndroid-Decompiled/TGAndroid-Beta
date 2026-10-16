package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class u11 implements ImageReceiver.ImageReceiverDelegate {
    public final Runnable[] f40244a;

    public u11(Runnable[] runnableArr) {
        this.f40244a = runnableArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.hasBitmapImage()) {
            Runnable[] runnableArr = this.f40244a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (lottieAnimation.y()) {
                    lottieAnimation.A0 = new tz0(runnableArr, 6);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
