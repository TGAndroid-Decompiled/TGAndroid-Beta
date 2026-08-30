package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class w01 implements ImageReceiver.ImageReceiverDelegate {
    public final Runnable[] f39293a;

    public w01(Runnable[] runnableArr) {
        this.f39293a = runnableArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        if (imageReceiver.hasBitmapImage()) {
            Runnable[] runnableArr = this.f39293a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.gj0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (lottieAnimation.w()) {
                    lottieAnimation.f25180z0 = new vy0(runnableArr, 6);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }
}
