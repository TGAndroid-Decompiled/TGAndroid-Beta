package org.telegram.ui;

import android.view.View;
public final class z81 implements View.OnClickListener {
    public final int f44647a;
    public final k91 f44648b;

    public z81(k91 k91Var, int i10) {
        this.f44647a = i10;
        this.f44648b = k91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44647a) {
            case 0:
                k91 k91Var = this.f44648b;
                of.f.s(k91Var.getParentActivity(), k91Var.getMessagesController().premiumManageSubscriptionUrl);
                k91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                k91 k91Var2 = this.f44648b;
                k91Var2.getClass();
                k91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f44648b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                k91 k91Var3 = this.f44648b;
                k91Var3.getClass();
                k91Var3.presentFragment(new kh1(8, null));
                return;
            case 4:
                this.f44648b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                k91.V(this.f44648b);
                return;
            default:
                k91.Z(this.f44648b);
                return;
        }
    }
}
