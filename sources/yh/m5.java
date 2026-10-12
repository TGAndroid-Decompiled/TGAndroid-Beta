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
    public final h5 f53092a;
    public final MessageObject f53093b;
    public final eo f53094c;
    public final sc d;
    public final mc f53095e;
    public final lc f53096f;
    public final boolean f53097g;
    public long h;
    public long f53100k;
    public boolean f53101l;
    public boolean f53102m;
    public w3 f53104o;
    public final k5 f53105p;
    public final n5 f53106q;
    public boolean f53098i = false;
    public boolean f53099j = false;
    public Long f53103n = null;

    public m5(n5 n5Var, h5 h5Var, MessageObject messageObject, eo eoVar, boolean z10) {
        this.f53106q = n5Var;
        k5 k5Var = new k5(this, 0);
        this.f53105p = k5Var;
        this.f53092a = h5Var;
        this.f53093b = messageObject;
        this.f53094c = eoVar;
        Context t10 = n5.t(eoVar);
        mc mcVar = new mc(t10, eoVar.f37251ea);
        this.f53095e = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        mcVar.f28527b.setText(d());
        qc qcVar = new qc(t10, eoVar.f37251ea, true, false);
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f29816a = new k5(this, 1);
        lc lcVar = new lc(t10, eoVar.f37251ea);
        this.f53096f = lcVar;
        lcVar.f28153b = 5000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, eoVar.f37251ea));
        qcVar.addView(lcVar, w7.w5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(eoVar).b(mcVar, -1);
        this.d = b10;
        b10.f30548r = false;
        if (z10) {
            b10.k(true);
            this.f53102m = true;
        }
        b10.v = k5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f53097g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        n5 n5Var = this.f53106q;
        int i10 = n5Var.f53134a;
        AndroidUtilities.cancelRunOnUIThread(this.f53105p);
        this.f53099j = true;
        this.d.b();
        w3 w3Var = this.f53104o;
        if (w3Var != null) {
            w3Var.c();
        }
        boolean z10 = this.f53097g;
        long c10 = c();
        MessageObject messageObject = this.f53093b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        n5Var.f53139g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (n5Var.B == this) {
            n5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f53105p);
        if (this.f53101l) {
            if (!this.f53098i && !this.f53099j) {
                n5 y3 = n5.y(this.f53106q.f53134a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f53106q.f53134a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f53106q.f53134a);
                long j3 = this.h;
                if (y3.f53137e && y3.q(false, false, null).amount < j3) {
                    this.f53099j = true;
                    this.f53093b.addPaidReactions((int) (-this.h), this.f53097g, c());
                    n5 n5Var = this.f53106q;
                    n5Var.f53139g = 0L;
                    NotificationCenter.getInstance(n5Var.f53134a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f53106q.f53134a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f53093b.getDialogId()), Integer.valueOf(this.f53093b.getId()), this.f53093b.messageOwner.reactions);
                    if (this.f53092a.f52860a >= 0) {
                        str = UserObject.getForcedFirstName(this.f53094c.getMessagesController().getUser(Long.valueOf(this.f53092a.f52860a)));
                    } else {
                        TLRPC.Chat chat = this.f53094c.getMessagesController().getChat(Long.valueOf(-this.f53092a.f52860a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f53094c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f53094c.getResourceProvider(), j3, 5, str2, new l5(this, j3, 0), 0L).show();
                } else {
                    this.f53098i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f53092a.f52860a);
                    tL_messages_sendPaidReaction.msg_id = this.f53092a.f52861b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f53106q.f53134a).getClientUserId()) {
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
                    this.f53106q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f53099j = true;
            this.f53093b.addPaidReactions((int) (-this.h), this.f53097g, c());
            n5 n5Var2 = this.f53106q;
            n5Var2.f53139g -= this.h;
            NotificationCenter.getInstance(n5Var2.f53134a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        w3 w3Var = this.f53104o;
        if (w3Var != null && (messageObject = this.f53093b) != null && messageObject.getId() == w3Var.f53557c) {
            this.f53104o.c();
        }
        n5 n5Var3 = this.f53106q;
        if (n5Var3.B == this) {
            n5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f53103n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f53106q.A(this.f53093b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f53106q.f53134a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
