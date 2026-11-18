package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.k71;
import org.telegram.ui.y61;
public final class f0 extends LinearLayout {
    public final TextView f57831a;
    public final y61 f57832b;
    public ImageView f57833c;
    public ImageView d;
    public float f57834e;
    public boolean f57835f;
    public ValueAnimator h;
    public final ImageView f57836n;
    public final g0 f57837r;

    public f0(g0 g0Var, Context context) {
        super(context);
        this.f57837r = g0Var;
        setOrientation(0);
        int i7 = n6.f29486i6;
        u uVar = g0Var.A1;
        setBackground(n6.h0(n6.w0(i7, uVar), 2, -1));
        y61 y61Var = new y61(this, context);
        this.f57832b = y61Var;
        addView(y61Var, ma.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f57833c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f57833c;
        int i10 = n6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        u6.s(imageView2, i10, uVar, mode);
        y61Var.addView(this.f57833c, ma.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        u6.s(this.d, i10, uVar, mode);
        this.d.setVisibility(8);
        y61Var.addView(this.d, ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f57831a = textView;
        u6.U(textView, i10, uVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, ma.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f57836n = imageView4;
        imageView4.setImageResource(2131232400);
        imageView4.setScaleType(scaleType);
        u6.s(imageView4, n6.h7, uVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, ma.o(50, -1));
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
            this.f57835f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.v(12, this, z10));
            this.h.addListener(new k71(this, 17));
            this.h.setInterpolator(lr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f57833c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        g0 g0Var = this.f57837r;
        org.telegram.ui.ActionBar.h1 h1Var = g0Var.B1;
        if (h1Var != null && h1Var.isShowing()) {
            g0Var.B1.d(true);
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
        this.f57836n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f57831a.setText(charSequence);
    }
}
