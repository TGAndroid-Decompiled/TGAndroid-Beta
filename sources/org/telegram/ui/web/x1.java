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
import org.telegram.ui.e91;
import org.telegram.ui.ft;
import org.telegram.ui.yn;
public final class x1 implements Runnable {
    public final int f42432a;
    public final Object f42433b;
    public final Object f42434c;

    public x1(int i10, Object obj, Object obj2) {
        this.f42432a = i10;
        this.f42433b = obj;
        this.f42434c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f42433b;
        pa.b bVar = (pa.b) this.f42434c;
        synchronized (oVar) {
            try {
                if (oVar.f44881b == null) {
                    oVar.f44880a.add(bVar);
                } else {
                    oVar.f44881b.add(bVar.get());
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
        switch (this.f42432a) {
            case 0:
                a2 a2Var = (a2) this.f42433b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.f42434c);
                a2Var.f33438a.f26034f3.N(true);
                return;
            case 1:
                h2 h2Var = (h2) this.f42433b;
                TLObject tLObject = (TLObject) this.f42434c;
                int i11 = h2Var.f42224a;
                h2Var.f42229g = true;
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
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (u0Var = h2Var.f42233l) != null) {
                    u0Var.run();
                }
                h2Var.c();
                return;
            case 2:
                ((h2) this.f42433b).f42234m.remove((e91) this.f42434c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.f42433b;
                bVar.f44003r = false;
                bVar.d((Uri) this.f42434c);
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.f42433b;
                s0Var.v = true;
                RectF f7 = s0Var.f();
                Object obj = s0Var.f44597a.f15268b;
                s0Var.f44616w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f16857c, 0, f7);
                s0Var.a(false);
                ((pg.z0) this.f42434c).run();
                return;
            case 5:
                Runnable runnable = (Runnable) this.f42434c;
                pg.d1 d1Var = ((pg.f1) this.f42433b).d;
                if (d1Var != null && d1Var.f44459f) {
                    pg.d1.b(d1Var);
                    runnable.run();
                    return;
                }
                return;
            case 6:
                q9.p pVar = (q9.p) this.f42433b;
                pa.b bVar2 = (pa.b) this.f42434c;
                if (pVar.f44884b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f44883a;
                        pVar.f44883a = null;
                        pVar.f44884b = bVar2;
                    }
                    aVar.f(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 7:
                a();
                return;
            case 8:
                qg.x1 x1Var = (qg.x1) this.f42434c;
                x1Var.m();
                ((qg.m0) this.f42433b).s0(x1Var, true);
                return;
            case 9:
                ((qg.x1) this.f42433b).s((Bitmap) this.f42434c);
                return;
            case 10:
                qg.n2 n2Var = (qg.n2) this.f42433b;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) ((ArrayList) this.f42434c).toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f45227b0.setScaleX(0.3f);
                    n2Var.f45227b0.setScaleY(0.3f);
                    n2Var.f45227b0.setAlpha(0.0f);
                    n2Var.f45227b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(tr.f31215f).start();
                    return;
                }
                return;
            case 11:
                b();
                return;
            case 12:
                qi.j jVar = (qi.j) this.f42433b;
                String str = (String) this.f42434c;
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
                ((qi.j) this.f42433b).k((byte[]) this.f42434c);
                return;
            case 14:
                CarResultStub.H0((Map.Entry) this.f42433b, this.f42434c);
                return;
            case 15:
                int i12 = JobInfoSchedulerService.f6395a;
                ((JobInfoSchedulerService) this.f42433b).jobFinished((JobParameters) this.f42434c, false);
                return;
            case 16:
                r9.a aVar2 = (r9.a) this.f42433b;
                Runnable runnable2 = (Runnable) this.f42434c;
                Process.setThreadPriority(aVar2.f45949c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.f42433b;
                r9.h hVar = (r9.h) ((k2.e) this.f42434c).f14389b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 18:
                rg.k0 k0Var = (rg.k0) this.f42433b;
                TLObject tLObject2 = (TLObject) this.f42434c;
                ArrayList arrayList = k0Var.f46166i0;
                zl0 zl0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.f46170n0 + 4);
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
                    if (k0Var.f46169l0 >= 0 && i10 != 0) {
                        ((s4.c0) zl0Var.getLayoutManager()).h1(k0Var.f46169l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), k0Var.M0.f2538b);
                k0Var.f46180x0.g(max, false);
                k0Var.f46180x0.setBagePosition(max / k0Var.M0.f2539c);
                rg.i0 i0Var = k0Var.f46180x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((rg.k0) this.f42433b).m1((t90) this.f42434c, true);
                return;
            case 20:
                rg.b2 b2Var = (rg.b2) this.f42433b;
                AndroidUtilities.runOnUIThread(new x1(21, b2Var, FileLoader.getInstance(b2Var.f46084s).getPathToAttach((TLRPC.Document) this.f42434c)));
                return;
            case 21:
                rg.b2 b2Var2 = (rg.b2) this.f42433b;
                b2Var2.f46080e = (File) this.f42434c;
                b2Var2.a();
                return;
            case 22:
                rf.b bVar3 = (rf.b) this.f42434c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f42433b).f6951e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((tg.w0) this.f42433b).run((ArrayList) this.f42434c);
                return;
            case 24:
                ((tg.v) this.f42433b).run((TLRPC.TL_error) this.f42434c);
                return;
            case 25:
                ((ft) this.f42433b).run((ArrayList) this.f42434c);
                return;
            case 26:
                Utilities.Callback callback = (Utilities.Callback) this.f42434c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f42433b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 27:
                rc M = yc.a0((yn) this.f42433b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f42434c).stars)), R.raw.stars_send);
                M.f30427j = 5000;
                M.k(true);
                return;
            case 28:
                tg.a0 a0Var = (tg.a0) this.f42433b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f46966b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f42434c);
                return;
            default:
                tg.m1.N((tg.m1) this.f42433b, (TLObject) this.f42434c);
                return;
        }
    }
}
