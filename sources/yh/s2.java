package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class s2 implements Runnable {
    public final int f48035a;
    public final Object f48036b;

    public s2(Object obj, int i10) {
        this.f48035a = i10;
        this.f48036b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f48035a;
        Object obj = this.f48036b;
        switch (i10) {
            case 0:
                ((t2) obj).invalidate();
                return;
            case 1:
                ((x2) obj).invalidateSelf();
                return;
            case 2:
                v3 v3Var = (v3) obj;
                s2 s2Var = v3Var.f48163i0;
                v9[] v9VarArr = v3Var.d;
                if (v9VarArr[2 - v3Var.f48173r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = v3Var.U;
                    if (dVar != null && dVar.f8876b == 1 && v3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(s2Var);
                        ValueAnimator valueAnimator = v3Var.f48162h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v3Var.f48162h0 = null;
                        }
                        int i11 = 1 - v3Var.f48173r0;
                        v3Var.f48173r0 = i11;
                        hj0 lottieAnimation = v9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        hj0 lottieAnimation2 = v9VarArr[v3Var.f48173r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        v3Var.W.c();
                        int i12 = v3Var.f48173r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = v3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v3Var.f48154b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        v3Var.e(i12, stargiftattributebackdrop);
                        v3Var.g(1, (TL_stars.starGiftAttributePattern) v3Var.f48152a0.c(), true);
                        v3Var.a();
                        float f7 = v3Var.f48173r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        v3Var.f48162h0 = ofFloat;
                        ofFloat.addUpdateListener(new r3(v3Var, 2));
                        v3Var.f48162h0.addListener(new t3(v3Var));
                        v3Var.f48162h0.setDuration(320L);
                        v3Var.f48162h0.setInterpolator(qr.h);
                        v3Var.f48162h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s2Var);
                AndroidUtilities.runOnUIThread(s2Var, 150L);
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
                    vl0 currentListView = ((w7) fVar.L0).R.getCurrentListView();
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
                zg.t tVar = (zg.t) ((n2.e) obj).f15112b;
                zg.s sVar = tVar.f49467b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f49466a.z7(true);
                return;
            case 10:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.x) obj).f49485f2.f49286r;
                if (n2Var instanceof zn) {
                    n2Var.showDialog(new rg.x0(n2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(n2Var, 11, false));
                    return;
                }
                return;
        }
    }
}
