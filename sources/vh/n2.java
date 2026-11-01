package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.vu0;
public final class n2 extends org.telegram.ui.ActionBar.z2 {
    public final m2 f51516i1;
    public ValueAnimator f51517j1;
    public o1.j f51518k1;
    public Boolean l1;
    public r20 f51519m1;

    public n2(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, float f7) {
        super(1, context, p6Var, false);
        P(-14737633);
        m2 m2Var = new m2(e20.f15506s0, context, new th.b(), f7, str);
        this.f51516i1 = m2Var;
        m2Var.G.setVisibility(8);
        m2Var.setMultipleOnClick(false);
        m2Var.setOnBackClickListener(new l2(this, 0));
        m2Var.setOnSelectListener(new qh.d(this, 18));
        vu0 vu0Var = new vu0(context, null);
        this.f21587b = vu0Var;
        int i10 = this.f21616t0;
        vu0Var.setPadding(i10, 0, i10, 0);
        this.f21587b.addView(m2Var);
    }

    @Override
    public final boolean H() {
        return !this.f51516i1.f51412x;
    }

    public final void J0(boolean z10, l2 l2Var) {
        float height;
        m2 m2Var = this.f51516i1;
        float translationY = m2Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f21587b.getHeight() - m2Var.g()) + (org.telegram.messenger.i0.f16167n * 2.5f);
        }
        this.l1 = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(m2Var, o1.j.f13943p, height);
            this.f51518k1 = jVar;
            jVar.f13958m.a(0.75f);
            this.f51518k1.f13958m.b(350.0f);
            this.f51518k1.a(new org.telegram.messenger.i(this, height, l2Var));
            this.f51518k1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f51517j1 = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 27));
        this.f51517j1.addListener(new jw0(20, this, l2Var));
        this.f51517j1.setDuration(450L);
        this.f51517j1.setInterpolator(gr.h);
        this.f51517j1.start();
    }

    @Override
    public final void dismiss() {
        J0(false, new l2(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f51516i1.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void show() {
        super.show();
        J0(true, null);
    }
}
