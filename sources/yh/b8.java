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
    public final int f52352a;
    public final ArrayList f52353b;
    public final Bitmap d;
    public int f52355e;
    public int f52359j;
    public e0.g0 f52361l;
    public final Paint f52362m;
    public long f52363n;
    public long f52364o;
    public final RectF f52354c = new RectF();
    public final Paint f52356f = new Paint(3);
    public final Rect f52357g = new Rect();
    public float h = 1.0f;
    public final float f52358i = 1.0f;
    public boolean f52360k = true;

    public b8(int i10, int i11) {
        this.f52352a = i10;
        this.f52359j = i11;
        this.f52353b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f52353b.add(new a8(this));
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
            this.f52361l = g0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < g0Var.f8412a; i14++) {
                e0.g0.c((float[]) g0Var.f8414c, i14, 0.0f, 0.0f, width, height);
            }
            this.f52362m = g0.a.a(createBitmap);
            return;
        }
        this.f52361l = null;
        this.f52362m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f52359j;
        ArrayList arrayList = this.f52353b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f52361l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                a8 a8Var = (a8) arrayList.get(i12);
                float f11 = a8Var.f52315i * a8Var.f52312e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.g0 g0Var = this.f52361l;
                float f14 = a8Var.f52309a;
                float f15 = a8Var.f52310b;
                e0.g0.c((float[]) g0Var.f8413b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f52361l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(a8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f52361l, min, this.f52362m);
        } else {
            if (this.f52355e != i10) {
                this.f52355e = i10;
                this.f52356f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                a8 a8Var2 = (a8) arrayList.get(i13);
                float f16 = a8Var2.h * f7;
                b8 b8Var = a8Var2.f52316j;
                Paint paint = b8Var.f52356f;
                Rect rect = b8Var.f52357g;
                Bitmap bitmap2 = b8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) (a8Var2.f52309a - ((((bitmap2.getWidth() / f10) * a8Var2.f52315i) * a8Var2.f52312e) * f16)), (int) (a8Var2.f52310b - ((((bitmap2.getHeight() / f10) * a8Var2.f52315i) * a8Var2.f52312e) * f16)), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getWidth() / f10) * a8Var2.f52315i, a8Var2.f52312e, f16, a8Var2.f52309a), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getHeight() / f17) * a8Var2.f52315i, a8Var2.f52312e, f16, a8Var2.f52310b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f52360k = false;
    }

    public final void c(a8 a8Var, long j3, boolean z10) {
        long j10;
        a8Var.f52313f = j3;
        a8Var.f52314g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f52358i;
        if (z10) {
            a8Var.f52313f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f52354c;
        a8Var.f52309a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        a8Var.f52310b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f52352a == 0) {
            a8Var.f52311c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            a8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            a8Var.f52311c = rectF.centerX() - a8Var.f52309a;
            a8Var.d = rectF.centerY() - a8Var.f52310b;
            float f7 = a8Var.f52311c;
            float f10 = a8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            a8Var.f52311c *= dp;
            a8Var.d *= dp;
        }
        a8Var.f52315i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        a8Var.f52312e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f52364o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f52359j;
                ArrayList arrayList = this.f52353b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                a8 a8Var = (a8) arrayList.get(i10);
                long j3 = a8Var.f52314g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - a8Var.f52313f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(a8Var, currentTimeMillis, this.f52360k);
                    f7 = 0.0f;
                }
                a8Var.f52309a = (a8Var.f52311c * min) + a8Var.f52309a;
                a8Var.f52310b = (a8Var.d * min) + a8Var.f52310b;
                float f10 = 4.0f * f7;
                a8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f52364o = currentTimeMillis;
            long j10 = this.f52363n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f52363n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f52352a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f52353b;
                if (i10 < arrayList.size()) {
                    a8 a8Var = (a8) arrayList.get(i10);
                    if (!this.f52354c.contains((int) a8Var.f52309a, (int) a8Var.f52310b)) {
                        c(a8Var, currentTimeMillis, this.f52360k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f52354c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f52354c.set(rectF);
        e();
    }
}
