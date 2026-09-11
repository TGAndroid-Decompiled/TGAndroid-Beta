package zh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xi0;
public final class a7 implements ImageReceiver.ImageReceiverDelegate {
    public final boolean[] f51695a;

    public a7(boolean[] zArr) {
        this.f51695a = zArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        if (z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            boolean[] zArr = this.f51695a;
            if (!zArr[0]) {
                lottieAnimation.L(0, false, false);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(lottieAnimation, 0));
                zArr[0] = true;
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }
}
