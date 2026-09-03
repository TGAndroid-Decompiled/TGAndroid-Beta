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
public final class z61 implements Runnable {
    public final int f40412a;
    public final Object f40413b;
    public final Object f40414c;
    public final Object d;
    public final Object e;
    public final Object f40415f;

    public z61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f40412a = i10;
        this.d = obj;
        this.f40414c = obj2;
        this.f40413b = obj3;
        this.e = obj4;
        this.f40415f = obj5;
    }

    @Override
    public final void run() {
        ph.s1 s1Var;
        switch (this.f40412a) {
            case 0:
                i71 i71Var = (i71) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f40414c;
                TLObject tLObject = (TLObject) this.f40413b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f40415f;
                i71Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    i71Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ph.y7 y7Var = (ph.y7) this.d;
                TLObject tLObject2 = (TLObject) this.f40413b;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f40415f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f40414c;
                ph.e8 e8Var = y7Var.T;
                ((org.telegram.ui.ActionBar.d2) this.e).dismiss();
                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    org.telegram.ui.Components.ir[] irVarArr = new org.telegram.ui.Components.ir[1];
                    Context context = y7Var.getContext();
                    int W = ph.e8.W(e8Var);
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                    if (e8Var.I) {
                        s1Var = null;
                    } else {
                        s1Var = new ph.s1(5, y7Var, irVarArr);
                    }
                    org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context, W, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, s1Var, new nh.b());
                    irVarArr[0] = irVar;
                    irVar.show();
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.qc(e8Var.container, ph.e8.X(e8Var)).d0(tL_error2, true);
                    return;
                } else {
                    return;
                }
            case 2:
                ph.oa.a((ph.oa) this.d, (ViewGroup) this.f40414c, (org.telegram.ui.ActionBar.f6) this.f40413b, (org.telegram.ui.Components.ba) this.e, (View) this.f40415f);
                return;
            case 3:
                tf.l1 l1Var = (tf.l1) this.d;
                TLObject tLObject3 = (TLObject) this.f40413b;
                ArrayList arrayList = (ArrayList) this.e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f40415f;
                l1Var.getClass();
                String str = ((TLRPC.TL_messages_getStickers) this.f40414c).emoticon;
                tf.m1 m1Var = l1Var.f44850a;
                if (str.equals(m1Var.O)) {
                    m1Var.L = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                            if (longSparseArray.indexOfKey(document.f19165id) < 0) {
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
                Runnable runnable = (Runnable) this.f40415f;
                p1Var.e = false;
                int i11 = p1Var.f45481a;
                MessagesController.getInstance(i11).putUsers((ArrayList) this.f40414c, true);
                MessagesController.getInstance(i11).putChats((ArrayList) this.f40413b, true);
                ArrayList arrayList2 = p1Var.f45482b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.e);
                if (runnable != null) {
                    runnable.run();
                } else {
                    p1Var.i(null, false);
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                uf.p1 p1Var2 = (uf.p1) this.d;
                uf.o1 o1Var = (uf.o1) this.e;
                MessageObject messageObject = (MessageObject) this.f40415f;
                int i12 = p1Var2.f45481a;
                MessagesController.getInstance(i12).putUsers((ArrayList) this.f40414c, true);
                MessagesController.getInstance(i12).putChats((ArrayList) this.f40413b, true);
                o1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(o1Var.f45472b, o1Var.f45471a);
                }
                p1Var2.l();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            default:
                uf.p1 p1Var3 = (uf.p1) this.d;
                TLObject tLObject4 = (TLObject) this.f40413b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f40415f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f40414c;
                p1Var3.getClass();
                if (tLObject4 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList4 = ((TLRPC.TL_messages_messages) tLObject4).messages;
                    arrayList3.clear();
                    int size3 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        arrayList3.add(Integer.valueOf(message.f19180id));
                    }
                    tL_messages_sendQuickReplyMessages.f19274id = arrayList3;
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(p1Var3.f45481a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                FileLog.e("received " + tLObject4 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                return;
        }
    }

    public z61(ph.y7 y7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.f40412a = 1;
        this.d = y7Var;
        this.e = d2Var;
        this.f40413b = tLObject;
        this.f40415f = getgroupcallstreamrtmpurl;
        this.f40414c = tL_error;
    }

    public z61(uf.p1 p1Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.f40412a = 6;
        this.d = p1Var;
        this.f40413b = tLObject;
        this.e = arrayList;
        this.f40415f = tL_messages_sendQuickReplyMessages;
        this.f40414c = tL_error;
    }
}
