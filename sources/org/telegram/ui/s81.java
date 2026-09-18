package org.telegram.ui;

import android.view.View;
public final class s81 implements View.OnClickListener {
    public final int f37220a;
    public final f91 f37221b;

    public s81(f91 f91Var, int i10) {
        this.f37220a = i10;
        this.f37221b = f91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37220a) {
            case 0:
                f91 f91Var = this.f37221b;
                nf.f.s(f91Var.getParentActivity(), f91Var.getMessagesController().premiumManageSubscriptionUrl);
                f91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                f91 f91Var2 = this.f37221b;
                f91Var2.getClass();
                f91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f37221b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                f91 f91Var3 = this.f37221b;
                f91Var3.getClass();
                f91Var3.presentFragment(new gh1(8, null));
                return;
            case 4:
                this.f37221b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                f91.W(this.f37221b);
                return;
            default:
                f91.Z(this.f37221b);
                return;
        }
    }
}
