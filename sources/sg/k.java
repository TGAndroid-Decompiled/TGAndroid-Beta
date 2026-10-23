package sg;

import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class k {
    public final TLRPC.TL_premiumGiftOption f46285a;
    public final TLRPC.TL_premiumGiftCodeOption f46286b;
    public final TLRPC.TL_premiumGiftOption f46287c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f46288f;
    public long f46289g;
    public c5.p h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f46285a = tL_premiumGiftOption;
        this.f46286b = null;
        this.f46287c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f46285a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f46286b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        c5.p pVar = this.h;
        if (pVar == null) {
            return "";
        }
        return pVar.a().f4764c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f46289g != 0) {
                int f7 = (int) ((1.0d - (f() / this.f46289g)) * 100.0d);
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
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f46285a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f46286b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f46285a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f46286b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f46285a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f46286b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        c5.p pVar = this.h;
        if (pVar == null) {
            return 0L;
        }
        return pVar.a().f4763b;
    }

    public final long f() {
        if (this.f46288f == 0) {
            long e = e();
            if (e != 0) {
                this.f46288f = e / d();
            }
        }
        return this.f46288f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f46287c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f46285a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f46286b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f46285a = null;
        this.f46286b = tL_premiumGiftCodeOption;
        this.f46287c = null;
        this.d = k3.s(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
