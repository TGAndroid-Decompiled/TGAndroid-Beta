package t5;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Logger;
import l5.g;
import o5.h;
import o5.i;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.km;
import org.telegram.ui.ln0;
import p5.e;
import tg.b2;
import tg.c2;
import tg.e2;
import xi.d;
import zi.n0;
import zi.u;
import zi.w0;
public final class a implements Runnable {
    public final int f57039a;
    public final Object f57040b;
    public final Object f57041c;
    public final Object d;
    public final Object f57042e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f57039a = i7;
        this.f57040b = obj;
        this.f57041c = obj2;
        this.d = obj3;
        this.f57042e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        int i7 = 1;
        switch (this.f57039a) {
            case 0:
                b bVar = (b) this.f57040b;
                i iVar = (i) this.f57041c;
                String str = iVar.f21347a;
                g gVar = (g) this.d;
                h hVar = (h) this.f57042e;
                bVar.getClass();
                Logger logger = b.f57043f;
                try {
                    e a11 = bVar.f57046c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) bVar.f57047e).f(new km(bVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 1:
                e2 e2Var = (e2) this.f57040b;
                e2Var.H = true;
                e2Var.I = (b2[]) ((ArrayList) this.f57041c).toArray(new b2[0]);
                ((ln0) this.d).a((b2) this.f57042e);
                return;
            case 2:
                e2 e2Var2 = (e2) this.f57040b;
                TLObject tLObject = (TLObject) this.f57041c;
                c2 c2Var = (c2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f57042e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    e2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    c2Var.f57184e = si.a0(tL_messageMediaDocument.document, c2Var.f57183c);
                    c2Var.f57185f = tL_messageMediaDocument;
                    e2Var2.a();
                    return;
                }
                e2Var2.h();
                e2Var2.n(tL_error);
                return;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f57040b;
                z10 z10Var = (z10) this.f57041c;
                TLObject tLObject2 = (TLObject) this.d;
                z10 z10Var2 = (z10) this.f57042e;
                if (tL_error2 != null) {
                    z10Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    z10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 4:
                xi.e eVar = (xi.e) this.f57040b;
                ((ArrayDeque) eVar.f60055a).addLast(new d((ki.e) this.f57041c, (xi.a) this.d, (RequestTimeDelegate) this.f57042e));
                eVar.G();
                return;
            default:
                u uVar = (u) this.f57040b;
                n0 n0Var = (n0) this.f57041c;
                n0 n0Var2 = (n0) this.d;
                Handler handler = (Handler) this.f57042e;
                if (uVar.f61723r0 && uVar.W == 0 && uVar.T) {
                    uVar.N.g(uVar.L, uVar.D, false);
                    uVar.U = false;
                    uVar.V = false;
                    uVar.f61696c0 = 0.0f;
                    uVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    uVar.X = elapsedRealtimeNanos;
                    uVar.Y = elapsedRealtimeNanos;
                    uVar.f61697d0 = n0Var;
                    uVar.f61699e0 = n0Var2;
                    String[] strArr = w0.f61772a;
                    synchronized (w0.class) {
                        w0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == n0.f61637b) {
                                i7 = 0;
                            }
                            a10 = w0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    uVar.f61694b0 = a10;
                    uVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    uVar.f61692a0 = (max - max2) * 1000000;
                    uVar.f61705i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + uVar.f61694b0 + ", targetBlurRadiusPx=" + (((uVar.N.f61489a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.f61692a0) / 1000000));
                    uVar.Q = -1L;
                    handler.removeCallbacks(uVar.f61736y0);
                    handler.post(uVar.f61736y0);
                    return;
                }
                return;
        }
    }
}
