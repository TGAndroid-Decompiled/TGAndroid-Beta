package vg;

import org.telegram.messenger.r2;
import org.telegram.tgnet.TLRPC;
public final class j {
    public final TLRPC.TL_premiumGiftOption f56677a;
    public final TLRPC.TL_premiumGiftCodeOption f56678b;
    public final TLRPC.TL_premiumGiftOption f56679c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f56680e;
    public long f56681f;
    public long f56682g;
    public e5.l h;

    public j(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f56677a = tL_premiumGiftOption;
        this.f56678b = null;
        this.f56679c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56677a;
        if (tL_premiumGiftOption != null) {
            if (r2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56678b;
            if (tL_premiumGiftCodeOption != null && (r2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        e5.l lVar = this.h;
        if (lVar == null) {
            return "";
        }
        return lVar.a().f9598c;
    }

    public final int b() {
        if (this.f56680e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f56682g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f56682g)) * 100.0d);
                this.f56680e = f10;
                if (f10 == 0) {
                    this.f56680e = -1;
                }
            }
        }
        return this.f56680e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!r2.b() && (((tL_premiumGiftOption = this.f56677a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f56678b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long e10 = e();
            String a10 = a();
            i3.getClass();
            return org.telegram.messenger.r1.g(a10, 6, e10, false);
        }
        return org.telegram.messenger.r1.i().f(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56677a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56678b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56677a;
        if (tL_premiumGiftOption != null) {
            if (r2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56678b;
            if (tL_premiumGiftCodeOption != null && (r2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        e5.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().f9597b;
    }

    public final long f() {
        if (this.f56681f == 0) {
            long e10 = e();
            if (e10 != 0) {
                this.f56681f = e10 / d();
            }
        }
        return this.f56681f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56679c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f56677a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f56678b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public j(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f56677a = null;
        this.f56678b = tL_premiumGiftCodeOption;
        this.f56679c = null;
        this.d = com.google.android.recaptcha.internal.a.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
