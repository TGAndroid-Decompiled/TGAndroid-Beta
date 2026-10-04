package pg;

import ai.b8;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.web.x1;
import w7.m6;
public class f1 extends TextureView {
    public e1 f44484a;
    public w1 f44485b;
    public final s0 f44486c;
    public d1 d;
    public final e0 f44487e;
    public final s1 f44488f;
    public Bitmap h;
    public Bitmap f44489n;
    public boolean f44490r;
    public boolean f44491s;
    public float v;
    public int f44492w;
    public m f44493x;
    public boolean f44494y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ka kaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44489n = bitmap2;
        this.f44486c = s0Var;
        s0Var.f44594f = this;
        setSurfaceTextureListener(new a1(this, kaVar));
        this.f44487e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44615c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f44616e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44617f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44618g = paint5;
        obj.f44623m = new ArrayList();
        obj.f44624n = new ArrayList();
        obj.f44626p = new float[2];
        obj.f44613a = this;
        obj.f44614b = y0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f44488f = obj;
        s0Var.f44590a = new l2.g(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.f44487e;
        e0Var.f44464g = new w0(e0Var.f44459a.getPainting().f44595g.f26590a, 0.0d, 1.0d);
        e0Var.f44468l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f44488f;
        if (s1Var != null && (f1Var = s1Var.f44613a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            s0 painting = f1Var.getPainting();
            painting.f44594f.f(new p0(painting, 0));
            s1Var.f44623m.clear();
            s1Var.f44624n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44493x instanceof l) {
            this.f44488f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f44452f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                d1Var.postRunnable(new b8(d1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f44493x instanceof l) {
            s1 s1Var = this.f44488f;
            Paint paint = s1Var.f44615c;
            ArrayList arrayList = s1Var.f44623m;
            f1 f1Var = s1Var.f44613a;
            if (f1Var != null && f1Var.getPainting() != null) {
                fw0 fw0Var = f1Var.getPainting().f44595g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f44582c && !r1Var.f44581b) {
                        s1Var.b(canvas, fw0Var, r1Var);
                    }
                }
                i1 i1Var = s1Var.h;
                if (i1Var != null && i1Var.h != 0.0f) {
                    canvas.save();
                    i1 i1Var2 = s1Var.h;
                    canvas.rotate((float) (((-i1Var2.h) / 3.141592653589793d) * 180.0d), (i1Var2.f44503b / fw0Var.f26590a) * canvas.getWidth(), (s1Var.h.f44504c / fw0Var.f26591b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f44502a.o() == 4) {
                    float width = canvas.getWidth() * (s1Var.h.f44503b / fw0Var.f26590a);
                    float height = canvas.getHeight() * (s1Var.h.f44504c / fw0Var.f26591b);
                    float width2 = canvas.getWidth() * (s1Var.h.f44508i / fw0Var.f26590a);
                    float height2 = canvas.getHeight() * (s1Var.h.f44509j / fw0Var.f26591b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / fw0Var.f26590a), canvas2.getHeight() * (s1Var.h.f44505e / fw0Var.f26591b), canvas2.getWidth() * (s1Var.h.f44508i / fw0Var.f26590a), canvas2.getHeight() * (s1Var.h.f44509j / fw0Var.f26591b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f44582c && r1Var2.f44581b) {
                        s1Var.b(canvas2, fw0Var, r1Var2);
                    }
                }
                i1 i1Var4 = s1Var.h;
                if (i1Var4 != null && i1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: pg.f1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        d1 d1Var = this.d;
        if (d1Var == null) {
            return;
        }
        d1Var.postRunnable(new x1(5, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f44493x;
    }

    public int getCurrentColor() {
        return this.f44492w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f44486c;
    }

    public w1 getUndoStore() {
        return this.f44485b;
    }

    public final void h() {
        this.f44494y = true;
        if (this.d != null) {
            f(new y0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f7;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = 1.0f;
        s0 s0Var = this.f44486c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f44595g.f26590a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        fw0 fw0Var = getPainting().f44595g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-fw0Var.f26590a) / 2.0f, (-fw0Var.f26591b) / 2.0f);
        if (this.f44493x instanceof l) {
            s1 s1Var = this.f44488f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f44625o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.f44487e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44476t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.f44611y = m6.c(m6.b(d1Var.f44453n, d1Var.f44454r), m6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44493x instanceof l;
        s1 s1Var = this.f44488f;
        if (z10) {
            s1Var.e();
        }
        this.f44493x = mVar;
        i();
        this.f44486c.q(this.f44493x);
        m mVar2 = this.f44493x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f44624n;
            ArrayList arrayList2 = s1Var.f44623m;
            f1 f1Var = s1Var.f44613a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o9));
                fw0 fw0Var = f1Var.getPainting().f44595g;
                i1 i1Var = s1Var.h;
                float f7 = fw0Var.f26590a;
                i1Var.f44503b = f7 / 2.0f;
                float f10 = fw0Var.f26591b;
                i1Var.f44504c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.f44505e = min;
                i1Var.d = min;
                s1Var.h.f44506f = f1Var.getCurrentWeight();
                s1Var.h.f44507g = AndroidUtilities.dp(32.0f);
                s1Var.h.f44511l = u0.e(UserConfig.selectedAccount).f44655k;
                if (s1Var.h.f44502a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = fw0Var.f26590a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f44503b = f11;
                    i1Var2.f44508i = f11 + 1.0f;
                    float f12 = fw0Var.f26591b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f44504c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f44509j = f15;
                    i1Var2.f44505e = f13 * 2.0f;
                    i1Var2.f44510k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f44502a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f44502a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f44502a.o() == 1 || s1Var.h.f44502a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f44502a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f44508i = (i1Var3.d * 0.8f) + i1Var3.f44503b;
                    i1Var3.f44509j = (i1Var3.f44505e * 1.2f) + i1Var3.f44504c + i1Var3.f44506f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f44581b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f44622l = new o1(s1Var, 5, false);
                if (s1Var.h.f44502a.o() != 4) {
                    s1Var.f44622l.f44582c = false;
                }
                o1 o1Var3 = s1Var.f44622l;
                o1Var3.f44581b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f44622l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44486c.f44595g.f26590a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44493x instanceof l) {
            s1 s1Var = this.f44488f;
            f1 f1Var = s1Var.f44613a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f44506f != f1Var.getCurrentWeight()) {
                s1Var.h.f44506f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44492w = i10;
        if (this.f44493x instanceof l) {
            s1 s1Var = this.f44488f;
            if (s1Var.h != null) {
                s1Var.f44613a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f44484a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f44485b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
