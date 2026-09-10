package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wr;
public class p6 extends NestedScrollView implements v70 {
    public final ca W;
    public final o1.k f48777a0;
    public final o6 f48778b0;
    public boolean f48779c0;
    public float f48780d0;
    public float f48781e0;
    public float f48782f0;
    public float f48783g0;
    public float f48784h0;
    public float f48785i0;
    public float f48786j0;
    public final OverScroller f48787k0;
    public boolean f48788l0;
    public int m0;
    public int f48789n0;
    public int f48790o0;
    public int f48791p0;
    public int f48792q0;
    public final FrameLayout f48793r0;
    public boolean f48794s0;
    public boolean f48795t0;
    public int f48796u0;
    public boolean f48797v0;
    public boolean f48798w0;

    public p6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f48792q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48793r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        o6 o6Var = new o6(this, getContext());
        this.f48778b0 = o6Var;
        ca caVar = new ca(o6Var, f6Var);
        this.W = caVar;
        caVar.f19142i0 = false;
        frameLayout.addView(o6Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(o6Var, o1.h.f14117n, 0.0f);
        this.f48777a0 = kVar;
        kVar.f14134u.b(100.0f);
        kVar.f14130j = 1.0f;
        kVar.b(new bi.i6(3, this));
        kVar.f14134u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f48787k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f48787k0 = null;
            FileLog.e(e7);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f48779c0 && i10 == 0) {
            this.f48779c0 = false;
            if (this.f48780d0 != 0.0f && (overScroller = this.f48787k0) != null && overScroller.isFinished()) {
                K(this.f48782f0);
            }
        }
    }

    public final void C() {
        if (!this.f48797v0) {
            return;
        }
        this.f48797v0 = false;
        float f7 = this.f48778b0.f48758w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h6(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(wr.f28819f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f48797v0 && !z10) {
            return;
        }
        this.f48797v0 = true;
        float f7 = this.f48778b0.f48758w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h6(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(wr.f28819f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f48797v0 = false;
        o6 o6Var = this.f48778b0;
        o6Var.f48758w = 0.0f;
        o6Var.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f48777a0;
        if (!kVar.f14127f) {
            kVar.f14124a = f7;
            kVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zh.p6.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        n6 n6Var;
        o6 o6Var = this.f48778b0;
        n6[] n6VarArr = o6Var.f48756r;
        if (n6VarArr != null && (n6Var = n6VarArr[0]) != null && n6Var.f48724p != null) {
            int i10 = o6Var.F;
            int i11 = o6Var.F;
            n6 n6Var2 = o6Var.f48756r[0];
            rectF.set(o6Var.E, (AndroidUtilities.lerp(n6Var.f48721m, n6Var.f48720l, o6Var.f48758w) + i10) - o6Var.f48756r[0].f48724p.b(), getWidth() - o6Var.E, AndroidUtilities.lerp(n6Var2.f48721m, n6Var2.f48720l, o6Var.f48758w) + i11);
            float x10 = o6Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f48793r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (o6Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        n6 n6Var;
        o6 o6Var = this.f48778b0;
        n6[] n6VarArr = o6Var.f48756r;
        n6[] n6VarArr2 = o6Var.f48756r;
        if (n6VarArr != null && (n6Var = n6VarArr[0]) != null && n6Var.f48724p != null) {
            canvas.save();
            float x10 = o6Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f48793r0;
            float x11 = frameLayout.getX() + x10 + o6Var.E;
            float y3 = frameLayout.getY() + (o6Var.getY() - getScrollY()) + o6Var.F;
            n6 n6Var2 = n6VarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(n6Var2.f48721m, n6Var2.f48720l, o6Var.f48758w)) - n6VarArr2[0].f48724p.b());
            j6 j6Var = n6VarArr2[0].f48724p;
            int width = getWidth();
            int i10 = o6Var.E;
            j6Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f48779c0 && this.f48780d0 != 0.0f && (overScroller = this.f48787k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f48795t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f48796u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f48779c0 || (((this.f48780d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f48780d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f48780d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f48780d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f48780d0 = f11;
            iArr[1] = i11;
        }
        this.f48778b0.setTranslationY(this.f48780d0);
        this.W.x();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f48793r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f48792q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f48793r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f48778b0.getTranslationY()) / Math.min(this.f48791p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f48778b0.getTranslationY() + this.f48793r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f48780d0) / this.f48793r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f48779c0;
                o6 o6Var = this.f48778b0;
                if (!z10) {
                    if (!this.f48777a0.f14127f) {
                        OverScroller overScroller = this.f48787k0;
                        if (overScroller != null) {
                            f7 = overScroller.getCurrVelocity();
                        } else {
                            f7 = Float.NaN;
                        }
                        if (!Float.isNaN(f7)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f7);
                            round = (int) ((round * min) / f7);
                            f10 = min * (-this.f48781e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f48780d0 - round;
                            this.f48780d0 = f12;
                            o6Var.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f48780d0 - round;
                    this.f48780d0 = f13;
                    o6Var.setTranslationY(f13);
                }
            }
        }
        this.W.x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.x();
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f48781e0 = Math.signum(i10);
        this.f48782f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: zh.p6.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: zh.p6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f48777a0.c();
            this.f48779c0 = true;
            this.f48780d0 = this.f48778b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(j6 j6Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, k5 k5Var) {
    }
}
