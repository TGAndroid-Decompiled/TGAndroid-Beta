package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class k {
    public boolean f58837a;
    public float f58838b;
    public float f58839c;
    public int d;
    public StaticLayout f58840e;
    public Bitmap f58841f;
    public int f58842g;
    public int h;
    public int f58843i;
    public long f58844j;
    public float f58845k;
    public float f58846l;
    public final org.telegram.ui.Cells.t0 f58847m;

    public k(org.telegram.ui.Cells.t0 t0Var) {
        this.f58847m = t0Var;
    }

    public final void a(int i7, boolean z10) {
        float f10;
        ArrayList arrayList;
        org.telegram.ui.Cells.t0 t0Var = this.f58847m;
        ArrayList arrayList2 = t0Var.f31892c;
        HashMap hashMap = (HashMap) t0Var.f31894f;
        RectF rectF = (RectF) t0Var.f31895g;
        g5.a aVar = Utilities.f22876c;
        this.f58844j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f58845k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = l.f58874a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f58845k *= 0.6f;
        } else if (str.length() > 5) {
            this.f58845k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, t0Var.f31890a, org.telegram.messenger.g0.f24226q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f58840e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f58843i = 0;
            this.h = 0;
            this.f58842g = 0;
        } else {
            this.f58842g = (int) this.f58840e.getLineLeft(0);
            this.h = (int) this.f58840e.getLineWidth(0);
            this.f58843i = this.f58840e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f58841f = bitmap;
        if (bitmap == null) {
            this.f58841f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f58842g)), Math.max(1, this.f58843i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f58841f);
            canvas.translate(-this.f58842g, 0.0f);
            this.f58840e.draw(canvas);
            hashMap.put(str, this.f58841f);
        }
        float f11 = this.h / 4.0f;
        float f12 = rectF.left + f11;
        float f13 = rectF.right - f11;
        if (i7 % 2 == 0) {
            f13 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f12 = rectF.centerX() + (this.h / 2.0f);
        }
        float f14 = f13 - f12;
        float abs = Math.abs(((int) aVar.nextLong()) % f14) + f12;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
        int i10 = 0;
        float f15 = 0.0f;
        while (i10 < 10) {
            g5.a aVar2 = Utilities.f22876c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f14) + f12;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                k kVar = (k) arrayList2.get(i11);
                if (!kVar.f58837a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f58845k / t0Var.f31891b) * kVar.h) * 1.1f) + kVar.f58838b) - abs3), Math.abs(kVar.f58838b - abs3));
                    float f17 = kVar.f58839c - abs4;
                    float f18 = (f17 * f17) + (min * min);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f16 > f15) {
                abs2 = abs4;
                f15 = f16;
                abs = abs3;
            }
            i10++;
            arrayList2 = arrayList3;
        }
        this.f58838b = abs;
        this.f58839c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f58839c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        g5.a aVar3 = Utilities.f22876c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f10 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f58846l = f10;
        this.f58837a = true;
    }
}
