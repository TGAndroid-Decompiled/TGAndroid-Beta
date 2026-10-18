package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class rw0 {
    public final TLRPC.TL_premiumSubscriptionOption f40805a;
    public int f40806b;
    public long f40807c;
    public long d;
    public long e;
    public c5.o f40808f;
    public c5.n f40809g;
    public int h;

    public rw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f40805a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f40808f;
        if (oVar != null && this.f40809g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.m) ((ArrayList) nVar.f4773b.f310b).get(0)).d;
                int i11 = this.f40805a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f40809g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f40809g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40805a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40808f != null) {
                a();
                c5.n nVar = this.f40809g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.m) ((ArrayList) nVar.f4773b.f310b).get(0)).f4771c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f40806b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f40806b = i10;
                if (i10 == 0) {
                    this.f40806b = -1;
                }
            }
        }
        return this.f40806b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f40805a.store_product != null) {
            if (this.f40808f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f40805a.store_product != null) {
            if (this.f40808f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f40805a.store_product != null) {
            if (this.f40808f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40805a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40808f != null) {
                a();
                c5.n nVar = this.f40809g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.m) ((ArrayList) nVar.f4773b.f310b).get(0)).f4770b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f40807c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f40807c = g10 / this.f40805a.months;
            }
        }
        return this.f40807c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f40805a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
