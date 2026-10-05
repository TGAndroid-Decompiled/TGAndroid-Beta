package qg;

import ai.bb;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import w7.z5;
public final class l0 extends LinearLayout {
    public final TextView f45139a;
    public final m6 f45140b;
    public ImageView f45141c;
    public ImageView d;
    public float f45142e;
    public boolean f45143f;
    public ValueAnimator h;
    public final ImageView f45144n;
    public final m0 f45145r;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.f45145r = m0Var;
        setOrientation(0);
        int i10 = i6.f20918i6;
        eh.a aVar = m0Var.Q1;
        setBackground(i6.f0(i6.v0(i10, aVar), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f45140b = m6Var;
        addView(m6Var, z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f45141c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f45141c;
        int i11 = i6.E8;
        imageView2.setColorFilter(i6.v0(i11, aVar));
        m6Var.addView(this.f45141c, z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(i6.v0(i11, aVar));
        this.d.setVisibility(8);
        m6Var.addView(this.d, z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f45139a = textView;
        textView.setTextColor(i6.v0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f45144n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f20901h7, aVar), PorterDuff.Mode.MULTIPLY));
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
            this.f45143f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bb(11, this, z10));
            this.h.addListener(new pg.d0(this, 1));
            this.h.setInterpolator(tr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f45141c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.f45145r;
        org.telegram.ui.ActionBar.n1 n1Var = m0Var.R1;
        if (n1Var != null && n1Var.isShowing()) {
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
        this.f45144n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f45139a.setText(charSequence);
    }
}
