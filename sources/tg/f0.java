package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;
public final class f0 extends LinearLayout {
    public final TextView f55664a;
    public final pg.h f55665b;
    public ImageView f55666c;
    public ImageView d;
    public float f55667e;
    public boolean f55668f;
    public ValueAnimator h;
    public final ImageView f55669n;
    public final g0 f55670r;

    public f0(g0 g0Var, Context context) {
        super(context);
        this.f55670r = g0Var;
        setOrientation(0);
        int i7 = l6.f27957i6;
        u uVar = g0Var.f55717z1;
        setBackground(l6.h0(l6.w0(i7, uVar), 2, -1));
        pg.h hVar = new pg.h(this, context);
        this.f55665b = hVar;
        addView(hVar, ha.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f55666c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f55666c;
        int i10 = l6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        s6.s(imageView2, i10, uVar, mode);
        hVar.addView(this.f55666c, ha.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        s6.s(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        hVar.addView(this.d, ha.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f55664a = textView;
        s6.U(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f55669n = imageView4;
        imageView4.setImageResource(2131232398);
        imageView4.setScaleType(scaleType);
        s6.s(imageView4, l6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ha.o(50, -1));
    }

    public final void a(int i7, boolean z9, boolean z10) {
        if (z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i7, false, false);
                return;
            }
            this.f55668f = z9;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.u(12, this, z9));
            this.h.addListener(new t81(this, 15));
            this.h.setInterpolator(xq.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f55666c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        g0 g0Var = this.f55670r;
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.A1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.A1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override
    public void setSelected(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f55669n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f55664a.setText(charSequence);
    }
}
