package yh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.dk0;
public final class u6 implements ImageReceiver.ImageReceiverDelegate {
    public final boolean[] f53337a;

    public u6(boolean[] zArr) {
        this.f53337a = zArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dk0 lottieAnimation;
        if (z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            boolean[] zArr = this.f53337a;
            if (!zArr[0]) {
                lottieAnimation.N(0, false, false);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.r0(lottieAnimation, 0));
                zArr[0] = true;
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
