package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.yj0;

public abstract class j extends FrameLayout {

    public static final List f50446l0 = Arrays.asList(-90, 0, 90, 180);
    public boolean A;
    public h B;
    public PointF C;
    public i D;
    public final e E;
    public final UUID F;
    public boolean G;
    public int H;
    public int I;
    public we.a J;
    public float K;
    public ValueAnimator L;
    public ValueAnimator M;
    public int N;
    public int O;
    public final e P;
    public final e Q;
    public int R;
    public int S;
    public ValueAnimator T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;

    public final nc f50447a;

    public final float[] f50448a0;

    public float f50449b;

    public final float[] f50450b0;

    public float f50451c;

    public final float[] f50452c0;
    public float d;

    public float f50453d0;

    public float f50454e;

    public float f50455e0;

    public float f50456f;

    public float f50457f0;

    public ValueAnimator f50458g0;
    public float h;

    public boolean f50459h0;

    public ViewGroup f50460i0;

    public float f50461j0;

    public ValueAnimator f50462k0;

    public boolean f50463n;

    public boolean f50464r;

    public boolean f50465s;
    public boolean v;

    public boolean f50466w;

    public boolean f50467x;

    public boolean f50468y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f50447a = new nc(this);
        this.f50463n = false;
        this.f50464r = false;
        this.f50465s = false;
        this.v = false;
        this.f50466w = false;
        this.f50467x = false;
        this.f50468y = false;
        this.A = false;
        final int i10 = 0;
        this.E = new Runnable(this) {

            public final j f50386b;

            {
                this.f50386b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.f50386b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            jVar.B.c(jVar);
                        }
                        break;
                    case 1:
                        this.f50386b.n();
                        break;
                    default:
                        this.f50386b.o();
                        break;
                }
            }
        };
        this.G = true;
        this.H = 0;
        this.I = -1;
        this.N = 0;
        this.O = 0;
        final int i11 = 1;
        this.P = new Runnable(this) {

            public final j f50386b;

            {
                this.f50386b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.f50386b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            jVar.B.c(jVar);
                        }
                        break;
                    case 1:
                        this.f50386b.n();
                        break;
                    default:
                        this.f50386b.o();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.Q = new Runnable(this) {

            public final j f50386b;

            {
                this.f50386b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        j jVar = this.f50386b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            jVar.B.c(jVar);
                        }
                        break;
                    case 1:
                        this.f50386b.n();
                        break;
                    default:
                        this.f50386b.o();
                        break;
                }
            }
        };
        this.f50448a0 = new float[2];
        this.f50450b0 = new float[2];
        this.f50452c0 = new float[2];
        this.f50453d0 = 1.0f;
        this.f50459h0 = false;
        this.f50461j0 = 1.0f;
        this.F = UUID.randomUUID();
        this.C = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredWidth())) + (Math.abs(Math.cos(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredHeight())));
    }

    public final boolean c(float f10, float f11, boolean z10, float f12, float f13) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f14 = z10 ? (f10 + f12) / 2.0f : f10;
            float f15 = z10 ? (f11 + f13) / 2.0f : f11;
            float f16 = (f14 - this.f50456f) / scaleX;
            float f17 = (f15 - this.h) / scaleX;
            if (((float) Math.hypot(f16, f17)) > (this.f50463n ? 6.0f : 16.0f) || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.E);
                e(f16, f17);
                if (z10) {
                    float fA = h7.y.a(f10, f11, f12, f13);
                    float fA2 = h7.y.a(this.f50449b, this.f50451c, this.d, this.f50454e);
                    if (fA2 > 0.0f) {
                        j(fA / fA2);
                    }
                    f(this.f50455e0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f50451c - this.f50454e, this.f50449b - this.d))));
                }
                this.f50449b = f10;
                this.f50451c = f11;
                this.f50456f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.f50454e = f13;
                }
                int i10 = 1;
                this.f50463n = true;
                if ((getParent() instanceof d) && (this.N != 0 || this.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.B) != null) {
                    this.v = true;
                    hVar4.C();
                }
                if (!this.f50466w && z10 && (hVar3 = this.B) != null) {
                    this.f50466w = true;
                    hVar3.m();
                }
                if (this.f50466w && !z10 && (hVar2 = this.B) != null) {
                    this.f50466w = false;
                    hVar2.k();
                }
                if (!this.f50459h0 && !this.f50467x && (hVar = this.B) != null) {
                    hVar.j(this);
                    this.f50467x = true;
                }
                h hVar5 = this.B;
                if (hVar5 != null) {
                    hVar5.B(rl.c((float) getHeight(), 2.0f, scaleX, this.C.y) < ((float) AndroidUtilities.dp(66.0f)));
                    this.B.g(s3.c.c((float) getHeight(), 2.0f, scaleX, this.C.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
                }
                h hVar6 = this.B;
                boolean z11 = (hVar6 == null || hVar6.r()) && !z10 && h7.y.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
                if (this.f50468y != z11) {
                    ValueAnimator valueAnimator = this.f50462k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f50462k0 = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50461j0, z11 ? 0.5f : 1.0f);
                    this.f50462k0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new f(this, i10));
                    this.f50462k0.setInterpolator(er.h);
                    this.f50462k0.setDuration(280L);
                    this.f50462k0.start();
                    this.f50468y = z11;
                    h hVar7 = this.B;
                    if (hVar7 != null) {
                        hVar7.o(z11);
                    }
                }
                this.f50447a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        h hVar;
        h hVar2;
        if (this.v) {
            this.B.h(this.f50468y);
            this.v = false;
        }
        this.f50466w = false;
        if (!z10 && !this.A && !this.f50463n && !this.f50465s && !this.f50467x && (hVar2 = this.B) != null) {
            hVar2.j(this);
        }
        if (this.f50463n && (hVar = this.B) != null) {
            hVar.B(false);
            this.B.g(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.A = false;
        this.f50463n = false;
        this.f50465s = false;
        this.f50464r = true;
        this.f50467x = false;
        this.I = this.H;
        we.a aVar = this.J;
        if (aVar != null) {
            AndroidUtilities.cancelRunOnUIThread(aVar);
            this.J = null;
        }
        this.R = this.N;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float fA = this.f50447a.a(getBounceScale());
        canvas.save();
        canvas.scale(fA, fA, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof c2) {
                float f10 = this.f50461j0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f11 = this.f50461j0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float f10, float f11) {
        int i10;
        PointF pointF = this.C;
        pointF.x += f10;
        pointF.y += f11;
        View view = (View) getParent();
        if (view != null) {
            int i11 = 3;
            if (this.V) {
                i10 = 0;
            } else if (Math.abs(this.C.x - (view.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.C.y >= view.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                if (Math.abs((this.C.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                    i10 = 1;
                } else {
                    if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.C.x) - (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                }
            } else {
                i10 = 2;
            }
            if (this.R != i10) {
                this.R = i10;
                if (i10 == 0) {
                    n();
                } else {
                    AndroidUtilities.runOnUIThread(this.P, 250L);
                }
            }
            if (this.V) {
                i11 = 0;
            } else if (Math.abs(this.C.y - (view.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                i11 = 2;
            } else {
                if (Math.abs((this.C.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                    i11 = 1;
                } else {
                    if (Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + this.C.y) - (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f))) > AndroidUtilities.dp(12.0f)) {
                        i11 = 0;
                    }
                }
            }
            if (this.S != i11) {
                this.S = i11;
                if (i11 == 0) {
                    o();
                } else {
                    AndroidUtilities.runOnUIThread(this.Q, 250L);
                }
            }
        }
        k();
    }

    public final void f(float f10) {
        int i10 = 0;
        if (this.N != 0) {
            this.R = 0;
            n();
        }
        if (this.O != 0) {
            this.S = 0;
            o();
        }
        this.f50455e0 = f10;
        boolean z10 = this.G;
        int i11 = 2;
        if (!z10 && !this.V) {
            Iterator it = f50446l0.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (Math.abs(iIntValue - f10) < 4.0f) {
                    if (this.I == iIntValue) {
                        break;
                    }
                    this.I = iIntValue;
                    we.a aVar = this.J;
                    if (aVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(aVar);
                    }
                    we.a aVar2 = new we.a(this, iIntValue, i11);
                    this.J = aVar2;
                    AndroidUtilities.runOnUIThread(aVar2, 250L);
                    break;
                }
            }
        } else if (z10) {
            if (Math.abs(this.H - f10) >= 12.0f || this.V) {
                this.I = -1;
                we.a aVar3 = this.J;
                if (aVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar3);
                    this.J = null;
                }
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.M = duration;
                duration.setInterpolator(er.f28122f);
                this.M.addUpdateListener(new f(this, i10));
                this.M.addListener(new g(this, 3));
                this.M.start();
                this.G = false;
            } else {
                f10 = this.L != null ? this.K : this.H;
            }
        }
        ValueAnimator valueAnimator3 = this.M;
        if (valueAnimator3 != null) {
            f10 = AndroidUtilities.lerpAngle(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.N != 0 || this.O != 0) {
            k();
        }
        m();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.C;
    }

    public float getPositionX() {
        float measuredWidth;
        float f10 = this.C.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.N;
            if (i10 == 1) {
                measuredWidth = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                measuredWidth = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                measuredWidth = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                measuredWidth = f10;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, measuredWidth, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (measuredWidth != 0.0f) {
                return measuredWidth;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float measuredHeight;
        float f10 = this.C.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.O;
            if (i10 == 1) {
                measuredHeight = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                measuredHeight = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                measuredHeight = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                measuredHeight = f10;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, measuredHeight, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (measuredHeight != 0.0f) {
                return measuredHeight;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public yj0 getSelectionBounds() {
        return new yj0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.N;
    }

    public final int getStickyY() {
        return this.O;
    }

    public UUID getUUID() {
        return this.F;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.T = duration;
        duration.setInterpolator(er.f28122f);
        this.T.addUpdateListener(new f(this, 3));
        this.T.addListener(new g(this, 0));
        this.T.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(er.f28122f);
        this.U.addUpdateListener(new f(this, 4));
        this.U.addListener(new g(this, 1));
        this.U.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f50459h0;
    }

    public final void j(float f10) {
        float f11 = this.f50453d0;
        float f12 = f10 * f11;
        this.f50453d0 = f12;
        float fClamp = Utilities.clamp(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof b2)) {
            if ((fClamp >= getMaxScale() || fClamp <= getMinScale()) != (f11 >= getMaxScale() || f11 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(fClamp);
        setScaleY(fClamp);
    }

    public void k() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        setX(getPositionX() - measuredWidth);
        setY(getPositionY() - measuredHeight);
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.f50459h0 != z10) {
            this.f50459h0 = z10;
            ValueAnimator valueAnimator = this.f50458g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f50458g0 = null;
            }
            if (this.D == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                i iVarA = a();
                this.D = iVarA;
                iVarA.f50432f = !this.V;
                iVarA.invalidate();
                viewGroup.addView(this.D);
                this.f50457f0 = 0.0f;
            }
            this.D.b();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50457f0, z10 ? 1.0f : 0.0f);
            this.f50458g0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new f(this, 2));
            this.f50458g0.addListener(new g(this, 4));
            this.f50458g0.setDuration(280L);
            this.f50458g0.setInterpolator(er.h);
            this.f50458g0.start();
        }
    }

    public final void m() {
        i iVar = this.D;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        int i10 = this.N;
        int i11 = this.R;
        if (i10 == i11) {
            return;
        }
        this.N = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.R == 0) {
            h(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            h(0.0f, 1.0f);
        }
    }

    public final void o() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        int i10 = this.O;
        int i11 = this.S;
        if (i10 == i11) {
            return;
        }
        this.O = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.S == 0) {
            i(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            i(0.0f, 1.0f);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.B.s();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        j jVar;
        boolean zC;
        if (this.B.s()) {
            h hVar = this.B;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.f50448a0;
            hVar.v(rawX, rawY, fArr);
            boolean z11 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.f50450b0;
            if (!z11) {
                z10 = z11;
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.B.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
                z10 = z11;
            } else {
                z10 = false;
            }
            float[] fArr3 = this.f50452c0;
            if (z10) {
                fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
            } else {
                fArr3[0] = fArr[0];
                fArr3[1] = fArr[1];
            }
            if (this.V != z10) {
                this.f50449b = fArr[0];
                this.f50451c = fArr[1];
                this.d = fArr2[0];
                this.f50454e = fArr2[1];
                this.f50456f = fArr3[0];
                this.h = fArr3[1];
                i iVar = this.D;
                if (iVar != null) {
                    iVar.f50432f = !z10;
                    iVar.invalidate();
                }
            }
            this.V = z10;
            float f10 = fArr3[0];
            float f11 = fArr3[1];
            int actionMasked = motionEvent.getActionMasked();
            nc ncVar = this.f50447a;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        jVar = this;
                        zC = jVar.c(fArr[0], fArr[1], z10, fArr2[0], fArr2[1]);
                    } else if (actionMasked != 3) {
                        zC = false;
                        jVar = this;
                    }
                    jVar.W = z10;
                    if (!super.onTouchEvent(motionEvent) || zC) {
                        return true;
                    }
                }
                jVar = this;
                d(actionMasked == 3);
                ncVar.c(false);
                i iVar2 = jVar.D;
                if (iVar2 != null) {
                    iVar2.f50432f = true;
                    iVar2.invalidate();
                }
            } else {
                jVar = this;
                jVar.W = false;
                jVar.f50449b = fArr[0];
                jVar.f50451c = fArr[1];
                jVar.f50456f = f10;
                jVar.h = f11;
                jVar.f50464r = false;
                if ((getParent() instanceof d) && (jVar.N != 0 || jVar.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                ncVar.c(true);
                e eVar = jVar.E;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                if (!z10) {
                    AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                }
            }
            zC = true;
            jVar.W = z10;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredHeight())) + (Math.abs(Math.cos(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredWidth())));
    }

    public void setDelegate(h hVar) {
        this.B = hVar;
    }

    public void setPosition(PointF pointF) {
        this.C = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f50453d0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        i iVar = this.D;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i10) {
        this.R = i10;
        this.N = i10;
    }

    public void setStickyY(int i10) {
        this.S = i10;
        this.O = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
