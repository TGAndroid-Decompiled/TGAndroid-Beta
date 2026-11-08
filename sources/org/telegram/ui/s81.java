package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s81 extends AnimatorListenerAdapter {
    public final int f49661a;
    public final Object f49662b;

    public s81(Object obj, int i7) {
        this.f49661a = i7;
        this.f49662b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f49661a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f49662b;
        switch (i11) {
            case 0:
                super.onAnimationEnd(animator);
                ((t81) obj).d = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((u91) obj).setScrollEnabled(true);
                return;
            case 2:
                ya1 ya1Var = (ya1) obj;
                if (animator.equals(ya1Var.d.K)) {
                    ya1Var.d.K = null;
                    return;
                }
                return;
            case 3:
                lb1 lb1Var = (lb1) obj;
                lb1Var.d = null;
                lb1Var.f47501a = null;
                lb1Var.f47502b = false;
                lb1Var.f47505f.f42076c.setAllowDrawCursor(true);
                return;
            case 4:
                ((org.telegram.ui.Wallet.v3) obj).K = null;
                return;
            case 5:
                ((org.telegram.ui.Wallet.c4) obj).f();
                return;
            case 6:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) obj;
                if (x5Var.J0 == animator) {
                    x5Var.J0 = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) obj;
                v5Var.h = false;
                v5Var.f43255n = null;
                v5Var.f43251b.setLayerType(0, null);
                return;
            case 8:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.N = 0.0f;
                b6Var.O = 0.0f;
                b6Var.f42194b0 = null;
                return;
            case 9:
                org.telegram.ui.Wallet.v6 v6Var = (org.telegram.ui.Wallet.v6) obj;
                v6Var.I = null;
                v6Var.f43269i0 = 1.0f;
                v6Var.f43268h0 = 0.0f;
                v6Var.f43267g0 = 0.0f;
                v6Var.e();
                return;
            case 10:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj;
                EditTextBoldCursor editTextBoldCursor = s8Var.f43142b;
                if (s8Var.f43148s == animator) {
                    s8Var.f43148s = null;
                    View view = s8Var.f43141a;
                    if (s8Var.f43151y) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (s8Var.f43151y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (s8Var.f43151y && !s8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) obj;
                l9Var.f42752n = null;
                org.telegram.ui.Wallet.v6 v6Var2 = l9Var.d;
                if (l9Var.f42756x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                v6Var2.setVisibility(i10);
                TextView textView = l9Var.f42751f;
                if (l9Var.f42757y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 12:
                n1 n1Var = (n1) obj;
                ((zc1) n1Var.f47935b).getClass();
                ((zc1) n1Var.f47935b).f52525c.setVisibility(4);
                return;
            case 13:
                ((org.telegram.ui.web.x0) obj).f51384s.setVisibility(8);
                return;
            case 14:
                sg.w wVar = (sg.w) obj;
                wVar.f55225a.getPainting().c(null, wVar.f55225a.getCurrentColor(), true, null);
                wVar.f55240r = null;
                return;
            case 15:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f55653c;
                f0Var.f55653c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 16:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f55719r) {
                    h1Var.f55717f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f55719r = null;
                    return;
                }
                return;
            case 17:
                ((ti.i) obj).v = null;
                return;
            case 18:
                ug.p0 p0Var = (ug.p0) obj;
                if (!p0Var.f56758r) {
                    f10 = 0.0f;
                }
                p0Var.f56759s = f10;
                p0Var.e();
                return;
            case 19:
                ug.t1 t1Var = (ug.t1) ((fi.c0) obj).f11721b;
                t1Var.F = true;
                t1Var.invalidate();
                return;
            case 20:
                int i13 = vg.e.K;
                ((vg.e) ((org.telegram.ui.Cells.x9) obj).f30911b).d();
                return;
            case 21:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f57399b;
                mVar.f57411b.d = 0.0f;
                mVar.f57415d0 = null;
                mVar.j(mVar.L);
                return;
            case 23:
                wg.b bVar = (wg.b) obj;
                bVar.f57697b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.f58791c.size() < fVar.d) {
                        fVar.f58791c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f58803q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f58803q = null;
                }
                fVar.f58804r = null;
                fVar.invalidateSelf();
                return;
            default:
                ((zh.f0) obj).f60310b.f60354s1.setVisibility(8);
                return;
        }
    }
}
