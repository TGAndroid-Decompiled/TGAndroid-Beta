package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class r1 implements Runnable {
    public final int f47943a;
    public final org.telegram.tgnet.e f47944b;
    public final ad[] f47945c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public r1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f47943a = i10;
        this.f47944b = eVar;
        this.f47945c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f47943a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f47945c;
        org.telegram.tgnet.e eVar = this.f47944b;
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
