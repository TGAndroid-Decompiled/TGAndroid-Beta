package tg;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ln0;
public final class v1 implements Runnable {
    public final int f57584a;
    public final Object f57585b;
    public final Object f57586c;
    public final Object d;
    public final Object f57587e;

    public v1(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f57584a = i7;
        this.f57585b = obj;
        this.f57586c = obj2;
        this.d = obj3;
        this.f57587e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        int i7 = 1;
        switch (this.f57584a) {
            case 0:
                f2 f2Var = (f2) this.f57585b;
                f2Var.H = true;
                f2Var.I = (c2[]) ((ArrayList) this.f57586c).toArray(new c2[0]);
                ((ln0) this.d).a((c2) this.f57587e);
                return;
            case 1:
                f2 f2Var2 = (f2) this.f57585b;
                TLObject tLObject = (TLObject) this.f57586c;
                d2 d2Var = (d2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f57587e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    f2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    d2Var.f57191e = si.a0(tL_messageMediaDocument.document, d2Var.f57190c);
                    d2Var.f57192f = tL_messageMediaDocument;
                    f2Var2.a();
                    return;
                }
                f2Var2.h();
                f2Var2.n(tL_error);
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f57585b;
                z10 z10Var = (z10) this.f57586c;
                TLObject tLObject2 = (TLObject) this.d;
                z10 z10Var2 = (z10) this.f57587e;
                if (tL_error2 != null) {
                    z10Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    z10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 3:
                xi.e eVar = (xi.e) this.f57585b;
                ((ArrayDeque) eVar.f60055a).addLast(new xi.d((ki.e) this.f57586c, (xi.a) this.d, (RequestTimeDelegate) this.f57587e));
                eVar.G();
                return;
            default:
                zi.u uVar = (zi.u) this.f57585b;
                zi.n0 n0Var = (zi.n0) this.f57586c;
                zi.n0 n0Var2 = (zi.n0) this.d;
                Handler handler = (Handler) this.f57587e;
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
                    String[] strArr = zi.w0.f61772a;
                    synchronized (zi.w0.class) {
                        zi.w0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == zi.n0.f61637b) {
                                i7 = 0;
                            }
                            a10 = zi.w0.a(i7);
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
