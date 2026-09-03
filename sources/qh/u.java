package qh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.vd1;
public final class u extends FrameLayout {
    public final org.telegram.ui.k3 f46149a;
    public r f46150b;
    public Utilities.Callback f46151c;
    public float d;
    public boolean f46152e;
    public ValueAnimator f46153f;

    public u(Activity activity, c2 c2Var) {
        super(activity);
        org.telegram.ui.k3 k3Var = new org.telegram.ui.k3(this, activity);
        this.f46149a = k3Var;
        k3Var.setAdapter(new s(this, activity, c2Var));
        k3Var.setLayoutManager(new f2.j0(0, false));
        k3Var.setClipToPadding(false);
        k3Var.setVisibility(8);
        k3Var.setWillNotDraw(false);
        k3Var.setOnItemClickListener(new ag.h(this, 14));
        addView(k3Var, k7.c6.c(56.0f, -1));
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f46153f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f46152e == z4) {
            return;
        }
        this.f46152e = z4;
        int i10 = 8;
        float f10 = 0.0f;
        org.telegram.ui.k3 k3Var = this.f46149a;
        if (z10) {
            k3Var.setVisibility(0);
            float f11 = this.d;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f46153f = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 13));
            this.f46153f.addListener(new vd1(8, this, z4));
            this.f46153f.setInterpolator(pr.h);
            this.f46153f.setDuration(340L);
            this.f46153f.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.d = f10;
        k3Var.invalidate();
        if (z4) {
            i10 = 0;
        }
        k3Var.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<r> callback) {
        this.f46151c = callback;
    }

    public void setSelected(r rVar) {
        this.f46150b = rVar;
        AndroidUtilities.updateVisibleRows(this.f46149a);
    }
}
