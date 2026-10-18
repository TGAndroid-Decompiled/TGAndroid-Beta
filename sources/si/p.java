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
import yh.h1;
import yh.m2;
import yh.p2;
public final class p implements Runnable {
    public final int f46786a;
    public final Object f46787b;
    public final Object f46788c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f46786a = i10;
        this.f46787b = obj;
        this.f46788c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        int i10 = 1;
        switch (this.f46786a) {
            case 0:
                u uVar = (u) this.f46787b;
                l0 l0Var = (l0) this.f46788c;
                l0 l0Var2 = (l0) this.d;
                Handler handler = (Handler) this.e;
                if (uVar.f46860r0 && uVar.W == 0 && uVar.T) {
                    uVar.N.g(uVar.L, uVar.D, false);
                    uVar.U = false;
                    uVar.V = false;
                    uVar.f46834c0 = 0.0f;
                    uVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    uVar.X = elapsedRealtimeNanos;
                    uVar.Y = elapsedRealtimeNanos;
                    uVar.f46835d0 = l0Var;
                    uVar.f46836e0 = l0Var2;
                    String[] strArr = t0.f46826a;
                    synchronized (t0.class) {
                        t0.b();
                        if (l0Var != l0Var2) {
                            if (l0Var == l0.f46748b) {
                                i10 = 0;
                            }
                            a2 = t0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    uVar.f46832b0 = a2;
                    uVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    uVar.f46830a0 = (max - max2) * 1000000;
                    uVar.f46842i.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + uVar.f46832b0 + ", targetBlurRadiusPx=" + (((uVar.N.f46609a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.f46830a0) / 1000000));
                    uVar.Q = -1L;
                    handler.removeCallbacks(uVar.f46871x0);
                    handler.post(uVar.f46871x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f46787b;
                Utilities.Callback callback = (Utilities.Callback) this.f46788c;
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
                final m2 m2Var = (m2) this.f46787b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f46788c;
                h1 h1Var = (h1) this.d;
                final View view = (View) this.e;
                is0 is0Var = m2Var.f50419a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f50420b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.n(savedStarGift, z11, false)) {
                    new p2(m2Var.getContext(), is0Var.f50519c, savedStarGift, m2Var.f50421c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f50422f.u0(0);
                            return xc.a0(m2Var2.f50419a.f50517a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    xc.a0(is0Var.f50517a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, xc.a0(is0Var.f50517a), R.raw.ic_unpin, 36);
                }
                ((h1) view).c(z11, true);
                m2Var.f50422f.u0(0);
                return;
        }
    }
}
