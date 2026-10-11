package qg;

import ai.cb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.m6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Wallet.z4;
import w7.x5;
public final class l0 extends LinearLayout {
    public final TextView f46458a;
    public final m6 f46459b;
    public ImageView f46460c;
    public ImageView d;
    public float f46461e;
    public boolean f46462f;
    public ValueAnimator h;
    public final ImageView f46463n;
    public final m0 f46464r;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.f46464r = m0Var;
        setOrientation(0);
        int i10 = h6.f20913i6;
        eh.a aVar = m0Var.Q1;
        setBackground(h6.g0(h6.w0(i10, aVar), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f46459b = m6Var;
        addView(m6Var, x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f46460c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f46460c;
        int i11 = h6.E8;
        imageView2.setColorFilter(h6.w0(i11, aVar));
        m6Var.addView(this.f46460c, x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(h6.w0(i11, aVar));
        this.d.setVisibility(8);
        m6Var.addView(this.d, x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f46458a = textView;
        textView.setTextColor(h6.w0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f46463n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20895h7, aVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, x5.n(50, -1));
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
            this.f46462f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new cb(11, this, z10));
            this.h.addListener(new z4(this, 8));
            this.h.setInterpolator(is.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f46460c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.f46464r;
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
        this.f46463n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f46458a.setText(charSequence);
    }
}
