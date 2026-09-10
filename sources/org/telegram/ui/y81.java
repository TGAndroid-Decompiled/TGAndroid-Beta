package org.telegram.ui;

import android.view.View;
public final class y81 implements View.OnClickListener {
    public final int f38937a;
    public final k91 f38938b;

    public y81(k91 k91Var, int i10) {
        this.f38937a = i10;
        this.f38938b = k91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38937a) {
            case 0:
                k91 k91Var = this.f38938b;
                nf.f.s(k91Var.getParentActivity(), k91Var.getMessagesController().premiumManageSubscriptionUrl);
                k91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                k91 k91Var2 = this.f38938b;
                k91Var2.getClass();
                k91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f38938b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                k91 k91Var3 = this.f38938b;
                k91Var3.getClass();
                k91Var3.presentFragment(new mh1(8, null));
                return;
            case 4:
                this.f38938b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                k91.W(this.f38938b);
                return;
            default:
                k91.Z(this.f38938b);
                return;
        }
    }
}
