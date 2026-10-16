package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class re implements Runnable {
    public final int f39481a;
    public final fo f39482b;
    public final long f39483c;

    public re(long j10, fo foVar) {
        this.f39481a = 7;
        this.f39483c = j10;
        this.f39482b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f39481a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f39483c, r1, true, this.f39482b.classGuid);
                return;
            case 1:
                this.f39482b.getMessagesController().loadFullChat(this.f39483c, 0, true);
                return;
            case 2:
                fo foVar = this.f39482b;
                LongSparseIntArray longSparseIntArray = foVar.M5;
                long j10 = this.f39483c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.y31 y31Var = foVar.R1;
                if (y31Var != null) {
                    y31Var.setAllTopicsHidden(false);
                }
                if (j10 == foVar.f35616d4) {
                    foVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                fo foVar2 = this.f39482b;
                foVar2.getClass();
                foVar2.presentFragment(fo.W9(this.f39483c));
                return;
            case 4:
                fo foVar3 = this.f39482b;
                foVar3.getClass();
                foVar3.presentFragment(ProfileActivity.m4(this.f39483c));
                return;
            case 5:
                fo foVar4 = this.f39482b;
                org.telegram.ui.Components.sc v = org.telegram.ui.Components.zc.v(foVar4.getParentActivity(), foVar4, null, 1, this.f39483c, 1, foVar4.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), foVar4.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, true, null);
                v.f28806k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.zc.a0(this.f39482b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f39483c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f39482b.presentFragment(new ProfileActivity(t8.b.e(this.f39483c, "user_id"), null));
                return;
        }
    }

    public re(fo foVar, long j10, int i10) {
        this.f39481a = i10;
        this.f39482b = foVar;
        this.f39483c = j10;
    }
}
