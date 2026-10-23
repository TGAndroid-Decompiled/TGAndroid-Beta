package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class tw0 {
    public final TLRPC.TL_premiumSubscriptionOption f42089a;
    public int f42090b;
    public long f42091c;
    public long d;
    public long e;
    public c5.p f42092f;
    public c5.o f42093g;
    public int h;

    public tw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f42089a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.p pVar = this.f42092f;
        if (pVar != null && this.f42093g == null) {
            ArrayList arrayList = pVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.o oVar = (c5.o) obj;
                String str = ((c5.m) oVar.f4777b.f4775a.get(0)).d;
                int i11 = this.f42089a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f42093g = oVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f42093g = oVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f42089a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f42092f != null) {
                a();
                c5.o oVar = this.f42093g;
                if (oVar == null) {
                    return "";
                }
                return ((c5.m) oVar.f4777b.f4775a.get(0)).f4774c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f42090b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f42090b = i10;
                if (i10 == 0) {
                    this.f42090b = -1;
                }
            }
        }
        return this.f42090b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f42089a.store_product != null) {
            if (this.f42092f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f42089a.store_product != null) {
            if (this.f42092f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f42089a.store_product != null) {
            if (this.f42092f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f42089a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f42092f != null) {
                a();
                c5.o oVar = this.f42093g;
                if (oVar == null) {
                    return 0L;
                }
                return ((c5.m) oVar.f4777b.f4775a.get(0)).f4773b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f42091c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f42091c = g10 / this.f42089a.months;
            }
        }
        return this.f42091c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f42089a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
