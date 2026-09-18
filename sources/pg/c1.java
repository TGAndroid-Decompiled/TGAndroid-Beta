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
import org.telegram.ui.Components.kv0;
import w7.k6;
public class c1 extends TextureView {
    public b1 f40851a;
    public t1 f40852b;
    public final q0 f40853c;
    public a1 d;
    public final d0 e;
    public final p1 f40854f;
    public Bitmap h;
    public Bitmap f40855n;
    public boolean f40856r;
    public boolean f40857s;
    public float v;
    public int f40858w;
    public m f40859x;
    public boolean f40860y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ha haVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f40855n = bitmap2;
        this.f40853c = q0Var;
        q0Var.f40978f = this;
        setSurfaceTextureListener(new y0(this, haVar));
        this.e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f40963c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f40964f = paint4;
        Paint paint5 = new Paint(1);
        obj.f40965g = paint5;
        obj.f40970m = new ArrayList();
        obj.f40971n = new ArrayList();
        obj.f40973p = new float[2];
        obj.f40961a = this;
        obj.f40962b = w0Var;
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
        this.f40854f = obj;
        q0Var.f40975a = new k2.u(this, 18);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.e;
        d0Var.f40865g = new u0(d0Var.f40861a.getPainting().f40979g.f25698a, 0.0d, 1.0d);
        d0Var.f40869l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f40854f;
        if (p1Var != null && (c1Var = p1Var.f40961a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f40978f.f(new n0(painting, 0));
            p1Var.f40970m.clear();
            p1Var.f40971n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f40859x instanceof l) {
            this.f40854f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f40837f) {
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
        if (this.f40859x instanceof l) {
            p1 p1Var = this.f40854f;
            Paint paint = p1Var.f40963c;
            ArrayList arrayList = p1Var.f40970m;
            c1 c1Var = p1Var.f40961a;
            if (c1Var != null && c1Var.getPainting() != null) {
                kv0 kv0Var = c1Var.getPainting().f40979g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f40958c && !o1Var.f40957b) {
                        p1Var.b(canvas, kv0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f40890b / kv0Var.f25698a) * canvas.getWidth(), (p1Var.h.f40891c / kv0Var.f25699b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f40889a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f40890b / kv0Var.f25698a);
                    float height = canvas.getHeight() * (p1Var.h.f40891c / kv0Var.f25699b);
                    float width2 = canvas.getWidth() * (p1Var.h.f40894i / kv0Var.f25698a);
                    float height2 = canvas.getHeight() * (p1Var.h.f40895j / kv0Var.f25699b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / kv0Var.f25698a), canvas2.getHeight() * (p1Var.h.e / kv0Var.f25699b), canvas2.getWidth() * (p1Var.h.f40894i / kv0Var.f25698a), canvas2.getHeight() * (p1Var.h.f40895j / kv0Var.f25699b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f40958c && o1Var2.f40957b) {
                        p1Var.b(canvas2, kv0Var, o1Var2);
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
        return this.f40859x;
    }

    public int getCurrentColor() {
        return this.f40858w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f40853c;
    }

    public t1 getUndoStore() {
        return this.f40852b;
    }

    public final void h() {
        this.f40860y = true;
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
        q0 q0Var = this.f40853c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f40979g.f25698a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        kv0 kv0Var = getPainting().f40979g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-kv0Var.f25698a) / 2.0f, (-kv0Var.f25699b) / 2.0f);
        if (this.f40859x instanceof l) {
            p1 p1Var = this.f40854f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f40972o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f40877t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f40995y = k6.c(k6.b(a1Var.f40838n, a1Var.f40839r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f40859x instanceof l;
        p1 p1Var = this.f40854f;
        if (z10) {
            p1Var.e();
        }
        this.f40859x = mVar;
        i();
        this.f40853c.q(this.f40859x);
        m mVar2 = this.f40859x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f40971n;
            ArrayList arrayList2 = p1Var.f40970m;
            c1 c1Var = p1Var.f40961a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o9));
                kv0 kv0Var = c1Var.getPainting().f40979g;
                f1 f1Var = p1Var.h;
                float f7 = kv0Var.f25698a;
                f1Var.f40890b = f7 / 2.0f;
                float f10 = kv0Var.f25699b;
                f1Var.f40891c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f40892f = c1Var.getCurrentWeight();
                p1Var.h.f40893g = AndroidUtilities.dp(32.0f);
                p1Var.h.f40897l = s0.e(UserConfig.selectedAccount).f41026k;
                if (p1Var.h.f40889a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = kv0Var.f25698a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f40890b = f11;
                    f1Var2.f40894i = f11 + 1.0f;
                    float f12 = kv0Var.f25699b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f40891c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f40895j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f40896k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f40889a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f40889a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f40889a.o() == 1 || p1Var.h.f40889a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f40889a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f40894i = (f1Var3.d * 0.8f) + f1Var3.f40890b;
                    f1Var3.f40895j = (f1Var3.e * 1.2f) + f1Var3.f40891c + f1Var3.f40892f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f40957b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f40969l = new l1(p1Var, 5, false);
                if (p1Var.h.f40889a.o() != 4) {
                    p1Var.f40969l.f40958c = false;
                }
                l1 l1Var3 = p1Var.f40969l;
                l1Var3.f40957b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f40969l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f40853c.f40979g.f25698a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f40859x instanceof l) {
            p1 p1Var = this.f40854f;
            c1 c1Var = p1Var.f40961a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f40892f != c1Var.getCurrentWeight()) {
                p1Var.h.f40892f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f40858w = i10;
        if (this.f40859x instanceof l) {
            p1 p1Var = this.f40854f;
            if (p1Var.h != null) {
                p1Var.f40961a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f40851a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f40852b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
