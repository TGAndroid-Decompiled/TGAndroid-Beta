package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bd;
public final class p1 implements Runnable {
    public final int f53212a;
    public final org.telegram.tgnet.e f53213b;
    public final bd[] f53214c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f53215e;

    public p1(org.telegram.tgnet.e eVar, bd[] bdVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f53212a = i10;
        this.f53213b = eVar;
        this.f53214c = bdVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f53215e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f53212a;
        String str = this.f53215e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        bd[] bdVarArr = this.f53214c;
        org.telegram.tgnet.e eVar = this.f53213b;
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
