package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rx0 implements Runnable {
    public final int f42507a;
    public final Object f42508b;
    public final Object f42509c;
    public final Object d;
    public final Object f42510e;
    public final Object f42511f;

    public rx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f42507a = i9;
        this.f42508b = obj;
        this.f42509c = obj2;
        this.d = obj3;
        this.f42510e = obj4;
        this.f42511f = obj5;
    }

    @Override
    public final void run() {
        switch (this.f42507a) {
            case 0:
                ProfileActivity.W((ProfileActivity) this.f42508b, (TLObject) this.f42509c, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f42510e, (TLRPC.TL_error) this.f42511f);
                return;
            case 1:
                f01 f01Var = (f01) this.f42508b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f42510e;
                ArrayList arrayList3 = (ArrayList) this.f42511f;
                org.telegram.ui.ActionBar.o2 o2Var = f01Var.f38065e;
                if (((String) this.f42509c).equals(f01Var.f38072y)) {
                    if (!f01Var.f38070w && (o2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) o2Var).L.f28883b.getImageReceiver().startAnimation();
                            ((ProfileActivity) o2Var).L.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    f01Var.f38070w = true;
                    f01Var.f38068r = arrayList;
                    f01Var.f38069s = arrayList2;
                    f01Var.f38067n = arrayList3;
                    f01Var.l();
                    if (o2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) o2Var).L.f28883b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                b61 b61Var = (b61) this.f42508b;
                View view = (View) this.f42509c;
                b61Var.getClass();
                b61Var.p(view, Long.valueOf(((org.telegram.ui.Components.t5) this.d).documentId), (TLRPC.Document) this.f42510e, ((k51) this.f42511f).v, null);
                return;
            case 3:
                l61 l61Var = (l61) this.f42508b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42511f;
                TLObject tLObject = (TLObject) this.f42509c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                TLRPC.User user = (TLRPC.User) this.f42510e;
                l61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    l61Var.S(user, twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                pf.r1 r1Var = (pf.r1) this.f42508b;
                Runnable runnable = (Runnable) this.f42511f;
                r1Var.f45768e = false;
                int i9 = r1Var.f45765a;
                MessagesController.getInstance(i9).putUsers((ArrayList) this.f42509c, true);
                MessagesController.getInstance(i9).putChats((ArrayList) this.d, true);
                ArrayList arrayList4 = r1Var.f45766b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f42510e);
                if (runnable != null) {
                    runnable.run();
                } else {
                    r1Var.i(null, false);
                }
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                pf.r1 r1Var2 = (pf.r1) this.f42508b;
                pf.q1 q1Var = (pf.q1) this.f42510e;
                MessageObject messageObject = (MessageObject) this.f42511f;
                int i10 = r1Var2.f45765a;
                MessagesController.getInstance(i10).putUsers((ArrayList) this.f42509c, true);
                MessagesController.getInstance(i10).putChats((ArrayList) this.d, true);
                q1Var.f45759e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(q1Var.f45757b, q1Var.f45756a);
                }
                r1Var2.l();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            default:
                pf.r1 r1Var3 = (pf.r1) this.f42508b;
                TLObject tLObject2 = (TLObject) this.f42509c;
                ArrayList<Integer> arrayList5 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f42510e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f42511f;
                r1Var3.getClass();
                if (tLObject2 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList6 = ((TLRPC.TL_messages_messages) tLObject2).messages;
                    arrayList5.clear();
                    int size = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message = arrayList6.get(i11);
                        i11++;
                        arrayList5.add(Integer.valueOf(message.f22401id));
                    }
                    tL_messages_sendQuickReplyMessages.f22495id = arrayList5;
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(r1Var3.f45765a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                FileLog.e("received " + tLObject2 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                return;
        }
    }

    public rx0(l61 l61Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f42507a = 3;
        this.f42508b = l61Var;
        this.f42511f = tL_error;
        this.f42509c = tLObject;
        this.d = twoStepVerificationActivity;
        this.f42510e = user;
    }
}
