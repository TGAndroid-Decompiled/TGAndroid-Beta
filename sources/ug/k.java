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
    public boolean f58757a;
    public float f58758b;
    public float f58759c;
    public int d;
    public StaticLayout f58760e;
    public Bitmap f58761f;
    public int f58762g;
    public int h;
    public int f58763i;
    public long f58764j;
    public float f58765k;
    public float f58766l;
    public final org.telegram.ui.Cells.t0 f58767m;

    public k(org.telegram.ui.Cells.t0 t0Var) {
        this.f58767m = t0Var;
    }

    public final void a(int i7, boolean z10) {
        float f10;
        ArrayList arrayList;
        org.telegram.ui.Cells.t0 t0Var = this.f58767m;
        ArrayList arrayList2 = t0Var.f31830c;
        HashMap hashMap = (HashMap) t0Var.f31832f;
        RectF rectF = (RectF) t0Var.f31833g;
        g5.a aVar = Utilities.f22809c;
        this.f58764j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f58765k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = l.f58794a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f58765k *= 0.6f;
        } else if (str.length() > 5) {
            this.f58765k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, t0Var.f31828a, org.telegram.messenger.g0.f24046q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f58760e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f58763i = 0;
            this.h = 0;
            this.f58762g = 0;
        } else {
            this.f58762g = (int) this.f58760e.getLineLeft(0);
            this.h = (int) this.f58760e.getLineWidth(0);
            this.f58763i = this.f58760e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f58761f = bitmap;
        if (bitmap == null) {
            this.f58761f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f58762g)), Math.max(1, this.f58763i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f58761f);
            canvas.translate(-this.f58762g, 0.0f);
            this.f58760e.draw(canvas);
            hashMap.put(str, this.f58761f);
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
            g5.a aVar2 = Utilities.f22809c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f14) + f12;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                k kVar = (k) arrayList2.get(i11);
                if (!kVar.f58757a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f58765k / t0Var.f31829b) * kVar.h) * 1.1f) + kVar.f58758b) - abs3), Math.abs(kVar.f58758b - abs3));
                    float f17 = kVar.f58759c - abs4;
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
        this.f58758b = abs;
        this.f58759c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f58759c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        g5.a aVar3 = Utilities.f22809c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f10 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f58766l = f10;
        this.f58757a = true;
    }
}
