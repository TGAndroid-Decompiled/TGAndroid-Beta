package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y60;
public class j6 extends NestedScrollView implements y60 {
    public final t9 W;
    public final o1.j f49126a0;
    public final i6 f49127b0;
    public boolean f49128c0;
    public float f49129d0;
    public float f49130e0;
    public float f49131f0;
    public float f49132g0;
    public float f49133h0;
    public float f49134i0;
    public float f49135j0;
    public final OverScroller f49136k0;
    public boolean f49137l0;
    public int m0;
    public int f49138n0;
    public int f49139o0;
    public int f49140p0;
    public int f49141q0;
    public final FrameLayout f49142r0;
    public boolean f49143s0;
    public boolean f49144t0;
    public int f49145u0;
    public boolean f49146v0;
    public boolean f49147w0;

    public j6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f49141q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.b.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49142r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        at.i(this);
        i6 i6Var = new i6(this, getContext());
        this.f49127b0 = i6Var;
        t9 t9Var = new t9(i6Var, p6Var);
        this.W = t9Var;
        t9Var.f23425h0 = false;
        frameLayout.addView(i6Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.i0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j((Object) i6Var, (o1.h) o1.j.f13943p, 0.0f);
        this.f49126a0 = jVar;
        jVar.f13958m.b(100.0f);
        jVar.f(1.0f);
        jVar.b(new fg.c(2, this));
        jVar.f13958m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("c", null).setAccessible(true);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f49136k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f49136k0 = null;
            f8.g(e7, true);
        }
    }

    @Override
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.f49126a0.d();
            this.f49128c0 = true;
            this.f49129d0 = this.f49127b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.f49128c0 && i10 == 0) {
            this.f49128c0 = false;
            if (this.f49129d0 != 0.0f && (overScroller = this.f49136k0) != null && overScroller.isFinished()) {
                K(this.f49131f0);
            }
        }
    }

    public final void D() {
        if (!this.f49146v0) {
            return;
        }
        this.f49146v0 = false;
        float f7 = this.f49127b0.f49090x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c6(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gr.f26523f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f49146v0 && !z10) {
            return;
        }
        this.f49146v0 = true;
        float f7 = this.f49127b0.f49090x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c6(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gr.f26523f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f49146v0 = false;
        i6 i6Var = this.f49127b0;
        i6Var.f49090x = 0.0f;
        i6Var.invalidate();
    }

    public final void K(float f7) {
        o1.j jVar = this.f49126a0;
        if (!jVar.f13952f) {
            jVar.f13949a = f7;
            jVar.h();
        }
        if (getScrollY() < org.telegram.messenger.i0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.j6.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        h6 h6Var;
        i6 i6Var = this.f49127b0;
        h6[] h6VarArr = i6Var.f49087r;
        if (h6VarArr != null && (h6Var = h6VarArr[0]) != null && h6Var.f49057p != null) {
            int i10 = i6Var.F;
            int i11 = h6Var.f49054m;
            int i12 = h6Var.f49053l;
            int i13 = i6Var.F;
            h6 h6Var2 = i6Var.f49087r[0];
            rectF.set(i6Var.E, (org.telegram.messenger.i0.W1(i6Var.f49090x, i11, i12) + i10) - i6Var.f49087r[0].f49057p.b(), getWidth() - i6Var.E, org.telegram.messenger.i0.W1(i6Var.f49090x, h6Var2.f49054m, h6Var2.f49053l) + i13);
            float x10 = i6Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f49142r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (i6Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        h6 h6Var;
        i6 i6Var = this.f49127b0;
        h6[] h6VarArr = i6Var.f49087r;
        h6[] h6VarArr2 = i6Var.f49087r;
        if (h6VarArr != null && (h6Var = h6VarArr[0]) != null && h6Var.f49057p != null) {
            canvas.save();
            float x10 = i6Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f49142r0;
            float x11 = frameLayout.getX() + x10 + i6Var.E;
            float y3 = frameLayout.getY() + (i6Var.getY() - getScrollY()) + i6Var.F;
            h6 h6Var2 = h6VarArr2[0];
            canvas.translate(x11, (y3 + org.telegram.messenger.i0.W1(i6Var.f49090x, h6Var2.f49054m, h6Var2.f49053l)) - h6VarArr2[0].f49057p.b());
            e6 e6Var = h6VarArr2[0].f49057p;
            int width = getWidth();
            int i10 = i6Var.E;
            e6Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f49128c0 && this.f49129d0 != 0.0f && (overScroller = this.f49136k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f49144t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f49145u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f49128c0 || (((this.f49129d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f49129d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f49129d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f49129d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f49129d0 = f11;
            iArr[1] = i11;
        }
        this.f49127b0.setTranslationY(this.f49129d0);
        this.W.w();
        return true;
    }

    @Override
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f49129d0) / this.f49142r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f49128c0;
                i6 i6Var = this.f49127b0;
                if (!z10) {
                    if (!this.f49126a0.f13952f) {
                        OverScroller overScroller = this.f49136k0;
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
                            f10 = min * (-this.f49130e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f49129d0 - round;
                            this.f49129d0 = f12;
                            i6Var.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f49129d0 - round;
                    this.f49129d0 = f13;
                    i6Var.setTranslationY(f13);
                }
            }
        }
        this.W.w();
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f49142r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f49141q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f49142r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f49127b0.getTranslationY()) / Math.min(this.f49140p0, org.telegram.messenger.i0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f49127b0.getTranslationY() + this.f49142r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10) {
        super.i(i10);
        this.f49130e0 = Math.signum(i10);
        this.f49131f0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.w();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: th.j6.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: th.j6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    public void F(org.telegram.ui.Components.o5 o5Var) {
    }

    public void I(e6 e6Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, sg.v vVar) {
    }
}
