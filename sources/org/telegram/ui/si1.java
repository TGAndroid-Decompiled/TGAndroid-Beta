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
public final class si1 implements RequestDelegate {
    public final int f37481a;
    public final Object f37482b;
    public final Object f37483c;

    public si1(int i10, Object obj, Object obj2) {
        this.f37481a = i10;
        this.f37482b = obj;
        this.f37483c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37481a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fb1(18, (ti1) this.f37482b, (int[]) this.f37483c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zr0((qg.n2) this.f37482b, tLObject, (qg.l2) this.f37483c, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.en0(tLObject, (MessagesController) this.f37482b, (tg.x0) this.f37483c, 28));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f37482b;
                et etVar = (et) this.f37483c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18476id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g2(22, etVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.bs0) this.f37482b, tL_error, (org.telegram.ui.ActionBar.o2) this.f37483c, 4));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.w3) this.f37482b, tLObject, (TL_stars.getResaleStarGifts) this.f37483c, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.f37482b, tLObject, (Context) this.f37483c, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.f37482b, tLObject, (tg.r) this.f37483c, tL_error, 0));
                return;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f37483c, (yh.x3) this.f37482b);
                return;
            case 9:
                yh.x3.V0((yh.x3) this.f37482b, (org.telegram.ui.ActionBar.c2) this.f37483c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.f37482b, tLObject, tL_error, (Utilities.Callback) this.f37483c, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.f37482b, tLObject, (Runnable) this.f37483c, 18));
                return;
        }
    }
}
