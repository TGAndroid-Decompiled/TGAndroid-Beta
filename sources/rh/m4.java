package rh;

import org.telegram.messenger.j20;
public final class m4 implements Runnable {
    public final int f47200a;
    public final j20 f47201b;

    public m4(j20 j20Var, int i10) {
        this.f47200a = i10;
        this.f47201b = j20Var;
    }

    @Override
    public final void run() {
        switch (this.f47200a) {
            case 0:
                this.f47201b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f47201b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47201b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.f8.b("StarsController.buy onCanceled");
                org.telegram.messenger.i0.g3(new m4(this.f47201b, 0));
                return;
        }
    }
}
