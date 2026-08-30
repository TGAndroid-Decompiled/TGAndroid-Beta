package pg;

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
import k7.n;
import k7.t7;
import lf.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sl;
import org.telegram.ui.xw0;
import sg.e;
public abstract class b extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f41215a;
    public float f41216b;
    public qg.a f41217c;
    public int d;
    public int e;
    public int f41218f;
    public int f41219g;
    public final a h;
    public sl f41220i;
    public int f41221j;
    public boolean f41222k;
    public float f41223l;
    public float f41224m;
    public float f41225n;
    public final Paint f41226o;
    public final Paint f41227p;
    public final Paint f41228q;
    public final Paint f41229r;
    public final Paint f41230s;
    public final Matrix f41231t;
    public final WeakReference f41232u;
    public BitmapShader v;
    public final RectF f41233w;
    public final RectF f41234x;
    public final x f41235y;
    public final Rect f41236z;

    public b() {
        a aVar = new a();
        this.h = aVar;
        this.f41221j = 255;
        this.f41225n = 1.0f;
        this.f41226o = new Paint(1);
        this.f41227p = new Paint(1);
        Paint paint = new Paint(1);
        this.f41228q = paint;
        this.f41229r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f41230s = paint2;
        this.f41231t = new Matrix();
        this.f41232u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f41233w = new RectF();
        this.f41234x = new RectF();
        this.f41235y = new Object();
        this.f41236z = new Rect();
        aVar.f41208i = AndroidUtilities.dpf2(1.0f);
        aVar.f41209j = AndroidUtilities.dpf2(0.6666667f);
        this.f41223l = AndroidUtilities.dpf2(1.0f);
        this.f41224m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: pg.b.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
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
            if (canvas.clipRect(f17, f13, f18, n.a((2.0f * f10) + f13, f13, f15))) {
                canvas.drawRoundRect(f17, f13 + f16, f18, f15 + f16, f10, f10, paint);
            }
        } else {
            float f19 = f12 - f16;
            float f20 = f14 + f16;
            if (canvas.clipRect(f19, n.a(f15 - (2.0f * f10), f13, f15), f20, f15)) {
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
        x xVar = this.f41235y;
        xVar.f6326a = 0L;
        xVar.f6327b = false;
        xVar.a(i10);
        xVar.a(this.d);
        a aVar = this.h;
        for (float f10 : aVar.f41204b) {
            xVar.c(f10);
        }
        xVar.c(this.f41223l);
        xVar.c(0.0f);
        xVar.c(this.f41224m);
        xVar.b(z4);
        if (z4) {
            xVar.a(this.f41218f);
            xVar.a(this.f41219g);
            xVar.c(aVar.f41208i);
            xVar.c(aVar.f41209j);
        }
        if (xVar.f6327b) {
            j10 = -1;
        } else {
            j10 = xVar.f6326a;
        }
        if (this.A == null || this.B != j10) {
            this.B = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = t7.b(null, aVar.f41204b, this.f41223l, this.f41224m, i11, new xw0(i10, this, z4));
            this.A = b10;
            b10.getPadding(this.f41236z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f41212m;
        RectF rectF = this.f41233w;
        rectF.set(rect);
        rectF.offset(this.f41215a, this.f41216b);
        RectF rectF2 = this.f41234x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, sg.a aVar) {
        int i10;
        boolean z4;
        a aVar2 = this.h;
        Rect rect = aVar2.f41212m;
        Rect rect2 = aVar2.f41212m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof sg.c) {
                d(canvas, ((sg.c) aVar).f44309a.getColor());
            } else if (aVar instanceof sg.b) {
                sg.b bVar = (sg.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f41232u.get();
                Paint paint = this.f41228q;
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
                    Rect rect3 = this.f41236z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f41221j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f41221j > 0) {
                    Matrix matrix = bVar.f44305b;
                    Matrix matrix2 = this.f41231t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f41215a, -this.f41216b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f41221j);
                    aVar2.b(canvas, paint);
                }
                int l1 = j6.l1(this.f41221j / 255.0f, this.e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f41229r;
                    paint2.setColor(l1);
                    aVar2.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof sg.d)) {
                sg.d dVar = (sg.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f44310a);
                }
            } else if (aVar instanceof e) {
                c(canvas, ((e) aVar).f44317a);
            } else if (aVar != null && (i10 = this.f41221j) != 0) {
                int l12 = j6.l1(i10 / 255.0f, this.e);
                if (Color.alpha(this.d) > 0 && this.f41221j == 255) {
                    float f10 = this.f41225n;
                    if (f10 > 0.0f) {
                        float f11 = this.f41223l;
                        float f12 = this.f41224m;
                        int l13 = j6.l1(f10, this.d);
                        Paint paint3 = this.f41230s;
                        paint3.setShadowLayer(f11, 0.0f, f12, l13);
                        aVar2.c(canvas, paint3, this.f41222k);
                    }
                }
                float f13 = this.f41215a;
                float f14 = this.f41216b;
                float f15 = rect2.left;
                float f16 = f15 + f13;
                float f17 = rect2.top;
                float f18 = f17 + f14;
                float f19 = rect2.right;
                float f20 = f19 + f13;
                float f21 = rect2.bottom;
                float f22 = f21 + f14;
                int i12 = this.f41221j;
                if (i12 != 255) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
                }
                canvas.save();
                canvas.clipPath(aVar2.f41210k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f16, -f18);
                aVar.X(canvas, f16, f18, f20, f22);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f41226o;
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
        int h = i0.a.h(this.e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f41212m;
        int i11 = rect.left;
        Rect rect2 = this.f41236z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f41221j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = j6.l1(this.f41221j / 255.0f, this.f41218f);
        int l12 = j6.l1(this.f41221j / 255.0f, this.f41219g);
        int alpha = Color.alpha(l1);
        a aVar = this.h;
        Paint paint = this.f41227p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(aVar.f41213n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(aVar.f41214o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f41221j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        a aVar = this.h;
        h(outline, aVar.f41212m, aVar.f41204b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        a aVar = this.h;
        int i10 = aVar.d;
        rect.set(i10, i10, i10, i10);
        return aVar.e;
    }

    public abstract sg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(qg.a aVar) {
        this.f41217c = aVar;
        u();
        if (aVar instanceof qg.d) {
            qg.d dVar = (qg.d) aVar;
            float f10 = dVar.f43063f;
            float f11 = dVar.h;
            a aVar2 = this.h;
            aVar2.f41208i = f10;
            aVar2.f41209j = f11;
            float f12 = dVar.f43064n;
            float f13 = dVar.f43065r;
            this.f41223l = f12;
            this.f41224m = f13;
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
        aVar.f41203a.set(rect);
        aVar.a();
        j();
    }

    public final void p(float f10) {
        a aVar = this.h;
        Arrays.fill(aVar.f41204b, f10);
        Arrays.fill(aVar.f41205c, f10);
        aVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.f41204b;
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
        float[] fArr = aVar.f41204b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = aVar.f41205c;
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
        if (this.f41215a == f10 && this.f41216b == f11) {
            return;
        }
        this.f41215a = f10;
        this.f41216b = f11;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f41221j = i10;
    }

    public final void t(int i10) {
        this.h.f41206f = i10;
        j();
    }

    public void u() {
        qg.a aVar = this.f41217c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.D2();
        this.d = this.f41217c.W1();
        this.f41218f = this.f41217c.x0();
        this.f41219g = this.f41217c.X0();
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
