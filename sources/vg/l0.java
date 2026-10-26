package vg;

import android.os.CountDownTimer;
import android.view.View;
import di.l4;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.mm0;
public final class l0 extends CountDownTimer {
    public final s0 f50198a;

    public l0(s0 s0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f50198a = s0Var;
    }

    @Override
    public final void onTick(long j10) {
        s0 s0Var = this.f50198a;
        mm0 mm0Var = s0Var.d;
        ArrayList arrayList = s0Var.Y;
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
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if (childAt instanceof zg.l) {
                    zg.l lVar = (zg.l) childAt;
                    if (arrayList2.contains(lVar.getBoost())) {
                        b6 b6Var = lVar.e;
                        l4 l4Var = lVar.d;
                        int i12 = lVar.J.cooldown_until_date;
                        if (i12 > 0) {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, zg.l.f((i12 * 1000) - System.currentTimeMillis())));
                            l4Var.setAlpha(0.65f);
                            b6Var.setAlpha(0.65f);
                            lVar.i(0.3f, false);
                        } else {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(lVar.J.expires * 1000))));
                            if (l4Var.getAlpha() < 1.0f) {
                                l4Var.animate().alpha(1.0f).start();
                                b6Var.animate().alpha(1.0f).start();
                                lVar.i(1.0f, true);
                            } else {
                                l4Var.setAlpha(1.0f);
                                b6Var.setAlpha(1.0f);
                                lVar.i(1.0f, false);
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
