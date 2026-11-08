package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.dc;
import di.z5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.q5;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.y9;
public class w0 extends TextureView {
    public boolean D;
    public v0 f55248a;
    public m1 f55249b;
    public final j0 f55250c;
    public u0 d;
    public final w f55251e;
    public final i1 f55252f;
    public Bitmap h;
    public Bitmap f55253n;
    public boolean f55254r;
    public boolean f55255s;
    public float f55256w;
    public int f55257x;
    public h f55258y;

    public w0(Context context, j0 j0Var, Bitmap bitmap, Bitmap bitmap2, y9 y9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f55253n = bitmap2;
        this.f55250c = j0Var;
        j0Var.f55089f = this;
        setSurfaceTextureListener(new r0(this, y9Var));
        this.f55251e = new w(this);
        p0 p0Var = new p0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f55071c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f55072e = paint3;
        Paint paint4 = new Paint(1);
        obj.f55073f = paint4;
        Paint paint5 = new Paint(1);
        obj.f55074g = paint5;
        obj.f55079m = new ArrayList();
        obj.f55080n = new ArrayList();
        obj.f55082p = new float[2];
        obj.f55069a = this;
        obj.f55070b = p0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f55252f = obj;
        j0Var.f55085a = new vy(this, 17);
    }

    public final void a() {
        p0 p0Var = new p0(this, 2);
        w wVar = this.f55251e;
        wVar.f55230g = new n0(wVar.f55225a.getPainting().f55090g.f36114a, 0.0d, 1.0d);
        wVar.f55234l = true;
        wVar.a(new Object(), false, p0Var);
    }

    public final void b() {
        w0 w0Var;
        i1 i1Var = this.f55252f;
        if (i1Var != null && (w0Var = i1Var.f55069a) != null && w0Var.getPainting() != null && i1Var.h != null) {
            j0 painting = w0Var.getPainting();
            painting.f55089f.f(new f0(painting, 0));
            i1Var.f55079m.clear();
            i1Var.f55080n.clear();
            i1Var.h = null;
        }
    }

    public final Bitmap c(boolean z9, boolean z10) {
        if (this.f55258y instanceof g) {
            this.f55252f.e();
        }
        u0 u0Var = this.d;
        if (u0Var != null && u0Var.f55213f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                u0Var.postRunnable(new z5(u0Var, z9, z10, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        z0 z0Var;
        if (this.f55258y instanceof g) {
            i1 i1Var = this.f55252f;
            Paint paint = i1Var.f55071c;
            ArrayList arrayList = i1Var.f55079m;
            w0 w0Var = i1Var.f55069a;
            if (w0Var != null && w0Var.getPainting() != null) {
                mt0 mt0Var = w0Var.getPainting().f55090g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    h1 h1Var = (h1) arrayList.get(i7);
                    if (h1Var.f55064c && !h1Var.f55063b) {
                        i1Var.b(canvas, mt0Var, h1Var);
                    }
                }
                z0 z0Var2 = i1Var.h;
                if (z0Var2 != null && z0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-z0Var.h) / 3.141592653589793d) * 180.0d), (i1Var.h.f55267b / mt0Var.f36114a) * canvas.getWidth(), (i1Var.h.f55268c / mt0Var.f36115b) * canvas.getHeight());
                }
                z0 z0Var3 = i1Var.h;
                if (z0Var3 != null && z0Var3.f55266a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (i1Var.h.f55267b / mt0Var.f36114a), canvas.getHeight() * (i1Var.h.f55268c / mt0Var.f36115b), canvas.getWidth() * (i1Var.h.f55272i / mt0Var.f36114a), canvas.getHeight() * (i1Var.h.f55273j / mt0Var.f36115b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (i1Var.h.d / mt0Var.f36114a), canvas2.getHeight() * (i1Var.h.f55269e / mt0Var.f36115b), canvas2.getWidth() * (i1Var.h.f55272i / mt0Var.f36114a), canvas2.getHeight() * (i1Var.h.f55273j / mt0Var.f36115b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h1 h1Var2 = (h1) arrayList.get(i10);
                    if (h1Var2.f55064c && h1Var2.f55063b) {
                        i1Var.b(canvas2, mt0Var, h1Var2);
                    }
                }
                z0 z0Var4 = i1Var.h;
                if (z0Var4 != null && z0Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: sg.w0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        u0 u0Var = this.d;
        if (u0Var == null) {
            return;
        }
        u0Var.postRunnable(new org.telegram.ui.web.w(19, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f55258y;
    }

    public int getCurrentColor() {
        return this.f55257x;
    }

    public float getCurrentWeight() {
        return this.f55256w;
    }

    public j0 getPainting() {
        return this.f55250c;
    }

    public m1 getUndoStore() {
        return this.f55249b;
    }

    public final void h() {
        this.D = true;
        if (this.d != null) {
            f(new p0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f10;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f11 = 1.0f;
        j0 j0Var = this.f55250c;
        if (j0Var != null) {
            f10 = getWidth() / j0Var.f55090g.f36114a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        mt0 mt0Var = getPainting().f55090g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-mt0Var.f36114a) / 2.0f, (-mt0Var.f36115b) / 2.0f);
        if (this.f55258y instanceof g) {
            i1 i1Var = this.f55252f;
            i1Var.getClass();
            Matrix matrix2 = new Matrix();
            i1Var.f55081o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.f55251e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.f55242t = matrix3;
            matrix.invert(matrix3);
        }
        u0 u0Var = this.d;
        j0Var.f55106y = dc.c(dc.b(u0Var.f55214n, u0Var.f55215r), dc.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z9 = this.f55258y instanceof g;
        i1 i1Var = this.f55252f;
        if (z9) {
            i1Var.e();
        }
        this.f55258y = hVar;
        i();
        this.f55250c.q(this.f55258y);
        h hVar2 = this.f55258y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = i1Var.f55080n;
            ArrayList arrayList2 = i1Var.f55079m;
            w0 w0Var = i1Var.f55069a;
            if (w0Var != null && w0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                i1Var.h = new z0(g.p(o4));
                mt0 mt0Var = w0Var.getPainting().f55090g;
                z0 z0Var = i1Var.h;
                float f10 = mt0Var.f36114a;
                z0Var.f55267b = f10 / 2.0f;
                float f11 = mt0Var.f36115b;
                z0Var.f55268c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                z0Var.f55269e = min;
                z0Var.d = min;
                i1Var.h.f55270f = w0Var.getCurrentWeight();
                i1Var.h.f55271g = org.telegram.messenger.g0.L(32.0f);
                i1Var.h.f55275l = l0.e(p10.f24470s0).f55134k;
                if (i1Var.h.f55266a.o() == 4) {
                    z0 z0Var2 = i1Var.h;
                    float f12 = mt0Var.f36114a / 2.0f;
                    z0Var2.d = f12;
                    z0Var2.f55267b = f12;
                    z0Var2.f55272i = f12 + 1.0f;
                    float f13 = mt0Var.f36115b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    z0Var2.f55268c = f15;
                    float f16 = f13 / 2.0f;
                    z0Var2.f55273j = f16;
                    z0Var2.f55269e = f14 * 2.0f;
                    z0Var2.f55274k = Math.abs(f15 - f16);
                    e1 e1Var = new e1(i1Var, 0);
                    arrayList2.add(e1Var);
                    f1 f1Var = new f1(i1Var, e1Var, 0);
                    arrayList2.add(f1Var);
                    arrayList.add(f1Var);
                    f1 f1Var2 = new f1(i1Var, e1Var, 1);
                    arrayList2.add(f1Var2);
                    arrayList.add(f1Var2);
                }
                if (i1Var.h.f55266a.o() == 0) {
                    arrayList2.add(new e1(i1Var, 1));
                }
                if (i1Var.h.f55266a.o() == 2) {
                    arrayList2.add(new e1(i1Var, 2));
                }
                if (i1Var.h.f55266a.o() == 1 || i1Var.h.f55266a.o() == 3) {
                    arrayList2.add(new g1(i1Var, i1Var.h, false, false));
                    arrayList2.add(new g1(i1Var, i1Var.h, true, false));
                    arrayList2.add(new g1(i1Var, i1Var.h, false, true));
                    arrayList2.add(new g1(i1Var, i1Var.h, true, true));
                    arrayList2.add(new e1(i1Var, 3, false));
                }
                if (i1Var.h.f55266a.o() == 3) {
                    z0 z0Var3 = i1Var.h;
                    z0Var3.f55272i = (z0Var3.d * 0.8f) + z0Var3.f55267b;
                    z0Var3.f55273j = (z0Var3.f55269e * 1.2f) + z0Var3.f55268c + z0Var3.f55270f;
                    e1 e1Var2 = new e1(i1Var, 4);
                    arrayList2.add(e1Var2);
                    e1Var2.f55063b = false;
                    arrayList.add(e1Var2);
                }
                i1Var.f55078l = new e1(i1Var, 5, false);
                if (i1Var.h.f55266a.o() != 4) {
                    i1Var.f55078l.f55064c = false;
                }
                e1 e1Var3 = i1Var.f55078l;
                e1Var3.f55063b = false;
                arrayList.add(e1Var3);
                arrayList2.add(i1Var.f55078l);
                w0Var.getPainting().k(i1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f55250c.f55090g.f36114a;
        this.f55256w = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f55258y instanceof g) {
            i1 i1Var = this.f55252f;
            w0 w0Var = i1Var.f55069a;
            z0 z0Var = i1Var.h;
            if (z0Var != null && z0Var.f55270f != w0Var.getCurrentWeight()) {
                i1Var.h.f55270f = w0Var.getCurrentWeight();
                w0Var.getPainting().k(i1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f55257x = i7;
        if (this.f55258y instanceof g) {
            i1 i1Var = this.f55252f;
            if (i1Var.h != null) {
                i1Var.f55069a.getPainting().k(i1Var.h);
            }
        }
    }

    public void setDelegate(v0 v0Var) {
        this.f55248a = v0Var;
    }

    public void setUndoStore(m1 m1Var) {
        this.f55249b = m1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
