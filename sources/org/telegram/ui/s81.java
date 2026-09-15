package org.telegram.ui;

import android.view.View;
public final class s81 implements View.OnClickListener {
    public final int f37278a;
    public final e91 f37279b;

    public s81(e91 e91Var, int i10) {
        this.f37278a = i10;
        this.f37279b = e91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37278a) {
            case 0:
                e91 e91Var = this.f37279b;
                nf.f.s(e91Var.getParentActivity(), e91Var.getMessagesController().premiumManageSubscriptionUrl);
                e91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                e91 e91Var2 = this.f37279b;
                e91Var2.getClass();
                e91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f37279b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                e91 e91Var3 = this.f37279b;
                e91Var3.getClass();
                e91Var3.presentFragment(new gh1(8, null));
                return;
            case 4:
                this.f37279b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                e91.W(this.f37279b);
                return;
            default:
                e91.Z(this.f37279b);
                return;
        }
    }
}
