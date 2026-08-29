package sf;

import android.text.TextUtils;
import java.util.ArrayList;
import lh.o5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.vs;
public final class s1 {
    public static volatile s1[] f47947g = new s1[4];
    public static final Object[] h = new Object[4];
    public final int f47948a;
    public final ArrayList f47949b = new ArrayList();
    public final ArrayList f47950c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f47951e;
    public boolean f47952f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public s1(int i10) {
        this.f47948a = i10;
    }

    public static s1 f(int i10) {
        s1 s1Var;
        s1 s1Var2 = f47947g[i10];
        if (s1Var2 == null) {
            synchronized (h[i10]) {
                try {
                    s1Var = f47947g[i10];
                    if (s1Var == null) {
                        s1[] s1VarArr = f47947g;
                        s1 s1Var3 = new s1(i10);
                        s1VarArr[i10] = s1Var3;
                        s1Var = s1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return s1Var;
        }
        return s1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        r1 r1Var;
        ArrayList arrayList = this.f47950c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                r1Var = (r1) obj;
                if (TextUtils.equals(str, r1Var.f47936b)) {
                    break;
                }
            } else {
                r1Var = null;
                break;
            }
        }
        if (r1Var != null) {
            arrayList.remove(r1Var);
            NotificationCenter.getInstance(this.f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f47952f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final r1 c(long j10) {
        ArrayList arrayList = this.f47949b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r1 r1Var = (r1) obj;
            if (r1Var.f47935a == j10) {
                return r1Var;
            }
        }
        return null;
    }

    public final r1 d(String str) {
        ArrayList arrayList = this.f47949b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r1 r1Var = (r1) obj;
            if (TextUtils.equals(str, r1Var.f47936b)) {
                return r1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47949b;
            if (i10 < arrayList2.size()) {
                if (!g(((r1) arrayList2.get(i10)).f47936b)) {
                    arrayList.add((r1) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: sf.s1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new vs(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 16));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final s1 f47931b;

                {
                    this.f47931b = this;
                }

                @Override
                public final void run() {
                    r1 r1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            s1 s1Var = this.f47931b;
                            ArrayList arrayList2 = s1Var.f47949b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((r1) arrayList3.get(i13)).f47935a == tL_quickReply.shortcut_id) {
                                            r1Var = (r1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        r1Var = null;
                                    }
                                }
                                if (r1Var == null) {
                                    r1Var = new r1();
                                }
                                r1Var.f47935a = tL_quickReply.shortcut_id;
                                r1Var.f47936b = tL_quickReply.shortcut;
                                r1Var.f47939f = tL_quickReply.count;
                                r1Var.f47937c = i12;
                                r1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = r1Var.f47938e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    r1Var.f47938e = null;
                                }
                                arrayList2.add(r1Var);
                                s1Var.a(r1Var.f47936b);
                            }
                            s1Var.l();
                            NotificationCenter.getInstance(s1Var.f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            s1 s1Var2 = this.f47931b;
                            ArrayList arrayList4 = s1Var2.f47949b;
                            int i14 = s1Var2.f47948a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            r1 c3 = s1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f47936b = tL_quickReply2.shortcut;
                                c3.f47939f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.f47938e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.f47938e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new sg(s1Var2, messagesStorage, c3, clientUserId));
                                    return;
                                }
                            } else {
                                r1 r1Var2 = new r1();
                                r1Var2.f47935a = tL_quickReply2.shortcut_id;
                                r1Var2.f47936b = tL_quickReply2.shortcut;
                                r1Var2.f47939f = tL_quickReply2.count;
                                r1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((r1) arrayList4.get(i15)).f47937c = i15;
                                }
                                arrayList4.add(r1Var2);
                                s1Var2.a(r1Var2.f47936b);
                            }
                            s1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            s1 s1Var3 = this.f47931b;
                            int i16 = s1Var3.f47948a;
                            r1 c6 = s1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c6 != null) {
                                s1Var3.f47949b.remove(c6);
                                s1Var3.a(c6.f47936b);
                                int i17 = c6.f47935a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new p1(messagesStorage2, i17, 0));
                                s1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            s1 s1Var4 = this.f47931b;
                            int i18 = s1Var4.f47948a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            r1 c10 = s1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c10 != null) {
                                int size = c10.f47939f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c10.f47939f = size;
                                if (size <= 0) {
                                    s1Var4.f47949b.remove(c10);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c10.f47938e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c10.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c10.f47938e != null) {
                                    s1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c10.f47938e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new sg(s1Var4, messagesStorage3, c10, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final s1 f47931b;

                {
                    this.f47931b = this;
                }

                @Override
                public final void run() {
                    r1 r1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            s1 s1Var = this.f47931b;
                            ArrayList arrayList2 = s1Var.f47949b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((r1) arrayList3.get(i13)).f47935a == tL_quickReply.shortcut_id) {
                                            r1Var = (r1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        r1Var = null;
                                    }
                                }
                                if (r1Var == null) {
                                    r1Var = new r1();
                                }
                                r1Var.f47935a = tL_quickReply.shortcut_id;
                                r1Var.f47936b = tL_quickReply.shortcut;
                                r1Var.f47939f = tL_quickReply.count;
                                r1Var.f47937c = i12;
                                r1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = r1Var.f47938e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    r1Var.f47938e = null;
                                }
                                arrayList2.add(r1Var);
                                s1Var.a(r1Var.f47936b);
                            }
                            s1Var.l();
                            NotificationCenter.getInstance(s1Var.f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            s1 s1Var2 = this.f47931b;
                            ArrayList arrayList4 = s1Var2.f47949b;
                            int i14 = s1Var2.f47948a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            r1 c3 = s1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f47936b = tL_quickReply2.shortcut;
                                c3.f47939f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.f47938e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.f47938e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new sg(s1Var2, messagesStorage, c3, clientUserId));
                                    return;
                                }
                            } else {
                                r1 r1Var2 = new r1();
                                r1Var2.f47935a = tL_quickReply2.shortcut_id;
                                r1Var2.f47936b = tL_quickReply2.shortcut;
                                r1Var2.f47939f = tL_quickReply2.count;
                                r1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((r1) arrayList4.get(i15)).f47937c = i15;
                                }
                                arrayList4.add(r1Var2);
                                s1Var2.a(r1Var2.f47936b);
                            }
                            s1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            s1 s1Var3 = this.f47931b;
                            int i16 = s1Var3.f47948a;
                            r1 c6 = s1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c6 != null) {
                                s1Var3.f47949b.remove(c6);
                                s1Var3.a(c6.f47936b);
                                int i17 = c6.f47935a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new p1(messagesStorage2, i17, 0));
                                s1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            s1 s1Var4 = this.f47931b;
                            int i18 = s1Var4.f47948a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            r1 c10 = s1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c10 != null) {
                                int size = c10.f47939f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c10.f47939f = size;
                                if (size <= 0) {
                                    s1Var4.f47949b.remove(c10);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c10.f47938e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c10.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c10.f47938e != null) {
                                    s1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c10.f47938e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new sg(s1Var4, messagesStorage3, c10, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final s1 f47931b;

                {
                    this.f47931b = this;
                }

                @Override
                public final void run() {
                    r1 r1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            s1 s1Var = this.f47931b;
                            ArrayList arrayList2 = s1Var.f47949b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((r1) arrayList3.get(i13)).f47935a == tL_quickReply.shortcut_id) {
                                            r1Var = (r1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        r1Var = null;
                                    }
                                }
                                if (r1Var == null) {
                                    r1Var = new r1();
                                }
                                r1Var.f47935a = tL_quickReply.shortcut_id;
                                r1Var.f47936b = tL_quickReply.shortcut;
                                r1Var.f47939f = tL_quickReply.count;
                                r1Var.f47937c = i12;
                                r1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = r1Var.f47938e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    r1Var.f47938e = null;
                                }
                                arrayList2.add(r1Var);
                                s1Var.a(r1Var.f47936b);
                            }
                            s1Var.l();
                            NotificationCenter.getInstance(s1Var.f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            s1 s1Var2 = this.f47931b;
                            ArrayList arrayList4 = s1Var2.f47949b;
                            int i14 = s1Var2.f47948a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            r1 c3 = s1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f47936b = tL_quickReply2.shortcut;
                                c3.f47939f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.f47938e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.f47938e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new sg(s1Var2, messagesStorage, c3, clientUserId));
                                    return;
                                }
                            } else {
                                r1 r1Var2 = new r1();
                                r1Var2.f47935a = tL_quickReply2.shortcut_id;
                                r1Var2.f47936b = tL_quickReply2.shortcut;
                                r1Var2.f47939f = tL_quickReply2.count;
                                r1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((r1) arrayList4.get(i15)).f47937c = i15;
                                }
                                arrayList4.add(r1Var2);
                                s1Var2.a(r1Var2.f47936b);
                            }
                            s1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            s1 s1Var3 = this.f47931b;
                            int i16 = s1Var3.f47948a;
                            r1 c6 = s1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c6 != null) {
                                s1Var3.f47949b.remove(c6);
                                s1Var3.a(c6.f47936b);
                                int i17 = c6.f47935a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new p1(messagesStorage2, i17, 0));
                                s1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            s1 s1Var4 = this.f47931b;
                            int i18 = s1Var4.f47948a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            r1 c10 = s1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c10 != null) {
                                int size = c10.f47939f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c10.f47939f = size;
                                if (size <= 0) {
                                    s1Var4.f47949b.remove(c10);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c10.f47938e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c10.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c10.f47938e != null) {
                                    s1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c10.f47938e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new sg(s1Var4, messagesStorage3, c10, clientUserId2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final s1 f47931b;

                {
                    this.f47931b = this;
                }

                @Override
                public final void run() {
                    r1 r1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            s1 s1Var = this.f47931b;
                            ArrayList arrayList2 = s1Var.f47949b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((r1) arrayList3.get(i13)).f47935a == tL_quickReply.shortcut_id) {
                                            r1Var = (r1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        r1Var = null;
                                    }
                                }
                                if (r1Var == null) {
                                    r1Var = new r1();
                                }
                                r1Var.f47935a = tL_quickReply.shortcut_id;
                                r1Var.f47936b = tL_quickReply.shortcut;
                                r1Var.f47939f = tL_quickReply.count;
                                r1Var.f47937c = i12;
                                r1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = r1Var.f47938e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    r1Var.f47938e = null;
                                }
                                arrayList2.add(r1Var);
                                s1Var.a(r1Var.f47936b);
                            }
                            s1Var.l();
                            NotificationCenter.getInstance(s1Var.f47948a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            s1 s1Var2 = this.f47931b;
                            ArrayList arrayList4 = s1Var2.f47949b;
                            int i14 = s1Var2.f47948a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            r1 c3 = s1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.f47936b = tL_quickReply2.shortcut;
                                c3.f47939f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.f47938e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.f47938e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new sg(s1Var2, messagesStorage, c3, clientUserId));
                                    return;
                                }
                            } else {
                                r1 r1Var2 = new r1();
                                r1Var2.f47935a = tL_quickReply2.shortcut_id;
                                r1Var2.f47936b = tL_quickReply2.shortcut;
                                r1Var2.f47939f = tL_quickReply2.count;
                                r1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((r1) arrayList4.get(i15)).f47937c = i15;
                                }
                                arrayList4.add(r1Var2);
                                s1Var2.a(r1Var2.f47936b);
                            }
                            s1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            s1 s1Var3 = this.f47931b;
                            int i16 = s1Var3.f47948a;
                            r1 c6 = s1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c6 != null) {
                                s1Var3.f47949b.remove(c6);
                                s1Var3.a(c6.f47936b);
                                int i17 = c6.f47935a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new p1(messagesStorage2, i17, 0));
                                s1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            s1 s1Var4 = this.f47931b;
                            int i18 = s1Var4.f47948a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            r1 c10 = s1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c10 != null) {
                                int size = c10.f47939f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c10.f47939f = size;
                                if (size <= 0) {
                                    s1Var4.f47949b.remove(c10);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c10.f47938e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c10.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c10.f47938e != null) {
                                    s1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c10.f47938e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new sg(s1Var4, messagesStorage3, c10, clientUserId2));
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
        r1 c3 = c(i10);
        if (c3 == null) {
            return;
        }
        c3.f47936b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f47948a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new o5(21));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f47948a);
        messagesStorage.getStorageQueue().postRunnable(new o1(this, messagesStorage));
    }
}
