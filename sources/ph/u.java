package ph;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.l61;
public final class u extends FrameLayout {
    public final org.telegram.ui.k3 f42375a;
    public r f42376b;
    public Utilities.Callback f42377c;
    public float d;
    public boolean e;
    public ValueAnimator f42378f;

    public u(Activity activity, d2 d2Var) {
        super(activity);
        org.telegram.ui.k3 k3Var = new org.telegram.ui.k3(this, activity);
        this.f42375a = k3Var;
        k3Var.setAdapter(new s(this, activity, d2Var));
        k3Var.setLayoutManager(new f2.i0(0, false));
        k3Var.setClipToPadding(false);
        k3Var.setVisibility(8);
        k3Var.setWillNotDraw(false);
        k3Var.setOnItemClickListener(new dg.n(this, 13));
        addView(k3Var, k7.b6.c(56.0f, -1));
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f42378f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        int i10 = 8;
        float f10 = 0.0f;
        org.telegram.ui.k3 k3Var = this.f42375a;
        if (z10) {
            k3Var.setVisibility(0);
            float f11 = this.d;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42378f = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 13));
            this.f42378f.addListener(new l61(8, this, z4));
            this.f42378f.setInterpolator(nr.h);
            this.f42378f.setDuration(340L);
            this.f42378f.start();
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
        this.f42377c = callback;
    }

    public void setSelected(r rVar) {
        this.f42376b = rVar;
        AndroidUtilities.updateVisibleRows(this.f42375a);
    }
}
