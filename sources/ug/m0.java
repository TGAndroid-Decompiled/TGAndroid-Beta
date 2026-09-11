package ug;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.ll0;
public final class m0 extends CountDownTimer {
    public final t0 f47151a;

    public m0(t0 t0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f47151a = t0Var;
    }

    @Override
    public final void onTick(long j3) {
        t0 t0Var = this.f47151a;
        ll0 ll0Var = t0Var.d;
        ArrayList arrayList = t0Var.Y;
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
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                View childAt = ll0Var.getChildAt(i11);
                if (childAt instanceof yg.l) {
                    yg.l lVar = (yg.l) childAt;
                    if (arrayList2.contains(lVar.getBoost())) {
                        j5 j5Var = lVar.f48508e;
                        bi.j5 j5Var2 = lVar.d;
                        int i12 = lVar.I.cooldown_until_date;
                        if (i12 > 0) {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, yg.l.f((i12 * 1000) - System.currentTimeMillis())));
                            j5Var2.setAlpha(0.65f);
                            j5Var.setAlpha(0.65f);
                            lVar.i(0.3f, false);
                        } else {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(lVar.I.expires * 1000))));
                            if (j5Var2.getAlpha() < 1.0f) {
                                j5Var2.animate().alpha(1.0f).start();
                                j5Var.animate().alpha(1.0f).start();
                                lVar.i(1.0f, true);
                            } else {
                                j5Var2.setAlpha(1.0f);
                                j5Var.setAlpha(1.0f);
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
