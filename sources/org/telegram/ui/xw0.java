package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class xw0 {
    public final TLRPC.TL_premiumSubscriptionOption f40084a;
    public int f40085b;
    public long f40086c;
    public long d;
    public long e;
    public p2.n f40087f;
    public p2.m f40088g;
    public int h;

    public xw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f40084a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        p2.n nVar = this.f40087f;
        if (nVar != null && this.f40088g == null) {
            ArrayList arrayList = nVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p2.m mVar = (p2.m) obj;
                String str = ((p2.k) mVar.f41028b.f41026a.get(0)).d;
                int i11 = this.f40084a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f40088g = mVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f40088g = mVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40084a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40087f != null) {
                a();
                p2.m mVar = this.f40088g;
                if (mVar == null) {
                    return "";
                }
                return ((p2.k) mVar.f41028b.f41026a.get(0)).f41025c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f40085b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f40085b = i10;
                if (i10 == 0) {
                    this.f40085b = -1;
                }
            }
        }
        return this.f40085b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f40084a.store_product != null) {
            if (this.f40087f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f40084a.store_product != null) {
            if (this.f40087f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f40084a.store_product != null) {
            if (this.f40087f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40084a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40087f != null) {
                a();
                p2.m mVar = this.f40088g;
                if (mVar == null) {
                    return 0L;
                }
                return ((p2.k) mVar.f41028b.f41026a.get(0)).f41024b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f40086c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f40086c = g10 / this.f40084a.months;
            }
        }
        return this.f40086c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f40084a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
