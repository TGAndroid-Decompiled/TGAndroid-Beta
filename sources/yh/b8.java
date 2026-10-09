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
public final class b8 {
    public final int f52306a;
    public final ArrayList f52307b;
    public final Bitmap d;
    public int f52309e;
    public int f52313j;
    public e0.g0 f52315l;
    public final Paint f52316m;
    public long f52317n;
    public long f52318o;
    public final RectF f52308c = new RectF();
    public final Paint f52310f = new Paint(3);
    public final Rect f52311g = new Rect();
    public float h = 1.0f;
    public final float f52312i = 1.0f;
    public boolean f52314k = true;

    public b8(int i10, int i11) {
        this.f52306a = i10;
        this.f52313j = i11;
        this.f52307b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f52307b.add(new a8(this));
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
        paint.setColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.g0 g0Var = new e0.g0(i11);
            this.f52315l = g0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < g0Var.f8412a; i14++) {
                e0.g0.c((float[]) g0Var.f8414c, i14, 0.0f, 0.0f, width, height);
            }
            this.f52316m = g0.a.a(createBitmap);
            return;
        }
        this.f52315l = null;
        this.f52316m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f52313j;
        ArrayList arrayList = this.f52307b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f52315l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                a8 a8Var = (a8) arrayList.get(i12);
                float f11 = a8Var.f52269i * a8Var.f52266e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.g0 g0Var = this.f52315l;
                float f14 = a8Var.f52263a;
                float f15 = a8Var.f52264b;
                e0.g0.c((float[]) g0Var.f8413b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f52315l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(a8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f52315l, min, this.f52316m);
        } else {
            if (this.f52309e != i10) {
                this.f52309e = i10;
                this.f52310f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                a8 a8Var2 = (a8) arrayList.get(i13);
                float f16 = a8Var2.h * f7;
                b8 b8Var = a8Var2.f52270j;
                Paint paint = b8Var.f52310f;
                Rect rect = b8Var.f52311g;
                Bitmap bitmap2 = b8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) (a8Var2.f52263a - ((((bitmap2.getWidth() / f10) * a8Var2.f52269i) * a8Var2.f52266e) * f16)), (int) (a8Var2.f52264b - ((((bitmap2.getHeight() / f10) * a8Var2.f52269i) * a8Var2.f52266e) * f16)), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getWidth() / f10) * a8Var2.f52269i, a8Var2.f52266e, f16, a8Var2.f52263a), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getHeight() / f17) * a8Var2.f52269i, a8Var2.f52266e, f16, a8Var2.f52264b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f52314k = false;
    }

    public final void c(a8 a8Var, long j3, boolean z10) {
        long j10;
        a8Var.f52267f = j3;
        a8Var.f52268g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f52312i;
        if (z10) {
            a8Var.f52267f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f52308c;
        a8Var.f52263a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        a8Var.f52264b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f52306a == 0) {
            a8Var.f52265c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            a8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            a8Var.f52265c = rectF.centerX() - a8Var.f52263a;
            a8Var.d = rectF.centerY() - a8Var.f52264b;
            float f7 = a8Var.f52265c;
            float f10 = a8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            a8Var.f52265c *= dp;
            a8Var.d *= dp;
        }
        a8Var.f52269i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        a8Var.f52266e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f52318o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f52313j;
                ArrayList arrayList = this.f52307b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                a8 a8Var = (a8) arrayList.get(i10);
                long j3 = a8Var.f52268g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - a8Var.f52267f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(a8Var, currentTimeMillis, this.f52314k);
                    f7 = 0.0f;
                }
                a8Var.f52263a = (a8Var.f52265c * min) + a8Var.f52263a;
                a8Var.f52264b = (a8Var.d * min) + a8Var.f52264b;
                float f10 = 4.0f * f7;
                a8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f52318o = currentTimeMillis;
            long j10 = this.f52317n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f52317n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f52306a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f52307b;
                if (i10 < arrayList.size()) {
                    a8 a8Var = (a8) arrayList.get(i10);
                    if (!this.f52308c.contains((int) a8Var.f52263a, (int) a8Var.f52264b)) {
                        c(a8Var, currentTimeMillis, this.f52314k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f52308c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f52308c.set(rectF);
        e();
    }
}
