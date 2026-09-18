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
    public final int f47527a;
    public final ArrayList f47528b;
    public final Bitmap d;
    public int e;
    public int f47533j;
    public e0.i0 f47535l;
    public final Paint f47536m;
    public long f47537n;
    public long f47538o;
    public final RectF f47529c = new RectF();
    public final Paint f47530f = new Paint(3);
    public final Rect f47531g = new Rect();
    public float h = 1.0f;
    public final float f47532i = 1.0f;
    public boolean f47534k = true;

    public i8(int i10, int i11) {
        this.f47527a = i10;
        this.f47533j = i11;
        this.f47528b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47528b.add(new h8(this));
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
            this.f47535l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7788a; i14++) {
                e0.i0.c((float[]) i0Var.f7790c, i14, 0.0f, 0.0f, width, height);
            }
            this.f47536m = g0.a.a(createBitmap);
            return;
        }
        this.f47535l = null;
        this.f47536m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f47533j;
        ArrayList arrayList = this.f47528b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47535l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                h8 h8Var = (h8) arrayList.get(i12);
                float f11 = h8Var.f47491i * h8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f47535l;
                float f14 = h8Var.f47486a;
                float f15 = h8Var.f47487b;
                e0.i0.c((float[]) i0Var.f7789b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47535l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(h8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47535l, min, this.f47536m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47530f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                h8 h8Var2 = (h8) arrayList.get(i13);
                float f16 = h8Var2.h * f7;
                i8 i8Var = h8Var2.f47492j;
                Paint paint = i8Var.f47530f;
                Rect rect = i8Var.f47531g;
                Bitmap bitmap2 = i8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (h8Var2.f47486a - ((((bitmap2.getWidth() / f10) * h8Var2.f47491i) * h8Var2.e) * f16)), (int) (h8Var2.f47487b - ((((bitmap2.getHeight() / f10) * h8Var2.f47491i) * h8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * h8Var2.f47491i, h8Var2.e, f16, h8Var2.f47486a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * h8Var2.f47491i, h8Var2.e, f16, h8Var2.f47487b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f47534k = false;
    }

    public final void c(h8 h8Var, long j3, boolean z10) {
        long j10;
        h8Var.f47489f = j3;
        h8Var.f47490g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f47532i;
        if (z10) {
            h8Var.f47489f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f47529c;
        h8Var.f47486a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        h8Var.f47487b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f47527a == 0) {
            h8Var.f47488c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            h8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            h8Var.f47488c = rectF.centerX() - h8Var.f47486a;
            h8Var.d = rectF.centerY() - h8Var.f47487b;
            float f7 = h8Var.f47488c;
            float f10 = h8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            h8Var.f47488c *= dp;
            h8Var.d *= dp;
        }
        h8Var.f47491i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        h8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47538o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47533j;
                ArrayList arrayList = this.f47528b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                h8 h8Var = (h8) arrayList.get(i10);
                long j3 = h8Var.f47490g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - h8Var.f47489f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(h8Var, currentTimeMillis, this.f47534k);
                    f7 = 0.0f;
                }
                h8Var.f47486a = (h8Var.f47488c * min) + h8Var.f47486a;
                h8Var.f47487b = (h8Var.d * min) + h8Var.f47487b;
                float f10 = 4.0f * f7;
                h8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47538o = currentTimeMillis;
            long j10 = this.f47537n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f47537n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47527a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47528b;
                if (i10 < arrayList.size()) {
                    h8 h8Var = (h8) arrayList.get(i10);
                    if (!this.f47529c.contains((int) h8Var.f47486a, (int) h8Var.f47487b)) {
                        c(h8Var, currentTimeMillis, this.f47534k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47529c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47529c.set(rectF);
        e();
    }
}
