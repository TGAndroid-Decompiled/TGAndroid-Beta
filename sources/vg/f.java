package vg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.iw0;
import qh.o9;
import r0.m1;
public final class f extends FrameLayout {
    public float B;
    public int C;
    public final Rect D;
    public final RectF E;
    public og.b F;
    public float G;
    public float H;
    public boolean I;
    public dh.g f49283a;
    public final iw0 f49284b;
    public final FrameLayout f49285c;
    public final o9 d;
    public boolean f49286e;
    public qg.b f49287f;
    public qg.b h;
    public final Path f49288n;
    public int f49289r;
    public float f49290s;
    public float v;
    public boolean f49291w;
    public float f49292x;
    public float f49293y;

    public f(Context context) {
        super(context);
        this.f49286e = true;
        this.f49288n = new Path();
        this.D = new Rect();
        this.E = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49285c = frameLayout;
        addView(frameLayout, c6.e(-1, -2, 80));
        o9 o9Var = new o9(this, context, 3);
        this.d = o9Var;
        addView(o9Var, c6.e(-1, -2, 80));
        this.f49284b = new iw0(this, context, 11);
    }

    public final void a(boolean z4) {
        e();
        int round = Math.round(this.f49290s) + AndroidUtilities.dp(9.0f) + this.C;
        if (this.f49289r == round && !z4) {
            return;
        }
        this.f49289r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.E;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f49288n;
        path.rewind();
        float f10 = dp;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        og.b bVar = this.F;
        if (bVar != null && (i10 = bVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.G))) {
            this.F.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f49284b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        m1 m1Var = ((dh.i) this.f49283a).f4763r;
        if (m1Var != null) {
            i10 = m1Var.f46452a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((dh.i) this.f49283a).b();
        o9 o9Var = this.d;
        int childCount = o9Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = o9Var.getChildAt(i11);
            if (childAt instanceof dh.a) {
                dh.a aVar = (dh.a) childAt;
                aVar.b(i10);
                aVar.c(b10);
            }
        }
    }

    public final void d() {
        boolean z4;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f49290s = ((dh.i) this.f49283a).c();
        this.v = ((dh.i) this.f49283a).b();
        int i12 = 0;
        boolean z10 = true;
        if (((dh.i) this.f49283a).f4764s != 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49291w = z4;
        o9 o9Var = this.d;
        if (o9Var.getVisibility() != 0) {
            z10 = false;
        }
        boolean z11 = this.f49291w;
        if (z10 != z11) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o9Var.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o9Var.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((dh.i) this.f49283a).f4765w;
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
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i12, i10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), y3.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f49289r;
        int round = Math.round(this.f49292x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f49293y);
        int i10 = this.C;
        Rect rect = this.D;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.H));
        this.f49287f.setBounds(rect);
        if (this.f49286e) {
            this.f49287f.draw(canvas);
        }
        if (this.f49291w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        if (view == this.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            canvas.save();
            canvas.clipPath(this.h.h.f44844k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f49285c.setTranslationY((-this.f49290s) - AndroidUtilities.dp(9.0f));
        o9 o9Var = this.d;
        o9Var.setTranslationY(o9Var.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f49284b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f49290s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.B;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f49285c;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
        qg.b bVar;
        boolean z4;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            qg.b bVar2 = this.f49287f;
            if ((bVar2 != null && bVar2.f44856j == 255 && bVar2.getBounds().contains(x10, y10)) || ((bVar = this.h) != null && bVar.getBounds().contains(x10, y10))) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.I = z4;
        }
        if (action == 1 || action == 3) {
            this.I = false;
        }
        return this.I;
    }

    public void setBackgroundWithFadeDrawable(og.b bVar) {
        this.F = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.G != f10) {
            this.G = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        qg.b bVar = this.f49287f;
        if (bVar != null) {
            bVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.B = f10;
        this.C = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.H = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(qg.b bVar) {
        this.f49287f = bVar;
        bVar.o(AndroidUtilities.dp(7.0f));
        this.f49287f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(qg.b bVar) {
        this.h = bVar;
        bVar.f44857k = true;
        bVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        qg.b bVar2 = this.h;
        bVar2.h.f44841g = 0.4f;
        bVar2.j();
    }

    public void setWindowInsetsProvider(dh.g gVar) {
        this.f49283a = gVar;
    }
}
