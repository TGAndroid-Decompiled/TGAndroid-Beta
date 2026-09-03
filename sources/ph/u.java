package ph;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.s61;
public final class u extends FrameLayout {
    public final org.telegram.ui.m3 f42456a;
    public r f42457b;
    public Utilities.Callback f42458c;
    public float d;
    public boolean e;
    public ValueAnimator f42459f;

    public u(Activity activity, d2 d2Var) {
        super(activity);
        org.telegram.ui.m3 m3Var = new org.telegram.ui.m3(this, activity);
        this.f42456a = m3Var;
        m3Var.setAdapter(new s(this, activity, d2Var));
        m3Var.setLayoutManager(new f2.i0(0, false));
        m3Var.setClipToPadding(false);
        m3Var.setVisibility(8);
        m3Var.setWillNotDraw(false);
        m3Var.setOnItemClickListener(new dg.n(this, 13));
        addView(m3Var, k7.b6.c(56.0f, -1));
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f42459f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        int i10 = 8;
        float f10 = 0.0f;
        org.telegram.ui.m3 m3Var = this.f42456a;
        if (z10) {
            m3Var.setVisibility(0);
            float f11 = this.d;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42459f = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 13));
            this.f42459f.addListener(new s61(8, this, z4));
            this.f42459f.setInterpolator(mr.h);
            this.f42459f.setDuration(340L);
            this.f42459f.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.d = f10;
        m3Var.invalidate();
        if (z4) {
            i10 = 0;
        }
        m3Var.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<r> callback) {
        this.f42458c = callback;
    }

    public void setSelected(r rVar) {
        this.f42457b = rVar;
        AndroidUtilities.updateVisibleRows(this.f42456a);
    }
}
