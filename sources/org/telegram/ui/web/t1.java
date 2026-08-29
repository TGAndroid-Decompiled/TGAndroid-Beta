package org.telegram.ui.web;

import java.io.File;
import lh.e6;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ho;
import ph.m3;
import ph.o2;
public final class t1 implements Runnable {
    public final int f44206a;
    public final Object f44207b;

    public t1(Object obj, int i10) {
        this.f44206a = i10;
        this.f44207b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f44206a) {
            case 0:
                w1 w1Var = (w1) this.f44207b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += w1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += w1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = w1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new ho(w1Var, j10, j11, 1));
                return;
            case 1:
                ((boolean[]) this.f44207b)[0] = true;
                return;
            case 2:
                ((ph.d0) this.f44207b).invalidateSelf();
                return;
            case 3:
                ((ph.e0) this.f44207b).invalidateSelf();
                return;
            case 4:
                ((ph.g0) this.f44207b).d();
                return;
            case 5:
                ((ph.r0) this.f44207b).c();
                return;
            case 6:
                ((ph.r0) this.f44207b).c();
                return;
            case 7:
                ((ph.s0) this.f44207b).a();
                return;
            case 8:
                ((ph.t0) this.f44207b).a();
                return;
            case 9:
                ((o2) this.f44207b).invalidate();
                return;
            case 10:
                ((AnimationNotificationsLocker) this.f44207b).unlock();
                return;
            case 11:
                m3 m3Var = (m3) this.f44207b;
                m3Var.M = m3Var.f45908r;
                return;
            case 12:
                ((org.telegram.ui.Components.n) this.f44207b).k();
                return;
            case 13:
                e6 e6Var = ((rf.z0) this.f44207b).f47419y;
                if (e6Var != null) {
                    e6Var.p(3, true);
                    return;
                }
                return;
            case 14:
                sf.d dVar = (sf.d) this.f44207b;
                dVar.f47765c.U2.N(true);
                dVar.V(true);
                return;
            case 15:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f44207b).link);
                tc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 16:
                sf.f0 f0Var = (sf.f0) this.f44207b;
                k51 k51Var = f0Var.Z;
                if (k51Var != null) {
                    k51Var.N(true);
                }
                f0Var.T(true);
                return;
            case 17:
                sf.l0 l0Var = (sf.l0) ((o1.a) this.f44207b).f19014b;
                l0Var.f47862c.U2.N(true);
                l0Var.b0();
                return;
            case 18:
                sf.n0 n0Var = (sf.n0) this.f44207b;
                n0Var.f47895c.U2.N(true);
                n0Var.V(true);
                return;
            case 19:
                sf.x0 x0Var = (sf.x0) this.f44207b;
                x0Var.f48000a.U2.N(true);
                x0Var.Y(true);
                return;
            case 20:
                ((eg.d1) this.f44207b).run(Boolean.FALSE);
                return;
            case 21:
                NotificationCenter.getInstance(((sf.s1) this.f44207b).f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 22:
                e3 e3Var = ((g3) this.f44207b).f24387b;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                return;
            case 23:
                AndroidUtilities.showKeyboard(((th.v) this.f44207b).f48805a0.f24387b);
                return;
            case 24:
                ((th.b0) this.f44207b).invalidate();
                return;
            case 25:
                s3 s3Var = (s3) this.f44207b;
                s3Var.f16690c = null;
                s3Var.d = null;
                s3Var.f16691e = null;
                s3Var.f16692f = null;
                s3Var.e(null);
                return;
            case 26:
                ((th.u1) this.f44207b).invalidateSelf();
                return;
            case 27:
                ((th.b2) this.f44207b).c();
                return;
            case 28:
                ((vg.b) this.f44207b).invalidate();
                return;
            default:
                wg.c cVar = (wg.c) this.f44207b;
                GroupCallMessage groupCallMessage = cVar.D;
                if (groupCallMessage != null) {
                    cVar.f49964a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f49965b.a(cVar.D.isSendError(), true);
                    return;
                }
                return;
        }
    }
}
