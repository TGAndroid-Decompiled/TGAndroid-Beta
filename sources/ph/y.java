package ph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.yh;
public abstract class y extends FrameLayout implements n70 {
    public static final int f42573u0 = 0;
    public final LinearGradient B;
    public final Matrix C;
    public final org.telegram.ui.Components.ba D;
    public final w E;
    public final org.telegram.ui.Components.z5 F;
    public final org.telegram.ui.Components.z5[] G;
    public final org.telegram.ui.Components.z5 H;
    public final float[] I;
    public final float[] J;
    public Object K;
    public Object L;
    public final RectF M;
    public final Path N;
    public Drawable O;
    public boolean P;
    public Runnable Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final FrameLayout f42574a;
    public float f42575a0;
    public final nh.b f42576b;
    public boolean f42577b0;
    public final o5 f42578c;
    public boolean f42579c0;
    public CameraView d;
    public x f42580d0;
    public Object e;
    public x f42581e0;
    public r f42582f;
    public w f42583f0;
    public x f42584g0;
    public final ArrayList h;
    public boolean f42585h0;
    public Runnable f42586i0;
    public Runnable f42587j0;
    public boolean f42588k0;
    public long f42589l0;
    public boolean m0;
    public final ArrayList f42590n;
    public boolean f42591n0;
    public oa f42592o0;
    public l5 f42593p0;
    public boolean f42594q0;
    public x f42595r;
    public long f42596r0;
    public x f42597s;
    public boolean f42598s0;
    public final w f42599t0;
    public final Paint v;
    public final Path f42600w;
    public final float[] f42601x;
    public final int f42602y;

    public y(Context context, org.telegram.ui.Components.ba baVar, FrameLayout frameLayout, nh.b bVar) {
        super(context);
        this.f42578c = new o5(new w(this, 1));
        this.f42582f = new r(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f42590n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f42600w = new Path();
        this.f42601x = new float[8];
        this.E = new w(this, 2);
        nr nrVar = nr.h;
        this.F = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.G = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar)};
        this.H = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.I = new float[5];
        this.J = new float[5];
        this.M = new RectF();
        this.N = new Path();
        this.P = true;
        this.f42591n0 = true;
        this.f42594q0 = true;
        this.f42599t0 = new w(this, 3);
        this.D = baVar;
        this.f42574a = frameLayout;
        this.f42576b = bVar;
        setBackgroundColor(-14737633);
        x xVar = new x(this);
        xVar.b((q) this.f42582f.e.get(0), false);
        xVar.f42527m = true;
        if (this.f42585h0) {
            xVar.f42520c.onAttachedToWindow();
        }
        arrayList.add(xVar);
        this.f42595r = xVar;
        this.f42597s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f42602y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        this.C = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(y yVar, RectF rectF, q qVar) {
        boolean z4;
        boolean z10;
        boolean z11;
        int measuredWidth = yVar.getMeasuredWidth();
        int measuredHeight = yVar.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        yVar.k(rectF, qVar);
        float f10 = rectF.left;
        boolean z12 = false;
        if (f10 <= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = rectF.top;
        if (f11 <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = measuredWidth;
        if (rectF.right >= f12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = measuredHeight;
        if (rectF.bottom >= f13) {
            z12 = true;
        }
        if (z4 && z11 && !z10 && !z12) {
            rectF.offset(0.0f, f13 - f11);
        } else if (z10 && z12 && !z4 && !z11) {
            rectF.offset(0.0f, f12 - f10);
        } else {
            if (z11 && !z4) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z12 && !z10) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        x xVar = this.f42584g0;
        if (xVar != null) {
            q qVar = xVar.h;
            r rVar = qVar.f42194a;
            int i10 = qVar.f42195b;
            int i11 = qVar.f42196c;
            float f10 = rVar.f42232c;
            float d = this.G[i11].d(rVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        x xVar = this.f42584g0;
        if (xVar != null) {
            q qVar = xVar.h;
            r rVar = qVar.f42194a;
            int i10 = qVar.f42195b;
            int i11 = qVar.f42196c;
            float f11 = rVar.f42232c;
            float d = this.G[i11].d(rVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f11) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i11 + 1);
            RectF rectF = this.M;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f42584g0);
        }
    }

    public final boolean d() {
        if (this.f42580d0 == null) {
            return false;
        }
        this.f42580d0 = null;
        this.f42577b0 = false;
        invalidate();
        w wVar = this.f42583f0;
        if (wVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wVar);
            this.f42583f0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: ph.y.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.z5[] z5VarArr;
        RectF rectF;
        x xVar;
        w wVar;
        if (j() && !this.f42588k0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            org.telegram.ui.Components.z5 z5Var = this.F;
            float f10 = z5Var.f31241c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                z5VarArr = this.G;
                rectF = this.M;
                if (i10 < size) {
                    xVar = (x) arrayList.get(i10);
                    q qVar = xVar.h;
                    int i11 = qVar.f42196c;
                    int i12 = qVar.f42195b;
                    float f11 = z5VarArr[i11].f31241c;
                    rectF.set((getMeasuredWidth() / f11) * i12, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / f11) * (i12 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
                    if (rectF.contains(x10, y10)) {
                        break;
                    }
                    i10++;
                } else {
                    xVar = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.f42577b0 = false;
                this.W = 0.0f;
                this.U = 0.0f;
                this.f42575a0 = 0.0f;
                this.V = 0.0f;
                this.f42580d0 = xVar;
                if (xVar != null) {
                    w wVar2 = new w(this, 0);
                    this.f42583f0 = wVar2;
                    AndroidUtilities.runOnUIThread(wVar2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (k7.n6.a(motionEvent.getX(), motionEvent.getY(), this.S, this.T) > AndroidUtilities.touchSlop * 1.2f && (wVar = this.f42583f0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(wVar);
                    this.f42583f0 = null;
                }
                if (!this.f42577b0 && getFilledProgress() >= 1.0f && this.f42580d0 != null && xVar != null && k7.n6.a(motionEvent.getX(), motionEvent.getY(), this.S, this.T) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f42577b0 = true;
                    this.f42581e0 = this.f42580d0;
                    this.W = 0.0f;
                    this.U = 0.0f;
                    this.f42575a0 = 0.0f;
                    this.V = 0.0f;
                    invalidate();
                    w wVar3 = this.f42583f0;
                    if (wVar3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(wVar3);
                        this.f42583f0 = null;
                    }
                } else if (this.f42577b0 && this.f42581e0 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    float f12 = z5Var.f31241c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            q qVar2 = ((x) arrayList.get(i13)).h;
                            int i14 = qVar2.f42196c;
                            int i15 = qVar2.f42195b;
                            float f13 = z5VarArr[i14].f31241c;
                            rectF.set((getMeasuredWidth() / f13) * i15, (getMeasuredHeight() / f12) * i14, (getMeasuredWidth() / f13) * (i15 + 1), (getMeasuredHeight() / f12) * (i14 + 1));
                            if (rectF.contains(x11, y11)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    int indexOf = arrayList.indexOf(this.f42581e0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f42582f);
                        this.f42579c0 = true;
                        invalidate();
                        float f14 = this.f42582f.f42232c;
                        q qVar3 = this.f42581e0.h;
                        int i16 = qVar3.f42196c;
                        int i17 = qVar3.f42195b;
                        float f15 = z5VarArr[i16].f31241c;
                        rectF.set((getMeasuredWidth() / f15) * i17, (getMeasuredHeight() / f14) * i16, (getMeasuredWidth() / f15) * (i17 + 1), (getMeasuredHeight() / f14) * (i16 + 1));
                        this.U = this.W;
                        this.V = this.f42575a0;
                        this.S = rectF.centerX();
                        this.T = rectF.centerY();
                    }
                    this.W = motionEvent.getX() - this.S;
                    this.f42575a0 = motionEvent.getY() - this.T;
                    invalidate();
                } else if (this.f42580d0 != xVar) {
                    this.f42580d0 = null;
                    w wVar4 = this.f42583f0;
                    if (wVar4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(wVar4);
                        this.f42583f0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f42580d0 != null) {
                    this.f42580d0 = null;
                    this.f42577b0 = false;
                    invalidate();
                    w wVar5 = this.f42583f0;
                    if (wVar5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(wVar5);
                    this.f42583f0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f42580d0 != null || super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        d();
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, ph.x r11) {
        throw new UnsupportedOperationException("Method not decompiled: ph.y.g(android.graphics.Canvas, android.graphics.RectF, ph.x):void");
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.K == null && Build.VERSION.SDK_INT >= 31) {
            this.K = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.L = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), tileMode));
        }
        return this.L;
    }

    public ArrayList<u6> getContent() {
        ArrayList<u6> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u6 u6Var = ((x) obj).f42528n;
            if (u6Var != null) {
                arrayList.add(u6Var);
            }
        }
        return arrayList;
    }

    public x getCurrent() {
        return this.f42595r;
    }

    public long getDuration() {
        x mainPart;
        u6 u6Var;
        if (!this.f42588k0 || (mainPart = getMainPart()) == null || (u6Var = mainPart.f42528n) == null) {
            return 1L;
        }
        return Math.max(Math.min((u6Var.W - u6Var.V) * ((float) u6Var.f42415h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((x) arrayList.get(i10)).f42528n != null) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public r getLayout() {
        return this.f42582f;
    }

    public x getMainPart() {
        x xVar = null;
        if (!this.f42588k0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x xVar2 = (x) obj;
            u6 u6Var = xVar2.f42528n;
            if (u6Var != null && u6Var.K) {
                long j11 = u6Var.f42415h0;
                eg.t2 t2Var = xVar2.d;
                if (t2Var != null && t2Var.getDuration() > 0) {
                    j11 = xVar2.d.getDuration();
                }
                if (j11 > j10) {
                    xVar = xVar2;
                    j10 = j11;
                }
            }
        }
        return xVar;
    }

    public x getNext() {
        return this.f42597s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = yh.e(((x) arrayList2.get(i10)).f42518a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f42588k0) {
            return 0L;
        }
        if (!this.f42591n0) {
            return this.f42596r0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f42589l0;
        if (j10 > getDuration()) {
            this.f42589l0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f42588k0) {
            return 0L;
        }
        getPosition();
        x mainPart = getMainPart();
        if (mainPart != null) {
            u6 u6Var = mainPart.f42528n;
            j10 = u6Var.X + (u6Var.V * ((float) u6Var.f42415h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        o5 o5Var;
        int i10;
        TextureView textureView;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                if (view instanceof TextureView) {
                    textureView = (TextureView) view;
                } else if (view instanceof CameraView) {
                    textureView = ((CameraView) view).getTextureView();
                } else {
                    textureView = null;
                }
                if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                    canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            } else {
                view.draw(canvas);
            }
            if (f10 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(view.getAlpha() * f10, -16777216));
            }
            canvas.restore();
            if (view == this.d && (o5Var = this.f42578c) != null) {
                Paint paint = o5Var.f42052i;
                org.telegram.ui.Components.z5[] z5VarArr = o5Var.h;
                org.telegram.ui.Components.z5[] z5VarArr2 = o5Var.f42051g;
                Path path = o5Var.f42053j;
                n5 n5Var = o5Var.f42049c;
                if (n5Var != null && n5Var.f42009b.length > 0) {
                    float e = o5Var.d.e(o5Var.f42048b);
                    float d = o5Var.e.d(o5Var.f42049c.f42010c, false);
                    float width = (rectF.width() * d) + rectF.left;
                    float d10 = o5Var.f42050f.d(o5Var.f42049c.d, false);
                    float f11 = rectF.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF.height() * d10) + f11);
                    if (e > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, o5Var.f42049c.f42009b.length);
                        int i11 = 0;
                        while (i11 < min) {
                            int i12 = i11 - 1;
                            if (i12 < 0) {
                                i12 = min - 1;
                            }
                            int i13 = i11 + 1;
                            if (i13 >= min) {
                                i10 = 0;
                            } else {
                                i10 = i13;
                            }
                            n5 n5Var2 = o5Var.f42049c;
                            PointF[] pointFArr = n5Var2.f42009b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.z5[] z5VarArr3 = z5VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.z5[] z5VarArr4 = z5VarArr2;
                            float f12 = e;
                            float width2 = (rectF.width() * (z5VarArr4[i12].d(pointF.x - n5Var2.f42010c, false) + d)) + rectF.left;
                            float height = (rectF.height() * (z5VarArr3[i12].d(pointF.y - o5Var.f42049c.d, false) + d10)) + rectF.top;
                            float width3 = (rectF.width() * (z5VarArr4[i11].d(pointF2.x - o5Var.f42049c.f42010c, false) + d)) + rectF.left;
                            float height2 = (rectF.height() * (z5VarArr3[i11].d(pointF2.y - o5Var.f42049c.d, false) + d10)) + rectF.top;
                            float width4 = (rectF.width() * (z5VarArr4[i10].d(pointF3.x - o5Var.f42049c.f42010c, false) + d)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (z5VarArr3[i10].d(pointF3.y - o5Var.f42049c.d, false) + d10)) + f13) - height2) * 0.18f) + height2);
                            z5VarArr2 = z5VarArr4;
                            i11 = i13;
                            min = i14;
                            z5VarArr = z5VarArr3;
                            e = f12;
                        }
                        paint.setAlpha((int) (e * 255.0f));
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.K != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode c3 = org.telegram.messenger.b.c(this.K);
            c3.endRecording();
            canvas.drawRenderNode(c3);
            Object obj = this.L;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                c10.beginRecording().drawRenderNode(c3);
                c10.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f42582f.e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, q qVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f10 = measuredWidth;
        r rVar = qVar.f42194a;
        int[] iArr = rVar.d;
        int i11 = qVar.f42196c;
        int i12 = iArr[i11];
        int i13 = qVar.f42195b;
        float f11 = measuredHeight;
        int i14 = rVar.f42232c;
        rectF.set((f10 / i12) * i13, (f11 / i14) * i11, (f10 / i12) * (i13 + 1), (f11 / i14) * (i11 + 1));
    }

    public final boolean l(u6 u6Var) {
        if (u6Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                u6 u6Var2 = ((x) obj).f42528n;
                if (u6Var2 != null && u6Var2.K && u6Var2.P > 0.0f) {
                    u6Var.P = 0.0f;
                    break;
                }
            }
        }
        x xVar = this.f42595r;
        if (xVar != null) {
            xVar.a(u6Var);
        }
        q();
        requestLayout();
        if (this.f42595r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j10, boolean z4) {
        if (this.f42588k0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.f42591n0) {
                this.f42596r0 = clamp;
            }
            this.f42589l0 = System.currentTimeMillis() - clamp;
            this.m0 = z4;
            if (this.f42588k0) {
                w wVar = this.f42599t0;
                AndroidUtilities.cancelRunOnUIThread(wVar);
                wVar.run();
            }
        }
    }

    public final void n(u6 u6Var) {
        if (u6Var != null && u6Var.T != null) {
            o(u6Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((x) arrayList.get(i10)).a((u6) u6Var.T.get(i10));
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            e();
        }
    }

    public final void o(r rVar) {
        q qVar;
        x xVar;
        if (rVar == null) {
            rVar = new r(".");
        }
        ArrayList arrayList = rVar.e;
        this.f42582f = rVar;
        w wVar = this.E;
        AndroidUtilities.cancelRunOnUIThread(wVar);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 < Math.max(size, arrayList2.size())) {
                if (i10 < arrayList.size()) {
                    qVar = (q) arrayList.get(i10);
                } else {
                    qVar = null;
                }
                if (i10 < arrayList2.size()) {
                    xVar = (x) arrayList2.get(i10);
                } else {
                    xVar = null;
                }
                if (xVar == null && qVar != null) {
                    x xVar2 = new x(this);
                    if (this.f42585h0) {
                        xVar2.f42520c.onAttachedToWindow();
                    }
                    xVar2.b(qVar, true);
                    arrayList2.add(xVar2);
                } else if (qVar != null) {
                    xVar.b(qVar, true);
                } else if (xVar != null) {
                    this.f42590n.add(xVar);
                    arrayList2.remove(xVar);
                    xVar.b(null, true);
                    i10--;
                }
                i10++;
            } else {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(wVar, 360L);
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((x) arrayList.get(i10)).f42520c.onAttachedToWindow();
                i10++;
            } else {
                this.f42585h0 = true;
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((x) arrayList.get(i10)).f42520c.onDetachedFromWindow();
                i10++;
            } else {
                this.f42585h0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f42599t0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        x xVar;
        u6 u6Var;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i15 < arrayList.size()) {
                        if (childAt == ((x) arrayList.get(i15)).e) {
                            xVar = (x) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        xVar = null;
                        break;
                    }
                }
                if (xVar != null && (u6Var = xVar.f42528n) != null && (i12 = u6Var.f42421k0) > 0 && (i13 = u6Var.f42423l0) > 0) {
                    if (u6Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f10 = i12;
                    float f11 = i13;
                    float min = Math.min(1.0f, Math.max(f10 / size, f11 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f11 * min), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
            }
        }
    }

    public final void p() {
        boolean z4;
        CameraView cameraView = this.d;
        boolean z10 = false;
        if (cameraView != null && this.R) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.e != null) {
            z10 = true;
        }
        if (z4 == z10) {
            return;
        }
        if (z4) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z4;
        this.f42595r = null;
        this.f42597s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar.f42528n == null) {
                if (this.f42595r == null) {
                    this.f42595r = xVar;
                } else {
                    this.f42597s = xVar;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x xVar2 = (x) arrayList.get(i11);
            if (xVar2 == this.f42595r) {
                z4 = true;
            } else {
                z4 = false;
            }
            xVar2.f42527m = z4;
        }
    }

    public void setCameraNeedsBlur(boolean z4) {
        if (this.R == z4) {
            return;
        }
        this.R = z4;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.O = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z4) {
        this.P = z4;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new w(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, k7.b6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new w(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new w(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.f42586i0 = runnable;
    }

    public void setMuted(boolean z4) {
        if (this.f42598s0 == z4) {
            return;
        }
        this.f42598s0 = z4;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.Q = runnable;
    }

    public void setPlaying(boolean z4) {
        boolean z10 = this.f42594q0;
        this.f42594q0 = true;
        if (this.f42591n0 != z4) {
            this.f42591n0 = z4;
            if (!z4) {
                this.f42596r0 = getPosition();
            } else if (z10) {
                m(this.f42596r0, false);
            } else {
                this.m0 = false;
            }
            if (this.f42588k0) {
                w wVar = this.f42599t0;
                AndroidUtilities.cancelRunOnUIThread(wVar);
                wVar.run();
            }
        }
    }

    public void setPreview(boolean z4) {
        if (this.f42588k0 != z4) {
            this.f42588k0 = z4;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z4) {
                org.telegram.ui.Components.ba baVar = this.D;
                if (baVar != null) {
                    baVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((x) arrayList.get(i11)).f42518a = i11;
                }
            }
            this.m0 = false;
            this.f42596r0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x xVar = (x) obj;
                eg.t2 t2Var = xVar.d;
                if (t2Var != null) {
                    t2Var.setAudioEnabled(z4, true);
                    if (z4 && !this.f42591n0) {
                        xVar.d.pause();
                    } else {
                        xVar.d.play();
                    }
                }
            }
            w wVar = this.f42599t0;
            AndroidUtilities.cancelRunOnUIThread(wVar);
            if (z4) {
                this.f42589l0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(wVar, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(l5 l5Var) {
        this.f42593p0 = l5Var;
    }

    public void setResetState(Runnable runnable) {
        this.f42587j0 = runnable;
    }

    public void setTimelineView(oa oaVar) {
        this.f42592o0 = oaVar;
    }
}
