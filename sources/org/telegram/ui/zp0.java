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
public abstract class zp0 extends NestedScrollView {
    public final Paint f52724a0;
    public final q1.g f52725b0;
    public boolean f52726c0;
    public float f52727d0;
    public float f52728e0;
    public float f52729f0;
    public final Method f52730g0;
    public final OverScroller f52731h0;
    public boolean f52732i0;
    public int f52733j0;
    public int f52734k0;
    public float f52735l0;
    public boolean m0;
    public int f52736n0;
    public final cq0 f52737o0;
    public final FrameLayout f52738p0;

    public zp0(Context context, cq0 cq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.f52724a0 = paint;
        this.f52735l0 = 1.0f;
        this.f52736n0 = -1;
        this.f52737o0 = cq0Var;
        this.f52738p0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        q1.g gVar = new q1.g((Object) cq0Var, (q1.e) q1.g.f53637p, 0.0f);
        this.f52725b0 = gVar;
        gVar.f53653m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new wa0(this, 2));
        gVar.a(new k9(this, 2));
        gVar.f53653m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f52730g0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f52730g0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f52731h0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f52731h0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i3, int i10) {
        if (i10 == 0) {
            this.f52725b0.d();
            this.f52726c0 = true;
            this.f52727d0 = this.f52737o0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i3) {
        OverScroller overScroller;
        if (this.f52726c0 && i3 == 0) {
            this.f52726c0 = false;
            if (this.f52727d0 != 0.0f && (overScroller = this.f52731h0) != null && overScroller.isFinished()) {
                float f10 = this.f52729f0;
                q1.g gVar = this.f52725b0;
                if (!gVar.f53647f) {
                    gVar.f53643a = f10;
                    gVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zp0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f52726c0 && this.f52727d0 != 0.0f && (overScroller = this.f52731h0) != null && overScroller.isFinished()) {
            q1.g gVar = this.f52725b0;
            if (!gVar.f53647f) {
                gVar.f53643a = 0.0f;
                gVar.h();
            }
        }
        G();
    }

    @Override
    public final boolean d(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f52726c0 || (((this.f52727d0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f52727d0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f52727d0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f52727d0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f52727d0 = f12;
            iArr[1] = i10;
        }
        G();
        this.f52737o0.setTranslationY(this.f52727d0);
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i3 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i3);
        Paint paint = this.f52724a0;
        paint.setAlpha((int) (this.f52735l0 * 127.0f));
        canvas.drawRect(0.0f, this.f52737o0.getTranslationY() + this.f52738p0.getTop(), width, i3, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        int i14;
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            if (D()) {
                i14 = org.telegram.messenger.g0.f22602m;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int round = Math.round((1.0f - Math.abs((-this.f52727d0) / (this.f52738p0.getTop() - currentActionBarHeight))) * i12);
            if (round != 0) {
                boolean z10 = this.f52726c0;
                cq0 cq0Var = this.f52737o0;
                if (!z10) {
                    q1.g gVar = this.f52725b0;
                    if (!gVar.f53647f) {
                        OverScroller overScroller = this.f52731h0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22608q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f52728e0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f52727d0 - round;
                            this.f52727d0 = f13;
                            cq0Var.setTranslationY(f13);
                        }
                        if (!gVar.f53647f) {
                            gVar.f53643a = f11;
                            gVar.h();
                        }
                    }
                } else {
                    float f14 = this.f52727d0 - round;
                    this.f52727d0 = f14;
                    cq0Var.setTranslationY(f14);
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
        int i3 = this.f52736n0;
        if (i3 >= 0) {
            return i3 - ((ViewGroup.MarginLayoutParams) this.f52738p0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i3) {
        super.i(i3);
        this.f52728e0 = Math.signum(i3);
        this.f52729f0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        H(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f52737o0.getTranslationY() + (this.f52738p0.getTop() - getScrollY())) {
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
