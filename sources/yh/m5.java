package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class m5 {
    public final h5 f53104a;
    public final MessageObject f53105b;
    public final eo f53106c;
    public final sc d;
    public final mc f53107e;
    public final lc f53108f;
    public final boolean f53109g;
    public long h;
    public long f53112k;
    public boolean f53113l;
    public boolean f53114m;
    public w3 f53116o;
    public final k5 f53117p;
    public final n5 f53118q;
    public boolean f53110i = false;
    public boolean f53111j = false;
    public Long f53115n = null;

    public m5(n5 n5Var, h5 h5Var, MessageObject messageObject, eo eoVar, boolean z10) {
        this.f53118q = n5Var;
        k5 k5Var = new k5(this, 0);
        this.f53117p = k5Var;
        this.f53104a = h5Var;
        this.f53105b = messageObject;
        this.f53106c = eoVar;
        Context t10 = n5.t(eoVar);
        mc mcVar = new mc(t10, eoVar.f37256ea);
        this.f53107e = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        mcVar.f28522b.setText(d());
        qc qcVar = new qc(t10, eoVar.f37256ea, true, false);
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f29794a = new k5(this, 1);
        lc lcVar = new lc(t10, eoVar.f37256ea);
        this.f53108f = lcVar;
        lcVar.f28138b = 5000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, eoVar.f37256ea));
        qcVar.addView(lcVar, w7.w5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(eoVar).b(mcVar, -1);
        this.d = b10;
        b10.f30544r = false;
        if (z10) {
            b10.k(true);
            this.f53114m = true;
        }
        b10.v = k5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f53109g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        n5 n5Var = this.f53118q;
        int i10 = n5Var.f53146a;
        AndroidUtilities.cancelRunOnUIThread(this.f53117p);
        this.f53111j = true;
        this.d.b();
        w3 w3Var = this.f53116o;
        if (w3Var != null) {
            w3Var.c();
        }
        boolean z10 = this.f53109g;
        long c10 = c();
        MessageObject messageObject = this.f53105b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        n5Var.f53151g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (n5Var.B == this) {
            n5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f53117p);
        if (this.f53113l) {
            if (!this.f53110i && !this.f53111j) {
                n5 y3 = n5.y(this.f53118q.f53146a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f53118q.f53146a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f53118q.f53146a);
                long j3 = this.h;
                if (y3.f53149e && y3.q(false, false, null).amount < j3) {
                    this.f53111j = true;
                    this.f53105b.addPaidReactions((int) (-this.h), this.f53109g, c());
                    n5 n5Var = this.f53118q;
                    n5Var.f53151g = 0L;
                    NotificationCenter.getInstance(n5Var.f53146a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f53118q.f53146a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f53105b.getDialogId()), Integer.valueOf(this.f53105b.getId()), this.f53105b.messageOwner.reactions);
                    if (this.f53104a.f52872a >= 0) {
                        str = UserObject.getForcedFirstName(this.f53106c.getMessagesController().getUser(Long.valueOf(this.f53104a.f52872a)));
                    } else {
                        TLRPC.Chat chat = this.f53106c.getMessagesController().getChat(Long.valueOf(-this.f53104a.f52872a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f53106c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f53106c.getResourceProvider(), j3, 5, str2, new l5(this, j3, 0), 0L).show();
                } else {
                    this.f53110i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f53104a.f52872a);
                    tL_messages_sendPaidReaction.msg_id = this.f53104a.f52873b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f53118q.f53146a).getClientUserId()) {
                        if (c10 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = messagesController.getInputPeer(c10);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f53118q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f53111j = true;
            this.f53105b.addPaidReactions((int) (-this.h), this.f53109g, c());
            n5 n5Var2 = this.f53118q;
            n5Var2.f53151g -= this.h;
            NotificationCenter.getInstance(n5Var2.f53146a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        w3 w3Var = this.f53116o;
        if (w3Var != null && (messageObject = this.f53105b) != null && messageObject.getId() == w3Var.f53569c) {
            this.f53116o.c();
        }
        n5 n5Var3 = this.f53118q;
        if (n5Var3.B == this) {
            n5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f53115n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f53118q.A(this.f53105b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f53118q.f53146a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
