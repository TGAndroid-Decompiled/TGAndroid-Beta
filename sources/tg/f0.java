package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.g71;
import org.telegram.ui.w61;
public final class f0 extends LinearLayout {
    public final TextView f57228a;
    public final w61 f57229b;
    public ImageView f57230c;
    public ImageView d;
    public float f57231e;
    public boolean f57232f;
    public ValueAnimator h;
    public final ImageView f57233n;
    public final g0 f57234r;

    public f0(g0 g0Var, Context context) {
        super(context);
        this.f57234r = g0Var;
        setOrientation(0);
        int i7 = j6.f28941i6;
        u uVar = g0Var.A1;
        setBackground(j6.h0(j6.w0(i7, uVar), 2, -1));
        w61 w61Var = new w61(this, context);
        this.f57229b = w61Var;
        addView(w61Var, ja.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f57230c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f57230c;
        int i10 = j6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        q6.s(imageView2, i10, uVar, mode);
        w61Var.addView(this.f57230c, ja.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        q6.s(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        w61Var.addView(this.d, ja.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f57228a = textView;
        q6.U(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ja.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f57233n = imageView4;
        imageView4.setImageResource(2131232399);
        imageView4.setScaleType(scaleType);
        q6.s(imageView4, j6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ja.o(50, -1));
    }

    public final void a(int i7, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i7, false, false);
                return;
            }
            this.f57232f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.u(12, this, z10));
            this.h.addListener(new g71(this, 17));
            this.h.setInterpolator(er.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f57230c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        g0 g0Var = this.f57234r;
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.B1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f57233n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f57228a.setText(charSequence);
    }
}
