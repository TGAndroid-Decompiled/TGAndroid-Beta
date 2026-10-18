package si;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;
import yh.g1;
import yh.l2;
import yh.o2;
public final class o implements Runnable {
    public final int f46734a;
    public final Object f46735b;
    public final Object f46736c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f46734a = i10;
        this.f46735b = obj;
        this.f46736c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        int i10 = 1;
        switch (this.f46734a) {
            case 0:
                t tVar = (t) this.f46735b;
                l0 l0Var = (l0) this.f46736c;
                l0 l0Var2 = (l0) this.d;
                Handler handler = (Handler) this.e;
                if (tVar.f46808r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f46782c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f46783d0 = l0Var;
                    tVar.f46784e0 = l0Var2;
                    String[] strArr = t0.f46822a;
                    synchronized (t0.class) {
                        t0.b();
                        if (l0Var != l0Var2) {
                            if (l0Var == l0.f46701b) {
                                i10 = 0;
                            }
                            a2 = t0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f46780b0 = a2;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f46778a0 = (max - max2) * 1000000;
                    tVar.f46790i.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + tVar.f46780b0 + ", targetBlurRadiusPx=" + (((tVar.N.f46563a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f46778a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f46819x0);
                    handler.post(tVar.f46819x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f46735b;
                Utilities.Callback callback = (Utilities.Callback) this.f46736c;
                TLObject tLObject = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject);
                    return;
                } else {
                    return;
                }
            default:
                final l2 l2Var = (l2) this.f46735b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f46736c;
                g1 g1Var = (g1) this.d;
                final View view = (View) this.e;
                is0 is0Var = l2Var.f50359a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = l2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(l2Var.f50360b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (l2Var.e.n(savedStarGift, z11, false)) {
                    new o2(l2Var.getContext(), is0Var.f50459c, savedStarGift, l2Var.f50361c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((g1) view).c(z11, true);
                            l2 l2Var2 = l2.this;
                            l2Var2.f50362f.u0(0);
                            return xc.a0(l2Var2.f50359a.f50457a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    xc.a0(is0Var.f50457a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, xc.a0(is0Var.f50457a), R.raw.ic_unpin, 36);
                }
                ((g1) view).c(z11, true);
                l2Var.f50362f.u0(0);
                return;
        }
    }
}
