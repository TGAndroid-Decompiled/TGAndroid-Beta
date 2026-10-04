package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class r2 implements Runnable {
    public final int f51885a;
    public final Object f51886b;

    public r2(Object obj, int i10) {
        this.f51885a = i10;
        this.f51886b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f51885a;
        Object obj = this.f51886b;
        switch (i10) {
            case 0:
                ((s2) obj).invalidate();
                return;
            case 1:
                ((w2) obj).invalidateSelf();
                return;
            case 2:
                u3 u3Var = (u3) obj;
                r2 r2Var = u3Var.f52064i0;
                w9[] w9VarArr = u3Var.d;
                if (w9VarArr[2 - u3Var.f52074r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = u3Var.U;
                    if (dVar != null && dVar.f9633b == 1 && u3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(r2Var);
                        ValueAnimator valueAnimator = u3Var.f52063h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u3Var.f52063h0 = null;
                        }
                        int i11 = 1 - u3Var.f52074r0;
                        u3Var.f52074r0 = i11;
                        kj0 lottieAnimation = w9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        kj0 lottieAnimation2 = w9VarArr[u3Var.f52074r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        u3Var.W.c();
                        int i12 = u3Var.f52074r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = u3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u3Var.f52054b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        u3Var.e(i12, stargiftattributebackdrop);
                        u3Var.g(1, (TL_stars.starGiftAttributePattern) u3Var.f52052a0.c(), true);
                        u3Var.a();
                        float f7 = u3Var.f52074r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        u3Var.f52063h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(u3Var, 2));
                        u3Var.f52063h0.addListener(new s3(u3Var));
                        u3Var.f52063h0.setDuration(320L);
                        u3Var.f52063h0.setInterpolator(tr.h);
                        u3Var.f52063h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(r2Var);
                AndroidUtilities.runOnUIThread(r2Var, 150L);
                return;
            case 3:
                x7 x7Var = (x7) obj;
                if (x7Var.S != null && x7Var.Y != -1) {
                    x7Var.q1("POSTED_ALIGN");
                    x7Var.S.Z();
                    return;
                }
                return;
            case 4:
                ((sg.e) obj).setPaused(true);
                return;
            case 5:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                return;
            case 6:
                ((i0[]) obj)[0].dismiss();
                return;
            case 7:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                zg.t tVar = (zg.t) ((w9.k) obj).f48940a;
                zg.s sVar = tVar.f53525b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f53524a.z7(true);
                return;
            case 10:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.x) obj).f53544f2.f53331r;
                if (n2Var instanceof yn) {
                    n2Var.showDialog(new rg.y0(n2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.y0(n2Var, 11, false));
                    return;
                }
                return;
        }
    }
}
