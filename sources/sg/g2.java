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
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.fr0;
public final class g2 implements Runnable {
    public final int f48258a;
    public final Object f48259b;
    public final Object f48260c;
    public final Object d;
    public final Object e;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f48258a = i10;
        this.f48259b = obj;
        this.f48260c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        int i10 = 1;
        switch (this.f48258a) {
            case 0:
                o2 o2Var = (o2) this.f48259b;
                o2Var.G = true;
                o2Var.H = (l2[]) ((ArrayList) this.f48260c).toArray(new l2[0]);
                ((fr0) this.d).run((l2) this.e);
                return;
            case 1:
                o2 o2Var2 = (o2) this.f48259b;
                TLObject tLObject = (TLObject) this.f48260c;
                m2 m2Var = (m2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    o2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    m2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, m2Var.f48401c);
                    m2Var.f48402f = tL_messageMediaDocument;
                    o2Var2.a();
                    return;
                }
                o2Var2.h();
                o2Var2.n(tL_error);
                return;
            case 2:
                ti.e eVar = (ti.e) this.f48259b;
                ((ArrayDeque) eVar.f49219b).addLast(new ti.d((jg.e1) this.f48260c, (ti.a) this.d, (RequestTimeDelegate) this.e));
                eVar.r();
                return;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48259b;
                Utilities.Callback callback = (Utilities.Callback) this.f48260c;
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
                vi.s sVar = (vi.s) this.f48259b;
                vi.n0 n0Var = (vi.n0) this.f48260c;
                vi.n0 n0Var2 = (vi.n0) this.d;
                Handler handler = (Handler) this.e;
                if (sVar.f50608r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.f50582c0 = 0.0f;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.f50583d0 = n0Var;
                    sVar.f50584e0 = n0Var2;
                    String[] strArr = vi.v0.f50659a;
                    synchronized (vi.v0.class) {
                        vi.v0.b();
                        if (n0Var != n0Var2) {
                            if (n0Var == vi.n0.f50558b) {
                                i10 = 0;
                            }
                            a2 = vi.v0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    sVar.f50580b0 = a2;
                    sVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.f50578a0 = (max - max2) * 1000000;
                    sVar.f50590i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + sVar.f50580b0 + ", targetBlurRadiusPx=" + (((sVar.N.f50384a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.f50578a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.f50619x0);
                    handler.post(sVar.f50619x0);
                    return;
                }
                return;
            default:
                final zh.m2 m2Var2 = (zh.m2) this.f48259b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f48260c;
                zh.g1 g1Var = (zh.g1) this.d;
                final View view = (View) this.e;
                ws0 ws0Var = m2Var2.f53201a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var2.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var2.f53202b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var2.e.o(savedStarGift, z11, false)) {
                    new zh.q2(m2Var2.getContext(), ws0Var.f53290c, savedStarGift, m2Var2.f53203c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((g1) view).d(z11, true);
                            m2 m2Var3 = m2.this;
                            m2Var3.f53204f.v0(0);
                            return wc.b0(m2Var3.f53201a.f53288a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    wc.b0(ws0Var.f53288a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.t.q(R.string.Gift2Unpinned, wc.b0(ws0Var.f53288a), R.raw.ic_unpin, 36);
                }
                ((zh.g1) view).d(z11, true);
                m2Var2.f53204f.v0(0);
                return;
        }
    }
}
