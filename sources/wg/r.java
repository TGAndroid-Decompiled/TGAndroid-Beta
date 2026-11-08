package wg;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.up0;
import zh.c2;
import zh.z1;
public final class r implements Runnable {
    public final int f57800a;
    public final Object f57801b;
    public final Object f57802c;
    public final Object d;
    public final Object f57803e;

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f57800a = i7;
        this.f57801b = obj;
        this.f57802c = obj2;
        this.d = obj3;
        this.f57803e = obj4;
    }

    @Override
    public final void run() {
        int a10;
        int max;
        int max2;
        int i7 = 1;
        switch (this.f57800a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f57801b;
                c20 c20Var = (c20) this.f57802c;
                TLObject tLObject = (TLObject) this.f57803e;
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
                wi.t tVar = (wi.t) this.f57801b;
                wi.m0 m0Var = (wi.m0) this.f57802c;
                wi.m0 m0Var2 = (wi.m0) this.d;
                Handler handler = (Handler) this.f57803e;
                if (tVar.f58177r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f58150c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f58151d0 = m0Var;
                    tVar.f58153e0 = m0Var2;
                    String[] strArr = wi.u0.f58217a;
                    synchronized (wi.u0.class) {
                        wi.u0.b();
                        if (m0Var != m0Var2) {
                            if (m0Var == wi.m0.f58085b) {
                                i7 = 0;
                            }
                            a10 = wi.u0.a(i7);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f58148b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f58146a0 = (max - max2) * 1000000;
                    tVar.f58159i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + tVar.f58148b0 + ", targetBlurRadiusPx=" + (((tVar.N.f57934a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f58146a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f58190y0);
                    handler.post(tVar.f58190y0);
                    return;
                }
                return;
            default:
                final z1 z1Var = (z1) this.f57801b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f57802c;
                zh.y0 y0Var = (zh.y0) this.d;
                final View view = (View) this.f57803e;
                up0 up0Var = z1Var.f60622a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    y0Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = z1Var.f60625e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(z1Var.f60623b).sendRequest(savestargift, null, 64);
                }
                boolean z9 = savedStarGift.pinned_to_top;
                final boolean z10 = !z9;
                if (z1Var.f60625e.o(savedStarGift, z10, false)) {
                    new c2(z1Var.getContext(), up0Var.f60285c, savedStarGift, z1Var.f60624c, new u10() {
                        @Override
                        public final Object run() {
                            ((y0) view).d(z10, true);
                            z1 z1Var2 = z1.this;
                            z1Var2.f60626f.v0(0);
                            return hc.a0(z1Var2.f60622a.f60283a);
                        }
                    }).show();
                    return;
                }
                if (!z9) {
                    hc.a0(up0Var.f60283a).I(2131624054, id.M0(2131750077, null), id.M0(2131750078, null)).j();
                } else {
                    k5.o(null, 2131749881, hc.a0(up0Var.f60283a), 2131624060, 36);
                }
                ((zh.y0) view).d(z10, true);
                z1Var.f60626f.v0(0);
                return;
        }
    }

    public r(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, c20 c20Var2) {
        this.f57800a = 0;
        this.f57801b = tL_error;
        this.f57802c = c20Var;
        this.f57803e = tLObject;
        this.d = c20Var2;
    }
}
