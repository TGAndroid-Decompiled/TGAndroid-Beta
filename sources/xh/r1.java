package xh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yc;
public final class r1 implements Runnable {
    public final int f45949a;
    public final org.telegram.tgnet.g f45950b;
    public final yc[] f45951c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public r1(org.telegram.tgnet.g gVar, yc[] ycVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f45949a = i10;
        this.f45950b = gVar;
        this.f45951c = ycVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f45949a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        yc[] ycVarArr = this.f45951c;
        org.telegram.tgnet.g gVar = this.f45950b;
        switch (i10) {
            case 0:
                gVar.run(ycVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                gVar.run(ycVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
