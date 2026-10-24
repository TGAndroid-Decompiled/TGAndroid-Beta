package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ue1 extends AnimatorListenerAdapter {
    public final int f42409a;
    public final Object f42410b;

    public ue1(Object obj, int i10) {
        this.f42409a = i10;
        this.f42410b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f42409a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f42410b;
        switch (i12) {
            case 0:
                super.onAnimationEnd(animator);
                ((ve1) obj).setScrollEnabled(true);
                return;
            case 1:
                zf1 zf1Var = (zf1) obj;
                if (animator.equals(zf1Var.d.K)) {
                    zf1Var.d.K = null;
                    return;
                }
                return;
            case 2:
                qg1 qg1Var = (qg1) obj;
                qg1Var.d = null;
                qg1Var.f40822a = null;
                qg1Var.f40823b = false;
                qg1Var.f40825f.f34261c.setAllowDrawCursor(true);
                return;
            case 3:
                ((org.telegram.ui.Wallet.f3) obj).K = null;
                return;
            case 4:
                ((org.telegram.ui.Wallet.m3) obj).f();
                return;
            case 5:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.I0 == animator) {
                    o5Var.I0 = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                m5Var.h = false;
                m5Var.f34858n = null;
                m5Var.f34855b.setLayerType(0, null);
                return;
            case 7:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.N = 0.0f;
                s5Var.O = 0.0f;
                s5Var.f35134b0 = null;
                return;
            case 8:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.f34871i0 = 1.0f;
                m6Var.f34870h0 = 0.0f;
                m6Var.f34869g0 = 0.0f;
                m6Var.e();
                return;
            case 9:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) obj;
                EditTextBoldCursor editTextBoldCursor = o8Var.f34971b;
                if (o8Var.f34976s == animator) {
                    o8Var.f34976s = null;
                    View view = o8Var.f34970a;
                    if (o8Var.f34978x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (o8Var.f34978x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (o8Var.f34978x && !o8Var.f34979y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) obj;
                i9Var.f34615n = null;
                org.telegram.ui.Wallet.m6 m6Var2 = i9Var.d;
                if (i9Var.f34618w) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                m6Var2.setVisibility(i11);
                TextView textView = i9Var.f34614f;
                if (i9Var.f34619x) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 11:
                org.telegram.ui.Components.kg0 kg0Var = (org.telegram.ui.Components.kg0) obj;
                ((ji1) kg0Var.f28016b).getClass();
                ((ji1) kg0Var.f28016b).f38574c.setVisibility(4);
                return;
            case 12:
                ((org.telegram.ui.web.b1) obj).f43055s.setVisibility(8);
                return;
            case 13:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.f44911a.getPainting().c(null, e0Var.f44911a.getCurrentColor(), true, null);
                e0Var.f44925r = null;
                return;
            case 14:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45857c;
                l0Var.f45857c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 15:
                rg.s1 s1Var = (rg.s1) obj;
                if (animator == s1Var.f46070r) {
                    s1Var.f46068f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f46070r = null;
                    return;
                }
                return;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                if (!p0Var.f46804r) {
                    f7 = 0.0f;
                }
                p0Var.f46805s = f7;
                p0Var.e();
                return;
            case 17:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).f8814b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 18:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47498b).d();
                return;
            case 19:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 20:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47534b;
                nVar.f47546b.d = 0.0f;
                nVar.f47550d0 = null;
                nVar.j(nVar.L);
                return;
            case 21:
                ug.b bVar = (ug.b) obj;
                bVar.f48095b = 1.0f;
                bVar.invalidate();
                return;
            case 22:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49499c.size() < gVar.d) {
                        gVar.f49499c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49510q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49510q = null;
                }
                gVar.f49511r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.g0) obj).f50700b.f50754w.setVisibility(8);
                return;
        }
    }
}
