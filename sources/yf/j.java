package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wj0;
public abstract class j extends FrameLayout {
    public static final List f49849l0 = Arrays.asList(-90, 0, 90, 180);
    public boolean A;
    public h B;
    public PointF C;
    public i D;
    public final e E;
    public final UUID F;
    public boolean G;
    public int H;
    public int I;
    public ve.a J;
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
    public final pc f49850a;
    public final float[] f49851a0;
    public float f49852b;
    public final float[] f49853b0;
    public float f49854c;
    public final float[] f49855c0;
    public float d;
    public float f49856d0;
    public float f49857e;
    public float f49858e0;
    public float f49859f;
    public float f49860f0;
    public ValueAnimator f49861g0;
    public float h;
    public boolean f49862h0;
    public ViewGroup f49863i0;
    public float f49864j0;
    public ValueAnimator f49865k0;
    public boolean f49866n;
    public boolean f49867r;
    public boolean f49868s;
    public boolean v;
    public boolean f49869w;
    public boolean f49870x;
    public boolean f49871y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f49850a = new pc(this);
        this.f49866n = false;
        this.f49867r = false;
        this.f49868s = false;
        this.v = false;
        this.f49869w = false;
        this.f49870x = false;
        this.f49871y = false;
        this.A = false;
        this.E = new Runnable(this) {
            public final j f49791b;

            {
                this.f49791b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f49791b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f49791b.n();
                        return;
                    default:
                        this.f49791b.o();
                        return;
                }
            }
        };
        this.G = true;
        this.H = 0;
        this.I = -1;
        this.N = 0;
        this.O = 0;
        this.P = new Runnable(this) {
            public final j f49791b;

            {
                this.f49791b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f49791b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f49791b.n();
                        return;
                    default:
                        this.f49791b.o();
                        return;
                }
            }
        };
        this.Q = new Runnable(this) {
            public final j f49791b;

            {
                this.f49791b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f49791b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f49791b.n();
                        return;
                    default:
                        this.f49791b.o();
                        return;
                }
            }
        };
        this.f49851a0 = new float[2];
        this.f49853b0 = new float[2];
        this.f49855c0 = new float[2];
        this.f49856d0 = 1.0f;
        this.f49862h0 = false;
        this.f49864j0 = 1.0f;
        this.F = UUID.randomUUID();
        this.C = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        boolean z11;
        float f17;
        boolean z12;
        boolean z13;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z10) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            if (z10) {
                f15 = (f11 + f13) / 2.0f;
            } else {
                f15 = f11;
            }
            float f18 = (f14 - this.f49859f) / scaleX;
            float f19 = (f15 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f18, f19);
            if (this.f49866n) {
                f16 = 6.0f;
            } else {
                f16 = 16.0f;
            }
            if (hypot > f16 || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.E);
                e(f18, f19);
                if (z10) {
                    float a2 = g7.w.a(f10, f11, f12, f13);
                    float a3 = g7.w.a(this.f49852b, this.f49854c, this.d, this.f49857e);
                    if (a3 > 0.0f) {
                        j(a2 / a3);
                    }
                    f(this.f49858e0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f49854c - this.f49857e, this.f49852b - this.d))));
                }
                this.f49852b = f10;
                this.f49854c = f11;
                this.f49859f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.f49857e = f13;
                }
                this.f49866n = true;
                if ((getParent() instanceof d) && (this.N != 0 || this.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.B) != null) {
                    this.v = true;
                    hVar4.C();
                }
                if (!this.f49869w && z10 && (hVar3 = this.B) != null) {
                    this.f49869w = true;
                    hVar3.l();
                }
                if (this.f49869w && !z10 && (hVar2 = this.B) != null) {
                    this.f49869w = false;
                    hVar2.j();
                }
                if (!this.f49862h0 && !this.f49870x && (hVar = this.B) != null) {
                    hVar.k(this);
                    this.f49870x = true;
                }
                h hVar5 = this.B;
                if (hVar5 != null) {
                    if (ll.c(getHeight(), 2.0f, scaleX, this.C.y) < AndroidUtilities.dp(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar5.B(z12);
                    h hVar6 = this.B;
                    if (org.telegram.ui.Cells.j2.b(getHeight(), 2.0f, scaleX, this.C.y) > ((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hVar6.g(z13);
                }
                h hVar7 = this.B;
                if ((hVar7 == null || hVar7.r()) && !z10 && g7.w.a(f14, f15, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f)) < AndroidUtilities.dp(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f49871y != z11) {
                    ValueAnimator valueAnimator = this.f49865k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f49865k0 = null;
                    }
                    float f20 = this.f49864j0;
                    if (z11) {
                        f17 = 0.5f;
                    } else {
                        f17 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f20, f17);
                    this.f49865k0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, 1));
                    this.f49865k0.setInterpolator(gr.h);
                    this.f49865k0.setDuration(280L);
                    this.f49865k0.start();
                    this.f49871y = z11;
                    h hVar8 = this.B;
                    if (hVar8 != null) {
                        hVar8.o(z11);
                    }
                }
                this.f49850a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        h hVar;
        h hVar2;
        if (this.v) {
            this.B.h(this.f49871y);
            this.v = false;
        }
        this.f49869w = false;
        if (!z10 && !this.A && !this.f49866n && !this.f49868s && !this.f49870x && (hVar2 = this.B) != null) {
            hVar2.k(this);
        }
        if (this.f49866n && (hVar = this.B) != null) {
            hVar.B(false);
            this.B.g(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.A = false;
        this.f49866n = false;
        this.f49868s = false;
        this.f49867r = true;
        this.f49870x = false;
        this.I = this.H;
        ve.a aVar = this.J;
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
        float a2 = this.f49850a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof b2) {
                float f10 = this.f49864j0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f11 = this.f49864j0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: yf.j.e(float, float):void");
    }

    public final void f(float f10) {
        if (this.N != 0) {
            this.R = 0;
            n();
        }
        if (this.O != 0) {
            this.S = 0;
            o();
        }
        this.f49858e0 = f10;
        boolean z10 = this.G;
        if (!z10 && !this.V) {
            Iterator it = f49849l0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.I != intValue) {
                        this.I = intValue;
                        ve.a aVar = this.J;
                        if (aVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(aVar);
                        }
                        ve.a aVar2 = new ve.a(this, intValue, 2);
                        this.J = aVar2;
                        AndroidUtilities.runOnUIThread(aVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.H - f10) < 12.0f && !this.V) {
                if (this.L != null) {
                    f10 = this.K;
                } else {
                    f10 = this.H;
                }
            } else {
                this.I = -1;
                ve.a aVar3 = this.J;
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
                duration.setInterpolator(gr.f28844f);
                this.M.addUpdateListener(new f(this, 0));
                this.M.addListener(new g(this, 3));
                this.M.start();
                this.G = false;
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
        float f10;
        float f11 = this.C.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i9 = this.N;
            if (i9 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i9 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i9 == 3) {
                f10 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.C.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i9 = this.O;
            if (i9 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i9 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i9 == 3) {
                f10 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getScale() {
        return getScaleX();
    }

    public wj0 getSelectionBounds() {
        return new wj0(0.0f, 0.0f, 0.0f, 0.0f);
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
        duration.setInterpolator(gr.f28844f);
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
        duration.setInterpolator(gr.f28844f);
        this.U.addUpdateListener(new f(this, 4));
        this.U.addListener(new g(this, 1));
        this.U.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f49862h0;
    }

    public final void j(float f10) {
        boolean z10;
        float f11 = this.f49856d0;
        float f12 = f10 * f11;
        this.f49856d0 = f12;
        float clamp = Utilities.clamp(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof a2)) {
            boolean z11 = false;
            if (clamp < getMaxScale() && clamp > getMinScale()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != ((f11 >= getMaxScale() || f11 <= getMinScale()) ? true : true)) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(clamp);
        setScaleY(clamp);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.f49862h0 != z10) {
            this.f49862h0 = z10;
            ValueAnimator valueAnimator = this.f49861g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f49861g0 = null;
            }
            float f10 = 0.0f;
            if (this.D == null) {
                if (z10 || viewGroup != null) {
                    i a2 = a();
                    this.D = a2;
                    a2.f49845f = !this.V;
                    a2.invalidate();
                    viewGroup.addView(this.D);
                    this.f49860f0 = 0.0f;
                } else {
                    return;
                }
            }
            this.D.b();
            float f11 = this.f49860f0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f49861g0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.f49861g0.addListener(new g(this, 4));
            this.f49861g0.setDuration(280L);
            this.f49861g0.setInterpolator(gr.h);
            this.f49861g0.start();
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
        int i9 = this.N;
        int i10 = this.R;
        if (i9 == i10) {
            return;
        }
        this.N = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.R == 0) {
            h(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        h(0.0f, 1.0f);
    }

    public final void o() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        int i9 = this.O;
        int i10 = this.S;
        if (i9 == i10) {
            return;
        }
        this.O = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.S == 0) {
            i(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        i(0.0f, 1.0f);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.B.s();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: yf.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.B = hVar;
    }

    public void setPosition(PointF pointF) {
        this.C = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f49856d0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        int i9;
        i iVar = this.D;
        if (iVar == null) {
            return;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        iVar.setVisibility(i9);
    }

    public void setStickyX(int i9) {
        this.R = i9;
        this.N = i9;
    }

    public void setStickyY(int i9) {
        this.S = i9;
        this.O = i9;
    }

    public void setIsVideo(boolean z10) {
    }
}
