package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u81 extends AnimatorListenerAdapter {
    public final int f50435a;
    public final Object f50436b;

    public u81(Object obj, int i7) {
        this.f50435a = i7;
        this.f50436b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f50435a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f50436b;
        switch (i11) {
            case 0:
                super.onAnimationEnd(animator);
                ((v81) obj).d = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((x91) obj).setScrollEnabled(true);
                return;
            case 2:
                bb1 bb1Var = (bb1) obj;
                if (animator.equals(bb1Var.d.K)) {
                    bb1Var.d.K = null;
                    return;
                }
                return;
            case 3:
                ob1 ob1Var = (ob1) obj;
                ob1Var.d = null;
                ob1Var.f48490a = null;
                ob1Var.f48491b = false;
                ob1Var.f48494f.f42074c.setAllowDrawCursor(true);
                return;
            case 4:
                ((org.telegram.ui.Wallet.w3) obj).K = null;
                return;
            case 5:
                ((org.telegram.ui.Wallet.d4) obj).f();
                return;
            case 6:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                if (z5Var.J0 == animator) {
                    z5Var.J0 = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) obj;
                x5Var.f43331n = false;
                x5Var.f43332r = null;
                x5Var.f43328c.setLayerType(0, null);
                return;
            case 8:
                org.telegram.ui.Wallet.d6 d6Var = (org.telegram.ui.Wallet.d6) obj;
                d6Var.N = 0.0f;
                d6Var.O = 0.0f;
                d6Var.f42353b0 = null;
                return;
            case 9:
                org.telegram.ui.Wallet.x6 x6Var = (org.telegram.ui.Wallet.x6) obj;
                x6Var.I = null;
                x6Var.f43346i0 = 1.0f;
                x6Var.f43345h0 = 0.0f;
                x6Var.f43344g0 = 0.0f;
                x6Var.e();
                return;
            case 10:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) obj;
                EditTextBoldCursor editTextBoldCursor = u8Var.f43234b;
                if (u8Var.f43240s == animator) {
                    u8Var.f43240s = null;
                    View view = u8Var.f43233a;
                    if (u8Var.f43243y) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (u8Var.f43243y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (u8Var.f43243y && !u8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) obj;
                n9Var.f42872n = null;
                org.telegram.ui.Wallet.x6 x6Var2 = n9Var.d;
                if (n9Var.f42876x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                x6Var2.setVisibility(i10);
                TextView textView = n9Var.f42871f;
                if (n9Var.f42877y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 12:
                n1 n1Var = (n1) obj;
                ((dd1) n1Var.f48093b).getClass();
                ((dd1) n1Var.f48093b).f44960c.setVisibility(4);
                return;
            case 13:
                ((org.telegram.ui.web.x0) obj).f51319s.setVisibility(8);
                return;
            case 14:
                sg.w wVar = (sg.w) obj;
                wVar.f55244a.getPainting().c(null, wVar.f55244a.getCurrentColor(), true, null);
                wVar.f55259r = null;
                return;
            case 15:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f55665c;
                f0Var.f55665c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 16:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f55731r) {
                    h1Var.f55729f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f55731r = null;
                    return;
                }
                return;
            case 17:
                ((ti.i) obj).v = null;
                return;
            case 18:
                ug.p0 p0Var = (ug.p0) obj;
                if (!p0Var.f56770r) {
                    f10 = 0.0f;
                }
                p0Var.f56771s = f10;
                p0Var.e();
                return;
            case 19:
                ug.t1 t1Var = (ug.t1) ((fi.c0) obj).f11726b;
                t1Var.F = true;
                t1Var.invalidate();
                return;
            case 20:
                int i13 = vg.e.K;
                ((vg.e) ((org.telegram.ui.Cells.x9) obj).f30927b).d();
                return;
            case 21:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f57408b;
                mVar.f57420b.d = 0.0f;
                mVar.f57424d0 = null;
                mVar.j(mVar.L);
                return;
            case 23:
                wg.b bVar = (wg.b) obj;
                bVar.f57695b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.f58799c.size() < fVar.d) {
                        fVar.f58799c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f58811q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f58811q = null;
                }
                fVar.f58812r = null;
                fVar.invalidateSelf();
                return;
            default:
                ((zh.f0) obj).f60322b.f60369v1.setVisibility(8);
                return;
        }
    }
}
