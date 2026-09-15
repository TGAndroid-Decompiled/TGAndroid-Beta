package pg;

import ai.z7;
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
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
import w7.k6;
public class c1 extends TextureView {
    public b1 f40824a;
    public t1 f40825b;
    public final q0 f40826c;
    public a1 d;
    public final d0 e;
    public final p1 f40827f;
    public Bitmap h;
    public Bitmap f40828n;
    public boolean f40829r;
    public boolean f40830s;
    public float v;
    public int f40831w;
    public m f40832x;
    public boolean f40833y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ha haVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f40828n = bitmap2;
        this.f40826c = q0Var;
        q0Var.f40951f = this;
        setSurfaceTextureListener(new y0(this, haVar));
        this.e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f40936c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f40937f = paint4;
        Paint paint5 = new Paint(1);
        obj.f40938g = paint5;
        obj.f40943m = new ArrayList();
        obj.f40944n = new ArrayList();
        obj.f40946p = new float[2];
        obj.f40934a = this;
        obj.f40935b = w0Var;
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
        this.f40827f = obj;
        q0Var.f40948a = new k2.u(this, 18);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.e;
        d0Var.f40838g = new u0(d0Var.f40834a.getPainting().f40952g.f25443a, 0.0d, 1.0d);
        d0Var.f40842l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f40827f;
        if (p1Var != null && (c1Var = p1Var.f40934a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f40951f.f(new n0(painting, 0));
            p1Var.f40943m.clear();
            p1Var.f40944n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f40832x instanceof l) {
            this.f40827f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f40810f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new z7(a1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f40832x instanceof l) {
            p1 p1Var = this.f40827f;
            Paint paint = p1Var.f40936c;
            ArrayList arrayList = p1Var.f40943m;
            c1 c1Var = p1Var.f40934a;
            if (c1Var != null && c1Var.getPainting() != null) {
                jv0 jv0Var = c1Var.getPainting().f40952g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f40931c && !o1Var.f40930b) {
                        p1Var.b(canvas, jv0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f40863b / jv0Var.f25443a) * canvas.getWidth(), (p1Var.h.f40864c / jv0Var.f25444b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f40862a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f40863b / jv0Var.f25443a);
                    float height = canvas.getHeight() * (p1Var.h.f40864c / jv0Var.f25444b);
                    float width2 = canvas.getWidth() * (p1Var.h.f40867i / jv0Var.f25443a);
                    float height2 = canvas.getHeight() * (p1Var.h.f40868j / jv0Var.f25444b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / jv0Var.f25443a), canvas2.getHeight() * (p1Var.h.e / jv0Var.f25444b), canvas2.getWidth() * (p1Var.h.f40867i / jv0Var.f25443a), canvas2.getHeight() * (p1Var.h.f40868j / jv0Var.f25444b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f40931c && o1Var2.f40930b) {
                        p1Var.b(canvas2, jv0Var, o1Var2);
                    }
                }
                f1 f1Var4 = p1Var.h;
                if (f1Var4 != null && f1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: pg.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f40832x;
    }

    public int getCurrentColor() {
        return this.f40831w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f40826c;
    }

    public t1 getUndoStore() {
        return this.f40825b;
    }

    public final void h() {
        this.f40833y = true;
        if (this.d != null) {
            f(new w0(this, 1));
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
        q0 q0Var = this.f40826c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f40952g.f25443a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        jv0 jv0Var = getPainting().f40952g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-jv0Var.f25443a) / 2.0f, (-jv0Var.f25444b) / 2.0f);
        if (this.f40832x instanceof l) {
            p1 p1Var = this.f40827f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f40945o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f40850t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f40968y = k6.c(k6.b(a1Var.f40811n, a1Var.f40812r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f40832x instanceof l;
        p1 p1Var = this.f40827f;
        if (z10) {
            p1Var.e();
        }
        this.f40832x = mVar;
        i();
        this.f40826c.q(this.f40832x);
        m mVar2 = this.f40832x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f40944n;
            ArrayList arrayList2 = p1Var.f40943m;
            c1 c1Var = p1Var.f40934a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o9));
                jv0 jv0Var = c1Var.getPainting().f40952g;
                f1 f1Var = p1Var.h;
                float f7 = jv0Var.f25443a;
                f1Var.f40863b = f7 / 2.0f;
                float f10 = jv0Var.f25444b;
                f1Var.f40864c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f40865f = c1Var.getCurrentWeight();
                p1Var.h.f40866g = AndroidUtilities.dp(32.0f);
                p1Var.h.f40870l = s0.e(UserConfig.selectedAccount).f40999k;
                if (p1Var.h.f40862a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = jv0Var.f25443a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f40863b = f11;
                    f1Var2.f40867i = f11 + 1.0f;
                    float f12 = jv0Var.f25444b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f40864c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f40868j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f40869k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f40862a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f40862a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f40862a.o() == 1 || p1Var.h.f40862a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f40862a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f40867i = (f1Var3.d * 0.8f) + f1Var3.f40863b;
                    f1Var3.f40868j = (f1Var3.e * 1.2f) + f1Var3.f40864c + f1Var3.f40865f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f40930b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f40942l = new l1(p1Var, 5, false);
                if (p1Var.h.f40862a.o() != 4) {
                    p1Var.f40942l.f40931c = false;
                }
                l1 l1Var3 = p1Var.f40942l;
                l1Var3.f40930b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f40942l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f40826c.f40952g.f25443a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f40832x instanceof l) {
            p1 p1Var = this.f40827f;
            c1 c1Var = p1Var.f40934a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f40865f != c1Var.getCurrentWeight()) {
                p1Var.h.f40865f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f40831w = i10;
        if (this.f40832x instanceof l) {
            p1 p1Var = this.f40827f;
            if (p1Var.h != null) {
                p1Var.f40934a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f40824a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f40825b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
