package pg;

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
import fh.d2;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.ui.yi0;
import r0.m1;
public final class f extends FrameLayout {
    public float A;
    public int B;
    public final Rect C;
    public final RectF D;
    public ig.b E;
    public float F;
    public float G;
    public boolean H;
    public xg.g f45868a;
    public final yi0 f45869b;
    public final FrameLayout f45870c;
    public final d2 d;
    public boolean f45871e;
    public kg.d f45872f;
    public kg.d h;
    public final Path f45873n;
    public int f45874r;
    public float f45875s;
    public float v;
    public boolean f45876w;
    public float f45877x;
    public float f45878y;

    public f(Context context) {
        super(context);
        this.f45871e = true;
        this.f45873n = new Path();
        this.C = new Rect();
        this.D = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45870c = frameLayout;
        addView(frameLayout, e6.e(-1, -2, 80));
        d2 d2Var = new d2(this, context, 27);
        this.d = d2Var;
        addView(d2Var, e6.e(-1, -2, 80));
        this.f45869b = new yi0(this, context, 10);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f45875s) + AndroidUtilities.dp(9.0f) + this.B;
        if (this.f45874r == round && !z10) {
            return;
        }
        this.f45874r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.D;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f45873n;
        path.rewind();
        float f10 = dp;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i9;
        int measuredHeight;
        ig.b bVar = this.E;
        if (bVar != null && (i9 = bVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.F))) {
            this.E.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f45869b.invalidate(0, Math.max(0, Math.min(i9, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i9, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i9;
        m1 m1Var = ((xg.i) this.f45868a).f49447r;
        if (m1Var != null) {
            i9 = m1Var.f46929a.f(2).d;
        } else {
            i9 = 0;
        }
        float b10 = ((xg.i) this.f45868a).b();
        d2 d2Var = this.d;
        int childCount = d2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = d2Var.getChildAt(i10);
            if (childAt instanceof xg.a) {
                xg.a aVar = (xg.a) childAt;
                aVar.a(i9);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i9;
        WindowInsets rootWindowInsets;
        int i10;
        this.f45875s = ((xg.i) this.f45868a).c();
        this.v = ((xg.i) this.f45868a).b();
        int i11 = 0;
        boolean z11 = true;
        if (((xg.i) this.f45868a).f49448s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45876w = z10;
        d2 d2Var = this.d;
        if (d2Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f45876w;
        if (z11 != z12) {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d2Var.setVisibility(i10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((xg.i) this.f45868a).f49449w;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                if (roundedCorner == null) {
                    i9 = 0;
                } else {
                    i9 = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i11 = roundedCorner2.getRadius();
                }
            } else {
                i9 = 0;
            }
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i11, i9);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), l0.z(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f45874r;
        int round = Math.round(this.f45877x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f45878y);
        int i9 = this.B;
        Rect rect = this.C;
        rect.set(round, 0, measuredWidth, i9);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.G));
        this.f45872f.setBounds(rect);
        if (this.f45871e) {
            this.f45872f.draw(canvas);
        }
        if (this.f45876w) {
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
            canvas.clipPath(this.h.h.f14810k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f45870c.setTranslationY((-this.f45875s) - AndroidUtilities.dp(9.0f));
        d2 d2Var = this.d;
        d2Var.setTranslationY(d2Var.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f45869b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f45875s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.A;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f45870c;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kg.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            kg.d dVar2 = this.f45872f;
            if ((dVar2 != null && dVar2.f14822j == 255 && dVar2.getBounds().contains(x10, y10)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y10))) {
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

    public void setBackgroundWithFadeDrawable(ig.b bVar) {
        this.E = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i9) {
        kg.d dVar = this.f45872f;
        if (dVar != null) {
            dVar.setAlpha(i9);
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

    public void setInputIslandBubbleDrawable(kg.d dVar) {
        this.f45872f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f45872f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(kg.d dVar) {
        this.h = dVar;
        dVar.f14823k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        kg.d dVar2 = this.h;
        dVar2.h.f14807g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(xg.g gVar) {
        this.f45868a = gVar;
    }
}
