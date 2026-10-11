package org.telegram.ui;

import android.view.View;
public final class w81 implements View.OnClickListener {
    public final int f43276a;
    public final h91 f43277b;

    public w81(h91 h91Var, int i10) {
        this.f43276a = i10;
        this.f43277b = h91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43276a) {
            case 0:
                h91 h91Var = this.f43277b;
                of.f.s(h91Var.getParentActivity(), h91Var.getMessagesController().premiumManageSubscriptionUrl);
                h91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                h91 h91Var2 = this.f43277b;
                h91Var2.getClass();
                h91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f43277b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                h91 h91Var3 = this.f43277b;
                h91Var3.getClass();
                h91Var3.presentFragment(new hh1(8, null));
                return;
            case 4:
                this.f43277b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                h91.V(this.f43277b);
                return;
            default:
                h91.Z(this.f43277b);
                return;
        }
    }
}
