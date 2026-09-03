package qh;

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
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.bh1;
public abstract class i5 extends FrameLayout {
    public static final int f45431y0 = 0;
    public y B;
    public la C;
    public final org.telegram.ui.Components.ba D;
    public final h5 E;
    public long F;
    public long G;
    public final g5 H;
    public final g5 I;
    public final g5 J;
    public f8 K;
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
    public Bitmap f45432a;
    public float f45433a0;
    public final Rect f45434b;
    public boolean f45435b0;
    public final Rect f45436c;
    public final org.telegram.ui.Components.z5 f45437c0;
    public r6 d;
    public boolean f45438d0;
    public j71 f45439e;
    public final Matrix f45440e0;
    public int f45441f;
    public final Matrix f45442f0;
    public final Matrix f45443g0;
    public int h;
    public boolean f45444h0;
    public final PointF f45445i0;
    public final PointF f45446j0;
    public float f45447k0;
    public double f45448l0;
    public boolean m0;
    public x61 f45449n;
    public boolean f45450n0;
    public boolean f45451o0;
    public final Matrix f45452p0;
    public final Matrix f45453q0;
    public TextureView f45454r;
    public float f45455r0;
    public pf0 f45456s;
    public boolean f45457s0;
    public boolean f45458t0;
    public long f45459u0;
    public f8 v;
    public Runnable f45460v0;
    public eg.z2 f45461w;
    public final HashSet f45462w0;
    public j71 f45463x;
    public c0 f45464x0;
    public j71 f45465y;

    public i5(Context context, org.telegram.ui.Components.ba baVar, h5 h5Var) {
        super(context);
        this.f45434b = new Rect();
        this.f45436c = new Rect();
        Paint paint = new Paint(1);
        new g5(this, 2);
        this.H = new g5(this, 3);
        this.I = new g5(this, 4);
        this.J = new g5(this, 5);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.N = new Paint(7);
        this.Q = new Paint(1);
        this.T = new Matrix();
        this.U = new float[2];
        this.f45435b0 = true;
        this.f45437c0 = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.f30169g);
        this.f45438d0 = false;
        this.f45440e0 = new Matrix();
        this.f45442f0 = new Matrix();
        this.f45443g0 = new Matrix();
        this.f45444h0 = true;
        this.f45445i0 = new PointF();
        this.f45446j0 = new PointF();
        this.f45452p0 = new Matrix();
        this.f45453q0 = new Matrix();
        this.f45462w0 = new HashSet();
        this.D = baVar;
        this.E = h5Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(qh.i5 r13, qh.r6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.i5.a(qh.i5, qh.r6):void");
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
        throw new UnsupportedOperationException("Method not decompiled: qh.i5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.f4 f4Var, final boolean z4) {
        if (f4Var.m()) {
            org.telegram.ui.ActionBar.k6.H(org.telegram.ui.ActionBar.f4.e(z4), f4Var.h(i10, z4 ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var.f21364f.get(z4 ? 1 : 0)).f21317g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = f4Var.h(i10, z4 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.k6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.k6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.k6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.k6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        final fc0 fc0Var = new fc0();
        fc0Var.f26875g = false;
        fc0Var.t(fc0Var.f26888u, f4Var.k(z4 ? 1 : 0).settings.intensity);
        fc0Var.o(i12, i14, i16, i18, 0, true);
        fc0Var.v(0);
        final int f10 = fc0Var.f();
        f4Var.o(z4 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((qf.a) pair.second).f44862b;
                    org.telegram.ui.ActionBar.f4 f4Var2 = org.telegram.ui.ActionBar.f4.this;
                    if (longValue == f4Var2.i(z4 ? 1 : 0) && bitmap != null) {
                        int i19 = f4Var2.k(z4 ? 1 : 0).settings.intensity;
                        fc0 fc0Var2 = fc0Var;
                        fc0Var2.t(bitmap, i19);
                        fc0Var2.u(f10);
                        fc0Var2.s(1.0f);
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
        return fc0Var;
    }

    private void setupCollage(r6 r6Var) {
        ArrayList<r6> arrayList;
        la laVar = this.C;
        if (laVar != null) {
            if (r6Var != null) {
                arrayList = r6Var.T;
            } else {
                arrayList = null;
            }
            laVar.setCollage(arrayList);
        }
    }

    private void setupImage(r6 r6Var) {
        Utilities.searchQueue.postRunnable(new bh1(23, this, r6Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        r6 r6Var;
        j71 j71Var = this.f45439e;
        float f12 = 0.0f;
        if (j71Var != null) {
            if (!this.L && ((r6Var = this.d) == null || !r6Var.Y)) {
                if (r6Var != null) {
                    f11 = r6Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            j71Var.W(f11);
        }
        j71 j71Var2 = this.f45463x;
        if (j71Var2 != null) {
            if (this.L) {
                f10 = 0.0f;
            } else {
                r6 r6Var2 = this.d;
                if (r6Var2 != null) {
                    f10 = r6Var2.f46035u0;
                } else {
                    f10 = 1.0f;
                }
            }
            j71Var2.W(f10);
        }
        j71 j71Var3 = this.f45465y;
        if (j71Var3 != null) {
            if (!this.L) {
                r6 r6Var3 = this.d;
                if (r6Var3 != null) {
                    f12 = r6Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            j71Var3.W(f12);
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setMuted(this.L);
        }
    }

    public final void d(Matrix matrix) {
        r6 r6Var = this.d;
        if (r6Var == null) {
            return;
        }
        float[] fArr = this.U;
        fArr[0] = r6Var.f46016k0 / 2.0f;
        fArr[1] = r6Var.f46018l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.V = fArr[0];
        this.W = fArr[1];
        r6 r6Var2 = this.d;
        fArr[0] = r6Var2.f46016k0;
        fArr[1] = r6Var2.f46018l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f45433a0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.W, fArr[0] - this.V));
        k7.o6.a(this.V, this.W, fArr[0], fArr[1]);
        r6 r6Var3 = this.d;
        fArr[0] = r6Var3.f46016k0 / 2.0f;
        fArr[1] = r6Var3.f46018l0;
        matrix.mapPoints(fArr);
        k7.o6.a(this.V, this.W, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        r6 r6Var;
        MediaController.CropState cropState;
        if (this.P != null) {
            float f10 = 0.0f;
            if (this.f45438d0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.P;
            if (!(drawable instanceof fc0) || ((fc0) drawable).f26888u != null) {
                f10 = this.M.d(1.0f, false);
            }
            Drawable drawable2 = this.O;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                r6.j(canvas, this.O, getWidth(), getHeight());
            }
            this.P.setAlpha((int) (f10 * 255.0f));
            r6.j(canvas, this.P, getWidth(), getHeight());
            if (this.f45438d0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.Q);
        }
        c0 c0Var = this.f45464x0;
        if (c0Var != null) {
            c0Var.d.b(canvas2, true);
        } else if (this.f45435b0 && this.d != null && !j()) {
            if (this.f45432a == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = this.f45437c0.e(z4);
            if (this.f45432a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f46012i0, getHeight() / this.d.f46014j0);
                canvas2.concat(this.d.f46021n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r6Var.f46016k0 / 2.0f, r6Var.f46018l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    r6 r6Var2 = this.d;
                    int i10 = r6Var2.f46016k0;
                    int i11 = r6Var2.f46018l0;
                    int i12 = r6Var2.Q;
                    MediaController.CropState cropState2 = r6Var2.m0;
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
                    r6 r6Var3 = this.d;
                    canvas2.translate((-r6Var3.f46016k0) / 2.0f, (-r6Var3.f46018l0) / 2.0f);
                }
                Paint paint = this.N;
                paint.setAlpha((int) ((1.0f - e6) * 255.0f));
                int width = this.f45432a.getWidth();
                int height = this.f45432a.getHeight();
                Rect rect = this.f45434b;
                rect.set(0, 0, width, height);
                r6 r6Var4 = this.d;
                int i13 = r6Var4.f46016k0;
                int i14 = r6Var4.f46018l0;
                Rect rect2 = this.f45436c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f45432a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: qh.i5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r6 r6Var;
        r6 r6Var2;
        x61 x61Var = this.f45449n;
        if (view == x61Var && (r6Var2 = this.d) != null && r6Var2.f46034u) {
            return false;
        }
        if ((view == x61Var || view == this.f45454r) && (r6Var = this.d) != null && r6Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f46012i0, getHeight() / this.d.f46014j0);
            canvas.concat(this.d.f46021n0);
            r6 r6Var3 = this.d;
            if (r6Var3.m0 != null) {
                canvas.translate(r6Var3.f46016k0 / 2.0f, r6Var3.f46018l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                r6 r6Var4 = this.d;
                int i10 = r6Var4.f46016k0;
                int i11 = r6Var4.f46018l0;
                int i12 = r6Var4.Q;
                MediaController.CropState cropState = r6Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f10 = cropState.cropPw;
                float f11 = cropState.cropPh;
                canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                r6 r6Var5 = this.d;
                canvas.translate((-r6Var5.f46016k0) / 2.0f, (-r6Var5.f46018l0) / 2.0f);
            }
            canvas.concat(this.f45440e0);
            canvas.scale(1.0f / (getWidth() / this.d.f46012i0), 1.0f / (getHeight() / this.d.f46014j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        r6 r6Var = this.d;
        if (r6Var == null) {
            return 1;
        }
        return r6Var.f46018l0;
    }

    public int getContentWidth() {
        r6 r6Var = this.d;
        if (r6Var == null) {
            return 1;
        }
        return r6Var.f46016k0;
    }

    public long getCurrentPosition() {
        j71 j71Var = this.f45439e;
        if (j71Var != null) {
            return j71Var.n();
        }
        j71 j71Var2 = this.f45463x;
        if (j71Var2 != null) {
            return j71Var2.n();
        }
        j71 j71Var3 = this.f45465y;
        if (j71Var3 != null) {
            return j71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        r6 r6Var = this.d;
        if (r6Var != null) {
            double d = r6Var.f46011i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        j71 j71Var = this.f45439e;
        if (j71Var != null && j71Var.p() != -9223372036854775807L) {
            return this.f45439e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        r6 r6Var = this.d;
        if (r6Var == null) {
            return 0;
        }
        return r6Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f46012i0), Integer.valueOf(this.d.f46014j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f45432a;
    }

    public x61 getTextureView() {
        return this.f45449n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        x61 x61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (x61Var = this.f45449n) != null) {
                    bitmapArr[i10] = x61Var.getBitmap();
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
        r6 r6Var;
        if (this.B != null && (r6Var = this.d) != null && r6Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f45462w0.contains(-9982);
    }

    public final void l(r6 r6Var) {
        this.d = r6Var;
        if (r6Var == null) {
            setupImage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (r6Var.K) {
            setupImage(r6Var);
            if (r6Var.A0 == 0 && r6Var.B0 == 0) {
                r6Var.z(new g5((p9) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(r6Var);
            r();
        }
        b();
        u(r6Var);
        q(r6Var, false);
        s(r6Var, null, false);
    }

    public final void m(long j10) {
        j71 j71Var = this.f45439e;
        if (j71Var != null) {
            j71Var.L(j10, false);
        } else if (j()) {
            this.B.m(j10, false);
        } else {
            j71 j71Var2 = this.f45463x;
            if (j71Var2 != null) {
                j71Var2.L(j10, false);
            } else {
                j71 j71Var3 = this.f45465y;
                if (j71Var3 != null) {
                    j71Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(r6 r6Var, k8 k8Var, long j10) {
        this.d = r6Var;
        if (r6Var == null) {
            t(null, k8Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (r6Var.v()) {
            setupImage(null);
            t(null, k8Var, j10);
            setupCollage(r6Var);
        } else if (r6Var.K) {
            setupImage(r6Var);
            setupCollage(null);
            t(r6Var, k8Var, j10);
            if (r6Var.A0 == 0 && r6Var.B0 == 0) {
                r6Var.z(new g5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, k8Var, 0L);
            setupImage(r6Var);
            r();
        }
        b();
        u(r6Var);
        q(r6Var, false);
        s(r6Var, null, false);
    }

    public final void o(TextureView textureView, pf0 pf0Var) {
        TextureView textureView2 = this.f45454r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f45454r = null;
        }
        this.f45456s = pf0Var;
        this.f45454r = textureView;
        if (pf0Var != null) {
            int i10 = this.R;
            int i11 = this.S;
            xz xzVar = pf0Var.f30060i0;
            if (xzVar != null) {
                xzVar.i(i10, i11);
            } else {
                pf0Var.G0 = i10;
                pf0Var.H0 = i11;
            }
        }
        TextureView textureView3 = this.f45454r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f45444h0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(MessageObject messageObject) {
        long j10;
        int maxCount;
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.f46013j = true;
            float f10 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f20851id != 0) {
                    this.d.f46043z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f46043z;
                    inputDocument.f20857id = document.f20851id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f46041y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f46041y = pathToAttach.getAbsolutePath();
                        } else {
                            r6 r6Var2 = this.d;
                            r6Var2.f46041y = null;
                            r6Var2.f46043z = null;
                            r6Var2.A = null;
                            r6Var2.B = null;
                            r6Var2.D = 0L;
                            r6Var2.C = 0L;
                            r6Var2.E = 0.0f;
                            r6Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f46041y = pathToAttach.getAbsolutePath();
                }
                r6 r6Var3 = this.d;
                r6Var3.A = null;
                r6Var3.B = null;
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
                r6 r6Var4 = this.d;
                r6Var4.D = 0L;
                if (r6Var4.K) {
                    r6Var4.D = r6Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.B.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        r6 r6Var5 = ((x) obj).f46295n;
                        if (r6Var5 != null && r6Var5.K) {
                            j10 = this.B.getDuration();
                            break;
                        }
                    }
                }
                r6 r6Var6 = this.d;
                if (r6Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = r6Var6.C;
                }
                la laVar = this.C;
                if (laVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = laVar.getMaxCount();
                }
                r6 r6Var7 = this.d;
                if (r6Var7.C != 0) {
                    f10 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                r6Var7.F = f10;
            } else {
                r6Var.f46041y = null;
                r6Var.f46043z = null;
                r6Var.A = null;
                r6Var.B = null;
                r6Var.D = 0L;
                r6Var.C = 0L;
                r6Var.E = 0.0f;
                r6Var.F = 1.0f;
            }
        }
        q(this.d, true);
    }

    public final void q(r6 r6Var, boolean z4) {
        boolean z10;
        String str;
        float f10;
        float f11;
        float f12;
        j71 j71Var = this.f45465y;
        if (j71Var != null) {
            j71Var.B();
            this.f45465y.H();
            this.f45465y = null;
        }
        if (r6Var != null) {
            la laVar = this.C;
            boolean z11 = false;
            if (laVar != null) {
                String str2 = r6Var.f46041y;
                String str3 = r6Var.A;
                String str4 = r6Var.B;
                long j10 = r6Var.C;
                long j11 = r6Var.D;
                float f13 = r6Var.E;
                float f14 = r6Var.F;
                float f15 = r6Var.G;
                if (!TextUtils.equals(laVar.L, str2)) {
                    ea eaVar = laVar.U;
                    if (eaVar != null) {
                        eaVar.a();
                        laVar.U = null;
                        laVar.R = false;
                    }
                    laVar.L = str2;
                    laVar.p();
                }
                laVar.L = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                laVar.K = !isEmpty;
                if (isEmpty) {
                    laVar.M = false;
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
                if (laVar.K) {
                    laVar.O = j10;
                    laVar.N = j11 - (((float) j10) * f13);
                    laVar.P = f13;
                    laVar.Q = f14;
                    laVar.S = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, laVar.I0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        laVar.J0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = laVar.J0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        laVar.K0 = f11;
                        if (laVar.J0.getLineCount() > 0) {
                            f12 = laVar.J0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        laVar.L0 = f12;
                    } else {
                        laVar.K0 = 0.0f;
                        laVar.J0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, laVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        laVar.N0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = laVar.N0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        laVar.O0 = f10;
                        if (laVar.N0.getLineCount() > 0) {
                            f16 = laVar.N0.getLineLeft(0);
                        }
                        laVar.P0 = f16;
                    } else {
                        laVar.O0 = 0.0f;
                        laVar.N0 = null;
                    }
                }
                if (!z4) {
                    z10 = true;
                    laVar.f45665b0.f(laVar.K, true);
                } else {
                    z10 = true;
                }
                laVar.invalidate();
            } else {
                z10 = true;
            }
            if (r6Var.f46041y != null) {
                j71 j71Var2 = new j71();
                this.f45465y = j71Var2;
                j71Var2.f28059y = z10;
                j71Var2.G = new ai(this, 8);
                j71Var2.D(Uri.fromFile(new File(r6Var.f46041y)), "other");
                c();
                if (this.f45439e != null && getDuration() > 0) {
                    long duration = r6Var.Z * ((float) getDuration());
                    this.f45439e.L(duration, false);
                    this.C.setProgress(duration);
                }
                w(true);
            }
            ba baVar = ((p9) this).f45901z0;
            e9 e9Var = baVar.f45100s1;
            if (e9Var != null) {
                r6 r6Var2 = baVar.H1;
                if (r6Var2 != null && r6Var2.f46041y != null) {
                    z11 = true;
                }
                e9Var.setHasAudio(z11);
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
        r6 r6Var = this.d;
        int i11 = r6Var.A0;
        Paint paint = this.Q;
        if (i11 != 0 && r6Var.B0 != 0) {
            float f10 = i10;
            r6 r6Var2 = this.d;
            int i12 = r6Var2.A0;
            this.R = i12;
            int i13 = r6Var2.B0;
            this.S = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            x61 x61Var = this.f45449n;
            if (x61Var != null) {
                int i14 = this.R;
                int i15 = this.S;
                xz xzVar = x61Var.f32958b;
                if (xzVar == null) {
                    x61Var.f32962n = i14;
                    x61Var.f32963r = i15;
                } else {
                    xzVar.i(i14, i15);
                }
            }
            pf0 pf0Var = this.f45456s;
            if (pf0Var != null) {
                int i16 = this.R;
                int i17 = this.S;
                xz xzVar2 = pf0Var.f30060i0;
                if (xzVar2 != null) {
                    xzVar2.i(i16, i17);
                } else {
                    pf0Var.G0 = i16;
                    pf0Var.H0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f45432a;
            if (bitmap != null) {
                new org.telegram.ui.Cells.qa(this, i10, 2).run(g0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(r6 r6Var, eg.z2 z2Var, boolean z4) {
        j71 j71Var;
        if (r6Var != null && r6Var.f46023o0 != null) {
            j71 j71Var2 = this.f45463x;
            if (j71Var2 != null) {
                j71Var2.H();
                this.f45463x = null;
            }
            j71 j71Var3 = new j71();
            this.f45463x = j71Var3;
            j71Var3.f28059y = true;
            j71Var3.G = new org.telegram.ui.web.e0(this, 6);
            this.f45463x.D(Uri.fromFile(r6Var.f46023o0), "other");
            c();
            this.f45461w = z2Var;
            if (z2Var != null && (j71Var = this.f45463x) != null) {
                j71Var.V(z2Var.f5590r0);
            }
            this.C.n(r6Var.f46023o0.getAbsolutePath(), r6Var.f46027q0, r6Var.f46029r0, r6Var.f46031s0, r6Var.f46033t0, r6Var.f46035u0, z4);
            y(true);
            return;
        }
        j71 j71Var4 = this.f45463x;
        if (j71Var4 != null) {
            j71Var4.B();
            this.f45463x.H();
            this.f45463x = null;
        }
        la laVar = this.C;
        if (laVar != null) {
            laVar.setRoundNull(z4);
        }
        this.f45461w = null;
        AndroidUtilities.cancelRunOnUIThread(this.H);
    }

    public void set(r6 r6Var) {
        n(r6Var, null, 0L);
    }

    public void setAllowCropping(boolean z4) {
        this.f45444h0 = z4;
    }

    public void setCollageView(y yVar) {
        this.B = yVar;
    }

    public void setCropEditorDrawing(c0 c0Var) {
        if (this.f45464x0 != c0Var) {
            this.f45464x0 = c0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z4) {
        this.f45435b0 = z4;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f45460v0 = runnable;
    }

    public void setVideoTimelineView(la laVar) {
        this.C = laVar;
        if (laVar != null) {
            laVar.setDelegate(new oh.h4(this, 12));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(r6 r6Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ba baVar;
        boolean z4;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (r6Var != null && !r6Var.v()) {
            j71 j71Var = this.f45439e;
            if (j71Var != null) {
                j71Var.H();
                this.f45439e = null;
            }
            j71 j71Var2 = new j71();
            this.f45439e = j71Var2;
            j71Var2.f28059y = true;
            j71Var2.G = new l7.w0(this, r6Var, new Runnable[]{runnable}, 28);
            x61 x61Var = this.f45449n;
            if (x61Var != null) {
                x61Var.clearAnimation();
                x61 x61Var2 = this.f45449n;
                xz xzVar = x61Var2.f32958b;
                if (xzVar != null) {
                    xzVar.postRunnable(new uz(xzVar, 0));
                }
                x61Var2.f32957a = null;
                removeView(this.f45449n);
                this.f45449n = null;
            }
            this.f45449n = new x61(getContext(), this.f45439e);
            this.D.e();
            x61 x61Var3 = this.f45449n;
            if (r6Var.f46034u) {
                baVar = null;
            } else {
                baVar = this.D;
            }
            x61Var3.f32964s = baVar;
            xz xzVar2 = x61Var3.f32958b;
            if (xzVar2 != null && (haVar = xzVar2.F) != null) {
                org.telegram.ui.Components.ba baVar2 = haVar.f27461t;
                if (baVar2 != null && baVar2.f25561m != null) {
                    baVar2.f25561m = null;
                }
                haVar.f27461t = baVar;
                if (baVar != null && baVar.f25561m != haVar) {
                    baVar.f25561m = haVar;
                    baVar.d();
                }
            }
            this.f45449n.setOpaque(false);
            b();
            h5 h5Var = this.E;
            if (h5Var != null && h5Var.f45409g) {
                h5Var.a(this.f45449n);
            } else {
                x61 x61Var4 = this.f45449n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                x61Var4.setAlpha(f10);
                addView(this.f45449n, k7.c6.e(-2, -2, 51));
            }
            org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 9);
            q6 q6Var = r6Var.f46002d1;
            if (q6Var != null) {
                d1Var.run(q6Var);
            } else if (r6Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new m6(r6Var, d1Var, 0));
            } else {
                ?? obj = new Object();
                r6Var.f46002d1 = obj;
                d1Var.run(obj);
            }
            File file = r6Var.Z0;
            if (file == null) {
                file = r6Var.L;
            }
            this.f45439e.D(Uri.fromFile(file), "other");
            this.f45439e.P(this.f45462w0.isEmpty());
            this.f45439e.N(true);
            if (r6Var.h) {
                j10 = (r6Var.Z * ((float) r6Var.f46010h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.f45439e.L(j10, false);
            }
            c();
            w(true);
            if (r6Var.f46034u && (arrayList = r6Var.v) != null && arrayList.size() == 1 && ((MessageObject) r6Var.v.get(0)).type == 5) {
                z4 = true;
            } else {
                z4 = false;
            }
            la laVar = this.C;
            File file2 = r6Var.Z0;
            if (file2 == null) {
                file2 = r6Var.L;
            }
            laVar.o(z4, file2.getAbsolutePath(), getDuration(), r6Var.P);
            this.C.setVideoLeft(r6Var.Z);
            this.C.setVideoRight(r6Var.f45993a0);
            la laVar2 = this.C;
            if (laVar2 != null && i10 > 0) {
                laVar2.setProgress(j10);
                return;
            }
            return;
        }
        j71 j71Var3 = this.f45439e;
        if (j71Var3 != null) {
            j71Var3.B();
            this.f45439e.H();
            this.f45439e = null;
        }
        h5 h5Var2 = this.E;
        if (h5Var2 != null && h5Var2.f45409g) {
            h5Var2.a(null);
        } else {
            x61 x61Var5 = this.f45449n;
            if (x61Var5 != null) {
                x61Var5.clearAnimation();
                this.f45449n.animate().alpha(0.0f).withEndAction(new g5(this, 6)).start();
            }
        }
        la laVar3 = this.C;
        if (laVar3 != null) {
            laVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.H);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(r6 r6Var) {
        Drawable drawable = this.P;
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (r6Var == null) {
            this.P = null;
            return;
        }
        long j10 = r6Var.f46044z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e6 = e(this.P, r6Var.f45992a, j10, r6Var.f46042y0);
            r6Var.f46040x0 = e6;
            this.P = e6;
            if (this.O != e6) {
                this.O = null;
            }
            if (e6 != null) {
                e6.setCallback(this);
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
        if (this.f45444h0) {
            if (motionEvent.getPointerCount() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            PointF pointF2 = this.f45446j0;
            if (z4) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = k7.o6.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z12 = this.m0;
            PointF pointF3 = this.f45445i0;
            if (z12 != z4) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f45447k0 = f10;
                this.f45448l0 = d;
                this.m0 = z4;
            }
            r6 r6Var = this.d;
            if (r6Var != null) {
                float width = r6Var.f46012i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f45452p0;
                if (actionMasked == 0) {
                    this.f45455r0 = 0.0f;
                    this.f45457s0 = false;
                    invalidate();
                    this.f45458t0 = true;
                    matrix.set(this.d.f46021n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f45458t0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f45447k0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f45448l0);
                        float f17 = this.f45455r0 + degrees;
                        this.f45455r0 = f17;
                        if (!this.f45451o0) {
                            if (Math.abs(f17) > 20.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f45451o0 = z10;
                            if (!z10) {
                                d(matrix);
                                if ((Math.round(this.f45433a0 / 90.0f) * 90.0f) - this.f45433a0 > 20.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f45451o0 = z11;
                            }
                            if (!this.f45457s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f45457s0 = true;
                            }
                        }
                        if (this.f45451o0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f45450n0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f45450n0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f45453q0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.T;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f45433a0 / 90.0f) * 90.0f) - this.f45433a0;
                    if (this.f45451o0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.V, this.W);
                            if (!this.f45457s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f45457s0 = true;
                            }
                        } else {
                            this.f45457s0 = false;
                        }
                    }
                    this.d.f46021n0.set(matrix2);
                    this.d.f46013j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f45450n0 = false;
                        ba baVar = ((p9) this).f45901z0;
                        baVar.l1.a(true, false, baVar.f45059f0);
                        baVar.l1.b(baVar.Z0.getText());
                    }
                    this.f45458t0 = false;
                    this.f45451o0 = false;
                    this.f45455r0 = 0.0f;
                    this.f45457s0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f45447k0 = f10;
                this.f45448l0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: qh.i5.w(boolean):void");
    }

    public final void x(int i10, boolean z4) {
        HashSet hashSet = this.f45462w0;
        if (z4) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        j71 j71Var = this.f45439e;
        if (j71Var != null) {
            j71Var.P(hashSet.isEmpty());
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
        if (this.f45463x != null && this.d != null) {
            boolean z11 = true;
            if (this.f45439e == null && !j()) {
                this.f45463x.P(this.f45462w0.isEmpty());
                this.f45463x.N(true);
                eg.z2 z2Var = this.f45461w;
                if (z2Var != null && !z2Var.f5597y0) {
                    z2Var.f5597y0 = true;
                    z2Var.f5598z0.f(true, true);
                    z2Var.invalidate();
                }
                long n11 = this.f45463x.n();
                if (z4 && this.f45463x.p() != -9223372036854775807L) {
                    float p10 = ((float) n11) / ((float) this.f45463x.p());
                    r6 r6Var = this.d;
                    if ((p10 < r6Var.f46031s0 || p10 > r6Var.f46033t0) && System.currentTimeMillis() - this.G > 500) {
                        this.G = System.currentTimeMillis();
                        this.f45463x.L(-this.d.f46029r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.B.getPositionWithOffset();
                y10 = this.B.f46340n0;
            } else {
                n10 = this.f45439e.n();
                y10 = this.f45439e.y();
            }
            r6 r6Var2 = this.d;
            float f11 = r6Var2.f46033t0;
            float f12 = r6Var2.f46031s0;
            long j10 = (f11 - f12) * ((float) r6Var2.f46027q0);
            long j11 = r6Var2.f46029r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y10 && z10) ? false : false;
            long j12 = (n10 - j11) + (f12 * f10);
            eg.z2 z2Var2 = this.f45461w;
            if (z2Var2 != null && z2Var2.f5597y0 != z10) {
                z2Var2.f5597y0 = z10;
                z2Var2.invalidate();
            }
            if (this.f45463x.y() != z11) {
                this.f45463x.P(z11);
                this.f45463x.L(j12, false);
            } else if (z4) {
                long abs = Math.abs(this.f45463x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f45463x.L(j12, false);
                }
            }
        }
    }
}
