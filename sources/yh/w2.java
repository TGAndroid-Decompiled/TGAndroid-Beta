package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class w2 implements Runnable {
    public final int f48175a;
    public final Object f48176b;

    public w2(Object obj, int i10) {
        this.f48175a = i10;
        this.f48176b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f48175a;
        Object obj = this.f48176b;
        switch (i10) {
            case 0:
                ((x2) obj).invalidateSelf();
                return;
            case 1:
                v3 v3Var = (v3) obj;
                w2 w2Var = v3Var.f48121i0;
                w9[] w9VarArr = v3Var.d;
                if (w9VarArr[2 - v3Var.f48131r0].getImageReceiver().hasImageLoaded()) {
                    f4.d dVar = v3Var.U;
                    if (dVar != null && dVar.f8875b == 1 && v3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(w2Var);
                        ValueAnimator valueAnimator = v3Var.f48120h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v3Var.f48120h0 = null;
                        }
                        int i11 = 1 - v3Var.f48131r0;
                        v3Var.f48131r0 = i11;
                        ij0 lottieAnimation = w9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        ij0 lottieAnimation2 = w9VarArr[v3Var.f48131r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        v3Var.W.c();
                        int i12 = v3Var.f48131r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = v3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v3Var.f48112b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        v3Var.e(i12, stargiftattributebackdrop);
                        v3Var.g(1, (TL_stars.starGiftAttributePattern) v3Var.f48110a0.c(), true);
                        v3Var.a();
                        float f7 = v3Var.f48131r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        v3Var.f48120h0 = ofFloat;
                        ofFloat.addUpdateListener(new r3(v3Var, 2));
                        v3Var.f48120h0.addListener(new t3(v3Var));
                        v3Var.f48120h0.setDuration(320L);
                        v3Var.f48120h0.setInterpolator(qr.h);
                        v3Var.f48120h0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(w2Var);
                AndroidUtilities.runOnUIThread(w2Var, 150L);
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
                    wl0 currentListView = ((v7) fVar.L0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 6:
                nf.f.s(((k7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                nf.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                zg.t tVar = (zg.t) ((n2.e) obj).f15073b;
                zg.s sVar = tVar.f49421b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.f49420a.z7(true);
                return;
            case 9:
                ((ValueAnimator) obj).start();
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.x) obj).f49439f2.f49240r;
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
