package zh;

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
    public final int f50323a;
    public final ArrayList f50324b;
    public final Bitmap d;
    public int e;
    public int f50329j;
    public e0.g0 f50331l;
    public final Paint f50332m;
    public long f50333n;
    public long f50334o;
    public final RectF f50325c = new RectF();
    public final Paint f50326f = new Paint(3);
    public final Rect f50327g = new Rect();
    public float h = 1.0f;
    public final float f50328i = 1.0f;
    public boolean f50330k = true;

    public b8(int i10, int i11) {
        this.f50323a = i10;
        this.f50329j = i11;
        this.f50324b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f50324b.add(new a8(this));
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
        paint.setColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.g0 g0Var = new e0.g0(i11);
            this.f50331l = g0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < g0Var.f8220a; i14++) {
                e0.g0.c((float[]) g0Var.f8222c, i14, 0.0f, 0.0f, width, height);
            }
            this.f50332m = g0.a.a(createBitmap);
            return;
        }
        this.f50331l = null;
        this.f50332m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f50329j;
        ArrayList arrayList = this.f50324b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f50331l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                a8 a8Var = (a8) arrayList.get(i12);
                float f11 = a8Var.f50289i * a8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.g0 g0Var = this.f50331l;
                float f14 = a8Var.f50284a;
                float f15 = a8Var.f50285b;
                e0.g0.c((float[]) g0Var.f8221b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f50331l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(a8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f50331l, min, this.f50332m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f50326f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                a8 a8Var2 = (a8) arrayList.get(i13);
                float f16 = a8Var2.h * f7;
                b8 b8Var = a8Var2.f50290j;
                Paint paint = b8Var.f50326f;
                Rect rect = b8Var.f50327g;
                Bitmap bitmap2 = b8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) (a8Var2.f50284a - ((((bitmap2.getWidth() / f10) * a8Var2.f50289i) * a8Var2.e) * f16)), (int) (a8Var2.f50285b - ((((bitmap2.getHeight() / f10) * a8Var2.f50289i) * a8Var2.e) * f16)), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getWidth() / f10) * a8Var2.f50289i, a8Var2.e, f16, a8Var2.f50284a), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getHeight() / f17) * a8Var2.f50289i, a8Var2.e, f16, a8Var2.f50285b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f50330k = false;
    }

    public final void c(a8 a8Var, long j10, boolean z10) {
        long j11;
        a8Var.f50287f = j10;
        a8Var.f50288g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f50328i;
        if (z10) {
            a8Var.f50287f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f50325c;
        a8Var.f50284a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        a8Var.f50285b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f50323a == 0) {
            a8Var.f50286c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            a8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            a8Var.f50286c = rectF.centerX() - a8Var.f50284a;
            a8Var.d = rectF.centerY() - a8Var.f50285b;
            float f7 = a8Var.f50286c;
            float f10 = a8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            a8Var.f50286c *= dp;
            a8Var.d *= dp;
        }
        a8Var.f50289i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        a8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f50334o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f50329j;
                ArrayList arrayList = this.f50324b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                a8 a8Var = (a8) arrayList.get(i10);
                long j10 = a8Var.f50288g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - a8Var.f50287f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(a8Var, currentTimeMillis, this.f50330k);
                    f7 = 0.0f;
                }
                a8Var.f50284a = (a8Var.f50286c * min) + a8Var.f50284a;
                a8Var.f50285b = (a8Var.d * min) + a8Var.f50285b;
                float f10 = 4.0f * f7;
                a8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f50334o = currentTimeMillis;
            long j11 = this.f50333n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f50333n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f50323a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f50324b;
                if (i10 < arrayList.size()) {
                    a8 a8Var = (a8) arrayList.get(i10);
                    if (!this.f50325c.contains((int) a8Var.f50284a, (int) a8Var.f50285b)) {
                        c(a8Var, currentTimeMillis, this.f50330k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f50325c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f50325c.set(rectF);
        e();
    }
}
