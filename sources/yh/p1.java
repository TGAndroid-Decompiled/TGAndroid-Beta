package yh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cd;
public final class p1 implements Runnable {
    public final int f52986a;
    public final org.telegram.tgnet.e f52987b;
    public final cd[] f52988c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f52989e;

    public p1(org.telegram.tgnet.e eVar, cd[] cdVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f52986a = i10;
        this.f52987b = eVar;
        this.f52988c = cdVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f52989e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f52986a;
        String str = this.f52989e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        cd[] cdVarArr = this.f52988c;
        org.telegram.tgnet.e eVar = this.f52987b;
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
