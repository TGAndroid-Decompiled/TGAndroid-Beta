package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.ur;
import org.telegram.messenger.vp;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x9;
public abstract class k4 extends FrameLayout {
    public static final int B0 = 0;
    public b0 A0;
    public u61 D;
    public x E;
    public z8 F;
    public final s9 G;
    public final j4 H;
    public long I;
    public long J;
    public final i4 K;
    public final i4 L;
    public final i4 M;
    public y6 N;
    public boolean O;
    public final org.telegram.ui.Components.t5 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f51401a;
    public final float[] f51402a0;
    public final Rect f51403b;
    public float f51404b0;
    public final Rect f51405c;
    public float f51406c0;
    public n5 d;
    public float f51407d0;
    public u61 e;
    public boolean f51408e0;
    public int f51409f;
    public final org.telegram.ui.Components.t5 f51410f0;
    public boolean f51411g0;
    public int h;
    public final Matrix f51412h0;
    public final Matrix f51413i0;
    public final Matrix f51414j0;
    public boolean f51415k0;
    public final PointF f51416l0;
    public final PointF m0;
    public k61 f51417n;
    public float f51418n0;
    public double f51419o0;
    public boolean f51420p0;
    public boolean f51421q0;
    public TextureView f51422r;
    public boolean f51423r0;
    public oe0 f51424s;
    public final Matrix f51425s0;
    public final Matrix f51426t0;
    public float f51427u0;
    public boolean f51428v0;
    public y6 f51429w;
    public boolean f51430w0;
    public jg.i2 f51431x;
    public long f51432x0;
    public u61 f51433y;
    public Runnable f51434y0;
    public final HashSet f51435z0;

    public k4(Context context, s9 s9Var, j4 j4Var) {
        super(context);
        this.f51403b = new Rect();
        this.f51405c = new Rect();
        Paint paint = new Paint(1);
        new i4(this, 2);
        this.K = new i4(this, 3);
        this.L = new i4(this, 4);
        this.M = new i4(this, 5);
        this.P = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f51402a0 = new float[2];
        this.f51408e0 = true;
        this.f51410f0 = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.f26496g);
        this.f51411g0 = false;
        this.f51412h0 = new Matrix();
        this.f51413i0 = new Matrix();
        this.f51414j0 = new Matrix();
        this.f51415k0 = true;
        this.f51416l0 = new PointF();
        this.m0 = new PointF();
        this.f51425s0 = new Matrix();
        this.f51426t0 = new Matrix();
        this.f51435z0 = new HashSet();
        this.G = s9Var;
        this.H = j4Var;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 1073741824);
    }

    public static void a(vh.k4 r13, vh.n5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k4.a(vh.k4, vh.n5):void");
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
            if (a2 != null) {
                wallPaper = a2.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = vp.r1(i10).M0(-j10);
            if (M0 != null) {
                wallPaper = M0.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k4.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.y3 y3Var, final boolean z10) {
        if (y3Var.l()) {
            org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.y3.d(z10), y3Var.g(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.x3) y3Var.f21561f.get(z10 ? 1 : 0)).f21519g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = y3Var.g(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.t6.Be;
        int i12 = g10.get(i11, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.t6.Ce;
        int i14 = g10.get(i13, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.t6.De;
        int i16 = g10.get(i15, org.telegram.ui.ActionBar.t6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.t6.Ee;
        int i18 = g10.get(i17, org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        final jb0 jb0Var = new jb0();
        jb0Var.f27284g = false;
        jb0Var.s(jb0Var.f27297u, y3Var.j(z10 ? 1 : 0).settings.intensity);
        jb0Var.o(i12, i14, i16, i18, 0, true);
        jb0Var.u(0);
        final int f7 = jb0Var.f();
        y3Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((wf.a) pair.second).f52834a;
                    org.telegram.ui.ActionBar.y3 y3Var2 = org.telegram.ui.ActionBar.y3.this;
                    if (longValue == y3Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = y3Var2.j(z10 ? 1 : 0).settings.intensity;
                        jb0 jb0Var2 = jb0Var;
                        jb0Var2.s(bitmap, i19);
                        jb0Var2.t(f7);
                        jb0Var2.r(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.l.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.l.b(this, tL_error);
            }
        });
        return jb0Var;
    }

    private void setupCollage(n5 n5Var) {
        ArrayList<n5> arrayList;
        z8 z8Var = this.F;
        if (z8Var != null) {
            if (n5Var != null) {
                arrayList = n5Var.T;
            } else {
                arrayList = null;
            }
            z8Var.setCollage(arrayList);
        }
    }

    private void setupImage(n5 n5Var) {
        Utilities.f14522g.c(new d1(5, this, n5Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        n5 n5Var;
        u61 u61Var = this.e;
        float f11 = 0.0f;
        if (u61Var != null) {
            if (!this.O && ((n5Var = this.d) == null || !n5Var.Y)) {
                if (n5Var != null) {
                    f10 = n5Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            u61Var.B0(f10);
        }
        u61 u61Var2 = this.f51433y;
        if (u61Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                n5 n5Var2 = this.d;
                if (n5Var2 != null) {
                    f7 = n5Var2.f51556u0;
                } else {
                    f7 = 1.0f;
                }
            }
            u61Var2.B0(f7);
        }
        u61 u61Var3 = this.D;
        if (u61Var3 != null) {
            if (!this.O) {
                n5 n5Var3 = this.d;
                if (n5Var3 != null) {
                    f11 = n5Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            u61Var3.B0(f11);
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return;
        }
        float[] fArr = this.f51402a0;
        fArr[0] = n5Var.f51537k0 / 2.0f;
        fArr[1] = n5Var.f51539l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f51404b0 = fArr[0];
        this.f51406c0 = fArr[1];
        n5 n5Var2 = this.d;
        fArr[0] = n5Var2.f51537k0;
        fArr[1] = n5Var2.f51539l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f51407d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f51406c0, fArr[0] - this.f51404b0));
        w7.z8.a(this.f51404b0, this.f51406c0, fArr[0], fArr[1]);
        n5 n5Var3 = this.d;
        fArr[0] = n5Var3.f51537k0 / 2.0f;
        fArr[1] = n5Var3.f51539l0;
        matrix.mapPoints(fArr);
        w7.z8.a(this.f51404b0, this.f51406c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        n5 n5Var;
        ye yeVar;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f51411g0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof jb0) || ((jb0) drawable).f27297u != null) {
                f7 = this.P.e(false, 1.0f);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                n5.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            n5.j(canvas, this.S, getWidth(), getHeight());
            if (this.f51411g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        b0 b0Var = this.A0;
        if (b0Var != null) {
            b0Var.d.b(canvas2, true);
        } else if (this.f51408e0 && this.d != null && !j()) {
            if (this.f51401a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f51410f0.d(z10);
            if (this.f51401a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f51533i0, getHeight() / this.d.f51535j0);
                canvas2.concat(this.d.f51542n0);
                if (this.d.m0 != null) {
                    canvas2.translate(n5Var.f51537k0 / 2.0f, n5Var.f51539l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    n5 n5Var2 = this.d;
                    int i10 = n5Var2.f51537k0;
                    int i11 = n5Var2.f51539l0;
                    int i12 = n5Var2.Q;
                    ye yeVar2 = n5Var2.m0;
                    if (((i12 + yeVar2.f19370k) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f10 = yeVar2.e;
                    float f11 = yeVar2.f19367f;
                    float f12 = i10;
                    float f13 = i11;
                    canvas2.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.f19366c;
                    canvas2.scale(f14, f14);
                    ye yeVar3 = this.d.m0;
                    canvas2.translate(yeVar3.f19364a * f12, yeVar3.f19365b * f13);
                    canvas2.rotate(this.d.m0.d + yeVar.f19370k);
                    if (this.d.m0.f19371l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    n5 n5Var3 = this.d;
                    canvas2.translate((-n5Var3.f51537k0) / 2.0f, (-n5Var3.f51539l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f51401a.getWidth();
                int height = this.f51401a.getHeight();
                Rect rect = this.f51403b;
                rect.set(0, 0, width, height);
                n5 n5Var4 = this.d;
                int i13 = n5Var4.f51537k0;
                int i14 = n5Var4.f51539l0;
                Rect rect2 = this.f51405c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f51401a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k4.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n5 n5Var;
        n5 n5Var2;
        k61 k61Var = this.f51417n;
        if (view == k61Var && (n5Var2 = this.d) != null && n5Var2.f51555u) {
            return false;
        }
        if ((view == k61Var || view == this.f51422r) && (n5Var = this.d) != null && n5Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f51533i0, getHeight() / this.d.f51535j0);
            canvas.concat(this.d.f51542n0);
            n5 n5Var3 = this.d;
            if (n5Var3.m0 != null) {
                canvas.translate(n5Var3.f51537k0 / 2.0f, n5Var3.f51539l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                n5 n5Var4 = this.d;
                int i10 = n5Var4.f51537k0;
                int i11 = n5Var4.f51539l0;
                int i12 = n5Var4.Q;
                ye yeVar = n5Var4.m0;
                if (((i12 + yeVar.f19370k) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = yeVar.e;
                float f10 = yeVar.f19367f;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                n5 n5Var5 = this.d;
                canvas.translate((-n5Var5.f51537k0) / 2.0f, (-n5Var5.f51539l0) / 2.0f);
            }
            canvas.concat(this.f51412h0);
            canvas.scale(1.0f / (getWidth() / this.d.f51533i0), 1.0f / (getHeight() / this.d.f51535j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 1;
        }
        return n5Var.f51539l0;
    }

    public int getContentWidth() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 1;
        }
        return n5Var.f51537k0;
    }

    public long getCurrentPosition() {
        u61 u61Var = this.e;
        if (u61Var != null) {
            return u61Var.S();
        }
        u61 u61Var2 = this.f51433y;
        if (u61Var2 != null) {
            return u61Var2.S();
        }
        u61 u61Var3 = this.D;
        if (u61Var3 != null) {
            return u61Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        n5 n5Var = this.d;
        if (n5Var != null) {
            double d = n5Var.f51532i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        u61 u61Var = this.e;
        if (u61Var != null && u61Var.U() != -9223372036854775807L) {
            return this.e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 0;
        }
        return n5Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f51533i0), Integer.valueOf(this.d.f51535j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f51401a;
    }

    public k61 getTextureView() {
        return this.f51417n;
    }

    public final void h(q20 q20Var, View... viewArr) {
        k61 k61Var;
        int L = (int) (org.telegram.messenger.i0.L(26.0f) * org.telegram.messenger.i0.f16025p);
        int L2 = (int) (org.telegram.messenger.i0.L(30.33f) * org.telegram.messenger.i0.f16025p);
        int L3 = (int) (org.telegram.messenger.i0.L(4.0f) * org.telegram.messenger.i0.f16025p);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (k61Var = this.f51417n) != null) {
                    bitmapArr[i10] = k61Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i10].getWidth(), L2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new ur(L, L2, L3, bitmapArr, q20Var));
    }

    public abstract void i();

    public final boolean j() {
        n5 n5Var;
        if (this.E != null && (n5Var = this.d) != null && n5Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f51435z0.contains(-9982);
    }

    public final void l(n5 n5Var) {
        this.d = n5Var;
        if (n5Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (n5Var.K) {
            setupImage(n5Var);
            if (n5Var.A0 == 0 && n5Var.B0 == 0) {
                n5Var.z(new i4((d8) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(n5Var);
            r();
        }
        b();
        u(n5Var);
        q(n5Var, false);
        s(n5Var, null, false);
    }

    public final void m(long j10) {
        u61 u61Var = this.e;
        if (u61Var != null) {
            u61Var.q0(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            u61 u61Var2 = this.f51433y;
            if (u61Var2 != null) {
                u61Var2.q0(j10, false);
            } else {
                u61 u61Var3 = this.D;
                if (u61Var3 != null) {
                    u61Var3.q0(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(n5 n5Var, c7 c7Var, long j10) {
        this.d = n5Var;
        if (n5Var == null) {
            t(null, c7Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (n5Var.v()) {
            setupImage(null);
            t(null, c7Var, j10);
            setupCollage(n5Var);
        } else if (n5Var.K) {
            setupImage(n5Var);
            setupCollage(null);
            t(n5Var, c7Var, j10);
            if (n5Var.A0 == 0 && n5Var.B0 == 0) {
                n5Var.z(new i4(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, c7Var, 0L);
            setupImage(n5Var);
            r();
        }
        b();
        u(n5Var);
        q(n5Var, false);
        s(n5Var, null, false);
    }

    public final void o(TextureView textureView, oe0 oe0Var) {
        TextureView textureView2 = this.f51422r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f51422r = null;
        }
        this.f51424s = oe0Var;
        this.f51422r = textureView;
        if (oe0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            gz gzVar = oe0Var.f29051l0;
            if (gzVar != null) {
                gzVar.h(i10, i11);
            } else {
                oe0Var.J0 = i10;
                oe0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f51422r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f51415k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(jj jjVar) {
        long j10;
        int maxCount;
        n5 n5Var = this.d;
        if (n5Var != null) {
            n5Var.f51534j = true;
            float f7 = 1.0f;
            if (jjVar != null) {
                int i10 = jjVar.I1;
                if (jjVar.f16337k != null) {
                    TLRPC.Document F0 = jjVar.F0();
                    if (F0 != null && F0.f19799id != 0) {
                        this.d.f51564z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f51564z;
                        inputDocument.f19805id = F0.f19799id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i11 = 0;
                    if (!TextUtils.isEmpty(jjVar.f16337k.attachPath)) {
                        this.d.f51562y = jjVar.f16337k.attachPath;
                    } else {
                        org.telegram.messenger.b8.G(i10);
                        File K = org.telegram.messenger.b8.K(F0, null, false, true);
                        if (K == null || !K.exists()) {
                            org.telegram.messenger.b8.G(i10);
                            K = org.telegram.messenger.b8.K(F0, null, true, true);
                            if (K != null && K.exists()) {
                                this.d.f51562y = K.getAbsolutePath();
                            } else {
                                n5 n5Var2 = this.d;
                                n5Var2.f51562y = null;
                                n5Var2.f51564z = null;
                                n5Var2.A = null;
                                n5Var2.B = null;
                                n5Var2.D = 0L;
                                n5Var2.C = 0L;
                                n5Var2.E = 0.0f;
                                n5Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f51562y = K.getAbsolutePath();
                    }
                    n5 n5Var3 = this.d;
                    n5Var3.A = null;
                    n5Var3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                            i12++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                this.d.A = documentAttribute2.performer;
                                if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                    this.d.B = documentAttribute2.title;
                                }
                                this.d.C = (long) (documentAttribute2.duration * 1000.0d);
                            } else if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                this.d.B = documentAttribute2.file_name;
                            }
                        }
                    }
                    n5 n5Var4 = this.d;
                    n5Var4.D = 0L;
                    if (n5Var4.K) {
                        n5Var4.D = n5Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.E.h;
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            n5 n5Var5 = ((w) obj).f52081n;
                            if (n5Var5 != null && n5Var5.K) {
                                j10 = this.E.getDuration();
                                break;
                            }
                        }
                    }
                    n5 n5Var6 = this.d;
                    if (n5Var6.K) {
                        j10 = getDuration();
                    } else {
                        j10 = n5Var6.C;
                    }
                    z8 z8Var = this.F;
                    if (z8Var == null) {
                        maxCount = 1;
                    } else {
                        maxCount = z8Var.getMaxCount();
                    }
                    n5 n5Var7 = this.d;
                    if (n5Var7.C != 0) {
                        f7 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                    }
                    n5Var7.F = f7;
                }
            }
            n5Var.f51562y = null;
            n5Var.f51564z = null;
            n5Var.A = null;
            n5Var.B = null;
            n5Var.D = 0L;
            n5Var.C = 0L;
            n5Var.E = 0.0f;
            n5Var.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(n5 n5Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        u61 u61Var = this.D;
        if (u61Var != null) {
            u61Var.g0();
            this.D.m0();
            this.D = null;
        }
        if (n5Var != null) {
            z8 z8Var = this.F;
            boolean z12 = false;
            if (z8Var != null) {
                String str2 = n5Var.f51562y;
                String str3 = n5Var.A;
                String str4 = n5Var.B;
                long j10 = n5Var.C;
                long j11 = n5Var.D;
                float f12 = n5Var.E;
                float f13 = n5Var.F;
                float f14 = n5Var.G;
                if (!TextUtils.equals(z8Var.O, str2)) {
                    s8 s8Var = z8Var.f52258a0;
                    if (s8Var != null) {
                        s8Var.a();
                        z8Var.f52258a0 = null;
                        z8Var.U = false;
                    }
                    z8Var.O = str2;
                    z8Var.p();
                }
                z8Var.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                z8Var.N = !isEmpty;
                if (isEmpty) {
                    z8Var.P = false;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    str = null;
                } else {
                    str = str3;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = null;
                }
                if (z8Var.N) {
                    z8Var.R = j10;
                    z8Var.Q = j11 - (((float) j10) * f12);
                    z8Var.S = f12;
                    z8Var.T = f13;
                    z8Var.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, z8Var.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        z8Var.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = z8Var.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        z8Var.N0 = f10;
                        if (z8Var.M0.getLineCount() > 0) {
                            f11 = z8Var.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        z8Var.O0 = f11;
                    } else {
                        z8Var.N0 = 0.0f;
                        z8Var.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, z8Var.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        z8Var.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = z8Var.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        z8Var.R0 = f7;
                        if (z8Var.Q0.getLineCount() > 0) {
                            f15 = z8Var.Q0.getLineLeft(0);
                        }
                        z8Var.S0 = f15;
                    } else {
                        z8Var.R0 = 0.0f;
                        z8Var.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    z8Var.f52268e0.f(z8Var.N, true);
                } else {
                    z11 = true;
                }
                z8Var.invalidate();
            } else {
                z11 = true;
            }
            if (n5Var.f51562y != null) {
                u61 u61Var2 = new u61();
                this.D = u61Var2;
                u61Var2.D = z11;
                u61Var2.J = new e0(this);
                u61Var2.j0(Uri.fromFile(new File(n5Var.f51562y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = n5Var.Z * ((float) getDuration());
                    this.e.q0(duration, false);
                    this.F.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            o8 o8Var = ((d8) this).C0;
            s7 s7Var = o8Var.f51672v1;
            if (s7Var != null) {
                n5 n5Var2 = o8Var.K1;
                if (n5Var2 != null && n5Var2.f51562y != null) {
                    z12 = z11;
                }
                s7Var.setHasAudio(z12);
            }
        }
    }

    public final void r() {
        int i10;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i10 = getMeasuredHeight();
        } else {
            i10 = org.telegram.messenger.i0.f16026q.y;
        }
        n5 n5Var = this.d;
        int i11 = n5Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && n5Var.B0 != 0) {
            float f7 = i10;
            n5 n5Var2 = this.d;
            int i12 = n5Var2.A0;
            this.U = i12;
            int i13 = n5Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            k61 k61Var = this.f51417n;
            if (k61Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                gz gzVar = k61Var.f27647b;
                if (gzVar == null) {
                    k61Var.f27650n = i14;
                    k61Var.f27651r = i15;
                } else {
                    gzVar.h(i14, i15);
                }
            }
            oe0 oe0Var = this.f51424s;
            if (oe0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                gz gzVar2 = oe0Var.f29051l0;
                if (gzVar2 != null) {
                    gzVar2.h(i16, i17);
                } else {
                    oe0Var.J0 = i16;
                    oe0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f51401a;
            if (bitmap != null) {
                new ag.s2(this, i10, 7).a(w7.l8.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(n5 n5Var, jg.i2 i2Var, boolean z10) {
        u61 u61Var;
        if (n5Var != null && n5Var.f51544o0 != null) {
            u61 u61Var2 = this.f51433y;
            if (u61Var2 != null) {
                u61Var2.m0();
                this.f51433y = null;
            }
            u61 u61Var3 = new u61();
            this.f51433y = u61Var3;
            u61Var3.D = true;
            u61Var3.J = new w3(this);
            this.f51433y.j0(Uri.fromFile(n5Var.f51544o0), "other");
            c();
            this.f51431x = i2Var;
            if (i2Var != null && (u61Var = this.f51433y) != null) {
                u61Var.A0(i2Var.f10024u0);
            }
            this.F.n(n5Var.f51544o0.getAbsolutePath(), n5Var.f51548q0, n5Var.f51550r0, n5Var.f51552s0, n5Var.f51554t0, n5Var.f51556u0, z10);
            y(true);
            return;
        }
        u61 u61Var4 = this.f51433y;
        if (u61Var4 != null) {
            u61Var4.g0();
            this.f51433y.m0();
            this.f51433y = null;
        }
        z8 z8Var = this.F;
        if (z8Var != null) {
            z8Var.setRoundNull(z10);
        }
        this.f51431x = null;
        org.telegram.messenger.i0.r(this.K);
    }

    public void set(n5 n5Var) {
        n(n5Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f51415k0 = z10;
    }

    public void setCollageView(x xVar) {
        this.E = xVar;
    }

    public void setCropEditorDrawing(b0 b0Var) {
        if (this.A0 != b0Var) {
            this.A0 = b0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f51408e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f51434y0 = runnable;
    }

    public void setVideoTimelineView(z8 z8Var) {
        this.F = z8Var;
        if (z8Var != null) {
            z8Var.setDelegate(new r2.y(this, 13));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(n5 n5Var, Runnable runnable, long j10) {
        s9 s9Var;
        boolean z10;
        ArrayList arrayList;
        x9 x9Var;
        float f7 = 0.0f;
        if (n5Var != null && !n5Var.v()) {
            u61 u61Var = this.e;
            if (u61Var != null) {
                u61Var.m0();
                this.e = null;
            }
            u61 u61Var2 = new u61();
            this.e = u61Var2;
            u61Var2.D = true;
            u61Var2.J = new q5.d((FrameLayout) this, (Object) n5Var, (Serializable) new Runnable[]{runnable}, 15);
            k61 k61Var = this.f51417n;
            if (k61Var != null) {
                k61Var.clearAnimation();
                k61 k61Var2 = this.f51417n;
                gz gzVar = k61Var2.f27647b;
                if (gzVar != null) {
                    gzVar.postRunnable(new dz(gzVar, 0));
                }
                k61Var2.f27646a = null;
                removeView(this.f51417n);
                this.f51417n = null;
            }
            this.f51417n = new k61(getContext(), this.e);
            this.G.e();
            k61 k61Var3 = this.f51417n;
            if (n5Var.f51555u) {
                s9Var = null;
            } else {
                s9Var = this.G;
            }
            k61Var3.f27652s = s9Var;
            gz gzVar2 = k61Var3.f27647b;
            if (gzVar2 != null && (x9Var = gzVar2.I) != null) {
                s9 s9Var2 = x9Var.f32445t;
                if (s9Var2 != null && s9Var2.f30202m != null) {
                    s9Var2.f30202m = null;
                }
                x9Var.f32445t = s9Var;
                if (s9Var != null && s9Var.f30202m != x9Var) {
                    s9Var.f30202m = x9Var;
                    s9Var.d();
                }
            }
            this.f51417n.setOpaque(false);
            b();
            j4 j4Var = this.H;
            if (j4Var != null && j4Var.f51318g) {
                j4Var.a(this.f51417n);
            } else {
                k61 k61Var4 = this.f51417n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                k61Var4.setAlpha(f7);
                addView(this.f51417n, w7.b6.e(-2, -2, 51));
            }
            ph.h1 h1Var = new ph.h1(this, 27);
            m5 m5Var = n5Var.f51524d1;
            if (m5Var != null) {
                h1Var.a(m5Var);
            } else if (n5Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.e.c(new i5(n5Var, h1Var, 0));
            } else {
                ?? obj = new Object();
                n5Var.f51524d1 = obj;
                h1Var.a(obj);
            }
            File file = n5Var.Z0;
            if (file == null) {
                file = n5Var.L;
            }
            this.e.j0(Uri.fromFile(file), "other");
            this.e.u0(this.f51435z0.isEmpty());
            this.e.s0(true);
            if (n5Var.h) {
                j10 = (n5Var.Z * ((float) n5Var.f51531h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.q0(j10, false);
            }
            c();
            w(true);
            if (n5Var.f51555u && (arrayList = n5Var.v) != null && arrayList.size() == 1 && ((jj) n5Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            z8 z8Var = this.F;
            File file2 = n5Var.Z0;
            if (file2 == null) {
                file2 = n5Var.L;
            }
            z8Var.o(z10, file2.getAbsolutePath(), getDuration(), n5Var.P);
            this.F.setVideoLeft(n5Var.Z);
            this.F.setVideoRight(n5Var.f51515a0);
            z8 z8Var2 = this.F;
            if (z8Var2 != null && i10 > 0) {
                z8Var2.setProgress(j10);
                return;
            }
            return;
        }
        u61 u61Var3 = this.e;
        if (u61Var3 != null) {
            u61Var3.g0();
            this.e.m0();
            this.e = null;
        }
        j4 j4Var2 = this.H;
        if (j4Var2 != null && j4Var2.f51318g) {
            j4Var2.a(null);
        } else {
            k61 k61Var5 = this.f51417n;
            if (k61Var5 != null) {
                k61Var5.clearAnimation();
                this.f51417n.animate().alpha(0.0f).withEndAction(new i4(this, 6)).start();
            }
        }
        z8 z8Var3 = this.F;
        if (z8Var3 != null) {
            z8Var3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.i0.r(this.K);
        if (runnable != null) {
            org.telegram.messenger.i0.g3(runnable);
        }
    }

    public final void u(n5 n5Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (n5Var == null) {
            this.S = null;
            return;
        }
        long j10 = n5Var.f51565z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.S, n5Var.f51514a, j10, n5Var.f51563y0);
            n5Var.f51561x0 = e;
            this.S = e;
            if (this.R != e) {
                this.R = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            s9 s9Var = this.G;
            if (s9Var != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        s9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.S.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f7 = intrinsicWidth;
                        float f10 = intrinsicHeight;
                        float max = Math.max(100.0f / f7, 100.0f / f10);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f7 * max);
                            intrinsicHeight = (int) (f10 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.S.draw(new Canvas(createBitmap));
                        s9Var.f(createBitmap, true);
                    }
                } else {
                    s9Var.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.S = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        double d;
        float f7;
        n5 n5Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f51415k0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = w7.z8.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z13 = this.f51420p0;
            PointF pointF3 = this.f51416l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f51418n0 = f7;
                this.f51419o0 = d;
                this.f51420p0 = z10;
            }
            if (this.d != null) {
                float width = n5Var.f51533i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f51425s0;
                if (actionMasked == 0) {
                    this.f51427u0 = 0.0f;
                    this.f51428v0 = false;
                    invalidate();
                    this.f51430w0 = true;
                    matrix.set(this.d.f51542n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f51430w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f51418n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f51419o0);
                        float f16 = this.f51427u0 + degrees;
                        this.f51427u0 = f16;
                        if (!this.f51423r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f51423r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f51407d0 / 90.0f) * 90.0f) - this.f51407d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f51423r0 = z12;
                            }
                            if (!this.f51428v0) {
                                org.telegram.messenger.i0.b4(this);
                                this.f51428v0 = true;
                            }
                        }
                        if (this.f51423r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f51421q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f51421q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f51426t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f51407d0 / 90.0f) * 90.0f) - this.f51407d0;
                    if (this.f51423r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f51404b0, this.f51406c0);
                            if (!this.f51428v0) {
                                org.telegram.messenger.i0.b4(this);
                                this.f51428v0 = true;
                            }
                        } else {
                            this.f51428v0 = false;
                        }
                    }
                    this.d.f51542n0.set(matrix2);
                    this.d.f51534j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f51421q0 = false;
                        o8 o8Var = ((d8) this).C0;
                        o8Var.f51649o1.a(true, false, o8Var.f51631i0);
                        o8Var.f51649o1.b(o8Var.f51613c1.getText());
                    }
                    this.f51430w0 = false;
                    this.f51423r0 = false;
                    this.f51427u0 = 0.0f;
                    this.f51428v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f51418n0 = f7;
                this.f51419o0 = d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k4.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f51435z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        u61 u61Var = this.e;
        if (u61Var != null) {
            u61Var.u0(hashSet.isEmpty());
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long S;
        boolean d02;
        float f7;
        boolean z11;
        int i10;
        if (this.f51433y != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f51433y.u0(this.f51435z0.isEmpty());
                this.f51433y.s0(true);
                jg.i2 i2Var = this.f51431x;
                if (i2Var != null && !i2Var.B0) {
                    i2Var.B0 = true;
                    i2Var.C0.f(true, true);
                    i2Var.invalidate();
                }
                long S2 = this.f51433y.S();
                if (z10 && this.f51433y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f51433y.U());
                    n5 n5Var = this.d;
                    if ((U < n5Var.f51552s0 || U > n5Var.f51554t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f51433y.q0(-this.d.f51550r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.E.getPositionWithOffset();
                d02 = this.E.f52141q0;
            } else {
                S = this.e.S();
                d02 = this.e.d0();
            }
            n5 n5Var2 = this.d;
            float f10 = n5Var2.f51554t0;
            float f11 = n5Var2.f51552s0;
            long j10 = (f10 - f11) * ((float) n5Var2.f51548q0);
            long j11 = n5Var2.f51550r0;
            if (S >= j11 && S <= j10 + j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j12 = (S - j11) + (f11 * f7);
            jg.i2 i2Var2 = this.f51431x;
            if (i2Var2 != null && i2Var2.B0 != z11) {
                i2Var2.B0 = z11;
                i2Var2.invalidate();
            }
            if (this.f51433y.d0() != z12) {
                this.f51433y.u0(z12);
                this.f51433y.q0(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f51433y.S() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f51433y.q0(j12, false);
                }
            }
        }
    }
}
