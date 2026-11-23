package wg;

import android.os.CountDownTimer;
import android.view.View;
import fi.u3;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.ek0;
public final class l0 extends CountDownTimer {
    public final q0 f59833a;

    public l0(q0 q0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f59833a = q0Var;
    }

    @Override
    public final void onTick(long j3) {
        q0 q0Var = this.f59833a;
        ek0 ek0Var = q0Var.f39532o1;
        ArrayList arrayList = q0Var.U1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                View childAt = ek0Var.getChildAt(i10);
                if (childAt instanceof ah.r) {
                    ah.r rVar = (ah.r) childAt;
                    if (arrayList2.contains(rVar.getBoost())) {
                        m5 m5Var = rVar.f61259e;
                        u3 u3Var = rVar.d;
                        int i11 = rVar.K.cooldown_until_date;
                        if (i11 > 0) {
                            rVar.setSubtitle(hd.a0(null, null, 2131753591, ah.r.f((i11 * 1000) - System.currentTimeMillis())));
                            u3Var.setAlpha(0.65f);
                            m5Var.setAlpha(0.65f);
                            rVar.i(false, 0.3f);
                        } else {
                            rVar.setSubtitle(hd.a0(null, null, 2131753658, hd.E0().o0().format(new Date(rVar.K.expires * 1000))));
                            if (u3Var.getAlpha() < 1.0f) {
                                u3Var.animate().alpha(1.0f).start();
                                m5Var.animate().alpha(1.0f).start();
                                rVar.i(true, 1.0f);
                            } else {
                                u3Var.setAlpha(1.0f);
                                m5Var.setAlpha(1.0f);
                                rVar.i(false, 1.0f);
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
