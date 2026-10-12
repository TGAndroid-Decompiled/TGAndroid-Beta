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
    public final h5 f50823a;
    public final MessageObject f50824b;
    public final fo f50825c;
    public final sc d;
    public final mc e;
    public final lc f50826f;
    public final boolean f50827g;
    public long h;
    public long f50830k;
    public boolean f50831l;
    public boolean f50832m;
    public v3 f50834o;
    public final k5 f50835p;
    public final n5 f50836q;
    public boolean f50828i = false;
    public boolean f50829j = false;
    public Long f50833n = null;

    public m5(n5 n5Var, h5 h5Var, MessageObject messageObject, fo foVar, boolean z10) {
        this.f50836q = n5Var;
        k5 k5Var = new k5(this, 0);
        this.f50835p = k5Var;
        this.f50823a = h5Var;
        this.f50824b = messageObject;
        this.f50825c = foVar;
        Context t10 = n5.t(foVar);
        mc mcVar = new mc(t10, foVar.f35932ea);
        this.e = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        mcVar.f27354b.setText(d());
        qc qcVar = new qc(t10, foVar.f35932ea, true, false);
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f28576a = new k5(this, 1);
        lc lcVar = new lc(t10, foVar.f35932ea);
        this.f50826f = lcVar;
        lcVar.f27019b = 5000L;
        lcVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, foVar.f35932ea));
        qcVar.addView(lcVar, w7.a6.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(foVar).b(mcVar, -1);
        this.d = b10;
        b10.f29110r = false;
        if (z10) {
            b10.k(true);
            this.f50832m = true;
        }
        b10.v = k5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f50827g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        n5 n5Var = this.f50836q;
        int i10 = n5Var.f50864a;
        AndroidUtilities.cancelRunOnUIThread(this.f50835p);
        this.f50829j = true;
        this.d.b();
        v3 v3Var = this.f50834o;
        if (v3Var != null) {
            v3Var.c();
        }
        boolean z10 = this.f50827g;
        long c10 = c();
        MessageObject messageObject = this.f50824b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        n5Var.f50868g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (n5Var.B == this) {
            n5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f50835p);
        if (this.f50831l) {
            if (!this.f50828i && !this.f50829j) {
                n5 y3 = n5.y(this.f50836q.f50864a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f50836q.f50864a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f50836q.f50864a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f50829j = true;
                    this.f50824b.addPaidReactions((int) (-this.h), this.f50827g, c());
                    n5 n5Var = this.f50836q;
                    n5Var.f50868g = 0L;
                    NotificationCenter.getInstance(n5Var.f50864a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f50836q.f50864a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f50824b.getDialogId()), Integer.valueOf(this.f50824b.getId()), this.f50824b.messageOwner.reactions);
                    if (this.f50823a.f50628a >= 0) {
                        str = UserObject.getForcedFirstName(this.f50825c.getMessagesController().getUser(Long.valueOf(this.f50823a.f50628a)));
                    } else {
                        TLRPC.Chat chat = this.f50825c.getMessagesController().getChat(Long.valueOf(-this.f50823a.f50628a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f50825c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f50825c.getResourceProvider(), j10, 5, str2, new l5(this, j10, 0), 0L).show();
                } else {
                    this.f50828i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f50823a.f50628a);
                    tL_messages_sendPaidReaction.msg_id = this.f50823a.f50629b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f50836q.f50864a).getClientUserId()) {
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
                    this.f50836q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bi.l1(this, messagesController, j10, 6));
                }
            }
        } else {
            this.f50829j = true;
            this.f50824b.addPaidReactions((int) (-this.h), this.f50827g, c());
            n5 n5Var2 = this.f50836q;
            n5Var2.f50868g -= this.h;
            NotificationCenter.getInstance(n5Var2.f50864a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        v3 v3Var = this.f50834o;
        if (v3Var != null && (messageObject = this.f50824b) != null && messageObject.getId() == v3Var.f51238c) {
            this.f50834o.c();
        }
        n5 n5Var3 = this.f50836q;
        if (n5Var3.B == this) {
            n5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f50833n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f50836q.A(this.f50824b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f50836q.f50864a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
