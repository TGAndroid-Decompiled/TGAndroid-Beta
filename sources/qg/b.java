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
import org.telegram.ui.ex0;
import tg.e;
public abstract class b extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f44880a;
    public float f44881b;
    public rg.a f44882c;
    public int d;
    public int f44883e;
    public int f44884f;
    public int f44885g;
    public final a h;
    public tl f44886i;
    public int f44887j;
    public boolean f44888k;
    public float f44889l;
    public float f44890m;
    public float f44891n;
    public final Paint f44892o;
    public final Paint f44893p;
    public final Paint f44894q;
    public final Paint f44895r;
    public final Paint f44896s;
    public final Matrix f44897t;
    public final WeakReference f44898u;
    public BitmapShader v;
    public final RectF f44899w;
    public final RectF f44900x;
    public final x f44901y;
    public final Rect f44902z;

    public b() {
        a aVar = new a();
        this.h = aVar;
        this.f44887j = 255;
        this.f44891n = 1.0f;
        this.f44892o = new Paint(1);
        this.f44893p = new Paint(1);
        Paint paint = new Paint(1);
        this.f44894q = paint;
        this.f44895r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f44896s = paint2;
        this.f44897t = new Matrix();
        this.f44898u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f44899w = new RectF();
        this.f44900x = new RectF();
        this.f44901y = new Object();
        this.f44902z = new Rect();
        aVar.f44873i = AndroidUtilities.dpf2(1.0f);
        aVar.f44874j = AndroidUtilities.dpf2(0.6666667f);
        this.f44889l = AndroidUtilities.dpf2(1.0f);
        this.f44890m = AndroidUtilities.dpf2(0.33333334f);
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
        x xVar = this.f44901y;
        xVar.f6799a = 0L;
        xVar.f6800b = false;
        xVar.a(i10);
        xVar.a(this.d);
        a aVar = this.h;
        for (float f10 : aVar.f44868b) {
            xVar.c(f10);
        }
        xVar.c(this.f44889l);
        xVar.c(0.0f);
        xVar.c(this.f44890m);
        xVar.b(z4);
        if (z4) {
            xVar.a(this.f44884f);
            xVar.a(this.f44885g);
            xVar.c(aVar.f44873i);
            xVar.c(aVar.f44874j);
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
            NinePatchDrawable b10 = c8.b(null, aVar.f44868b, this.f44889l, this.f44890m, i11, new ex0(i10, this, z4));
            this.A = b10;
            b10.getPadding(this.f44902z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f44877m;
        RectF rectF = this.f44899w;
        rectF.set(rect);
        rectF.offset(this.f44880a, this.f44881b);
        RectF rectF2 = this.f44900x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, tg.a aVar) {
        int i10;
        boolean z4;
        a aVar2 = this.h;
        Rect rect = aVar2.f44877m;
        Rect rect2 = aVar2.f44877m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f44883e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof tg.c) {
                d(canvas, ((tg.c) aVar).f48122a.getColor());
            } else if (aVar instanceof tg.b) {
                tg.b bVar = (tg.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f44898u.get();
                Paint paint = this.f44894q;
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
                    Rect rect3 = this.f44902z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f44887j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f44887j > 0) {
                    Matrix matrix = bVar.f48117b;
                    Matrix matrix2 = this.f44897t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f44880a, -this.f44881b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f44887j);
                    aVar2.b(canvas, paint);
                }
                int l1 = k6.l1(this.f44887j / 255.0f, this.f44883e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f44895r;
                    paint2.setColor(l1);
                    aVar2.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof tg.d)) {
                tg.d dVar = (tg.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f48123a);
                }
            } else if (aVar instanceof e) {
                c(canvas, ((e) aVar).f48131a);
            } else if (aVar != null && (i10 = this.f44887j) != 0) {
                int l12 = k6.l1(i10 / 255.0f, this.f44883e);
                if (Color.alpha(this.d) > 0 && this.f44887j == 255) {
                    float f10 = this.f44891n;
                    if (f10 > 0.0f) {
                        float f11 = this.f44889l;
                        float f12 = this.f44890m;
                        int l13 = k6.l1(f10, this.d);
                        Paint paint3 = this.f44896s;
                        paint3.setShadowLayer(f11, 0.0f, f12, l13);
                        aVar2.c(canvas, paint3, this.f44888k);
                    }
                }
                float f13 = this.f44880a;
                float f14 = this.f44881b;
                float f15 = rect2.left;
                float f16 = f15 + f13;
                float f17 = rect2.top;
                float f18 = f17 + f14;
                float f19 = rect2.right;
                float f20 = f19 + f13;
                float f21 = rect2.bottom;
                float f22 = f21 + f14;
                int i12 = this.f44887j;
                if (i12 != 255) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
                }
                canvas.save();
                canvas.clipPath(aVar2.f44875k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f16, -f18);
                aVar.I(canvas, f16, f18, f20, f22);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f44892o;
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
        int h = i0.a.h(this.f44883e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f44877m;
        int i11 = rect.left;
        Rect rect2 = this.f44902z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f44887j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = k6.l1(this.f44887j / 255.0f, this.f44884f);
        int l12 = k6.l1(this.f44887j / 255.0f, this.f44885g);
        int alpha = Color.alpha(l1);
        a aVar = this.h;
        Paint paint = this.f44893p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(aVar.f44878n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(aVar.f44879o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f44887j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        a aVar = this.h;
        h(outline, aVar.f44877m, aVar.f44868b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        a aVar = this.h;
        int i10 = aVar.d;
        rect.set(i10, i10, i10, i10);
        return aVar.f44870e;
    }

    public abstract tg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(rg.a aVar) {
        this.f44882c = aVar;
        u();
        if (aVar instanceof rg.d) {
            rg.d dVar = (rg.d) aVar;
            float f10 = dVar.f46843f;
            float f11 = dVar.h;
            a aVar2 = this.h;
            aVar2.f44873i = f10;
            aVar2.f44874j = f11;
            float f12 = dVar.f46844n;
            float f13 = dVar.f46845r;
            this.f44889l = f12;
            this.f44890m = f13;
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
        aVar.f44867a.set(rect);
        aVar.a();
        j();
    }

    public final void p(float f10) {
        a aVar = this.h;
        Arrays.fill(aVar.f44868b, f10);
        Arrays.fill(aVar.f44869c, f10);
        aVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.f44868b;
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
        float[] fArr = aVar.f44868b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = aVar.f44869c;
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
        if (this.f44880a == f10 && this.f44881b == f11) {
            return;
        }
        this.f44880a = f10;
        this.f44881b = f11;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f44887j = i10;
    }

    public final void t(int i10) {
        this.h.f44871f = i10;
        j();
    }

    public void u() {
        rg.a aVar = this.f44882c;
        if (aVar == null) {
            return;
        }
        this.f44883e = aVar.U();
        this.d = this.f44882c.I();
        this.f44884f = this.f44882c.k();
        this.f44885g = this.f44882c.x();
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
