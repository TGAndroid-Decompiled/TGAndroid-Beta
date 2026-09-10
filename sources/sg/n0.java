package sg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.vl0;
public final class n0 extends CountDownTimer {
    public final u0 f41959a;

    public n0(u0 u0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f41959a = u0Var;
    }

    @Override
    public final void onTick(long j3) {
        u0 u0Var = this.f41959a;
        vl0 vl0Var = u0Var.d;
        ArrayList arrayList = u0Var.Y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if (childAt instanceof wg.k) {
                    wg.k kVar = (wg.k) childAt;
                    if (arrayList2.contains(kVar.getBoost())) {
                        l5 l5Var = kVar.e;
                        f4 f4Var = kVar.d;
                        int i12 = kVar.I.cooldown_until_date;
                        if (i12 > 0) {
                            kVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, wg.k.f((i12 * 1000) - System.currentTimeMillis())));
                            f4Var.setAlpha(0.65f);
                            l5Var.setAlpha(0.65f);
                            kVar.i(0.3f, false);
                        } else {
                            kVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(kVar.I.expires * 1000))));
                            if (f4Var.getAlpha() < 1.0f) {
                                f4Var.animate().alpha(1.0f).start();
                                l5Var.animate().alpha(1.0f).start();
                                kVar.i(1.0f, true);
                            } else {
                                f4Var.setAlpha(1.0f);
                                l5Var.setAlpha(1.0f);
                                kVar.i(1.0f, false);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onFinish() {
    }
}
