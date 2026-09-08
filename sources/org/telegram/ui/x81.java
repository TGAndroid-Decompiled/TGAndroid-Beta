package org.telegram.ui;

import android.view.View;
public final class x81 implements View.OnClickListener {
    public final int f42644a;
    public final i91 f42645b;

    public x81(i91 i91Var, int i10) {
        this.f42644a = i10;
        this.f42645b = i91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42644a) {
            case 0:
                i91 i91Var = this.f42645b;
                of.f.s(i91Var.getParentActivity(), i91Var.getMessagesController().premiumManageSubscriptionUrl);
                i91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                i91 i91Var2 = this.f42645b;
                i91Var2.getClass();
                i91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f42645b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                i91 i91Var3 = this.f42645b;
                i91Var3.getClass();
                i91Var3.presentFragment(new hh1(8, null));
                return;
            case 4:
                this.f42645b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                i91.W(this.f42645b);
                return;
            default:
                i91.Z(this.f42645b);
                return;
        }
    }
}
