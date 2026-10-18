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
public final class yh1 implements Runnable {
    public final int f43400a;
    public final int f43401b;
    public final Object f43402c;
    public final Object d;
    public final Object e;
    public final Object f43403f;

    public yh1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f43400a = i11;
        this.f43402c = obj;
        this.f43401b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f43403f = obj4;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.f43400a) {
            case 0:
                int i12 = this.f43401b;
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f43402c)[0] = i12;
                h9Var.r(user);
                ((org.telegram.ui.Components.w9) this.f43403f).e(user, h9Var);
                return;
            case 1:
                rg.m2 m2Var = (rg.m2) this.f43402c;
                int i13 = this.f43401b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                yq0 yq0Var = (yq0) this.f43403f;
                if (m2Var.I != null && !m2Var.f45530y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / m2Var.I.getWidth(), 1.0f / m2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i13);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i13 / 90) % 2 != 0) {
                        matrix.postScale(m2Var.I.getHeight(), m2Var.I.getWidth());
                    } else {
                        matrix.postScale(m2Var.I.getWidth(), m2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.j2 j2Var = new rg.j2(m2Var);
                        j2Var.h.set(0.0f, 0.0f, m2Var.I.getWidth(), m2Var.I.getHeight());
                        j2Var.f45413i.set(j2Var.h);
                        matrix.mapRect(j2Var.f45413i);
                        j2Var.f45410c = i13;
                        Bitmap d = m2Var.d(0, 0, m2Var.I, false);
                        j2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        j2Var.f45411f = j2Var.c();
                        rg.m2.c(j2Var, m2Var.T, m2Var.U);
                        m2Var.O = j2Var.f45414j;
                        m2Var.P = j2Var.f45415k;
                        arrayList.add(j2Var);
                        AndroidUtilities.runOnUIThread(new hn0(m2Var, arrayList, yq0Var, j2Var, 28));
                        m2Var.E = j2Var;
                        m2Var.f45530y = true;
                        m2Var.f45529x = false;
                        return;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        rg.l2 l2Var = (rg.l2) list.get(i14);
                        rg.j2 j2Var2 = new rg.j2(m2Var);
                        j2Var2.h.set(l2Var.f45462b, l2Var.f45463c, i10 + l2Var.d, i11 + l2Var.e);
                        j2Var2.f45413i.set(j2Var2.h);
                        matrix.mapRect(j2Var2.f45413i);
                        j2Var2.f45410c = i13;
                        Bitmap d10 = m2Var.d(l2Var.f45462b, l2Var.f45463c, l2Var.f45461a, false);
                        j2Var2.d = d10;
                        if (d10 != null) {
                            j2Var2.f45411f = j2Var2.c();
                            rg.m2.c(j2Var2, m2Var.T, m2Var.U);
                            m2Var.O = j2Var2.f45414j;
                            m2Var.P = j2Var2.f45415k;
                            arrayList.add(j2Var2);
                        }
                    }
                    m2Var.E = null;
                    m2Var.f45530y = true;
                    m2Var.f45529x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g2(15, m2Var, arrayList));
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f43402c;
                Context context = (Context) this.d;
                int i15 = this.f43401b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = o1Var.f50424c0;
                yh.l0 l0Var = new yh.l0(o1Var, (Utilities.Callback) this.f43403f, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                boolean z13 = true;
                if (z11 && (disallowedGiftsSettings2 = o1Var.f50423b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (!z11 || (disallowedGiftsSettings = o1Var.f50423b0) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                    z13 = z10;
                }
                new yh.r0(o1Var, context, i15, starGift, j10, l0Var, z12, z13).show();
                return;
        }
    }

    public yh1(yh.o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.f43400a = 2;
        this.f43402c = o1Var;
        this.d = context;
        this.f43401b = i10;
        this.e = starGift;
        this.f43403f = callback;
    }
}
