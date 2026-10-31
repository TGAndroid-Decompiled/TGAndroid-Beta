package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.voip.i0;
import org.telegram.ui.do0;
import r0.j1;
import w7.b6;
public final class e extends FrameLayout implements k6 {
    public float D;
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public tg.c I;
    public float J;
    public float K;
    public boolean L;
    public hh.g f55741a;
    public final do0 f55742b;
    public final FrameLayout f55743c;
    public final i0 d;
    public boolean e;
    public vg.f f55744f;
    public vg.f h;
    public final Path f55745n;
    public int f55746r;
    public float f55747s;
    public float f55748w;
    public boolean f55749x;
    public float f55750y;

    public e(Context context) {
        super(context);
        this.e = true;
        this.f55745n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f55743c = frameLayout;
        addView(frameLayout, b6.e(-1, -2, 80));
        i0 i0Var = new i0(this, context, 13);
        this.d = i0Var;
        addView(i0Var, b6.e(-1, -2, 80));
        this.f55742b = new do0(this, context, 16);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f55747s) + org.telegram.messenger.i0.L(9.0f) + this.F;
        if (this.f55746r == round && !z10) {
            return;
        }
        this.f55746r = round;
        int L = org.telegram.messenger.i0.L(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.f55748w, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f55745n;
        path.rewind();
        float f7 = L;
        path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        tg.c cVar = this.I;
        if (cVar != null && (i10 = cVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f55742b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        j1 j1Var = ((hh.i) this.f55741a).f7700r;
        if (j1Var != null) {
            i10 = j1Var.f46132a.f(2).d;
        } else {
            i10 = 0;
        }
        float c10 = ((hh.i) this.f55741a).c();
        i0 i0Var = this.d;
        int childCount = i0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i0Var.getChildAt(i11);
            if (childAt instanceof hh.a) {
                hh.a aVar = (hh.a) childAt;
                aVar.c(i10);
                aVar.d(c10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f55747s = ((hh.i) this.f55741a).d();
        this.f55748w = ((hh.i) this.f55741a).c();
        int i12 = 0;
        boolean z11 = true;
        if (((hh.i) this.f55741a).f7701s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f55749x = z10;
        i0 i0Var = this.d;
        if (i0Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f55749x;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            i0Var.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i0Var.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((hh.i) this.f55741a).f7703x;
        if (i13 != i14) {
            layoutParams.height = i14;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                if (roundedCorner == null) {
                    i10 = 0;
                } else {
                    i10 = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i12 = roundedCorner2.getRadius();
                }
            } else {
                i10 = 0;
            }
            this.h.s(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), i12, i10, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.f55748w), getMeasuredWidth(), m5.b(58.0f, getMeasuredHeight() - ((int) this.f55748w), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f55746r;
        int round = Math.round(this.f55750y);
        int measuredWidth = getMeasuredWidth() - Math.round(this.D);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -org.telegram.messenger.i0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f55744f.setBounds(rect);
        if (this.e) {
            this.f55744f.draw(canvas);
        }
        if (this.f55749x) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.M.f50837k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f55743c.setTranslationY((-this.f55747s) - org.telegram.messenger.i0.L(9.0f));
        i0 i0Var = this.d;
        i0Var.setTranslationY(i0Var.getMeasuredHeight() - this.f55748w);
    }

    public View getFadeView() {
        return this.f55742b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f55747s) - org.telegram.messenger.i0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f55743c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vg.f fVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            vg.f fVar2 = this.f55744f;
            if ((fVar2 != null && fVar2.f6649c == 255 && fVar2.getBounds().contains(x10, y3)) || ((fVar = this.h) != null && fVar.getBounds().contains(x10, y3))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(tg.c cVar) {
        this.I = cVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        vg.f fVar = this.f55744f;
        if (fVar != null) {
            fVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f7) {
        this.E = f7;
        this.F = Math.round(f7);
        a(false);
    }

    public void setInputBubbleTranslationY(float f7) {
        this.K = f7;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(vg.f fVar) {
        this.f55744f = fVar;
        fVar.p(org.telegram.messenger.i0.L(7.0f));
        this.f55744f.q(org.telegram.messenger.i0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(vg.f fVar) {
        this.h = fVar;
        fVar.O = true;
        fVar.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
        this.h.t(org.telegram.messenger.i0.L(32.0f));
        vg.f fVar2 = this.h;
        fVar2.M.f50834g = 0.4f;
        fVar2.m();
    }

    public void setWindowInsetsProvider(hh.g gVar) {
        this.f55741a = gVar;
    }

    @Override
    public final void updateColors() {
        vg.f fVar = this.f55744f;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.h;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
