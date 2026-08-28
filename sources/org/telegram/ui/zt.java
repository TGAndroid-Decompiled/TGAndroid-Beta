package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class zt implements Utilities.Callback {
    public final int f45247a;
    public final long f45248b;
    public final Object f45249c;
    public final Object d;

    public zt(Object obj, Object obj2, long j10, int i9) {
        this.f45247a = i9;
        this.f45249c = obj;
        this.d = obj2;
        this.f45248b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i9;
        switch (this.f45247a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f45249c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((yt) this.d);
                if (!dataSettingsActivity.S && System.currentTimeMillis() - this.f45248b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.S = z10;
                dataSettingsActivity.U = l10.longValue();
                dataSettingsActivity.T = false;
                if (dataSettingsActivity.f35454a != null && (i9 = dataSettingsActivity.f35461s) >= 0) {
                    dataSettingsActivity.m0(i9);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                dy dyVar = ((dx) this.f45249c).f37621b;
                Boolean bool = dyVar.C.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    dyVar.getMessagesController().addUserToChat(this.f45248b, dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D)), 0, null, dyVar, false, runnable, new bf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.j0((ProfileActivity) this.f45249c, (Context) this.d, this.f45248b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
