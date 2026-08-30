package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class zy implements ImageReceiver.ImageReceiverDelegate {
    public final az f40876a;
    public final boolean f40877b;
    public final MessageObject f40878c;
    public final bz d;

    public zy(bz bzVar, az azVar, boolean z4, MessageObject messageObject) {
        this.d = bzVar;
        this.f40876a = azVar;
        this.f40877b = z4;
        this.f40878c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        az azVar = this.f40876a;
        if (azVar.f32741r.getLottieAnimation() != null) {
            azVar.f32741r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f40877b && (messageObject = this.f40878c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25176x == null) {
            try {
                this.d.D.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}
