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
    public final int f38117a;
    public final Object f38118b;
    public final Object f38119c;

    public ui1(int i10, Object obj, Object obj2) {
        this.f38117a = i10;
        this.f38118b = obj;
        this.f38119c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38117a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hb1(17, (vi1) this.f38118b, (int[]) this.f38119c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yr0((qg.p2) this.f38118b, tLObject, (qg.n2) this.f38119c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(tLObject, (MessagesController) this.f38118b, (tg.y0) this.f38119c, 25));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f38118b;
                dt dtVar = (dt) this.f38119c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18230id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(19, dtVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new w9.v((org.telegram.ui.Components.nr0) this.f38118b, tL_error, (org.telegram.ui.ActionBar.n2) this.f38119c, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new w9.v((xh.v3) this.f38118b, tLObject, (TL_stars.getResaleStarGifts) this.f38119c, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new w9.v((yh.g) this.f38118b, tLObject, (Context) this.f38119c, 5));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yr0((yh.y3) this.f38118b, tLObject, (w9.v) this.f38119c, tL_error, 29));
                return;
            case 8:
                yh.y3.f1((yh.y3) this.f38118b, (TL_stars.InputSavedStarGift) this.f38119c, tLObject, tL_error);
                return;
            case 9:
                yh.y3.V0((yh.y3) this.f38118b, (org.telegram.ui.ActionBar.b2) this.f38119c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new w9.v((yh.t5) this.f38118b, tLObject, tL_error, (Utilities.Callback) this.f38119c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w9.v((yh.t5) this.f38118b, tLObject, (Runnable) this.f38119c, 15));
                return;
        }
    }
}
