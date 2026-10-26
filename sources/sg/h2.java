package sg;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dr0;
public final class h2 implements Runnable {
    public final int f48230a;
    public final Object f48231b;
    public final Object f48232c;
    public final Object d;
    public final Object e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f48230a = i10;
        this.f48231b = obj;
        this.f48232c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        int i10 = 1;
        switch (this.f48230a) {
            case 0:
                p2 p2Var = (p2) this.f48231b;
                p2Var.G = true;
                p2Var.H = (m2[]) ((ArrayList) this.f48232c).toArray(new m2[0]);
                ((dr0) this.d).run((m2) this.e);
                return;
            case 1:
                p2 p2Var2 = (p2) this.f48231b;
                TLObject tLObject = (TLObject) this.f48232c;
                n2 n2Var = (n2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    p2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    n2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, n2Var.f48375c);
                    n2Var.f48376f = tL_messageMediaDocument;
                    p2Var2.a();
                    return;
                }
                p2Var2.h();
                p2Var2.n(tL_error);
                return;
            case 2:
                ti.e eVar = (ti.e) this.f48231b;
                ((ArrayDeque) eVar.f49184b).addLast(new ti.d((jg.e1) this.f48232c, (ti.a) this.d, (RequestTimeDelegate) this.e));
                eVar.r();
                return;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48231b;
                Utilities.Callback callback = (Utilities.Callback) this.f48232c;
                TLObject tLObject2 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject2);
                    return;
                } else {
                    return;
                }
            case 4:
                vi.s sVar = (vi.s) this.f48231b;
                vi.l0 l0Var = (vi.l0) this.f48232c;
                vi.l0 l0Var2 = (vi.l0) this.d;
                Handler handler = (Handler) this.e;
                if (sVar.f50569r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.f50543c0 = 0.0f;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.f50544d0 = l0Var;
                    sVar.f50545e0 = l0Var2;
                    String[] strArr = vi.t0.f50608a;
                    synchronized (vi.t0.class) {
                        vi.t0.b();
                        if (l0Var != l0Var2) {
                            if (l0Var == vi.l0.f50487b) {
                                i10 = 0;
                            }
                            a2 = vi.t0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    sVar.f50541b0 = a2;
                    sVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.f50539a0 = (max - max2) * 1000000;
                    sVar.f50551i.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + sVar.f50541b0 + ", targetBlurRadiusPx=" + (((sVar.N.f50343a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.f50539a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.f50580x0);
                    handler.post(sVar.f50580x0);
                    return;
                }
                return;
            default:
                final zh.m2 m2Var = (zh.m2) this.f48231b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f48232c;
                zh.g1 g1Var = (zh.g1) this.d;
                final View view = (View) this.e;
                vs0 vs0Var = m2Var.f53143a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f53144b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.o(savedStarGift, z11, false)) {
                    new zh.q2(m2Var.getContext(), vs0Var.f53232c, savedStarGift, m2Var.f53145c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((g1) view).d(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f53146f.v0(0);
                            return wc.b0(m2Var2.f53143a.f53230a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    wc.b0(vs0Var.f53230a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.t.q(R.string.Gift2Unpinned, wc.b0(vs0Var.f53230a), R.raw.ic_unpin, 36);
                }
                ((zh.g1) view).d(z11, true);
                m2Var.f53146f.v0(0);
                return;
        }
    }
}
