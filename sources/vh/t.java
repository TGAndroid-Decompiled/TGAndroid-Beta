package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.vg0;
public final class t extends FrameLayout {
    public final org.telegram.ui.g3 f51958a;
    public r f51959b;
    public r20 f51960c;
    public float d;
    public boolean e;
    public ValueAnimator f51961f;

    public t(Activity activity, z1 z1Var) {
        super(activity);
        org.telegram.ui.g3 g3Var = new org.telegram.ui.g3(this, activity);
        this.f51958a = g3Var;
        g3Var.setAdapter(new vg0(this, activity, z1Var, 1));
        g3Var.setLayoutManager(new s4.a0(0, false));
        g3Var.setClipToPadding(false);
        g3Var.setVisibility(8);
        g3Var.setWillNotDraw(false);
        g3Var.setOnItemClickListener(new ag.y0(this, 18));
        addView(g3Var, w7.b6.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f51961f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        org.telegram.ui.g3 g3Var = this.f51958a;
        if (z11) {
            g3Var.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f51961f = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 25));
            this.f51961f.addListener(new sg.y(9, this, z10));
            this.f51961f.setInterpolator(gr.h);
            this.f51961f.setDuration(340L);
            this.f51961f.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.d = f7;
        g3Var.invalidate();
        if (!z10) {
            i10 = 8;
        }
        g3Var.setVisibility(i10);
    }

    public void setOnLayoutClick(r20 r20Var) {
        this.f51960c = r20Var;
    }

    public void setSelected(r rVar) {
        this.f51959b = rVar;
        org.telegram.messenger.i0.a4(this.f51958a);
    }
}
