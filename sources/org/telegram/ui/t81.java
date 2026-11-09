package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t81 extends AnimatorListenerAdapter {
    public final int f50126a;
    public final Object f50127b;

    public t81(Object obj, int i7) {
        this.f50126a = i7;
        this.f50127b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f50126a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f50127b;
        switch (i11) {
            case 0:
                super.onAnimationEnd(animator);
                ((u81) obj).d = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((w91) obj).setScrollEnabled(true);
                return;
            case 2:
                ab1 ab1Var = (ab1) obj;
                if (animator.equals(ab1Var.d.K)) {
                    ab1Var.d.K = null;
                    return;
                }
                return;
            case 3:
                nb1 nb1Var = (nb1) obj;
                nb1Var.d = null;
                nb1Var.f48152a = null;
                nb1Var.f48153b = false;
                nb1Var.f48156f.f42083c.setAllowDrawCursor(true);
                return;
            case 4:
                ((org.telegram.ui.Wallet.u3) obj).K = null;
                return;
            case 5:
                ((org.telegram.ui.Wallet.b4) obj).f();
                return;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.J0 == animator) {
                    w5Var.J0 = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.u5 u5Var = (org.telegram.ui.Wallet.u5) obj;
                u5Var.h = false;
                u5Var.f43173n = null;
                u5Var.f43169b.setLayerType(0, null);
                return;
            case 8:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.N = 0.0f;
                a6Var.O = 0.0f;
                a6Var.f42114b0 = null;
                return;
            case 9:
                org.telegram.ui.Wallet.u6 u6Var = (org.telegram.ui.Wallet.u6) obj;
                u6Var.I = null;
                u6Var.f43187i0 = 1.0f;
                u6Var.f43186h0 = 0.0f;
                u6Var.f43185g0 = 0.0f;
                u6Var.e();
                return;
            case 10:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj;
                EditTextBoldCursor editTextBoldCursor = r8Var.f43060b;
                if (r8Var.f43066s == animator) {
                    r8Var.f43066s = null;
                    View view = r8Var.f43059a;
                    if (r8Var.f43069y) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (r8Var.f43069y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (r8Var.f43069y && !r8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                k9Var.f42671n = null;
                org.telegram.ui.Wallet.u6 u6Var2 = k9Var.d;
                if (k9Var.f42675x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                u6Var2.setVisibility(i10);
                TextView textView = k9Var.f42670f;
                if (k9Var.f42676y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 12:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.f48053b).getClass();
                ((cd1) n1Var.f48053b).f44286c.setVisibility(4);
                return;
            case 13:
                ((org.telegram.ui.web.x0) obj).f51365s.setVisibility(8);
                return;
            case 14:
                sg.w wVar = (sg.w) obj;
                wVar.f55245a.getPainting().c(null, wVar.f55245a.getCurrentColor(), true, null);
                wVar.f55260r = null;
                return;
            case 15:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f55666c;
                f0Var.f55666c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 16:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f55732r) {
                    h1Var.f55730f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f55732r = null;
                    return;
                }
                return;
            case 17:
                ((ti.i) obj).v = null;
                return;
            case 18:
                ug.p0 p0Var = (ug.p0) obj;
                if (!p0Var.f56771r) {
                    f10 = 0.0f;
                }
                p0Var.f56772s = f10;
                p0Var.e();
                return;
            case 19:
                ug.t1 t1Var = (ug.t1) ((fi.c0) obj).f11721b;
                t1Var.F = true;
                t1Var.invalidate();
                return;
            case 20:
                int i13 = vg.e.K;
                ((vg.e) ((org.telegram.ui.Cells.x9) obj).f30916b).d();
                return;
            case 21:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f57412b;
                mVar.f57424b.d = 0.0f;
                mVar.f57428d0 = null;
                mVar.j(mVar.L);
                return;
            case 23:
                wg.b bVar = (wg.b) obj;
                bVar.f57696b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.f58801c.size() < fVar.d) {
                        fVar.f58801c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f58813q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f58813q = null;
                }
                fVar.f58814r = null;
                fVar.invalidateSelf();
                return;
            default:
                ((zh.f0) obj).f60320b.f60364s1.setVisibility(8);
                return;
        }
    }
}
