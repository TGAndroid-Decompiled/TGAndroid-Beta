package yh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class j8 {
    public final int f47284a;
    public final ArrayList f47285b;
    public final Bitmap d;
    public int e;
    public int f47290j;
    public e0.i0 f47292l;
    public final Paint f47293m;
    public long f47294n;
    public long f47295o;
    public final RectF f47286c = new RectF();
    public final Paint f47287f = new Paint(3);
    public final Rect f47288g = new Rect();
    public float h = 1.0f;
    public final float f47289i = 1.0f;
    public boolean f47291k = true;

    public j8(int i10, int i11) {
        this.f47284a = i10;
        this.f47290j = i11;
        this.f47285b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47285b.add(new i8(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = dp >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.i0 i0Var = new e0.i0(i11);
            this.f47292l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7786a; i14++) {
                e0.i0.c((float[]) i0Var.f7788c, i14, 0.0f, 0.0f, width, height);
            }
            this.f47293m = g0.a.a(createBitmap);
            return;
        }
        this.f47292l = null;
        this.f47293m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f47290j;
        ArrayList arrayList = this.f47285b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47292l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                i8 i8Var = (i8) arrayList.get(i12);
                float f11 = i8Var.f47257i * i8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f47292l;
                float f14 = i8Var.f47252a;
                float f15 = i8Var.f47253b;
                e0.i0.c((float[]) i0Var.f7787b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47292l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(i8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47292l, min, this.f47293m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47287f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                i8 i8Var2 = (i8) arrayList.get(i13);
                float f16 = i8Var2.h * f7;
                j8 j8Var = i8Var2.f47258j;
                Paint paint = j8Var.f47287f;
                Rect rect = j8Var.f47288g;
                Bitmap bitmap2 = j8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (i8Var2.f47252a - ((((bitmap2.getWidth() / f10) * i8Var2.f47257i) * i8Var2.e) * f16)), (int) (i8Var2.f47253b - ((((bitmap2.getHeight() / f10) * i8Var2.f47257i) * i8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * i8Var2.f47257i, i8Var2.e, f16, i8Var2.f47252a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * i8Var2.f47257i, i8Var2.e, f16, i8Var2.f47253b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f47291k = false;
    }

    public final void c(i8 i8Var, long j3, boolean z10) {
        long j10;
        i8Var.f47255f = j3;
        i8Var.f47256g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f47289i;
        if (z10) {
            i8Var.f47255f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f47286c;
        i8Var.f47252a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        i8Var.f47253b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f47284a == 0) {
            i8Var.f47254c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            i8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            i8Var.f47254c = rectF.centerX() - i8Var.f47252a;
            i8Var.d = rectF.centerY() - i8Var.f47253b;
            float f7 = i8Var.f47254c;
            float f10 = i8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            i8Var.f47254c *= dp;
            i8Var.d *= dp;
        }
        i8Var.f47257i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        i8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47295o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47290j;
                ArrayList arrayList = this.f47285b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                i8 i8Var = (i8) arrayList.get(i10);
                long j3 = i8Var.f47256g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - i8Var.f47255f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(i8Var, currentTimeMillis, this.f47291k);
                    f7 = 0.0f;
                }
                i8Var.f47252a = (i8Var.f47254c * min) + i8Var.f47252a;
                i8Var.f47253b = (i8Var.d * min) + i8Var.f47253b;
                float f10 = 4.0f * f7;
                i8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47295o = currentTimeMillis;
            long j10 = this.f47294n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f47294n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47284a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47285b;
                if (i10 < arrayList.size()) {
                    i8 i8Var = (i8) arrayList.get(i10);
                    if (!this.f47286c.contains((int) i8Var.f47252a, (int) i8Var.f47253b)) {
                        c(i8Var, currentTimeMillis, this.f47291k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47286c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47286c.set(rectF);
        e();
    }
}
