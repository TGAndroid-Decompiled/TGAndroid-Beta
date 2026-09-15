package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class y2 implements Runnable {
    public final int f48019a;
    public final Object f48020b;

    public y2(Object obj, int i10) {
        this.f48019a = i10;
        this.f48020b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f48019a;
        Object obj = this.f48020b;
        switch (i10) {
            case 0:
                ((z2) obj).invalidateSelf();
                return;
            case 1:
                x3 x3Var = (x3) obj;
                y2 y2Var = x3Var.f47975i0;
                u9[] u9VarArr = x3Var.d;
                if (u9VarArr[2 - x3Var.f47985r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = x3Var.U;
                    if (dVar != null && dVar.f8871b == 1 && x3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(y2Var);
                        ValueAnimator valueAnimator = x3Var.f47974h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            x3Var.f47974h0 = null;
                        }
                        int i11 = 1 - x3Var.f47985r0;
                        x3Var.f47985r0 = i11;
                        xi0 lottieAnimation = u9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = u9VarArr[x3Var.f47985r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.S(lottieAnimation.t(), false);
                        }
                        x3Var.W.c();
                        int i12 = x3Var.f47985r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = x3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x3Var.f47966b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        x3Var.e(i12, stargiftattributebackdrop);
                        x3Var.g(1, (TL_stars.starGiftAttributePattern) x3Var.f47964a0.c(), true);
                        x3Var.a();
                        float f7 = x3Var.f47985r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        x3Var.f47974h0 = ofFloat;
                        ofFloat.addUpdateListener(new t3(x3Var, 2));
                        x3Var.f47974h0.addListener(new v3(x3Var));
                        x3Var.f47974h0.setDuration(320L);
                        x3Var.f47974h0.setInterpolator(qr.h);
                        x3Var.f47974h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(y2Var);
                AndroidUtilities.runOnUIThread(y2Var, 150L);
                return;
            case 2:
                ((sg.e) obj).setPaused(true);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                return;
            case 4:
                ((i0[]) obj)[0].dismiss();
                return;
            case 5:
                di.f fVar = (di.f) obj;
                fVar.getClass();
                try {
                    ll0 currentListView = ((y7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 6:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                nf.f.s(((o7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                zg.t tVar = (zg.t) ((g2) obj).f47214a;
                zg.s sVar = tVar.f49169b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f49168a.z7(true);
                return;
            case 9:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.y) obj).f49190f2.f48997r;
                if (n2Var instanceof bo) {
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
