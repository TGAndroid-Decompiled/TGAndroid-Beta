package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class r2 implements Runnable {
    public final int f47933a;
    public final Object f47934b;

    public r2(Object obj, int i10) {
        this.f47933a = i10;
        this.f47934b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f47933a;
        Object obj = this.f47934b;
        switch (i10) {
            case 0:
                ((s2) obj).invalidate();
                return;
            case 1:
                ((w2) obj).invalidateSelf();
                return;
            case 2:
                u3 u3Var = (u3) obj;
                r2 r2Var = u3Var.f48080i0;
                w9[] w9VarArr = u3Var.d;
                if (w9VarArr[2 - u3Var.f48090r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = u3Var.U;
                    if (dVar != null && dVar.f8858b == 1 && u3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(r2Var);
                        ValueAnimator valueAnimator = u3Var.f48079h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u3Var.f48079h0 = null;
                        }
                        int i11 = 1 - u3Var.f48090r0;
                        u3Var.f48090r0 = i11;
                        ij0 lottieAnimation = w9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        ij0 lottieAnimation2 = w9VarArr[u3Var.f48090r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        u3Var.W.c();
                        int i12 = u3Var.f48090r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = u3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u3Var.f48071b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        u3Var.e(i12, stargiftattributebackdrop);
                        u3Var.g(1, (TL_stars.starGiftAttributePattern) u3Var.f48069a0.c(), true);
                        u3Var.a();
                        float f7 = u3Var.f48090r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        u3Var.f48079h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(u3Var, 2));
                        u3Var.f48079h0.addListener(new s3(u3Var));
                        u3Var.f48079h0.setDuration(320L);
                        u3Var.f48079h0.setInterpolator(rr.h);
                        u3Var.f48079h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(r2Var);
                AndroidUtilities.runOnUIThread(r2Var, 150L);
                return;
            case 3:
                ((sg.e) obj).setPaused(true);
                return;
            case 4:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                return;
            case 5:
                ((i0[]) obj)[0].dismiss();
                return;
            case 6:
                di.f fVar = (di.f) obj;
                fVar.getClass();
                try {
                    wl0 currentListView = ((w7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 7:
                nf.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                zg.t tVar = (zg.t) ((n2.e) obj).f15101b;
                zg.s sVar = tVar.f49429b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f49428a.z7(true);
                return;
            case 10:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = ((zg.x) obj).f49447f2.f49248r;
                if (m2Var instanceof wn) {
                    m2Var.showDialog(new rg.x0(m2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(m2Var, 11, false));
                    return;
                }
                return;
        }
    }
}
