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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
import w7.y5;
public final class m0 extends LinearLayout {
    public final TextView f41756a;
    public final m6 f41757b;
    public ImageView f41758c;
    public ImageView d;
    public float e;
    public boolean f41759f;
    public ValueAnimator h;
    public final ImageView f41760n;
    public final n0 f41761r;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.f41761r = n0Var;
        setOrientation(0);
        int i10 = h6.f19148i6;
        eh.a aVar = n0Var.Q1;
        setBackground(h6.f0(h6.v0(i10, aVar), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f41757b = m6Var;
        addView(m6Var, y5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f41758c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f41758c;
        int i11 = h6.E8;
        imageView2.setColorFilter(h6.v0(i11, aVar));
        m6Var.addView(this.f41758c, y5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(h6.v0(i11, aVar));
        this.d.setVisibility(8);
        m6Var.addView(this.d, y5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f41756a = textView;
        textView.setTextColor(h6.v0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, y5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f41760n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.f19131h7, aVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, y5.n(50, -1));
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
            this.f41759f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bb(11, this, z10));
            this.h.addListener(new pg.d0(this, 1));
            this.h.setInterpolator(rr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f41758c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        n0 n0Var = this.f41761r;
        org.telegram.ui.ActionBar.m1 m1Var = n0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            n0Var.R1.d(true);
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
        this.f41760n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f41756a.setText(charSequence);
    }
}
