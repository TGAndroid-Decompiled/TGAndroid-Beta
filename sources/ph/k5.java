package ph;

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tg;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zz;
import org.telegram.ui.sg1;
public abstract class k5 extends FrameLayout {
    public static final int f41887y0 = 0;
    public y B;
    public oa C;
    public final org.telegram.ui.Components.ba D;
    public final j5 E;
    public long F;
    public long G;
    public final i5 H;
    public final i5 I;
    public final i5 J;
    public g8 K;
    public boolean L;
    public final org.telegram.ui.Components.z5 M;
    public final Paint N;
    public Drawable O;
    public Drawable P;
    public final Paint Q;
    public int R;
    public int S;
    public final Matrix T;
    public final float[] U;
    public float V;
    public float W;
    public Bitmap f41888a;
    public float f41889a0;
    public final Rect f41890b;
    public boolean f41891b0;
    public final Rect f41892c;
    public final org.telegram.ui.Components.z5 f41893c0;
    public t6 d;
    public boolean f41894d0;
    public i71 e;
    public final Matrix f41895e0;
    public int f41896f;
    public final Matrix f41897f0;
    public final Matrix f41898g0;
    public int h;
    public boolean f41899h0;
    public final PointF f41900i0;
    public final PointF f41901j0;
    public float f41902k0;
    public double f41903l0;
    public boolean m0;
    public w61 f41904n;
    public boolean f41905n0;
    public boolean f41906o0;
    public final Matrix f41907p0;
    public final Matrix f41908q0;
    public TextureView f41909r;
    public float f41910r0;
    public of0 f41911s;
    public boolean f41912s0;
    public boolean f41913t0;
    public long f41914u0;
    public g8 v;
    public Runnable f41915v0;
    public dg.b3 f41916w;
    public final HashSet f41917w0;
    public i71 f41918x;
    public c0 f41919x0;
    public i71 f41920y;

    public k5(Context context, org.telegram.ui.Components.ba baVar, j5 j5Var) {
        super(context);
        this.f41890b = new Rect();
        this.f41892c = new Rect();
        Paint paint = new Paint(1);
        new i5(this, 2);
        this.H = new i5(this, 3);
        this.I = new i5(this, 4);
        this.J = new i5(this, 5);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
        this.N = new Paint(7);
        this.Q = new Paint(1);
        this.T = new Matrix();
        this.U = new float[2];
        this.f41891b0 = true;
        this.f41893c0 = new org.telegram.ui.Components.z5(this, 0L, 320L, mr.f27123g);
        this.f41894d0 = false;
        this.f41895e0 = new Matrix();
        this.f41897f0 = new Matrix();
        this.f41898g0 = new Matrix();
        this.f41899h0 = true;
        this.f41900i0 = new PointF();
        this.f41901j0 = new PointF();
        this.f41907p0 = new Matrix();
        this.f41908q0 = new Matrix();
        this.f41917w0 = new HashSet();
        this.D = baVar;
        this.E = j5Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ph.k5 r13, ph.t6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k5.a(ph.k5, ph.t6):void");
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z4) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z4);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.e4 e4Var, final boolean z4) {
        if (e4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.e4.e(z4), e4Var.h(i10, z4 ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var.f19641f.get(z4 ? 1 : 0)).f19600g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = e4Var.h(i10, z4 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final ec0 ec0Var = new ec0();
        ec0Var.f24577g = false;
        ec0Var.t(ec0Var.f24590u, e4Var.k(z4 ? 1 : 0).settings.intensity);
        ec0Var.o(i12, i14, i16, i18, 0, true);
        ec0Var.v(0);
        final int f10 = ec0Var.f();
        e4Var.o(z4 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((pf.a) pair.second).f41225b;
                    org.telegram.ui.ActionBar.e4 e4Var2 = org.telegram.ui.ActionBar.e4.this;
                    if (longValue == e4Var2.i(z4 ? 1 : 0) && bitmap != null) {
                        int i19 = e4Var2.k(z4 ? 1 : 0).settings.intensity;
                        ec0 ec0Var2 = ec0Var;
                        ec0Var2.t(bitmap, i19);
                        ec0Var2.u(f10);
                        ec0Var2.s(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.k.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return ec0Var;
    }

    private void setupCollage(t6 t6Var) {
        ArrayList<t6> arrayList;
        oa oaVar = this.C;
        if (oaVar != null) {
            if (t6Var != null) {
                arrayList = t6Var.T;
            } else {
                arrayList = null;
            }
            oaVar.setCollage(arrayList);
        }
    }

    private void setupImage(t6 t6Var) {
        Utilities.searchQueue.postRunnable(new sg1(24, this, t6Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        t6 t6Var;
        i71 i71Var = this.e;
        float f12 = 0.0f;
        if (i71Var != null) {
            if (!this.L && ((t6Var = this.d) == null || !t6Var.Y)) {
                if (t6Var != null) {
                    f11 = t6Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            i71Var.W(f11);
        }
        i71 i71Var2 = this.f41918x;
        if (i71Var2 != null) {
            if (this.L) {
                f10 = 0.0f;
            } else {
                t6 t6Var2 = this.d;
                if (t6Var2 != null) {
                    f10 = t6Var2.f42441u0;
                } else {
                    f10 = 1.0f;
                }
            }
            i71Var2.W(f10);
        }
        i71 i71Var3 = this.f41920y;
        if (i71Var3 != null) {
            if (!this.L) {
                t6 t6Var3 = this.d;
                if (t6Var3 != null) {
                    f12 = t6Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            i71Var3.W(f12);
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setMuted(this.L);
        }
    }

    public final void d(Matrix matrix) {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return;
        }
        float[] fArr = this.U;
        fArr[0] = t6Var.f42422k0 / 2.0f;
        fArr[1] = t6Var.f42424l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.V = fArr[0];
        this.W = fArr[1];
        t6 t6Var2 = this.d;
        fArr[0] = t6Var2.f42422k0;
        fArr[1] = t6Var2.f42424l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f41889a0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.W, fArr[0] - this.V));
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
        t6 t6Var3 = this.d;
        fArr[0] = t6Var3.f42422k0 / 2.0f;
        fArr[1] = t6Var3.f42424l0;
        matrix.mapPoints(fArr);
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        t6 t6Var;
        MediaController.CropState cropState;
        if (this.P != null) {
            float f10 = 0.0f;
            if (this.f41894d0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.P;
            if (!(drawable instanceof ec0) || ((ec0) drawable).f24590u != null) {
                f10 = this.M.d(1.0f, false);
            }
            Drawable drawable2 = this.O;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                t6.j(canvas, this.O, getWidth(), getHeight());
            }
            this.P.setAlpha((int) (f10 * 255.0f));
            t6.j(canvas, this.P, getWidth(), getHeight());
            if (this.f41894d0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.Q);
        }
        c0 c0Var = this.f41919x0;
        if (c0Var != null) {
            c0Var.d.b(canvas2, true);
        } else if (this.f41891b0 && this.d != null && !j()) {
            if (this.f41888a == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e = this.f41893c0.e(z4);
            if (this.f41888a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f42418i0, getHeight() / this.d.f42420j0);
                canvas2.concat(this.d.f42427n0);
                if (this.d.m0 != null) {
                    canvas2.translate(t6Var.f42422k0 / 2.0f, t6Var.f42424l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    t6 t6Var2 = this.d;
                    int i10 = t6Var2.f42422k0;
                    int i11 = t6Var2.f42424l0;
                    int i12 = t6Var2.Q;
                    MediaController.CropState cropState2 = t6Var2.m0;
                    if (((i12 + cropState2.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f11 = cropState2.cropPw;
                    float f12 = cropState2.cropPh;
                    float f13 = i10;
                    float f14 = i11;
                    canvas2.clipRect(((-i10) * f11) / 2.0f, ((-i11) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.cropScale;
                    canvas2.scale(f15, f15);
                    MediaController.CropState cropState3 = this.d.m0;
                    canvas2.translate(cropState3.cropPx * f13, cropState3.cropPy * f14);
                    canvas2.rotate(this.d.m0.cropRotate + cropState.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    t6 t6Var3 = this.d;
                    canvas2.translate((-t6Var3.f42422k0) / 2.0f, (-t6Var3.f42424l0) / 2.0f);
                }
                Paint paint = this.N;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f41888a.getWidth();
                int height = this.f41888a.getHeight();
                Rect rect = this.f41890b;
                rect.set(0, 0, width, height);
                t6 t6Var4 = this.d;
                int i13 = t6Var4.f42422k0;
                int i14 = t6Var4.f42424l0;
                Rect rect2 = this.f41892c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f41888a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t6 t6Var;
        t6 t6Var2;
        w61 w61Var = this.f41904n;
        if (view == w61Var && (t6Var2 = this.d) != null && t6Var2.f42440u) {
            return false;
        }
        if ((view == w61Var || view == this.f41909r) && (t6Var = this.d) != null && t6Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f42418i0, getHeight() / this.d.f42420j0);
            canvas.concat(this.d.f42427n0);
            t6 t6Var3 = this.d;
            if (t6Var3.m0 != null) {
                canvas.translate(t6Var3.f42422k0 / 2.0f, t6Var3.f42424l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                t6 t6Var4 = this.d;
                int i10 = t6Var4.f42422k0;
                int i11 = t6Var4.f42424l0;
                int i12 = t6Var4.Q;
                MediaController.CropState cropState = t6Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f10 = cropState.cropPw;
                float f11 = cropState.cropPh;
                canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                t6 t6Var5 = this.d;
                canvas.translate((-t6Var5.f42422k0) / 2.0f, (-t6Var5.f42424l0) / 2.0f);
            }
            canvas.concat(this.f41895e0);
            canvas.scale(1.0f / (getWidth() / this.d.f42418i0), 1.0f / (getHeight() / this.d.f42420j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 1;
        }
        return t6Var.f42424l0;
    }

    public int getContentWidth() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 1;
        }
        return t6Var.f42422k0;
    }

    public long getCurrentPosition() {
        i71 i71Var = this.e;
        if (i71Var != null) {
            return i71Var.n();
        }
        i71 i71Var2 = this.f41918x;
        if (i71Var2 != null) {
            return i71Var2.n();
        }
        i71 i71Var3 = this.f41920y;
        if (i71Var3 != null) {
            return i71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        t6 t6Var = this.d;
        if (t6Var != null) {
            double d = t6Var.f42417i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        i71 i71Var = this.e;
        if (i71Var != null && i71Var.p() != -9223372036854775807L) {
            return this.e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 0;
        }
        return t6Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f42418i0), Integer.valueOf(this.d.f42420j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f41888a;
    }

    public w61 getTextureView() {
        return this.f41904n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        w61 w61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (w61Var = this.f41904n) != null) {
                    bitmapArr[i10] = w61Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i10].getWidth(), dp2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new tg(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        t6 t6Var;
        if (this.B != null && (t6Var = this.d) != null && t6Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f41917w0.contains(-9982);
    }

    public final void l(t6 t6Var) {
        this.d = t6Var;
        if (t6Var == null) {
            setupImage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (t6Var.K) {
            setupImage(t6Var);
            if (t6Var.A0 == 0 && t6Var.B0 == 0) {
                t6Var.z(new i5((s9) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(t6Var);
            r();
        }
        b();
        u(t6Var);
        q(t6Var, false);
        s(t6Var, null, false);
    }

    public final void m(long j10) {
        i71 i71Var = this.e;
        if (i71Var != null) {
            i71Var.L(j10, false);
        } else if (j()) {
            this.B.m(j10, false);
        } else {
            i71 i71Var2 = this.f41918x;
            if (i71Var2 != null) {
                i71Var2.L(j10, false);
            } else {
                i71 i71Var3 = this.f41920y;
                if (i71Var3 != null) {
                    i71Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(t6 t6Var, m8 m8Var, long j10) {
        this.d = t6Var;
        if (t6Var == null) {
            t(null, m8Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (t6Var.v()) {
            setupImage(null);
            t(null, m8Var, j10);
            setupCollage(t6Var);
        } else if (t6Var.K) {
            setupImage(t6Var);
            setupCollage(null);
            t(t6Var, m8Var, j10);
            if (t6Var.A0 == 0 && t6Var.B0 == 0) {
                t6Var.z(new i5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, m8Var, 0L);
            setupImage(t6Var);
            r();
        }
        b();
        u(t6Var);
        q(t6Var, false);
        s(t6Var, null, false);
    }

    public final void o(TextureView textureView, of0 of0Var) {
        TextureView textureView2 = this.f41909r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f41909r = null;
        }
        this.f41911s = of0Var;
        this.f41909r = textureView;
        if (of0Var != null) {
            int i10 = this.R;
            int i11 = this.S;
            vz vzVar = of0Var.f27535i0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                of0Var.G0 = i10;
                of0Var.H0 = i11;
            }
        }
        TextureView textureView3 = this.f41909r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41899h0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(MessageObject messageObject) {
        long j10;
        int maxCount;
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.f42419j = true;
            float f10 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f19165id != 0) {
                    this.d.f42449z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f42449z;
                    inputDocument.f19171id = document.f19165id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f42447y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f42447y = pathToAttach.getAbsolutePath();
                        } else {
                            t6 t6Var2 = this.d;
                            t6Var2.f42447y = null;
                            t6Var2.f42449z = null;
                            t6Var2.A = null;
                            t6Var2.B = null;
                            t6Var2.D = 0L;
                            t6Var2.C = 0L;
                            t6Var2.E = 0.0f;
                            t6Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f42447y = pathToAttach.getAbsolutePath();
                }
                t6 t6Var3 = this.d;
                t6Var3.A = null;
                t6Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i11);
                        i11++;
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
                t6 t6Var4 = this.d;
                t6Var4.D = 0L;
                if (t6Var4.K) {
                    t6Var4.D = t6Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.B.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        t6 t6Var5 = ((x) obj).f42562n;
                        if (t6Var5 != null && t6Var5.K) {
                            j10 = this.B.getDuration();
                            break;
                        }
                    }
                }
                t6 t6Var6 = this.d;
                if (t6Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = t6Var6.C;
                }
                oa oaVar = this.C;
                if (oaVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = oaVar.getMaxCount();
                }
                t6 t6Var7 = this.d;
                if (t6Var7.C != 0) {
                    f10 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                t6Var7.F = f10;
            } else {
                t6Var.f42447y = null;
                t6Var.f42449z = null;
                t6Var.A = null;
                t6Var.B = null;
                t6Var.D = 0L;
                t6Var.C = 0L;
                t6Var.E = 0.0f;
                t6Var.F = 1.0f;
            }
        }
        q(this.d, true);
    }

    public final void q(t6 t6Var, boolean z4) {
        boolean z10;
        String str;
        float f10;
        float f11;
        float f12;
        i71 i71Var = this.f41920y;
        if (i71Var != null) {
            i71Var.B();
            this.f41920y.H();
            this.f41920y = null;
        }
        if (t6Var != null) {
            oa oaVar = this.C;
            boolean z11 = false;
            if (oaVar != null) {
                String str2 = t6Var.f42447y;
                String str3 = t6Var.A;
                String str4 = t6Var.B;
                long j10 = t6Var.C;
                long j11 = t6Var.D;
                float f13 = t6Var.E;
                float f14 = t6Var.F;
                float f15 = t6Var.G;
                if (!TextUtils.equals(oaVar.L, str2)) {
                    ha haVar = oaVar.U;
                    if (haVar != null) {
                        haVar.a();
                        oaVar.U = null;
                        oaVar.R = false;
                    }
                    oaVar.L = str2;
                    oaVar.p();
                }
                oaVar.L = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                oaVar.K = !isEmpty;
                if (isEmpty) {
                    oaVar.M = false;
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
                if (oaVar.K) {
                    oaVar.O = j10;
                    oaVar.N = j11 - (((float) j10) * f13);
                    oaVar.P = f13;
                    oaVar.Q = f14;
                    oaVar.S = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, oaVar.I0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        oaVar.J0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = oaVar.J0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        oaVar.K0 = f11;
                        if (oaVar.J0.getLineCount() > 0) {
                            f12 = oaVar.J0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        oaVar.L0 = f12;
                    } else {
                        oaVar.K0 = 0.0f;
                        oaVar.J0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, oaVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        oaVar.N0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = oaVar.N0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        oaVar.O0 = f10;
                        if (oaVar.N0.getLineCount() > 0) {
                            f16 = oaVar.N0.getLineLeft(0);
                        }
                        oaVar.P0 = f16;
                    } else {
                        oaVar.O0 = 0.0f;
                        oaVar.N0 = null;
                    }
                }
                if (!z4) {
                    z10 = true;
                    oaVar.f42123b0.f(oaVar.K, true);
                } else {
                    z10 = true;
                }
                oaVar.invalidate();
            } else {
                z10 = true;
            }
            if (t6Var.f42447y != null) {
                i71 i71Var2 = new i71();
                this.f41920y = i71Var2;
                i71Var2.f25635y = z10;
                i71Var2.G = new zz(this, 7);
                i71Var2.D(Uri.fromFile(new File(t6Var.f42447y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = t6Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.C.setProgress(duration);
                }
                w(true);
            }
            da daVar = ((s9) this).f42378z0;
            h9 h9Var = daVar.f41569s1;
            if (h9Var != null) {
                t6 t6Var2 = daVar.H1;
                if (t6Var2 != null && t6Var2.f42447y != null) {
                    z11 = true;
                }
                h9Var.setHasAudio(z11);
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
            i10 = AndroidUtilities.displaySize.y;
        }
        t6 t6Var = this.d;
        int i11 = t6Var.A0;
        Paint paint = this.Q;
        if (i11 != 0 && t6Var.B0 != 0) {
            float f10 = i10;
            t6 t6Var2 = this.d;
            int i12 = t6Var2.A0;
            this.R = i12;
            int i13 = t6Var2.B0;
            this.S = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            w61 w61Var = this.f41904n;
            if (w61Var != null) {
                int i14 = this.R;
                int i15 = this.S;
                vz vzVar = w61Var.f30156b;
                if (vzVar == null) {
                    w61Var.f30159n = i14;
                    w61Var.f30160r = i15;
                } else {
                    vzVar.i(i14, i15);
                }
            }
            of0 of0Var = this.f41911s;
            if (of0Var != null) {
                int i16 = this.R;
                int i17 = this.S;
                vz vzVar2 = of0Var.f27535i0;
                if (vzVar2 != null) {
                    vzVar2.i(i16, i17);
                } else {
                    of0Var.G0 = i16;
                    of0Var.H0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f41888a;
            if (bitmap != null) {
                new org.telegram.ui.Cells.pa(this, i10, 2).run(g0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(t6 t6Var, dg.b3 b3Var, boolean z4) {
        i71 i71Var;
        if (t6Var != null && t6Var.f42429o0 != null) {
            i71 i71Var2 = this.f41918x;
            if (i71Var2 != null) {
                i71Var2.H();
                this.f41918x = null;
            }
            i71 i71Var3 = new i71();
            this.f41918x = i71Var3;
            i71Var3.f25635y = true;
            i71Var3.G = new tp0(this, 6);
            this.f41918x.D(Uri.fromFile(t6Var.f42429o0), "other");
            c();
            this.f41916w = b3Var;
            if (b3Var != null && (i71Var = this.f41918x) != null) {
                i71Var.V(b3Var.f4403r0);
            }
            this.C.n(t6Var.f42429o0.getAbsolutePath(), t6Var.f42433q0, t6Var.f42435r0, t6Var.f42437s0, t6Var.f42439t0, t6Var.f42441u0, z4);
            y(true);
            return;
        }
        i71 i71Var4 = this.f41918x;
        if (i71Var4 != null) {
            i71Var4.B();
            this.f41918x.H();
            this.f41918x = null;
        }
        oa oaVar = this.C;
        if (oaVar != null) {
            oaVar.setRoundNull(z4);
        }
        this.f41916w = null;
        AndroidUtilities.cancelRunOnUIThread(this.H);
    }

    public void set(t6 t6Var) {
        n(t6Var, null, 0L);
    }

    public void setAllowCropping(boolean z4) {
        this.f41899h0 = z4;
    }

    public void setCollageView(y yVar) {
        this.B = yVar;
    }

    public void setCropEditorDrawing(c0 c0Var) {
        if (this.f41919x0 != c0Var) {
            this.f41919x0 = c0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z4) {
        this.f41891b0 = z4;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f41915v0 = runnable;
    }

    public void setVideoTimelineView(oa oaVar) {
        this.C = oaVar;
        if (oaVar != null) {
            oaVar.setDelegate(new o2.i(this, 11));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(t6 t6Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ba baVar;
        boolean z4;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (t6Var != null && !t6Var.v()) {
            i71 i71Var = this.e;
            if (i71Var != null) {
                i71Var.H();
                this.e = null;
            }
            i71 i71Var2 = new i71();
            this.e = i71Var2;
            i71Var2.f25635y = true;
            i71Var2.G = new l7.w0(this, t6Var, new Runnable[]{runnable}, 24);
            w61 w61Var = this.f41904n;
            if (w61Var != null) {
                w61Var.clearAnimation();
                w61 w61Var2 = this.f41904n;
                vz vzVar = w61Var2.f30156b;
                if (vzVar != null) {
                    vzVar.postRunnable(new sz(vzVar, 0));
                }
                w61Var2.f30155a = null;
                removeView(this.f41904n);
                this.f41904n = null;
            }
            this.f41904n = new w61(getContext(), this.e);
            this.D.e();
            w61 w61Var3 = this.f41904n;
            if (t6Var.f42440u) {
                baVar = null;
            } else {
                baVar = this.D;
            }
            w61Var3.f30161s = baVar;
            vz vzVar2 = w61Var3.f30156b;
            if (vzVar2 != null && (haVar = vzVar2.F) != null) {
                org.telegram.ui.Components.ba baVar2 = haVar.f25368t;
                if (baVar2 != null && baVar2.f23602m != null) {
                    baVar2.f23602m = null;
                }
                haVar.f25368t = baVar;
                if (baVar != null && baVar.f23602m != haVar) {
                    baVar.f23602m = haVar;
                    baVar.d();
                }
            }
            this.f41904n.setOpaque(false);
            b();
            j5 j5Var = this.E;
            if (j5Var != null && j5Var.f41818g) {
                j5Var.a(this.f41904n);
            } else {
                w61 w61Var4 = this.f41904n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                w61Var4.setAlpha(f10);
                addView(this.f41904n, k7.b6.e(-2, -2, 51));
            }
            org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(this, 9);
            s6 s6Var = t6Var.f42409d1;
            if (s6Var != null) {
                a1Var.run(s6Var);
            } else if (t6Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new o6(t6Var, a1Var, 0));
            } else {
                ?? obj = new Object();
                t6Var.f42409d1 = obj;
                a1Var.run(obj);
            }
            File file = t6Var.Z0;
            if (file == null) {
                file = t6Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f41917w0.isEmpty());
            this.e.N(true);
            if (t6Var.h) {
                j10 = (t6Var.Z * ((float) t6Var.f42416h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j10, false);
            }
            c();
            w(true);
            if (t6Var.f42440u && (arrayList = t6Var.v) != null && arrayList.size() == 1 && ((MessageObject) t6Var.v.get(0)).type == 5) {
                z4 = true;
            } else {
                z4 = false;
            }
            oa oaVar = this.C;
            File file2 = t6Var.Z0;
            if (file2 == null) {
                file2 = t6Var.L;
            }
            oaVar.o(z4, file2.getAbsolutePath(), getDuration(), t6Var.P);
            this.C.setVideoLeft(t6Var.Z);
            this.C.setVideoRight(t6Var.f42400a0);
            oa oaVar2 = this.C;
            if (oaVar2 != null && i10 > 0) {
                oaVar2.setProgress(j10);
                return;
            }
            return;
        }
        i71 i71Var3 = this.e;
        if (i71Var3 != null) {
            i71Var3.B();
            this.e.H();
            this.e = null;
        }
        j5 j5Var2 = this.E;
        if (j5Var2 != null && j5Var2.f41818g) {
            j5Var2.a(null);
        } else {
            w61 w61Var5 = this.f41904n;
            if (w61Var5 != null) {
                w61Var5.clearAnimation();
                this.f41904n.animate().alpha(0.0f).withEndAction(new i5(this, 6)).start();
            }
        }
        oa oaVar3 = this.C;
        if (oaVar3 != null) {
            oaVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.H);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(t6 t6Var) {
        Drawable drawable = this.P;
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (t6Var == null) {
            this.P = null;
            return;
        }
        long j10 = t6Var.f42450z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.P, t6Var.f42399a, j10, t6Var.f42448y0);
            t6Var.f42446x0 = e;
            this.P = e;
            if (this.O != e) {
                this.O = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            org.telegram.ui.Components.ba baVar = this.D;
            if (baVar != null) {
                Drawable drawable2 = this.P;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.P.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f10 = intrinsicWidth;
                        float f11 = intrinsicHeight;
                        float max = Math.max(100.0f / f10, 100.0f / f11);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f10 * max);
                            intrinsicHeight = (int) (f11 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.P.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.P.draw(new Canvas(createBitmap));
                        baVar.f(createBitmap, true);
                    }
                } else {
                    baVar.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.P = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        double d;
        float f10;
        PointF pointF;
        boolean z10;
        boolean z11;
        if (this.f41899h0) {
            if (motionEvent.getPointerCount() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            PointF pointF2 = this.f41901j0;
            if (z4) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = k7.n6.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z12 = this.m0;
            PointF pointF3 = this.f41900i0;
            if (z12 != z4) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f41902k0 = f10;
                this.f41903l0 = d;
                this.m0 = z4;
            }
            t6 t6Var = this.d;
            if (t6Var != null) {
                float width = t6Var.f42418i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f41907p0;
                if (actionMasked == 0) {
                    this.f41910r0 = 0.0f;
                    this.f41912s0 = false;
                    invalidate();
                    this.f41913t0 = true;
                    matrix.set(this.d.f42427n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f41913t0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f41902k0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f41903l0);
                        float f17 = this.f41910r0 + degrees;
                        this.f41910r0 = f17;
                        if (!this.f41906o0) {
                            if (Math.abs(f17) > 20.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f41906o0 = z10;
                            if (!z10) {
                                d(matrix);
                                if ((Math.round(this.f41889a0 / 90.0f) * 90.0f) - this.f41889a0 > 20.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f41906o0 = z11;
                            }
                            if (!this.f41912s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f41912s0 = true;
                            }
                        }
                        if (this.f41906o0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f41905n0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f41905n0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f41908q0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.T;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f41889a0 / 90.0f) * 90.0f) - this.f41889a0;
                    if (this.f41906o0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.V, this.W);
                            if (!this.f41912s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f41912s0 = true;
                            }
                        } else {
                            this.f41912s0 = false;
                        }
                    }
                    this.d.f42427n0.set(matrix2);
                    this.d.f42419j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f41905n0 = false;
                        da daVar = ((s9) this).f42378z0;
                        daVar.l1.a(true, false, daVar.f41528f0);
                        daVar.l1.b(daVar.Z0.getText());
                    }
                    this.f41913t0 = false;
                    this.f41906o0 = false;
                    this.f41910r0 = 0.0f;
                    this.f41912s0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f41902k0 = f10;
                this.f41903l0 = d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.P != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k5.w(boolean):void");
    }

    public final void x(int i10, boolean z4) {
        HashSet hashSet = this.f41917w0;
        if (z4) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        i71 i71Var = this.e;
        if (i71Var != null) {
            i71Var.P(hashSet.isEmpty());
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z4) {
        long n10;
        boolean y10;
        float f10;
        boolean z10;
        int i10;
        if (this.f41918x != null && this.d != null) {
            boolean z11 = true;
            if (this.e == null && !j()) {
                this.f41918x.P(this.f41917w0.isEmpty());
                this.f41918x.N(true);
                dg.b3 b3Var = this.f41916w;
                if (b3Var != null && !b3Var.f4410y0) {
                    b3Var.f4410y0 = true;
                    b3Var.f4411z0.f(true, true);
                    b3Var.invalidate();
                }
                long n11 = this.f41918x.n();
                if (z4 && this.f41918x.p() != -9223372036854775807L) {
                    float p10 = ((float) n11) / ((float) this.f41918x.p());
                    t6 t6Var = this.d;
                    if ((p10 < t6Var.f42437s0 || p10 > t6Var.f42439t0) && System.currentTimeMillis() - this.G > 500) {
                        this.G = System.currentTimeMillis();
                        this.f41918x.L(-this.d.f42435r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.B.getPositionWithOffset();
                y10 = this.B.f42628n0;
            } else {
                n10 = this.e.n();
                y10 = this.e.y();
            }
            t6 t6Var2 = this.d;
            float f11 = t6Var2.f42439t0;
            float f12 = t6Var2.f42437s0;
            long j10 = (f11 - f12) * ((float) t6Var2.f42433q0);
            long j11 = t6Var2.f42435r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y10 && z10) ? false : false;
            long j12 = (n10 - j11) + (f12 * f10);
            dg.b3 b3Var2 = this.f41916w;
            if (b3Var2 != null && b3Var2.f4410y0 != z10) {
                b3Var2.f4410y0 = z10;
                b3Var2.invalidate();
            }
            if (this.f41918x.y() != z11) {
                this.f41918x.P(z11);
                this.f41918x.L(j12, false);
            } else if (z4) {
                long abs = Math.abs(this.f41918x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f41918x.L(j12, false);
                }
            }
        }
    }
}
