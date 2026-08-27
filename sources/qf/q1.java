package qf;

import android.text.TextUtils;
import java.util.ArrayList;
import jh.m5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.xl;
import org.telegram.ui.xs;
import org.telegram.ui.zh1;

public final class q1 {

    public static volatile q1[] f46432g = new q1[4];
    public static final Object[] h = new Object[4];

    public final int f46433a;

    public final ArrayList f46434b = new ArrayList();

    public final ArrayList f46435c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public boolean f46436e;

    public boolean f46437f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public q1(int i10) {
        this.f46433a = i10;
    }

    public static q1 f(int i10) {
        q1 q1Var;
        q1 q1Var2 = f46432g[i10];
        if (q1Var2 != null) {
            return q1Var2;
        }
        synchronized (h[i10]) {
            try {
                q1Var = f46432g[i10];
                if (q1Var == null) {
                    q1[] q1VarArr = f46432g;
                    q1 q1Var3 = new q1(i10);
                    q1VarArr[i10] = q1Var3;
                    q1Var = q1Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        p1 p1Var;
        ArrayList arrayList = this.f46435c;
        int size = arrayList.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                p1Var = null;
                break;
            } else {
                Object obj = arrayList.get(i10);
                i10++;
                p1Var = (p1) obj;
            }
        } while (!TextUtils.equals(str, p1Var.f46419b));
        if (p1Var != null) {
            arrayList.remove(p1Var);
            NotificationCenter.getInstance(this.f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f46437f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final p1 c(long j10) {
        ArrayList arrayList = this.f46434b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p1 p1Var = (p1) obj;
            if (p1Var.f46418a == j10) {
                return p1Var;
            }
        }
        return null;
    }

    public final p1 d(String str) {
        ArrayList arrayList = this.f46434b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p1 p1Var = (p1) obj;
            if (TextUtils.equals(str, p1Var.f46419b)) {
                return p1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f46434b;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((p1) arrayList2.get(i10)).f46419b)) {
                arrayList.add((p1) arrayList2.get(i10));
            }
            i10++;
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(Runnable runnable, boolean z10) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        TLRPC.Message message;
        if (this.f46436e || this.f46437f) {
            return;
        }
        int i10 = 1;
        this.f46436e = true;
        int i11 = this.f46433a;
        if (z10) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new pg((Object) this, messagesStorage, UserConfig.getInstance(i11).getClientUserId(), runnable, 12));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j15 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f46434b;
            if (i13 >= arrayList.size()) {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getQuickReplies, new cf.a(this, 27));
                return;
            }
            p1 p1Var = (p1) arrayList.get(i13);
            long jCalcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, p1Var.f46418a);
            tL_messages_getQuickReplies.hash = jCalcHash;
            String str = p1Var.f46419b;
            if (str == null) {
                j10 = j15;
            } else {
                String strSubstring = Utilities.MD5(str).substring(i12, 16);
                int length = strSubstring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j16 = 16;
                if (j16 >= j15) {
                    long j17 = (Long.MAX_VALUE / j16) << i10;
                    j10 = j15;
                    j11 = j17 + ((long) ((((-1) - (j17 * j16)) ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? 1 : 0));
                } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                    j10 = j15;
                    j11 = j10;
                } else {
                    j11 = 1;
                    j10 = j15;
                }
                int i14 = (strSubstring.charAt(i12) != '+' || length <= i10) ? 0 : 1;
                long j18 = j10;
                while (i14 < length) {
                    int iDigit = Character.digit(strSubstring.charAt(i14), 16);
                    if (iDigit == -1) {
                        throw new NumberFormatException(strSubstring.toString());
                    }
                    if (j18 >= j10 && j18 <= j11) {
                        if (j18 == j11) {
                            if (j16 < j15) {
                                if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                                    j13 = -1;
                                } else {
                                    j12 = (-1) - j16;
                                }
                                if (iDigit <= ((int) j13)) {
                                }
                            } else {
                                long j19 = (-1) - (((Long.MAX_VALUE / j16) << 1) * j16);
                                j12 = j19 - ((j19 ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? j16 : j10);
                            }
                            j13 = j12;
                            if (iDigit <= ((int) j13)) {
                            }
                        } else {
                            i13 = i13;
                        }
                        j18 = (j18 * j16) + ((long) iDigit);
                        i14++;
                        i13 = i13;
                    }
                    throw new NumberFormatException("Too large for unsigned long: ".concat(strSubstring.toString()));
                }
                j15 = j18;
            }
            int i15 = i13;
            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, j15);
            tL_messages_getQuickReplies.hash = jCalcHash2;
            MessageObject messageObject = p1Var.f46421e;
            long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, messageObject == null ? j10 : messageObject.getId());
            tL_messages_getQuickReplies.hash = jCalcHash3;
            MessageObject messageObject2 = p1Var.f46421e;
            if (messageObject2 == null || (message = messageObject2.messageOwner) == null || (message.flags & 32768) == 0) {
                j14 = j10;
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, j14);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, message.edit_date);
                j14 = j10;
            }
            i13 = i15 + 1;
            j15 = j14;
            i10 = 1;
            i12 = 0;
        }
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new xs(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 14));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i11 = 0;
            b(new Runnable(this) {

                public final q1 f46410b;

                {
                    this.f46410b = this;
                }

                @Override
                public final void run() {
                    p1 p1Var;
                    switch (i11) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            q1 q1Var = this.f46410b;
                            ArrayList arrayList2 = q1Var.f46434b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList3.size()) {
                                        p1Var = null;
                                    } else if (((p1) arrayList3.get(i13)).f46418a == tL_quickReply.shortcut_id) {
                                        p1Var = (p1) arrayList3.get(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                if (p1Var == null) {
                                    p1Var = new p1();
                                }
                                p1Var.f46418a = tL_quickReply.shortcut_id;
                                p1Var.f46419b = tL_quickReply.shortcut;
                                p1Var.f46422f = tL_quickReply.count;
                                p1Var.f46420c = i12;
                                p1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = p1Var.f46421e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    p1Var.f46421e = null;
                                }
                                arrayList2.add(p1Var);
                                q1Var.a(p1Var.f46419b);
                            }
                            q1Var.l();
                            NotificationCenter.getInstance(q1Var.f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            q1 q1Var2 = this.f46410b;
                            ArrayList arrayList4 = q1Var2.f46434b;
                            int i14 = q1Var2.f46433a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            p1 p1VarC = q1Var2.c(tL_quickReply2.shortcut_id);
                            if (p1VarC != null) {
                                p1VarC.f46419b = tL_quickReply2.shortcut;
                                p1VarC.f46422f = tL_quickReply2.count;
                                p1VarC.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = p1VarC.f46421e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    p1VarC.f46421e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new pg(q1Var2, messagesStorage, p1VarC, clientUserId));
                                }
                            } else {
                                p1 p1Var2 = new p1();
                                p1Var2.f46418a = tL_quickReply2.shortcut_id;
                                p1Var2.f46419b = tL_quickReply2.shortcut;
                                p1Var2.f46422f = tL_quickReply2.count;
                                p1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((p1) arrayList4.get(i15)).f46420c = i15;
                                }
                                arrayList4.add(p1Var2);
                                q1Var2.a(p1Var2.f46419b);
                            }
                            q1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            q1 q1Var3 = this.f46410b;
                            int i16 = q1Var3.f46433a;
                            p1 p1VarC2 = q1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (p1VarC2 != null) {
                                q1Var3.f46434b.remove(p1VarC2);
                                q1Var3.a(p1VarC2.f46419b);
                                int i17 = p1VarC2.f46418a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new xl(messagesStorage2, i17, 27));
                                q1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            q1 q1Var4 = this.f46410b;
                            int i18 = q1Var4.f46433a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            p1 p1VarC3 = q1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (p1VarC3 != null) {
                                int size = p1VarC3.f46422f - tL_updateDeleteQuickReplyMessages.messages.size();
                                p1VarC3.f46422f = size;
                                if (size <= 0) {
                                    q1Var4.f46434b.remove(p1VarC3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = p1VarC3.f46421e;
                                if (arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : p1VarC3.d)) || p1VarC3.f46421e == null) {
                                    p1VarC3.f46421e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new pg(q1Var4, messagesStorage3, p1VarC3, clientUserId2));
                                } else {
                                    q1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i12 = 1;
            b(new Runnable(this) {

                public final q1 f46410b;

                {
                    this.f46410b = this;
                }

                @Override
                public final void run() {
                    p1 p1Var;
                    switch (i12) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            q1 q1Var = this.f46410b;
                            ArrayList arrayList2 = q1Var.f46434b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i13);
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= arrayList3.size()) {
                                        p1Var = null;
                                    } else if (((p1) arrayList3.get(i14)).f46418a == tL_quickReply.shortcut_id) {
                                        p1Var = (p1) arrayList3.get(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                                if (p1Var == null) {
                                    p1Var = new p1();
                                }
                                p1Var.f46418a = tL_quickReply.shortcut_id;
                                p1Var.f46419b = tL_quickReply.shortcut;
                                p1Var.f46422f = tL_quickReply.count;
                                p1Var.f46420c = i13;
                                p1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = p1Var.f46421e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    p1Var.f46421e = null;
                                }
                                arrayList2.add(p1Var);
                                q1Var.a(p1Var.f46419b);
                            }
                            q1Var.l();
                            NotificationCenter.getInstance(q1Var.f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            q1 q1Var2 = this.f46410b;
                            ArrayList arrayList4 = q1Var2.f46434b;
                            int i15 = q1Var2.f46433a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            p1 p1VarC = q1Var2.c(tL_quickReply2.shortcut_id);
                            if (p1VarC != null) {
                                p1VarC.f46419b = tL_quickReply2.shortcut;
                                p1VarC.f46422f = tL_quickReply2.count;
                                p1VarC.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = p1VarC.f46421e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    p1VarC.f46421e = null;
                                    long clientUserId = UserConfig.getInstance(i15).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                                    messagesStorage.getStorageQueue().postRunnable(new pg(q1Var2, messagesStorage, p1VarC, clientUserId));
                                }
                            } else {
                                p1 p1Var2 = new p1();
                                p1Var2.f46418a = tL_quickReply2.shortcut_id;
                                p1Var2.f46419b = tL_quickReply2.shortcut;
                                p1Var2.f46422f = tL_quickReply2.count;
                                p1Var2.d = tL_quickReply2.top_message;
                                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                                    ((p1) arrayList4.get(i16)).f46420c = i16;
                                }
                                arrayList4.add(p1Var2);
                                q1Var2.a(p1Var2.f46419b);
                            }
                            q1Var2.l();
                            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            q1 q1Var3 = this.f46410b;
                            int i17 = q1Var3.f46433a;
                            p1 p1VarC2 = q1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (p1VarC2 != null) {
                                q1Var3.f46434b.remove(p1VarC2);
                                q1Var3.a(p1VarC2.f46419b);
                                int i18 = p1VarC2.f46418a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i17);
                                messagesStorage2.getStorageQueue().postRunnable(new xl(messagesStorage2, i18, 27));
                                q1Var3.l();
                                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            q1 q1Var4 = this.f46410b;
                            int i19 = q1Var4.f46433a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            p1 p1VarC3 = q1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (p1VarC3 != null) {
                                int size = p1VarC3.f46422f - tL_updateDeleteQuickReplyMessages.messages.size();
                                p1VarC3.f46422f = size;
                                if (size <= 0) {
                                    q1Var4.f46434b.remove(p1VarC3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = p1VarC3.f46421e;
                                if (arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : p1VarC3.d)) || p1VarC3.f46421e == null) {
                                    p1VarC3.f46421e = null;
                                    long clientUserId2 = UserConfig.getInstance(i19).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i19);
                                    messagesStorage3.getStorageQueue().postRunnable(new pg(q1Var4, messagesStorage3, p1VarC3, clientUserId2));
                                } else {
                                    q1Var4.l();
                                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i13 = 2;
            b(new Runnable(this) {

                public final q1 f46410b;

                {
                    this.f46410b = this;
                }

                @Override
                public final void run() {
                    p1 p1Var;
                    switch (i13) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            q1 q1Var = this.f46410b;
                            ArrayList arrayList2 = q1Var.f46434b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i14);
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= arrayList3.size()) {
                                        p1Var = null;
                                    } else if (((p1) arrayList3.get(i15)).f46418a == tL_quickReply.shortcut_id) {
                                        p1Var = (p1) arrayList3.get(i15);
                                    } else {
                                        i15++;
                                    }
                                }
                                if (p1Var == null) {
                                    p1Var = new p1();
                                }
                                p1Var.f46418a = tL_quickReply.shortcut_id;
                                p1Var.f46419b = tL_quickReply.shortcut;
                                p1Var.f46422f = tL_quickReply.count;
                                p1Var.f46420c = i14;
                                p1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = p1Var.f46421e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    p1Var.f46421e = null;
                                }
                                arrayList2.add(p1Var);
                                q1Var.a(p1Var.f46419b);
                            }
                            q1Var.l();
                            NotificationCenter.getInstance(q1Var.f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            q1 q1Var2 = this.f46410b;
                            ArrayList arrayList4 = q1Var2.f46434b;
                            int i16 = q1Var2.f46433a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            p1 p1VarC = q1Var2.c(tL_quickReply2.shortcut_id);
                            if (p1VarC != null) {
                                p1VarC.f46419b = tL_quickReply2.shortcut;
                                p1VarC.f46422f = tL_quickReply2.count;
                                p1VarC.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = p1VarC.f46421e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    p1VarC.f46421e = null;
                                    long clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                                    messagesStorage.getStorageQueue().postRunnable(new pg(q1Var2, messagesStorage, p1VarC, clientUserId));
                                }
                            } else {
                                p1 p1Var2 = new p1();
                                p1Var2.f46418a = tL_quickReply2.shortcut_id;
                                p1Var2.f46419b = tL_quickReply2.shortcut;
                                p1Var2.f46422f = tL_quickReply2.count;
                                p1Var2.d = tL_quickReply2.top_message;
                                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                                    ((p1) arrayList4.get(i17)).f46420c = i17;
                                }
                                arrayList4.add(p1Var2);
                                q1Var2.a(p1Var2.f46419b);
                            }
                            q1Var2.l();
                            NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            q1 q1Var3 = this.f46410b;
                            int i18 = q1Var3.f46433a;
                            p1 p1VarC2 = q1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (p1VarC2 != null) {
                                q1Var3.f46434b.remove(p1VarC2);
                                q1Var3.a(p1VarC2.f46419b);
                                int i19 = p1VarC2.f46418a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i18);
                                messagesStorage2.getStorageQueue().postRunnable(new xl(messagesStorage2, i19, 27));
                                q1Var3.l();
                                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            q1 q1Var4 = this.f46410b;
                            int i110 = q1Var4.f46433a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            p1 p1VarC3 = q1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (p1VarC3 != null) {
                                int size = p1VarC3.f46422f - tL_updateDeleteQuickReplyMessages.messages.size();
                                p1VarC3.f46422f = size;
                                if (size <= 0) {
                                    q1Var4.f46434b.remove(p1VarC3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = p1VarC3.f46421e;
                                if (arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : p1VarC3.d)) || p1VarC3.f46421e == null) {
                                    p1VarC3.f46421e = null;
                                    long clientUserId2 = UserConfig.getInstance(i110).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i110);
                                    messagesStorage3.getStorageQueue().postRunnable(new pg(q1Var4, messagesStorage3, p1VarC3, clientUserId2));
                                } else {
                                    q1Var4.l();
                                    NotificationCenter.getInstance(i110).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i14 = 3;
        b(new Runnable(this) {

            public final q1 f46410b;

            {
                this.f46410b = this;
            }

            @Override
            public final void run() {
                p1 p1Var;
                switch (i14) {
                    case 0:
                        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        q1 q1Var = this.f46410b;
                        ArrayList arrayList2 = q1Var.f46434b;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList2.clear();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i15);
                            int i16 = 0;
                            while (true) {
                                if (i16 >= arrayList3.size()) {
                                    p1Var = null;
                                } else if (((p1) arrayList3.get(i16)).f46418a == tL_quickReply.shortcut_id) {
                                    p1Var = (p1) arrayList3.get(i16);
                                } else {
                                    i16++;
                                }
                            }
                            if (p1Var == null) {
                                p1Var = new p1();
                            }
                            p1Var.f46418a = tL_quickReply.shortcut_id;
                            p1Var.f46419b = tL_quickReply.shortcut;
                            p1Var.f46422f = tL_quickReply.count;
                            p1Var.f46420c = i15;
                            p1Var.d = tL_quickReply.top_message;
                            MessageObject messageObject = p1Var.f46421e;
                            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                p1Var.f46421e = null;
                            }
                            arrayList2.add(p1Var);
                            q1Var.a(p1Var.f46419b);
                        }
                        q1Var.l();
                        NotificationCenter.getInstance(q1Var.f46433a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 1:
                        q1 q1Var2 = this.f46410b;
                        ArrayList arrayList4 = q1Var2.f46434b;
                        int i17 = q1Var2.f46433a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        p1 p1VarC = q1Var2.c(tL_quickReply2.shortcut_id);
                        if (p1VarC != null) {
                            p1VarC.f46419b = tL_quickReply2.shortcut;
                            p1VarC.f46422f = tL_quickReply2.count;
                            p1VarC.d = tL_quickReply2.top_message;
                            MessageObject messageObject2 = p1VarC.f46421e;
                            if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                p1VarC.f46421e = null;
                                long clientUserId = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage = MessagesStorage.getInstance(i17);
                                messagesStorage.getStorageQueue().postRunnable(new pg(q1Var2, messagesStorage, p1VarC, clientUserId));
                            }
                        } else {
                            p1 p1Var2 = new p1();
                            p1Var2.f46418a = tL_quickReply2.shortcut_id;
                            p1Var2.f46419b = tL_quickReply2.shortcut;
                            p1Var2.f46422f = tL_quickReply2.count;
                            p1Var2.d = tL_quickReply2.top_message;
                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                ((p1) arrayList4.get(i18)).f46420c = i18;
                            }
                            arrayList4.add(p1Var2);
                            q1Var2.a(p1Var2.f46419b);
                        }
                        q1Var2.l();
                        NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 2:
                        q1 q1Var3 = this.f46410b;
                        int i19 = q1Var3.f46433a;
                        p1 p1VarC2 = q1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (p1VarC2 != null) {
                            q1Var3.f46434b.remove(p1VarC2);
                            q1Var3.a(p1VarC2.f46419b);
                            int i110 = p1VarC2.f46418a;
                            MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i19);
                            messagesStorage2.getStorageQueue().postRunnable(new xl(messagesStorage2, i110, 27));
                            q1Var3.l();
                            NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                        break;
                    default:
                        q1 q1Var4 = this.f46410b;
                        int i111 = q1Var4.f46433a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        p1 p1VarC3 = q1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (p1VarC3 != null) {
                            int size = p1VarC3.f46422f - tL_updateDeleteQuickReplyMessages.messages.size();
                            p1VarC3.f46422f = size;
                            if (size <= 0) {
                                q1Var4.f46434b.remove(p1VarC3);
                            }
                            ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                            MessageObject messageObject3 = p1VarC3.f46421e;
                            if (arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : p1VarC3.d)) || p1VarC3.f46421e == null) {
                                p1VarC3.f46421e = null;
                                long clientUserId2 = UserConfig.getInstance(i111).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i111);
                                messagesStorage3.getStorageQueue().postRunnable(new pg(q1Var4, messagesStorage3, p1VarC3, clientUserId2));
                            } else {
                                q1Var4.l();
                                NotificationCenter.getInstance(i111).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                        }
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i10, String str) {
        p1 p1VarC = c(i10);
        if (p1VarC == null) {
            return;
        }
        p1VarC.f46419b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f46433a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new m5(21));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f46433a);
        messagesStorage.getStorageQueue().postRunnable(new zh1(23, this, messagesStorage));
    }
}
