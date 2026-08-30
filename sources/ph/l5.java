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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.kg1;
public abstract class l5 extends FrameLayout {
    public static final int f41877y0 = 0;
    public y B;
    public oa C;
    public final org.telegram.ui.Components.ba D;
    public final k5 E;
    public long F;
    public long G;
    public final i5 H;
    public final i5 I;
    public final i5 J;
    public h8 K;
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
    public Bitmap f41878a;
    public float f41879a0;
    public final Rect f41880b;
    public boolean f41881b0;
    public final Rect f41882c;
    public final org.telegram.ui.Components.z5 f41883c0;
    public u6 d;
    public boolean f41884d0;
    public i71 e;
    public final Matrix f41885e0;
    public int f41886f;
    public final Matrix f41887f0;
    public final Matrix f41888g0;
    public int h;
    public boolean f41889h0;
    public final PointF f41890i0;
    public final PointF f41891j0;
    public float f41892k0;
    public double f41893l0;
    public boolean m0;
    public w61 f41894n;
    public boolean f41895n0;
    public boolean f41896o0;
    public final Matrix f41897p0;
    public final Matrix f41898q0;
    public TextureView f41899r;
    public float f41900r0;
    public nf0 f41901s;
    public boolean f41902s0;
    public boolean f41903t0;
    public long f41904u0;
    public h8 v;
    public Runnable f41905v0;
    public dg.b3 f41906w;
    public final HashSet f41907w0;
    public i71 f41908x;
    public c0 f41909x0;
    public i71 f41910y;

    public l5(Context context, org.telegram.ui.Components.ba baVar, k5 k5Var) {
        super(context);
        this.f41880b = new Rect();
        this.f41882c = new Rect();
        Paint paint = new Paint(1);
        new i5(this, 2);
        this.H = new i5(this, 3);
        this.I = new i5(this, 4);
        this.J = new i5(this, 5);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
        this.N = new Paint(7);
        this.Q = new Paint(1);
        this.T = new Matrix();
        this.U = new float[2];
        this.f41881b0 = true;
        this.f41883c0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nr.f27347g);
        this.f41884d0 = false;
        this.f41885e0 = new Matrix();
        this.f41887f0 = new Matrix();
        this.f41888g0 = new Matrix();
        this.f41889h0 = true;
        this.f41890i0 = new PointF();
        this.f41891j0 = new PointF();
        this.f41897p0 = new Matrix();
        this.f41898q0 = new Matrix();
        this.f41907w0 = new HashSet();
        this.D = baVar;
        this.E = k5Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ph.l5 r13, ph.u6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l5.a(ph.l5, ph.u6):void");
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
        throw new UnsupportedOperationException("Method not decompiled: ph.l5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.e4 e4Var, final boolean z4) {
        if (e4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.e4.e(z4), e4Var.h(i10, z4 ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var.f19666f.get(z4 ? 1 : 0)).f19625g, 0, false);
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
        final dc0 dc0Var = new dc0();
        dc0Var.f24238g = false;
        dc0Var.t(dc0Var.f24251u, e4Var.k(z4 ? 1 : 0).settings.intensity);
        dc0Var.o(i12, i14, i16, i18, 0, true);
        dc0Var.v(0);
        final int f10 = dc0Var.f();
        e4Var.o(z4 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((qf.a) pair.second).f43051b;
                    org.telegram.ui.ActionBar.e4 e4Var2 = org.telegram.ui.ActionBar.e4.this;
                    if (longValue == e4Var2.i(z4 ? 1 : 0) && bitmap != null) {
                        int i19 = e4Var2.k(z4 ? 1 : 0).settings.intensity;
                        dc0 dc0Var2 = dc0Var;
                        dc0Var2.t(bitmap, i19);
                        dc0Var2.u(f10);
                        dc0Var2.s(1.0f);
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
        return dc0Var;
    }

    private void setupCollage(u6 u6Var) {
        ArrayList<u6> arrayList;
        oa oaVar = this.C;
        if (oaVar != null) {
            if (u6Var != null) {
                arrayList = u6Var.T;
            } else {
                arrayList = null;
            }
            oaVar.setCollage(arrayList);
        }
    }

    private void setupImage(u6 u6Var) {
        Utilities.searchQueue.postRunnable(new kg1(24, this, u6Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        u6 u6Var;
        i71 i71Var = this.e;
        float f12 = 0.0f;
        if (i71Var != null) {
            if (!this.L && ((u6Var = this.d) == null || !u6Var.Y)) {
                if (u6Var != null) {
                    f11 = u6Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            i71Var.W(f11);
        }
        i71 i71Var2 = this.f41908x;
        if (i71Var2 != null) {
            if (this.L) {
                f10 = 0.0f;
            } else {
                u6 u6Var2 = this.d;
                if (u6Var2 != null) {
                    f10 = u6Var2.f42440u0;
                } else {
                    f10 = 1.0f;
                }
            }
            i71Var2.W(f10);
        }
        i71 i71Var3 = this.f41910y;
        if (i71Var3 != null) {
            if (!this.L) {
                u6 u6Var3 = this.d;
                if (u6Var3 != null) {
                    f12 = u6Var3.G;
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
        u6 u6Var = this.d;
        if (u6Var == null) {
            return;
        }
        float[] fArr = this.U;
        fArr[0] = u6Var.f42421k0 / 2.0f;
        fArr[1] = u6Var.f42423l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.V = fArr[0];
        this.W = fArr[1];
        u6 u6Var2 = this.d;
        fArr[0] = u6Var2.f42421k0;
        fArr[1] = u6Var2.f42423l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f41879a0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.W, fArr[0] - this.V));
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
        u6 u6Var3 = this.d;
        fArr[0] = u6Var3.f42421k0 / 2.0f;
        fArr[1] = u6Var3.f42423l0;
        matrix.mapPoints(fArr);
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        u6 u6Var;
        MediaController.CropState cropState;
        if (this.P != null) {
            float f10 = 0.0f;
            if (this.f41884d0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.P;
            if (!(drawable instanceof dc0) || ((dc0) drawable).f24251u != null) {
                f10 = this.M.d(1.0f, false);
            }
            Drawable drawable2 = this.O;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                u6.j(canvas, this.O, getWidth(), getHeight());
            }
            this.P.setAlpha((int) (f10 * 255.0f));
            u6.j(canvas, this.P, getWidth(), getHeight());
            if (this.f41884d0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.Q);
        }
        c0 c0Var = this.f41909x0;
        if (c0Var != null) {
            c0Var.d.b(canvas2, true);
        } else if (this.f41881b0 && this.d != null && !j()) {
            if (this.f41878a == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e = this.f41883c0.e(z4);
            if (this.f41878a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f42417i0, getHeight() / this.d.f42419j0);
                canvas2.concat(this.d.f42426n0);
                if (this.d.m0 != null) {
                    canvas2.translate(u6Var.f42421k0 / 2.0f, u6Var.f42423l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    u6 u6Var2 = this.d;
                    int i10 = u6Var2.f42421k0;
                    int i11 = u6Var2.f42423l0;
                    int i12 = u6Var2.Q;
                    MediaController.CropState cropState2 = u6Var2.m0;
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
                    u6 u6Var3 = this.d;
                    canvas2.translate((-u6Var3.f42421k0) / 2.0f, (-u6Var3.f42423l0) / 2.0f);
                }
                Paint paint = this.N;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f41878a.getWidth();
                int height = this.f41878a.getHeight();
                Rect rect = this.f41880b;
                rect.set(0, 0, width, height);
                u6 u6Var4 = this.d;
                int i13 = u6Var4.f42421k0;
                int i14 = u6Var4.f42423l0;
                Rect rect2 = this.f41882c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f41878a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u6 u6Var;
        u6 u6Var2;
        w61 w61Var = this.f41894n;
        if (view == w61Var && (u6Var2 = this.d) != null && u6Var2.f42439u) {
            return false;
        }
        if ((view == w61Var || view == this.f41899r) && (u6Var = this.d) != null && u6Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f42417i0, getHeight() / this.d.f42419j0);
            canvas.concat(this.d.f42426n0);
            u6 u6Var3 = this.d;
            if (u6Var3.m0 != null) {
                canvas.translate(u6Var3.f42421k0 / 2.0f, u6Var3.f42423l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                u6 u6Var4 = this.d;
                int i10 = u6Var4.f42421k0;
                int i11 = u6Var4.f42423l0;
                int i12 = u6Var4.Q;
                MediaController.CropState cropState = u6Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f10 = cropState.cropPw;
                float f11 = cropState.cropPh;
                canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                u6 u6Var5 = this.d;
                canvas.translate((-u6Var5.f42421k0) / 2.0f, (-u6Var5.f42423l0) / 2.0f);
            }
            canvas.concat(this.f41885e0);
            canvas.scale(1.0f / (getWidth() / this.d.f42417i0), 1.0f / (getHeight() / this.d.f42419j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        u6 u6Var = this.d;
        if (u6Var == null) {
            return 1;
        }
        return u6Var.f42423l0;
    }

    public int getContentWidth() {
        u6 u6Var = this.d;
        if (u6Var == null) {
            return 1;
        }
        return u6Var.f42421k0;
    }

    public long getCurrentPosition() {
        i71 i71Var = this.e;
        if (i71Var != null) {
            return i71Var.n();
        }
        i71 i71Var2 = this.f41908x;
        if (i71Var2 != null) {
            return i71Var2.n();
        }
        i71 i71Var3 = this.f41910y;
        if (i71Var3 != null) {
            return i71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        u6 u6Var = this.d;
        if (u6Var != null) {
            double d = u6Var.f42416i;
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
        u6 u6Var = this.d;
        if (u6Var == null) {
            return 0;
        }
        return u6Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f42417i0), Integer.valueOf(this.d.f42419j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f41878a;
    }

    public w61 getTextureView() {
        return this.f41894n;
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
                if (view2 == this && (w61Var = this.f41894n) != null) {
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
        u6 u6Var;
        if (this.B != null && (u6Var = this.d) != null && u6Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f41907w0.contains(-9982);
    }

    public final void l(u6 u6Var) {
        this.d = u6Var;
        if (u6Var == null) {
            setupImage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (u6Var.K) {
            setupImage(u6Var);
            if (u6Var.A0 == 0 && u6Var.B0 == 0) {
                u6Var.z(new i5((s9) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(u6Var);
            r();
        }
        b();
        u(u6Var);
        q(u6Var, false);
        s(u6Var, null, false);
    }

    public final void m(long j10) {
        i71 i71Var = this.e;
        if (i71Var != null) {
            i71Var.L(j10, false);
        } else if (j()) {
            this.B.m(j10, false);
        } else {
            i71 i71Var2 = this.f41908x;
            if (i71Var2 != null) {
                i71Var2.L(j10, false);
            } else {
                i71 i71Var3 = this.f41910y;
                if (i71Var3 != null) {
                    i71Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(u6 u6Var, n8 n8Var, long j10) {
        this.d = u6Var;
        if (u6Var == null) {
            t(null, n8Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (u6Var.v()) {
            setupImage(null);
            t(null, n8Var, j10);
            setupCollage(u6Var);
        } else if (u6Var.K) {
            setupImage(u6Var);
            setupCollage(null);
            t(u6Var, n8Var, j10);
            if (u6Var.A0 == 0 && u6Var.B0 == 0) {
                u6Var.z(new i5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, n8Var, 0L);
            setupImage(u6Var);
            r();
        }
        b();
        u(u6Var);
        q(u6Var, false);
        s(u6Var, null, false);
    }

    public final void o(TextureView textureView, nf0 nf0Var) {
        TextureView textureView2 = this.f41899r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f41899r = null;
        }
        this.f41901s = nf0Var;
        this.f41899r = textureView;
        if (nf0Var != null) {
            int i10 = this.R;
            int i11 = this.S;
            vz vzVar = nf0Var.f27248i0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                nf0Var.G0 = i10;
                nf0Var.H0 = i11;
            }
        }
        TextureView textureView3 = this.f41899r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41889h0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(MessageObject messageObject) {
        long j10;
        int maxCount;
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.f42418j = true;
            float f10 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f19190id != 0) {
                    this.d.f42448z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f42448z;
                    inputDocument.f19196id = document.f19190id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f42446y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f42446y = pathToAttach.getAbsolutePath();
                        } else {
                            u6 u6Var2 = this.d;
                            u6Var2.f42446y = null;
                            u6Var2.f42448z = null;
                            u6Var2.A = null;
                            u6Var2.B = null;
                            u6Var2.D = 0L;
                            u6Var2.C = 0L;
                            u6Var2.E = 0.0f;
                            u6Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f42446y = pathToAttach.getAbsolutePath();
                }
                u6 u6Var3 = this.d;
                u6Var3.A = null;
                u6Var3.B = null;
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
                u6 u6Var4 = this.d;
                u6Var4.D = 0L;
                if (u6Var4.K) {
                    u6Var4.D = u6Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.B.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        u6 u6Var5 = ((x) obj).f42528n;
                        if (u6Var5 != null && u6Var5.K) {
                            j10 = this.B.getDuration();
                            break;
                        }
                    }
                }
                u6 u6Var6 = this.d;
                if (u6Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = u6Var6.C;
                }
                oa oaVar = this.C;
                if (oaVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = oaVar.getMaxCount();
                }
                u6 u6Var7 = this.d;
                if (u6Var7.C != 0) {
                    f10 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                u6Var7.F = f10;
            } else {
                u6Var.f42446y = null;
                u6Var.f42448z = null;
                u6Var.A = null;
                u6Var.B = null;
                u6Var.D = 0L;
                u6Var.C = 0L;
                u6Var.E = 0.0f;
                u6Var.F = 1.0f;
            }
        }
        q(this.d, true);
    }

    public final void q(u6 u6Var, boolean z4) {
        boolean z10;
        String str;
        float f10;
        float f11;
        float f12;
        i71 i71Var = this.f41910y;
        if (i71Var != null) {
            i71Var.B();
            this.f41910y.H();
            this.f41910y = null;
        }
        if (u6Var != null) {
            oa oaVar = this.C;
            boolean z11 = false;
            if (oaVar != null) {
                String str2 = u6Var.f42446y;
                String str3 = u6Var.A;
                String str4 = u6Var.B;
                long j10 = u6Var.C;
                long j11 = u6Var.D;
                float f13 = u6Var.E;
                float f14 = u6Var.F;
                float f15 = u6Var.G;
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
                    oaVar.f42075b0.f(oaVar.K, true);
                } else {
                    z10 = true;
                }
                oaVar.invalidate();
            } else {
                z10 = true;
            }
            if (u6Var.f42446y != null) {
                i71 i71Var2 = new i71();
                this.f41910y = i71Var2;
                i71Var2.f25616y = z10;
                i71Var2.G = new org.telegram.ui.Cells.f1(this, 11);
                i71Var2.D(Uri.fromFile(new File(u6Var.f42446y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = u6Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.C.setProgress(duration);
                }
                w(true);
            }
            da daVar = ((s9) this).f42313z0;
            h9 h9Var = daVar.f41531s1;
            if (h9Var != null) {
                u6 u6Var2 = daVar.H1;
                if (u6Var2 != null && u6Var2.f42446y != null) {
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
        u6 u6Var = this.d;
        int i11 = u6Var.A0;
        Paint paint = this.Q;
        if (i11 != 0 && u6Var.B0 != 0) {
            float f10 = i10;
            u6 u6Var2 = this.d;
            int i12 = u6Var2.A0;
            this.R = i12;
            int i13 = u6Var2.B0;
            this.S = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            w61 w61Var = this.f41894n;
            if (w61Var != null) {
                int i14 = this.R;
                int i15 = this.S;
                vz vzVar = w61Var.f30249b;
                if (vzVar == null) {
                    w61Var.f30252n = i14;
                    w61Var.f30253r = i15;
                } else {
                    vzVar.i(i14, i15);
                }
            }
            nf0 nf0Var = this.f41901s;
            if (nf0Var != null) {
                int i16 = this.R;
                int i17 = this.S;
                vz vzVar2 = nf0Var.f27248i0;
                if (vzVar2 != null) {
                    vzVar2.i(i16, i17);
                } else {
                    nf0Var.G0 = i16;
                    nf0Var.H0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f41878a;
            if (bitmap != null) {
                new org.telegram.ui.Cells.qa(this, i10, 2).run(g0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(u6 u6Var, dg.b3 b3Var, boolean z4) {
        i71 i71Var;
        if (u6Var != null && u6Var.f42428o0 != null) {
            i71 i71Var2 = this.f41908x;
            if (i71Var2 != null) {
                i71Var2.H();
                this.f41908x = null;
            }
            i71 i71Var3 = new i71();
            this.f41908x = i71Var3;
            i71Var3.f25616y = true;
            i71Var3.G = new o2.o(this, 13);
            this.f41908x.D(Uri.fromFile(u6Var.f42428o0), "other");
            c();
            this.f41906w = b3Var;
            if (b3Var != null && (i71Var = this.f41908x) != null) {
                i71Var.V(b3Var.f4397r0);
            }
            this.C.n(u6Var.f42428o0.getAbsolutePath(), u6Var.f42432q0, u6Var.f42434r0, u6Var.f42436s0, u6Var.f42438t0, u6Var.f42440u0, z4);
            y(true);
            return;
        }
        i71 i71Var4 = this.f41908x;
        if (i71Var4 != null) {
            i71Var4.B();
            this.f41908x.H();
            this.f41908x = null;
        }
        oa oaVar = this.C;
        if (oaVar != null) {
            oaVar.setRoundNull(z4);
        }
        this.f41906w = null;
        AndroidUtilities.cancelRunOnUIThread(this.H);
    }

    public void set(u6 u6Var) {
        n(u6Var, null, 0L);
    }

    public void setAllowCropping(boolean z4) {
        this.f41889h0 = z4;
    }

    public void setCollageView(y yVar) {
        this.B = yVar;
    }

    public void setCropEditorDrawing(c0 c0Var) {
        if (this.f41909x0 != c0Var) {
            this.f41909x0 = c0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z4) {
        this.f41881b0 = z4;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f41905v0 = runnable;
    }

    public void setVideoTimelineView(oa oaVar) {
        this.C = oaVar;
        if (oaVar != null) {
            oaVar.setDelegate(new j5(this, 0));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(u6 u6Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ba baVar;
        boolean z4;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (u6Var != null && !u6Var.v()) {
            i71 i71Var = this.e;
            if (i71Var != null) {
                i71Var.H();
                this.e = null;
            }
            i71 i71Var2 = new i71();
            this.e = i71Var2;
            i71Var2.f25616y = true;
            i71Var2.G = new l7.w0(this, u6Var, new Runnable[]{runnable}, 24);
            w61 w61Var = this.f41894n;
            if (w61Var != null) {
                w61Var.clearAnimation();
                w61 w61Var2 = this.f41894n;
                vz vzVar = w61Var2.f30249b;
                if (vzVar != null) {
                    vzVar.postRunnable(new sz(vzVar, 0));
                }
                w61Var2.f30248a = null;
                removeView(this.f41894n);
                this.f41894n = null;
            }
            this.f41894n = new w61(getContext(), this.e);
            this.D.e();
            w61 w61Var3 = this.f41894n;
            if (u6Var.f42439u) {
                baVar = null;
            } else {
                baVar = this.D;
            }
            w61Var3.f30254s = baVar;
            vz vzVar2 = w61Var3.f30249b;
            if (vzVar2 != null && (haVar = vzVar2.F) != null) {
                org.telegram.ui.Components.ba baVar2 = haVar.f25383t;
                if (baVar2 != null && baVar2.f23616m != null) {
                    baVar2.f23616m = null;
                }
                haVar.f25383t = baVar;
                if (baVar != null && baVar.f23616m != haVar) {
                    baVar.f23616m = haVar;
                    baVar.d();
                }
            }
            this.f41894n.setOpaque(false);
            b();
            k5 k5Var = this.E;
            if (k5Var != null && k5Var.f41859g) {
                k5Var.a(this.f41894n);
            } else {
                w61 w61Var4 = this.f41894n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                w61Var4.setAlpha(f10);
                addView(this.f41894n, k7.b6.e(-2, -2, 51));
            }
            org.telegram.ui.web.y0 y0Var = new org.telegram.ui.web.y0(this, 9);
            t6 t6Var = u6Var.f42408d1;
            if (t6Var != null) {
                y0Var.run(t6Var);
            } else if (u6Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new p6(u6Var, y0Var, 0));
            } else {
                ?? obj = new Object();
                u6Var.f42408d1 = obj;
                y0Var.run(obj);
            }
            File file = u6Var.Z0;
            if (file == null) {
                file = u6Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f41907w0.isEmpty());
            this.e.N(true);
            if (u6Var.h) {
                j10 = (u6Var.Z * ((float) u6Var.f42415h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j10, false);
            }
            c();
            w(true);
            if (u6Var.f42439u && (arrayList = u6Var.v) != null && arrayList.size() == 1 && ((MessageObject) u6Var.v.get(0)).type == 5) {
                z4 = true;
            } else {
                z4 = false;
            }
            oa oaVar = this.C;
            File file2 = u6Var.Z0;
            if (file2 == null) {
                file2 = u6Var.L;
            }
            oaVar.o(z4, file2.getAbsolutePath(), getDuration(), u6Var.P);
            this.C.setVideoLeft(u6Var.Z);
            this.C.setVideoRight(u6Var.f42399a0);
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
        k5 k5Var2 = this.E;
        if (k5Var2 != null && k5Var2.f41859g) {
            k5Var2.a(null);
        } else {
            w61 w61Var5 = this.f41894n;
            if (w61Var5 != null) {
                w61Var5.clearAnimation();
                this.f41894n.animate().alpha(0.0f).withEndAction(new i5(this, 6)).start();
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

    public final void u(u6 u6Var) {
        Drawable drawable = this.P;
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (u6Var == null) {
            this.P = null;
            return;
        }
        long j10 = u6Var.f42449z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.P, u6Var.f42398a, j10, u6Var.f42447y0);
            u6Var.f42445x0 = e;
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
        if (this.f41889h0) {
            if (motionEvent.getPointerCount() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            PointF pointF2 = this.f41891j0;
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
            PointF pointF3 = this.f41890i0;
            if (z12 != z4) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f41892k0 = f10;
                this.f41893l0 = d;
                this.m0 = z4;
            }
            u6 u6Var = this.d;
            if (u6Var != null) {
                float width = u6Var.f42417i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f41897p0;
                if (actionMasked == 0) {
                    this.f41900r0 = 0.0f;
                    this.f41902s0 = false;
                    invalidate();
                    this.f41903t0 = true;
                    matrix.set(this.d.f42426n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f41903t0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f41892k0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f41893l0);
                        float f17 = this.f41900r0 + degrees;
                        this.f41900r0 = f17;
                        if (!this.f41896o0) {
                            if (Math.abs(f17) > 20.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f41896o0 = z10;
                            if (!z10) {
                                d(matrix);
                                if ((Math.round(this.f41879a0 / 90.0f) * 90.0f) - this.f41879a0 > 20.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f41896o0 = z11;
                            }
                            if (!this.f41902s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f41902s0 = true;
                            }
                        }
                        if (this.f41896o0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f41895n0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f41895n0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f41898q0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.T;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f41879a0 / 90.0f) * 90.0f) - this.f41879a0;
                    if (this.f41896o0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.V, this.W);
                            if (!this.f41902s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f41902s0 = true;
                            }
                        } else {
                            this.f41902s0 = false;
                        }
                    }
                    this.d.f42426n0.set(matrix2);
                    this.d.f42418j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f41895n0 = false;
                        da daVar = ((s9) this).f42313z0;
                        daVar.l1.a(true, false, daVar.f41490f0);
                        daVar.l1.b(daVar.Z0.getText());
                    }
                    this.f41903t0 = false;
                    this.f41896o0 = false;
                    this.f41900r0 = 0.0f;
                    this.f41902s0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f41892k0 = f10;
                this.f41893l0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: ph.l5.w(boolean):void");
    }

    public final void x(int i10, boolean z4) {
        HashSet hashSet = this.f41907w0;
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
        if (this.f41908x != null && this.d != null) {
            boolean z11 = true;
            if (this.e == null && !j()) {
                this.f41908x.P(this.f41907w0.isEmpty());
                this.f41908x.N(true);
                dg.b3 b3Var = this.f41906w;
                if (b3Var != null && !b3Var.f4404y0) {
                    b3Var.f4404y0 = true;
                    b3Var.f4405z0.f(true, true);
                    b3Var.invalidate();
                }
                long n11 = this.f41908x.n();
                if (z4 && this.f41908x.p() != -9223372036854775807L) {
                    float p10 = ((float) n11) / ((float) this.f41908x.p());
                    u6 u6Var = this.d;
                    if ((p10 < u6Var.f42436s0 || p10 > u6Var.f42438t0) && System.currentTimeMillis() - this.G > 500) {
                        this.G = System.currentTimeMillis();
                        this.f41908x.L(-this.d.f42434r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.B.getPositionWithOffset();
                y10 = this.B.f42591n0;
            } else {
                n10 = this.e.n();
                y10 = this.e.y();
            }
            u6 u6Var2 = this.d;
            float f11 = u6Var2.f42438t0;
            float f12 = u6Var2.f42436s0;
            long j10 = (f11 - f12) * ((float) u6Var2.f42432q0);
            long j11 = u6Var2.f42434r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y10 && z10) ? false : false;
            long j12 = (n10 - j11) + (f12 * f10);
            dg.b3 b3Var2 = this.f41906w;
            if (b3Var2 != null && b3Var2.f4404y0 != z10) {
                b3Var2.f4404y0 = z10;
                b3Var2.invalidate();
            }
            if (this.f41908x.y() != z11) {
                this.f41908x.P(z11);
                this.f41908x.L(j12, false);
            } else if (z4) {
                long abs = Math.abs(this.f41908x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f41908x.L(j12, false);
                }
            }
        }
    }
}
