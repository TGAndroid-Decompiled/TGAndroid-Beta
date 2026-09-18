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
public final class k8 {
    public final int f47406a;
    public final ArrayList f47407b;
    public final Bitmap d;
    public int e;
    public int f47412j;
    public e0.i0 f47414l;
    public final Paint f47415m;
    public long f47416n;
    public long f47417o;
    public final RectF f47408c = new RectF();
    public final Paint f47409f = new Paint(3);
    public final Rect f47410g = new Rect();
    public float h = 1.0f;
    public final float f47411i = 1.0f;
    public boolean f47413k = true;

    public k8(int i10, int i11) {
        this.f47406a = i10;
        this.f47412j = i11;
        this.f47407b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47407b.add(new j8(this));
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
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.i0 i0Var = new e0.i0(i11);
            this.f47414l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7789a; i14++) {
                e0.i0.c((float[]) i0Var.f7791c, i14, 0.0f, 0.0f, width, height);
            }
            this.f47415m = g0.a.a(createBitmap);
            return;
        }
        this.f47414l = null;
        this.f47415m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f47412j;
        ArrayList arrayList = this.f47407b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47414l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                j8 j8Var = (j8) arrayList.get(i12);
                float f11 = j8Var.f47382i * j8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f47414l;
                float f14 = j8Var.f47377a;
                float f15 = j8Var.f47378b;
                e0.i0.c((float[]) i0Var.f7790b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47414l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(j8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47414l, min, this.f47415m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47409f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                j8 j8Var2 = (j8) arrayList.get(i13);
                float f16 = j8Var2.h * f7;
                k8 k8Var = j8Var2.f47383j;
                Paint paint = k8Var.f47409f;
                Rect rect = k8Var.f47410g;
                Bitmap bitmap2 = k8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (j8Var2.f47377a - ((((bitmap2.getWidth() / f10) * j8Var2.f47382i) * j8Var2.e) * f16)), (int) (j8Var2.f47378b - ((((bitmap2.getHeight() / f10) * j8Var2.f47382i) * j8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * j8Var2.f47382i, j8Var2.e, f16, j8Var2.f47377a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * j8Var2.f47382i, j8Var2.e, f16, j8Var2.f47378b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f47413k = false;
    }

    public final void c(j8 j8Var, long j3, boolean z10) {
        long j10;
        j8Var.f47380f = j3;
        j8Var.f47381g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f47411i;
        if (z10) {
            j8Var.f47380f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f47408c;
        j8Var.f47377a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        j8Var.f47378b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f47406a == 0) {
            j8Var.f47379c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            j8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            j8Var.f47379c = rectF.centerX() - j8Var.f47377a;
            j8Var.d = rectF.centerY() - j8Var.f47378b;
            float f7 = j8Var.f47379c;
            float f10 = j8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            j8Var.f47379c *= dp;
            j8Var.d *= dp;
        }
        j8Var.f47382i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        j8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47417o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47412j;
                ArrayList arrayList = this.f47407b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                j8 j8Var = (j8) arrayList.get(i10);
                long j3 = j8Var.f47381g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - j8Var.f47380f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(j8Var, currentTimeMillis, this.f47413k);
                    f7 = 0.0f;
                }
                j8Var.f47377a = (j8Var.f47379c * min) + j8Var.f47377a;
                j8Var.f47378b = (j8Var.d * min) + j8Var.f47378b;
                float f10 = 4.0f * f7;
                j8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47417o = currentTimeMillis;
            long j10 = this.f47416n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f47416n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47406a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47407b;
                if (i10 < arrayList.size()) {
                    j8 j8Var = (j8) arrayList.get(i10);
                    if (!this.f47408c.contains((int) j8Var.f47377a, (int) j8Var.f47378b)) {
                        c(j8Var, currentTimeMillis, this.f47413k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47408c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47408c.set(rectF);
        e();
    }
}
