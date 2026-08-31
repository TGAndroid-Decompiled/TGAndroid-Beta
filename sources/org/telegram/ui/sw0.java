package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class sw0 {
    public final TLRPC.TL_premiumSubscriptionOption f41381a;
    public int f41382b;
    public long f41383c;
    public long d;
    public long f41384e;
    public p2.m f41385f;
    public p2.l f41386g;
    public int h;

    public sw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f41381a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        p2.m mVar = this.f41385f;
        if (mVar != null && this.f41386g == null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p2.l lVar = (p2.l) obj;
                String str = ((p2.k) lVar.f44158b.f11056a.get(0)).d;
                int i11 = this.f41381a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f41386g = lVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f41386g = lVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f41381a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f41385f != null) {
                a();
                p2.l lVar = this.f41386g;
                if (lVar == null) {
                    return "";
                }
                return ((p2.k) lVar.f44158b.f11056a.get(0)).f44156c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f41382b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f41384e != 0) {
                int i10 = (int) ((1.0d - (i() / this.f41384e)) * 100.0d);
                this.f41382b = i10;
                if (i10 == 0) {
                    this.f41382b = -1;
                }
            }
        }
        return this.f41382b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f41381a.store_product != null) {
            if (this.f41385f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f41381a.store_product != null) {
            if (this.f41385f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f41381a.store_product != null) {
            if (this.f41385f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f41381a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f41385f != null) {
                a();
                p2.l lVar = this.f41386g;
                if (lVar == null) {
                    return 0L;
                }
                return ((p2.k) lVar.f44158b.f11056a.get(0)).f44155b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f41383c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f41383c = g10 / this.f41381a.months;
            }
        }
        return this.f41383c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f41381a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
