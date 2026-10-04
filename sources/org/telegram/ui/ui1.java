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
    public final int f41239a;
    public final Object f41240b;
    public final Object f41241c;

    public ui1(int i10, Object obj, Object obj2) {
        this.f41239a = i10;
        this.f41240b = obj;
        this.f41241c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41239a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g91(20, (vi1) this.f41240b, (int[]) this.f41241c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zr0((qg.n2) this.f41240b, tLObject, (qg.l2) this.f41241c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(tLObject, (MessagesController) this.f41240b, (tg.x0) this.f41241c, 29));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f41240b;
                ft ftVar = (ft) this.f41241c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20184id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, ftVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q((org.telegram.ui.Components.fs0) this.f41240b, tL_error, (org.telegram.ui.ActionBar.n2) this.f41241c));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q((xh.v3) this.f41240b, tLObject, (TL_stars.getResaleStarGifts) this.f41241c, 8));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q((yh.g) this.f41240b, tLObject, (Context) this.f41241c, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.f41240b, tLObject, (tg.q) this.f41241c, tL_error, 0));
                return;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f41241c, (yh.x3) this.f41240b);
                return;
            case 9:
                yh.x3.V0((yh.x3) this.f41240b, (org.telegram.ui.ActionBar.b2) this.f41241c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.f41240b, tLObject, tL_error, (Utilities.Callback) this.f41241c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.f41240b, tLObject, (Runnable) this.f41241c, 19));
                return;
        }
    }
}
