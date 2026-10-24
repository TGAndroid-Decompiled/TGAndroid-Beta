package rg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ue1;
import w7.z5;
public final class l0 extends LinearLayout {
    public final TextView f45855a;
    public final ah.v f45856b;
    public ImageView f45857c;
    public ImageView d;
    public float e;
    public boolean f45858f;
    public ValueAnimator h;
    public final ImageView f45859n;
    public final m0 f45860r;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.f45860r = m0Var;
        setOrientation(0);
        int i10 = k6.f21273i6;
        u uVar = m0Var.Q1;
        setBackground(k6.g0(k6.w0(i10, uVar), 2, -1));
        ah.v vVar = new ah.v(this, context);
        this.f45856b = vVar;
        addView(vVar, z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f45857c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f45857c;
        int i11 = k6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView2, i11, uVar, mode);
        vVar.addView(this.f45857c, z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        r6.t(this.d, i11, uVar, mode);
        this.d.setVisibility(8);
        vVar.addView(this.d, z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f45855a = textView;
        r6.W(textView, i11, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f45859n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, k6.f21257h7, uVar, PorterDuff.Mode.MULTIPLY);
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
            this.f45858f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ah.k0(12, this, z10));
            this.h.addListener(new ue1(this, 14));
            this.h.setInterpolator(zr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f45857c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.f45860r;
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
        this.f45859n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f45855a.setText(charSequence);
    }
}
