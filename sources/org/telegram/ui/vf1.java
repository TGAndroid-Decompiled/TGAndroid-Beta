package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vf1 extends AnimatorListenerAdapter {
    public final int f42198a;
    public final Object f42199b;

    public vf1(Object obj, int i10) {
        this.f42198a = i10;
        this.f42199b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f42198a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f42199b;
        switch (i12) {
            case 0:
                wf1 wf1Var = (wf1) obj;
                if (animator.equals(wf1Var.d.K)) {
                    wf1Var.d.K = null;
                    return;
                }
                return;
            case 1:
                ng1 ng1Var = (ng1) obj;
                ng1Var.d = null;
                ng1Var.f39449a = null;
                ng1Var.f39450b = false;
                ng1Var.f39452f.f33943c.setAllowDrawCursor(true);
                return;
            case 2:
                ((org.telegram.ui.Wallet.d3) obj).K = null;
                return;
            case 3:
                ((org.telegram.ui.Wallet.k3) obj).g();
                return;
            case 4:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) obj;
                if (l5Var.K0 == animator) {
                    l5Var.K0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.j5 j5Var = (org.telegram.ui.Wallet.j5) obj;
                j5Var.h = false;
                j5Var.f34357n = null;
                j5Var.f34354b.setLayerType(0, null);
                return;
            case 6:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                o5Var.J = 0.0f;
                o5Var.K = 0.0f;
                o5Var.R = null;
                return;
            case 7:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                org.telegram.ui.Wallet.y5 y5Var = b6Var.f34039f0;
                y5Var.d = 0.0f;
                y5Var.f47095i = 0.0f;
                b6Var.f34047o0 = null;
                return;
            case 8:
                org.telegram.ui.Wallet.p6 p6Var = (org.telegram.ui.Wallet.p6) obj;
                p6Var.I = null;
                p6Var.f34739i0 = 1.0f;
                p6Var.f34738h0 = 0.0f;
                p6Var.f34737g0 = 0.0f;
                p6Var.e();
                return;
            case 9:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) obj;
                EditTextBoldCursor editTextBoldCursor = q8Var.f34808b;
                if (q8Var.f34813s == animator) {
                    q8Var.f34813s = null;
                    View view = q8Var.f34807a;
                    if (q8Var.f34815x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (q8Var.f34815x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (q8Var.f34815x && !q8Var.f34816y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                k9Var.h = null;
                org.telegram.ui.Wallet.p6 p6Var2 = k9Var.f34445c;
                if (k9Var.v) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                p6Var2.setVisibility(i11);
                TextView textView = k9Var.e;
                if (k9Var.f34450w) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 11:
                org.telegram.ui.Components.gg0 gg0Var = (org.telegram.ui.Components.gg0) obj;
                ((ei1) gg0Var.f26563b).getClass();
                ((ei1) gg0Var.f26563b).f36552c.setVisibility(4);
                return;
            case 12:
                ((org.telegram.ui.web.a1) obj).f42537s.setVisibility(8);
                return;
            case 13:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.f44513a.getPainting().c(null, e0Var.f44513a.getCurrentColor(), true, null);
                e0Var.f44527r = null;
                return;
            case 14:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45480c;
                l0Var.f45480c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 15:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.f45645r) {
                    r1Var.f45643f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45645r = null;
                    return;
                }
                return;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                if (!p0Var.h) {
                    f7 = 0.0f;
                }
                p0Var.f46381n = f7;
                p0Var.e();
                return;
            case 17:
                sg.z1 z1Var = (sg.z1) ((ei.c0) obj).f8807b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 18:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47079b).d();
                return;
            case 19:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 20:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47115b;
                nVar.f47127b.d = 0.0f;
                nVar.f47126a0 = null;
                nVar.k(nVar.L);
                return;
            case 21:
                ug.b bVar = (ug.b) obj;
                bVar.f47670b = 1.0f;
                bVar.invalidate();
                return;
            case 22:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49070c.size() < gVar.d) {
                        gVar.f49070c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49081q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49081q = null;
                }
                gVar.f49082r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.h0) obj).f50282b.f50328w.setVisibility(8);
                return;
        }
    }
}
