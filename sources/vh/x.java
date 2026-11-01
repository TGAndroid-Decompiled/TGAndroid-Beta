package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.y60;
public abstract class x extends FrameLayout implements y60 {
    public static final int f52138x0 = 0;
    public final int D;
    public final LinearGradient E;
    public final Matrix F;
    public final s9 G;
    public final v H;
    public final org.telegram.ui.Components.t5 I;
    public final org.telegram.ui.Components.t5[] J;
    public final org.telegram.ui.Components.t5 K;
    public final float[] L;
    public final float[] M;
    public Object N;
    public Object O;
    public final RectF P;
    public final Path Q;
    public Drawable R;
    public boolean S;
    public Runnable T;
    public boolean U;
    public float V;
    public float W;
    public final FrameLayout f52139a;
    public float f52140a0;
    public final th.b f52141b;
    public float f52142b0;
    public final n4 f52143c;
    public float f52144c0;
    public CameraView d;
    public float f52145d0;
    public Object e;
    public boolean f52146e0;
    public r f52147f;
    public boolean f52148f0;
    public w f52149g0;
    public final ArrayList h;
    public w f52150h0;
    public v f52151i0;
    public w f52152j0;
    public boolean f52153k0;
    public Runnable f52154l0;
    public Runnable m0;
    public final ArrayList f52155n;
    public boolean f52156n0;
    public long f52157o0;
    public boolean f52158p0;
    public boolean f52159q0;
    public w f52160r;
    public z8 f52161r0;
    public w f52162s;
    public k4 f52163s0;
    public boolean f52164t0;
    public long f52165u0;
    public boolean f52166v0;
    public final Paint f52167w;
    public final v f52168w0;
    public final Path f52169x;
    public final float[] f52170y;

    public x(Context context, s9 s9Var, FrameLayout frameLayout, th.b bVar) {
        super(context);
        this.f52143c = new n4(new v(this, 1));
        this.f52147f = new r(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f52155n = new ArrayList();
        Paint paint = new Paint(1);
        this.f52167w = paint;
        this.f52169x = new Path();
        this.f52170y = new float[8];
        this.H = new v(this, 2);
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.J = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar)};
        this.K = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f52159q0 = true;
        this.f52164t0 = true;
        this.f52168w0 = new v(this, 3);
        this.G = s9Var;
        this.f52139a = frameLayout;
        this.f52141b = bVar;
        setBackgroundColor(-14737633);
        w wVar = new w(this);
        wVar.b((q) this.f52147f.e.get(0), false);
        wVar.f52096m = true;
        if (this.f52153k0) {
            wVar.f52089c.P();
        }
        arrayList.add(wVar);
        this.f52160r = wVar;
        this.f52162s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(8.0f));
        int L = org.telegram.messenger.i0.L(300.0f);
        this.D = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(x xVar, RectF rectF, q qVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = xVar.getMeasuredWidth();
        int measuredHeight = xVar.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.i0.f16172q;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        xVar.k(rectF, qVar);
        float f7 = rectF.left;
        boolean z13 = false;
        if (f7 <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = rectF.top;
        if (f10 <= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f11 = measuredWidth;
        if (rectF.right >= f11) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f12 = measuredHeight;
        if (rectF.bottom >= f12) {
            z13 = true;
        }
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f12 - f10);
        } else if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f11 - f7);
        } else {
            if (z12 && !z10) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z13 && !z11) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f7) {
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
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        w wVar = this.f52152j0;
        if (wVar != null) {
            q qVar = wVar.h;
            r rVar = qVar.f51790a;
            int i10 = qVar.f51791b;
            int i11 = qVar.f51792c;
            float f7 = rVar.f51813c;
            float e = this.J[i11].e(false, rVar.d[i11]);
            rectF.set((getMeasuredWidth() / e) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / e) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        w wVar = this.f52152j0;
        if (wVar != null) {
            q qVar = wVar.h;
            r rVar = qVar.f51790a;
            int i10 = qVar.f51791b;
            int i11 = qVar.f51792c;
            float f10 = rVar.f51813c;
            float e = this.J[i11].e(false, rVar.d[i11]);
            float measuredWidth = (getMeasuredWidth() / e) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / e) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f52152j0);
        }
    }

    public final boolean d() {
        if (this.f52149g0 == null) {
            return false;
        }
        this.f52149g0 = null;
        this.f52146e0 = false;
        invalidate();
        v vVar = this.f52151i0;
        if (vVar != null) {
            org.telegram.messenger.i0.r(vVar);
            this.f52151i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        double d;
        float[] fArr;
        float[] fArr2;
        float f7;
        ArrayList arrayList;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        s9 s9Var;
        float f13;
        float f14;
        float f15;
        float f16;
        w wVar;
        float f17;
        int i10;
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode b10 = m4.v0.b(this.N);
            b10.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = b10.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        boolean j10 = j();
        org.telegram.ui.Components.t5 t5Var = this.I;
        org.telegram.ui.Components.t5[] t5VarArr = this.J;
        float f18 = 0.0f;
        if (!j10 && !this.f52148f0 && !this.f52146e0) {
            float f19 = t5Var.f30530c;
            r rVar = this.f52147f;
            if (f19 == rVar.f51813c && t5VarArr[0].f30530c == rVar.d[0]) {
                n4 n4Var = this.f52143c;
                if (!n4Var.f51523b && n4Var.d.f30530c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f52156n0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d10 = this.K.d(this.f52146e0);
        float e = t5Var.e(false, this.f52147f.f51813c);
        int i11 = 0;
        while (true) {
            d = e;
            int i12 = (i11 > Math.ceil(d) ? 1 : (i11 == Math.ceil(d) ? 0 : -1));
            fArr = this.M;
            fArr2 = this.L;
            if (i12 >= 0) {
                break;
            }
            fArr2[i11] = getMeasuredWidth();
            fArr[i11] = 0.0f;
            i11++;
        }
        int i13 = this.f52147f.f51813c;
        while (true) {
            f7 = 1.0f;
            if (i13 >= t5VarArr.length) {
                break;
            }
            t5VarArr[i13].e(false, 1.0f);
            i13++;
        }
        int i14 = 0;
        boolean z10 = false;
        float f20 = 0.0f;
        while (true) {
            arrayList = this.h;
            f10 = f7;
            int size = arrayList.size();
            f11 = f18;
            rectF = this.P;
            if (i14 >= size) {
                break;
            }
            w wVar2 = (w) arrayList.get(i14);
            q qVar = wVar2.h;
            int i15 = qVar.f51792c;
            float f21 = d10;
            int i16 = qVar.f51791b;
            float f22 = e;
            org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
            float e7 = t5VarArr[i15].e(false, qVar.f51790a.d[i15]);
            if (this.f52148f0 || this.f52146e0) {
                i10 = i15;
                org.telegram.messenger.i0.Z1(wVar2.f52093j, wVar2.f52094k, wVar2.f52095l, rectF);
            } else {
                i10 = i15;
                rectF.set((getMeasuredWidth() / e7) * i16, (getMeasuredHeight() / f22) * i15, (getMeasuredWidth() / e7) * (i16 + 1), (getMeasuredHeight() / f22) * (i10 + 1));
            }
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            f20 = Math.max(f20, rectF.bottom);
            if (f21 <= f11 || wVar2 != this.f52150h0) {
                if (this.f52156n0 && wVar2.d != null) {
                    z10 = true;
                }
                g(recordingCanvas, rectF, wVar2);
            }
            i14++;
            f7 = f10;
            f18 = f11;
            d10 = f21;
            e = f22;
            t5VarArr = t5VarArr2;
        }
        float f23 = d10;
        float f24 = e;
        org.telegram.ui.Components.t5[] t5VarArr3 = t5VarArr;
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52155n;
            if (i17 >= arrayList2.size()) {
                break;
            }
            w wVar3 = (w) arrayList2.get(i17);
            q qVar2 = wVar3.h;
            int i18 = qVar2.f51792c;
            int i19 = qVar2.f51791b;
            org.telegram.ui.Components.t5 t5Var2 = t5VarArr3[i18];
            int[] iArr = this.f52147f.d;
            int i20 = i17;
            if (i18 >= iArr.length) {
                f17 = f10;
            } else {
                f17 = iArr[i18];
            }
            float e10 = t5Var2.e(false, f17);
            rectF.set((getMeasuredWidth() / e10) * i19, (getMeasuredHeight() / f24) * i18, (getMeasuredWidth() / e10) * (i19 + 1), (i18 + 1) * (getMeasuredHeight() / f24));
            fArr2[i18] = Math.min(fArr2[i18], rectF.left);
            fArr[i18] = Math.max(fArr[i18], rectF.right);
            f20 = Math.max(f20, rectF.bottom);
            if (this.f52156n0 && wVar3.d != null) {
                z10 = true;
            }
            g(recordingCanvas, rectF, wVar3);
            i17 = i20 + 1;
        }
        if (!this.f52146e0) {
            int i21 = 0;
            while (i21 < Math.ceil(d)) {
                if (fArr2[i21] >= f11) {
                    rectF.set(f11, (getMeasuredHeight() / f24) * i21, fArr2[i21], (getMeasuredHeight() / f24) * (i21 + 1));
                    g(recordingCanvas, rectF, null);
                }
                if (fArr[i21] < getMeasuredWidth()) {
                    rectF.set(fArr[i21], (getMeasuredHeight() / f24) * i21, getMeasuredWidth(), (getMeasuredHeight() / f24) * (i21 + 1));
                    g(recordingCanvas, rectF, null);
                }
                i21++;
                f11 = 0.0f;
            }
            if (f20 < getMeasuredHeight()) {
                f12 = 0.0f;
                rectF.set(0.0f, f20, getMeasuredWidth(), getMeasuredHeight());
                g(recordingCanvas, rectF, null);
            } else {
                f12 = 0.0f;
            }
        } else {
            f12 = f11;
        }
        if (f23 > f12 && (wVar = this.f52150h0) != null) {
            q qVar3 = wVar.h;
            int i22 = qVar3.f51792c;
            int i23 = qVar3.f51791b;
            float e11 = t5VarArr3[i22].e(false, this.f52147f.d[i22]);
            if (this.f52146e0) {
                org.telegram.messenger.i0.Z1(wVar.f52093j, wVar.f52094k, wVar.f52095l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e11) * i23, (getMeasuredHeight() / f24) * i22, (getMeasuredWidth() / e11) * (i23 + 1), (getMeasuredHeight() / f24) * (i22 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.i0.T1(this.f52140a0, this.f52144c0, wVar.f52095l) * f23, org.telegram.messenger.i0.T1(this.f52142b0, this.f52145d0, wVar.f52095l) * f23);
            g(recordingCanvas, rectF, wVar);
            recordingCanvas.restore();
        }
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            w wVar4 = (w) arrayList.get(i24);
            q qVar4 = wVar4.h;
            float e12 = wVar4.f52088b.e(false, 0.0f);
            if (e12 > 0.0f) {
                int i25 = qVar4.f51792c;
                int i26 = qVar4.f51792c;
                int i27 = qVar4.f51791b;
                float e13 = t5VarArr3[i25].e(false, qVar4.f51790a.d[i25]);
                if (!this.f52148f0 && !this.f52146e0) {
                    rectF.set((getMeasuredWidth() / e13) * i27, (getMeasuredHeight() / f24) * i26, (getMeasuredWidth() / e13) * (i27 + 1), (getMeasuredHeight() / f24) * (i26 + 1));
                } else {
                    org.telegram.messenger.i0.Z1(wVar4.f52093j, wVar4.f52094k, wVar4.f52095l, rectF);
                }
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                Matrix matrix = this.F;
                matrix.reset();
                float f25 = rectF.left;
                int i28 = this.D;
                int i29 = i28 * i28;
                matrix.postTranslate(org.telegram.messenger.i0.T1(((float) Math.sqrt(i29 + i29)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f10 - e12) + f25, 0.0f);
                matrix.postRotate(-25.0f);
                this.E.setLocalMatrix(matrix);
                Paint paint = this.f52167w;
                paint.setAlpha(255);
                Path path = this.f52169x;
                path.rewind();
                q qVar5 = wVar4.h;
                if (qVar5.f51791b == 0 && qVar5.f51792c == 0) {
                    f13 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    f13 = 0.0f;
                }
                float[] fArr3 = this.f52170y;
                fArr3[1] = f13;
                fArr3[0] = f13;
                q qVar6 = wVar4.h;
                if (qVar6.f51791b == qVar6.f51790a.f51812b - 1 && qVar6.f51792c == 0) {
                    f14 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                fArr3[2] = f14;
                fArr3[1] = f14;
                q qVar7 = wVar4.h;
                int i30 = qVar7.f51791b;
                r rVar2 = qVar7.f51790a;
                if (i30 == rVar2.f51812b - 1 && qVar7.f51792c == rVar2.f51813c - 1) {
                    f15 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[4] = f15;
                fArr3[3] = f15;
                q qVar8 = wVar4.h;
                if (qVar8.f51791b == 0 && qVar8.f51792c == qVar8.f51790a.f51813c - 1) {
                    f16 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[6] = f16;
                fArr3[5] = f16;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                recordingCanvas.drawPath(path, paint);
            }
        }
        if (z10 && (s9Var = this.G) != null) {
            s9Var.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: vh.x.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && org.telegram.messenger.i0.m0) {
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
            ((w) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, vh.w r11) {
        throw new UnsupportedOperationException("Method not decompiled: vh.x.g(android.graphics.Canvas, android.graphics.RectF, vh.w):void");
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.N == null && Build.VERSION.SDK_INT >= 31) {
            this.N = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.O = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), tileMode));
        }
        return this.O;
    }

    public ArrayList<n5> getContent() {
        ArrayList<n5> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            n5 n5Var = ((w) obj).f52097n;
            if (n5Var != null) {
                arrayList.add(n5Var);
            }
        }
        return arrayList;
    }

    public w getCurrent() {
        return this.f52160r;
    }

    public long getDuration() {
        w mainPart;
        n5 n5Var;
        if (!this.f52156n0 || (mainPart = getMainPart()) == null || (n5Var = mainPart.f52097n) == null) {
            return 1L;
        }
        return Math.max(Math.min((n5Var.W - n5Var.V) * ((float) n5Var.f51546h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((w) arrayList.get(i10)).f52097n != null) {
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
        return this.f52147f;
    }

    public w getMainPart() {
        w wVar = null;
        if (!this.f52156n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar2 = (w) obj;
            n5 n5Var = wVar2.f52097n;
            if (n5Var != null && n5Var.K) {
                long j11 = n5Var.f51546h0;
                kg.j2 j2Var = wVar2.d;
                if (j2Var != null && j2Var.getDuration() > 0) {
                    j11 = wVar2.d.getDuration();
                }
                if (j11 > j10) {
                    wVar = wVar2;
                    j10 = j11;
                }
            }
        }
        return wVar;
    }

    public w getNext() {
        return this.f52162s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = c3.i0.j(((w) arrayList2.get(i10)).f52087a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f52156n0) {
            return 0L;
        }
        if (!this.f52159q0) {
            return this.f52165u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f52157o0;
        if (j10 > getDuration()) {
            this.f52157o0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f52156n0) {
            return 0L;
        }
        getPosition();
        w mainPart = getMainPart();
        if (mainPart != null) {
            n5 n5Var = mainPart.f52097n;
            j10 = n5Var.X + (n5Var.V * ((float) n5Var.f51546h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        n4 n4Var;
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
            if (org.telegram.messenger.i0.m0) {
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
            if (f7 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(view.getAlpha() * f7, -16777216));
            }
            canvas.restore();
            if (view == this.d && (n4Var = this.f52143c) != null) {
                Paint paint = n4Var.f51527i;
                org.telegram.ui.Components.t5[] t5VarArr = n4Var.h;
                org.telegram.ui.Components.t5[] t5VarArr2 = n4Var.f51526g;
                Path path = n4Var.f51528j;
                m4 m4Var = n4Var.f51524c;
                if (m4Var != null && m4Var.f51495b.length > 0) {
                    float d = n4Var.d.d(n4Var.f51523b);
                    int i11 = 0;
                    float e = n4Var.e.e(false, n4Var.f51524c.f51496c);
                    float width = (rectF.width() * e) + rectF.left;
                    float e7 = n4Var.f51525f.e(false, n4Var.f51524c.d);
                    float f10 = rectF.top;
                    float T1 = org.telegram.messenger.i0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e7) + f10);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, n4Var.f51524c.f51495b.length);
                        int i12 = 0;
                        while (i12 < min) {
                            int i13 = i12 - 1;
                            if (i13 < 0) {
                                i13 = min - 1;
                            }
                            int i14 = i12 + 1;
                            if (i14 >= min) {
                                i10 = i11;
                            } else {
                                i10 = i14;
                            }
                            m4 m4Var2 = n4Var.f51524c;
                            PointF[] pointFArr = m4Var2.f51495b;
                            PointF pointF = pointFArr[i13];
                            int i15 = min;
                            PointF pointF2 = pointFArr[i12];
                            org.telegram.ui.Components.t5[] t5VarArr3 = t5VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.t5[] t5VarArr4 = t5VarArr2;
                            float f11 = d;
                            float width2 = (rectF.width() * (t5VarArr4[i13].e(false, pointF.x - m4Var2.f51496c) + e)) + rectF.left;
                            float height = (rectF.height() * (t5VarArr3[i13].e(false, pointF.y - n4Var.f51524c.d) + e7)) + rectF.top;
                            float width3 = (rectF.width() * (t5VarArr4[i12].e(false, pointF2.x - n4Var.f51524c.f51496c) + e)) + rectF.left;
                            float height2 = (rectF.height() * (t5VarArr3[i12].e(false, pointF2.y - n4Var.f51524c.d) + e7)) + rectF.top;
                            float width4 = (rectF.width() * (t5VarArr4[i10].e(false, pointF3.x - n4Var.f51524c.f51496c) + e)) + rectF.left;
                            float f12 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (t5VarArr3[i10].e(false, pointF3.y - n4Var.f51524c.d) + e7)) + f12) - height2) * 0.18f) + height2);
                            t5VarArr2 = t5VarArr4;
                            i11 = 0;
                            i12 = i14;
                            min = i15;
                            t5VarArr = t5VarArr3;
                            d = f11;
                        }
                        paint.setAlpha((int) (d * 255.0f));
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode b10 = m4.v0.b(this.N);
            b10.endRecording();
            canvas.drawRenderNode(b10);
            Object obj = this.O;
            if (obj != null) {
                RenderNode b11 = m4.v0.b(obj);
                b11.setPosition(0, 0, getWidth(), getHeight());
                b11.beginRecording().drawRenderNode(b10);
                b11.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f52147f.e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, q qVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.i0.f16172q;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        r rVar = qVar.f51790a;
        int[] iArr = rVar.d;
        int i11 = qVar.f51792c;
        int i12 = iArr[i11];
        int i13 = qVar.f51791b;
        float f10 = measuredHeight;
        int i14 = rVar.f51813c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(n5 n5Var) {
        if (n5Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                n5 n5Var2 = ((w) obj).f52097n;
                if (n5Var2 != null && n5Var2.K && n5Var2.P > 0.0f) {
                    n5Var.P = 0.0f;
                    break;
                }
            }
        }
        w wVar = this.f52160r;
        if (wVar != null) {
            wVar.a(n5Var);
        }
        q();
        requestLayout();
        if (this.f52160r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j10, boolean z10) {
        if (this.f52156n0) {
            long k10 = Utilities.k(j10, getDuration(), 0L);
            if (!this.f52159q0) {
                this.f52165u0 = k10;
            }
            this.f52157o0 = System.currentTimeMillis() - k10;
            this.f52158p0 = z10;
            if (this.f52156n0) {
                v vVar = this.f52168w0;
                org.telegram.messenger.i0.r(vVar);
                vVar.run();
            }
        }
    }

    public final void n(n5 n5Var) {
        if (n5Var != null && n5Var.T != null) {
            o(n5Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((w) arrayList.get(i10)).a((n5) n5Var.T.get(i10));
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
        w wVar;
        if (rVar == null) {
            rVar = new r(".");
        }
        ArrayList arrayList = rVar.e;
        this.f52147f = rVar;
        v vVar = this.H;
        org.telegram.messenger.i0.r(vVar);
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
                    wVar = (w) arrayList2.get(i10);
                } else {
                    wVar = null;
                }
                if (wVar == null && qVar != null) {
                    w wVar2 = new w(this);
                    if (this.f52153k0) {
                        wVar2.f52089c.P();
                    }
                    wVar2.b(qVar, true);
                    arrayList2.add(wVar2);
                } else if (qVar != null) {
                    wVar.b(qVar, true);
                } else if (wVar != null) {
                    this.f52155n.add(wVar);
                    arrayList2.remove(wVar);
                    wVar.b(null, true);
                    i10--;
                }
                i10++;
            } else {
                q();
                invalidate();
                org.telegram.messenger.i0.h3(vVar, 360L);
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
                ((w) arrayList.get(i10)).f52089c.P();
                i10++;
            } else {
                this.f52153k0 = true;
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
                ((w) arrayList.get(i10)).f52089c.R();
                i10++;
            } else {
                this.f52153k0 = false;
                org.telegram.messenger.i0.r(this.f52168w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w wVar;
        n5 n5Var;
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
                        if (childAt == ((w) arrayList.get(i15)).e) {
                            wVar = (w) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        wVar = null;
                        break;
                    }
                }
                if (wVar != null && (n5Var = wVar.f52097n) != null && (i12 = n5Var.f51552k0) > 0 && (i13 = n5Var.f51554l0) > 0) {
                    if (n5Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f7 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f7 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
            }
        }
    }

    public final void p() {
        boolean z10;
        CameraView cameraView = this.d;
        boolean z11 = false;
        if (cameraView != null && this.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f52160r = null;
        this.f52162s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            w wVar = (w) arrayList.get(i10);
            if (wVar.f52097n == null) {
                if (this.f52160r == null) {
                    this.f52160r = wVar;
                } else {
                    this.f52162s = wVar;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w wVar2 = (w) arrayList.get(i11);
            if (wVar2 == this.f52160r) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar2.f52096m = z10;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.R = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new v(this, 1));
            org.telegram.messenger.i0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, w7.b6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new v(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new v(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.f52154l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f52166v0 == z10) {
            return;
        }
        this.f52166v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f52164t0;
        this.f52164t0 = true;
        if (this.f52159q0 != z10) {
            this.f52159q0 = z10;
            if (!z10) {
                this.f52165u0 = getPosition();
            } else if (z11) {
                m(this.f52165u0, false);
            } else {
                this.f52158p0 = false;
            }
            if (this.f52156n0) {
                v vVar = this.f52168w0;
                org.telegram.messenger.i0.r(vVar);
                vVar.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f52156n0 != z10) {
            this.f52156n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                s9 s9Var = this.G;
                if (s9Var != null) {
                    s9Var.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((w) arrayList.get(i11)).f52087a = i11;
                }
            }
            this.f52158p0 = false;
            this.f52165u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                w wVar = (w) obj;
                kg.j2 j2Var = wVar.d;
                if (j2Var != null) {
                    j2Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f52159q0) {
                        wVar.d.pause();
                    } else {
                        wVar.d.play();
                    }
                }
            }
            v vVar = this.f52168w0;
            org.telegram.messenger.i0.r(vVar);
            if (z10) {
                this.f52157o0 = System.currentTimeMillis();
                org.telegram.messenger.i0.h3(vVar, 1000.0f / org.telegram.messenger.i0.f16173r);
            }
        }
    }

    public void setPreviewView(k4 k4Var) {
        this.f52163s0 = k4Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(z8 z8Var) {
        this.f52161r0 = z8Var;
    }
}
