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
public final class x2 implements Runnable {
    public final int f47926a;
    public final Object f47927b;

    public x2(Object obj, int i10) {
        this.f47926a = i10;
        this.f47927b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f47926a;
        Object obj = this.f47927b;
        switch (i10) {
            case 0:
                ((y2) obj).invalidateSelf();
                return;
            case 1:
                w3 w3Var = (w3) obj;
                x2 x2Var = w3Var.f47882i0;
                u9[] u9VarArr = w3Var.d;
                if (u9VarArr[2 - w3Var.f47892r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = w3Var.U;
                    if (dVar != null && dVar.f8873b == 1 && w3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(x2Var);
                        ValueAnimator valueAnimator = w3Var.f47881h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            w3Var.f47881h0 = null;
                        }
                        int i11 = 1 - w3Var.f47892r0;
                        w3Var.f47892r0 = i11;
                        xi0 lottieAnimation = u9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = u9VarArr[w3Var.f47892r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        w3Var.W.c();
                        int i12 = w3Var.f47892r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = w3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) w3Var.f47873b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        w3Var.e(i12, stargiftattributebackdrop);
                        w3Var.g(1, (TL_stars.starGiftAttributePattern) w3Var.f47871a0.c(), true);
                        w3Var.a();
                        float f7 = w3Var.f47892r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        w3Var.f47881h0 = ofFloat;
                        ofFloat.addUpdateListener(new s3(w3Var, 2));
                        w3Var.f47881h0.addListener(new u3(w3Var));
                        w3Var.f47881h0.setDuration(320L);
                        w3Var.f47881h0.setInterpolator(qr.h);
                        w3Var.f47881h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(x2Var);
                AndroidUtilities.runOnUIThread(x2Var, 150L);
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
                    ll0 currentListView = ((x7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 6:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                zg.t tVar = (zg.t) ((f2) obj).f47089a;
                zg.s sVar = tVar.f49162b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f49161a.z7(true);
                return;
            case 9:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.y) obj).f49183f2.f48990r;
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
