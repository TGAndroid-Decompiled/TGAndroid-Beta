package sg;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.z51;
import org.telegram.ui.op0;
import r0.m1;
public final class f extends FrameLayout {
    public float A;
    public int B;
    public final Rect C;
    public final RectF D;
    public lg.b E;
    public float F;
    public float G;
    public boolean H;
    public ah.g f48048a;
    public final op0 f48049b;
    public final FrameLayout f48050c;
    public final z51 d;
    public boolean f48051e;
    public ng.d f48052f;
    public ng.d h;
    public final Path f48053n;
    public int f48054r;
    public float f48055s;
    public float v;
    public boolean f48056w;
    public float f48057x;
    public float f48058y;

    public f(Context context) {
        super(context);
        this.f48051e = true;
        this.f48053n = new Path();
        this.C = new Rect();
        this.D = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48050c = frameLayout;
        addView(frameLayout, f6.e(-1, -2, 80));
        z51 z51Var = new z51(this, context, 3);
        this.d = z51Var;
        addView(z51Var, f6.e(-1, -2, 80));
        this.f48049b = new op0(this, context, 11);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f48055s) + AndroidUtilities.dp(9.0f) + this.B;
        if (this.f48054r == round && !z10) {
            return;
        }
        this.f48054r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.D;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f48053n;
        path.rewind();
        float f9 = dp;
        path.addRoundRect(rectF, new float[]{f9, f9, f9, f9, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        lg.b bVar = this.E;
        if (bVar != null && (i10 = bVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.F))) {
            this.E.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f48049b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        m1 m1Var = ((ah.i) this.f48048a).f755r;
        if (m1Var != null) {
            i10 = m1Var.f46843a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((ah.i) this.f48048a).b();
        z51 z51Var = this.d;
        int childCount = z51Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = z51Var.getChildAt(i11);
            if (childAt instanceof ah.a) {
                ah.a aVar = (ah.a) childAt;
                aVar.c(i10);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f48055s = ((ah.i) this.f48048a).c();
        this.v = ((ah.i) this.f48048a).b();
        int i12 = 0;
        boolean z11 = true;
        if (((ah.i) this.f48048a).f756s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48056w = z10;
        z51 z51Var = this.d;
        if (z51Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f48056w;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            z51Var.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z51Var.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((ah.i) this.f48048a).f757w;
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
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), x3.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f48054r;
        int round = Math.round(this.f48057x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f48058y);
        int i10 = this.B;
        Rect rect = this.C;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.G));
        this.f48052f.setBounds(rect);
        if (this.f48051e) {
            this.f48052f.draw(canvas);
        }
        if (this.f48056w) {
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
            canvas.clipPath(this.h.h.f17334k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f48050c.setTranslationY((-this.f48055s) - AndroidUtilities.dp(9.0f));
        z51 z51Var = this.d;
        z51Var.setTranslationY(z51Var.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f48049b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f48055s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.A;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f48050c;
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
        ng.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            ng.d dVar2 = this.f48052f;
            if ((dVar2 != null && dVar2.f17346j == 255 && dVar2.getBounds().contains(x4, y8)) || ((dVar = this.h) != null && dVar.getBounds().contains(x4, y8))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
        }
        if (action == 1 || action == 3) {
            this.H = false;
        }
        return this.H;
    }

    public void setBackgroundWithFadeDrawable(lg.b bVar) {
        this.E = bVar;
    }

    public void setBlurredBottomHeight(float f9) {
        if (this.F != f9) {
            this.F = f9;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        ng.d dVar = this.f48052f;
        if (dVar != null) {
            dVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f9) {
        this.A = f9;
        this.B = Math.round(f9);
        a(false);
    }

    public void setInputBubbleTranslationY(float f9) {
        this.G = f9;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(ng.d dVar) {
        this.f48052f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f48052f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(ng.d dVar) {
        this.h = dVar;
        dVar.f17347k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        ng.d dVar2 = this.h;
        dVar2.h.f17331g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(ah.g gVar) {
        this.f48048a = gVar;
    }
}
