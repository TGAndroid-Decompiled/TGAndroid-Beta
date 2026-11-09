package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ys0 {
    public final TLRPC.TL_premiumSubscriptionOption f52182a;
    public int f52183b;
    public long f52184c;
    public long d;
    public long f52185e;
    public f5.l f52186f;
    public f5.k f52187g;
    public int h;

    public ys0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f52182a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        f5.l lVar = this.f52186f;
        if (lVar != null && this.f52187g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f5.k kVar = (f5.k) obj;
                String str = ((f5.i) kVar.f11165b.f11163a.get(0)).d;
                int i10 = this.f52182a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f52187g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f52187g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f52182a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f52186f != null) {
                a();
                f5.k kVar = this.f52187g;
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
        if (this.f52183b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f52185e != 0) {
                int i7 = (int) ((1.0d - (i() / this.f52185e)) * 100.0d);
                this.f52183b = i7;
                if (i7 == 0) {
                    this.f52183b = -1;
                }
            }
        }
        return this.f52183b;
    }

    public final String d() {
        if (!org.telegram.messenger.r2.b() && this.f52182a.store_product != null) {
            if (this.f52186f == null) {
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
        if (!org.telegram.messenger.r2.b() && this.f52182a.store_product != null) {
            if (this.f52186f == null) {
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
        if (!org.telegram.messenger.r2.b() && this.f52182a.store_product != null) {
            if (this.f52186f == null) {
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f52182a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f52186f != null) {
                a();
                f5.k kVar = this.f52187g;
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
        if (this.f52184c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f52184c = g10 / this.f52182a.months;
            }
        }
        return this.f52184c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f52182a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
