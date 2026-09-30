package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class r1 implements Runnable {
    public final int f48049a;
    public final org.telegram.tgnet.e f48050b;
    public final ad[] f48051c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public r1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f48049a = i10;
        this.f48050b = eVar;
        this.f48051c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f48049a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f48051c;
        org.telegram.tgnet.e eVar = this.f48050b;
        switch (i10) {
            case 0:
                eVar.run(adVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.run(adVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
