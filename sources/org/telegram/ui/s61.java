package org.telegram.ui;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
public final class s61 implements Runnable {
    public final int f38202a;
    public final Object f38203b;
    public final Object f38204c;
    public final Object d;
    public final Object e;
    public final Object f38205f;

    public s61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f38202a = i10;
        this.d = obj;
        this.f38204c = obj2;
        this.f38203b = obj3;
        this.e = obj4;
        this.f38205f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.u1 u1Var;
        switch (this.f38202a) {
            case 0:
                b71 b71Var = (b71) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f38204c;
                TLObject tLObject = (TLObject) this.f38203b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f38205f;
                b71Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    b71Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ph.z7 z7Var = (ph.z7) this.d;
                TLObject tLObject2 = (TLObject) this.f38203b;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f38205f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f38204c;
                ph.f8 f8Var = z7Var.T;
                ((org.telegram.ui.ActionBar.d2) this.e).dismiss();
                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    org.telegram.ui.Components.jr[] jrVarArr = new org.telegram.ui.Components.jr[1];
                    Context context = z7Var.getContext();
                    int i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                    if (f8Var.I) {
                        u1Var = null;
                    } else {
                        u1Var = new org.telegram.ui.web.u1(7, z7Var, jrVarArr);
                    }
                    org.telegram.ui.Components.jr jrVar = new org.telegram.ui.Components.jr(context, i10, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, u1Var, new nh.b());
                    jrVarArr[0] = jrVar;
                    jrVar.show();
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.qc(f8Var.container, ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider).d0(tL_error2, true);
                    return;
                } else {
                    return;
                }
            case 2:
                ph.oa.a((ph.oa) this.d, (ViewGroup) this.f38204c, (org.telegram.ui.ActionBar.f6) this.f38203b, (org.telegram.ui.Components.ba) this.e, (View) this.f38205f);
                return;
            case 3:
                tf.l1 l1Var = (tf.l1) this.d;
                TLObject tLObject3 = (TLObject) this.f38203b;
                ArrayList arrayList = (ArrayList) this.e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f38205f;
                l1Var.getClass();
                String str = ((TLRPC.TL_messages_getStickers) this.f38204c).emoticon;
                tf.m1 m1Var = l1Var.f44788a;
                if (str.equals(m1Var.O)) {
                    m1Var.L = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i11);
                            if (longSparseArray.indexOfKey(document.f19190id) < 0) {
                                arrayList.add(document);
                            }
                        }
                        if (size != arrayList.size()) {
                            m1Var.F.put(arrayList, m1Var.O);
                            if (size == 0) {
                                m1Var.G.add(arrayList);
                            }
                            m1Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uf.p1 p1Var = (uf.p1) this.d;
                Runnable runnable = (Runnable) this.f38205f;
                p1Var.e = false;
                int i12 = p1Var.f45416a;
                MessagesController.getInstance(i12).putUsers((ArrayList) this.f38204c, true);
                MessagesController.getInstance(i12).putChats((ArrayList) this.f38203b, true);
                ArrayList arrayList2 = p1Var.f45417b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.e);
                if (runnable != null) {
                    runnable.run();
                } else {
                    p1Var.i(null, false);
                }
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                uf.p1 p1Var2 = (uf.p1) this.d;
                uf.o1 o1Var = (uf.o1) this.e;
                MessageObject messageObject = (MessageObject) this.f38205f;
                int i13 = p1Var2.f45416a;
                MessagesController.getInstance(i13).putUsers((ArrayList) this.f38204c, true);
                MessagesController.getInstance(i13).putChats((ArrayList) this.f38203b, true);
                o1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(o1Var.f45408b, o1Var.f45407a);
                }
                p1Var2.l();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            default:
                uf.p1 p1Var3 = (uf.p1) this.d;
                TLObject tLObject4 = (TLObject) this.f38203b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f38205f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f38204c;
                p1Var3.getClass();
                if (tLObject4 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList4 = ((TLRPC.TL_messages_messages) tLObject4).messages;
                    arrayList3.clear();
                    int size3 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        TLRPC.Message message = arrayList4.get(i14);
                        i14++;
                        arrayList3.add(Integer.valueOf(message.f19205id));
                    }
                    tL_messages_sendQuickReplyMessages.f19299id = arrayList3;
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(p1Var3.f45416a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                FileLog.e("received " + tLObject4 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                return;
        }
    }

    public s61(ph.z7 z7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.f38202a = 1;
        this.d = z7Var;
        this.e = d2Var;
        this.f38203b = tLObject;
        this.f38205f = getgroupcallstreamrtmpurl;
        this.f38204c = tL_error;
    }

    public s61(uf.p1 p1Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.f38202a = 6;
        this.d = p1Var;
        this.f38203b = tLObject;
        this.e = arrayList;
        this.f38205f = tL_messages_sendQuickReplyMessages;
        this.f38204c = tL_error;
    }
}
