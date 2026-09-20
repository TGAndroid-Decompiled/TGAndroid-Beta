package tg;

import ai.a6;
import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.vl0;
public final class l0 extends CountDownTimer {
    public final s0 f43446a;

    public l0(s0 s0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f43446a = s0Var;
    }

    @Override
    public final void onTick(long j3) {
        s0 s0Var = this.f43446a;
        vl0 vl0Var = s0Var.d;
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
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if (childAt instanceof xg.l) {
                    xg.l lVar = (xg.l) childAt;
                    if (arrayList2.contains(lVar.getBoost())) {
                        j5 j5Var = lVar.e;
                        a6 a6Var = lVar.d;
                        int i12 = lVar.I.cooldown_until_date;
                        if (i12 > 0) {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, xg.l.f((i12 * 1000) - System.currentTimeMillis())));
                            a6Var.setAlpha(0.65f);
                            j5Var.setAlpha(0.65f);
                            lVar.i(0.3f, false);
                        } else {
                            lVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(lVar.I.expires * 1000))));
                            if (a6Var.getAlpha() < 1.0f) {
                                a6Var.animate().alpha(1.0f).start();
                                j5Var.animate().alpha(1.0f).start();
                                lVar.i(1.0f, true);
                            } else {
                                a6Var.setAlpha(1.0f);
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
