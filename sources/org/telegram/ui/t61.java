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
public final class t61 implements Runnable {
    public final int f41505a;
    public final Object f41506b;
    public final Object f41507c;
    public final Object d;
    public final Object f41508e;
    public final Object f41509f;

    public t61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f41505a = i10;
        this.d = obj;
        this.f41507c = obj2;
        this.f41506b = obj3;
        this.f41508e = obj4;
        this.f41509f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.v1 v1Var;
        switch (this.f41505a) {
            case 0:
                c71 c71Var = (c71) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f41507c;
                TLObject tLObject = (TLObject) this.f41506b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41508e;
                TLRPC.User user = (TLRPC.User) this.f41509f;
                c71Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    c71Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                qh.x7 x7Var = (qh.x7) this.d;
                TLObject tLObject2 = (TLObject) this.f41506b;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f41509f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f41507c;
                qh.d8 d8Var = x7Var.T;
                ((org.telegram.ui.ActionBar.d2) this.f41508e).dismiss();
                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    org.telegram.ui.Components.lr[] lrVarArr = new org.telegram.ui.Components.lr[1];
                    Context context = x7Var.getContext();
                    int W = qh.d8.W(d8Var);
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                    if (d8Var.I) {
                        v1Var = null;
                    } else {
                        v1Var = new org.telegram.ui.web.v1(7, x7Var, lrVarArr);
                    }
                    org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(context, W, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, v1Var, new oh.b());
                    lrVarArr[0] = lrVar;
                    lrVar.show();
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.qc(d8Var.container, qh.d8.X(d8Var)).d0(tL_error2, true);
                    return;
                } else {
                    return;
                }
            case 2:
                qh.ma.a((qh.ma) this.d, (ViewGroup) this.f41507c, (org.telegram.ui.ActionBar.g6) this.f41506b, (org.telegram.ui.Components.ba) this.f41508e, (View) this.f41509f);
                return;
            case 3:
                uf.l1 l1Var = (uf.l1) this.d;
                TLObject tLObject3 = (TLObject) this.f41506b;
                ArrayList arrayList = (ArrayList) this.f41508e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f41509f;
                l1Var.getClass();
                String str = ((TLRPC.TL_messages_getStickers) this.f41507c).emoticon;
                uf.m1 m1Var = l1Var.f48638a;
                if (str.equals(m1Var.O)) {
                    m1Var.L = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                            if (longSparseArray.indexOfKey(document.f20849id) < 0) {
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
                vf.p1 p1Var = (vf.p1) this.d;
                Runnable runnable = (Runnable) this.f41509f;
                p1Var.f49174e = false;
                int i11 = p1Var.f49171a;
                MessagesController.getInstance(i11).putUsers((ArrayList) this.f41507c, true);
                MessagesController.getInstance(i11).putChats((ArrayList) this.f41506b, true);
                ArrayList arrayList2 = p1Var.f49172b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.f41508e);
                if (runnable != null) {
                    runnable.run();
                } else {
                    p1Var.i(null, false);
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                vf.p1 p1Var2 = (vf.p1) this.d;
                vf.o1 o1Var = (vf.o1) this.f41508e;
                MessageObject messageObject = (MessageObject) this.f41509f;
                int i12 = p1Var2.f49171a;
                MessagesController.getInstance(i12).putUsers((ArrayList) this.f41507c, true);
                MessagesController.getInstance(i12).putChats((ArrayList) this.f41506b, true);
                o1Var.f49163e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(o1Var.f49161b, o1Var.f49160a);
                }
                p1Var2.l();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            default:
                vf.p1 p1Var3 = (vf.p1) this.d;
                TLObject tLObject4 = (TLObject) this.f41506b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.f41508e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f41509f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f41507c;
                p1Var3.getClass();
                if (tLObject4 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList4 = ((TLRPC.TL_messages_messages) tLObject4).messages;
                    arrayList3.clear();
                    int size3 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        arrayList3.add(Integer.valueOf(message.f20864id));
                    }
                    tL_messages_sendQuickReplyMessages.f20958id = arrayList3;
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(p1Var3.f49171a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                FileLog.e("received " + tLObject4 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                return;
        }
    }

    public t61(qh.x7 x7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.f41505a = 1;
        this.d = x7Var;
        this.f41508e = d2Var;
        this.f41506b = tLObject;
        this.f41509f = getgroupcallstreamrtmpurl;
        this.f41507c = tL_error;
    }

    public t61(vf.p1 p1Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.f41505a = 6;
        this.d = p1Var;
        this.f41506b = tLObject;
        this.f41508e = arrayList;
        this.f41509f = tL_messages_sendQuickReplyMessages;
        this.f41507c = tL_error;
    }
}
