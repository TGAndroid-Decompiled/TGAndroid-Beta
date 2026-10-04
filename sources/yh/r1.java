package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class r1 implements Runnable {
    public final int f51882a;
    public final org.telegram.tgnet.e f51883b;
    public final ad[] f51884c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f51885e;

    public r1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f51882a = i10;
        this.f51883b = eVar;
        this.f51884c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f51885e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f51882a;
        String str = this.f51885e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f51884c;
        org.telegram.tgnet.e eVar = this.f51883b;
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
