package zh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class q1 implements Runnable {
    public final int f52451a;
    public final org.telegram.tgnet.e f52452b;
    public final ad[] f52453c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f52454e;

    public q1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f52451a = i10;
        this.f52452b = eVar;
        this.f52453c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f52454e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f52451a;
        String str = this.f52454e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f52453c;
        org.telegram.tgnet.e eVar = this.f52452b;
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
