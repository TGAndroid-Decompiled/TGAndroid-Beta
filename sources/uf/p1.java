package uf;

import android.text.TextUtils;
import java.util.ArrayList;
import nh.p5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.di;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.et;
import ph.i8;
public final class p1 {
    public static volatile p1[] f45480g = new p1[4];
    public static final Object[] h = new Object[4];
    public final int f45481a;
    public final ArrayList f45482b = new ArrayList();
    public final ArrayList f45483c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f45484f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public p1(int i10) {
        this.f45481a = i10;
    }

    public static p1 f(int i10) {
        p1 p1Var;
        p1 p1Var2 = f45480g[i10];
        if (p1Var2 == null) {
            synchronized (h[i10]) {
                try {
                    p1Var = f45480g[i10];
                    if (p1Var == null) {
                        p1[] p1VarArr = f45480g;
                        p1 p1Var3 = new p1(i10);
                        p1VarArr[i10] = p1Var3;
                        p1Var = p1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return p1Var;
        }
        return p1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        o1 o1Var;
        ArrayList arrayList = this.f45483c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o1Var = (o1) obj;
                if (TextUtils.equals(str, o1Var.f45472b)) {
                    break;
                }
            } else {
                o1Var = null;
                break;
            }
        }
        if (o1Var != null) {
            arrayList.remove(o1Var);
            NotificationCenter.getInstance(this.f45481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f45484f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final o1 c(long j10) {
        ArrayList arrayList = this.f45482b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            if (o1Var.f45471a == j10) {
                return o1Var;
            }
        }
        return null;
    }

    public final o1 d(String str) {
        ArrayList arrayList = this.f45482b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            if (TextUtils.equals(str, o1Var.f45472b)) {
                return o1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45482b;
            if (i10 < arrayList2.size()) {
                if (!g(((o1) arrayList2.get(i10)).f45472b)) {
                    arrayList.add((o1) arrayList2.get(i10));
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: uf.p1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new et(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 17));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final p1 f45462b;

                {
                    this.f45462b = this;
                }

                @Override
                public final void run() {
                    o1 o1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.f45462b;
                            ArrayList arrayList2 = p1Var.f45482b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((o1) arrayList3.get(i13)).f45471a == tL_quickReply.shortcut_id) {
                                            o1Var = (o1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        o1Var = null;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.f45471a = tL_quickReply.shortcut_id;
                                o1Var.f45472b = tL_quickReply.shortcut;
                                o1Var.f45474f = tL_quickReply.count;
                                o1Var.f45473c = i12;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.f45472b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.f45481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            p1 p1Var2 = this.f45462b;
                            ArrayList arrayList4 = p1Var2.f45482b;
                            int i14 = p1Var2.f45481a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f45472b = tL_quickReply2.shortcut;
                                c3.f45474f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new di(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    return;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.f45471a = tL_quickReply2.shortcut_id;
                                o1Var2.f45472b = tL_quickReply2.shortcut;
                                o1Var2.f45474f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).f45473c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.f45472b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            p1 p1Var3 = this.f45462b;
                            int i16 = p1Var3.f45481a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.f45482b.remove(c10);
                                p1Var3.a(c10.f45472b);
                                int i17 = c10.f45471a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new i8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            p1 p1Var4 = this.f45462b;
                            int i18 = p1Var4.f45481a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f45474f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f45474f = size;
                                if (size <= 0) {
                                    p1Var4.f45482b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c11.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c11.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new di(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final p1 f45462b;

                {
                    this.f45462b = this;
                }

                @Override
                public final void run() {
                    o1 o1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.f45462b;
                            ArrayList arrayList2 = p1Var.f45482b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((o1) arrayList3.get(i13)).f45471a == tL_quickReply.shortcut_id) {
                                            o1Var = (o1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        o1Var = null;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.f45471a = tL_quickReply.shortcut_id;
                                o1Var.f45472b = tL_quickReply.shortcut;
                                o1Var.f45474f = tL_quickReply.count;
                                o1Var.f45473c = i12;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.f45472b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.f45481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            p1 p1Var2 = this.f45462b;
                            ArrayList arrayList4 = p1Var2.f45482b;
                            int i14 = p1Var2.f45481a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f45472b = tL_quickReply2.shortcut;
                                c3.f45474f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new di(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    return;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.f45471a = tL_quickReply2.shortcut_id;
                                o1Var2.f45472b = tL_quickReply2.shortcut;
                                o1Var2.f45474f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).f45473c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.f45472b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            p1 p1Var3 = this.f45462b;
                            int i16 = p1Var3.f45481a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.f45482b.remove(c10);
                                p1Var3.a(c10.f45472b);
                                int i17 = c10.f45471a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new i8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            p1 p1Var4 = this.f45462b;
                            int i18 = p1Var4.f45481a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f45474f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f45474f = size;
                                if (size <= 0) {
                                    p1Var4.f45482b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c11.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c11.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new di(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final p1 f45462b;

                {
                    this.f45462b = this;
                }

                @Override
                public final void run() {
                    o1 o1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.f45462b;
                            ArrayList arrayList2 = p1Var.f45482b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((o1) arrayList3.get(i13)).f45471a == tL_quickReply.shortcut_id) {
                                            o1Var = (o1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        o1Var = null;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.f45471a = tL_quickReply.shortcut_id;
                                o1Var.f45472b = tL_quickReply.shortcut;
                                o1Var.f45474f = tL_quickReply.count;
                                o1Var.f45473c = i12;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.f45472b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.f45481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            p1 p1Var2 = this.f45462b;
                            ArrayList arrayList4 = p1Var2.f45482b;
                            int i14 = p1Var2.f45481a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f45472b = tL_quickReply2.shortcut;
                                c3.f45474f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new di(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    return;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.f45471a = tL_quickReply2.shortcut_id;
                                o1Var2.f45472b = tL_quickReply2.shortcut;
                                o1Var2.f45474f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).f45473c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.f45472b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            p1 p1Var3 = this.f45462b;
                            int i16 = p1Var3.f45481a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.f45482b.remove(c10);
                                p1Var3.a(c10.f45472b);
                                int i17 = c10.f45471a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new i8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            p1 p1Var4 = this.f45462b;
                            int i18 = p1Var4.f45481a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f45474f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f45474f = size;
                                if (size <= 0) {
                                    p1Var4.f45482b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c11.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c11.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new di(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final p1 f45462b;

                {
                    this.f45462b = this;
                }

                @Override
                public final void run() {
                    o1 o1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.f45462b;
                            ArrayList arrayList2 = p1Var.f45482b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((o1) arrayList3.get(i13)).f45471a == tL_quickReply.shortcut_id) {
                                            o1Var = (o1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        o1Var = null;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.f45471a = tL_quickReply.shortcut_id;
                                o1Var.f45472b = tL_quickReply.shortcut;
                                o1Var.f45474f = tL_quickReply.count;
                                o1Var.f45473c = i12;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.f45472b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.f45481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            p1 p1Var2 = this.f45462b;
                            ArrayList arrayList4 = p1Var2.f45482b;
                            int i14 = p1Var2.f45481a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f45472b = tL_quickReply2.shortcut;
                                c3.f45474f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new di(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    return;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.f45471a = tL_quickReply2.shortcut_id;
                                o1Var2.f45472b = tL_quickReply2.shortcut;
                                o1Var2.f45474f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).f45473c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.f45472b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            p1 p1Var3 = this.f45462b;
                            int i16 = p1Var3.f45481a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.f45482b.remove(c10);
                                p1Var3.a(c10.f45472b);
                                int i17 = c10.f45471a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new i8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            p1 p1Var4 = this.f45462b;
                            int i18 = p1Var4.f45481a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f45474f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f45474f = size;
                                if (size <= 0) {
                                    p1Var4.f45482b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c11.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c11.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new di(p1Var4, messagesStorage3, c11, clientUserId2, 13));
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

    public final void k(int i10, String str) {
        o1 c3 = c(i10);
        if (c3 == null) {
            return;
        }
        c3.f45472b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f45481a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new p5(21));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45481a);
        messagesStorage.getStorageQueue().postRunnable(new d0(4, this, messagesStorage));
    }
}
