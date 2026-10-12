package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.ss0;
import org.telegram.ui.ur0;
import zh.n5;
public final class g2 implements Runnable {
    public final int f44268a;
    public final int f44269b;
    public final KeyEvent.Callback f44270c;
    public final Object d;
    public final Object e;
    public final Object f44271f;

    public g2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f44268a = i11;
        this.f44270c = callback;
        this.d = obj;
        this.f44269b = i10;
        this.e = tLObject;
        this.f44271f = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        m2 m2Var = null;
        switch (this.f44268a) {
            case 0:
                p2 p2Var = (p2) this.f44270c;
                int i12 = this.f44269b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ur0 ur0Var = (ur0) this.f44271f;
                if (p2Var.I != null && !p2Var.f44478y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i12);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i12 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        m2 m2Var2 = new m2(p2Var);
                        m2Var2.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var2.f44357i.set(m2Var2.h);
                        matrix.mapRect(m2Var2.f44357i);
                        m2Var2.f44354c = i12;
                        Bitmap d = p2Var.d(0, 0, p2Var.I, false);
                        m2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        m2Var2.f44355f = m2Var2.c();
                        p2.c(m2Var2, p2Var.T, p2Var.U);
                        p2Var.O = m2Var2.f44358j;
                        p2Var.P = m2Var2.f44359k;
                        arrayList.add(m2Var2);
                        AndroidUtilities.runOnUIThread(new ss0(p2Var, arrayList, ur0Var, m2Var2, 23));
                        p2Var.E = m2Var2;
                        p2Var.f44478y = true;
                        p2Var.f44477x = false;
                        return;
                    }
                    int i13 = 0;
                    while (i13 < list.size()) {
                        o2 o2Var = (o2) list.get(i13);
                        m2 m2Var3 = new m2(p2Var);
                        m2Var3.h.set(o2Var.f44439b, o2Var.f44440c, i10 + o2Var.d, i11 + o2Var.e);
                        m2Var3.f44357i.set(m2Var3.h);
                        matrix.mapRect(m2Var3.f44357i);
                        m2Var3.f44354c = i12;
                        Bitmap d10 = p2Var.d(o2Var.f44439b, o2Var.f44440c, o2Var.f44438a, false);
                        m2Var3.d = d10;
                        if (d10 != null) {
                            m2Var3.f44355f = m2Var3.c();
                            p2.c(m2Var3, p2Var.T, p2Var.U);
                            p2Var.O = m2Var3.f44358j;
                            p2Var.P = m2Var3.f44359k;
                            arrayList.add(m2Var3);
                        }
                        i13++;
                        m2Var = null;
                    }
                    p2Var.E = m2Var;
                    p2Var.f44478y = true;
                    p2Var.f44477x = false;
                    AndroidUtilities.runOnUIThread(new t8(28, p2Var, arrayList));
                    return;
                }
                return;
            case 1:
                yh.p1 p1Var = (yh.p1) this.f44270c;
                Context context = (Context) this.d;
                int i14 = this.f44269b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = p1Var.f49059c0;
                yh.n0 n0Var = new yh.n0(p1Var, (Utilities.Callback) this.f44271f, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = p1Var.f49058b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = p1Var.f49058b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new yh.s0(p1Var, context, i14, starGift, j10, n0Var, z10, z11).show();
                return;
            default:
                int i15 = this.f44269b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f44271f;
                ((di.d) this.f44270c).setLoading(false);
                e3 e3Var = ((e3[]) this.d)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                n5.y(i15, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    zc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
        }
    }

    public g2(p2 p2Var, int i10, List list, ArrayList arrayList, ur0 ur0Var) {
        this.f44268a = 0;
        this.f44270c = p2Var;
        this.f44269b = i10;
        this.d = list;
        this.e = arrayList;
        this.f44271f = ur0Var;
    }
}
