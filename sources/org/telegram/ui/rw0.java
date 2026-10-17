package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class rw0 {
    public final TLRPC.TL_premiumSubscriptionOption f40822a;
    public int f40823b;
    public long f40824c;
    public long d;
    public long e;
    public c5.o f40825f;
    public c5.n f40826g;
    public int h;

    public rw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f40822a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f40825f;
        if (oVar != null && this.f40826g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.m) ((ArrayList) nVar.f4772b.f310b).get(0)).d;
                int i11 = this.f40822a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f40826g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f40826g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40822a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40825f != null) {
                a();
                c5.n nVar = this.f40826g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.m) ((ArrayList) nVar.f4772b.f310b).get(0)).f4770c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f40823b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f40823b = i10;
                if (i10 == 0) {
                    this.f40823b = -1;
                }
            }
        }
        return this.f40823b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f40822a.store_product != null) {
            if (this.f40825f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f40822a.store_product != null) {
            if (this.f40825f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f40822a.store_product != null) {
            if (this.f40825f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40822a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40825f != null) {
                a();
                c5.n nVar = this.f40826g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.m) ((ArrayList) nVar.f4772b.f310b).get(0)).f4769b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f40824c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f40824c = g10 / this.f40822a.months;
            }
        }
        return this.f40824c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f40822a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
