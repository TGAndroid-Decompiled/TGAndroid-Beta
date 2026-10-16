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
import org.telegram.ui.tr0;
import org.telegram.ui.yw0;
import zh.n5;
public final class g2 implements Runnable {
    public final int f44027a;
    public final int f44028b;
    public final KeyEvent.Callback f44029c;
    public final Object d;
    public final Object e;
    public final Object f44030f;

    public g2(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f44027a = i11;
        this.f44029c = callback;
        this.d = obj;
        this.f44028b = i10;
        this.e = tLObject;
        this.f44030f = obj2;
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
        switch (this.f44027a) {
            case 0:
                p2 p2Var = (p2) this.f44029c;
                int i12 = this.f44028b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                tr0 tr0Var = (tr0) this.f44030f;
                if (p2Var.I != null && !p2Var.f44237y) {
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
                        m2Var2.f44116i.set(m2Var2.h);
                        matrix.mapRect(m2Var2.f44116i);
                        m2Var2.f44113c = i12;
                        Bitmap d = p2Var.d(0, 0, p2Var.I, false);
                        m2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        m2Var2.f44114f = m2Var2.c();
                        p2.c(m2Var2, p2Var.T, p2Var.U);
                        p2Var.O = m2Var2.f44117j;
                        p2Var.P = m2Var2.f44118k;
                        arrayList.add(m2Var2);
                        AndroidUtilities.runOnUIThread(new yw0(p2Var, arrayList, tr0Var, m2Var2, 22));
                        p2Var.E = m2Var2;
                        p2Var.f44237y = true;
                        p2Var.f44236x = false;
                        return;
                    }
                    int i13 = 0;
                    while (i13 < list.size()) {
                        o2 o2Var = (o2) list.get(i13);
                        m2 m2Var3 = new m2(p2Var);
                        m2Var3.h.set(o2Var.f44198b, o2Var.f44199c, i10 + o2Var.d, i11 + o2Var.e);
                        m2Var3.f44116i.set(m2Var3.h);
                        matrix.mapRect(m2Var3.f44116i);
                        m2Var3.f44113c = i12;
                        Bitmap d10 = p2Var.d(o2Var.f44198b, o2Var.f44199c, o2Var.f44197a, false);
                        m2Var3.d = d10;
                        if (d10 != null) {
                            m2Var3.f44114f = m2Var3.c();
                            p2.c(m2Var3, p2Var.T, p2Var.U);
                            p2Var.O = m2Var3.f44117j;
                            p2Var.P = m2Var3.f44118k;
                            arrayList.add(m2Var3);
                        }
                        i13++;
                        m2Var = null;
                    }
                    p2Var.E = m2Var;
                    p2Var.f44237y = true;
                    p2Var.f44236x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.v(23, p2Var, arrayList));
                    return;
                }
                return;
            case 1:
                yh.p1 p1Var = (yh.p1) this.f44029c;
                Context context = (Context) this.d;
                int i14 = this.f44028b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = p1Var.f49058c0;
                yh.n0 n0Var = new yh.n0(p1Var, (Utilities.Callback) this.f44030f, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = p1Var.f49057b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = p1Var.f49057b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new yh.s0(p1Var, context, i14, starGift, j10, n0Var, z10, z11).show();
                return;
            default:
                int i15 = this.f44028b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f44030f;
                ((di.d) this.f44029c).setLoading(false);
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

    public g2(p2 p2Var, int i10, List list, ArrayList arrayList, tr0 tr0Var) {
        this.f44027a = 0;
        this.f44029c = p2Var;
        this.f44028b = i10;
        this.d = list;
        this.e = arrayList;
        this.f44030f = tr0Var;
    }
}
