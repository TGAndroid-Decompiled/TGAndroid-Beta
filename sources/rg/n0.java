package rg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.oj1;
import w7.x5;
public final class n0 extends LinearLayout {
    public final TextView f45322a;
    public final ah.w f45323b;
    public ImageView f45324c;
    public ImageView d;
    public float f45325e;
    public boolean f45326f;
    public ValueAnimator h;
    public final ImageView f45327n;
    public final o0 f45328r;

    public n0(o0 o0Var, Context context) {
        super(context);
        this.f45328r = o0Var;
        setOrientation(0);
        int i10 = j6.f20753i6;
        fh.a aVar = o0Var.Q1;
        setBackground(j6.f0(j6.v0(i10, aVar), 2, -1));
        ah.w wVar = new ah.w(this, context);
        this.f45323b = wVar;
        addView(wVar, x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f45324c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f45324c;
        int i11 = j6.E8;
        imageView2.setColorFilter(j6.v0(i11, aVar));
        wVar.addView(this.f45324c, x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(j6.v0(i11, aVar));
        this.d.setVisibility(8);
        wVar.addView(this.d, x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f45322a = textView;
        textView.setTextColor(j6.v0(i11, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f45327n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20736h7, aVar), PorterDuff.Mode.MULTIPLY));
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
            this.f45326f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(12, this, z10));
            this.h.addListener(new oj1(this, 4));
            this.h.setInterpolator(pr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f45324c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        o0 o0Var = this.f45328r;
        org.telegram.ui.ActionBar.n1 n1Var = o0Var.R1;
        if (n1Var != null && n1Var.isShowing()) {
            o0Var.R1.d(true);
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
        this.f45327n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f45322a.setText(charSequence);
    }
}
