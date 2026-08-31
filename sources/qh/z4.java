package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
import org.telegram.ui.hc1;
public final class z4 extends LinearLayout {
    public final TextView f46383a;
    public final hc1 f46384b;
    public ImageView f46385c;
    public ImageView d;
    public float f46386e;
    public boolean f46387f;
    public ValueAnimator h;
    public final ImageView f46388n;
    public final b5 f46389r;

    public z4(b5 b5Var, Context context) {
        super(context);
        this.f46389r = b5Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.k6.f21750i6;
        q4 q4Var = b5Var.D1;
        setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i10, q4Var), 2, -1));
        hc1 hc1Var = new hc1(this, context);
        this.f46384b = hc1Var;
        addView(hc1Var, k7.c6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f46385c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f46385c;
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, q4Var));
        hc1Var.addView(this.f46385c, k7.c6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, q4Var));
        this.d.setVisibility(8);
        hc1Var.addView(this.d, k7.c6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f46383a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, q4Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, k7.c6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f46388n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h7, q4Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, k7.c6.n(50, -1));
    }

    public final void a(int i10, boolean z4, boolean z10) {
        if (z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i10, false, false);
                return;
            }
            this.f46387f = z4;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new eg.z0(12, this, z4));
            this.h.addListener(new j2(this, 2));
            this.h.setInterpolator(pr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f46385c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        b5 b5Var = this.f46389r;
        org.telegram.ui.ActionBar.p1 p1Var = b5Var.E1;
        if (p1Var != null && p1Var.isShowing()) {
            b5Var.E1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f46388n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f46383a.setText(charSequence);
    }
}
