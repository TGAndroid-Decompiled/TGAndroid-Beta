package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.zb1;

public final class k0 extends LinearLayout {

    public final TextView f50476a;

    public final vf.g f50477b;

    public ImageView f50478c;
    public ImageView d;

    public float f50479e;

    public boolean f50480f;
    public ValueAnimator h;

    public final ImageView f50481n;

    public final l0 f50482r;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f50482r = l0Var;
        setOrientation(0);
        int i10 = g6.f23144i6;
        ng.b bVar = l0Var.M1;
        setBackground(g6.f0(g6.v0(i10, bVar), 2, -1));
        vf.g gVar = new vf.g(this, context);
        this.f50477b = gVar;
        addView(gVar, z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f50478c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f50478c;
        int i11 = g6.E8;
        imageView2.setColorFilter(g6.v0(i11, bVar));
        gVar.addView(this.f50478c, z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(g6.v0(i11, bVar));
        this.d.setVisibility(8);
        gVar.addView(this.d, z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f50476a = textView;
        textView.setTextColor(g6.v0(i11, bVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f50481n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23126h7, bVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, z5.n(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (!z11) {
            this.f50478c.setImageResource(i10);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i10, false, false);
            return;
        }
        this.f50480f = z10;
        this.d.setImageResource(i10);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(12, this, z10));
        this.h.addListener(new zb1(this, 12));
        this.h.setInterpolator(er.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        l0 l0Var = this.f50482r;
        org.telegram.ui.ActionBar.n1 n1Var = l0Var.N1;
        if (n1Var != null && n1Var.isShowing()) {
            l0Var.N1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        this.f50481n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.f50476a.setText(charSequence);
    }
}
