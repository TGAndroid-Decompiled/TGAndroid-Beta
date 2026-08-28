package zf;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final TLRPC.TL_premiumGiftOption f50558a;
    public final TLRPC.TL_premiumGiftCodeOption f50559b;
    public final TLRPC.TL_premiumGiftOption f50560c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f50561e;
    public long f50562f;
    public long f50563g;
    public n2.l h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f50558a = tL_premiumGiftOption;
        this.f50559b = null;
        this.f50560c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f50558a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f50559b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        n2.l lVar = this.h;
        if (lVar == null) {
            return "";
        }
        return lVar.a().f18324c;
    }

    public final int b() {
        if (this.f50561e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f50563g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f50563g)) * 100.0d);
                this.f50561e = f10;
                if (f10 == 0) {
                    this.f50561e = -1;
                }
            }
        }
        return this.f50561e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f50558a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f50559b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f50558a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f50559b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f50558a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f50559b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        n2.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().f18323b;
    }

    public final long f() {
        if (this.f50562f == 0) {
            long e10 = e();
            if (e10 != 0) {
                this.f50562f = e10 / d();
            }
        }
        return this.f50562f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f50560c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f50558a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f50559b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f50558a = null;
        this.f50559b = tL_premiumGiftCodeOption;
        this.f50560c = null;
        this.d = e2.c.v(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
