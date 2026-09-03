package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;
public final class a5 extends LinearLayout {
    public final TextView f41299a;
    public final z4 f41300b;
    public ImageView f41301c;
    public ImageView d;
    public float e;
    public boolean f41302f;
    public ValueAnimator h;
    public final ImageView f41303n;
    public final c5 f41304r;

    public a5(c5 c5Var, Context context) {
        super(context);
        this.f41304r = c5Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.j6.f19971i6;
        q4 q4Var = c5Var.D1;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 2, -1));
        z4 z4Var = new z4(this, context);
        this.f41300b = z4Var;
        addView(z4Var, k7.b6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f41301c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f41301c;
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, q4Var));
        z4Var.addView(this.f41301c, k7.b6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, q4Var));
        this.d.setVisibility(8);
        z4Var.addView(this.d, k7.b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f41299a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, q4Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, k7.b6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f41303n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19954h7, q4Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, k7.b6.n(50, -1));
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
            this.f41302f = z4;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new dg.b1(12, this, z4));
            this.h.addListener(new j2(this, 2));
            this.h.setInterpolator(mr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f41301c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        c5 c5Var = this.f41304r;
        org.telegram.ui.ActionBar.p1 p1Var = c5Var.E1;
        if (p1Var != null && p1Var.isShowing()) {
            c5Var.E1.d(true);
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
        this.f41303n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f41299a.setText(charSequence);
    }
}
