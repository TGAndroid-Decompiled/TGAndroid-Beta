package rh;

import org.telegram.ui.Components.q70;
public final class v4 implements Runnable {
    public final int f47572a;
    public final q70 f47573b;

    public v4(q70 q70Var, int i10) {
        this.f47572a = i10;
        this.f47573b = q70Var;
    }

    @Override
    public final void run() {
        switch (this.f47572a) {
            case 0:
                this.f47573b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47573b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.i0.g3(new v4(this.f47573b, 3));
                return;
            default:
                this.f47573b.a(Boolean.FALSE, null);
                return;
        }
    }
}
