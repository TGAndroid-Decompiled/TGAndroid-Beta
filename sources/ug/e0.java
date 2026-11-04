package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
import org.telegram.ui.n61;
public final class e0 extends LinearLayout {
    public final TextView f55951a;
    public final n61 f55952b;
    public ImageView f55953c;
    public ImageView d;
    public float f55954e;
    public boolean f55955f;
    public ValueAnimator h;
    public final ImageView f55956n;
    public final f0 f55957r;

    public e0(f0 f0Var, Context context) {
        super(context);
        this.f55957r = f0Var;
        setOrientation(0);
        int i3 = k6.f27972i6;
        u uVar = f0Var.A1;
        setBackground(k6.h0(k6.w0(i3, uVar), 2, -1));
        n61 n61Var = new n61(this, context);
        this.f55952b = n61Var;
        addView(n61Var, mf.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f55953c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f55953c;
        int i10 = k6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView2, i10, uVar, mode);
        n61Var.addView(this.f55953c, mf.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        r6.t(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        n61Var.addView(this.d, mf.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f55951a = textView;
        r6.V(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f55956n = imageView4;
        imageView4.setImageResource(2131232398);
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, k6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, mf.o(50, -1));
    }

    public final void a(int i3, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i3, false, false);
                return;
            }
            this.f55955f = z10;
            this.d.setImageResource(i3);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new dh.u(12, this, z10));
            this.h.addListener(new i81(this, 16));
            this.h.setInterpolator(xq.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f55953c.setImageResource(i3);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        f0 f0Var = this.f55957r;
        org.telegram.ui.ActionBar.f1 f1Var = f0Var.B1;
        if (f1Var != null && f1Var.isShowing()) {
            f0Var.B1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i3) {
        a(i3, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f55956n.setVisibility(i3);
    }

    public void setText(CharSequence charSequence) {
        this.f55951a.setText(charSequence);
    }
}
