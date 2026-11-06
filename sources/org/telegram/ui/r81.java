package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r81 extends AnimatorListenerAdapter {
    public final int f49390a;
    public final Object f49391b;

    public r81(Object obj, int i7) {
        this.f49390a = i7;
        this.f49391b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f49390a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f49391b;
        switch (i11) {
            case 0:
                super.onAnimationEnd(animator);
                ((s81) obj).d = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((t91) obj).setScrollEnabled(true);
                return;
            case 2:
                xa1 xa1Var = (xa1) obj;
                if (animator.equals(xa1Var.d.K)) {
                    xa1Var.d.K = null;
                    return;
                }
                return;
            case 3:
                kb1 kb1Var = (kb1) obj;
                kb1Var.d = null;
                kb1Var.f47134a = null;
                kb1Var.f47135b = false;
                kb1Var.f47138f.f42048c.setAllowDrawCursor(true);
                return;
            case 4:
                ((org.telegram.ui.Wallet.w3) obj).K = null;
                return;
            case 5:
                ((org.telegram.ui.Wallet.d4) obj).f();
                return;
            case 6:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.J0 == animator) {
                    y5Var.J0 = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                w5Var.h = false;
                w5Var.f43260n = null;
                w5Var.f43256b.setLayerType(0, null);
                return;
            case 8:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.N = 0.0f;
                c6Var.O = 0.0f;
                c6Var.f42204b0 = null;
                return;
            case 9:
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) obj;
                w6Var.I = null;
                w6Var.f43274i0 = 1.0f;
                w6Var.f43273h0 = 0.0f;
                w6Var.f43272g0 = 0.0f;
                w6Var.e();
                return;
            case 10:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj;
                EditTextBoldCursor editTextBoldCursor = t8Var.f43148b;
                if (t8Var.f43154s == animator) {
                    t8Var.f43154s = null;
                    View view = t8Var.f43147a;
                    if (t8Var.f43157y) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (t8Var.f43157y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (t8Var.f43157y && !t8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) obj;
                m9Var.f42758n = null;
                org.telegram.ui.Wallet.w6 w6Var2 = m9Var.d;
                if (m9Var.f42762x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                w6Var2.setVisibility(i10);
                TextView textView = m9Var.f42757f;
                if (m9Var.f42763y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 12:
                n1 n1Var = (n1) obj;
                ((yc1) n1Var.f47910b).getClass();
                ((yc1) n1Var.f47910b).f52194c.setVisibility(4);
                return;
            case 13:
                ((org.telegram.ui.web.x0) obj).f51372s.setVisibility(8);
                return;
            case 14:
                sg.w wVar = (sg.w) obj;
                wVar.f55109a.getPainting().c(null, wVar.f55109a.getCurrentColor(), true, null);
                wVar.f55124r = null;
                return;
            case 15:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f55537c;
                f0Var.f55537c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 16:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f55603r) {
                    h1Var.f55601f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f55603r = null;
                    return;
                }
                return;
            case 17:
                ((ti.i) obj).v = null;
                return;
            case 18:
                ug.p0 p0Var = (ug.p0) obj;
                if (!p0Var.f56642r) {
                    f10 = 0.0f;
                }
                p0Var.f56643s = f10;
                p0Var.e();
                return;
            case 19:
                ug.t1 t1Var = (ug.t1) ((fi.c0) obj).f11721b;
                t1Var.F = true;
                t1Var.invalidate();
                return;
            case 20:
                int i13 = vg.e.K;
                ((vg.e) ((org.telegram.ui.Cells.x9) obj).f30906b).d();
                return;
            case 21:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f57283b;
                mVar.f57295b.d = 0.0f;
                mVar.f57299d0 = null;
                mVar.j(mVar.L);
                return;
            case 23:
                wg.b bVar = (wg.b) obj;
                bVar.f57581b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.f58672c.size() < fVar.d) {
                        fVar.f58672c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f58684q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f58684q = null;
                }
                fVar.f58685r = null;
                fVar.invalidateSelf();
                return;
            default:
                ((zh.g0) obj).f60203b.f60247s1.setVisibility(8);
                return;
        }
    }
}
