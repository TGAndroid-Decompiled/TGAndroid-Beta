package ug;

import android.os.CountDownTimer;
import android.view.View;
import ci.k4;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.im0;
public final class k0 extends CountDownTimer {
    public final r0 f47692a;

    public k0(r0 r0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f47692a = r0Var;
    }

    @Override
    public final void onTick(long j10) {
        r0 r0Var = this.f47692a;
        im0 im0Var = r0Var.d;
        ArrayList arrayList = r0Var.Y;
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
            for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
                View childAt = im0Var.getChildAt(i11);
                if (childAt instanceof yg.k) {
                    yg.k kVar = (yg.k) childAt;
                    if (arrayList2.contains(kVar.getBoost())) {
                        j5 j5Var = kVar.e;
                        k4 k4Var = kVar.d;
                        int i12 = kVar.J.cooldown_until_date;
                        if (i12 > 0) {
                            kVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, yg.k.f((i12 * 1000) - System.currentTimeMillis())));
                            k4Var.setAlpha(0.65f);
                            j5Var.setAlpha(0.65f);
                            kVar.i(0.3f, false);
                        } else {
                            kVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(kVar.J.expires * 1000))));
                            if (k4Var.getAlpha() < 1.0f) {
                                k4Var.animate().alpha(1.0f).start();
                                j5Var.animate().alpha(1.0f).start();
                                kVar.i(1.0f, true);
                            } else {
                                k4Var.setAlpha(1.0f);
                                j5Var.setAlpha(1.0f);
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
