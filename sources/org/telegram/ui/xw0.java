package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class xw0 {
    public final TLRPC.TL_premiumSubscriptionOption f45888a;
    public int f45889b;
    public long f45890c;
    public long d;
    public long e;
    public d5.o f45891f;
    public d5.n f45892g;
    public int h;

    public xw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f45888a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        d5.o oVar = this.f45891f;
        if (oVar != null && this.f45892g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d5.n nVar = (d5.n) obj;
                String str = ((d5.m) ((ArrayList) nVar.f7998b.f52841b).get(0)).d;
                int i11 = this.f45888a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f45892g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f45892g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f45888a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f45891f != null) {
                a();
                d5.n nVar = this.f45892g;
                if (nVar == null) {
                    return "";
                }
                return ((d5.m) ((ArrayList) nVar.f7998b.f52841b).get(0)).f7996c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f45889b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f45889b = i10;
                if (i10 == 0) {
                    this.f45889b = -1;
                }
            }
        }
        return this.f45889b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f45888a.store_product != null) {
            if (this.f45891f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f45888a.store_product != null) {
            if (this.f45891f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f45888a.store_product != null) {
            if (this.f45891f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f45888a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f45891f != null) {
                a();
                d5.n nVar = this.f45892g;
                if (nVar == null) {
                    return 0L;
                }
                return ((d5.m) ((ArrayList) nVar.f7998b.f52841b).get(0)).f7995b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f45890c == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.f45890c = g7 / this.f45888a.months;
            }
        }
        return this.f45890c;
    }

    public final long i() {
        if (this.d == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.d = (long) ((g7 / this.f45888a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
