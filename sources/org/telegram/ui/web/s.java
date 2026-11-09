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
import di.p7;
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
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import tg.c2;
public final class s implements Runnable {
    public final int f51278a;
    public final Object f51279b;
    public final Object f51280c;

    public s(int i7, Object obj, Object obj2) {
        this.f51278a = i7;
        this.f51279b = obj;
        this.f51280c = obj2;
    }

    @Override
    public final void run() {
        x0 x0Var;
        d0 d0Var;
        o5 o5Var;
        e2.o0 o0Var;
        e2.e eVar;
        g2.d dVar;
        int i7;
        boolean z9;
        e2.s1 s1Var;
        p4.m1 m1Var;
        float f10 = 1.0f;
        SurfaceTexture surfaceTexture = null;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f51278a) {
            case 0:
                x0 x0Var2 = (x0) this.f51279b;
                hi.p pVar = x0Var2.f51355j0;
                pVar.f14852f = true;
                pVar.k();
                x0Var2.v((p7) this.f51280c);
                return;
            case 1:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f51279b;
                ArrayList arrayList = (ArrayList) this.f51280c;
                if (botWebViewContainer$BotWebViewProxy != null && (x0Var = botWebViewContainer$BotWebViewProxy.f51059a) != null && (d0Var = x0Var.f51345c) != null) {
                    d0Var.f(arrayList);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) this.f51279b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f51280c;
                xa.f5953c.addAll(0, arrayList2);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    xa.d.put(longSparseArray.keyAt(i11), (y0) longSparseArray.valueAt(i11));
                }
                xa.f5952b = true;
                xa.f5951a = false;
                ArrayList arrayList3 = xa.f5954e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        ((c20) obj).a(arrayList2);
                    }
                    xa.f5954e = null;
                    return;
                }
                return;
            case 3:
                z0 z0Var = (z0) ((u2) this.f51279b).f12885c;
                ArrayList arrayList4 = z0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f51280c);
                z0Var.f51394n = false;
                w3 w3Var = z0Var.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) this.f51279b;
                if (((u1) this.f51280c).b() == null) {
                    z10 = false;
                }
                z0Var2.setEnabled(z10);
                ViewPropertyAnimator animate = z0Var2.animate();
                if (!z0Var2.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 5:
                ((org.telegram.ui.l0) this.f51279b).f51177f0.a((Integer) this.f51280c);
                return;
            case 6:
                o1 o1Var = (o1) this.f51279b;
                qp messagesController = o1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) this.f51280c;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new fl(messagesController, 3));
                o1Var.f36649a.f37556f3.O(true);
                return;
            case 7:
                u1 u1Var = (u1) this.f51279b;
                TLObject tLObject = (TLObject) this.f51280c;
                int i12 = u1Var.f51305a;
                u1Var.f51310g = true;
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
                if (!iz.f23446w0 && u1Var.h != null && (o5Var = u1Var.f51314l) != null) {
                    o5Var.run();
                }
                u1Var.c();
                return;
            case 8:
                ((u1) this.f51279b).f51315m.remove((s) this.f51280c);
                return;
            case 9:
                ((p4.d0) this.f51279b).getClass();
                ((Runnable) this.f51280c).run();
                return;
            case 10:
                p4.d0 d0Var2 = (p4.d0) this.f51279b;
                p4.g1 g1Var = (p4.g1) this.f51280c;
                p4.m0 m0Var = d0Var2.h;
                d0Var2.f53230t = g1Var;
                df dfVar = new df(d0Var2, g1Var);
                g1Var.I0(dfVar);
                d0Var2.f53231u = dfVar;
                try {
                    m0Var.f53378j.p(0, g1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.f53382n.f53816b).f53798a.setActive(true);
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
                d0Var2.f53229s = new p4.e1(W, 0, R0, Q0, Q02, 0, j3, m10, D0, C, T0, 0, o0Var2, f11, 1.0f, eVar2, 0, dVar2, K, i7, z9, u10, 1, w02, i13, h, g10, U0, O0, Z, z11, s1Var, g1Var.E0());
                d0Var2.f(g1Var.t());
                return;
            case 11:
                ((c0.i) this.f51280c).a(Boolean.valueOf(((p4.d0) this.f51279b).o()));
                return;
            case 12:
                m9.w wVar = (m9.w) this.f51279b;
                ResultReceiver resultReceiver = (ResultReceiver) this.f51280c;
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
                resultReceiver.send(m1Var.f53396a, m1Var.f53397b);
                return;
            case 13:
                ui.e eVar3 = ((p4.c1) this.f51279b).f53196b;
                p4.v x10 = eVar3.x(((p4.l) this.f51280c).asBinder());
                if (x10 != null) {
                    eVar3.T(x10);
                    return;
                }
                return;
            case 14:
                ((p4.c1) this.f51279b).f53196b.q((p4.v) this.f51280c);
                return;
            case 15:
                q2.d dVar3 = (q2.d) this.f51279b;
                e2.u uVar = (e2.u) this.f51280c;
                q2.e eVar4 = dVar3.d;
                if (eVar4.E != 0 && !dVar3.f53731c) {
                    Looper looper = eVar4.I;
                    looper.getClass();
                    dVar3.f53730b = eVar4.b(looper, dVar3.f53729a, uVar, false);
                    eVar4.f53742y.add(dVar3);
                    return;
                }
                return;
            case 16:
                CarResultStub.i1((Map.Entry) this.f51279b, this.f51280c);
                return;
            case 17:
                rt rtVar = ((r2.p) this.f51279b).f54370c;
                Uri uri = ((r2.i) this.f51280c).f54331y;
                s2.c cVar = (s2.c) ((r2.j) rtVar.f37805b).f54333b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 18:
                s2.b bVar = (s2.b) this.f51279b;
                bVar.f54623s = false;
                bVar.b((Uri) this.f51280c);
                return;
            case 19:
                sg.j0 j0Var = (sg.j0) this.f51279b;
                j0Var.v = true;
                RectF f12 = j0Var.f();
                Object obj2 = j0Var.f55099a.f39835b;
                j0Var.f55118w = new wa((ByteBuffer) j0Var.h(j0Var.f(), true, false, false).f55093c, 0, f12);
                j0Var.a(false);
                ((sg.q0) this.f51280c).run();
                return;
            case 20:
                Runnable runnable = (Runnable) this.f51280c;
                sg.t0 t0Var = ((sg.v0) this.f51279b).d;
                if (t0Var != null && t0Var.f55219f) {
                    sg.t0.a(t0Var);
                    runnable.run();
                    return;
                }
                return;
            case 21:
                tg.n1 n1Var = (tg.n1) this.f51280c;
                n1Var.m();
                ((tg.g0) this.f51279b).r0(n1Var, true);
                return;
            case 22:
                ((tg.n1) this.f51279b).s((Bitmap) this.f51280c);
                return;
            case 23:
                c2 c2Var = (c2) this.f51279b;
                c2Var.G = false;
                tg.z1[] z1VarArr = (tg.z1[]) ((ArrayList) this.f51280c).toArray(new tg.z1[0]);
                c2Var.H = z1VarArr;
                if (z1VarArr.length > 0) {
                    c2Var.f55604b0.setScaleX(0.3f);
                    c2Var.f55604b0.setScaleY(0.3f);
                    c2Var.f55604b0.setAlpha(0.0f);
                    c2Var.f55604b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(xq.f40458f).start();
                    return;
                }
                return;
            case 24:
                ti.i iVar = (ti.i) this.f51279b;
                ti.p pVar2 = (ti.p) this.f51280c;
                ti.m mVar = iVar.f56095b;
                if (iVar.f56101j == pVar2) {
                    ImageView imageView = iVar.f56103l;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        pVar2.setFirstFrameCallback(new ti.b(iVar, 3));
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
            case 25:
                ti.i iVar2 = (ti.i) this.f51279b;
                c20 c20Var = (c20) this.f51280c;
                iVar2.l();
                ti.p pVar3 = iVar2.f56101j;
                iVar2.f56101j = null;
                if (pVar3 != null) {
                    org.telegram.messenger.g0.E2(pVar3);
                    SurfaceTexture surfaceTexture2 = pVar3.f56141a;
                    pVar3.f56141a = null;
                    surfaceTexture = surfaceTexture2;
                }
                c20Var.a(surfaceTexture);
                return;
            case 26:
                ti.p pVar4 = (ti.p) this.f51279b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.f51280c;
                if (pVar4.f56141a == surfaceTexture3 && pVar4.getSurfaceTexture() == null) {
                    pVar4.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 27:
                u2.c cVar2 = (u2.c) this.f51279b;
                s sVar = (s) this.f51280c;
                cVar2.f56236c.i();
                u2.f fVar = cVar2.f56235b;
                synchronized (fVar.f56249a) {
                    fVar.b();
                    sVar.run();
                }
                return;
            case 28:
                u2.r rVar = (u2.r) this.f51279b;
                rVar.T.set(rVar.w((wf.b) this.f51280c, rVar.N, 0));
                return;
            default:
                int i14 = JobInfoSchedulerService.f6449a;
                ((JobInfoSchedulerService) this.f51279b).jobFinished((JobParameters) this.f51280c, false);
                return;
        }
    }

    public s(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.f51278a = 9;
        this.f51279b = d0Var;
        this.f51280c = runnable;
    }
}
