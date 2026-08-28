package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.te1;
public final class k0 extends LinearLayout {
    public final TextView f49897a;
    public final vg.c f49898b;
    public ImageView f49899c;
    public ImageView d;
    public float f49900e;
    public boolean f49901f;
    public ValueAnimator h;
    public final ImageView f49902n;
    public final l0 f49903r;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f49903r = l0Var;
        setOrientation(0);
        int i9 = f6.f23092i6;
        mg.a aVar = l0Var.M1;
        setBackground(f6.f0(f6.v0(i9, aVar), 2, -1));
        vg.c cVar = new vg.c(this, context);
        this.f49898b = cVar;
        addView(cVar, e6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f49899c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f49899c;
        int i10 = f6.E8;
        imageView2.setColorFilter(f6.v0(i10, aVar));
        cVar.addView(this.f49899c, e6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(f6.v0(i10, aVar));
        this.d.setVisibility(8);
        cVar.addView(this.d, e6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f49897a = textView;
        textView.setTextColor(f6.v0(i10, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, e6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f49902n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23074h7, aVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, e6.n(50, -1));
    }

    public final void a(int i9, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i9, false, false);
                return;
            }
            this.f49901f = z10;
            this.d.setImageResource(i9);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new hg.y(12, this, z10));
            this.h.addListener(new te1(this, 10));
            this.h.setInterpolator(gr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f49899c.setImageResource(i9);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        l0 l0Var = this.f49903r;
        org.telegram.ui.ActionBar.o1 o1Var = l0Var.N1;
        if (o1Var != null && o1Var.isShowing()) {
            l0Var.N1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i9) {
        a(i9, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f49902n.setVisibility(i9);
    }

    public void setText(CharSequence charSequence) {
        this.f49897a.setText(charSequence);
    }
}
