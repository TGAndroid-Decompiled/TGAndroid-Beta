package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class r2 implements Runnable {
    public final int f47992a;
    public final Object f47993b;

    public r2(Object obj, int i10) {
        this.f47992a = i10;
        this.f47993b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f47992a;
        Object obj = this.f47993b;
        switch (i10) {
            case 0:
                ((s2) obj).invalidate();
                return;
            case 1:
                ((w2) obj).invalidateSelf();
                return;
            case 2:
                u3 u3Var = (u3) obj;
                r2 r2Var = u3Var.f48141i0;
                w9[] w9VarArr = u3Var.d;
                if (w9VarArr[2 - u3Var.f48151r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = u3Var.U;
                    if (dVar != null && dVar.f8861b == 1 && u3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(r2Var);
                        ValueAnimator valueAnimator = u3Var.f48140h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u3Var.f48140h0 = null;
                        }
                        int i11 = 1 - u3Var.f48151r0;
                        u3Var.f48151r0 = i11;
                        kj0 lottieAnimation = w9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        kj0 lottieAnimation2 = w9VarArr[u3Var.f48151r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        u3Var.W.c();
                        int i12 = u3Var.f48151r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = u3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u3Var.f48132b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        u3Var.e(i12, stargiftattributebackdrop);
                        u3Var.g(1, (TL_stars.starGiftAttributePattern) u3Var.f48130a0.c(), true);
                        u3Var.a();
                        float f7 = u3Var.f48151r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        u3Var.f48140h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(u3Var, 2));
                        u3Var.f48140h0.addListener(new s3(u3Var));
                        u3Var.f48140h0.setDuration(320L);
                        u3Var.f48140h0.setInterpolator(sr.h);
                        u3Var.f48140h0.start();
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
                    yl0 currentListView = ((v7) fVar.L0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 7:
                nf.f.s(((k7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                nf.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                zg.u uVar = (zg.u) ((o0.c) obj).f15522b;
                zg.t tVar = uVar.f49488b;
                if (tVar != null) {
                    tVar.d();
                }
                uVar.f49487a.z7(true);
                return;
            case 10:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = ((zg.y) obj).f49506f2.f49313r;
                if (o2Var instanceof xn) {
                    o2Var.showDialog(new rg.x0(o2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(o2Var, 11, false));
                    return;
                }
                return;
        }
    }
}
