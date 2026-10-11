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
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ds0;
import org.telegram.ui.nr0;
import yh.n5;
public final class e2 implements Runnable {
    public final int f46351a;
    public final int f46352b;
    public final KeyEvent.Callback f46353c;
    public final Object d;
    public final Object f46354e;
    public final Object f46355f;

    public e2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f46351a = i11;
        this.f46353c = callback;
        this.d = obj;
        this.f46352b = i10;
        this.f46354e = tLObject;
        this.f46355f = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        k2 k2Var = null;
        switch (this.f46351a) {
            case 0:
                n2 n2Var = (n2) this.f46353c;
                int i12 = this.f46352b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.f46354e;
                nr0 nr0Var = (nr0) this.f46355f;
                if (n2Var.I != null && !n2Var.f46569y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i12);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i12 / 90) % 2 != 0) {
                        matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                    } else {
                        matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        k2 k2Var2 = new k2(n2Var);
                        k2Var2.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                        k2Var2.f46444i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.f46444i);
                        k2Var2.f46440c = i12;
                        Bitmap d = n2Var.d(0, 0, n2Var.I, false);
                        k2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        k2Var2.f46442f = k2Var2.c();
                        n2.c(k2Var2, n2Var.T, n2Var.U);
                        n2Var.O = k2Var2.f46445j;
                        n2Var.P = k2Var2.f46446k;
                        arrayList.add(k2Var2);
                        AndroidUtilities.runOnUIThread(new ds0(n2Var, arrayList, nr0Var, k2Var2, 24));
                        n2Var.E = k2Var2;
                        n2Var.f46569y = true;
                        n2Var.f46568x = false;
                        return;
                    }
                    int i13 = 0;
                    while (i13 < list.size()) {
                        m2 m2Var = (m2) list.get(i13);
                        k2 k2Var3 = new k2(n2Var);
                        k2Var3.h.set(m2Var.f46528b, m2Var.f46529c, i10 + m2Var.d, i11 + m2Var.f46530e);
                        k2Var3.f46444i.set(k2Var3.h);
                        matrix.mapRect(k2Var3.f46444i);
                        k2Var3.f46440c = i12;
                        Bitmap d10 = n2Var.d(m2Var.f46528b, m2Var.f46529c, m2Var.f46527a, false);
                        k2Var3.d = d10;
                        if (d10 != null) {
                            k2Var3.f46442f = k2Var3.c();
                            n2.c(k2Var3, n2Var.T, n2Var.U);
                            n2Var.O = k2Var3.f46445j;
                            n2Var.P = k2Var3.f46446k;
                            arrayList.add(k2Var3);
                        }
                        i13++;
                        k2Var = null;
                    }
                    n2Var.E = k2Var;
                    n2Var.f46569y = true;
                    n2Var.f46568x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(12, n2Var, arrayList));
                    return;
                }
                return;
            case 1:
                xh.r1 r1Var = (xh.r1) this.f46353c;
                Context context = (Context) this.d;
                int i14 = this.f46352b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f46354e;
                long j3 = r1Var.f51602c0;
                xh.o0 o0Var = new xh.o0(r1Var, (Utilities.Callback) this.f46355f, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = r1Var.f51601b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = r1Var.f51601b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new xh.u0(r1Var, context, i14, starGift, j3, o0Var, z10, z11).show();
                return;
            default:
                int i15 = this.f46352b;
                TLObject tLObject = (TLObject) this.f46354e;
                String str = (String) this.f46355f;
                ((ci.d) this.f46353c).setLoading(false);
                e3 e3Var = ((e3[]) this.d)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                n5.y(i15, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    ad.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
        }
    }

    public e2(n2 n2Var, int i10, List list, ArrayList arrayList, nr0 nr0Var) {
        this.f46351a = 0;
        this.f46353c = n2Var;
        this.f46352b = i10;
        this.d = list;
        this.f46354e = arrayList;
        this.f46355f = nr0Var;
    }
}
