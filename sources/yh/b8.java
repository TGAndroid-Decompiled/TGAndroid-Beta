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
    public final int f52429a;
    public final ArrayList f52430b;
    public final Bitmap d;
    public int f52432e;
    public int f52436j;
    public e0.g0 f52438l;
    public final Paint f52439m;
    public long f52440n;
    public long f52441o;
    public final RectF f52431c = new RectF();
    public final Paint f52433f = new Paint(3);
    public final Rect f52434g = new Rect();
    public float h = 1.0f;
    public final float f52435i = 1.0f;
    public boolean f52437k = true;

    public b8(int i10, int i11) {
        this.f52429a = i10;
        this.f52436j = i11;
        this.f52430b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f52430b.add(new a8(this));
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
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.g0 g0Var = new e0.g0(i11);
            this.f52438l = g0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < g0Var.f8411a; i14++) {
                e0.g0.a((float[]) g0Var.f8413c, i14, 0.0f, 0.0f, width, height);
            }
            this.f52439m = g0.a.a(createBitmap);
            return;
        }
        this.f52438l = null;
        this.f52439m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f52436j;
        ArrayList arrayList = this.f52430b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f52438l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                a8 a8Var = (a8) arrayList.get(i12);
                float f11 = a8Var.f52392i * a8Var.f52389e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.g0 g0Var = this.f52438l;
                float f14 = a8Var.f52386a;
                float f15 = a8Var.f52387b;
                e0.g0.a((float[]) g0Var.f8412b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f52438l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(a8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f52438l, min, this.f52439m);
        } else {
            if (this.f52432e != i10) {
                this.f52432e = i10;
                this.f52433f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                a8 a8Var2 = (a8) arrayList.get(i13);
                float f16 = a8Var2.h * f7;
                b8 b8Var = a8Var2.f52393j;
                Paint paint = b8Var.f52433f;
                Rect rect = b8Var.f52434g;
                Bitmap bitmap2 = b8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) (a8Var2.f52386a - ((((bitmap2.getWidth() / f10) * a8Var2.f52392i) * a8Var2.f52389e) * f16)), (int) (a8Var2.f52387b - ((((bitmap2.getHeight() / f10) * a8Var2.f52392i) * a8Var2.f52389e) * f16)), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getWidth() / f10) * a8Var2.f52392i, a8Var2.f52389e, f16, a8Var2.f52386a), (int) com.google.android.gms.internal.vision.e2.w((bitmap2.getHeight() / f17) * a8Var2.f52392i, a8Var2.f52389e, f16, a8Var2.f52387b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f52437k = false;
    }

    public final void c(a8 a8Var, long j3, boolean z10) {
        long j10;
        a8Var.f52390f = j3;
        a8Var.f52391g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f52435i;
        if (z10) {
            a8Var.f52390f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f52431c;
        a8Var.f52386a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        a8Var.f52387b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f52429a == 0) {
            a8Var.f52388c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            a8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            a8Var.f52388c = rectF.centerX() - a8Var.f52386a;
            a8Var.d = rectF.centerY() - a8Var.f52387b;
            float f7 = a8Var.f52388c;
            float f10 = a8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            a8Var.f52388c *= dp;
            a8Var.d *= dp;
        }
        a8Var.f52392i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        a8Var.f52389e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f52441o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f52436j;
                ArrayList arrayList = this.f52430b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                a8 a8Var = (a8) arrayList.get(i10);
                long j3 = a8Var.f52391g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - a8Var.f52390f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(a8Var, currentTimeMillis, this.f52437k);
                    f7 = 0.0f;
                }
                a8Var.f52386a = (a8Var.f52388c * min) + a8Var.f52386a;
                a8Var.f52387b = (a8Var.d * min) + a8Var.f52387b;
                float f10 = 4.0f * f7;
                a8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f52441o = currentTimeMillis;
            long j10 = this.f52440n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f52440n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f52429a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f52430b;
                if (i10 < arrayList.size()) {
                    a8 a8Var = (a8) arrayList.get(i10);
                    if (!this.f52431c.contains((int) a8Var.f52386a, (int) a8Var.f52387b)) {
                        c(a8Var, currentTimeMillis, this.f52437k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f52431c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f52431c.set(rectF);
        e();
    }
}
