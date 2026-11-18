package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import c8.kb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rm;
import org.telegram.ui.on0;
import tg.b2;
import tg.c2;
import tg.e2;
public final class s0 implements Runnable {
    public final int f55428a;
    public final Object f55429b;
    public final Object f55430c;
    public final Object d;
    public final Object f55431e;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f55428a = i7;
        this.f55430c = obj;
        this.d = obj2;
        this.f55429b = obj3;
        this.f55431e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        boolean z10 = false;
        int i7 = 1;
        switch (this.f55428a) {
            case 0:
                e1 e1Var = (e1) this.f55430c;
                v vVar = (v) this.d;
                d0 d0Var = (d0) this.f55429b;
                l lVar = (l) this.f55431e;
                ab.c0 c0Var = e1Var.f55210b;
                try {
                    e1Var.f55211c.remove(vVar);
                    if (!d0Var.j()) {
                        z0 z0Var = (z0) vVar.d;
                        z0Var.getClass();
                        IBinder asBinder = z0Var.f55463a.asBinder();
                        t m10 = d0Var.m(vVar);
                        if (c0Var.A(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.f55434a, m10.f55435b);
                        com.google.android.gms.common.api.internal.t v = c0Var.v(vVar);
                        if (v == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            i1 i1Var = d0Var.f55195t;
                            g1 g1Var = d0Var.f55194s;
                            e2.y0 y0Var = m10.f55435b;
                            g1 A1 = e1Var.A1(g1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f55332n.f55826b).f55810c.f55823b;
                            h9.i0 i0Var = m10.f55436c;
                            if (i0Var == null) {
                                i0Var = d0Var.f55199y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f55200z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = d0Var.f55193r;
                            l1 l1Var = m10.f55434a;
                            e2.y0 t6 = i1Var.t();
                            q1 q1Var = d0Var.f55185j.f55391a;
                            q1Var.getClass();
                            j jVar = new j(e1Var, i0Var3, i0Var2, i0Var4, l1Var, y0Var, t6, new Bundle(q1Var.f55412g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((k) lVar).h1(v.e(), jVar.a(vVar.f55444c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!d0Var.f55198x || !d0.k(vVar))) {
                                    d0Var.f55181e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                    if (0 == 0) {
                        kb.a(lVar);
                    }
                }
            case 1:
                m9.e0 e0Var = (m9.e0) this.f55430c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f55431e;
                if (((d0) this.f55429b).j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th2) {
                    e0Var.n(th2);
                    return;
                }
            case 2:
                d0 d0Var2 = (d0) this.f55429b;
                b1 b1Var = (b1) this.f55430c;
                v vVar2 = (v) this.d;
                List list = (List) this.f55431e;
                if (!d0Var2.j()) {
                    b1Var.a(d0Var2.f55195t, vVar2, list);
                    return;
                }
                return;
            case 3:
                t5.a aVar = (t5.a) this.f55430c;
                o5.i iVar = (o5.i) this.d;
                String str = iVar.f21714a;
                l5.g gVar = (l5.g) this.f55429b;
                o5.h hVar = (o5.h) this.f55431e;
                aVar.getClass();
                Logger logger = t5.a.f57615f;
                try {
                    p5.f a11 = aVar.f57618c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.f57619e).f(new rm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 4:
                e2 e2Var = (e2) this.f55430c;
                e2Var.H = true;
                e2Var.I = (b2[]) ((ArrayList) this.d).toArray(new b2[0]);
                ((on0) this.f55429b).a((b2) this.f55431e);
                return;
            case 5:
                e2 e2Var2 = (e2) this.f55430c;
                TLObject tLObject = (TLObject) this.d;
                c2 c2Var = (c2) this.f55429b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f55431e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    e2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    c2Var.f57756e = ri.c0(tL_messageMediaDocument.document, c2Var.f57755c);
                    c2Var.f57757f = tL_messageMediaDocument;
                    e2Var2.a();
                    return;
                }
                e2Var2.h();
                e2Var2.n(tL_error);
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f55430c;
                x10 x10Var = (x10) this.d;
                TLObject tLObject2 = (TLObject) this.f55429b;
                x10 x10Var2 = (x10) this.f55431e;
                if (tL_error2 != null) {
                    x10Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    x10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 7:
                xi.e eVar = (xi.e) this.f55430c;
                ((ArrayDeque) eVar.f60620a).addLast(new xi.d((ki.e) this.d, (xi.a) this.f55429b, (RequestTimeDelegate) this.f55431e));
                eVar.K();
                return;
            default:
                zi.t tVar = (zi.t) this.f55430c;
                zi.n0 n0Var = (zi.n0) this.d;
                zi.n0 n0Var2 = (zi.n0) this.f55429b;
                Handler handler = (Handler) this.f55431e;
                if (tVar.f62287r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f62260c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f62261d0 = n0Var;
                    tVar.f62263e0 = n0Var2;
                    String[] strArr = zi.v0.f62336a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == zi.n0.f62228b) {
                                i7 = 0;
                            }
                            a10 = zi.v0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f62258b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f62256a0 = (max - max2) * 1000000;
                    tVar.f62269i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.f62258b0 + ", targetBlurRadiusPx=" + (((tVar.N.f62052a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f62256a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f62300y0);
                    handler.post(tVar.f62300y0);
                    return;
                }
                return;
        }
    }

    public s0(d0 d0Var, Object obj, Object obj2, Object obj3, int i7) {
        this.f55428a = i7;
        this.f55429b = d0Var;
        this.f55430c = obj;
        this.d = obj2;
        this.f55431e = obj3;
    }
}
