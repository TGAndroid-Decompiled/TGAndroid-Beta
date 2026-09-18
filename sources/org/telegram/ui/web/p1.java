package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
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
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.nj0;
import org.telegram.ui.x81;
import org.telegram.ui.zn;
public final class p1 implements Runnable {
    public final int f39017a;
    public final Object f39018b;
    public final Object f39019c;

    public p1(int i10, Object obj, Object obj2) {
        this.f39017a = i10;
        this.f39018b = obj;
        this.f39019c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f39018b;
        pa.b bVar = (pa.b) this.f39019c;
        synchronized (oVar) {
            try {
                if (oVar.f41463b == null) {
                    oVar.f41462a.add(bVar);
                } else {
                    oVar.f41463b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        u0 u0Var;
        pa.a aVar;
        int i10;
        switch (this.f39017a) {
            case 0:
                ((org.telegram.ui.k0) this.f39018b).f39083f0.run((Integer) this.f39019c);
                return;
            case 1:
                a2 a2Var = (a2) this.f39018b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.f39019c);
                a2Var.f26891a.Y2.N(true);
                return;
            case 2:
                h2 h2Var = (h2) this.f39018b;
                TLObject tLObject = (TLObject) this.f39019c;
                int i11 = h2Var.f38921a;
                h2Var.f38925g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    h2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            h2Var.h = tL_webPage;
                        }
                    }
                    h2Var.h = null;
                }
                TLRPC.WebPage webPage = h2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    h2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (u0Var = h2Var.f38929l) != null) {
                    u0Var.run();
                }
                h2Var.c();
                return;
            case 3:
                ((h2) this.f39018b).f38930m.remove((x81) this.f39019c);
                return;
            case 4:
                p2.b bVar = (p2.b) this.f39018b;
                bVar.f40657r = false;
                bVar.d((Uri) this.f39019c);
                return;
            case 5:
                pg.s0 s0Var = (pg.s0) this.f39018b;
                s0Var.v = true;
                RectF f7 = s0Var.f();
                Object obj = s0Var.f41220a.f15073b;
                s0Var.f41238w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f15368c, 0, f7);
                s0Var.a(false);
                ((pg.z0) this.f39019c).run();
                return;
            case 6:
                Runnable runnable = (Runnable) this.f39019c;
                pg.c1 c1Var = ((pg.e1) this.f39018b).d;
                if (c1Var != null && c1Var.f41076f) {
                    pg.c1.b(c1Var);
                    runnable.run();
                    return;
                }
                return;
            case 7:
                q9.p pVar = (q9.p) this.f39018b;
                pa.b bVar2 = (pa.b) this.f39019c;
                if (pVar.f41466b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f41465a;
                        pVar.f41465a = null;
                        pVar.f41466b = bVar2;
                    }
                    aVar.g(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 8:
                a();
                return;
            case 9:
                qg.x1 x1Var = (qg.x1) this.f39019c;
                x1Var.m();
                ((qg.m0) this.f39018b).r0(x1Var, true);
                return;
            case 10:
                ((qg.x1) this.f39018b).s((Bitmap) this.f39019c);
                return;
            case 11:
                qg.m2 m2Var = (qg.m2) this.f39018b;
                m2Var.G = false;
                qg.j2[] j2VarArr = (qg.j2[]) ((ArrayList) this.f39019c).toArray(new qg.j2[0]);
                m2Var.H = j2VarArr;
                if (j2VarArr.length > 0) {
                    m2Var.f41779b0.setScaleX(0.3f);
                    m2Var.f41779b0.setScaleY(0.3f);
                    m2Var.f41779b0.setAlpha(0.0f);
                    m2Var.f41779b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f27715f).start();
                    return;
                }
                return;
            case 12:
                CarResultStub.H0((Map.Entry) this.f39018b, this.f39019c);
                return;
            case 13:
                int i12 = JobInfoSchedulerService.f5951a;
                ((JobInfoSchedulerService) this.f39018b).jobFinished((JobParameters) this.f39019c, false);
                return;
            case 14:
                r9.a aVar2 = (r9.a) this.f39018b;
                Runnable runnable2 = (Runnable) this.f39019c;
                Process.setThreadPriority(aVar2.f42406c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 15:
                Callable callable = (Callable) this.f39018b;
                r9.h hVar = (r9.h) ((n2.e) this.f39019c).f15073b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 16:
                rg.j0 j0Var = (rg.j0) this.f39018b;
                TLObject tLObject2 = (TLObject) this.f39019c;
                ArrayList arrayList = j0Var.f42572i0;
                wl0 wl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f42576n0 + 4);
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
                    if (j0Var.f42575l0 >= 0 && i10 != 0) {
                        ((s4.c0) wl0Var.getLayoutManager()).h1(j0Var.f42575l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2349b);
                j0Var.f42586x0.g(max, false);
                j0Var.f42586x0.setBagePosition(max / j0Var.M0.f2350c);
                rg.h0 h0Var = j0Var.f42586x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 17:
                ((rg.j0) this.f39018b).m1((o90) this.f39019c, true);
                return;
            case 18:
                rg.z1 z1Var = (rg.z1) this.f39018b;
                AndroidUtilities.runOnUIThread(new p1(19, z1Var, FileLoader.getInstance(z1Var.f42827s).getPathToAttach((TLRPC.Document) this.f39019c)));
                return;
            case 19:
                rg.z1 z1Var2 = (rg.z1) this.f39018b;
                z1Var2.e = (File) this.f39019c;
                z1Var2.a();
                return;
            case 20:
                rf.b bVar3 = (rf.b) this.f39019c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f39018b).e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 21:
                ((tg.w0) this.f39018b).run((ArrayList) this.f39019c);
                return;
            case 22:
                ((tg.v) this.f39018b).run((TLRPC.TL_error) this.f39019c);
                return;
            case 23:
                ((nj0) this.f39018b).run((ArrayList) this.f39019c);
                return;
            case 24:
                Utilities.Callback callback = (Utilities.Callback) this.f39019c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f39018b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 25:
                qc M = xc.a0((zn) this.f39018b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f39019c).stars)), R.raw.stars_send);
                M.f27550j = 5000;
                M.k(true);
                return;
            case 26:
                tg.a0 a0Var = (tg.a0) this.f39018b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f43322b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f39019c);
                return;
            case 27:
                tg.m1.P((tg.m1) this.f39018b, (TLObject) this.f39019c);
                return;
            case 28:
                ((e2.h) this.f39018b).accept(this.f39019c);
                return;
            default:
                ((u2.u0) this.f39018b).A((c3.b0) this.f39019c);
                return;
        }
    }
}
