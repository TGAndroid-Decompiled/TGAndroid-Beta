package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
public final class c3 extends org.telegram.ui.ActionBar.h3 {
    public final b3 f45164b;
    public ValueAnimator f45165c;
    public o1.j d;
    public Boolean f45166e;
    public Utilities.Callback f45167f;

    public c3(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, float f10) {
        super(context, g6Var, false, false);
        fixNavigationBar(-14737633);
        b3 b3Var = new b3(UserConfig.selectedAccount, context, new oh.b(), f10, str);
        this.f45164b = b3Var;
        b3Var.D.setVisibility(8);
        b3Var.setMultipleOnClick(false);
        b3Var.setOnBackClickListener(new a3(this, 0));
        b3Var.setOnSelectListener(new wh.p2(this, 1));
        pv0 pv0Var = new pv0(context, null);
        this.containerView = pv0Var;
        int i10 = this.backgroundPaddingLeft;
        pv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(b3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f45164b.f46400w;
    }

    @Override
    public final void dismiss() {
        n(false, new a3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f45164b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z4, a3 a3Var) {
        float height;
        b3 b3Var = this.f45164b;
        float translationY = b3Var.getTranslationY();
        if (z4) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - b3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f45166e = Boolean.valueOf(z4);
        if (z4) {
            o1.j jVar = new o1.j(b3Var, o1.h.f16321n, height);
            this.d = jVar;
            jVar.f16338u.a(0.75f);
            this.d.f16338u.b(350.0f);
            this.d.a(new org.telegram.messenger.q(this, height, a3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f45165c = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 15));
        this.f45165c.addListener(new ex0(16, this, a3Var));
        this.f45165c.setDuration(450L);
        this.f45165c.setInterpolator(pr.h);
        this.f45165c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
