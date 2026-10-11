package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cd;
public final class p1 implements Runnable {
    public final int f53075a;
    public final org.telegram.tgnet.e f53076b;
    public final cd[] f53077c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f53078e;

    public p1(org.telegram.tgnet.e eVar, cd[] cdVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f53075a = i10;
        this.f53076b = eVar;
        this.f53077c = cdVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f53078e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f53075a;
        String str = this.f53078e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        cd[] cdVarArr = this.f53077c;
        org.telegram.tgnet.e eVar = this.f53076b;
        switch (i10) {
            case 0:
                eVar.run(cdVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.run(cdVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
