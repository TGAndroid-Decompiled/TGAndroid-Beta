package ug;

import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLRPC;
public final class j {
    public final TLRPC.TL_premiumGiftOption f58742a;
    public final TLRPC.TL_premiumGiftCodeOption f58743b;
    public final TLRPC.TL_premiumGiftOption f58744c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f58745e;
    public long f58746f;
    public long f58747g;
    public f5.m h;

    public j(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f58742a = tL_premiumGiftOption;
        this.f58743b = null;
        this.f58744c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f58742a;
        if (tL_premiumGiftOption != null) {
            if (s2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f58743b;
            if (tL_premiumGiftCodeOption != null && (s2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        f5.m mVar = this.h;
        if (mVar == null) {
            return "";
        }
        return mVar.a().f11318c;
    }

    public final int b() {
        if (this.f58745e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f58747g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f58747g)) * 100.0d);
                this.f58745e = f10;
                if (f10 == 0) {
                    this.f58745e = -1;
                }
            }
        }
        return this.f58745e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!s2.b() && (((tL_premiumGiftOption = this.f58742a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f58743b) == null || tL_premiumGiftCodeOption.store_product != null))) {
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f58742a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f58743b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f58742a;
        if (tL_premiumGiftOption != null) {
            if (s2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f58743b;
            if (tL_premiumGiftCodeOption != null && (s2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        f5.m mVar = this.h;
        if (mVar == null) {
            return 0L;
        }
        return mVar.a().f11317b;
    }

    public final long f() {
        if (this.f58746f == 0) {
            long e10 = e();
            if (e10 != 0) {
                this.f58746f = e10 / d();
            }
        }
        return this.f58746f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f58744c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f58742a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f58743b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public j(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f58742a = null;
        this.f58743b = tL_premiumGiftCodeOption;
        this.f58744c = null;
        this.d = e2.s(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
