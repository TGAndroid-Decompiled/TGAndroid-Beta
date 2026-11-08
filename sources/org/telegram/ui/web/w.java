package org.telegram.ui.web;

import a8.ia;
import a8.wa;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.LongSparseArray;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.car.app.hardware.common.CarResultStub;
import c8.xa;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import fi.u2;
import fi.w3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.c20;
import org.telegram.messenger.df;
import org.telegram.messenger.fl;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import tg.c2;
public final class w implements Runnable {
    public final int f51347a;
    public final Object f51348b;
    public final Object f51349c;

    public w(int i7, Object obj, Object obj2) {
        this.f51347a = i7;
        this.f51349c = obj;
        this.f51348b = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.f51349c;
        w wVar = (w) this.f51348b;
        cVar.f56223c.i();
        u2.f fVar = cVar.f56222b;
        synchronized (fVar.f56236a) {
            fVar.b();
            wVar.run();
        }
    }

    @Override
    public final void run() {
        x0 x0Var;
        d0 d0Var;
        m5 m5Var;
        e2.o0 o0Var;
        e2.e eVar;
        g2.d dVar;
        int i7;
        boolean z9;
        e2.s1 s1Var;
        p4.m1 m1Var;
        ua.a aVar;
        float f10 = 1.0f;
        SurfaceTexture surfaceTexture = null;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f51347a) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f51349c;
                ArrayList arrayList = (ArrayList) this.f51348b;
                if (botWebViewContainer$BotWebViewProxy != null && (x0Var = botWebViewContainer$BotWebViewProxy.f51078a) != null && (d0Var = x0Var.f51364c) != null) {
                    d0Var.f(arrayList);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f51348b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f51349c;
                xa.f5955c.addAll(0, arrayList2);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    xa.d.put(longSparseArray.keyAt(i11), (y0) longSparseArray.valueAt(i11));
                }
                xa.f5954b = true;
                xa.f5953a = false;
                ArrayList arrayList3 = xa.f5956e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        ((c20) obj).a(arrayList2);
                    }
                    xa.f5956e = null;
                    return;
                }
                return;
            case 2:
                z0 z0Var = (z0) ((u2) this.f51349c).f12884c;
                ArrayList arrayList4 = z0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f51348b);
                z0Var.f51413n = false;
                w3 w3Var = z0Var.f36243a;
                if (w3Var != null) {
                    w3Var.f37190f3.O(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) this.f51349c;
                if (((u1) this.f51348b).b() == null) {
                    z10 = false;
                }
                z0Var2.setEnabled(z10);
                ViewPropertyAnimator animate = z0Var2.animate();
                if (!z0Var2.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 4:
                ((org.telegram.ui.l0) this.f51349c).f51196f0.a((Integer) this.f51348b);
                return;
            case 5:
                o1 o1Var = (o1) this.f51349c;
                qp messagesController = o1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) this.f51348b;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new fl(messagesController, 3));
                o1Var.f36243a.f37190f3.O(true);
                return;
            case 6:
                u1 u1Var = (u1) this.f51349c;
                TLObject tLObject = (TLObject) this.f51348b;
                int i12 = u1Var.f51326a;
                u1Var.f51331g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    qp.s1(i12).Y3(tL_messages_webPage.users, false);
                    qp.s1(i12).S3(tL_messages_webPage.chats, false);
                    u1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            u1Var.h = tL_webPage;
                        }
                    }
                    u1Var.h = null;
                }
                TLRPC.WebPage webPage = u1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    u1Var.h = null;
                }
                if (!iz.f23446w0 && u1Var.h != null && (m5Var = u1Var.f51335l) != null) {
                    m5Var.run();
                }
                u1Var.c();
                return;
            case 7:
                ((u1) this.f51349c).f51336m.remove((w) this.f51348b);
                return;
            case 8:
                ((p4.d0) this.f51349c).getClass();
                ((Runnable) this.f51348b).run();
                return;
            case 9:
                p4.d0 d0Var2 = (p4.d0) this.f51349c;
                p4.g1 g1Var = (p4.g1) this.f51348b;
                p4.m0 m0Var = d0Var2.h;
                d0Var2.f53217t = g1Var;
                df dfVar = new df(d0Var2, g1Var);
                g1Var.I0(dfVar);
                d0Var2.f53218u = dfVar;
                try {
                    m0Var.f53365j.p(0, g1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.f53369n.f53803b).f53785a.setActive(true);
                e2.v0 W = g1Var.W();
                p4.l1 R0 = g1Var.R0();
                e2.b1 Q0 = g1Var.Q0();
                e2.b1 Q02 = g1Var.Q0();
                e2.w0 j3 = g1Var.j();
                int m10 = g1Var.m();
                boolean D0 = g1Var.D0();
                e2.x1 C = g1Var.C();
                e2.l1 T0 = g1Var.T0();
                if (g1Var.p0(18)) {
                    o0Var = g1Var.k0();
                } else {
                    o0Var = e2.o0.L;
                }
                e2.o0 o0Var2 = o0Var;
                if (g1Var.p0(22)) {
                    f10 = g1Var.F();
                }
                float f11 = f10;
                if (g1Var.p0(21)) {
                    eVar = g1Var.H();
                } else {
                    eVar = e2.e.f10215i;
                }
                e2.e eVar2 = eVar;
                if (g1Var.p0(28)) {
                    dVar = g1Var.l0();
                } else {
                    dVar = g2.d.d;
                }
                g2.d dVar2 = dVar;
                e2.o K = g1Var.K();
                if (g1Var.p0(23)) {
                    i7 = g1Var.n();
                } else {
                    i7 = 0;
                }
                if (g1Var.p0(23) && g1Var.z0()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean u10 = g1Var.u();
                int w02 = g1Var.w0();
                int i13 = g1Var.i();
                boolean h = g1Var.h();
                boolean g10 = g1Var.g();
                e2.o0 U0 = g1Var.U0();
                long O0 = g1Var.O0();
                long Z = g1Var.Z();
                long z11 = g1Var.z();
                if (g1Var.p0(30)) {
                    s1Var = g1Var.j0();
                } else {
                    s1Var = e2.s1.f10545b;
                }
                d0Var2.f53216s = new p4.e1(W, 0, R0, Q0, Q02, 0, j3, m10, D0, C, T0, 0, o0Var2, f11, 1.0f, eVar2, 0, dVar2, K, i7, z9, u10, 1, w02, i13, h, g10, U0, O0, Z, z11, s1Var, g1Var.E0());
                d0Var2.f(g1Var.t());
                return;
            case 10:
                ((c0.i) this.f51348b).a(Boolean.valueOf(((p4.d0) this.f51349c).o()));
                return;
            case 11:
                m9.w wVar = (m9.w) this.f51349c;
                ResultReceiver resultReceiver = (ResultReceiver) this.f51348b;
                try {
                    m1Var = (p4.m1) wVar.f20001a;
                    ia.k(m1Var, "SessionResult must not be null");
                } catch (InterruptedException e11) {
                    e = e11;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                } catch (CancellationException e12) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e12);
                    m1Var = new p4.m1(1);
                } catch (ExecutionException e13) {
                    e = e13;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                }
                resultReceiver.send(m1Var.f53383a, m1Var.f53384b);
                return;
            case 12:
                ui.e eVar3 = ((p4.c1) this.f51349c).f53183b;
                p4.v x10 = eVar3.x(((p4.l) this.f51348b).asBinder());
                if (x10 != null) {
                    eVar3.T(x10);
                    return;
                }
                return;
            case 13:
                ((p4.c1) this.f51349c).f53183b.q((p4.v) this.f51348b);
                return;
            case 14:
                q2.d dVar3 = (q2.d) this.f51349c;
                e2.u uVar = (e2.u) this.f51348b;
                q2.e eVar4 = dVar3.d;
                if (eVar4.E != 0 && !dVar3.f53718c) {
                    Looper looper = eVar4.I;
                    looper.getClass();
                    dVar3.f53717b = eVar4.b(looper, dVar3.f53716a, uVar, false);
                    eVar4.f53729y.add(dVar3);
                    return;
                }
                return;
            case 15:
                CarResultStub.i1((Map.Entry) this.f51349c, this.f51348b);
                return;
            case 16:
                rt rtVar = ((r2.p) this.f51349c).f54357c;
                Uri uri = ((r2.i) this.f51348b).f54318y;
                s2.c cVar = (s2.c) ((r2.j) rtVar.f37758b).f54320b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 17:
                s2.b bVar = (s2.b) this.f51349c;
                bVar.f54610s = false;
                bVar.b((Uri) this.f51348b);
                return;
            case 18:
                sg.j0 j0Var = (sg.j0) this.f51349c;
                j0Var.v = true;
                RectF f12 = j0Var.f();
                Object obj2 = j0Var.f55085a.f39747b;
                j0Var.f55104w = new wa((ByteBuffer) j0Var.h(j0Var.f(), true, false, false).f55068c, 0, f12);
                j0Var.a(false);
                ((sg.q0) this.f51348b).run();
                return;
            case 19:
                Runnable runnable = (Runnable) this.f51348b;
                sg.u0 u0Var = ((sg.w0) this.f51349c).d;
                if (u0Var != null && u0Var.f55213f) {
                    sg.u0.a(u0Var);
                    runnable.run();
                    return;
                }
                return;
            case 20:
                tg.n1 n1Var = (tg.n1) this.f51348b;
                n1Var.m();
                ((tg.g0) this.f51349c).r0(n1Var, true);
                return;
            case 21:
                ((tg.n1) this.f51349c).s((Bitmap) this.f51348b);
                return;
            case 22:
                c2 c2Var = (c2) this.f51349c;
                c2Var.G = false;
                tg.z1[] z1VarArr = (tg.z1[]) ((ArrayList) this.f51348b).toArray(new tg.z1[0]);
                c2Var.H = z1VarArr;
                if (z1VarArr.length > 0) {
                    c2Var.f55591b0.setScaleX(0.3f);
                    c2Var.f55591b0.setScaleY(0.3f);
                    c2Var.f55591b0.setAlpha(0.0f);
                    c2Var.f55591b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(xq.f40366f).start();
                    return;
                }
                return;
            case 23:
                ti.i iVar = (ti.i) this.f51349c;
                ti.p pVar = (ti.p) this.f51348b;
                ti.m mVar = iVar.f56082b;
                if (iVar.f56088j == pVar) {
                    ImageView imageView = iVar.f56090l;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        pVar.setFirstFrameCallback(new ti.b(iVar, 3));
                    }
                    if (mVar.L()) {
                        mVar.f();
                        return;
                    } else if (!mVar.h()) {
                        mVar.c(mVar.l());
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                ti.i iVar2 = (ti.i) this.f51349c;
                c20 c20Var = (c20) this.f51348b;
                iVar2.l();
                ti.p pVar2 = iVar2.f56088j;
                iVar2.f56088j = null;
                if (pVar2 != null) {
                    org.telegram.messenger.g0.E2(pVar2);
                    SurfaceTexture surfaceTexture2 = pVar2.f56128a;
                    pVar2.f56128a = null;
                    surfaceTexture = surfaceTexture2;
                }
                c20Var.a(surfaceTexture);
                return;
            case 25:
                ti.p pVar3 = (ti.p) this.f51349c;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.f51348b;
                if (pVar3.f56128a == surfaceTexture3 && pVar3.getSurfaceTexture() == null) {
                    pVar3.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                u2.r rVar = (u2.r) this.f51349c;
                rVar.T.set(rVar.w((wf.b) this.f51348b, rVar.N, 0));
                return;
            case 28:
                int i14 = JobInfoSchedulerService.f6451a;
                ((JobInfoSchedulerService) this.f51349c).jobFinished((JobParameters) this.f51348b, false);
                return;
            default:
                u9.p pVar4 = (u9.p) this.f51349c;
                ua.b bVar2 = (ua.b) this.f51348b;
                if (pVar4.f56486b == u9.p.d) {
                    synchronized (pVar4) {
                        aVar = pVar4.f56485a;
                        pVar4.f56485a = null;
                        pVar4.f56486b = bVar2;
                    }
                    aVar.c(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }

    public w(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f51347a = 1;
        this.f51348b = arrayList;
        this.f51349c = longSparseArray;
    }

    public w(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.f51347a = 8;
        this.f51349c = d0Var;
        this.f51348b = runnable;
    }
}
