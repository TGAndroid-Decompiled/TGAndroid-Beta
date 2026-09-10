package xh;

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
public final class l8 {
    public final int f45675a;
    public final ArrayList f45676b;
    public final Bitmap d;
    public int e;
    public int f45681j;
    public e0.i0 f45683l;
    public final Paint f45684m;
    public long f45685n;
    public long f45686o;
    public final RectF f45677c = new RectF();
    public final Paint f45678f = new Paint(3);
    public final Rect f45679g = new Rect();
    public float h = 1.0f;
    public final float f45680i = 1.0f;
    public boolean f45682k = true;

    public l8(int i10, int i11) {
        this.f45675a = i10;
        this.f45681j = i11;
        this.f45676b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f45676b.add(new k8(this));
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
            this.f45683l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7089a; i14++) {
                e0.i0.b((float[]) i0Var.f7091c, i14, 0.0f, 0.0f, width, height);
            }
            this.f45684m = g0.a.a(createBitmap);
            return;
        }
        this.f45683l = null;
        this.f45684m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f45681j;
        ArrayList arrayList = this.f45676b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f45683l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                k8 k8Var = (k8) arrayList.get(i12);
                float f11 = k8Var.f45634i * k8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f45683l;
                float f14 = k8Var.f45629a;
                float f15 = k8Var.f45630b;
                e0.i0.b((float[]) i0Var.f7090b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f45683l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(k8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f45683l, min, this.f45684m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f45678f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                k8 k8Var2 = (k8) arrayList.get(i13);
                float f16 = k8Var2.h * f7;
                l8 l8Var = k8Var2.f45635j;
                Paint paint = l8Var.f45678f;
                Rect rect = l8Var.f45679g;
                Bitmap bitmap2 = l8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (k8Var2.f45629a - ((((bitmap2.getWidth() / f10) * k8Var2.f45634i) * k8Var2.e) * f16)), (int) (k8Var2.f45630b - ((((bitmap2.getHeight() / f10) * k8Var2.f45634i) * k8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * k8Var2.f45634i, k8Var2.e, f16, k8Var2.f45629a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * k8Var2.f45634i, k8Var2.e, f16, k8Var2.f45630b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f45682k = false;
    }

    public final void c(k8 k8Var, long j3, boolean z10) {
        long j10;
        k8Var.f45632f = j3;
        k8Var.f45633g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f45680i;
        if (z10) {
            k8Var.f45632f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f45677c;
        k8Var.f45629a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        k8Var.f45630b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f45675a == 0) {
            k8Var.f45631c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            k8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            k8Var.f45631c = rectF.centerX() - k8Var.f45629a;
            k8Var.d = rectF.centerY() - k8Var.f45630b;
            float f7 = k8Var.f45631c;
            float f10 = k8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            k8Var.f45631c *= dp;
            k8Var.d *= dp;
        }
        k8Var.f45634i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        k8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f45686o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f45681j;
                ArrayList arrayList = this.f45676b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                k8 k8Var = (k8) arrayList.get(i10);
                long j3 = k8Var.f45633g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - k8Var.f45632f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(k8Var, currentTimeMillis, this.f45682k);
                    f7 = 0.0f;
                }
                k8Var.f45629a = (k8Var.f45631c * min) + k8Var.f45629a;
                k8Var.f45630b = (k8Var.d * min) + k8Var.f45630b;
                float f10 = 4.0f * f7;
                k8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f45686o = currentTimeMillis;
            long j10 = this.f45685n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f45685n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f45675a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f45676b;
                if (i10 < arrayList.size()) {
                    k8 k8Var = (k8) arrayList.get(i10);
                    if (!this.f45677c.contains((int) k8Var.f45629a, (int) k8Var.f45630b)) {
                        c(k8Var, currentTimeMillis, this.f45682k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f45677c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f45677c.set(rectF);
        e();
    }
}
