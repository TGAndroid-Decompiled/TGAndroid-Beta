package wg;

import android.os.CountDownTimer;
import android.view.View;
import fi.w3;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.uj0;
public final class j0 extends CountDownTimer {
    public final o0 f59197a;

    public j0(o0 o0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f59197a = o0Var;
    }

    @Override
    public final void onTick(long j3) {
        o0 o0Var = this.f59197a;
        uj0 uj0Var = o0Var.f35931o1;
        ArrayList arrayList = o0Var.U1;
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
            for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                View childAt = uj0Var.getChildAt(i10);
                if (childAt instanceof ah.r) {
                    ah.r rVar = (ah.r) childAt;
                    if (arrayList2.contains(rVar.getBoost())) {
                        j5 j5Var = rVar.f60646e;
                        w3 w3Var = rVar.d;
                        int i11 = rVar.K.cooldown_until_date;
                        if (i11 > 0) {
                            rVar.setSubtitle(hd.a0(null, null, 2131753594, ah.r.f((i11 * 1000) - System.currentTimeMillis())));
                            w3Var.setAlpha(0.65f);
                            j5Var.setAlpha(0.65f);
                            rVar.i(false, 0.3f);
                        } else {
                            rVar.setSubtitle(hd.a0(null, null, 2131753661, hd.E0().o0().format(new Date(rVar.K.expires * 1000))));
                            if (w3Var.getAlpha() < 1.0f) {
                                w3Var.animate().alpha(1.0f).start();
                                j5Var.animate().alpha(1.0f).start();
                                rVar.i(true, 1.0f);
                            } else {
                                w3Var.setAlpha(1.0f);
                                j5Var.setAlpha(1.0f);
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
