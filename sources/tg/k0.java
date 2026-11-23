package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.i71;
import org.telegram.ui.w61;
public final class k0 extends LinearLayout {
    public final TextView f58011a;
    public final w61 f58012b;
    public ImageView f58013c;
    public ImageView d;
    public float f58014e;
    public boolean f58015f;
    public ValueAnimator h;
    public final ImageView f58016n;
    public final l0 f58017r;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f58017r = l0Var;
        setOrientation(0);
        int i7 = n6.f29543i6;
        p pVar = l0Var.A1;
        setBackground(n6.h0(n6.w0(i7, pVar), 2, -1));
        w61 w61Var = new w61(this, context);
        this.f58012b = w61Var;
        addView(w61Var, na.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f58013c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f58013c;
        int i10 = n6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        u6.s(imageView2, i10, pVar, mode);
        w61Var.addView(this.f58013c, na.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        u6.s(this.d, i10, pVar, mode);
        this.d.setVisibility(8);
        w61Var.addView(this.d, na.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f58011a = textView;
        u6.U(textView, i10, pVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, na.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f58016n = imageView4;
        imageView4.setImageResource(2131232403);
        imageView4.setScaleType(scaleType);
        u6.s(imageView4, n6.h7, pVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, na.o(50, -1));
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
            this.f58015f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.v(12, this, z10));
            this.h.addListener(new i71(this, 17));
            this.h.setInterpolator(kr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f58013c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        l0 l0Var = this.f58017r;
        org.telegram.ui.ActionBar.g1 g1Var = l0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            l0Var.B1.d(true);
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
        this.f58016n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f58011a.setText(charSequence);
    }
}
