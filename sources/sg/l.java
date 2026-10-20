package sg;

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
    public boolean f46312a;
    public float f46313b;
    public float f46314c;
    public int d;
    public StaticLayout e;
    public Bitmap f46315f;
    public int f46316g;
    public int h;
    public int f46317i;
    public long f46318j;
    public float f46319k;
    public float f46320l;
    public final org.telegram.ui.Cells.u0 f46321m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.f46321m = u0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.f46321m;
        ArrayList arrayList2 = u0Var.f23213c;
        HashMap hashMap = (HashMap) u0Var.f23214f;
        RectF rectF = (RectF) u0Var.f23215g;
        this.f46318j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f46319k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f46326a[org.telegram.ui.Cells.c1.g(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f46319k *= 0.6f;
        } else if (str.length() > 5) {
            this.f46319k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.f23211a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f46317i = 0;
            this.h = 0;
            this.f46316g = 0;
        } else {
            this.f46316g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f46317i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f46315f = bitmap;
        if (bitmap == null) {
            this.f46315f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f46316g)), Math.max(1, this.f46317i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f46315f);
            canvas.translate(-this.f46316g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f46315f);
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
                if (!lVar.f46312a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f46319k / u0Var.f23212b) * lVar.h) * 1.1f) + lVar.f46313b) - abs3), Math.abs(lVar.f46313b - abs3));
                    float f16 = lVar.f46314c - abs4;
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
        this.f46313b = abs;
        this.f46314c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f46314c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f46320l = f7;
        this.f46312a = true;
    }
}
