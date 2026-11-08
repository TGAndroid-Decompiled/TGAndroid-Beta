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
    public boolean f56663a;
    public float f56664b;
    public float f56665c;
    public int d;
    public StaticLayout f56666e;
    public Bitmap f56667f;
    public int f56668g;
    public int h;
    public int f56669i;
    public long f56670j;
    public float f56671k;
    public float f56672l;
    public final org.telegram.ui.Cells.r0 f56673m;

    public k(org.telegram.ui.Cells.r0 r0Var) {
        this.f56673m = r0Var;
    }

    public final void a(int i7, boolean z9) {
        float f10;
        ArrayList arrayList;
        org.telegram.ui.Cells.r0 r0Var = this.f56673m;
        ArrayList arrayList2 = r0Var.f30172c;
        HashMap hashMap = (HashMap) r0Var.f30174f;
        RectF rectF = (RectF) r0Var.f30175g;
        g5.a aVar = Utilities.f21335c;
        this.f56670j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f56671k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = l.f56692a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f56671k *= 0.6f;
        } else if (str.length() > 5) {
            this.f56671k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, r0Var.f30170a, org.telegram.messenger.g0.f22563q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f56666e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f56669i = 0;
            this.h = 0;
            this.f56668g = 0;
        } else {
            this.f56668g = (int) this.f56666e.getLineLeft(0);
            this.h = (int) this.f56666e.getLineWidth(0);
            this.f56669i = this.f56666e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f56667f = bitmap;
        if (bitmap == null) {
            this.f56667f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f56668g)), Math.max(1, this.f56669i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f56667f);
            canvas.translate(-this.f56668g, 0.0f);
            this.f56666e.draw(canvas);
            hashMap.put(str, this.f56667f);
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
            g5.a aVar2 = Utilities.f21335c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f14) + f12;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                k kVar = (k) arrayList2.get(i11);
                if (!kVar.f56663a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f56671k / r0Var.f30171b) * kVar.h) * 1.1f) + kVar.f56664b) - abs3), Math.abs(kVar.f56664b - abs3));
                    float f17 = kVar.f56665c - abs4;
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
        this.f56664b = abs;
        this.f56665c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f56665c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        g5.a aVar3 = Utilities.f21335c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z9) {
            f10 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f56672l = f10;
        this.f56663a = true;
    }
}
