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
    public final int f42173a;
    public final Object f42174b;

    public vf1(Object obj, int i10) {
        this.f42173a = i10;
        this.f42174b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f42173a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f42174b;
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
                ng1Var.f39435a = null;
                ng1Var.f39436b = false;
                ng1Var.f39438f.f33943c.setAllowDrawCursor(true);
                return;
            case 2:
                ((org.telegram.ui.Wallet.f3) obj).K = null;
                return;
            case 3:
                ((org.telegram.ui.Wallet.m3) obj).g();
                return;
            case 4:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) obj;
                if (n5Var.I0 == animator) {
                    n5Var.I0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) obj;
                l5Var.h = false;
                l5Var.f34441n = null;
                l5Var.f34438b.setLayerType(0, null);
                return;
            case 6:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.M = 0.0f;
                s5Var.N = 0.0f;
                s5Var.V = null;
                return;
            case 7:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.f34547i0 = 1.0f;
                m6Var.f34546h0 = 0.0f;
                m6Var.f34545g0 = 0.0f;
                m6Var.e();
                return;
            case 8:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.f34616b;
                if (n8Var.f34621s == animator) {
                    n8Var.f34621s = null;
                    View view = n8Var.f34615a;
                    if (n8Var.f34623x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (n8Var.f34623x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (n8Var.f34623x && !n8Var.f34624y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                h9Var.h = null;
                org.telegram.ui.Wallet.m6 m6Var2 = h9Var.f34279c;
                if (h9Var.v) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                m6Var2.setVisibility(i11);
                TextView textView = h9Var.e;
                if (h9Var.f34284w) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 10:
                org.telegram.ui.Components.gg0 gg0Var = (org.telegram.ui.Components.gg0) obj;
                ((ei1) gg0Var.f26563b).getClass();
                ((ei1) gg0Var.f26563b).f36540c.setVisibility(4);
                return;
            case 11:
                ((org.telegram.ui.web.b1) obj).f42542s.setVisibility(8);
                return;
            case 12:
                qg.d0 d0Var = (qg.d0) obj;
                d0Var.f44488a.getPainting().c(null, d0Var.f44488a.getCurrentColor(), true, null);
                d0Var.f44502r = null;
                return;
            case 13:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45454c;
                l0Var.f45454c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 14:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.f45618r) {
                    r1Var.f45616f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45618r = null;
                    return;
                }
                return;
            case 15:
                sg.q0 q0Var = (sg.q0) obj;
                if (!q0Var.h) {
                    f7 = 0.0f;
                }
                q0Var.f46380n = f7;
                q0Var.e();
                return;
            case 16:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).f8806b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 17:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47051b).d();
                return;
            case 18:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 19:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47087b;
                nVar.f47099b.d = 0.0f;
                nVar.f47103d0 = null;
                nVar.j(nVar.L);
                return;
            case 20:
                ug.b bVar = (ug.b) obj;
                bVar.f47644b = 1.0f;
                bVar.invalidate();
                return;
            case 21:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49048c.size() < gVar.d) {
                        gVar.f49048c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49059q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49059q = null;
                }
                gVar.f49060r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.g0) obj).f50247b.f50293w.setVisibility(8);
                return;
        }
    }
}
