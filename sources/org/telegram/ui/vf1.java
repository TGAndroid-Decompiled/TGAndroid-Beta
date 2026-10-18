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
    public final int f42215a;
    public final Object f42216b;

    public vf1(Object obj, int i10) {
        this.f42215a = i10;
        this.f42216b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f42215a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f42216b;
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
                ng1Var.f39475a = null;
                ng1Var.f39476b = false;
                ng1Var.f39478f.f33950c.setAllowDrawCursor(true);
                return;
            case 2:
                ((org.telegram.ui.Wallet.e3) obj).K = null;
                return;
            case 3:
                ((org.telegram.ui.Wallet.l3) obj).g();
                return;
            case 4:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.K0 == animator) {
                    m5Var.K0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.k5 k5Var = (org.telegram.ui.Wallet.k5) obj;
                k5Var.h = false;
                k5Var.f34393n = null;
                k5Var.f34390b.setLayerType(0, null);
                return;
            case 6:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                p5Var.J = 0.0f;
                p5Var.K = 0.0f;
                p5Var.R = null;
                return;
            case 7:
                org.telegram.ui.Wallet.e6 e6Var = (org.telegram.ui.Wallet.e6) obj;
                org.telegram.ui.Wallet.b6 b6Var = e6Var.f34194i0;
                b6Var.d = 0.0f;
                b6Var.f47117i = 0.0f;
                e6Var.f34202r0 = null;
                return;
            case 8:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.I = null;
                s6Var.f34909i0 = 1.0f;
                s6Var.f34908h0 = 0.0f;
                s6Var.f34907g0 = 0.0f;
                s6Var.e();
                return;
            case 9:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj;
                EditTextBoldCursor editTextBoldCursor = t8Var.f34946b;
                if (t8Var.f34951s == animator) {
                    t8Var.f34951s = null;
                    View view = t8Var.f34945a;
                    if (t8Var.f34953x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (t8Var.f34953x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (t8Var.f34953x && !t8Var.f34954y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) obj;
                n9Var.h = null;
                org.telegram.ui.Wallet.s6 s6Var2 = n9Var.f34648c;
                if (n9Var.v) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                s6Var2.setVisibility(i11);
                TextView textView = n9Var.e;
                if (n9Var.f34653w) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 11:
                org.telegram.ui.Components.gg0 gg0Var = (org.telegram.ui.Components.gg0) obj;
                ((ei1) gg0Var.f26570b).getClass();
                ((ei1) gg0Var.f26570b).f36556c.setVisibility(4);
                return;
            case 12:
                ((org.telegram.ui.web.a1) obj).f42561s.setVisibility(8);
                return;
            case 13:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.f44533a.getPainting().c(null, e0Var.f44533a.getCurrentColor(), true, null);
                e0Var.f44547r = null;
                return;
            case 14:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.f45500c;
                l0Var.f45500c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 15:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.f45665r) {
                    r1Var.f45663f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45665r = null;
                    return;
                }
                return;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                if (!p0Var.h) {
                    f7 = 0.0f;
                }
                p0Var.f46401n = f7;
                p0Var.e();
                return;
            case 17:
                sg.z1 z1Var = (sg.z1) ((ei.c0) obj).f8808b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 18:
                int i14 = tg.f.K;
                ((tg.f) ((tg.e) obj).f47101b).d();
                return;
            case 19:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 20:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f47137b;
                nVar.f47149b.d = 0.0f;
                nVar.f47153d0 = null;
                nVar.l(nVar.L);
                return;
            case 21:
                ug.b bVar = (ug.b) obj;
                bVar.f47691b = 1.0f;
                bVar.invalidate();
                return;
            case 22:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f49095c.size() < gVar.d) {
                        gVar.f49095c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49106q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49106q = null;
                }
                gVar.f49107r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((yh.h0) obj).f50307b.f50353w.setVisibility(8);
                return;
        }
    }
}
