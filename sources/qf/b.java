package qf;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import lh.r5;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import rh.b2;
import rh.u1;
import zf.l2;
import zf.v2;

public final class b implements Runnable {

    public final int f46237a;

    public final Object f46238b;

    public b(Object obj, int i10) {
        this.f46237a = i10;
        this.f46238b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46237a) {
            case 0:
                e eVar = (e) this.f46238b;
                eVar.f46269c.U2.N(true);
                eVar.V(true);
                return;
            case 1:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f46238b).link);
                mc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 2:
                g0 g0Var = (g0) this.f46238b;
                b51 b51Var = g0Var.Z;
                if (b51Var != null) {
                    b51Var.N(true);
                }
                g0Var.T(true);
                return;
            case 3:
                m0 m0Var = (m0) ((o0.b) this.f46238b).f19088b;
                m0Var.f46372c.U2.N(true);
                m0Var.b0();
                return;
            case 4:
                o0 o0Var = (o0) this.f46238b;
                o0Var.f46402c.U2.N(true);
                o0Var.V(true);
                return;
            case 5:
                y0 y0Var = (y0) this.f46238b;
                y0Var.f46496a.U2.N(true);
                y0Var.Y(true);
                return;
            case 6:
                ((cg.e1) this.f46238b).run(Boolean.FALSE);
                return;
            case 7:
                NotificationCenter.getInstance(((q1) this.f46238b).f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 8:
                e3 e3Var = ((g3) this.f46238b).f24370b;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                return;
            case 9:
                AndroidUtilities.showKeyboard(((rh.v) this.f46238b).f47507a0.f24370b);
                return;
            case 10:
                ((rh.b0) this.f46238b).invalidate();
                return;
            case 11:
                t3 t3Var = (t3) this.f46238b;
                t3Var.f17475c = null;
                t3Var.d = null;
                t3Var.f17476e = null;
                t3Var.f17477f = null;
                t3Var.e(null);
                return;
            case 12:
                ((u1) this.f46238b).invalidateSelf();
                return;
            case 13:
                ((b2) this.f46238b).c();
                return;
            case 14:
                ((tg.b) this.f46238b).invalidate();
                return;
            case 15:
                ug.d dVar = (ug.d) this.f46238b;
                GroupCallMessage groupCallMessage = dVar.D;
                if (groupCallMessage != null) {
                    dVar.f48643a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.f48644b.a(dVar.D.isSendError(), true);
                    return;
                }
                return;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) this.f46238b, Boolean.TRUE, null, -1);
                return;
            case 17:
                we1 we1Var = (we1) this.f46238b;
                if (we1Var.getParentLayout() != null) {
                    we1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", we1Var.f43719a);
                    rn rnVar = new rn(bundle);
                    rnVar.f42050fa = true;
                    we1Var.presentFragment(rnVar);
                    return;
                }
                return;
            case 18:
                y3.f fVar = (y3.f) this.f46238b;
                synchronized (fVar.f49473a) {
                    try {
                        if (fVar.f49482l) {
                            return;
                        }
                        long j10 = fVar.f49481k - 1;
                        fVar.f49481k = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 19:
                n1.d dVar2 = ((yf.o0) this.f46238b).f49996b.f50011a;
                if (dVar2 != null) {
                    dVar2.C();
                    return;
                }
                return;
            case 20:
                yf.p0 p0Var = ((yf.o0) this.f46238b).f49996b;
                if (p0Var.d == null) {
                    p0Var.L = null;
                    return;
                }
                int currentColor = p0Var.f50015f.getCurrentColor();
                p0Var.l(p0Var.f50012b, false, false);
                b6.a aVarD = p0Var.d(p0Var.f50012b, currentColor, new RectF(p0Var.h));
                p0Var.b();
                yf.e1 e1Var = p0Var.d;
                RectF rectF = new RectF();
                p0Var.h = rectF;
                e1Var.a(rectF);
                p0Var.p(p0Var.e(e1Var, currentColor, new RectF(p0Var.h)), false);
                p0Var.p(aVarD, false);
                p0Var.e(e1Var, currentColor, null);
                p0Var.d = null;
                p0Var.J = 0.0f;
                p0Var.L = null;
                return;
            case 21:
                ((yf.z0) ((mu0) this.f46238b).f30749b).f50140y.f49878a.a();
                return;
            case 22:
                yf.r1 r1Var = ((yf.s1) this.f46238b).f50076a;
                if (r1Var != null) {
                    r1Var.g();
                    return;
                }
                return;
            case 23:
                yg.c cVar = (yg.c) this.f46238b;
                yg.b bVar = cVar.f50147c;
                if (bVar == yg.b.f50142b) {
                    cVar.a(yg.b.f50141a, true);
                    return;
                } else {
                    if (bVar == yg.b.f50143c) {
                        cVar.a(yg.b.d, true);
                        return;
                    }
                    return;
                }
            case 24:
                r5 r5Var = (r5) this.f46238b;
                r5Var.f50394t0 = true;
                r5Var.s();
                return;
            case 25:
                ((View) this.f46238b).performClick();
                return;
            case 26:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((l2) this.f46238b).f50550f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((v2) this.f46238b).m0);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((zg.c) this.f46238b).f50804a);
                return;
            default:
                zg.c cVar2 = (zg.c) ((gh.r) this.f46238b).d;
                org.telegram.ui.Cells.s1 s1Var = cVar2.f50809n;
                if (s1Var == null || s1Var.getDelegate() == null) {
                    return;
                }
                cVar2.f50809n.getDelegate().v1(cVar2.f50809n, false);
                return;
        }
    }
}
