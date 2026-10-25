package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;
public final class l {
    public boolean f48917a;
    public float f48918b;
    public float f48919c;
    public int d;
    public StaticLayout e;
    public Bitmap f48920f;
    public int f48921g;
    public int h;
    public int f48922i;
    public long f48923j;
    public float f48924k;
    public float f48925l;
    public final org.telegram.ui.Cells.t0 f48926m;

    public l(org.telegram.ui.Cells.t0 t0Var) {
        this.f48926m = t0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.t0 t0Var = this.f48926m;
        ArrayList arrayList2 = t0Var.f25425c;
        HashMap hashMap = (HashMap) t0Var.f25426f;
        RectF rectF = (RectF) t0Var.f25427g;
        this.f48923j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f48924k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f48928a[d3.j(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f48924k *= 0.6f;
        } else if (str.length() > 5) {
            this.f48924k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, t0Var.f25423a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f48922i = 0;
            this.h = 0;
            this.f48921g = 0;
        } else {
            this.f48921g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f48922i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f48920f = bitmap;
        if (bitmap == null) {
            this.f48920f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f48921g)), Math.max(1, this.f48922i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f48920f);
            canvas.translate(-this.f48921g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f48920f);
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
                if (!lVar.f48917a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f48924k / t0Var.f25424b) * lVar.h) * 1.1f) + lVar.f48918b) - abs3), Math.abs(lVar.f48918b - abs3));
                    float f16 = lVar.f48919c - abs4;
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
        this.f48918b = abs;
        this.f48919c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f48919c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f48925l = f7;
        this.f48917a = true;
    }
}
