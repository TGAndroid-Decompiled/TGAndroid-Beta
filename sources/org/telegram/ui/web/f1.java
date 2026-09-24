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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bt;
import org.telegram.ui.wn;
public final class f1 implements Runnable {
    public final int f39043a;
    public final Object f39044b;
    public final Object f39045c;

    public f1(int i10, Object obj, Object obj2) {
        this.f39043a = i10;
        this.f39044b = obj;
        this.f39045c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f39044b;
        pa.b bVar = (pa.b) this.f39045c;
        synchronized (oVar) {
            try {
                if (oVar.f41477b == null) {
                    oVar.f41476a.add(bVar);
                } else {
                    oVar.f41477b.add(bVar.get());
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
        switch (this.f39043a) {
            case 0:
                h1 h1Var = ((g1) this.f39044b).h;
                ArrayList arrayList = h1Var.f39069f;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f39045c);
                h1Var.h = false;
                l61 l61Var = h1Var.f26364a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f39044b;
                if (((g2) this.f39045c).b() != null) {
                    z10 = true;
                }
                e1Var.setEnabled(z10);
                ViewPropertyAnimator animate = e1Var.animate();
                if (!e1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 2:
                ((org.telegram.ui.l0) this.f39044b).f39220f0.run((Integer) this.f39045c);
                return;
            case 3:
                z1 z1Var = (z1) this.f39044b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.f39045c);
                z1Var.f26364a.Y2.N(true);
                return;
            case 4:
                g2 g2Var = (g2) this.f39044b;
                TLObject tLObject = (TLObject) this.f39045c;
                int i11 = g2Var.f39050a;
                g2Var.f39054g = true;
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
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (q0Var = g2Var.f39058l) != null) {
                    q0Var.run();
                }
                g2Var.c();
                return;
            case 5:
                ((g2) this.f39044b).f39059m.remove((f1) this.f39045c);
                return;
            case 6:
                p2.b bVar = (p2.b) this.f39044b;
                bVar.f40657r = false;
                bVar.d((Uri) this.f39045c);
                return;
            case 7:
                pg.s0 s0Var = (pg.s0) this.f39044b;
                s0Var.v = true;
                RectF f10 = s0Var.f();
                Object obj = s0Var.f41207a.f15101b;
                s0Var.f41225w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f15396c, 0, f10);
                s0Var.a(false);
                ((pg.z0) this.f39045c).run();
                return;
            case 8:
                Runnable runnable = (Runnable) this.f39045c;
                pg.d1 d1Var = ((pg.f1) this.f39044b).d;
                if (d1Var != null && d1Var.f41078f) {
                    pg.d1.b(d1Var);
                    runnable.run();
                    return;
                }
                return;
            case 9:
                q9.p pVar = (q9.p) this.f39044b;
                pa.b bVar2 = (pa.b) this.f39045c;
                if (pVar.f41480b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f41479a;
                        pVar.f41479a = null;
                        pVar.f41480b = bVar2;
                    }
                    aVar.g(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 10:
                a();
                return;
            case 11:
                qg.y1 y1Var = (qg.y1) this.f39045c;
                y1Var.m();
                ((qg.n0) this.f39044b).s0(y1Var, true);
                return;
            case 12:
                ((qg.y1) this.f39044b).s((Bitmap) this.f39045c);
                return;
            case 13:
                qg.n2 n2Var = (qg.n2) this.f39044b;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) ((ArrayList) this.f39045c).toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f41798b0.setScaleX(0.3f);
                    n2Var.f41798b0.setScaleY(0.3f);
                    n2Var.f41798b0.setAlpha(0.0f);
                    n2Var.f41798b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(rr.f28022f).start();
                    return;
                }
                return;
            case 14:
                CarResultStub.H0((Map.Entry) this.f39044b, this.f39045c);
                return;
            case 15:
                int i12 = JobInfoSchedulerService.f5934a;
                ((JobInfoSchedulerService) this.f39044b).jobFinished((JobParameters) this.f39045c, false);
                return;
            case 16:
                r9.a aVar2 = (r9.a) this.f39044b;
                Runnable runnable2 = (Runnable) this.f39045c;
                Process.setThreadPriority(aVar2.f42422c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.f39044b;
                r9.h hVar = (r9.h) ((n2.e) this.f39045c).f15101b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 18:
                rg.j0 j0Var = (rg.j0) this.f39044b;
                TLObject tLObject2 = (TLObject) this.f39045c;
                ArrayList arrayList2 = j0Var.f42588i0;
                wl0 wl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f42592n0 + 4);
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
                    if (j0Var.f42591l0 >= 0 && i10 != 0) {
                        ((s4.c0) wl0Var.getLayoutManager()).h1(j0Var.f42591l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.f2341b);
                j0Var.f42602x0.g(max, false);
                j0Var.f42602x0.setBagePosition(max / j0Var.M0.f2342c);
                rg.h0 h0Var = j0Var.f42602x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 19:
                ((rg.j0) this.f39044b).m1((q90) this.f39045c, true);
                return;
            case 20:
                rg.z1 z1Var2 = (rg.z1) this.f39044b;
                AndroidUtilities.runOnUIThread(new f1(21, z1Var2, FileLoader.getInstance(z1Var2.f42843s).getPathToAttach((TLRPC.Document) this.f39045c)));
                return;
            case 21:
                rg.z1 z1Var3 = (rg.z1) this.f39044b;
                z1Var3.e = (File) this.f39045c;
                z1Var3.a();
                return;
            case 22:
                rf.b bVar3 = (rf.b) this.f39045c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f39044b).e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((tg.w0) this.f39044b).run((ArrayList) this.f39045c);
                return;
            case 24:
                ((tg.v) this.f39044b).run((TLRPC.TL_error) this.f39045c);
                return;
            case 25:
                ((bt) this.f39044b).run((ArrayList) this.f39045c);
                return;
            case 26:
                Utilities.Callback callback = (Utilities.Callback) this.f39045c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f39044b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 27:
                qc M = yc.a0((wn) this.f39044b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f39045c).stars)), R.raw.stars_send);
                M.f27571j = 5000;
                M.k(true);
                return;
            case 28:
                tg.a0 a0Var = (tg.a0) this.f39044b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f43338b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f39045c);
                return;
            default:
                tg.m1.P((tg.m1) this.f39044b, (TLObject) this.f39045c);
                return;
        }
    }
}
