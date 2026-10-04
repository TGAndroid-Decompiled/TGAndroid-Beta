package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ft;
import org.telegram.ui.g91;
import org.telegram.ui.yn;
public final class x1 implements Runnable {
    public final int f42412a;
    public final Object f42413b;
    public final Object f42414c;

    public x1(int i10, Object obj, Object obj2) {
        this.f42412a = i10;
        this.f42413b = obj;
        this.f42414c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f42413b;
        pa.b bVar = (pa.b) this.f42414c;
        synchronized (oVar) {
            try {
                if (oVar.f44866b == null) {
                    oVar.f44865a.add(bVar);
                } else {
                    oVar.f44866b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x1.b():void");
    }

    @Override
    public final void run() {
        u0 u0Var;
        pa.a aVar;
        int i10;
        switch (this.f42412a) {
            case 0:
                a2 a2Var = (a2) this.f42413b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.f42414c);
                a2Var.f32724a.f25244f3.N(true);
                return;
            case 1:
                h2 h2Var = (h2) this.f42413b;
                TLObject tLObject = (TLObject) this.f42414c;
                int i11 = h2Var.f42204a;
                h2Var.f42209g = true;
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
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (u0Var = h2Var.f42213l) != null) {
                    u0Var.run();
                }
                h2Var.c();
                return;
            case 2:
                ((h2) this.f42413b).f42214m.remove((g91) this.f42414c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.f42413b;
                bVar.f43988r = false;
                bVar.d((Uri) this.f42414c);
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.f42413b;
                s0Var.v = true;
                RectF f7 = s0Var.f();
                Object obj = s0Var.f44582a.f15266b;
                s0Var.f44601w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f16847c, 0, f7);
                s0Var.a(false);
                ((pg.z0) this.f42414c).run();
                return;
            case 5:
                Runnable runnable = (Runnable) this.f42414c;
                pg.d1 d1Var = ((pg.f1) this.f42413b).d;
                if (d1Var != null && d1Var.f44444f) {
                    pg.d1.b(d1Var);
                    runnable.run();
                    return;
                }
                return;
            case 6:
                q9.p pVar = (q9.p) this.f42413b;
                pa.b bVar2 = (pa.b) this.f42414c;
                if (pVar.f44869b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f44868a;
                        pVar.f44868a = null;
                        pVar.f44869b = bVar2;
                    }
                    aVar.f(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 7:
                a();
                return;
            case 8:
                qg.x1 x1Var = (qg.x1) this.f42414c;
                x1Var.m();
                ((qg.m0) this.f42413b).s0(x1Var, true);
                return;
            case 9:
                ((qg.x1) this.f42413b).s((Bitmap) this.f42414c);
                return;
            case 10:
                qg.n2 n2Var = (qg.n2) this.f42413b;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) ((ArrayList) this.f42414c).toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f45212b0.setScaleX(0.3f);
                    n2Var.f45212b0.setScaleY(0.3f);
                    n2Var.f45212b0.setAlpha(0.0f);
                    n2Var.f45212b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(tr.f31140f).start();
                    return;
                }
                return;
            case 11:
                b();
                return;
            case 12:
                qi.j jVar = (qi.j) this.f42413b;
                String str = (String) this.f42414c;
                jVar.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar.k(decode);
                        return;
                    }
                    jVar.f();
                    return;
                } catch (IllegalArgumentException e7) {
                    FileLog.e(e7);
                    jVar.f();
                    return;
                }
            case 13:
                ((qi.j) this.f42413b).k((byte[]) this.f42414c);
                return;
            case 14:
                CarResultStub.H0((Map.Entry) this.f42413b, this.f42414c);
                return;
            case 15:
                int i12 = JobInfoSchedulerService.f6394a;
                ((JobInfoSchedulerService) this.f42413b).jobFinished((JobParameters) this.f42414c, false);
                return;
            case 16:
                r9.a aVar2 = (r9.a) this.f42413b;
                Runnable runnable2 = (Runnable) this.f42414c;
                Process.setThreadPriority(aVar2.f45934c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.f42413b;
                r9.h hVar = (r9.h) ((k2.e) this.f42414c).f14388b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 18:
                rg.k0 k0Var = (rg.k0) this.f42413b;
                TLObject tLObject2 = (TLObject) this.f42414c;
                ArrayList arrayList = k0Var.f46151i0;
                zl0 zl0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.f46155n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < zl0Var.getChildCount()) {
                            if (zl0Var.getChildAt(i13) instanceof rg.j0) {
                                i10 = zl0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.f46154l0 >= 0 && i10 != 0) {
                        ((s4.c0) zl0Var.getLayoutManager()).h1(k0Var.f46154l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), k0Var.M0.f2538b);
                k0Var.f46165x0.g(max, false);
                k0Var.f46165x0.setBagePosition(max / k0Var.M0.f2539c);
                rg.i0 i0Var = k0Var.f46165x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((rg.k0) this.f42413b).m1((t90) this.f42414c, true);
                return;
            case 20:
                rg.b2 b2Var = (rg.b2) this.f42413b;
                AndroidUtilities.runOnUIThread(new x1(21, b2Var, FileLoader.getInstance(b2Var.f46069s).getPathToAttach((TLRPC.Document) this.f42414c)));
                return;
            case 21:
                rg.b2 b2Var2 = (rg.b2) this.f42413b;
                b2Var2.f46065e = (File) this.f42414c;
                b2Var2.a();
                return;
            case 22:
                rf.b bVar3 = (rf.b) this.f42414c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f42413b).f6950e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((tg.w0) this.f42413b).run((ArrayList) this.f42414c);
                return;
            case 24:
                ((tg.v) this.f42413b).run((TLRPC.TL_error) this.f42414c);
                return;
            case 25:
                ((ft) this.f42413b).run((ArrayList) this.f42414c);
                return;
            case 26:
                Utilities.Callback callback = (Utilities.Callback) this.f42414c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f42413b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 27:
                rc M = yc.a0((yn) this.f42413b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f42414c).stars)), R.raw.stars_send);
                M.f30338j = 5000;
                M.k(true);
                return;
            case 28:
                tg.a0 a0Var = (tg.a0) this.f42413b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f46951b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f42414c);
                return;
            default:
                tg.m1.N((tg.m1) this.f42413b, (TLObject) this.f42414c);
                return;
        }
    }
}
