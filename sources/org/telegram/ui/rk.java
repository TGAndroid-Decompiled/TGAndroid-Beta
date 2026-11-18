package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rk implements Runnable {
    public final int f51615a = 1;
    public final int f51616b;
    public final int f51617c;
    public final boolean d;
    public final Object f51618e;
    public final Object f51619f;
    public final Serializable h;

    public rk(h2.c cVar, Bitmap bitmap, int i7, int i10, String str, boolean z10) {
        this.f51618e = cVar;
        this.f51619f = bitmap;
        this.f51616b = i7;
        this.f51617c = i10;
        this.h = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.gc gcVar;
        int i7;
        int i10;
        int i11;
        Rect rect;
        int i12 = this.f51615a;
        Serializable serializable = this.h;
        int i13 = this.f51617c;
        int i14 = this.f51616b;
        Object obj = this.f51619f;
        Object obj2 = this.f51618e;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) serializable;
                bn bnVar = ((sk) obj2).f52015b;
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    org.telegram.messenger.mp.u1(i7).f25658g7.edit().remove("pin_" + bnVar.f46076l6).commit();
                    bnVar.gd(0, true);
                    gcVar = null;
                } else {
                    gcVar = null;
                    bnVar.getNotificationCenter().k(56, Long.valueOf(bnVar.f46076l6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(bnVar.f46010g5));
                }
                if (i13 == bnVar.R3) {
                    bnVar.P3 = gcVar;
                    return;
                }
                return;
            default:
                h2.c cVar = (h2.c) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) cVar.d;
                int i15 = cVar.f13729a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 != 90 && i14 != 270) {
                        i11 = round2;
                        i10 = round;
                    } else {
                        i10 = round2;
                        i11 = round;
                    }
                    int i16 = i15 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i16 + i10, i16 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i17 = i15 + round;
                    int i18 = i15 + round2;
                    Rect rect3 = new Rect(i15, i15, i17, i18);
                    float f10 = i15;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        rect = rect2;
                    } else {
                        rect = rect2;
                        if (i13 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i14);
                    float f11 = -i15;
                    org.telegram.messenger.n10.k(round2, 2.0f, f11, f11 - (round / 2.0f), canvas);
                    try {
                        canvas.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i15 > 0) {
                        float f12 = i17;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i18;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i17 + i15;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i18 + i15, paint);
                    }
                    org.telegram.messenger.g0.g3(new ai.n(cVar, str, createBitmap, this.d, bitmap));
                    return;
                }
                return;
        }
    }

    public rk(sk skVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.f51618e = skVar;
        this.d = z10;
        this.f51619f = arrayList;
        this.h = arrayList2;
        this.f51616b = i7;
        this.f51617c = i10;
    }
}
