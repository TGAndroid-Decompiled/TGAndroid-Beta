package qg;

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
import org.telegram.ui.gs0;
import org.telegram.ui.qr0;
import yh.n5;
public final class f2 implements Runnable {
    public final int f46191a;
    public final int f46192b;
    public final KeyEvent.Callback f46193c;
    public final Object d;
    public final Object f46194e;
    public final Object f46195f;

    public f2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f46191a = i11;
        this.f46193c = callback;
        this.d = obj;
        this.f46192b = i10;
        this.f46194e = tLObject;
        this.f46195f = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        l2 l2Var = null;
        switch (this.f46191a) {
            case 0:
                o2 o2Var = (o2) this.f46193c;
                int i12 = this.f46192b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.f46194e;
                qr0 qr0Var = (qr0) this.f46195f;
                if (o2Var.I != null && !o2Var.f46444y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o2Var.I.getWidth(), 1.0f / o2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i12);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i12 / 90) % 2 != 0) {
                        matrix.postScale(o2Var.I.getHeight(), o2Var.I.getWidth());
                    } else {
                        matrix.postScale(o2Var.I.getWidth(), o2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        l2 l2Var2 = new l2(o2Var);
                        l2Var2.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var2.f46291i.set(l2Var2.h);
                        matrix.mapRect(l2Var2.f46291i);
                        l2Var2.f46287c = i12;
                        Bitmap d = o2Var.d(0, 0, o2Var.I, false);
                        l2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l2Var2.f46289f = l2Var2.c();
                        o2.c(l2Var2, o2Var.T, o2Var.U);
                        o2Var.O = l2Var2.f46292j;
                        o2Var.P = l2Var2.f46293k;
                        arrayList.add(l2Var2);
                        AndroidUtilities.runOnUIThread(new gs0(o2Var, arrayList, qr0Var, l2Var2, 23));
                        o2Var.E = l2Var2;
                        o2Var.f46444y = true;
                        o2Var.f46443x = false;
                        return;
                    }
                    int i13 = 0;
                    while (i13 < list.size()) {
                        n2 n2Var = (n2) list.get(i13);
                        l2 l2Var3 = new l2(o2Var);
                        l2Var3.h.set(n2Var.f46374b, n2Var.f46375c, i10 + n2Var.d, i11 + n2Var.f46376e);
                        l2Var3.f46291i.set(l2Var3.h);
                        matrix.mapRect(l2Var3.f46291i);
                        l2Var3.f46287c = i12;
                        Bitmap d10 = o2Var.d(n2Var.f46374b, n2Var.f46375c, n2Var.f46373a, false);
                        l2Var3.d = d10;
                        if (d10 != null) {
                            l2Var3.f46289f = l2Var3.c();
                            o2.c(l2Var3, o2Var.T, o2Var.U);
                            o2Var.O = l2Var3.f46292j;
                            o2Var.P = l2Var3.f46293k;
                            arrayList.add(l2Var3);
                        }
                        i13++;
                        l2Var = null;
                    }
                    o2Var.E = l2Var;
                    o2Var.f46444y = true;
                    o2Var.f46443x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(9, o2Var, arrayList));
                    return;
                }
                return;
            case 1:
                xh.q1 q1Var = (xh.q1) this.f46193c;
                Context context = (Context) this.d;
                int i14 = this.f46192b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f46194e;
                long j3 = q1Var.f51698c0;
                xh.o0 o0Var = new xh.o0(q1Var, (Utilities.Callback) this.f46195f, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = q1Var.f51697b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = q1Var.f51697b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new xh.t0(q1Var, context, i14, starGift, j3, o0Var, z10, z11).show();
                return;
            default:
                int i15 = this.f46192b;
                TLObject tLObject = (TLObject) this.f46194e;
                String str = (String) this.f46195f;
                ((ci.d) this.f46193c).setLoading(false);
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

    public f2(o2 o2Var, int i10, List list, ArrayList arrayList, qr0 qr0Var) {
        this.f46191a = 0;
        this.f46193c = o2Var;
        this.f46192b = i10;
        this.d = list;
        this.f46194e = arrayList;
        this.f46195f = qr0Var;
    }
}
