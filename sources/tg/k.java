package tg;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final TLRPC.TL_premiumGiftOption f48946a;
    public final TLRPC.TL_premiumGiftCodeOption f48947b;
    public final TLRPC.TL_premiumGiftOption f48948c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f48949f;
    public long f48950g;
    public d5.o h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f48946a = tL_premiumGiftOption;
        this.f48947b = null;
        this.f48948c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f48946a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f48947b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        d5.o oVar = this.h;
        if (oVar == null) {
            return "";
        }
        return oVar.a().f7991c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f48950g != 0) {
                int f7 = (int) ((1.0d - (f() / this.f48950g)) * 100.0d);
                this.e = f7;
                if (f7 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f48946a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f48947b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f48946a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f48947b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f48946a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f48947b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        d5.o oVar = this.h;
        if (oVar == null) {
            return 0L;
        }
        return oVar.a().f7990b;
    }

    public final long f() {
        if (this.f48949f == 0) {
            long e = e();
            if (e != 0) {
                this.f48949f = e / d();
            }
        }
        return this.f48949f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f48948c;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.amount;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.d;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.amount;
        }
        return 0L;
    }

    public final String h() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f48946a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f48947b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f48946a = null;
        this.f48947b = tL_premiumGiftCodeOption;
        this.f48948c = null;
        this.d = c3.h0.t(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
