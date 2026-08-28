package pf;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import kh.s5;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.we1;
import qh.b2;
import yf.k2;
import yf.v2;
public final class o1 implements Runnable {
    public final int f45739a;
    public final Object f45740b;

    public o1(Object obj, int i9) {
        this.f45739a = i9;
        this.f45740b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45739a) {
            case 0:
                NotificationCenter.getInstance(((r1) this.f45740b).f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 1:
                h3 h3Var = ((j3) this.f45740b).f24544b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((qh.v) this.f45740b).f46745a0.f24544b);
                return;
            case 3:
                ((qh.b0) this.f45740b).invalidate();
                return;
            case 4:
                t3 t3Var = (t3) this.f45740b;
                t3Var.f17100c = null;
                t3Var.d = null;
                t3Var.f17101e = null;
                t3Var.f17102f = null;
                t3Var.e(null);
                return;
            case 5:
                ((qh.u1) this.f45740b).invalidateSelf();
                return;
            case 6:
                ((b2) this.f45740b).c();
                return;
            case 7:
                ((sg.b) this.f45740b).invalidate();
                return;
            case 8:
                tg.d dVar = (tg.d) this.f45740b;
                GroupCallMessage groupCallMessage = dVar.D;
                if (groupCallMessage != null) {
                    dVar.f47921a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.f47922b.a(dVar.D.isSendError(), true);
                    return;
                }
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (e6) this.f45740b, Boolean.TRUE, null, -1);
                return;
            case 10:
                we1 we1Var = (we1) this.f45740b;
                if (we1Var.getParentLayout() != null) {
                    we1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", we1Var.f43741a);
                    qn qnVar = new qn(bundle);
                    qnVar.f41914fa = true;
                    we1Var.presentFragment(qnVar);
                    return;
                }
                return;
            case 11:
                m5.c0 c0Var = ((xf.p0) this.f45740b).f49294b.f49310a;
                if (c0Var != null) {
                    c0Var.i();
                    return;
                }
                return;
            case 12:
                xf.q0 q0Var = ((xf.p0) this.f45740b).f49294b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f49314f.getCurrentColor();
                q0Var.l(q0Var.f49311b, false, false);
                a6.a d = q0Var.d(q0Var.f49311b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                xf.f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 13:
                ((xf.a1) ((ju0) this.f45740b).f29844b).f49169y.f49178a.a();
                return;
            case 14:
                xf.s1 s1Var = ((xf.t1) this.f45740b).f49381a;
                if (s1Var != null) {
                    s1Var.e();
                    return;
                }
                return;
            case 15:
                xg.c cVar = (xg.c) this.f45740b;
                xg.b bVar = cVar.f49434c;
                if (bVar == xg.b.f49429b) {
                    cVar.a(xg.b.f49428a, true);
                    return;
                } else if (bVar == xg.b.f49430c) {
                    cVar.a(xg.b.d, true);
                    return;
                } else {
                    return;
                }
            case 16:
                y3.f fVar = (y3.f) this.f45740b;
                synchronized (fVar.f49483a) {
                    try {
                        if (!fVar.f49492l) {
                            long j10 = fVar.f49491k - 1;
                            fVar.f49491k = j10;
                            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                            if (i9 <= 0) {
                                if (i9 < 0) {
                                    fVar.c(new IllegalStateException());
                                    return;
                                } else {
                                    fVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 17:
                s5 s5Var = (s5) this.f45740b;
                s5Var.f49799t0 = true;
                s5Var.s();
                return;
            case 18:
                ((View) this.f45740b).performClick();
                return;
            case 19:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((k2) this.f45740b).f49910f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((v2) this.f45740b).m0);
                return;
            case 21:
                AndroidUtilities.showKeyboard(((yg.c) this.f45740b).f50208a);
                return;
            case 22:
                yg.c cVar2 = (yg.c) ((fh.s) this.f45740b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.f50213n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar2.f50213n.getDelegate().t1(cVar2.f50213n, false);
                    return;
                }
                return;
            case 23:
                ((yg.q) this.f45740b).f50261c.U2.N(true);
                return;
            case 24:
                ((yg.p) this.f45740b).a();
                return;
            case 25:
                ((b3.b) this.f45740b).z();
                return;
            case 26:
                zf.j0 j0Var = ((zf.c0) this.f45740b).f50478c;
                j0Var.f32410n.presentFragment(s91.c0(j0Var.s1(), true));
                return;
            case 27:
                pi0 pi0Var = ((zf.p0) this.f45740b).f50655y;
                pi0Var.getAnimatedDrawable().L(0, true, false);
                pi0Var.d();
                return;
            case 28:
                ((zf.v0) this.f45740b).f50732b.y();
                return;
            default:
                zf.o1 o1Var = (zf.o1) this.f45740b;
                int size = 1073741823 - (1073741823 % o1Var.T2.size());
                f2.m0 m0Var = o1Var.U2;
                o1Var.f50639h3 = size;
                m0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
        }
    }
}
