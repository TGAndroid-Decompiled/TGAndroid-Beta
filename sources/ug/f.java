package ug;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.gw0;
import ph.q9;
import r0.m1;
public final class f extends FrameLayout {
    public float B;
    public int C;
    public final Rect D;
    public final RectF E;
    public ng.b F;
    public float G;
    public float H;
    public boolean I;
    public ch.g f45518a;
    public final gw0 f45519b;
    public final FrameLayout f45520c;
    public final q9 d;
    public boolean e;
    public pg.b f45521f;
    public pg.b h;
    public final Path f45522n;
    public int f45523r;
    public float f45524s;
    public float v;
    public boolean f45525w;
    public float f45526x;
    public float f45527y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.f45522n = new Path();
        this.D = new Rect();
        this.E = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45520c = frameLayout;
        addView(frameLayout, b6.e(-1, -2, 80));
        q9 q9Var = new q9(this, context, 3);
        this.d = q9Var;
        addView(q9Var, b6.e(-1, -2, 80));
        this.f45519b = new gw0(this, context, 11);
    }

    public final void a(boolean z4) {
        e();
        int round = Math.round(this.f45524s) + AndroidUtilities.dp(9.0f) + this.C;
        if (this.f45523r == round && !z4) {
            return;
        }
        this.f45523r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.E;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f45522n;
        path.rewind();
        float f10 = dp;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        ng.b bVar = this.F;
        if (bVar != null && (i10 = bVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.G))) {
            this.F.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f45519b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        m1 m1Var = ((ch.i) this.f45518a).f2611r;
        if (m1Var != null) {
            i10 = m1Var.f43130a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((ch.i) this.f45518a).b();
        q9 q9Var = this.d;
        int childCount = q9Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = q9Var.getChildAt(i11);
            if (childAt instanceof ch.a) {
                ch.a aVar = (ch.a) childAt;
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
        this.f45524s = ((ch.i) this.f45518a).c();
        this.v = ((ch.i) this.f45518a).b();
        int i12 = 0;
        boolean z10 = true;
        if (((ch.i) this.f45518a).f2612s != 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45525w = z4;
        q9 q9Var = this.d;
        if (q9Var.getVisibility() != 0) {
            z10 = false;
        }
        boolean z11 = this.f45525w;
        if (z10 != z11) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            q9Var.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q9Var.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((ch.i) this.f45518a).f2613w;
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
        int measuredHeight = getMeasuredHeight() - this.f45523r;
        int round = Math.round(this.f45526x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f45527y);
        int i10 = this.C;
        Rect rect = this.D;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.H));
        this.f45521f.setBounds(rect);
        if (this.e) {
            this.f45521f.draw(canvas);
        }
        if (this.f45525w) {
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
            canvas.clipPath(this.h.h.f41210k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f45520c.setTranslationY((-this.f45524s) - AndroidUtilities.dp(9.0f));
        q9 q9Var = this.d;
        q9Var.setTranslationY(q9Var.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f45519b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f45524s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.B;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f45520c;
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
        pg.b bVar;
        boolean z4;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            pg.b bVar2 = this.f45521f;
            if ((bVar2 != null && bVar2.f41221j == 255 && bVar2.getBounds().contains(x10, y10)) || ((bVar = this.h) != null && bVar.getBounds().contains(x10, y10))) {
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

    public void setBackgroundWithFadeDrawable(ng.b bVar) {
        this.F = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.G != f10) {
            this.G = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        pg.b bVar = this.f45521f;
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

    public void setInputIslandBubbleDrawable(pg.b bVar) {
        this.f45521f = bVar;
        bVar.o(AndroidUtilities.dp(7.0f));
        this.f45521f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(pg.b bVar) {
        this.h = bVar;
        bVar.f41222k = true;
        bVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        pg.b bVar2 = this.h;
        bVar2.h.f41207g = 0.4f;
        bVar2.j();
    }

    public void setWindowInsetsProvider(ch.g gVar) {
        this.f45518a = gVar;
    }
}
