package rg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final TLRPC.TL_premiumGiftOption f47344a;
    public final TLRPC.TL_premiumGiftCodeOption f47345b;
    public final TLRPC.TL_premiumGiftOption f47346c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f47347e;
    public long f47348f;
    public long f47349g;
    public c5.o h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f47344a = tL_premiumGiftOption;
        this.f47345b = null;
        this.f47346c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f47344a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f47345b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        c5.o oVar = this.h;
        if (oVar == null) {
            return "";
        }
        return oVar.a().f4267c;
    }

    public final int b() {
        if (this.f47347e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f47349g != 0) {
                int f7 = (int) ((1.0d - (f() / this.f47349g)) * 100.0d);
                this.f47347e = f7;
                if (f7 == 0) {
                    this.f47347e = -1;
                }
            }
        }
        return this.f47347e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f47344a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f47345b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f47344a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f47345b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f47344a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f47345b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        c5.o oVar = this.h;
        if (oVar == null) {
            return 0L;
        }
        return oVar.a().f4266b;
    }

    public final long f() {
        if (this.f47348f == 0) {
            long e7 = e();
            if (e7 != 0) {
                this.f47348f = e7 / d();
            }
        }
        return this.f47348f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f47346c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f47344a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f47345b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f47344a = null;
        this.f47345b = tL_premiumGiftCodeOption;
        this.f47346c = null;
        this.d = e2.t(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
