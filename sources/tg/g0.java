package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.k71;
import org.telegram.ui.y61;
public final class g0 extends LinearLayout {
    public final TextView f57856a;
    public final y61 f57857b;
    public ImageView f57858c;
    public ImageView d;
    public float f57859e;
    public boolean f57860f;
    public ValueAnimator h;
    public final ImageView f57861n;
    public final h0 f57862r;

    public g0(h0 h0Var, Context context) {
        super(context);
        this.f57862r = h0Var;
        setOrientation(0);
        int i7 = m6.f29439i6;
        v vVar = h0Var.A1;
        setBackground(m6.h0(m6.w0(i7, vVar), 2, -1));
        y61 y61Var = new y61(this, context);
        this.f57857b = y61Var;
        addView(y61Var, na.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f57858c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f57858c;
        int i10 = m6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        t6.s(imageView2, i10, vVar, mode);
        y61Var.addView(this.f57858c, na.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        t6.s(this.d, i10, vVar, mode);
        this.d.setVisibility(8);
        y61Var.addView(this.d, na.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f57856a = textView;
        t6.U(textView, i10, vVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, na.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f57861n = imageView4;
        imageView4.setImageResource(2131232400);
        imageView4.setScaleType(scaleType);
        t6.s(imageView4, m6.h7, vVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, na.o(50, -1));
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
            this.f57860f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.v(12, this, z10));
            this.h.addListener(new k71(this, 17));
            this.h.setInterpolator(nr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f57858c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        h0 h0Var = this.f57862r;
        org.telegram.ui.ActionBar.g1 g1Var = h0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            h0Var.B1.d(true);
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
        this.f57861n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f57856a.setText(charSequence);
    }
}
