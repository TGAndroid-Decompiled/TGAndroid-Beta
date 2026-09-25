package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zc;
public final class r1 implements Runnable {
    public final int f47942a;
    public final org.telegram.tgnet.e f47943b;
    public final zc[] f47944c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public r1(org.telegram.tgnet.e eVar, zc[] zcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f47942a = i10;
        this.f47943b = eVar;
        this.f47944c = zcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f47942a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        zc[] zcVarArr = this.f47944c;
        org.telegram.tgnet.e eVar = this.f47943b;
        switch (i10) {
            case 0:
                eVar.run(zcVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.run(zcVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
