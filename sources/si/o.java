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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sp0;
import yh.g1;
import yh.l2;
import yh.o2;
public final class o implements Runnable {
    public final int f46741a;
    public final Object f46742b;
    public final Object f46743c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f46741a = i10;
        this.f46742b = obj;
        this.f46743c = obj2;
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
        switch (this.f46741a) {
            case 0:
                t tVar = (t) this.f46742b;
                l0 l0Var = (l0) this.f46743c;
                l0 l0Var2 = (l0) this.d;
                Handler handler = (Handler) this.e;
                if (tVar.f46815r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.f46789c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.f46790d0 = l0Var;
                    tVar.f46791e0 = l0Var2;
                    String[] strArr = t0.f46829a;
                    synchronized (t0.class) {
                        t0.b();
                        if (l0Var != l0Var2) {
                            if (l0Var == l0.f46708b) {
                                i10 = 0;
                            }
                            a2 = t0.a(i10);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    tVar.f46787b0 = a2;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.f46785a0 = (max - max2) * 1000000;
                    tVar.f46797i.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + tVar.f46787b0 + ", targetBlurRadiusPx=" + (((tVar.N.f46570a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f46785a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.f46826x0);
                    handler.post(tVar.f46826x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f46742b;
                Utilities.Callback callback = (Utilities.Callback) this.f46743c;
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
                final l2 l2Var = (l2) this.f46742b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f46743c;
                g1 g1Var = (g1) this.d;
                final View view = (View) this.e;
                ks0 ks0Var = l2Var.f50365a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = l2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(l2Var.f50366b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (l2Var.e.o(savedStarGift, z11, false)) {
                    new o2(l2Var.getContext(), ks0Var.f50465c, savedStarGift, l2Var.f50367c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((g1) view).c(z11, true);
                            l2 l2Var2 = l2.this;
                            l2Var2.f50368f.u0(0);
                            return xc.a0(l2Var2.f50365a.f50463a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    xc.a0(ks0Var.f50463a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, xc.a0(ks0Var.f50463a), R.raw.ic_unpin, 36);
                }
                ((g1) view).c(z11, true);
                l2Var.f50368f.u0(0);
                return;
            case 3:
                x61 x61Var = (x61) this.f46742b;
                zh.b0 b0Var = (zh.b0) this.f46743c;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                if (zh.b0.d(x61Var.getParentActivity())) {
                    b0Var.e();
                    sp0 sp0Var = new sp0(10, false, false, null);
                    sp0Var.G = 1;
                    sp0Var.H = false;
                    sp0Var.f41514x = false;
                    sp0Var.V = new zh.y(callbackReturn, x61Var, callback3);
                    x61Var.presentFragment(sp0Var);
                    return;
                }
                return;
            default:
                String str2 = (String) this.f46742b;
                Utilities.CallbackReturn callbackReturn2 = (Utilities.CallbackReturn) this.f46743c;
                n2 n2Var = (n2) this.d;
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
                AndroidUtilities.runOnUIThread(new zh.x(n2Var, str, callback4));
                return;
        }
    }
}
