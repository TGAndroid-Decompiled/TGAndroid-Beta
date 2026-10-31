package rh;
public final class p4 implements Runnable {
    public final int f47315a;
    public final ih.s f47316b;

    public p4(ih.s sVar, int i10) {
        this.f47315a = i10;
        this.f47316b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f47315a) {
            case 0:
                this.f47316b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47316b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.i0.g3(new p4(this.f47316b, 3));
                return;
            default:
                this.f47316b.a(Boolean.FALSE, null);
                return;
        }
    }
}
