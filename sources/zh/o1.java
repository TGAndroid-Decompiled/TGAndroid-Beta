package zh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bd;
public final class o1 implements Runnable {
    public final int f50897a;
    public final org.telegram.tgnet.e f50898b;
    public final bd[] f50899c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public o1(org.telegram.tgnet.e eVar, bd[] bdVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f50897a = i10;
        this.f50898b = eVar;
        this.f50899c = bdVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f50897a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        bd[] bdVarArr = this.f50899c;
        org.telegram.tgnet.e eVar = this.f50898b;
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
