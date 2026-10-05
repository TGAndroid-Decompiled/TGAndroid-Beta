package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class s1 implements Runnable {
    public final int f51955a;
    public final org.telegram.tgnet.e f51956b;
    public final ad[] f51957c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f51958e;

    public s1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f51955a = i10;
        this.f51956b = eVar;
        this.f51957c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f51958e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f51955a;
        String str = this.f51958e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f51957c;
        org.telegram.tgnet.e eVar = this.f51956b;
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
