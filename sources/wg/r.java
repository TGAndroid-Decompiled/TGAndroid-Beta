package wg;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.up0;
import zh.a2;
import zh.e2;
public final class r implements Runnable {
    public final int f57707a;
    public final Object f57708b;
    public final Object f57709c;
    public final Object d;
    public final Object f57710e;

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f57707a = i7;
        this.f57708b = obj;
        this.f57709c = obj2;
        this.d = obj3;
        this.f57710e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        int i7 = 1;
        switch (this.f57707a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f57708b;
                c20 c20Var = (c20) this.f57709c;
                TLObject tLObject = (TLObject) this.f57710e;
                c20 c20Var2 = (c20) this.d;
                if (tL_error != null) {
                    c20Var.a(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    c20Var2.a((TLRPC.payments_GiveawayInfo) tLObject);
                    return;
                } else {
                    return;
                }
            case 1:
                wi.t tVar = (wi.t) this.f57708b;
                wi.m0 m0Var = (wi.m0) this.f57709c;
                wi.m0 m0Var2 = (wi.m0) this.d;
                Handler handler = (Handler) this.f57710e;
                if (tVar.f58083r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f58056c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f58057d0 = m0Var;
                    tVar.f58059e0 = m0Var2;
                    String[] strArr = wi.u0.f58121a;
                    synchronized (wi.u0.class) {
                        wi.u0.b();
                        if (m0Var != m0Var2) {
                            if (m0Var == wi.m0.f58015b) {
                                i7 = 0;
                            }
                            a10 = wi.u0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f58054b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f58052a0 = (max - max2) * 1000000;
                    tVar.f58065i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + tVar.f58054b0 + ", targetBlurRadiusPx=" + (((tVar.N.f57841a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f58052a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f58094x0);
                    handler.post(tVar.f58094x0);
                    return;
                }
                return;
            default:
                final a2 a2Var = (a2) this.f57708b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f57709c;
                zh.z0 z0Var = (zh.z0) this.d;
                final View view = (View) this.f57710e;
                up0 up0Var = a2Var.f60105a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    z0Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = a2Var.f60108e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(a2Var.f60106b).sendRequest(savestargift, null, 64);
                }
                boolean z9 = savedStarGift.pinned_to_top;
                final boolean z10 = !z9;
                if (a2Var.f60108e.o(savedStarGift, z10, false)) {
                    new e2(a2Var.getContext(), up0Var.f60213c, savedStarGift, a2Var.f60107c, new u10() {
                        @Override
                        public final Object run() {
                            ((z0) view).d(z10, true);
                            a2 a2Var2 = a2.this;
                            a2Var2.f60109f.v0(0);
                            return hc.a0(a2Var2.f60105a.f60211a);
                        }
                    }).show();
                    return;
                }
                if (!z9) {
                    hc.a0(up0Var.f60211a).I(2131624054, hd.M0(2131750075, null), hd.M0(2131750076, null)).j();
                } else {
                    k5.o(null, 2131749879, hc.a0(up0Var.f60211a), 2131624060, 36);
                }
                ((zh.z0) view).d(z10, true);
                a2Var.f60109f.v0(0);
                return;
        }
    }

    public r(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, c20 c20Var2) {
        this.f57707a = 0;
        this.f57708b = tL_error;
        this.f57709c = c20Var;
        this.f57710e = tLObject;
        this.d = c20Var2;
    }
}
