package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import c8.lb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kg.y1;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tm;
import org.telegram.ui.on0;
import tg.c2;
import tg.d2;
import tg.f2;
public final class s0 implements Runnable {
    public final int f55438a;
    public final Object f55439b;
    public final Object f55440c;
    public final Object d;
    public final Object f55441e;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f55438a = i7;
        this.f55440c = obj;
        this.d = obj2;
        this.f55439b = obj3;
        this.f55441e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        boolean z10 = false;
        int i7 = 1;
        switch (this.f55438a) {
            case 0:
                e1 e1Var = (e1) this.f55440c;
                v vVar = (v) this.d;
                d0 d0Var = (d0) this.f55439b;
                l lVar = (l) this.f55441e;
                ab.c0 c0Var = e1Var.f55220b;
                try {
                    e1Var.f55221c.remove(vVar);
                    if (!d0Var.j()) {
                        z0 z0Var = (z0) vVar.d;
                        z0Var.getClass();
                        IBinder asBinder = z0Var.f55473a.asBinder();
                        t m10 = d0Var.m(vVar);
                        if (c0Var.A(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.f55444a, m10.f55445b);
                        com.google.android.gms.common.api.internal.t v = c0Var.v(vVar);
                        if (v == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            i1 i1Var = d0Var.f55205t;
                            g1 g1Var = d0Var.f55204s;
                            e2.y0 y0Var = m10.f55445b;
                            g1 A1 = e1Var.A1(g1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f55342n.f55836b).f55820c.f55833b;
                            h9.i0 i0Var = m10.f55446c;
                            if (i0Var == null) {
                                i0Var = d0Var.f55209y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f55210z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = d0Var.f55203r;
                            l1 l1Var = m10.f55444a;
                            e2.y0 t6 = i1Var.t();
                            q1 q1Var = d0Var.f55195j.f55401a;
                            q1Var.getClass();
                            j jVar = new j(e1Var, i0Var3, i0Var2, i0Var4, l1Var, y0Var, t6, new Bundle(q1Var.f55422g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((k) lVar).h1(v.e(), jVar.a(vVar.f55454c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!d0Var.f55208x || !d0.k(vVar))) {
                                    d0Var.f55191e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                    if (0 == 0) {
                        lb.a(lVar);
                    }
                }
            case 1:
                m9.e0 e0Var = (m9.e0) this.f55440c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f55441e;
                if (((d0) this.f55439b).j()) {
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
                d0 d0Var2 = (d0) this.f55439b;
                b1 b1Var = (b1) this.f55440c;
                v vVar2 = (v) this.d;
                List list = (List) this.f55441e;
                if (!d0Var2.j()) {
                    b1Var.a(d0Var2.f55205t, vVar2, list);
                    return;
                }
                return;
            case 3:
                t5.a aVar = (t5.a) this.f55440c;
                o5.i iVar = (o5.i) this.d;
                String str = iVar.f21705a;
                l5.g gVar = (l5.g) this.f55439b;
                o5.h hVar = (o5.h) this.f55441e;
                aVar.getClass();
                Logger logger = t5.a.f57623f;
                try {
                    p5.f a11 = aVar.f57626c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.f57627e).f(new tm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 4:
                f2 f2Var = (f2) this.f55440c;
                f2Var.H = true;
                f2Var.I = (c2[]) ((ArrayList) this.d).toArray(new c2[0]);
                ((on0) this.f55439b).a((c2) this.f55441e);
                return;
            case 5:
                f2 f2Var2 = (f2) this.f55440c;
                TLObject tLObject = (TLObject) this.d;
                d2 d2Var = (d2) this.f55439b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f55441e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    f2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    d2Var.f57784e = si.c0(tL_messageMediaDocument.document, d2Var.f57783c);
                    d2Var.f57785f = tL_messageMediaDocument;
                    f2Var2.a();
                    return;
                }
                f2Var2.h();
                f2Var2.n(tL_error);
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f55440c;
                y10 y10Var = (y10) this.d;
                TLObject tLObject2 = (TLObject) this.f55439b;
                y10 y10Var2 = (y10) this.f55441e;
                if (tL_error2 != null) {
                    y10Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    y10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 7:
                xi.e eVar = (xi.e) this.f55440c;
                ((ArrayDeque) eVar.f60631a).addLast(new xi.d((y1) this.d, (xi.a) this.f55439b, (RequestTimeDelegate) this.f55441e));
                eVar.K();
                return;
            default:
                zi.t tVar = (zi.t) this.f55440c;
                zi.n0 n0Var = (zi.n0) this.d;
                zi.n0 n0Var2 = (zi.n0) this.f55439b;
                Handler handler = (Handler) this.f55441e;
                if (tVar.f62298r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f62271c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f62272d0 = n0Var;
                    tVar.f62274e0 = n0Var2;
                    String[] strArr = zi.v0.f62347a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == zi.n0.f62239b) {
                                i7 = 0;
                            }
                            a10 = zi.v0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f62269b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f62267a0 = (max - max2) * 1000000;
                    tVar.f62280i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.f62269b0 + ", targetBlurRadiusPx=" + (((tVar.N.f62063a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f62267a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f62311y0);
                    handler.post(tVar.f62311y0);
                    return;
                }
                return;
        }
    }

    public s0(d0 d0Var, Object obj, Object obj2, Object obj3, int i7) {
        this.f55438a = i7;
        this.f55439b = d0Var;
        this.f55440c = obj;
        this.d = obj2;
        this.f55441e = obj3;
    }
}
