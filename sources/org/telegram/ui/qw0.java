package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class qw0 {
    public final TLRPC.TL_premiumSubscriptionOption f37853a;
    public int f37854b;
    public long f37855c;
    public long d;
    public long e;
    public p2.n f37856f;
    public p2.m f37857g;
    public int h;

    public qw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f37853a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        p2.n nVar = this.f37856f;
        if (nVar != null && this.f37857g == null) {
            ArrayList arrayList = nVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p2.m mVar = (p2.m) obj;
                String str = ((p2.l) mVar.f41006b.f10290a.get(0)).d;
                int i11 = this.f37853a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f37857g = mVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f37857g = mVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f37853a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f37856f != null) {
                a();
                p2.m mVar = this.f37857g;
                if (mVar == null) {
                    return "";
                }
                return ((p2.l) mVar.f41006b.f10290a.get(0)).f41004c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f37854b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f37854b = i10;
                if (i10 == 0) {
                    this.f37854b = -1;
                }
            }
        }
        return this.f37854b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f37853a.store_product != null) {
            if (this.f37856f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f37853a.store_product != null) {
            if (this.f37856f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f37853a.store_product != null) {
            if (this.f37856f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f37853a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f37856f != null) {
                a();
                p2.m mVar = this.f37857g;
                if (mVar == null) {
                    return 0L;
                }
                return ((p2.l) mVar.f41006b.f10290a.get(0)).f41003b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f37855c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f37855c = g10 / this.f37853a.months;
            }
        }
        return this.f37855c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f37853a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
