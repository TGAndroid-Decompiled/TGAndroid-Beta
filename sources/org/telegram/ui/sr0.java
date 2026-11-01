package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class sr0 extends NestedScrollView {
    public final Paint W;
    public final o1.j f41441a0;
    public boolean f41442b0;
    public float f41443c0;
    public float f41444d0;
    public float f41445e0;
    public final Method f41446f0;
    public final OverScroller f41447g0;
    public boolean f41448h0;
    public int f41449i0;
    public int f41450j0;
    public float f41451k0;
    public boolean f41452l0;
    public int m0;
    public final vr0 f41453n0;
    public final FrameLayout f41454o0;

    public sr0(Context context, vr0 vr0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f41451k0 = 1.0f;
        this.m0 = -1;
        this.f41453n0 = vr0Var;
        this.f41454o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.i0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j((Object) vr0Var, (o1.h) o1.j.f13943p, 0.0f);
        this.f41441a0 = jVar;
        jVar.f13958m.b(100.0f);
        jVar.f(1.0f);
        jVar.b(new ic0(this, 2));
        jVar.a(new m9(this, 2));
        jVar.f13958m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("c", null);
            this.f41446f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f41446f0 = null;
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f41447g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f41447g0 = null;
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.f41441a0.d();
            this.f41442b0 = true;
            this.f41443c0 = this.f41453n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.f41442b0 && i10 == 0) {
            this.f41442b0 = false;
            if (this.f41443c0 != 0.0f && (overScroller = this.f41447g0) != null && overScroller.isFinished()) {
                float f7 = this.f41445e0;
                o1.j jVar = this.f41441a0;
                if (!jVar.f13952f) {
                    jVar.f13949a = f7;
                    jVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f41442b0 && this.f41443c0 != 0.0f && (overScroller = this.f41447g0) != null && overScroller.isFinished()) {
            o1.j jVar = this.f41441a0;
            if (!jVar.f13952f) {
                jVar.f13949a = 0.0f;
                jVar.h();
            }
        }
        G();
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        Paint paint = this.W;
        paint.setAlpha((int) (this.f41451k0 * 127.0f));
        canvas.drawRect(0.0f, this.f41453n0.getTranslationY() + this.f41454o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f41442b0 || (((this.f41443c0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f41443c0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f41443c0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f41443c0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f41443c0 = f11;
            iArr[1] = i11;
        }
        G();
        this.f41453n0.setTranslationY(this.f41443c0);
        return true;
    }

    @Override
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        int i15;
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            if (D()) {
                i15 = org.telegram.messenger.i0.f16166m;
            } else {
                i15 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.f41443c0) / (this.f41454o0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z10 = this.f41442b0;
                vr0 vr0Var = this.f41453n0;
                if (!z10) {
                    o1.j jVar = this.f41441a0;
                    if (!jVar.f13952f) {
                        OverScroller overScroller = this.f41447g0;
                        if (overScroller != null) {
                            f7 = overScroller.getCurrVelocity();
                        } else {
                            f7 = Float.NaN;
                        }
                        if (!Float.isNaN(f7)) {
                            Point point = org.telegram.messenger.i0.f16172q;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f7);
                            round = (int) ((round * min) / f7);
                            f10 = min * (-this.f41444d0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f41443c0 - round;
                            this.f41443c0 = f12;
                            vr0Var.setTranslationY(f12);
                        }
                        if (!jVar.f13952f) {
                            jVar.f13949a = f10;
                            jVar.h();
                        }
                    }
                } else {
                    float f13 = this.f41443c0 - round;
                    this.f41443c0 = f13;
                    vr0Var.setTranslationY(f13);
                }
            }
            G();
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f41454o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10) {
        super.i(i10);
        this.f41444d0 = Math.signum(i10);
        this.f41445e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f41453n0.getTranslationY() + (this.f41454o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }
}
