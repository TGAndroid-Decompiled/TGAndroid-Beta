package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
public final class d3 extends org.telegram.ui.ActionBar.h3 {
    public final c3 f45198b;
    public ValueAnimator f45199c;
    public o1.j d;
    public Boolean f45200e;
    public Utilities.Callback f45201f;

    public d3(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, float f10) {
        super(context, g6Var, false, false);
        fixNavigationBar(-14737633);
        c3 c3Var = new c3(UserConfig.selectedAccount, context, new oh.b(), f10, str);
        this.f45198b = c3Var;
        c3Var.D.setVisibility(8);
        c3Var.setMultipleOnClick(false);
        c3Var.setOnBackClickListener(new b3(this, 0));
        c3Var.setOnSelectListener(new wh.p2(this, 1));
        qv0 qv0Var = new qv0(context, null);
        this.containerView = qv0Var;
        int i10 = this.backgroundPaddingLeft;
        qv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(c3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f45198b.f44905w;
    }

    @Override
    public final void dismiss() {
        n(false, new b3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f45198b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z4, b3 b3Var) {
        float height;
        c3 c3Var = this.f45198b;
        float translationY = c3Var.getTranslationY();
        if (z4) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - c3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f45200e = Boolean.valueOf(z4);
        if (z4) {
            o1.j jVar = new o1.j(c3Var, o1.h.f16319n, height);
            this.d = jVar;
            jVar.f16336u.a(0.75f);
            this.d.f16336u.b(350.0f);
            this.d.a(new org.telegram.messenger.q(this, height, b3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f45199c = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 15));
        this.f45199c.addListener(new fx0(16, this, b3Var));
        this.f45199c.setDuration(450L);
        this.f45199c.setInterpolator(pr.h);
        this.f45199c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
