package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.fc1;
public final class m0 extends LinearLayout {
    public final TextView f48305a;
    public final bh.p f48306b;
    public ImageView f48307c;
    public ImageView d;
    public float e;
    public boolean f48308f;
    public ValueAnimator h;
    public final ImageView f48309n;
    public final n0 f48310r;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.f48310r = n0Var;
        setOrientation(0);
        int i10 = y6.f23448i6;
        v vVar = n0Var.F1;
        setBackground(y6.g0(y6.w0(i10, vVar), 2, -1));
        bh.p pVar = new bh.p(this, context);
        this.f48306b = pVar;
        addView(pVar, gb1.x(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f48307c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f48307c;
        int i11 = y6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f7.t(imageView2, i11, vVar, mode);
        pVar.addView(this.f48307c, gb1.i(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        f7.t(this.d, i11, vVar, mode);
        this.d.setVisibility(8);
        pVar.addView(this.d, gb1.i(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f48305a = textView;
        f7.V(textView, i11, vVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, gb1.x(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f48309n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        f7.t(imageView4, y6.f23429h7, vVar, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, gb1.r(50, -1));
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
            this.f48308f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bh.a0(12, this, z10));
            this.h.addListener(new fc1(this, 16));
            this.h.setInterpolator(ds.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f48307c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        n0 n0Var = this.f48310r;
        org.telegram.ui.ActionBar.o1 o1Var = n0Var.G1;
        if (o1Var != null && o1Var.isShowing()) {
            n0Var.G1.d(true);
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
        this.f48309n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f48305a.setText(charSequence);
    }
}
