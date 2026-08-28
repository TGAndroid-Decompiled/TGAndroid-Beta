package pf;

import android.text.TextUtils;
import ih.q5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.lg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.y01;
import org.telegram.ui.ai1;
public final class r1 {
    public static volatile r1[] f45764g = new r1[4];
    public static final Object[] h = new Object[4];
    public final int f45765a;
    public final ArrayList f45766b = new ArrayList();
    public final ArrayList f45767c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f45768e;
    public boolean f45769f;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            h[i9] = new Object();
        }
    }

    public r1(int i9) {
        this.f45765a = i9;
    }

    public static r1 f(int i9) {
        r1 r1Var;
        r1 r1Var2 = f45764g[i9];
        if (r1Var2 == null) {
            synchronized (h[i9]) {
                try {
                    r1Var = f45764g[i9];
                    if (r1Var == null) {
                        r1[] r1VarArr = f45764g;
                        r1 r1Var3 = new r1(i9);
                        r1VarArr[i9] = r1Var3;
                        r1Var = r1Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return r1Var;
        }
        return r1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        q1 q1Var;
        ArrayList arrayList = this.f45767c;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                q1Var = (q1) obj;
                if (TextUtils.equals(str, q1Var.f45757b)) {
                    break;
                }
            } else {
                q1Var = null;
                break;
            }
        }
        if (q1Var != null) {
            arrayList.remove(q1Var);
            NotificationCenter.getInstance(this.f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f45769f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final q1 c(long j10) {
        ArrayList arrayList = this.f45766b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            q1 q1Var = (q1) obj;
            if (q1Var.f45756a == j10) {
                return q1Var;
            }
        }
        return null;
    }

    public final q1 d(String str) {
        ArrayList arrayList = this.f45766b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            q1 q1Var = (q1) obj;
            if (TextUtils.equals(str, q1Var.f45757b)) {
                return q1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45766b;
            if (i9 < arrayList2.size()) {
                if (!g(((q1) arrayList2.get(i9)).f45757b)) {
                    arrayList.add((q1) arrayList2.get(i9));
                }
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: pf.r1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i9) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new y01(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i9, 13));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final r1 f45750b;

                {
                    this.f45750b = this;
                }

                @Override
                public final void run() {
                    q1 q1Var;
                    int i10;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.f45750b;
                            ArrayList arrayList2 = r1Var.f45766b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i11);
                                int i12 = 0;
                                while (true) {
                                    if (i12 < arrayList3.size()) {
                                        if (((q1) arrayList3.get(i12)).f45756a == tL_quickReply.shortcut_id) {
                                            q1Var = (q1) arrayList3.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        q1Var = null;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.f45756a = tL_quickReply.shortcut_id;
                                q1Var.f45757b = tL_quickReply.shortcut;
                                q1Var.f45760f = tL_quickReply.count;
                                q1Var.f45758c = i11;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.f45759e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.f45759e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.f45757b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            r1 r1Var2 = this.f45750b;
                            ArrayList arrayList4 = r1Var2.f45766b;
                            int i13 = r1Var2.f45765a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f45757b = tL_quickReply2.shortcut;
                                c10.f45760f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.f45759e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.f45759e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    return;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.f45756a = tL_quickReply2.shortcut_id;
                                q1Var2.f45757b = tL_quickReply2.shortcut;
                                q1Var2.f45760f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).f45758c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.f45757b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            r1 r1Var3 = this.f45750b;
                            int i15 = r1Var3.f45765a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.f45766b.remove(c11);
                                r1Var3.a(c11.f45757b);
                                int i16 = c11.f45756a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            r1 r1Var4 = this.f45750b;
                            int i17 = r1Var4.f45765a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f45760f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f45760f = size;
                                if (size <= 0) {
                                    r1Var4.f45766b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.f45759e;
                                if (messageObject3 != null) {
                                    i10 = messageObject3.getId();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i10)) && c12.f45759e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.f45759e = null;
                                long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final r1 f45750b;

                {
                    this.f45750b = this;
                }

                @Override
                public final void run() {
                    q1 q1Var;
                    int i10;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.f45750b;
                            ArrayList arrayList2 = r1Var.f45766b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i11);
                                int i12 = 0;
                                while (true) {
                                    if (i12 < arrayList3.size()) {
                                        if (((q1) arrayList3.get(i12)).f45756a == tL_quickReply.shortcut_id) {
                                            q1Var = (q1) arrayList3.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        q1Var = null;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.f45756a = tL_quickReply.shortcut_id;
                                q1Var.f45757b = tL_quickReply.shortcut;
                                q1Var.f45760f = tL_quickReply.count;
                                q1Var.f45758c = i11;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.f45759e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.f45759e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.f45757b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            r1 r1Var2 = this.f45750b;
                            ArrayList arrayList4 = r1Var2.f45766b;
                            int i13 = r1Var2.f45765a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f45757b = tL_quickReply2.shortcut;
                                c10.f45760f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.f45759e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.f45759e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    return;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.f45756a = tL_quickReply2.shortcut_id;
                                q1Var2.f45757b = tL_quickReply2.shortcut;
                                q1Var2.f45760f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).f45758c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.f45757b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            r1 r1Var3 = this.f45750b;
                            int i15 = r1Var3.f45765a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.f45766b.remove(c11);
                                r1Var3.a(c11.f45757b);
                                int i16 = c11.f45756a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            r1 r1Var4 = this.f45750b;
                            int i17 = r1Var4.f45765a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f45760f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f45760f = size;
                                if (size <= 0) {
                                    r1Var4.f45766b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.f45759e;
                                if (messageObject3 != null) {
                                    i10 = messageObject3.getId();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i10)) && c12.f45759e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.f45759e = null;
                                long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final r1 f45750b;

                {
                    this.f45750b = this;
                }

                @Override
                public final void run() {
                    q1 q1Var;
                    int i10;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.f45750b;
                            ArrayList arrayList2 = r1Var.f45766b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i11);
                                int i12 = 0;
                                while (true) {
                                    if (i12 < arrayList3.size()) {
                                        if (((q1) arrayList3.get(i12)).f45756a == tL_quickReply.shortcut_id) {
                                            q1Var = (q1) arrayList3.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        q1Var = null;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.f45756a = tL_quickReply.shortcut_id;
                                q1Var.f45757b = tL_quickReply.shortcut;
                                q1Var.f45760f = tL_quickReply.count;
                                q1Var.f45758c = i11;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.f45759e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.f45759e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.f45757b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            r1 r1Var2 = this.f45750b;
                            ArrayList arrayList4 = r1Var2.f45766b;
                            int i13 = r1Var2.f45765a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f45757b = tL_quickReply2.shortcut;
                                c10.f45760f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.f45759e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.f45759e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    return;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.f45756a = tL_quickReply2.shortcut_id;
                                q1Var2.f45757b = tL_quickReply2.shortcut;
                                q1Var2.f45760f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).f45758c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.f45757b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            r1 r1Var3 = this.f45750b;
                            int i15 = r1Var3.f45765a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.f45766b.remove(c11);
                                r1Var3.a(c11.f45757b);
                                int i16 = c11.f45756a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            r1 r1Var4 = this.f45750b;
                            int i17 = r1Var4.f45765a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f45760f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f45760f = size;
                                if (size <= 0) {
                                    r1Var4.f45766b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.f45759e;
                                if (messageObject3 != null) {
                                    i10 = messageObject3.getId();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i10)) && c12.f45759e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.f45759e = null;
                                long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final r1 f45750b;

                {
                    this.f45750b = this;
                }

                @Override
                public final void run() {
                    q1 q1Var;
                    int i10;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.f45750b;
                            ArrayList arrayList2 = r1Var.f45766b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i11);
                                int i12 = 0;
                                while (true) {
                                    if (i12 < arrayList3.size()) {
                                        if (((q1) arrayList3.get(i12)).f45756a == tL_quickReply.shortcut_id) {
                                            q1Var = (q1) arrayList3.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        q1Var = null;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.f45756a = tL_quickReply.shortcut_id;
                                q1Var.f45757b = tL_quickReply.shortcut;
                                q1Var.f45760f = tL_quickReply.count;
                                q1Var.f45758c = i11;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.f45759e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.f45759e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.f45757b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.f45765a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            r1 r1Var2 = this.f45750b;
                            ArrayList arrayList4 = r1Var2.f45766b;
                            int i13 = r1Var2.f45765a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f45757b = tL_quickReply2.shortcut;
                                c10.f45760f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.f45759e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.f45759e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    return;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.f45756a = tL_quickReply2.shortcut_id;
                                q1Var2.f45757b = tL_quickReply2.shortcut;
                                q1Var2.f45760f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).f45758c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.f45757b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            r1 r1Var3 = this.f45750b;
                            int i15 = r1Var3.f45765a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.f45766b.remove(c11);
                                r1Var3.a(c11.f45757b);
                                int i16 = c11.f45756a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            r1 r1Var4 = this.f45750b;
                            int i17 = r1Var4.f45765a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f45760f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f45760f = size;
                                if (size <= 0) {
                                    r1Var4.f45766b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.f45759e;
                                if (messageObject3 != null) {
                                    i10 = messageObject3.getId();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i10)) && c12.f45759e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.f45759e = null;
                                long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    public final void k(int i9, String str) {
        q1 c10 = c(i9);
        if (c10 == null) {
            return;
        }
        c10.f45757b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i9;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.f45765a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new q5(21));
        l();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45765a);
        messagesStorage.getStorageQueue().postRunnable(new ai1(17, this, messagesStorage));
    }
}
