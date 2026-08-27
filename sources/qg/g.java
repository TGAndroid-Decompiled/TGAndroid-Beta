package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y1;
import org.telegram.ui.aj0;
import r0.m1;

public final class g extends FrameLayout {
    public float A;
    public int B;
    public final Rect C;
    public final RectF D;
    public jg.b E;
    public float F;
    public float G;
    public boolean H;

    public yg.g f46538a;

    public final aj0 f46539b;

    public final FrameLayout f46540c;
    public final f d;

    public boolean f46541e;

    public lg.d f46542f;
    public lg.d h;

    public final Path f46543n;

    public int f46544r;

    public float f46545s;
    public float v;

    public boolean f46546w;

    public float f46547x;

    public float f46548y;

    public g(Context context) {
        super(context);
        this.f46541e = true;
        this.f46543n = new Path();
        this.C = new Rect();
        this.D = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46540c = frameLayout;
        addView(frameLayout, z5.e(-1, -2, 80));
        f fVar = new f(this, context, 0);
        this.d = fVar;
        addView(fVar, z5.e(-1, -2, 80));
        this.f46539b = new aj0(this, context, 11);
    }

    public final void a(boolean z10) {
        e();
        int iRound = Math.round(this.f46545s) + AndroidUtilities.dp(9.0f) + this.B;
        if (this.f46544r != iRound || z10) {
            this.f46544r = iRound;
            int iDp = AndroidUtilities.dp(29.0f);
            float measuredHeight = getMeasuredHeight() - this.v;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.D;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.f46543n;
            path.rewind();
            float f10 = iDp;
            path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i10;
        int measuredHeight;
        jg.b bVar = this.E;
        if (bVar == null || (i10 = bVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.F))) {
            return;
        }
        this.E.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.f46539b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        m1 m1Var = ((yg.i) this.f46538a).f50160r;
        int i10 = m1Var != null ? m1Var.f46619a.f(2).d : 0;
        float fB = ((yg.i) this.f46538a).b();
        f fVar = this.d;
        int childCount = fVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = fVar.getChildAt(i11);
            if (childAt instanceof yg.a) {
                yg.a aVar = (yg.a) childAt;
                aVar.a(i10);
                aVar.d(fB);
            }
        }
    }

    public final void d() {
        int radius;
        WindowInsets rootWindowInsets;
        this.f46545s = ((yg.i) this.f46538a).c();
        this.v = ((yg.i) this.f46538a).b();
        int radius2 = 0;
        this.f46546w = ((yg.i) this.f46538a).f50161s != 1;
        f fVar = this.d;
        boolean z10 = fVar.getVisibility() == 0;
        boolean z11 = this.f46546w;
        if (z10 != z11) {
            fVar.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fVar.getLayoutParams();
        int i10 = layoutParams.height;
        int i11 = ((yg.i) this.f46538a).f50162w;
        if (i10 != i11) {
            layoutParams.height = i11;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                radius = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                radius = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    radius2 = roundedCorner2.getRadius();
                }
            }
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius2, radius);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), y1.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f46544r;
        int iRound = Math.round(this.f46547x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f46548y);
        int i10 = this.B;
        Rect rect = this.C;
        rect.set(iRound, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.G));
        this.f46542f.setBounds(rect);
        if (this.f46541e) {
            this.f46542f.draw(canvas);
        }
        if (this.f46546w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.h.f15588k);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public final void e() {
        this.f46540c.setTranslationY((-this.f46545s) - AndroidUtilities.dp(9.0f));
        f fVar = this.d;
        fVar.setTranslationY(fVar.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f46539b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f46545s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.A;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f46540c;
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
        lg.d dVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            lg.d dVar2 = this.f46542f;
            this.H = (dVar2 != null && dVar2.f15600j == 255 && dVar2.getBounds().contains(x8, y10)) || ((dVar = this.h) != null && dVar.getBounds().contains(x8, y10));
        }
        if (action == 1 || action == 3) {
            this.H = false;
        }
        return this.H;
    }

    public void setBackgroundWithFadeDrawable(jg.b bVar) {
        this.E = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        lg.d dVar = this.f46542f;
        if (dVar != null) {
            dVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.A = f10;
        this.B = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(lg.d dVar) {
        this.f46542f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f46542f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(lg.d dVar) {
        this.h = dVar;
        dVar.f15601k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        lg.d dVar2 = this.h;
        dVar2.h.f15585g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(yg.g gVar) {
        this.f46538a = gVar;
    }
}
