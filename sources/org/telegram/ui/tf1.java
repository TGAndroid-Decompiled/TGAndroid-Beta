package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tf1 extends AnimatorListenerAdapter {
    public final int f41659a;
    public final Object f41660b;

    public tf1(Object obj, int i10) {
        this.f41659a = i10;
        this.f41660b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f41659a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f41660b;
        switch (i12) {
            case 0:
                uf1 uf1Var = (uf1) obj;
                if (animator.equals(uf1Var.d.K)) {
                    uf1Var.d.K = null;
                    return;
                }
                return;
            case 1:
                lg1 lg1Var = (lg1) obj;
                lg1Var.d = null;
                lg1Var.f38914a = null;
                lg1Var.f38915b = false;
                lg1Var.f38917f.f33951c.setAllowDrawCursor(true);
                return;
            case 2:
                ((org.telegram.ui.Wallet.g3) obj).K = null;
                return;
            case 3:
                ((org.telegram.ui.Wallet.n3) obj).f();
                return;
            case 4:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.I0 == animator) {
                    o5Var.I0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                m5Var.h = false;
                m5Var.f34508n = null;
                m5Var.f34505b.setLayerType(0, null);
                return;
            case 6:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.N = 0.0f;
                s5Var.O = 0.0f;
                s5Var.f34837b0 = null;
                return;
            case 7:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.f34521i0 = 1.0f;
                m6Var.f34520h0 = 0.0f;
                m6Var.f34519g0 = 0.0f;
                m6Var.e();
                return;
            case 8:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.f34604b;
                if (n8Var.f34609s == animator) {
                    n8Var.f34609s = null;
                    View view = n8Var.f34603a;
                    if (n8Var.f34611x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (n8Var.f34611x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (n8Var.f34611x && !n8Var.f34612y) {
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
                org.telegram.ui.Wallet.m6 m6Var2 = h9Var.f34288c;
                if (h9Var.v) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                m6Var2.setVisibility(i11);
                TextView textView = h9Var.e;
                if (h9Var.f34293w) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 10:
                org.telegram.ui.Components.gg0 gg0Var = (org.telegram.ui.Components.gg0) obj;
                ((ci1) gg0Var.f26590b).getClass();
                ((ci1) gg0Var.f26590b).f35987c.setVisibility(4);
                return;
            case 11:
                ((org.telegram.ui.web.a1) obj).f42578s.setVisibility(8);
                return;
            case 12:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.f44489a.getPainting().c(null, e0Var.f44489a.getCurrentColor(), true, null);
                e0Var.f44503r = null;
                return;
            case 13:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45438c;
                l0Var.f45438c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 14:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.f45619r) {
                    r1Var.f45617f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45619r = null;
                    return;
                }
                return;
            case 15:
                sg.q0 q0Var = (sg.q0) obj;
                if (!q0Var.h) {
                    f7 = 0.0f;
                }
                q0Var.f46382n = f7;
                q0Var.e();
                return;
            case 16:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).f8805b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 17:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47055b).d();
                return;
            case 18:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 19:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47091b;
                nVar.f47103b.d = 0.0f;
                nVar.f47107d0 = null;
                nVar.j(nVar.L);
                return;
            case 20:
                ug.b bVar = (ug.b) obj;
                bVar.f47646b = 1.0f;
                bVar.invalidate();
                return;
            case 21:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49049c.size() < gVar.d) {
                        gVar.f49049c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49060q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49060q = null;
                }
                gVar.f49061r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.g0) obj).f50248b.f50294w.setVisibility(8);
                return;
        }
    }
}
