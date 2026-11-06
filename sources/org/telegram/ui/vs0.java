package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class vs0 {
    public final TLRPC.TL_premiumSubscriptionOption f50813a;
    public int f50814b;
    public long f50815c;
    public long d;
    public long f50816e;
    public f5.l f50817f;
    public f5.k f50818g;
    public int h;

    public vs0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f50813a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        f5.l lVar = this.f50817f;
        if (lVar != null && this.f50818g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f5.k kVar = (f5.k) obj;
                String str = ((f5.i) kVar.f11165b.f11163a.get(0)).d;
                int i10 = this.f50813a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f50818g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f50818g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f50813a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f50817f != null) {
                a();
                f5.k kVar = this.f50818g;
                if (kVar == null) {
                    return "";
                }
                return ((f5.i) kVar.f11165b.f11163a.get(0)).f11162c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f50814b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f50816e != 0) {
                int i7 = (int) ((1.0d - (i() / this.f50816e)) * 100.0d);
                this.f50814b = i7;
                if (i7 == 0) {
                    this.f50814b = -1;
                }
            }
        }
        return this.f50814b;
    }

    public final String d() {
        if (!org.telegram.messenger.r2.b() && this.f50813a.store_product != null) {
            if (this.f50817f == null) {
                return "";
            }
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long g10 = g();
            String b10 = b();
            i7.getClass();
            return org.telegram.messenger.r1.g(b10, 6, g10, false);
        }
        return org.telegram.messenger.r1.i().f(g(), b());
    }

    public final String e() {
        if (!org.telegram.messenger.r2.b() && this.f50813a.store_product != null) {
            if (this.f50817f == null) {
                return "";
            }
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long h = h();
            String b10 = b();
            i7.getClass();
            return org.telegram.messenger.r1.g(b10, 6, h, false);
        }
        return org.telegram.messenger.r1.i().f(h(), b());
    }

    public final String f() {
        if (!org.telegram.messenger.r2.b() && this.f50813a.store_product != null) {
            if (this.f50817f == null) {
                return "";
            }
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long i10 = i();
            String b10 = b();
            i7.getClass();
            return org.telegram.messenger.r1.g(b10, 6, i10, false);
        }
        return org.telegram.messenger.r1.i().f(i(), b());
    }

    public final long g() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f50813a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f50817f != null) {
                a();
                f5.k kVar = this.f50818g;
                if (kVar == null) {
                    return 0L;
                }
                return ((f5.i) kVar.f11165b.f11163a.get(0)).f11161b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f50815c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f50815c = g10 / this.f50813a.months;
            }
        }
        return this.f50815c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f50813a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
