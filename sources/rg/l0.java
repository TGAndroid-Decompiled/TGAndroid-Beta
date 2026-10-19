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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;
import w7.z5;
public final class l0 extends LinearLayout {
    public final TextView f45434a;
    public final k0 f45435b;
    public ImageView f45436c;
    public ImageView d;
    public float e;
    public boolean f45437f;
    public ValueAnimator h;
    public final ImageView f45438n;
    public final m0 f45439r;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.f45439r = m0Var;
        setOrientation(0);
        int i10 = h6.f21078i6;
        fh.a aVar = m0Var.Q1;
        setBackground(h6.g0(h6.w0(i10, aVar), 2, -1));
        k0 k0Var = new k0(this, context);
        this.f45435b = k0Var;
        addView(k0Var, z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f45436c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f45436c;
        int i11 = h6.E8;
        imageView2.setColorFilter(h6.w0(i11, aVar));
        k0Var.addView(this.f45436c, z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(h6.w0(i11, aVar));
        this.d.setVisibility(8);
        k0Var.addView(this.d, z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f45434a = textView;
        textView.setTextColor(h6.w0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f45438n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f21062h7, aVar), PorterDuff.Mode.MULTIPLY));
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
            this.f45437f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ah.k0(12, this, z10));
            this.h.addListener(new tf1(this, 13));
            this.h.setInterpolator(bs.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f45436c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.f45439r;
        org.telegram.ui.ActionBar.m1 m1Var = m0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            m0Var.R1.d(true);
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
        this.f45438n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f45434a.setText(charSequence);
    }
}
