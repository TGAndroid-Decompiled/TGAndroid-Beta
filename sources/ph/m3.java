package ph;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import nh.r9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pb;
import org.telegram.ui.th;
import org.telegram.ui.xx0;
public abstract class m3 extends FrameLayout {
    public static final av0 U = new av0(new xx0(26), new xx0(27));
    public Runnable A;
    public l3 B;
    public o1.k C;
    public int D;
    public GenericProvider E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public final float P;
    public final boolean Q;
    public long R;
    public float S;
    public float T;
    public Object f45902a;
    public final o4.g f45903b;
    public boolean f45904c;
    public boolean d;
    public float f45905e;
    public float f45906f;
    public float h;
    public float f45907n;
    public float f45908r;
    public boolean f45909s;
    public o1.k v;
    public boolean f45910w;
    public org.telegram.ui.web.w0 f45911x;
    public Runnable f45912y;

    public m3(Context context) {
        super(context);
        float f9;
        this.f45905e = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f45906f = 0.0f;
        this.h = -1.0f;
        this.f45907n = -2.1474836E9f;
        this.E = new xx0(28);
        this.I = true;
        this.N = 0.0f;
        this.O = false;
        this.P = AndroidUtilities.dp(60.0f);
        this.Q = true;
        this.f45903b = new o4.g(context, new mr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f9 = 8.0f;
        } else {
            f9 = 64.0f;
        }
        this.D = AndroidUtilities.dp(f9);
    }

    public final void a(boolean z10, boolean z11) {
        this.K = z10;
        this.L = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.w0 w0Var = this.f45911x;
        if (w0Var != null && w0Var.J) {
            if (z10) {
                if (!this.K) {
                    return false;
                }
                return true;
            } else if (!this.L) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.f45905e, this.f45906f + this.f45908r));
        AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.t1(this, 11));
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(this, 11));
        Runnable runnable = this.f45912y;
        if (runnable != null) {
            runnable.run();
        }
        mc mcVar = mc.f30644w;
        if (mcVar != null) {
            mcVar.l();
        }
    }

    public final boolean d() {
        return this.f45904c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f45902a;
            if (obj != null) {
                RenderNode c3 = org.telegram.messenger.b.c(obj);
                c3.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c3.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f45902a;
            if (obj2 != null) {
                RenderNode c6 = org.telegram.messenger.b.c(obj2);
                c6.endRecording();
                canvas.drawRenderNode(c6);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f45904c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getEventTime();
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.O = false;
                this.N = 0.0f;
                if (this.J) {
                    this.K = false;
                    this.L = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f45903b.f19159b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f45904c;
                this.d = false;
                this.f45904c = false;
                if (!this.F || this.H) {
                    if (this.f45910w) {
                        this.f45910w = false;
                    } else if (this.I && (!this.J || (this.f45908r != (-this.f45906f) + this.f45905e && b(false)))) {
                        float f9 = this.f45908r;
                        int i10 = this.D;
                        float f10 = -i10;
                        boolean z11 = this.Q;
                        if (f9 <= f10) {
                            if (z11) {
                                e((-this.f45906f) + this.f45905e);
                            }
                        } else if (f9 > f10 && f9 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.S, this.T);
                            long eventTime = motionEvent.getEventTime() - this.R;
                            if (this.B != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.B.f(!z10);
                            } else if (z11) {
                                e((-this.f45906f) + this.f45905e);
                            }
                        }
                    }
                }
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((!dispatchTouchEvent && !onTouchEvent && motionEvent.getAction() == 0) || dispatchTouchEvent || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void e(float f9) {
        f(f9, false, null);
    }

    public final void f(float f9, boolean z10, Runnable runnable) {
        o1.k kVar;
        if (this.F && !z10) {
            f9 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f45908r != f9 && ((kVar = this.C) == null || ((float) kVar.f19045u.f19052i) != f9)) {
            this.f45907n = f9;
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = this.C;
            if (kVar3 != null) {
                kVar3.c();
            }
            o1.k kVar4 = new o1.k(this, U, f9);
            kVar4.f19045u = th.l(f9, 1200.0f, 1.0f);
            kVar4.a(new pb(4, this, runnable));
            this.C = kVar4;
            kVar4.f();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.A;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f45906f;
    }

    public Object getRenderNode() {
        if (this.f45902a == null && Build.VERSION.SDK_INT >= 31) {
            this.f45902a = android.support.v4.media.session.z.j();
        }
        return this.f45902a;
    }

    public float getSwipeOffsetY() {
        return this.f45908r;
    }

    public float getTopActionBarOffsetY() {
        return this.f45905e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f9;
        super.onConfigurationChanged(configuration);
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f9 = 8.0f;
        } else {
            f9 = 64.0f;
        }
        this.D = AndroidUtilities.dp(f9);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.f45904c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.H = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
        }
    }

    public void setDelegate(l3 l3Var) {
        this.B = l3Var;
    }

    public void setForceOffsetY(float f9) {
        this.f45906f = f9;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            if (z10) {
                if (this.G) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.E = genericProvider;
    }

    public void setOffsetY(final float f9) {
        final boolean z10;
        if (this.f45907n != -2.1474836E9f) {
            this.h = f9;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f45906f;
        final float f11 = f9 - f10;
        if (Math.abs((this.f45908r + f10) - this.f45905e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f45909s) {
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = new o1.k(new ib.a(f10));
            kVar3.f19045u = th.l(f9, 1400.0f, 1.0f);
            kVar3.b(new o1.h() {
                @Override
                public final void a(o1.i iVar, float f12, float f13) {
                    float f14;
                    m3 m3Var = m3.this;
                    m3Var.f45906f = f12;
                    float f15 = f11;
                    float f16 = f10;
                    if (f15 == 0.0f) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z10) {
                        m3Var.f45908r = i7.w.a(m3Var.f45908r - (Math.max(0.0f, f15) * f14), (-m3Var.f45906f) + m3Var.f45905e, (m3Var.getHeight() - m3Var.f45906f) + m3Var.f45905e);
                    }
                    o1.k kVar4 = m3Var.C;
                    if (kVar4 != null) {
                        o1.l lVar = kVar4.f19045u;
                        float f17 = (float) lVar.f19052i;
                        float f18 = m3Var.f45905e;
                        if (f17 == (-f16) + f18) {
                            lVar.f19052i = (-f9) + f18;
                        }
                    }
                    m3Var.c();
                }
            });
            kVar3.a(new r9(this, f9, 2));
            this.v = kVar3;
            kVar3.f();
            return;
        }
        this.f45906f = f9;
        if (z10) {
            this.f45908r = i7.w.a(this.f45908r - Math.max(0.0f, f11), (-this.f45906f) + this.f45905e, (getHeight() - this.f45906f) + this.f45905e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.A = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f45912y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.J = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f45909s = z10;
    }

    public void setSwipeOffsetY(float f9) {
        this.f45908r = f9;
        c();
    }

    public void setTopActionBarOffsetY(float f9) {
        this.f45905e = f9;
        c();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
    }

    public void setWebView(org.telegram.ui.web.w0 w0Var) {
        this.f45911x = w0Var;
    }
}
