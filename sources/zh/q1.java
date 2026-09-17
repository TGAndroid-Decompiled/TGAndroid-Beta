package zh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
public final class q1 implements Runnable {
    public final int f52452a;
    public final org.telegram.tgnet.e f52453b;
    public final ad[] f52454c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f52455e;

    public q1(org.telegram.tgnet.e eVar, ad[] adVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f52452a = i10;
        this.f52453b = eVar;
        this.f52454c = adVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f52455e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f52452a;
        String str = this.f52455e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ad[] adVarArr = this.f52454c;
        org.telegram.tgnet.e eVar = this.f52453b;
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
