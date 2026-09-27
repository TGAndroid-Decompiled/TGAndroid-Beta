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
public final class h8 {
    public final int f47537a;
    public final ArrayList f47538b;
    public final Bitmap d;
    public int e;
    public int f47543j;
    public e0.i0 f47545l;
    public final Paint f47546m;
    public long f47547n;
    public long f47548o;
    public final RectF f47539c = new RectF();
    public final Paint f47540f = new Paint(3);
    public final Rect f47541g = new Rect();
    public float h = 1.0f;
    public final float f47542i = 1.0f;
    public boolean f47544k = true;

    public h8(int i10, int i11) {
        this.f47537a = i10;
        this.f47543j = i11;
        this.f47538b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47538b.add(new g8(this));
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
            this.f47545l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f7773a; i14++) {
                e0.i0.c((float[]) i0Var.f7775c, i14, 0.0f, 0.0f, width, height);
            }
            this.f47546m = g0.a.a(createBitmap);
            return;
        }
        this.f47545l = null;
        this.f47546m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f47543j;
        ArrayList arrayList = this.f47538b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47545l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                g8 g8Var = (g8) arrayList.get(i12);
                float f11 = g8Var.f47514i * g8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f47545l;
                float f14 = g8Var.f47509a;
                float f15 = g8Var.f47510b;
                e0.i0.c((float[]) i0Var.f7774b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47545l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(g8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47545l, min, this.f47546m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47540f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                g8 g8Var2 = (g8) arrayList.get(i13);
                float f16 = g8Var2.h * f7;
                h8 h8Var = g8Var2.f47515j;
                Paint paint = h8Var.f47540f;
                Rect rect = h8Var.f47541g;
                Bitmap bitmap2 = h8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (g8Var2.f47509a - ((((bitmap2.getWidth() / f10) * g8Var2.f47514i) * g8Var2.e) * f16)), (int) (g8Var2.f47510b - ((((bitmap2.getHeight() / f10) * g8Var2.f47514i) * g8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * g8Var2.f47514i, g8Var2.e, f16, g8Var2.f47509a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * g8Var2.f47514i, g8Var2.e, f16, g8Var2.f47510b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f47544k = false;
    }

    public final void c(g8 g8Var, long j3, boolean z10) {
        long j10;
        g8Var.f47512f = j3;
        g8Var.f47513g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f47542i;
        if (z10) {
            g8Var.f47512f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f47539c;
        g8Var.f47509a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        g8Var.f47510b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f47537a == 0) {
            g8Var.f47511c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            g8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            g8Var.f47511c = rectF.centerX() - g8Var.f47509a;
            g8Var.d = rectF.centerY() - g8Var.f47510b;
            float f7 = g8Var.f47511c;
            float f10 = g8Var.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            g8Var.f47511c *= dp;
            g8Var.d *= dp;
        }
        g8Var.f47514i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        g8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47548o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47543j;
                ArrayList arrayList = this.f47538b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                g8 g8Var = (g8) arrayList.get(i10);
                long j3 = g8Var.f47513g;
                if (j3 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - g8Var.f47512f)) / ((float) j3);
                }
                if (f7 > 1.0f) {
                    c(g8Var, currentTimeMillis, this.f47544k);
                    f7 = 0.0f;
                }
                g8Var.f47509a = (g8Var.f47511c * min) + g8Var.f47509a;
                g8Var.f47510b = (g8Var.d * min) + g8Var.f47510b;
                float f10 = 4.0f * f7;
                g8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47548o = currentTimeMillis;
            long j10 = this.f47547n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f47547n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47537a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47538b;
                if (i10 < arrayList.size()) {
                    g8 g8Var = (g8) arrayList.get(i10);
                    if (!this.f47539c.contains((int) g8Var.f47509a, (int) g8Var.f47510b)) {
                        c(g8Var, currentTimeMillis, this.f47544k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47539c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47539c.set(rectF);
        e();
    }
}
