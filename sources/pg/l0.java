package pg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.m7;
import bi.n7;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.mv0;
import w7.a6;
public final class l0 extends LinearLayout {
    public final TextView f40094a;
    public final n7 f40095b;
    public ImageView f40096c;
    public ImageView d;
    public float e;
    public boolean f40097f;
    public ValueAnimator h;
    public final ImageView f40098n;
    public final m0 f40099r;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.f40099r = m0Var;
        setOrientation(0);
        int i10 = j6.f18017i6;
        dh.b bVar = m0Var.Q1;
        setBackground(j6.f0(j6.v0(i10, bVar), 2, -1));
        n7 n7Var = new n7(this, context);
        this.f40095b = n7Var;
        addView(n7Var, a6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f40096c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f40096c;
        int i11 = j6.E8;
        imageView2.setColorFilter(j6.v0(i11, bVar));
        n7Var.addView(this.f40096c, a6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(j6.v0(i11, bVar));
        this.d.setVisibility(8);
        n7Var.addView(this.d, a6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f40094a = textView;
        textView.setTextColor(j6.v0(i11, bVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, a6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f40098n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f18000h7, bVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, a6.n(50, -1));
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
            this.f40097f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new m7(10, this, z10));
            this.h.addListener(new mv0(this, 19));
            this.h.setInterpolator(wr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f40096c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.f40099r;
        org.telegram.ui.ActionBar.p1 p1Var = m0Var.R1;
        if (p1Var != null && p1Var.isShowing()) {
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
        this.f40098n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f40094a.setText(charSequence);
    }
}
