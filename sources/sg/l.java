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
    public boolean f45239a;
    public float f45240b;
    public float f45241c;
    public int d;
    public StaticLayout e;
    public Bitmap f45242f;
    public int f45243g;
    public int h;
    public int f45244i;
    public long f45245j;
    public float f45246k;
    public float f45247l;
    public final org.telegram.ui.Cells.v0 f45248m;

    public l(org.telegram.ui.Cells.v0 v0Var) {
        this.f45248m = v0Var;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        org.telegram.ui.Cells.v0 v0Var = this.f45248m;
        ArrayList arrayList2 = v0Var.f22552c;
        HashMap hashMap = (HashMap) v0Var.f22553f;
        RectF rectF = (RectF) v0Var.f22554g;
        this.f45245j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f45246k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.f45250a[org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f45246k *= 0.6f;
        } else if (str.length() > 5) {
            this.f45246k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, v0Var.f22550a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f45244i = 0;
            this.h = 0;
            this.f45243g = 0;
        } else {
            this.f45243g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f45244i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f45242f = bitmap;
        if (bitmap == null) {
            this.f45242f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f45243g)), Math.max(1, this.f45244i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f45242f);
            canvas.translate(-this.f45243g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f45242f);
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
                if (!lVar.f45239a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f45246k / v0Var.f22551b) * lVar.h) * 1.1f) + lVar.f45240b) - abs3), Math.abs(lVar.f45240b - abs3));
                    float f16 = lVar.f45241c - abs4;
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
        this.f45240b = abs;
        this.f45241c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f45241c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f45247l = f7;
        this.f45239a = true;
    }
}
