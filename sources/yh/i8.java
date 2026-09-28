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
public final class i8 {
    public final int f47525a;
    public final ArrayList f47526b;
    public final Bitmap d;
    public int e;
    public int f47531j;
    public e0.i0 f47533l;
    public final Paint f47534m;
    public long f47535n;
    public long f47536o;
    public final RectF f47527c = new RectF();
    public final Paint f47528f = new Paint(3);
    public final Rect f47529g = new Rect();
    public float h = 1.0f;
    public final float f47530i = 1.0f;
    public boolean f47532k = true;

    public i8(int i10, int i11) {
        this.f47525a = i10;
        this.f47531j = i11;
        this.f47526b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47526b.add(new h8(this));
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
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.i0 i0Var = new e0.i0(i11);
            this.f47533l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7771a; i14++) {
                e0.i0.c((float[]) i0Var.f7773c, i14, 0.0f, 0.0f, width, height);
            }
            this.f47534m = g0.a.a(createBitmap);
            return;
        }
        this.f47533l = null;
        this.f47534m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f47531j;
        ArrayList arrayList = this.f47526b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47533l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                h8 h8Var = (h8) arrayList.get(i12);
                float f11 = h8Var.f47489i * h8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f47533l;
                float f14 = h8Var.f47484a;
                float f15 = h8Var.f47485b;
                e0.i0.c((float[]) i0Var.f7772b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47533l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(h8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47533l, min, this.f47534m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47528f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                h8 h8Var2 = (h8) arrayList.get(i13);
                float f16 = h8Var2.h * f7;
                i8 i8Var = h8Var2.f47490j;
                Paint paint = i8Var.f47528f;
                Rect rect = i8Var.f47529g;
                Bitmap bitmap2 = i8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (h8Var2.f47484a - ((((bitmap2.getWidth() / f10) * h8Var2.f47489i) * h8Var2.e) * f16)), (int) (h8Var2.f47485b - ((((bitmap2.getHeight() / f10) * h8Var2.f47489i) * h8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * h8Var2.f47489i, h8Var2.e, f16, h8Var2.f47484a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * h8Var2.f47489i, h8Var2.e, f16, h8Var2.f47485b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f47532k = false;
    }

    public final void c(h8 h8Var, long j3, boolean z10) {
        long j10;
        h8Var.f47487f = j3;
        h8Var.f47488g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f47530i;
        if (z10) {
            h8Var.f47487f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f47527c;
        h8Var.f47484a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        h8Var.f47485b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f47525a == 0) {
            h8Var.f47486c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            h8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            h8Var.f47486c = rectF.centerX() - h8Var.f47484a;
            h8Var.d = rectF.centerY() - h8Var.f47485b;
            float f7 = h8Var.f47486c;
            float f10 = h8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            h8Var.f47486c *= dp;
            h8Var.d *= dp;
        }
        h8Var.f47489i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        h8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47536o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47531j;
                ArrayList arrayList = this.f47526b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                h8 h8Var = (h8) arrayList.get(i10);
                long j3 = h8Var.f47488g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - h8Var.f47487f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(h8Var, currentTimeMillis, this.f47532k);
                    f7 = 0.0f;
                }
                h8Var.f47484a = (h8Var.f47486c * min) + h8Var.f47484a;
                h8Var.f47485b = (h8Var.d * min) + h8Var.f47485b;
                float f10 = 4.0f * f7;
                h8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47536o = currentTimeMillis;
            long j10 = this.f47535n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f47535n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47525a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47526b;
                if (i10 < arrayList.size()) {
                    h8 h8Var = (h8) arrayList.get(i10);
                    if (!this.f47527c.contains((int) h8Var.f47484a, (int) h8Var.f47485b)) {
                        c(h8Var, currentTimeMillis, this.f47532k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47527c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47527c.set(rectF);
        e();
    }
}
