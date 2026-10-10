package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
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
import m.f3;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ft;
import org.telegram.ui.ii1;
import org.telegram.ui.zn;
import qg.o2;
public final class w1 implements Runnable {
    public final int f43572a;
    public final Object f43573b;
    public final Object f43574c;

    public w1(int i10, Object obj, Object obj2) {
        this.f43572a = i10;
        this.f43573b = obj;
        this.f43574c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f43573b;
        pa.b bVar = (pa.b) this.f43574c;
        synchronized (oVar) {
            try {
                if (oVar.f46081b == null) {
                    oVar.f46080a.add(bVar);
                } else {
                    oVar.f46081b.add(bVar.get());
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
        switch (this.f43572a) {
            case 0:
                z1 z1Var = (z1) this.f43573b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.f43574c);
                z1Var.f26629a.W2.N(true);
                return;
            case 1:
                g2 g2Var = (g2) this.f43573b;
                TLObject tLObject = (TLObject) this.f43574c;
                int i11 = g2Var.f43356a;
                g2Var.f43361g = true;
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
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (q0Var = g2Var.f43365l) != null) {
                    q0Var.run();
                }
                g2Var.c();
                return;
            case 2:
                ((g2) this.f43573b).f43366m.remove((ii1) this.f43574c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.f43573b;
                bVar.f45213r = false;
                bVar.d((Uri) this.f43574c);
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.f43573b;
                s0Var.v = true;
                RectF f7 = s0Var.f();
                Object obj = s0Var.f45799a.f15672b;
                s0Var.f45818w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f16722c, 0, f7);
                s0Var.a(false);
                ((pg.z0) this.f43574c).run();
                return;
            case 5:
                Runnable runnable = (Runnable) this.f43574c;
                pg.c1 c1Var = ((pg.e1) this.f43573b).d;
                if (c1Var != null && c1Var.f45646f) {
                    pg.c1.b(c1Var);
                    runnable.run();
                    return;
                }
                return;
            case 6:
                q9.p pVar = (q9.p) this.f43573b;
                pa.b bVar2 = (pa.b) this.f43574c;
                if (pVar.f46084b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f46083a;
                        pVar.f46083a = null;
                        pVar.f46084b = bVar2;
                    }
                    aVar.g(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 7:
                a();
                return;
            case 8:
                qg.y1 y1Var = (qg.y1) this.f43574c;
                y1Var.m();
                ((qg.m0) this.f43573b).s0(y1Var, true);
                return;
            case 9:
                ((qg.y1) this.f43573b).s((Bitmap) this.f43574c);
                return;
            case 10:
                o2 o2Var = (o2) this.f43573b;
                o2Var.G = false;
                qg.l2[] l2VarArr = (qg.l2[]) ((ArrayList) this.f43574c).toArray(new qg.l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.f46520b0.setScaleX(0.3f);
                    o2Var.f46520b0.setScaleY(0.3f);
                    o2Var.f46520b0.setAlpha(0.0f);
                    o2Var.f46520b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(is.f27443f).start();
                    return;
                }
                return;
            case 11:
                CarResultStub.G0((Map.Entry) this.f43573b, this.f43574c);
                return;
            case 12:
                int i12 = JobInfoSchedulerService.f6447a;
                ((JobInfoSchedulerService) this.f43573b).jobFinished((JobParameters) this.f43574c, false);
                return;
            case 13:
                r9.a aVar2 = (r9.a) this.f43573b;
                Runnable runnable2 = (Runnable) this.f43574c;
                Process.setThreadPriority(aVar2.f47145c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 14:
                Callable callable = (Callable) this.f43573b;
                r9.h hVar = (r9.h) ((f3) this.f43574c).f15672b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar.l(e7);
                    return;
                }
            case 15:
                rg.j0 j0Var = (rg.j0) this.f43573b;
                TLObject tLObject2 = (TLObject) this.f43574c;
                ArrayList arrayList = j0Var.f47326i0;
                rm0 rm0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f47330n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < rm0Var.getChildCount()) {
                            if (rm0Var.getChildAt(i13) instanceof rg.i0) {
                                i10 = rm0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.N1();
                    if (j0Var.f47329l0 >= 0 && i10 != 0) {
                        ((s4.d0) rm0Var.getLayoutManager()).h1(j0Var.f47329l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2617b);
                j0Var.f47340x0.g(max, false);
                j0Var.f47340x0.setBagePosition(max / j0Var.M0.f2618c);
                rg.h0 h0Var = j0Var.f47340x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 16:
                ((rg.j0) this.f43573b).n1((ia0) this.f43574c, true);
                return;
            case 17:
                rg.a2 a2Var = (rg.a2) this.f43573b;
                AndroidUtilities.runOnUIThread(new w1(18, a2Var, FileLoader.getInstance(a2Var.f47241s).getPathToAttach((TLRPC.Document) this.f43574c)));
                return;
            case 18:
                rg.a2 a2Var2 = (rg.a2) this.f43573b;
                a2Var2.f47237e = (File) this.f43574c;
                a2Var2.a();
                return;
            case 19:
                ((sg.f) this.f43573b).c((ArrayList) this.f43574c);
                return;
            case 20:
                sg.p pVar2 = (sg.p) this.f43573b;
                sg.r rVar = (sg.r) this.f43574c;
                pVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar2.f48172i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar2.f48174k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar2.f48173j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar2.f48172i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar2.f48170f.length == 0) {
                            pVar2.b();
                        }
                    }
                    rVar.f48186b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.f48186b.release();
                    throw th2;
                }
            case 21:
                sf.b bVar3 = (sf.b) this.f43574c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f43573b).f6957e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 22:
                ((tg.w0) this.f43573b).run((ArrayList) this.f43574c);
                return;
            case 23:
                ((tg.v) this.f43573b).run((TLRPC.TL_error) this.f43574c);
                return;
            case 24:
                ((ft) this.f43573b).run((ArrayList) this.f43574c);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.f43574c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f43573b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 26:
                tc M = ad.a0((zn) this.f43573b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f43574c).stars)), R.raw.stars_send);
                M.f31096j = 5000;
                M.k(true);
                return;
            case 27:
                tg.a0 a0Var = (tg.a0) this.f43573b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f48311b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f43574c);
                return;
            case 28:
                tg.m1.Q((tg.m1) this.f43573b, (TLObject) this.f43574c);
                return;
            default:
                ((e2.h) this.f43573b).accept(this.f43574c);
                return;
        }
    }
}
