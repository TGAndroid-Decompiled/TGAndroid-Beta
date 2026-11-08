package wg;

import android.os.CountDownTimer;
import android.view.View;
import di.d4;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.pj0;
public final class l0 extends CountDownTimer {
    public final q0 f57775a;

    public l0(q0 q0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f57775a = q0Var;
    }

    @Override
    public final void onTick(long j3) {
        q0 q0Var = this.f57775a;
        pj0 pj0Var = q0Var.f36277k1;
        ArrayList arrayList = q0Var.Q1;
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
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                if (childAt instanceof ah.r) {
                    ah.r rVar = (ah.r) childAt;
                    if (arrayList2.contains(rVar.getBoost())) {
                        k5 k5Var = rVar.f59435e;
                        d4 d4Var = rVar.d;
                        int i11 = rVar.J.cooldown_until_date;
                        if (i11 > 0) {
                            rVar.setSubtitle(id.a0(null, null, 2131753594, ah.r.f((i11 * 1000) - System.currentTimeMillis())));
                            d4Var.setAlpha(0.65f);
                            k5Var.setAlpha(0.65f);
                            rVar.i(false, 0.3f);
                        } else {
                            rVar.setSubtitle(id.a0(null, null, 2131753661, id.E0().o0().format(new Date(rVar.J.expires * 1000))));
                            if (d4Var.getAlpha() < 1.0f) {
                                d4Var.animate().alpha(1.0f).start();
                                k5Var.animate().alpha(1.0f).start();
                                rVar.i(true, 1.0f);
                            } else {
                                d4Var.setAlpha(1.0f);
                                k5Var.setAlpha(1.0f);
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
