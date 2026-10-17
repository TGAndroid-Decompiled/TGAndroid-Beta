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
    public final int f46765a;
    public final Object f46766b;
    public final Object f46767c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f46765a = i10;
        this.f46766b = obj;
        this.f46767c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        int i10 = 1;
        switch (this.f46765a) {
            case 0:
                u uVar = (u) this.f46766b;
                m0 m0Var = (m0) this.f46767c;
                m0 m0Var2 = (m0) this.d;
                Handler handler = (Handler) this.e;
                if (uVar.f46839r0 && uVar.W == 0 && uVar.T) {
                    uVar.N.g(uVar.L, uVar.D, false);
                    uVar.U = false;
                    uVar.V = false;
                    uVar.f46813c0 = 0.0f;
                    uVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    uVar.X = elapsedRealtimeNanos;
                    uVar.Y = elapsedRealtimeNanos;
                    uVar.f46814d0 = m0Var;
                    uVar.f46815e0 = m0Var2;
                    String[] strArr = u0.f46853a;
                    synchronized (u0.class) {
                        u0.b();
                        if (m0Var != m0Var2) {
                            if (m0Var == m0.f46732b) {
                                i10 = 0;
                            }
                            a2 = u0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    uVar.f46811b0 = a2;
                    uVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    uVar.f46809a0 = (max - max2) * 1000000;
                    uVar.f46821i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + uVar.f46811b0 + ", targetBlurRadiusPx=" + (((uVar.N.f46588a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.f46809a0) / 1000000));
                    uVar.Q = -1L;
                    handler.removeCallbacks(uVar.f46850x0);
                    handler.post(uVar.f46850x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f46766b;
                Utilities.Callback callback = (Utilities.Callback) this.f46767c;
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
                final m2 m2Var = (m2) this.f46766b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f46767c;
                h1 h1Var = (h1) this.d;
                final View view = (View) this.e;
                is0 is0Var = m2Var.f50394a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f50395b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.n(savedStarGift, z11, false)) {
                    new p2(m2Var.getContext(), is0Var.f50494c, savedStarGift, m2Var.f50396c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f50397f.u0(0);
                            return xc.a0(m2Var2.f50394a.f50492a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    xc.a0(is0Var.f50492a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.q.q(R.string.Gift2Unpinned, xc.a0(is0Var.f50492a), R.raw.ic_unpin, 36);
                }
                ((h1) view).c(z11, true);
                m2Var.f50397f.u0(0);
                return;
        }
    }
}
