package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.q3;
public final class l {
    public boolean f42320a;
    public float f42321b;
    public float f42322c;
    public int d;
    public StaticLayout e;
    public Bitmap f42323f;
    public int f42324g;
    public int h;
    public int f42325i;
    public long f42326j;
    public float f42327k;
    public float f42328l;
    public final org.telegram.ui.Cells.u0 f42329m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.f42329m = u0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.f42329m;
        ArrayList arrayList2 = u0Var.f21387c;
        HashMap hashMap = (HashMap) u0Var.f21388f;
        RectF rectF = (RectF) u0Var.f21389g;
        this.f42326j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f42327k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f42331a[q3.c(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f42327k *= 0.6f;
        } else if (str.length() > 5) {
            this.f42327k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.f21385a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f42325i = 0;
            this.h = 0;
            this.f42324g = 0;
        } else {
            this.f42324g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f42325i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f42323f = bitmap;
        if (bitmap == null) {
            this.f42323f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f42324g)), Math.max(1, this.f42325i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f42323f);
            canvas.translate(-this.f42324g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f42323f);
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
                if (!lVar.f42320a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f42327k / u0Var.f21386b) * lVar.h) * 1.1f) + lVar.f42321b) - abs3), Math.abs(lVar.f42321b - abs3));
                    float f16 = lVar.f42322c - abs4;
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
        this.f42321b = abs;
        this.f42322c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f42322c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f42328l = f7;
        this.f42320a = true;
    }
}
