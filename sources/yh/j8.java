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
    public final int f51485a;
    public final ArrayList f51486b;
    public final Bitmap d;
    public int f51488e;
    public int f51492j;
    public e0.i0 f51494l;
    public final Paint f51495m;
    public long f51496n;
    public long f51497o;
    public final RectF f51487c = new RectF();
    public final Paint f51489f = new Paint(3);
    public final Rect f51490g = new Rect();
    public float h = 1.0f;
    public final float f51491i = 1.0f;
    public boolean f51493k = true;

    public j8(int i10, int i11) {
        this.f51485a = i10;
        this.f51492j = i11;
        this.f51486b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f51486b.add(new i8(this));
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
            this.f51494l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f8425a; i14++) {
                e0.i0.c((float[]) i0Var.f8427c, i14, 0.0f, 0.0f, width, height);
            }
            this.f51495m = g0.a.a(createBitmap);
            return;
        }
        this.f51494l = null;
        this.f51495m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f51492j;
        ArrayList arrayList = this.f51486b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f51494l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                i8 i8Var = (i8) arrayList.get(i12);
                float f11 = i8Var.f51441i * i8Var.f51438e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f51494l;
                float f14 = i8Var.f51435a;
                float f15 = i8Var.f51436b;
                e0.i0.c((float[]) i0Var.f8426b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f51494l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(i8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f51494l, min, this.f51495m);
        } else {
            if (this.f51488e != i10) {
                this.f51488e = i10;
                this.f51489f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                i8 i8Var2 = (i8) arrayList.get(i13);
                float f16 = i8Var2.h * f7;
                j8 j8Var = i8Var2.f51442j;
                Paint paint = j8Var.f51489f;
                Rect rect = j8Var.f51490g;
                Bitmap bitmap2 = j8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (i8Var2.f51435a - ((((bitmap2.getWidth() / f10) * i8Var2.f51441i) * i8Var2.f51438e) * f16)), (int) (i8Var2.f51436b - ((((bitmap2.getHeight() / f10) * i8Var2.f51441i) * i8Var2.f51438e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * i8Var2.f51441i, i8Var2.f51438e, f16, i8Var2.f51435a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * i8Var2.f51441i, i8Var2.f51438e, f16, i8Var2.f51436b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f51493k = false;
    }

    public final void c(i8 i8Var, long j3, boolean z10) {
        long j10;
        i8Var.f51439f = j3;
        i8Var.f51440g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f51491i;
        if (z10) {
            i8Var.f51439f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f51487c;
        i8Var.f51435a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        i8Var.f51436b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f51485a == 0) {
            i8Var.f51437c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            i8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            i8Var.f51437c = rectF.centerX() - i8Var.f51435a;
            i8Var.d = rectF.centerY() - i8Var.f51436b;
            float f7 = i8Var.f51437c;
            float f10 = i8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            i8Var.f51437c *= dp;
            i8Var.d *= dp;
        }
        i8Var.f51441i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        i8Var.f51438e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f51497o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f51492j;
                ArrayList arrayList = this.f51486b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                i8 i8Var = (i8) arrayList.get(i10);
                long j3 = i8Var.f51440g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - i8Var.f51439f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(i8Var, currentTimeMillis, this.f51493k);
                    f7 = 0.0f;
                }
                i8Var.f51435a = (i8Var.f51437c * min) + i8Var.f51435a;
                i8Var.f51436b = (i8Var.d * min) + i8Var.f51436b;
                float f10 = 4.0f * f7;
                i8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f51497o = currentTimeMillis;
            long j10 = this.f51496n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f51496n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f51485a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f51486b;
                if (i10 < arrayList.size()) {
                    i8 i8Var = (i8) arrayList.get(i10);
                    if (!this.f51487c.contains((int) i8Var.f51435a, (int) i8Var.f51436b)) {
                        c(i8Var, currentTimeMillis, this.f51493k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f51487c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f51487c.set(rectF);
        e();
    }
}
