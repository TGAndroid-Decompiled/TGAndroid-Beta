package xg;

import android.os.CountDownTimer;
import android.view.View;
import ei.e4;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.tj0;
public final class l0 extends CountDownTimer {
    public final q0 f58726a;

    public l0(q0 q0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f58726a = q0Var;
    }

    @Override
    public final void onTick(long j10) {
        q0 q0Var = this.f58726a;
        tj0 tj0Var = q0Var.f36102l1;
        ArrayList arrayList = q0Var.R1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                View childAt = tj0Var.getChildAt(i10);
                if (childAt instanceof bh.p) {
                    bh.p pVar = (bh.p) childAt;
                    if (arrayList2.contains(pVar.getBoost())) {
                        k5 k5Var = pVar.f60475e;
                        e4 e4Var = pVar.d;
                        int i11 = pVar.K.cooldown_until_date;
                        if (i11 > 0) {
                            pVar.setSubtitle(bd.a0(null, null, 2131753594, bh.p.f((i11 * 1000) - System.currentTimeMillis())));
                            e4Var.setAlpha(0.65f);
                            k5Var.setAlpha(0.65f);
                            pVar.i(false, 0.3f);
                        } else {
                            pVar.setSubtitle(bd.a0(null, null, 2131753661, bd.E0().o0().format(new Date(pVar.K.expires * 1000))));
                            if (e4Var.getAlpha() < 1.0f) {
                                e4Var.animate().alpha(1.0f).start();
                                k5Var.animate().alpha(1.0f).start();
                                pVar.i(true, 1.0f);
                            } else {
                                e4Var.setAlpha(1.0f);
                                k5Var.setAlpha(1.0f);
                                pVar.i(false, 1.0f);
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
