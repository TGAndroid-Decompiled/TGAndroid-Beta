package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
public final class z3 extends LinearLayout {
    public final TextView f52245a;
    public final ph.k f52246b;
    public ImageView f52247c;
    public ImageView d;
    public float e;
    public boolean f52248f;
    public ValueAnimator h;
    public final ImageView f52249n;
    public final b4 f52250r;

    public z3(b4 b4Var, Context context) {
        super(context);
        this.f52250r = b4Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.x4 x4Var = b4Var.f50981p1;
        setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, x4Var), 2, -1));
        ph.k kVar = new ph.k(this, context);
        this.f52246b = kVar;
        addView(kVar, w7.b6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f52247c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f52247c;
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, x4Var, mode);
        kVar.addView(this.f52247c, w7.b6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(this.d, i11, x4Var, mode);
        this.d.setVisibility(8);
        kVar.addView(this.d, w7.b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f52245a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i11, x4Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.b6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f52249n = imageView4;
        imageView4.setImageResource(2131232397);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView4, org.telegram.ui.ActionBar.t6.f21003h7, x4Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, w7.b6.o(50, -1));
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
            this.f52248f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new jg.o0(12, this, z10));
            this.h.addListener(new sg.r(this, 18));
            this.h.setInterpolator(gr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f52247c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        b4 b4Var = this.f52250r;
        org.telegram.ui.ActionBar.k1 k1Var = b4Var.f50983q1;
        if (k1Var != null && k1Var.isShowing()) {
            b4Var.f50983q1.d(true);
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
        this.f52249n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f52245a.setText(charSequence);
    }
}
