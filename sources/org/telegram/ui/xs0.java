package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class xs0 {
    public final TLRPC.TL_premiumSubscriptionOption f53947a;
    public int f53948b;
    public long f53949c;
    public long d;
    public long f53950e;
    public f5.m f53951f;
    public f5.l f53952g;
    public int h;

    public xs0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f53947a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        f5.m mVar = this.f53951f;
        if (mVar != null && this.f53952g == null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f5.l lVar = (f5.l) obj;
                String str = ((f5.j) lVar.f11330b.f11328a.get(0)).d;
                int i10 = this.f53947a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f53952g = lVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f53952g = lVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.s2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f53947a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f53951f != null) {
                a();
                f5.l lVar = this.f53952g;
                if (lVar == null) {
                    return "";
                }
                return ((f5.j) lVar.f11330b.f11328a.get(0)).f11327c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f53948b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f53950e != 0) {
                int i7 = (int) ((1.0d - (i() / this.f53950e)) * 100.0d);
                this.f53948b = i7;
                if (i7 == 0) {
                    this.f53948b = -1;
                }
            }
        }
        return this.f53948b;
    }

    public final String d() {
        if (!org.telegram.messenger.s2.b() && this.f53947a.store_product != null) {
            if (this.f53951f == null) {
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
        if (!org.telegram.messenger.s2.b() && this.f53947a.store_product != null) {
            if (this.f53951f == null) {
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
        if (!org.telegram.messenger.s2.b() && this.f53947a.store_product != null) {
            if (this.f53951f == null) {
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
        boolean b10 = org.telegram.messenger.s2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f53947a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f53951f != null) {
                a();
                f5.l lVar = this.f53952g;
                if (lVar == null) {
                    return 0L;
                }
                return ((f5.j) lVar.f11330b.f11328a.get(0)).f11326b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f53949c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f53949c = g10 / this.f53947a.months;
            }
        }
        return this.f53949c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f53947a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
