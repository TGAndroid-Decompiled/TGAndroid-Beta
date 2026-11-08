package ug;

import org.telegram.messenger.r2;
import org.telegram.tgnet.TLRPC;
public final class j {
    public final TLRPC.TL_premiumGiftOption f56637a;
    public final TLRPC.TL_premiumGiftCodeOption f56638b;
    public final TLRPC.TL_premiumGiftOption f56639c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f56640e;
    public long f56641f;
    public long f56642g;
    public f5.l h;

    public j(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f56637a = tL_premiumGiftOption;
        this.f56638b = null;
        this.f56639c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56637a;
        if (tL_premiumGiftOption != null) {
            if (r2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56638b;
            if (tL_premiumGiftCodeOption != null && (r2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        f5.l lVar = this.h;
        if (lVar == null) {
            return "";
        }
        return lVar.a().f11156c;
    }

    public final int b() {
        if (this.f56640e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f56642g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f56642g)) * 100.0d);
                this.f56640e = f10;
                if (f10 == 0) {
                    this.f56640e = -1;
                }
            }
        }
        return this.f56640e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!r2.b() && (((tL_premiumGiftOption = this.f56637a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f56638b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long e10 = e();
            String a10 = a();
            i7.getClass();
            return org.telegram.messenger.r1.g(a10, 6, e10, false);
        }
        return org.telegram.messenger.r1.i().f(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56637a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56638b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56637a;
        if (tL_premiumGiftOption != null) {
            if (r2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56638b;
            if (tL_premiumGiftCodeOption != null && (r2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        f5.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().f11155b;
    }

    public final long f() {
        if (this.f56641f == 0) {
            long e10 = e();
            if (e10 != 0) {
                this.f56641f = e10 / d();
            }
        }
        return this.f56641f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56639c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56637a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56638b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public j(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f56637a = null;
        this.f56638b = tL_premiumGiftCodeOption;
        this.f56639c = null;
        this.d = com.google.android.recaptcha.internal.a.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
