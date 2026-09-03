package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class xw0 {
    public final TLRPC.TL_premiumSubscriptionOption f43466a;
    public int f43467b;
    public long f43468c;
    public long d;
    public long f43469e;
    public p2.m f43470f;
    public p2.l f43471g;
    public int h;

    public xw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f43466a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        p2.m mVar = this.f43470f;
        if (mVar != null && this.f43471g == null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p2.l lVar = (p2.l) obj;
                String str = ((p2.k) lVar.f44189b.f11056a.get(0)).d;
                int i11 = this.f43466a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f43471g = lVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f43471g = lVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f43466a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f43470f != null) {
                a();
                p2.l lVar = this.f43471g;
                if (lVar == null) {
                    return "";
                }
                return ((p2.k) lVar.f44189b.f11056a.get(0)).f44187c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f43467b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f43469e != 0) {
                int i10 = (int) ((1.0d - (i() / this.f43469e)) * 100.0d);
                this.f43467b = i10;
                if (i10 == 0) {
                    this.f43467b = -1;
                }
            }
        }
        return this.f43467b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f43466a.store_product != null) {
            if (this.f43470f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f43466a.store_product != null) {
            if (this.f43470f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f43466a.store_product != null) {
            if (this.f43470f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f43466a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f43470f != null) {
                a();
                p2.l lVar = this.f43471g;
                if (lVar == null) {
                    return 0L;
                }
                return ((p2.k) lVar.f44189b.f11056a.get(0)).f44186b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f43468c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f43468c = g10 / this.f43466a.months;
            }
        }
        return this.f43468c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f43466a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
