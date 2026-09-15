package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xc;
public final class r1 implements Runnable {
    public final int f47693a;
    public final org.telegram.tgnet.e f47694b;
    public final xc[] f47695c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public r1(org.telegram.tgnet.e eVar, xc[] xcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f47693a = i10;
        this.f47694b = eVar;
        this.f47695c = xcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f47693a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        xc[] xcVarArr = this.f47695c;
        org.telegram.tgnet.e eVar = this.f47694b;
        switch (i10) {
            case 0:
                eVar.run(xcVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.run(xcVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
