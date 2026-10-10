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
public final class l {
    public boolean f47354a;
    public float f47355b;
    public float f47356c;
    public int d;
    public StaticLayout f47357e;
    public Bitmap f47358f;
    public int f47359g;
    public int h;
    public int f47360i;
    public long f47361j;
    public float f47362k;
    public float f47363l;
    public final org.telegram.ui.Cells.u0 f47364m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.f47364m = u0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.f47364m;
        ArrayList arrayList2 = u0Var.f23108c;
        HashMap hashMap = (HashMap) u0Var.f23110f;
        RectF rectF = (RectF) u0Var.f23111g;
        this.f47361j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f47362k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f47390a[org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f47362k *= 0.6f;
        } else if (str.length() > 5) {
            this.f47362k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.f23106a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f47357e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f47360i = 0;
            this.h = 0;
            this.f47359g = 0;
        } else {
            this.f47359g = (int) this.f47357e.getLineLeft(0);
            this.h = (int) this.f47357e.getLineWidth(0);
            this.f47360i = this.f47357e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f47358f = bitmap;
        if (bitmap == null) {
            this.f47358f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f47359g)), Math.max(1, this.f47360i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f47358f);
            canvas.translate(-this.f47359g, 0.0f);
            this.f47357e.draw(canvas);
            hashMap.put(str, this.f47358f);
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
                if (!lVar.f47354a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f47362k / u0Var.f23107b) * lVar.h) * 1.1f) + lVar.f47355b) - abs3), Math.abs(lVar.f47355b - abs3));
                    float f16 = lVar.f47356c - abs4;
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
        this.f47355b = abs;
        this.f47356c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f47356c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f47363l = f7;
        this.f47354a = true;
    }
}
