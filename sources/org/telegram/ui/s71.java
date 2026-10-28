package org.telegram.ui;

import android.view.View;
public final class s71 implements View.OnClickListener {
    public final int f43253a;
    public final f81 f43254b;

    public s71(f81 f81Var, int i10) {
        this.f43253a = i10;
        this.f43254b = f81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43253a) {
            case 0:
                f81 f81Var = this.f43254b;
                qf.d.r(f81Var.getParentActivity(), f81Var.getMessagesController().premiumManageSubscriptionUrl);
                f81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                f81 f81Var2 = this.f43254b;
                f81Var2.getClass();
                f81Var2.presentFragment(new g(3));
                return;
            case 2:
                this.f43254b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                f81 f81Var3 = this.f43254b;
                f81Var3.getClass();
                f81Var3.presentFragment(new fg1(8, null));
                return;
            case 4:
                this.f43254b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                f81.W(this.f43254b);
                return;
            default:
                f81.Z(this.f43254b);
                return;
        }
    }
}
