package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.view.ViewPropertyAnimator;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.bt;
import org.telegram.ui.wn;
public final class o1 implements Runnable {
    public final int f39170a;
    public final Object f39171b;
    public final Object f39172c;

    public o1(int i10, Object obj, Object obj2) {
        this.f39170a = i10;
        this.f39171b = obj;
        this.f39172c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f39171b;
        pa.b bVar = (pa.b) this.f39172c;
        synchronized (oVar) {
            try {
                if (oVar.f41492b == null) {
                    oVar.f41491a.add(bVar);
                } else {
                    oVar.f41492b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        q0 q0Var;
        pa.a aVar;
        int i10;
        float f7 = 1.0f;
        boolean z10 = false;
        switch (this.f39170a) {
            case 0:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f39171b;
                if (((g2) this.f39172c).b() != null) {
                    z10 = true;
                }
                e1Var.setEnabled(z10);
                ViewPropertyAnimator animate = e1Var.animate();
                if (!e1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 1:
                ((org.telegram.ui.l0) this.f39171b).f39236f0.run((Integer) this.f39172c);
                return;
            case 2:
                z1 z1Var = (z1) this.f39171b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.f39172c);
                z1Var.f26372a.Y2.N(true);
                return;
            case 3:
                g2 g2Var = (g2) this.f39172c;
                TLObject tLObject = (TLObject) this.f39171b;
                int i11 = g2Var.f39068a;
                g2Var.f39072g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (q0Var = g2Var.f39076l) != null) {
                    q0Var.run();
                }
                g2Var.c();
                return;
            case 4:
                ((g2) this.f39172c).f39077m.remove((o1) this.f39171b);
                return;
            case 5:
                p2.b bVar = (p2.b) this.f39171b;
                bVar.f40672r = false;
                bVar.d((Uri) this.f39172c);
                return;
            case 6:
                pg.s0 s0Var = (pg.s0) this.f39171b;
                s0Var.v = true;
                RectF f10 = s0Var.f();
                Object obj = s0Var.f41222a.f15116b;
                s0Var.f41240w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f15411c, 0, f10);
                s0Var.a(false);
                ((pg.z0) this.f39172c).run();
                return;
            case 7:
                Runnable runnable = (Runnable) this.f39172c;
                pg.d1 d1Var = ((pg.f1) this.f39171b).d;
                if (d1Var != null && d1Var.f41093f) {
                    pg.d1.b(d1Var);
                    runnable.run();
                    return;
                }
                return;
            case 8:
                q9.p pVar = (q9.p) this.f39171b;
                pa.b bVar2 = (pa.b) this.f39172c;
                if (pVar.f41495b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f41494a;
                        pVar.f41494a = null;
                        pVar.f41495b = bVar2;
                    }
                    aVar.g(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 9:
                a();
                return;
            case 10:
                qg.y1 y1Var = (qg.y1) this.f39172c;
                y1Var.m();
                ((qg.n0) this.f39171b).s0(y1Var, true);
                return;
            case 11:
                ((qg.y1) this.f39171b).s((Bitmap) this.f39172c);
                return;
            case 12:
                qg.n2 n2Var = (qg.n2) this.f39171b;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) ((ArrayList) this.f39172c).toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f41813b0.setScaleX(0.3f);
                    n2Var.f41813b0.setScaleY(0.3f);
                    n2Var.f41813b0.setAlpha(0.0f);
                    n2Var.f41813b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(rr.f28031f).start();
                    return;
                }
                return;
            case 13:
                CarResultStub.H0((Map.Entry) this.f39171b, this.f39172c);
                return;
            case 14:
                int i12 = JobInfoSchedulerService.f5934a;
                ((JobInfoSchedulerService) this.f39171b).jobFinished((JobParameters) this.f39172c, false);
                return;
            case 15:
                r9.a aVar2 = (r9.a) this.f39171b;
                Runnable runnable2 = (Runnable) this.f39172c;
                Process.setThreadPriority(aVar2.f42437c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.f39171b;
                r9.h hVar = (r9.h) ((n2.e) this.f39172c).f15116b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 17:
                rg.j0 j0Var = (rg.j0) this.f39171b;
                TLObject tLObject2 = (TLObject) this.f39172c;
                ArrayList arrayList = j0Var.f42603i0;
                wl0 wl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f42607n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < wl0Var.getChildCount()) {
                            if (wl0Var.getChildAt(i13) instanceof rg.i0) {
                                i10 = wl0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.f42606l0 >= 0 && i10 != 0) {
                        ((s4.c0) wl0Var.getLayoutManager()).h1(j0Var.f42606l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2341b);
                j0Var.f42617x0.g(max, false);
                j0Var.f42617x0.setBagePosition(max / j0Var.M0.f2342c);
                rg.h0 h0Var = j0Var.f42617x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 18:
                ((rg.j0) this.f39171b).m1((q90) this.f39172c, true);
                return;
            case 19:
                rg.z1 z1Var2 = (rg.z1) this.f39171b;
                AndroidUtilities.runOnUIThread(new o1(20, z1Var2, FileLoader.getInstance(z1Var2.f42858s).getPathToAttach((TLRPC.Document) this.f39172c)));
                return;
            case 20:
                rg.z1 z1Var3 = (rg.z1) this.f39171b;
                z1Var3.e = (File) this.f39172c;
                z1Var3.a();
                return;
            case 21:
                rf.b bVar3 = (rf.b) this.f39172c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f39171b).e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 22:
                ((tg.w0) this.f39171b).run((ArrayList) this.f39172c);
                return;
            case 23:
                ((tg.v) this.f39171b).run((TLRPC.TL_error) this.f39172c);
                return;
            case 24:
                ((bt) this.f39171b).run((ArrayList) this.f39172c);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.f39172c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f39171b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 26:
                qc M = xc.a0((wn) this.f39171b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f39172c).stars)), R.raw.stars_send);
                M.f27578j = 5000;
                M.k(true);
                return;
            case 27:
                tg.a0 a0Var = (tg.a0) this.f39171b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f43353b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f39172c);
                return;
            case 28:
                tg.m1.P((tg.m1) this.f39171b, (TLObject) this.f39172c);
                return;
            default:
                ((e2.h) this.f39171b).accept(this.f39172c);
                return;
        }
    }

    public o1(g2 g2Var, Object obj, int i10) {
        this.f39170a = i10;
        this.f39172c = g2Var;
        this.f39171b = obj;
    }
}
