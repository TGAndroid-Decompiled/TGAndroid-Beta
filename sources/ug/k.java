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
    public boolean f56570a;
    public float f56571b;
    public float f56572c;
    public int d;
    public StaticLayout f56573e;
    public Bitmap f56574f;
    public int f56575g;
    public int h;
    public int f56576i;
    public long f56577j;
    public float f56578k;
    public float f56579l;
    public final org.telegram.ui.Cells.r0 f56580m;

    public k(org.telegram.ui.Cells.r0 r0Var) {
        this.f56580m = r0Var;
    }

    public final void a(int i7, boolean z9) {
        float f10;
        ArrayList arrayList;
        org.telegram.ui.Cells.r0 r0Var = this.f56580m;
        ArrayList arrayList2 = r0Var.f30168c;
        HashMap hashMap = (HashMap) r0Var.f30170f;
        RectF rectF = (RectF) r0Var.f30171g;
        g5.a aVar = Utilities.f21332c;
        this.f56577j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f56578k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = l.f56599a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f56578k *= 0.6f;
        } else if (str.length() > 5) {
            this.f56578k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, r0Var.f30166a, org.telegram.messenger.g0.f22544q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f56573e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f56576i = 0;
            this.h = 0;
            this.f56575g = 0;
        } else {
            this.f56575g = (int) this.f56573e.getLineLeft(0);
            this.h = (int) this.f56573e.getLineWidth(0);
            this.f56576i = this.f56573e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f56574f = bitmap;
        if (bitmap == null) {
            this.f56574f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f56575g)), Math.max(1, this.f56576i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f56574f);
            canvas.translate(-this.f56575g, 0.0f);
            this.f56573e.draw(canvas);
            hashMap.put(str, this.f56574f);
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
            g5.a aVar2 = Utilities.f21332c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f14) + f12;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                k kVar = (k) arrayList2.get(i11);
                if (!kVar.f56570a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f56578k / r0Var.f30167b) * kVar.h) * 1.1f) + kVar.f56571b) - abs3), Math.abs(kVar.f56571b - abs3));
                    float f17 = kVar.f56572c - abs4;
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
        this.f56571b = abs;
        this.f56572c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f56572c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        g5.a aVar3 = Utilities.f21332c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z9) {
            f10 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f56579l = f10;
        this.f56570a = true;
    }
}
