package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

public final class qy implements ImageReceiver.ImageReceiverDelegate {

    public final ry f41766a;

    public final boolean f41767b;

    public final MessageObject f41768c;
    public final sy d;

    public qy(sy syVar, ry ryVar, boolean z10, MessageObject messageObject) {
        this.d = syVar;
        this.f41766a = ryVar;
        this.f41767b = z10;
        this.f41768c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ry ryVar = this.f41766a;
        if (ryVar.f42374r.getLottieAnimation() != null) {
            ryVar.f42374r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f41767b && (messageObject = this.f41768c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31336x == null) {
            try {
                this.d.C.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}
