package org.telegram.ui;

import android.view.View;
public final class u81 implements View.OnClickListener {
    public final int f37966a;
    public final g91 f37967b;

    public u81(g91 g91Var, int i10) {
        this.f37966a = i10;
        this.f37967b = g91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37966a) {
            case 0:
                g91 g91Var = this.f37967b;
                nf.f.s(g91Var.getParentActivity(), g91Var.getMessagesController().premiumManageSubscriptionUrl);
                g91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                g91 g91Var2 = this.f37967b;
                g91Var2.getClass();
                g91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f37967b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                g91 g91Var3 = this.f37967b;
                g91Var3.getClass();
                g91Var3.presentFragment(new ih1(8, null));
                return;
            case 4:
                this.f37967b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                g91.W(this.f37967b);
                return;
            default:
                g91.Z(this.f37967b);
                return;
        }
    }
}
