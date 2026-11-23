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
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rm;
import org.telegram.ui.pn0;
import tg.f2;
import tg.g2;
import tg.i2;
public final class l0 implements Runnable {
    public final int f55451a;
    public final Object f55452b;
    public final Object f55453c;
    public final Object d;
    public final Object f55454e;

    public l0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f55451a = i7;
        this.f55452b = obj;
        this.f55453c = obj2;
        this.d = obj3;
        this.f55454e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.a():void");
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        boolean z10 = false;
        int i7 = 1;
        switch (this.f55451a) {
            case 0:
                a();
                return;
            case 1:
                d1 d1Var = (d1) this.f55452b;
                v vVar = (v) this.f55453c;
                d0 d0Var = (d0) this.d;
                l lVar = (l) this.f55454e;
                ab.c0 c0Var = d1Var.f55331b;
                try {
                    d1Var.f55332c.remove(vVar);
                    if (!d0Var.j()) {
                        y0 y0Var = (y0) vVar.d;
                        y0Var.getClass();
                        IBinder asBinder = y0Var.f55583a.asBinder();
                        t m10 = d0Var.m(vVar);
                        if (c0Var.B(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.f55560a, m10.f55561b);
                        com.google.android.gms.common.api.internal.t y10 = c0Var.y(vVar);
                        if (y10 == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            h1 h1Var = d0Var.f55324t;
                            f1 f1Var = d0Var.f55323s;
                            e2.y0 y0Var2 = m10.f55561b;
                            f1 A1 = d1Var.A1(f1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f55487n.f55949b).f55933c.f55946b;
                            h9.i0 i0Var = m10.f55562c;
                            if (i0Var == null) {
                                i0Var = d0Var.f55328y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f55329z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = d0Var.f55322r;
                            k1 k1Var = m10.f55560a;
                            e2.y0 u10 = h1Var.u();
                            p1 p1Var = d0Var.f55314j.f55515a;
                            p1Var.getClass();
                            j jVar = new j(d1Var, i0Var3, i0Var2, i0Var4, k1Var, y0Var2, u10, new Bundle(p1Var.f55534g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((k) lVar).h1(y10.e(), jVar.a(vVar.f55569c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!d0Var.f55327x || !d0.k(vVar))) {
                                    d0Var.f55310e.getClass();
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
            case 2:
                m9.e0 e0Var = (m9.e0) this.f55453c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f55454e;
                if (((d0) this.f55452b).j()) {
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
            case 3:
                d0 d0Var2 = (d0) this.f55452b;
                a1 a1Var = (a1) this.f55453c;
                v vVar2 = (v) this.d;
                List list = (List) this.f55454e;
                if (!d0Var2.j()) {
                    a1Var.a(d0Var2.f55324t, vVar2, list);
                    return;
                }
                return;
            case 4:
                t5.a aVar = (t5.a) this.f55452b;
                o5.i iVar = (o5.i) this.f55453c;
                String str = iVar.f21804a;
                l5.g gVar = (l5.g) this.d;
                o5.h hVar = (o5.h) this.f55454e;
                aVar.getClass();
                Logger logger = t5.a.f57737f;
                try {
                    p5.f a11 = aVar.f57740c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.f57741e).f(new rm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 5:
                i2 i2Var = (i2) this.f55452b;
                i2Var.H = true;
                i2Var.I = (f2[]) ((ArrayList) this.d).toArray(new f2[0]);
                ((pn0) this.f55453c).a((f2) this.f55454e);
                return;
            case 6:
                i2 i2Var2 = (i2) this.f55452b;
                TLObject tLObject = (TLObject) this.f55453c;
                g2 g2Var = (g2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f55454e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    i2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    g2Var.f57922e = ri.c0(tL_messageMediaDocument.document, g2Var.f57921c);
                    g2Var.f57923f = tL_messageMediaDocument;
                    i2Var2.a();
                    return;
                }
                i2Var2.h();
                i2Var2.n(tL_error);
                return;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f55452b;
                w10 w10Var = (w10) this.f55453c;
                TLObject tLObject2 = (TLObject) this.d;
                w10 w10Var2 = (w10) this.f55454e;
                if (tL_error2 != null) {
                    w10Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    w10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 8:
                xi.e eVar = (xi.e) this.f55452b;
                ((ArrayDeque) eVar.f60749a).addLast(new xi.d((org.telegram.tgnet.g) this.f55453c, (xi.a) this.d, (RequestTimeDelegate) this.f55454e));
                eVar.J();
                return;
            default:
                zi.t tVar = (zi.t) this.f55452b;
                zi.n0 n0Var = (zi.n0) this.f55453c;
                zi.n0 n0Var2 = (zi.n0) this.d;
                Handler handler = (Handler) this.f55454e;
                if (tVar.f62418r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f62391c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f62392d0 = n0Var;
                    tVar.f62394e0 = n0Var2;
                    String[] strArr = zi.v0.f62467a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == zi.n0.f62359b) {
                                i7 = 0;
                            }
                            a10 = zi.v0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f62389b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f62387a0 = (max - max2) * 1000000;
                    tVar.f62400i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.f62389b0 + ", targetBlurRadiusPx=" + (((tVar.N.f62181a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f62387a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f62431y0);
                    handler.post(tVar.f62431y0);
                    return;
                }
                return;
        }
    }

    public l0(i2 i2Var, ArrayList arrayList, pn0 pn0Var, f2 f2Var) {
        this.f55451a = 5;
        this.f55452b = i2Var;
        this.d = arrayList;
        this.f55453c = pn0Var;
        this.f55454e = f2Var;
    }
}
