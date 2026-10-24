package si;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.up0;
import yh.g1;
import yh.l2;
import yh.o2;
public final class o implements Runnable {
    public final int f47176a;
    public final Object f47177b;
    public final Object f47178c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f47176a = i10;
        this.f47177b = obj;
        this.f47178c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        int a2;
        int max;
        int max2;
        String str = null;
        int i10 = 1;
        switch (this.f47176a) {
            case 0:
                t tVar = (t) this.f47177b;
                m0 m0Var = (m0) this.f47178c;
                m0 m0Var2 = (m0) this.d;
                Handler handler = (Handler) this.e;
                if (tVar.f47227r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f47201c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f47202d0 = m0Var;
                    tVar.f47203e0 = m0Var2;
                    String[] strArr = v0.f47273a;
                    synchronized (v0.class) {
                        v0.b();
                        if (m0Var != m0Var2) {
                            if (m0Var == m0.f47168b) {
                                i10 = 0;
                            }
                            a2 = v0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f47199b0 = a2;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f47197a0 = (max - max2) * 1000000;
                    tVar.f47209i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + tVar.f47199b0 + ", targetBlurRadiusPx=" + (((tVar.N.f47005a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f47197a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f47238x0);
                    handler.post(tVar.f47238x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47177b;
                Utilities.Callback callback = (Utilities.Callback) this.f47178c;
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
            case 2:
                final l2 l2Var = (l2) this.f47177b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f47178c;
                g1 g1Var = (g1) this.d;
                final View view = (View) this.e;
                ms0 ms0Var = l2Var.f50824a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = l2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(l2Var.f50825b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (l2Var.e.o(savedStarGift, z11, false)) {
                    new o2(l2Var.getContext(), ms0Var.f50925c, savedStarGift, l2Var.f50826c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((g1) view).d(z11, true);
                            l2 l2Var2 = l2.this;
                            l2Var2.f50827f.u0(0);
                            return vc.a0(l2Var2.f50824a.f50923a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    vc.a0(ms0Var.f50923a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.v0.p(R.string.Gift2Unpinned, vc.a0(ms0Var.f50923a), R.raw.ic_unpin, 36);
                }
                ((g1) view).d(z11, true);
                l2Var.f50827f.u0(0);
                return;
            case 3:
                d71 d71Var = (d71) this.f47177b;
                zh.b0 b0Var = (zh.b0) this.f47178c;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                if (zh.b0.d(d71Var.getParentActivity())) {
                    b0Var.e();
                    up0 up0Var = new up0(10, false, false, null);
                    up0Var.G = 1;
                    up0Var.H = false;
                    up0Var.f42471x = false;
                    up0Var.V = new zh.y(callbackReturn, d71Var, callback3);
                    d71Var.presentFragment(up0Var);
                    return;
                }
                return;
            default:
                String str2 = (String) this.f47177b;
                Utilities.CallbackReturn callbackReturn2 = (Utilities.CallbackReturn) this.f47178c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                try {
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str2, null, realScreenSize.x, realScreenSize.y, true);
                    if (loadBitmap != null) {
                        str = zh.b0.l(loadBitmap, callbackReturn2);
                        loadBitmap.recycle();
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                AndroidUtilities.runOnUIThread(new zh.x(o2Var, str, callback4));
                return;
        }
    }
}
