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
import kg.x1;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tm;
import org.telegram.ui.on0;
import tg.c2;
import tg.d2;
import tg.f2;
public final class s0 implements Runnable {
    public final int f55469a;
    public final Object f55470b;
    public final Object f55471c;
    public final Object d;
    public final Object f55472e;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f55469a = i7;
        this.f55471c = obj;
        this.d = obj2;
        this.f55470b = obj3;
        this.f55472e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        boolean z10 = false;
        int i7 = 1;
        switch (this.f55469a) {
            case 0:
                e1 e1Var = (e1) this.f55471c;
                v vVar = (v) this.d;
                e0 e0Var = (e0) this.f55470b;
                l lVar = (l) this.f55472e;
                ab.c0 c0Var = e1Var.f55252b;
                try {
                    e1Var.f55253c.remove(vVar);
                    if (!e0Var.j()) {
                        z0 z0Var = (z0) vVar.d;
                        z0Var.getClass();
                        IBinder asBinder = z0Var.f55504a.asBinder();
                        t m10 = e0Var.m(vVar);
                        if (c0Var.A(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.f55475a, m10.f55476b);
                        com.google.android.gms.common.api.internal.t v = c0Var.v(vVar);
                        if (v == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            i1 i1Var = e0Var.f55245t;
                            g1 g1Var = e0Var.f55244s;
                            e2.y0 y0Var = m10.f55476b;
                            g1 A1 = e1Var.A1(g1Var);
                            MediaSession.Token token = ((q4.l) e0Var.h.f55382n.f55867b).f55851c.f55864b;
                            h9.i0 i0Var = m10.f55477c;
                            if (i0Var == null) {
                                i0Var = e0Var.f55249y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = e0Var.f55250z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = e0Var.f55243r;
                            l1 l1Var = m10.f55475a;
                            e2.y0 t6 = i1Var.t();
                            q1 q1Var = e0Var.f55235j.f55432a;
                            q1Var.getClass();
                            j jVar = new j(e1Var, i0Var3, i0Var2, i0Var4, l1Var, y0Var, t6, new Bundle(q1Var.f55453g), e0Var.A, A1, token);
                            if (!e0Var.j()) {
                                try {
                                    ((k) lVar).h1(v.e(), jVar.a(vVar.f55485c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!e0Var.f55248x || !e0.k(vVar))) {
                                    e0Var.f55231e.getClass();
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
                m9.e0 e0Var2 = (m9.e0) this.f55471c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f55472e;
                if (((e0) this.f55470b).j()) {
                    e0Var2.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var2.m(null);
                    return;
                } catch (Throwable th2) {
                    e0Var2.n(th2);
                    return;
                }
            case 2:
                e0 e0Var3 = (e0) this.f55470b;
                b1 b1Var = (b1) this.f55471c;
                v vVar2 = (v) this.d;
                List list = (List) this.f55472e;
                if (!e0Var3.j()) {
                    b1Var.a(e0Var3.f55245t, vVar2, list);
                    return;
                }
                return;
            case 3:
                t5.a aVar = (t5.a) this.f55471c;
                o5.i iVar = (o5.i) this.d;
                String str = iVar.f21736a;
                l5.g gVar = (l5.g) this.f55470b;
                o5.h hVar = (o5.h) this.f55472e;
                aVar.getClass();
                Logger logger = t5.a.f57654f;
                try {
                    p5.f a11 = aVar.f57657c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.f57658e).f(new tm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 4:
                f2 f2Var = (f2) this.f55471c;
                f2Var.H = true;
                f2Var.I = (c2[]) ((ArrayList) this.d).toArray(new c2[0]);
                ((on0) this.f55470b).a((c2) this.f55472e);
                return;
            case 5:
                f2 f2Var2 = (f2) this.f55471c;
                TLObject tLObject = (TLObject) this.d;
                d2 d2Var = (d2) this.f55470b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f55472e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    f2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    d2Var.f57815e = ri.c0(tL_messageMediaDocument.document, d2Var.f57814c);
                    d2Var.f57816f = tL_messageMediaDocument;
                    f2Var2.a();
                    return;
                }
                f2Var2.h();
                f2Var2.n(tL_error);
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f55471c;
                x10 x10Var = (x10) this.d;
                TLObject tLObject2 = (TLObject) this.f55470b;
                x10 x10Var2 = (x10) this.f55472e;
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
                xi.e eVar = (xi.e) this.f55471c;
                ((ArrayDeque) eVar.f60662a).addLast(new xi.d((x1) this.d, (xi.a) this.f55470b, (RequestTimeDelegate) this.f55472e));
                eVar.K();
                return;
            default:
                zi.t tVar = (zi.t) this.f55471c;
                zi.n0 n0Var = (zi.n0) this.d;
                zi.n0 n0Var2 = (zi.n0) this.f55470b;
                Handler handler = (Handler) this.f55472e;
                if (tVar.f62329r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f62302c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f62303d0 = n0Var;
                    tVar.f62305e0 = n0Var2;
                    String[] strArr = zi.v0.f62378a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == zi.n0.f62270b) {
                                i7 = 0;
                            }
                            a10 = zi.v0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f62300b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f62298a0 = (max - max2) * 1000000;
                    tVar.f62311i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.f62300b0 + ", targetBlurRadiusPx=" + (((tVar.N.f62094a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f62298a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f62342y0);
                    handler.post(tVar.f62342y0);
                    return;
                }
                return;
        }
    }

    public s0(e0 e0Var, Object obj, Object obj2, Object obj3, int i7) {
        this.f55469a = i7;
        this.f55470b = e0Var;
        this.f55471c = obj;
        this.d = obj2;
        this.f55472e = obj3;
    }
}
