package rh;

import org.telegram.messenger.k20;
public final class m4 implements Runnable {
    public final int f47214a;
    public final k20 f47215b;

    public m4(k20 k20Var, int i10) {
        this.f47214a = i10;
        this.f47215b = k20Var;
    }

    @Override
    public final void run() {
        switch (this.f47214a) {
            case 0:
                this.f47215b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f47215b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47215b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.f8.b("StarsController.buy onCanceled");
                org.telegram.messenger.i0.g3(new m4(this.f47215b, 0));
                return;
        }
    }
}
