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
import w7.x5;
public final class o0 extends LinearLayout {
    public final TextView f41452a;
    public final m6 f41453b;
    public ImageView f41454c;
    public ImageView d;
    public float e;
    public boolean f41455f;
    public ValueAnimator h;
    public final ImageView f41456n;
    public final p0 f41457r;

    public o0(p0 p0Var, Context context) {
        super(context);
        this.f41457r = p0Var;
        setOrientation(0);
        int i10 = h6.f18878i6;
        eh.a aVar = p0Var.Q1;
        setBackground(h6.f0(h6.v0(i10, aVar), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f41453b = m6Var;
        addView(m6Var, x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f41454c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f41454c;
        int i11 = h6.E8;
        imageView2.setColorFilter(h6.v0(i11, aVar));
        m6Var.addView(this.f41454c, x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(h6.v0(i11, aVar));
        this.d.setVisibility(8);
        m6Var.addView(this.d, x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f41452a = textView;
        textView.setTextColor(h6.v0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f41456n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.f18861h7, aVar), PorterDuff.Mode.MULTIPLY));
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
            this.f41455f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bb(11, this, z10));
            this.h.addListener(new n0(this, 0));
            this.h.setInterpolator(rr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f41454c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        p0 p0Var = this.f41457r;
        org.telegram.ui.ActionBar.n1 n1Var = p0Var.R1;
        if (n1Var != null && n1Var.isShowing()) {
            p0Var.R1.d(true);
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
        this.f41456n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f41452a.setText(charSequence);
    }
}
