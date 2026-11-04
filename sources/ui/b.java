package ui;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wi.m0;
import wi.s;
import wi.u0;
public final class b implements Runnable {
    public final int f56376a;
    public final Object f56377b;
    public final Object f56378c;
    public final Object d;
    public final Object f56379e;

    public b(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f56376a = i3;
        this.f56377b = obj;
        this.f56378c = obj2;
        this.d = obj3;
        this.f56379e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        switch (this.f56376a) {
            case 0:
                f fVar = (f) this.f56377b;
                ((ArrayDeque) fVar.f56390b).addLast(new e((l5.b) this.f56378c, (a) this.d, (RequestTimeDelegate) this.f56379e));
                fVar.I();
                return;
            case 1:
                s sVar = (s) this.f56377b;
                m0 m0Var = (m0) this.f56378c;
                m0 m0Var2 = (m0) this.d;
                Handler handler = (Handler) this.f56379e;
                if (sVar.f58033r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.f58006c0 = 0.0f;
                    int i3 = 1;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.f58007d0 = m0Var;
                    sVar.f58009e0 = m0Var2;
                    String[] strArr = u0.f58080a;
                    synchronized (u0.class) {
                        u0.b();
                        if (m0Var != m0Var2) {
                            if (m0Var == m0.f57974b) {
                                i3 = 0;
                            }
                            a10 = u0.a(i3);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    sVar.f58004b0 = a10;
                    sVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.f58002a0 = (max - max2) * 1000000;
                    sVar.f58015i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + sVar.f58004b0 + ", targetBlurRadiusPx=" + (((sVar.N.f57795a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.f58002a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.f58044x0);
                    handler.post(sVar.f58044x0);
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f56377b;
                u10 u10Var = (u10) this.f56378c;
                TLObject tLObject = (TLObject) this.d;
                u10 u10Var2 = (u10) this.f56379e;
                if (tL_error != null) {
                    u10Var.a(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    u10Var2.a((TLRPC.payments_GiveawayInfo) tLObject);
                    return;
                } else {
                    return;
                }
        }
    }
}
