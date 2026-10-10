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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.or0;
import org.telegram.ui.rr0;
import yh.m5;
public final class f2 implements Runnable {
    public final int f46290a;
    public final int f46291b;
    public final KeyEvent.Callback f46292c;
    public final Object d;
    public final Object f46293e;
    public final Object f46294f;

    public f2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f46290a = i11;
        this.f46292c = callback;
        this.d = obj;
        this.f46291b = i10;
        this.f46293e = tLObject;
        this.f46294f = obj2;
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
        switch (this.f46290a) {
            case 0:
                o2 o2Var = (o2) this.f46292c;
                int i12 = this.f46291b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.f46293e;
                or0 or0Var = (or0) this.f46294f;
                if (o2Var.I != null && !o2Var.f46543y) {
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
                        l2Var2.f46390i.set(l2Var2.h);
                        matrix.mapRect(l2Var2.f46390i);
                        l2Var2.f46386c = i12;
                        Bitmap d = o2Var.d(0, 0, o2Var.I, false);
                        l2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l2Var2.f46388f = l2Var2.c();
                        o2.c(l2Var2, o2Var.T, o2Var.U);
                        o2Var.O = l2Var2.f46391j;
                        o2Var.P = l2Var2.f46392k;
                        arrayList.add(l2Var2);
                        AndroidUtilities.runOnUIThread(new rr0(o2Var, arrayList, or0Var, l2Var2, 24));
                        o2Var.E = l2Var2;
                        o2Var.f46543y = true;
                        o2Var.f46542x = false;
                        return;
                    }
                    int i13 = 0;
                    while (i13 < list.size()) {
                        n2 n2Var = (n2) list.get(i13);
                        l2 l2Var3 = new l2(o2Var);
                        l2Var3.h.set(n2Var.f46473b, n2Var.f46474c, i10 + n2Var.d, i11 + n2Var.f46475e);
                        l2Var3.f46390i.set(l2Var3.h);
                        matrix.mapRect(l2Var3.f46390i);
                        l2Var3.f46386c = i12;
                        Bitmap d10 = o2Var.d(n2Var.f46473b, n2Var.f46474c, n2Var.f46472a, false);
                        l2Var3.d = d10;
                        if (d10 != null) {
                            l2Var3.f46388f = l2Var3.c();
                            o2.c(l2Var3, o2Var.T, o2Var.U);
                            o2Var.O = l2Var3.f46391j;
                            o2Var.P = l2Var3.f46392k;
                            arrayList.add(l2Var3);
                        }
                        i13++;
                        l2Var = null;
                    }
                    o2Var.E = l2Var;
                    o2Var.f46543y = true;
                    o2Var.f46542x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(10, o2Var, arrayList));
                    return;
                }
                return;
            case 1:
                xh.r1 r1Var = (xh.r1) this.f46292c;
                Context context = (Context) this.d;
                int i14 = this.f46291b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f46293e;
                long j3 = r1Var.f51525c0;
                xh.o0 o0Var = new xh.o0(r1Var, (Utilities.Callback) this.f46294f, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = r1Var.f51524b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = r1Var.f51524b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new xh.u0(r1Var, context, i14, starGift, j3, o0Var, z10, z11).show();
                return;
            default:
                int i15 = this.f46291b;
                TLObject tLObject = (TLObject) this.f46293e;
                String str = (String) this.f46294f;
                ((ci.d) this.f46292c).setLoading(false);
                f3 f3Var = ((f3[]) this.d)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                m5.y(i15, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    ad.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
        }
    }

    public f2(o2 o2Var, int i10, List list, ArrayList arrayList, or0 or0Var) {
        this.f46290a = 0;
        this.f46292c = o2Var;
        this.f46291b = i10;
        this.d = list;
        this.f46293e = arrayList;
        this.f46294f = or0Var;
    }
}
