package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class zt implements org.telegram.messenger.r20 {
    public final int f44087a;
    public final long f44088b;
    public final Object f44089c;
    public final Object d;

    public zt(Object obj, Object obj2, long j10, int i10) {
        this.f44087a = i10;
        this.f44089c = obj;
        this.d = obj2;
        this.f44088b = j10;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i10;
        switch (this.f44087a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f44089c;
                Long l4 = (Long) obj;
                org.telegram.messenger.i0.r((yt) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f44088b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.V = z10;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f33318a != null && (i10 = dataSettingsActivity.f33324s) >= 0) {
                    dataSettingsActivity.s0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.x1) this.d).r(150L);
                zx zxVar = ((bx) this.f44089c).f36128b;
                Boolean bool = zxVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    zxVar.getMessagesController().m(this.f44088b, zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H)), 0, null, zxVar, false, runnable, new hf(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.i0((ProfileActivity) this.f44089c, (Context) this.d, this.f44088b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f44089c;
                org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < wpVar.f19251t5) {
                    org.telegram.messenger.i3 G0 = wpVar.G0();
                    long j10 = this.f44088b;
                    G0.b(j10, tL_premium_boostsStatus, new ko(e4Var, tL_premium_boostsStatus, j10, wpVar));
                    return;
                }
                e4Var.f46815c2.setLoading(false);
                e4Var.t2(true);
                return;
        }
    }
}
