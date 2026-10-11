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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class m5 {
    public final h5 f52989a;
    public final MessageObject f52990b;
    public final zn f52991c;
    public final sc d;
    public final mc f52992e;
    public final lc f52993f;
    public final boolean f52994g;
    public long h;
    public long f52997k;
    public boolean f52998l;
    public boolean f52999m;
    public w3 f53001o;
    public final k5 f53002p;
    public final n5 f53003q;
    public boolean f52995i = false;
    public boolean f52996j = false;
    public Long f53000n = null;

    public m5(n5 n5Var, h5 h5Var, MessageObject messageObject, zn znVar, boolean z10) {
        this.f53003q = n5Var;
        k5 k5Var = new k5(this, 0);
        this.f53002p = k5Var;
        this.f52989a = h5Var;
        this.f52990b = messageObject;
        this.f52991c = znVar;
        Context t10 = n5.t(znVar);
        mc mcVar = new mc(t10, znVar.f44796ea);
        this.f52992e = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        mcVar.f28830b.setText(d());
        qc qcVar = new qc(t10, znVar.f44796ea, true, false);
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f30224a = new k5(this, 1);
        lc lcVar = new lc(t10, znVar.f44796ea);
        this.f52993f = lcVar;
        lcVar.f28339b = 5000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, znVar.f44796ea));
        qcVar.addView(lcVar, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = ad.a0(znVar).b(mcVar, -1);
        this.d = b10;
        b10.f30841r = false;
        if (z10) {
            b10.k(true);
            this.f52999m = true;
        }
        b10.v = k5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52994g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        n5 n5Var = this.f53003q;
        int i10 = n5Var.f53031a;
        AndroidUtilities.cancelRunOnUIThread(this.f53002p);
        this.f52996j = true;
        this.d.b();
        w3 w3Var = this.f53001o;
        if (w3Var != null) {
            w3Var.c();
        }
        boolean z10 = this.f52994g;
        long c10 = c();
        MessageObject messageObject = this.f52990b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        n5Var.f53036g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (n5Var.B == this) {
            n5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f53002p);
        if (this.f52998l) {
            if (!this.f52995i && !this.f52996j) {
                n5 y3 = n5.y(this.f53003q.f53031a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f53003q.f53031a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f53003q.f53031a);
                long j3 = this.h;
                if (y3.f53034e && y3.q(false, false, null).amount < j3) {
                    this.f52996j = true;
                    this.f52990b.addPaidReactions((int) (-this.h), this.f52994g, c());
                    n5 n5Var = this.f53003q;
                    n5Var.f53036g = 0L;
                    NotificationCenter.getInstance(n5Var.f53031a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f53003q.f53031a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52990b.getDialogId()), Integer.valueOf(this.f52990b.getId()), this.f52990b.messageOwner.reactions);
                    if (this.f52989a.f52757a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52991c.getMessagesController().getUser(Long.valueOf(this.f52989a.f52757a)));
                    } else {
                        TLRPC.Chat chat = this.f52991c.getMessagesController().getChat(Long.valueOf(-this.f52989a.f52757a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52991c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f52991c.getResourceProvider(), j3, 5, str2, new l5(this, j3, 0), 0L).show();
                } else {
                    this.f52995i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52989a.f52757a);
                    tL_messages_sendPaidReaction.msg_id = this.f52989a.f52758b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f53003q.f53031a).getClientUserId()) {
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
                    this.f53003q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52996j = true;
            this.f52990b.addPaidReactions((int) (-this.h), this.f52994g, c());
            n5 n5Var2 = this.f53003q;
            n5Var2.f53036g -= this.h;
            NotificationCenter.getInstance(n5Var2.f53031a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        w3 w3Var = this.f53001o;
        if (w3Var != null && (messageObject = this.f52990b) != null && messageObject.getId() == w3Var.f53454c) {
            this.f53001o.c();
        }
        n5 n5Var3 = this.f53003q;
        if (n5Var3.B == this) {
            n5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f53000n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f53003q.A(this.f52990b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f53003q.f53031a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
