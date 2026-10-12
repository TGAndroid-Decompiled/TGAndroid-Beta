package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bd;
public final class p1 implements Runnable {
    public final int f53224a;
    public final org.telegram.tgnet.e f53225b;
    public final bd[] f53226c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f53227e;

    public p1(org.telegram.tgnet.e eVar, bd[] bdVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f53224a = i10;
        this.f53225b = eVar;
        this.f53226c = bdVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f53227e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f53224a;
        String str = this.f53227e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        bd[] bdVarArr = this.f53226c;
        org.telegram.tgnet.e eVar = this.f53225b;
        switch (i10) {
            case 0:
                eVar.run(bdVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.run(bdVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
