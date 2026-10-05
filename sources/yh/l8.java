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
public final class l8 {
    public final int f51605a;
    public final ArrayList f51606b;
    public final Bitmap d;
    public int f51608e;
    public int f51612j;
    public e0.i0 f51614l;
    public final Paint f51615m;
    public long f51616n;
    public long f51617o;
    public final RectF f51607c = new RectF();
    public final Paint f51609f = new Paint(3);
    public final Rect f51610g = new Rect();
    public float h = 1.0f;
    public final float f51611i = 1.0f;
    public boolean f51613k = true;

    public l8(int i10, int i11) {
        this.f51605a = i10;
        this.f51612j = i11;
        this.f51606b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f51606b.add(new k8(this));
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
            this.f51614l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f8426a; i14++) {
                e0.i0.c((float[]) i0Var.f8428c, i14, 0.0f, 0.0f, width, height);
            }
            this.f51615m = g0.a.a(createBitmap);
            return;
        }
        this.f51614l = null;
        this.f51615m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f51612j;
        ArrayList arrayList = this.f51606b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f51614l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                k8 k8Var = (k8) arrayList.get(i12);
                float f11 = k8Var.f51560i * k8Var.f51557e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f51614l;
                float f14 = k8Var.f51554a;
                float f15 = k8Var.f51555b;
                e0.i0.c((float[]) i0Var.f8427b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f51614l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(k8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f51614l, min, this.f51615m);
        } else {
            if (this.f51608e != i10) {
                this.f51608e = i10;
                this.f51609f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                k8 k8Var2 = (k8) arrayList.get(i13);
                float f16 = k8Var2.h * f7;
                l8 l8Var = k8Var2.f51561j;
                Paint paint = l8Var.f51609f;
                Rect rect = l8Var.f51610g;
                Bitmap bitmap2 = l8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (k8Var2.f51554a - ((((bitmap2.getWidth() / f10) * k8Var2.f51560i) * k8Var2.f51557e) * f16)), (int) (k8Var2.f51555b - ((((bitmap2.getHeight() / f10) * k8Var2.f51560i) * k8Var2.f51557e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * k8Var2.f51560i, k8Var2.f51557e, f16, k8Var2.f51554a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * k8Var2.f51560i, k8Var2.f51557e, f16, k8Var2.f51555b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f51613k = false;
    }

    public final void c(k8 k8Var, long j3, boolean z10) {
        long j10;
        k8Var.f51558f = j3;
        k8Var.f51559g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f51611i;
        if (z10) {
            k8Var.f51558f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f51607c;
        k8Var.f51554a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        k8Var.f51555b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f51605a == 0) {
            k8Var.f51556c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            k8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            k8Var.f51556c = rectF.centerX() - k8Var.f51554a;
            k8Var.d = rectF.centerY() - k8Var.f51555b;
            float f7 = k8Var.f51556c;
            float f10 = k8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            k8Var.f51556c *= dp;
            k8Var.d *= dp;
        }
        k8Var.f51560i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        k8Var.f51557e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f51617o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f51612j;
                ArrayList arrayList = this.f51606b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                k8 k8Var = (k8) arrayList.get(i10);
                long j3 = k8Var.f51559g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - k8Var.f51558f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(k8Var, currentTimeMillis, this.f51613k);
                    f7 = 0.0f;
                }
                k8Var.f51554a = (k8Var.f51556c * min) + k8Var.f51554a;
                k8Var.f51555b = (k8Var.d * min) + k8Var.f51555b;
                float f10 = 4.0f * f7;
                k8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f51617o = currentTimeMillis;
            long j10 = this.f51616n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f51616n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f51605a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f51606b;
                if (i10 < arrayList.size()) {
                    k8 k8Var = (k8) arrayList.get(i10);
                    if (!this.f51607c.contains((int) k8Var.f51554a, (int) k8Var.f51555b)) {
                        c(k8Var, currentTimeMillis, this.f51613k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f51607c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f51607c.set(rectF);
        e();
    }
}
