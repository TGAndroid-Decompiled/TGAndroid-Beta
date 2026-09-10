package qg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final TLRPC.TL_premiumGiftOption f40759a;
    public final TLRPC.TL_premiumGiftCodeOption f40760b;
    public final TLRPC.TL_premiumGiftOption f40761c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f40762f;
    public long f40763g;
    public c5.o h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f40759a = tL_premiumGiftOption;
        this.f40760b = null;
        this.f40761c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f40759a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f40760b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        c5.o oVar = this.h;
        if (oVar == null) {
            return "";
        }
        return oVar.a().f4320c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f40763g != 0) {
                int f7 = (int) ((1.0d - (f() / this.f40763g)) * 100.0d);
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
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f40759a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f40760b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f40759a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f40760b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f40759a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f40760b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        c5.o oVar = this.h;
        if (oVar == null) {
            return 0L;
        }
        return oVar.a().f4319b;
    }

    public final long f() {
        if (this.f40762f == 0) {
            long e = e();
            if (e != 0) {
                this.f40762f = e / d();
            }
        }
        return this.f40762f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f40761c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f40759a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f40760b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f40759a = null;
        this.f40760b = tL_premiumGiftCodeOption;
        this.f40761c = null;
        this.d = e2.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
