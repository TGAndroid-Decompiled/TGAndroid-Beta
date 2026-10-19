package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wh1 implements Runnable {
    public final int f42879a;
    public final int f42880b;
    public final Object f42881c;
    public final Object d;
    public final Object e;
    public final Object f42882f;

    public wh1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f42879a = i11;
        this.f42881c = obj;
        this.f42880b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f42882f = obj4;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.f42879a) {
            case 0:
                int i12 = this.f42880b;
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f42881c)[0] = i12;
                h9Var.r(user);
                ((org.telegram.ui.Components.w9) this.f42882f).e(user, h9Var);
                return;
            case 1:
                rg.n2 n2Var = (rg.n2) this.f42881c;
                int i13 = this.f42880b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                wq0 wq0Var = (wq0) this.f42882f;
                if (n2Var.I != null && !n2Var.f45540y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i13);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i13 / 90) % 2 != 0) {
                        matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                    } else {
                        matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.k2 k2Var = new rg.k2(n2Var);
                        k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                        k2Var.f45420i.set(k2Var.h);
                        matrix.mapRect(k2Var.f45420i);
                        k2Var.f45417c = i13;
                        Bitmap d = n2Var.d(0, 0, n2Var.I, false);
                        k2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        k2Var.f45418f = k2Var.c();
                        rg.n2.c(k2Var, n2Var.T, n2Var.U);
                        n2Var.O = k2Var.f45421j;
                        n2Var.P = k2Var.f45422k;
                        arrayList.add(k2Var);
                        AndroidUtilities.runOnUIThread(new fn0(n2Var, arrayList, wq0Var, k2Var, 28));
                        n2Var.E = k2Var;
                        n2Var.f45540y = true;
                        n2Var.f45539x = false;
                        return;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        rg.m2 m2Var = (rg.m2) list.get(i14);
                        rg.k2 k2Var2 = new rg.k2(n2Var);
                        k2Var2.h.set(m2Var.f45502b, m2Var.f45503c, i10 + m2Var.d, i11 + m2Var.e);
                        k2Var2.f45420i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.f45420i);
                        k2Var2.f45417c = i13;
                        Bitmap d10 = n2Var.d(m2Var.f45502b, m2Var.f45503c, m2Var.f45501a, false);
                        k2Var2.d = d10;
                        if (d10 != null) {
                            k2Var2.f45418f = k2Var2.c();
                            rg.n2.c(k2Var2, n2Var.T, n2Var.U);
                            n2Var.O = k2Var2.f45421j;
                            n2Var.P = k2Var2.f45422k;
                            arrayList.add(k2Var2);
                        }
                    }
                    n2Var.E = null;
                    n2Var.f45540y = true;
                    n2Var.f45539x = false;
                    AndroidUtilities.runOnUIThread(new p2.b(14, n2Var, arrayList));
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f42881c;
                Context context = (Context) this.d;
                int i15 = this.f42880b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = o1Var.f50423c0;
                yh.l0 l0Var = new yh.l0(o1Var, (Utilities.Callback) this.f42882f, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                boolean z13 = true;
                if (z11 && (disallowedGiftsSettings2 = o1Var.f50422b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (!z11 || (disallowedGiftsSettings = o1Var.f50422b0) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                    z13 = z10;
                }
                new yh.r0(o1Var, context, i15, starGift, j10, l0Var, z12, z13).show();
                return;
        }
    }

    public wh1(yh.o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.f42879a = 2;
        this.f42881c = o1Var;
        this.d = context;
        this.f42880b = i10;
        this.e = starGift;
        this.f42882f = callback;
    }
}
