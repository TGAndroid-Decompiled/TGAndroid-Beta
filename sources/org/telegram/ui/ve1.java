package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ve1 extends AnimatorListenerAdapter {
    public final int f42753a;
    public final Object f42754b;

    public ve1(Object obj, int i10) {
        this.f42753a = i10;
        this.f42754b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f42753a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f42754b;
        switch (i12) {
            case 0:
                super.onAnimationEnd(animator);
                ((we1) obj).setScrollEnabled(true);
                return;
            case 1:
                ag1 ag1Var = (ag1) obj;
                if (animator.equals(ag1Var.d.K)) {
                    ag1Var.d.K = null;
                    return;
                }
                return;
            case 2:
                rg1 rg1Var = (rg1) obj;
                rg1Var.d = null;
                rg1Var.f41134a = null;
                rg1Var.f41135b = false;
                rg1Var.f41137f.f34259c.setAllowDrawCursor(true);
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
                m5Var.f34856n = null;
                m5Var.f34853b.setLayerType(0, null);
                return;
            case 7:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.N = 0.0f;
                s5Var.O = 0.0f;
                s5Var.f35132b0 = null;
                return;
            case 8:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.f34869i0 = 1.0f;
                m6Var.f34868h0 = 0.0f;
                m6Var.f34867g0 = 0.0f;
                m6Var.e();
                return;
            case 9:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) obj;
                EditTextBoldCursor editTextBoldCursor = o8Var.f34969b;
                if (o8Var.f34974s == animator) {
                    o8Var.f34974s = null;
                    View view = o8Var.f34968a;
                    if (o8Var.f34976x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (o8Var.f34976x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (o8Var.f34976x && !o8Var.f34977y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) obj;
                i9Var.f34613n = null;
                org.telegram.ui.Wallet.m6 m6Var2 = i9Var.d;
                if (i9Var.f34616w) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                m6Var2.setVisibility(i11);
                TextView textView = i9Var.f34612f;
                if (i9Var.f34617x) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 11:
                org.telegram.ui.Components.lg0 lg0Var = (org.telegram.ui.Components.lg0) obj;
                ((ki1) lg0Var.f28361b).getClass();
                ((ki1) lg0Var.f28361b).f38958c.setVisibility(4);
                return;
            case 12:
                ((org.telegram.ui.web.b1) obj).f43066s.setVisibility(8);
                return;
            case 13:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.f44912a.getPainting().c(null, e0Var.f44912a.getCurrentColor(), true, null);
                e0Var.f44926r = null;
                return;
            case 14:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45858c;
                l0Var.f45858c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 15:
                rg.s1 s1Var = (rg.s1) obj;
                if (animator == s1Var.f46071r) {
                    s1Var.f46069f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f46071r = null;
                    return;
                }
                return;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                if (!p0Var.f46805r) {
                    f7 = 0.0f;
                }
                p0Var.f46806s = f7;
                p0Var.e();
                return;
            case 17:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).f8814b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 18:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47499b).d();
                return;
            case 19:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 20:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47535b;
                nVar.f47547b.d = 0.0f;
                nVar.f47551d0 = null;
                nVar.j(nVar.L);
                return;
            case 21:
                ug.b bVar = (ug.b) obj;
                bVar.f48096b = 1.0f;
                bVar.invalidate();
                return;
            case 22:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49500c.size() < gVar.d) {
                        gVar.f49500c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49511q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49511q = null;
                }
                gVar.f49512r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.g0) obj).f50701b.f50755w.setVisibility(8);
                return;
        }
    }
}
