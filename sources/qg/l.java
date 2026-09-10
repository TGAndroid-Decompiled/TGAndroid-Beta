package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r6;
public final class l {
    public boolean f40791a;
    public float f40792b;
    public float f40793c;
    public int d;
    public StaticLayout e;
    public Bitmap f40794f;
    public int f40795g;
    public int h;
    public int f40796i;
    public long f40797j;
    public float f40798k;
    public float f40799l;
    public final org.telegram.ui.Cells.u0 f40800m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.f40800m = u0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.f40800m;
        ArrayList arrayList2 = u0Var.f20466c;
        HashMap hashMap = (HashMap) u0Var.f20467f;
        RectF rectF = (RectF) u0Var.f20468g;
        this.f40797j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f40798k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f40805a[r6.c(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f40798k *= 0.6f;
        } else if (str.length() > 5) {
            this.f40798k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.f20464a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f40796i = 0;
            this.h = 0;
            this.f40795g = 0;
        } else {
            this.f40795g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f40796i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f40794f = bitmap;
        if (bitmap == null) {
            this.f40794f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f40795g)), Math.max(1, this.f40796i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f40794f);
            canvas.translate(-this.f40795g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f40794f);
        }
        float f10 = this.h / 4.0f;
        float f11 = rectF.left + f10;
        float f12 = rectF.right - f10;
        if (i10 % 2 == 0) {
            f12 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f11 = rectF.centerX() + (this.h / 2.0f);
        }
        float f13 = f12 - f11;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f13) + f11;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f14 = 0.0f;
        while (i12 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f13) + f11;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f15 = 2.1474836E9f;
            while (i11 < arrayList2.size()) {
                l lVar = (l) arrayList2.get(i11);
                if (!lVar.f40791a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f40798k / u0Var.f20465b) * lVar.h) * 1.1f) + lVar.f40792b) - abs3), Math.abs(lVar.f40792b - abs3));
                    float f16 = lVar.f40793c - abs4;
                    float f17 = (f16 * f16) + (min * min);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f15 > f14) {
                abs = abs3;
                f14 = f15;
                abs2 = abs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.f40792b = abs;
        this.f40793c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f40793c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f40799l = f7;
        this.f40791a = true;
    }
}
