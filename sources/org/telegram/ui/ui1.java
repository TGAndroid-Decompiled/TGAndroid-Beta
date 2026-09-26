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
    public final int f38486a;
    public final Object f38487b;
    public final Object f38488c;

    public ui1(int i10, Object obj, Object obj2) {
        this.f38486a = i10;
        this.f38487b = obj;
        this.f38488c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38486a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p81(22, (vi1) this.f38487b, (int[]) this.f38488c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jr0((qg.n2) this.f38487b, tLObject, (qg.l2) this.f38488c, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dn0(tLObject, (MessagesController) this.f38487b, (tg.x0) this.f38488c, 28));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f38487b;
                bt btVar = (bt) this.f38488c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18482id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(24, btVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.as0) this.f38487b, tL_error, (org.telegram.ui.ActionBar.m2) this.f38488c, 4));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.v3) this.f38487b, tLObject, (TL_stars.getResaleStarGifts) this.f38488c, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.f38487b, tLObject, (Context) this.f38488c, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.f38487b, tLObject, (tg.r) this.f38488c, tL_error, 0));
                return;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f38488c, (yh.x3) this.f38487b);
                return;
            case 9:
                yh.x3.V0((yh.x3) this.f38487b, (org.telegram.ui.ActionBar.a2) this.f38488c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.f38487b, tLObject, tL_error, (Utilities.Callback) this.f38488c, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.f38487b, tLObject, (Runnable) this.f38488c, 18));
                return;
        }
    }
}
