package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j2;
public final class l {
    public boolean f50592a;
    public float f50593b;
    public float f50594c;
    public int d;
    public StaticLayout f50595e;
    public Bitmap f50596f;
    public int f50597g;
    public int h;
    public int f50598i;
    public long f50599j;
    public float f50600k;
    public float f50601l;
    public final org.telegram.ui.Cells.u0 f50602m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.f50602m = u0Var;
    }

    public final void a(int i9, boolean z10) {
        float f10;
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.f50602m;
        ArrayList arrayList2 = u0Var.f25722c;
        HashMap hashMap = (HashMap) u0Var.f25724f;
        RectF rectF = (RectF) u0Var.f25725g;
        this.f50599j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f50600k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f50604a[j2.e(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f50600k *= 0.6f;
        } else if (str.length() > 5) {
            this.f50600k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.f25720a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f50595e = staticLayout;
        int i10 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f50598i = 0;
            this.h = 0;
            this.f50597g = 0;
        } else {
            this.f50597g = (int) this.f50595e.getLineLeft(0);
            this.h = (int) this.f50595e.getLineWidth(0);
            this.f50598i = this.f50595e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f50596f = bitmap;
        if (bitmap == null) {
            this.f50596f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f50597g)), Math.max(1, this.f50598i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f50596f);
            canvas.translate(-this.f50597g, 0.0f);
            this.f50595e.draw(canvas);
            hashMap.put(str, this.f50596f);
        }
        float f11 = this.h / 4.0f;
        float f12 = rectF.left + f11;
        float f13 = rectF.right - f11;
        if (i9 % 2 == 0) {
            f13 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f12 = rectF.centerX() + (this.h / 2.0f);
        }
        float f14 = f13 - f12;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f14) + f12;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i11 = 0;
        float f15 = 0.0f;
        while (i11 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f14) + f12;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            while (i10 < arrayList2.size()) {
                l lVar = (l) arrayList2.get(i10);
                if (!lVar.f50592a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f50600k / u0Var.f25721b) * lVar.h) * 1.1f) + lVar.f50593b) - abs3), Math.abs(lVar.f50593b - abs3));
                    float f17 = lVar.f50594c - abs4;
                    float f18 = (f17 * f17) + (min * min);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                }
                i10++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f16 > f15) {
                abs = abs3;
                f15 = f16;
                abs2 = abs4;
            }
            i11++;
            arrayList2 = arrayList3;
            i10 = 0;
        }
        this.f50593b = abs;
        this.f50594c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f50594c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f10 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f50601l = f10;
        this.f50592a = true;
    }
}
