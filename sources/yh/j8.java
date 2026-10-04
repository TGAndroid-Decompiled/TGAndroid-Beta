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
    public final int f51486a;
    public final ArrayList f51487b;
    public final Bitmap d;
    public int f51489e;
    public int f51493j;
    public e0.i0 f51495l;
    public final Paint f51496m;
    public long f51497n;
    public long f51498o;
    public final RectF f51488c = new RectF();
    public final Paint f51490f = new Paint(3);
    public final Rect f51491g = new Rect();
    public float h = 1.0f;
    public final float f51492i = 1.0f;
    public boolean f51494k = true;

    public j8(int i10, int i11) {
        this.f51486a = i10;
        this.f51493j = i11;
        this.f51487b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f51487b.add(new i8(this));
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
            this.f51495l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f8425a; i14++) {
                e0.i0.c((float[]) i0Var.f8427c, i14, 0.0f, 0.0f, width, height);
            }
            this.f51496m = g0.a.a(createBitmap);
            return;
        }
        this.f51495l = null;
        this.f51496m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f51493j;
        ArrayList arrayList = this.f51487b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f51495l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                i8 i8Var = (i8) arrayList.get(i12);
                float f11 = i8Var.f51442i * i8Var.f51439e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f51495l;
                float f14 = i8Var.f51436a;
                float f15 = i8Var.f51437b;
                e0.i0.c((float[]) i0Var.f8426b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f51495l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(i8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f51495l, min, this.f51496m);
        } else {
            if (this.f51489e != i10) {
                this.f51489e = i10;
                this.f51490f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                i8 i8Var2 = (i8) arrayList.get(i13);
                float f16 = i8Var2.h * f7;
                j8 j8Var = i8Var2.f51443j;
                Paint paint = j8Var.f51490f;
                Rect rect = j8Var.f51491g;
                Bitmap bitmap2 = j8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (i8Var2.f51436a - ((((bitmap2.getWidth() / f10) * i8Var2.f51442i) * i8Var2.f51439e) * f16)), (int) (i8Var2.f51437b - ((((bitmap2.getHeight() / f10) * i8Var2.f51442i) * i8Var2.f51439e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * i8Var2.f51442i, i8Var2.f51439e, f16, i8Var2.f51436a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * i8Var2.f51442i, i8Var2.f51439e, f16, i8Var2.f51437b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f51494k = false;
    }

    public final void c(i8 i8Var, long j3, boolean z10) {
        long j10;
        i8Var.f51440f = j3;
        i8Var.f51441g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f51492i;
        if (z10) {
            i8Var.f51440f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f51488c;
        i8Var.f51436a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        i8Var.f51437b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f51486a == 0) {
            i8Var.f51438c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            i8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            i8Var.f51438c = rectF.centerX() - i8Var.f51436a;
            i8Var.d = rectF.centerY() - i8Var.f51437b;
            float f7 = i8Var.f51438c;
            float f10 = i8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            i8Var.f51438c *= dp;
            i8Var.d *= dp;
        }
        i8Var.f51442i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        i8Var.f51439e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f51498o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f51493j;
                ArrayList arrayList = this.f51487b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                i8 i8Var = (i8) arrayList.get(i10);
                long j3 = i8Var.f51441g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - i8Var.f51440f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(i8Var, currentTimeMillis, this.f51494k);
                    f7 = 0.0f;
                }
                i8Var.f51436a = (i8Var.f51438c * min) + i8Var.f51436a;
                i8Var.f51437b = (i8Var.d * min) + i8Var.f51437b;
                float f10 = 4.0f * f7;
                i8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f51498o = currentTimeMillis;
            long j10 = this.f51497n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f51497n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f51486a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f51487b;
                if (i10 < arrayList.size()) {
                    i8 i8Var = (i8) arrayList.get(i10);
                    if (!this.f51488c.contains((int) i8Var.f51436a, (int) i8Var.f51437b)) {
                        c(i8Var, currentTimeMillis, this.f51494k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f51488c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f51488c.set(rectF);
        e();
    }
}
