package qg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import g.x;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k7.c8;
import k7.o;
import lf.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tl;
import org.telegram.ui.zw0;
import tg.e;
public abstract class b extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f44849a;
    public float f44850b;
    public rg.a f44851c;
    public int d;
    public int f44852e;
    public int f44853f;
    public int f44854g;
    public final a h;
    public tl f44855i;
    public int f44856j;
    public boolean f44857k;
    public float f44858l;
    public float f44859m;
    public float f44860n;
    public final Paint f44861o;
    public final Paint f44862p;
    public final Paint f44863q;
    public final Paint f44864r;
    public final Paint f44865s;
    public final Matrix f44866t;
    public final WeakReference f44867u;
    public BitmapShader v;
    public final RectF f44868w;
    public final RectF f44869x;
    public final x f44870y;
    public final Rect f44871z;

    public b() {
        a aVar = new a();
        this.h = aVar;
        this.f44856j = 255;
        this.f44860n = 1.0f;
        this.f44861o = new Paint(1);
        this.f44862p = new Paint(1);
        Paint paint = new Paint(1);
        this.f44863q = paint;
        this.f44864r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f44865s = paint2;
        this.f44866t = new Matrix();
        this.f44867u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f44868w = new RectF();
        this.f44869x = new RectF();
        this.f44870y = new Object();
        this.f44871z = new Rect();
        aVar.f44842i = AndroidUtilities.dpf2(1.0f);
        aVar.f44843j = AndroidUtilities.dpf2(0.6666667f);
        this.f44858l = AndroidUtilities.dpf2(1.0f);
        this.f44859m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: qg.b.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void f(Canvas canvas, RectF rectF, float f10, float f11, boolean z4, Paint paint) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        float f16 = f11 / 2.0f;
        canvas.save();
        if (z4) {
            float f17 = f12 - f16;
            float f18 = f14 + f16;
            if (canvas.clipRect(f17, f13, f18, o.a((2.0f * f10) + f13, f13, f15))) {
                canvas.drawRoundRect(f17, f13 + f16, f18, f15 + f16, f10, f10, paint);
            }
        } else {
            float f19 = f12 - f16;
            float f20 = f14 + f16;
            if (canvas.clipRect(f19, o.a(f15 - (2.0f * f10), f13, f15), f20, f15)) {
                canvas.drawRoundRect(f19, f13 - f16, f20, f15 - f16, f10, f10, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (l0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = D;
        if (path == null) {
            D = new Path();
        } else {
            path.rewind();
        }
        D.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(D);
    }

    public final NinePatchDrawable a(int i10, boolean z4) {
        long j10;
        int i11;
        x xVar = this.f44870y;
        xVar.f6799a = 0L;
        xVar.f6800b = false;
        xVar.a(i10);
        xVar.a(this.d);
        a aVar = this.h;
        for (float f10 : aVar.f44837b) {
            xVar.c(f10);
        }
        xVar.c(this.f44858l);
        xVar.c(0.0f);
        xVar.c(this.f44859m);
        xVar.b(z4);
        if (z4) {
            xVar.a(this.f44853f);
            xVar.a(this.f44854g);
            xVar.c(aVar.f44842i);
            xVar.c(aVar.f44843j);
        }
        if (xVar.f6800b) {
            j10 = -1;
        } else {
            j10 = xVar.f6799a;
        }
        if (this.A == null || this.B != j10) {
            this.B = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = c8.b(null, aVar.f44837b, this.f44858l, this.f44859m, i11, new zw0(i10, this, z4));
            this.A = b10;
            b10.getPadding(this.f44871z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f44846m;
        RectF rectF = this.f44868w;
        rectF.set(rect);
        rectF.offset(this.f44849a, this.f44850b);
        RectF rectF2 = this.f44869x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, tg.a aVar) {
        int i10;
        boolean z4;
        a aVar2 = this.h;
        Rect rect = aVar2.f44846m;
        Rect rect2 = aVar2.f44846m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f44852e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof tg.c) {
                d(canvas, ((tg.c) aVar).f48086a.getColor());
            } else if (aVar instanceof tg.b) {
                tg.b bVar = (tg.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f44867u.get();
                Paint paint = this.f44863q;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.v = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.v = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.f44871z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f44856j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f44856j > 0) {
                    Matrix matrix = bVar.f48081b;
                    Matrix matrix2 = this.f44866t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f44849a, -this.f44850b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f44856j);
                    aVar2.b(canvas, paint);
                }
                int l1 = k6.l1(this.f44856j / 255.0f, this.f44852e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f44864r;
                    paint2.setColor(l1);
                    aVar2.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof tg.d)) {
                tg.d dVar = (tg.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f48087a);
                }
            } else if (aVar instanceof e) {
                c(canvas, ((e) aVar).f48095a);
            } else if (aVar != null && (i10 = this.f44856j) != 0) {
                int l12 = k6.l1(i10 / 255.0f, this.f44852e);
                if (Color.alpha(this.d) > 0 && this.f44856j == 255) {
                    float f10 = this.f44860n;
                    if (f10 > 0.0f) {
                        float f11 = this.f44858l;
                        float f12 = this.f44859m;
                        int l13 = k6.l1(f10, this.d);
                        Paint paint3 = this.f44865s;
                        paint3.setShadowLayer(f11, 0.0f, f12, l13);
                        aVar2.c(canvas, paint3, this.f44857k);
                    }
                }
                float f13 = this.f44849a;
                float f14 = this.f44850b;
                float f15 = rect2.left;
                float f16 = f15 + f13;
                float f17 = rect2.top;
                float f18 = f17 + f14;
                float f19 = rect2.right;
                float f20 = f19 + f13;
                float f21 = rect2.bottom;
                float f22 = f21 + f14;
                int i12 = this.f44856j;
                if (i12 != 255) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
                }
                canvas.save();
                canvas.clipPath(aVar2.f44844k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f16, -f18);
                aVar.I(canvas, f16, f18, f20, f22);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f44861o;
                    paint4.setColor(l12);
                    aVar2.b(canvas, paint4);
                }
                g(canvas);
                if (z4) {
                    canvas.restore();
                }
            }
        }
    }

    public final void d(Canvas canvas, int i10) {
        int h = i0.a.h(this.f44852e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f44846m;
        int i11 = rect.left;
        Rect rect2 = this.f44871z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f44856j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = k6.l1(this.f44856j / 255.0f, this.f44853f);
        int l12 = k6.l1(this.f44856j / 255.0f, this.f44854g);
        int alpha = Color.alpha(l1);
        a aVar = this.h;
        Paint paint = this.f44862p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(aVar.f44847n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(aVar.f44848o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f44856j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        a aVar = this.h;
        h(outline, aVar.f44846m, aVar.f44837b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        a aVar = this.h;
        int i10 = aVar.d;
        rect.set(i10, i10, i10, i10);
        return aVar.f44839e;
    }

    public abstract tg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(rg.a aVar) {
        this.f44851c = aVar;
        u();
        if (aVar instanceof rg.d) {
            rg.d dVar = (rg.d) aVar;
            float f10 = dVar.f46812f;
            float f11 = dVar.h;
            a aVar2 = this.h;
            aVar2.f44842i = f10;
            aVar2.f44843j = f11;
            float f12 = dVar.f46813n;
            float f13 = dVar.f46814r;
            this.f44858l = f12;
            this.f44859m = f13;
        }
    }

    public final void o(int i10) {
        a aVar = this.h;
        if (aVar.d != i10) {
            aVar.d = i10;
            aVar.a();
            j();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a aVar = this.h;
        aVar.f44836a.set(rect);
        aVar.a();
        j();
    }

    public final void p(float f10) {
        a aVar = this.h;
        Arrays.fill(aVar.f44837b, f10);
        Arrays.fill(aVar.f44838c, f10);
        aVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.f44837b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        aVar.a();
        j();
    }

    public final void r(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.f44837b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = aVar.f44838c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        aVar.a();
        j();
    }

    public final void s(float f10, float f11) {
        if (this.f44849a == f10 && this.f44850b == f11) {
            return;
        }
        this.f44849a = f10;
        this.f44850b = f11;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f44856j = i10;
    }

    public final void t(int i10) {
        this.h.f44840f = i10;
        j();
    }

    public void u() {
        rg.a aVar = this.f44851c;
        if (aVar == null) {
            return;
        }
        this.f44852e = aVar.U();
        this.d = this.f44851c.I();
        this.f44853f = this.f44851c.k();
        this.f44854g = this.f44851c.x();
    }

    public void l() {
    }

    public b m() {
        return this;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
