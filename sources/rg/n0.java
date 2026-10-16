package rg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.fi1;
import w7.z5;
public final class n0 extends LinearLayout {
    public final TextView f44130a;
    public final m0 f44131b;
    public ImageView f44132c;
    public ImageView d;
    public float e;
    public boolean f44133f;
    public ValueAnimator h;
    public final ImageView f44134n;
    public final o0 f44135r;

    public n0(o0 o0Var, Context context) {
        super(context);
        this.f44135r = o0Var;
        setOrientation(0);
        int i10 = g6.f19690i6;
        fh.a aVar = o0Var.Q1;
        setBackground(g6.g0(g6.w0(i10, aVar), 2, -1));
        m0 m0Var = new m0(this, context);
        this.f44131b = m0Var;
        addView(m0Var, z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f44132c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f44132c;
        int i11 = g6.E8;
        imageView2.setColorFilter(g6.w0(i11, aVar));
        m0Var.addView(this.f44132c, z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(g6.w0(i11, aVar));
        this.d.setVisibility(8);
        m0Var.addView(this.d, z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f44130a = textView;
        textView.setTextColor(g6.w0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f44134n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.f19674h7, aVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, z5.n(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i10, false, false);
                return;
            }
            this.f44133f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ah.k0(12, this, z10));
            this.h.addListener(new fi1(this, 11));
            this.h.setInterpolator(es.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f44132c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        o0 o0Var = this.f44135r;
        org.telegram.ui.ActionBar.m1 m1Var = o0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            o0Var.R1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f44134n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f44130a.setText(charSequence);
    }
}
