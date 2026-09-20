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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.pj0;
import org.telegram.ui.zn;
public final class g1 implements Runnable {
    public final int f38904a;
    public final Object f38905b;
    public final Object f38906c;

    public g1(int i10, Object obj, Object obj2) {
        this.f38904a = i10;
        this.f38905b = obj;
        this.f38906c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f38905b;
        pa.b bVar = (pa.b) this.f38906c;
        synchronized (oVar) {
            try {
                if (oVar.f41504b == null) {
                    oVar.f41503a.add(bVar);
                } else {
                    oVar.f41504b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        r0 r0Var;
        pa.a aVar;
        int i10;
        float f7 = 1.0f;
        boolean z10 = false;
        switch (this.f38904a) {
            case 0:
                i1 i1Var = ((h1) this.f38905b).h;
                ArrayList arrayList = i1Var.h;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f38906c);
                i1Var.f38935n = false;
                m61 m61Var = i1Var.f26598a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f38905b;
                if (((h2) this.f38906c).b() != null) {
                    z10 = true;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 2:
                ((org.telegram.ui.k0) this.f38905b).f39083f0.run((Integer) this.f38906c);
                return;
            case 3:
                a2 a2Var = (a2) this.f38905b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.f38906c);
                a2Var.f26598a.Y2.N(true);
                return;
            case 4:
                h2 h2Var = (h2) this.f38905b;
                TLObject tLObject = (TLObject) this.f38906c;
                int i11 = h2Var.f38918a;
                h2Var.f38922g = true;
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
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (r0Var = h2Var.f38926l) != null) {
                    r0Var.run();
                }
                h2Var.c();
                return;
            case 5:
                ((h2) this.f38905b).f38927m.remove((g1) this.f38906c);
                return;
            case 6:
                p2.b bVar = (p2.b) this.f38905b;
                bVar.f40698r = false;
                bVar.d((Uri) this.f38906c);
                return;
            case 7:
                pg.s0 s0Var = (pg.s0) this.f38905b;
                s0Var.v = true;
                RectF f10 = s0Var.f();
                Object obj = s0Var.f41261a.f15112b;
                s0Var.f41279w = new a5.a((ByteBuffer) s0Var.h(s0Var.f(), true, false, false).f20270c, 0, f10);
                s0Var.a(false);
                ((pg.z0) this.f38906c).run();
                return;
            case 8:
                Runnable runnable = (Runnable) this.f38906c;
                pg.c1 c1Var = ((pg.e1) this.f38905b).d;
                if (c1Var != null && c1Var.f41117f) {
                    pg.c1.b(c1Var);
                    runnable.run();
                    return;
                }
                return;
            case 9:
                q9.q qVar = (q9.q) this.f38905b;
                pa.b bVar2 = (pa.b) this.f38906c;
                if (qVar.f41508b == q9.q.d) {
                    synchronized (qVar) {
                        aVar = qVar.f41507a;
                        qVar.f41507a = null;
                        qVar.f41508b = bVar2;
                    }
                    aVar.f(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 10:
                a();
                return;
            case 11:
                qg.y1 y1Var = (qg.y1) this.f38906c;
                y1Var.m();
                ((qg.n0) this.f38905b).r0(y1Var, true);
                return;
            case 12:
                ((qg.y1) this.f38905b).s((Bitmap) this.f38906c);
                return;
            case 13:
                qg.n2 n2Var = (qg.n2) this.f38905b;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) ((ArrayList) this.f38906c).toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f41826b0.setScaleX(0.3f);
                    n2Var.f41826b0.setScaleY(0.3f);
                    n2Var.f41826b0.setAlpha(0.0f);
                    n2Var.f41826b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f27642f).start();
                    return;
                }
                return;
            case 14:
                CarResultStub.H0((Map.Entry) this.f38905b, this.f38906c);
                return;
            case 15:
                int i12 = JobInfoSchedulerService.f5952a;
                ((JobInfoSchedulerService) this.f38905b).jobFinished((JobParameters) this.f38906c, false);
                return;
            case 16:
                r9.a aVar2 = (r9.a) this.f38905b;
                Runnable runnable2 = (Runnable) this.f38906c;
                Process.setThreadPriority(aVar2.f42450c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.f38905b;
                r9.h hVar = (r9.h) ((n2.e) this.f38906c).f15112b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 18:
                rg.j0 j0Var = (rg.j0) this.f38905b;
                TLObject tLObject2 = (TLObject) this.f38906c;
                ArrayList arrayList2 = j0Var.f42616i0;
                vl0 vl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f42620n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < vl0Var.getChildCount()) {
                            if (vl0Var.getChildAt(i13) instanceof rg.i0) {
                                i10 = vl0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.f42619l0 >= 0 && i10 != 0) {
                        ((s4.c0) vl0Var.getLayoutManager()).h1(j0Var.f42619l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.f2349b);
                j0Var.f42630x0.g(max, false);
                j0Var.f42630x0.setBagePosition(max / j0Var.M0.f2350c);
                rg.h0 h0Var = j0Var.f42630x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 19:
                ((rg.j0) this.f38905b).m1((n90) this.f38906c, true);
                return;
            case 20:
                rg.z1 z1Var = (rg.z1) this.f38905b;
                AndroidUtilities.runOnUIThread(new g1(21, z1Var, FileLoader.getInstance(z1Var.f42871s).getPathToAttach((TLRPC.Document) this.f38906c)));
                return;
            case 21:
                rg.z1 z1Var2 = (rg.z1) this.f38905b;
                z1Var2.e = (File) this.f38906c;
                z1Var2.a();
                return;
            case 22:
                rf.b bVar3 = (rf.b) this.f38906c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f38905b).e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((tg.w0) this.f38905b).run((ArrayList) this.f38906c);
                return;
            case 24:
                ((tg.v) this.f38905b).run((TLRPC.TL_error) this.f38906c);
                return;
            case 25:
                ((pj0) this.f38905b).run((ArrayList) this.f38906c);
                return;
            case 26:
                Utilities.Callback callback = (Utilities.Callback) this.f38906c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f38905b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 27:
                pc M = xc.a0((zn) this.f38905b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f38906c).stars)), R.raw.stars_send);
                M.f27252j = 5000;
                M.k(true);
                return;
            case 28:
                tg.a0 a0Var = (tg.a0) this.f38905b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f43366b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f38906c);
                return;
            default:
                tg.m1.P((tg.m1) this.f38905b, (TLObject) this.f38906c);
                return;
        }
    }
}
