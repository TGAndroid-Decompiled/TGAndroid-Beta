package rh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tc;
public final class s8 {
    public final int f47470a;
    public final ArrayList f47471b;
    public final Bitmap d;
    public int e;
    public int f47476j;
    public cc.f f47478l;
    public final Paint f47479m;
    public long f47480n;
    public long f47481o;
    public final RectF f47472c = new RectF();
    public final Paint f47473f = new Paint(3);
    public final Rect f47474g = new Rect();
    public float h = 1.0f;
    public final float f47475i = 1.0f;
    public boolean f47477k = true;

    public s8(int i10, int i11) {
        this.f47470a = i10;
        this.f47476j = i11;
        this.f47471b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47471b.add(new r8(this));
        }
        int L = org.telegram.messenger.i0.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = L >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = L - i13;
        path.lineTo(f11, f10);
        float f12 = L;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            cc.f fVar = new cc.f(i11);
            this.f47478l = fVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < fVar.f4116b; i14++) {
                cc.f.a((float[]) fVar.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f47479m = g0.a.a(createBitmap);
            return;
        }
        this.f47478l = null;
        this.f47479m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!tc.e(131072)) {
            return;
        }
        int i11 = this.f47476j;
        ArrayList arrayList = this.f47471b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f47478l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                r8 r8Var = (r8) arrayList.get(i12);
                float f11 = r8Var.f47436i * r8Var.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                cc.f fVar = this.f47478l;
                float f14 = r8Var.f47431a;
                float f15 = r8Var.f47432b;
                cc.f.a((float[]) fVar.f4117c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f47478l.f(i12, i0.b.o(i10, (int) (Utilities.l(r8Var.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f47478l, min, this.f47479m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f47473f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                r8 r8Var2 = (r8) arrayList.get(i13);
                float f16 = r8Var2.h * f7;
                s8 s8Var = r8Var2.f47437j;
                Paint paint = s8Var.f47473f;
                Rect rect = s8Var.f47474g;
                Bitmap bitmap2 = s8Var.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.Cells.f1.x((bitmap2.getWidth() / f10) * r8Var2.f47436i, r8Var2.e, f16, r8Var2.f47431a), (int) org.telegram.ui.Cells.f1.x((bitmap2.getHeight() / f10) * r8Var2.f47436i, r8Var2.e, f16, r8Var2.f47432b), (int) c3.i0.u((bitmap2.getWidth() / f10) * r8Var2.f47436i, r8Var2.e, f16, r8Var2.f47431a), (int) c3.i0.u((bitmap2.getHeight() / f17) * r8Var2.f47436i, r8Var2.e, f16, r8Var2.f47432b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f47477k = false;
    }

    public final void c(r8 r8Var, long j10, boolean z10) {
        long j11;
        r8Var.f47434f = j10;
        d5.a aVar = Utilities.f14521c;
        r8Var.f47435g = org.telegram.messenger.i0.W1(aVar.nextFloat(), 500, 2500) * this.f47475i;
        if (z10) {
            r8Var.f47434f -= Utilities.l(aVar.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f47472c;
        r8Var.f47431a = org.telegram.messenger.i0.T1(rectF.left, rectF.right, aVar.nextFloat());
        r8Var.f47432b = org.telegram.messenger.i0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f47470a == 0) {
            r8Var.f47433c = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            r8Var.d = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            r8Var.f47433c = rectF.centerX() - r8Var.f47431a;
            r8Var.d = rectF.centerY() - r8Var.f47432b;
            float f7 = r8Var.f47433c;
            float f10 = r8Var.d;
            float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            r8Var.f47433c *= L;
            r8Var.d *= L;
        }
        r8Var.f47436i = org.telegram.messenger.i0.T1(0.4f, 1.0f, aVar.nextFloat());
        r8Var.e = org.telegram.messenger.i0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (tc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f47481o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f47476j;
                ArrayList arrayList = this.f47471b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                r8 r8Var = (r8) arrayList.get(i10);
                long j10 = r8Var.f47435g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - r8Var.f47434f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(r8Var, currentTimeMillis, this.f47477k);
                    f7 = 0.0f;
                }
                r8Var.f47431a = (r8Var.f47433c * min) + r8Var.f47431a;
                r8Var.f47432b = (r8Var.d * min) + r8Var.f47432b;
                float f10 = 4.0f * f7;
                r8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.f47481o = currentTimeMillis;
            long j11 = this.f47480n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f47480n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f47470a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47471b;
                if (i10 < arrayList.size()) {
                    r8 r8Var = (r8) arrayList.get(i10);
                    if (!this.f47472c.contains((int) r8Var.f47431a, (int) r8Var.f47432b)) {
                        c(r8Var, currentTimeMillis, this.f47477k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f47472c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f47472c.set(rectF);
        e();
    }
}
