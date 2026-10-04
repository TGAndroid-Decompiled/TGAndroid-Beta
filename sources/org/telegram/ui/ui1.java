package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ui1 implements RequestDelegate {
    public final int f41240a;
    public final Object f41241b;
    public final Object f41242c;

    public ui1(int i10, Object obj, Object obj2) {
        this.f41240a = i10;
        this.f41241b = obj;
        this.f41242c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41240a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g91(20, (vi1) this.f41241b, (int[]) this.f41242c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zr0((qg.n2) this.f41241b, tLObject, (qg.l2) this.f41242c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(tLObject, (MessagesController) this.f41241b, (tg.x0) this.f41242c, 29));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f41241b;
                ft ftVar = (ft) this.f41242c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20185id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, ftVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q((org.telegram.ui.Components.fs0) this.f41241b, tL_error, (org.telegram.ui.ActionBar.n2) this.f41242c));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q((xh.v3) this.f41241b, tLObject, (TL_stars.getResaleStarGifts) this.f41242c, 8));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q((yh.g) this.f41241b, tLObject, (Context) this.f41242c, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.f41241b, tLObject, (tg.q) this.f41242c, tL_error, 0));
                return;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f41242c, (yh.x3) this.f41241b);
                return;
            case 9:
                yh.x3.V0((yh.x3) this.f41241b, (org.telegram.ui.ActionBar.b2) this.f41242c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.f41241b, tLObject, tL_error, (Utilities.Callback) this.f41242c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.f41241b, tLObject, (Runnable) this.f41242c, 19));
                return;
        }
    }
}
