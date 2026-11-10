package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class zs0 {
    public final TLRPC.TL_premiumSubscriptionOption f52526a;
    public int f52527b;
    public long f52528c;
    public long d;
    public long f52529e;
    public f5.l f52530f;
    public f5.k f52531g;
    public int h;

    public zs0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f52526a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        f5.l lVar = this.f52530f;
        if (lVar != null && this.f52531g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f5.k kVar = (f5.k) obj;
                String str = ((f5.i) kVar.f11170b.f11168a.get(0)).d;
                int i10 = this.f52526a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f52531g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f52531g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f52526a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f52530f != null) {
                a();
                f5.k kVar = this.f52531g;
                if (kVar == null) {
                    return "";
                }
                return ((f5.i) kVar.f11170b.f11168a.get(0)).f11167c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f52527b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f52529e != 0) {
                int i7 = (int) ((1.0d - (i() / this.f52529e)) * 100.0d);
                this.f52527b = i7;
                if (i7 == 0) {
                    this.f52527b = -1;
                }
            }
        }
        return this.f52527b;
    }

    public final String d() {
        if (!org.telegram.messenger.r2.b() && this.f52526a.store_product != null) {
            if (this.f52530f == null) {
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
        if (!org.telegram.messenger.r2.b() && this.f52526a.store_product != null) {
            if (this.f52530f == null) {
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
        if (!org.telegram.messenger.r2.b() && this.f52526a.store_product != null) {
            if (this.f52530f == null) {
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f52526a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f52530f != null) {
                a();
                f5.k kVar = this.f52531g;
                if (kVar == null) {
                    return 0L;
                }
                return ((f5.i) kVar.f11170b.f11168a.get(0)).f11166b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f52528c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f52528c = g10 / this.f52526a.months;
            }
        }
        return this.f52528c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f52526a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
