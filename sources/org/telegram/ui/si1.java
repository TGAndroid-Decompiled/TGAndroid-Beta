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
    public final int f40512a;
    public final Object f40513b;
    public final Object f40514c;

    public si1(int i10, Object obj, Object obj2) {
        this.f40512a = i10;
        this.f40513b = obj;
        this.f40514c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40512a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e91(20, (ti1) this.f40513b, (int[]) this.f40514c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zr0((qg.n2) this.f40513b, tLObject, (qg.l2) this.f40514c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(tLObject, (MessagesController) this.f40513b, (tg.x0) this.f40514c, 29));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f40513b;
                ft ftVar = (ft) this.f40514c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20194id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, ftVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q((org.telegram.ui.Components.gs0) this.f40513b, tL_error, (org.telegram.ui.ActionBar.n2) this.f40514c));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q((xh.v3) this.f40513b, tLObject, (TL_stars.getResaleStarGifts) this.f40514c, 8));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q((yh.h) this.f40513b, tLObject, (Context) this.f40514c, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new zr0((yh.g) this.f40513b, tLObject, (String) this.f40514c, tL_error, 28));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yh.z0((yh.y3) this.f40513b, tLObject, (tg.q) this.f40514c, tL_error, 1));
                return;
            case 9:
                yh.y3.f1((yh.y3) this.f40513b, (TL_stars.InputSavedStarGift) this.f40514c, tLObject, tL_error);
                return;
            case 10:
                yh.y3.V0((yh.y3) this.f40513b, (org.telegram.ui.ActionBar.b2) this.f40514c, tLObject, tL_error);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new tg.q((yh.u5) this.f40513b, tLObject, tL_error, (Utilities.Callback) this.f40514c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.q((yh.u5) this.f40513b, tLObject, (Runnable) this.f40514c, 18));
                return;
        }
    }
}
