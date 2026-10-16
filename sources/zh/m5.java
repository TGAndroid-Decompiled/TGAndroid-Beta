package zh;

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
import org.telegram.ui.fo;
public final class m5 {
    public final h5 f50824a;
    public final MessageObject f50825b;
    public final fo f50826c;
    public final sc d;
    public final mc e;
    public final lc f50827f;
    public final boolean f50828g;
    public long h;
    public long f50831k;
    public boolean f50832l;
    public boolean f50833m;
    public v3 f50835o;
    public final k5 f50836p;
    public final n5 f50837q;
    public boolean f50829i = false;
    public boolean f50830j = false;
    public Long f50834n = null;

    public m5(n5 n5Var, h5 h5Var, MessageObject messageObject, fo foVar, boolean z10) {
        this.f50837q = n5Var;
        k5 k5Var = new k5(this, 0);
        this.f50836p = k5Var;
        this.f50824a = h5Var;
        this.f50825b = messageObject;
        this.f50826c = foVar;
        Context t10 = n5.t(foVar);
        mc mcVar = new mc(t10, foVar.f35633ea);
        this.e = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        mcVar.f27066b.setText(d());
        qc qcVar = new qc(t10, foVar.f35633ea, true, false);
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f28266a = new k5(this, 1);
        lc lcVar = new lc(t10, foVar.f35633ea);
        this.f50827f = lcVar;
        lcVar.f26719b = 5000L;
        lcVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, foVar.f35633ea));
        qcVar.addView(lcVar, w7.z5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(foVar).b(mcVar, -1);
        this.d = b10;
        b10.f28813r = false;
        if (z10) {
            b10.k(true);
            this.f50833m = true;
        }
        b10.v = k5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f50828g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        n5 n5Var = this.f50837q;
        int i10 = n5Var.f50865a;
        AndroidUtilities.cancelRunOnUIThread(this.f50836p);
        this.f50830j = true;
        this.d.b();
        v3 v3Var = this.f50835o;
        if (v3Var != null) {
            v3Var.c();
        }
        boolean z10 = this.f50828g;
        long c10 = c();
        MessageObject messageObject = this.f50825b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        n5Var.f50869g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (n5Var.B == this) {
            n5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f50836p);
        if (this.f50832l) {
            if (!this.f50829i && !this.f50830j) {
                n5 y3 = n5.y(this.f50837q.f50865a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f50837q.f50865a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f50837q.f50865a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f50830j = true;
                    this.f50825b.addPaidReactions((int) (-this.h), this.f50828g, c());
                    n5 n5Var = this.f50837q;
                    n5Var.f50869g = 0L;
                    NotificationCenter.getInstance(n5Var.f50865a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f50837q.f50865a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f50825b.getDialogId()), Integer.valueOf(this.f50825b.getId()), this.f50825b.messageOwner.reactions);
                    if (this.f50824a.f50629a >= 0) {
                        str = UserObject.getForcedFirstName(this.f50826c.getMessagesController().getUser(Long.valueOf(this.f50824a.f50629a)));
                    } else {
                        TLRPC.Chat chat = this.f50826c.getMessagesController().getChat(Long.valueOf(-this.f50824a.f50629a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f50826c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f50826c.getResourceProvider(), j10, 5, str2, new l5(this, j10, 0), 0L).show();
                } else {
                    this.f50829i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f50824a.f50629a);
                    tL_messages_sendPaidReaction.msg_id = this.f50824a.f50630b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f50837q.f50865a).getClientUserId()) {
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
                    this.f50837q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bi.l1(this, messagesController, j10, 6));
                }
            }
        } else {
            this.f50830j = true;
            this.f50825b.addPaidReactions((int) (-this.h), this.f50828g, c());
            n5 n5Var2 = this.f50837q;
            n5Var2.f50869g -= this.h;
            NotificationCenter.getInstance(n5Var2.f50865a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        v3 v3Var = this.f50835o;
        if (v3Var != null && (messageObject = this.f50825b) != null && messageObject.getId() == v3Var.f51239c) {
            this.f50835o.c();
        }
        n5 n5Var3 = this.f50837q;
        if (n5Var3.B == this) {
            n5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f50834n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f50837q.A(this.f50825b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f50837q.f50865a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
