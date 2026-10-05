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
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class t5 {
    public final n5 f52021a;
    public final MessageObject f52022b;
    public final yn f52023c;
    public final rc d;
    public final lc f52024e;
    public final kc f52025f;
    public final boolean f52026g;
    public long h;
    public long f52029k;
    public boolean f52030l;
    public boolean f52031m;
    public c4 f52033o;
    public final q5 f52034p;
    public final u5 f52035q;
    public boolean f52027i = false;
    public boolean f52028j = false;
    public Long f52032n = null;

    public t5(u5 u5Var, n5 n5Var, MessageObject messageObject, yn ynVar, boolean z10) {
        this.f52035q = u5Var;
        q5 q5Var = new q5(this, 0);
        this.f52034p = q5Var;
        this.f52021a = n5Var;
        this.f52022b = messageObject;
        this.f52023c = ynVar;
        Context t10 = u5.t(ynVar);
        lc lcVar = new lc(t10, ynVar.f43300ca);
        this.f52024e = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        lcVar.f28438b.setText(d());
        pc pcVar = new pc(t10, ynVar.f43300ca, true, false);
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29693a = new q5(this, 1);
        kc kcVar = new kc(t10, ynVar.f43300ca);
        this.f52025f = kcVar;
        kcVar.f28155b = 5000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, ynVar.f43300ca));
        pcVar.addView(kcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(ynVar).b(lcVar, -1);
        this.d = b10;
        b10.f30435r = false;
        if (z10) {
            b10.k(true);
            this.f52031m = true;
        }
        b10.v = q5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52026g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u5 u5Var = this.f52035q;
        int i10 = u5Var.f52085a;
        AndroidUtilities.cancelRunOnUIThread(this.f52034p);
        this.f52028j = true;
        this.d.b();
        c4 c4Var = this.f52033o;
        if (c4Var != null) {
            c4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f52026g;
        long c10 = c();
        MessageObject messageObject = this.f52022b;
        messageObject.addPaidReactions(i11, z10, c10);
        u5Var.f52090g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u5Var.B == this) {
            u5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f52034p);
        if (this.f52030l) {
            if (!this.f52027i && !this.f52028j) {
                u5 y3 = u5.y(this.f52035q.f52085a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f52035q.f52085a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f52035q.f52085a);
                long j3 = this.h;
                if (y3.f52088e && y3.q(false, false, null).amount < j3) {
                    this.f52028j = true;
                    this.f52022b.addPaidReactions((int) (-this.h), this.f52026g, c());
                    u5 u5Var = this.f52035q;
                    u5Var.f52090g = 0L;
                    NotificationCenter.getInstance(u5Var.f52085a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f52035q.f52085a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52022b.getDialogId()), Integer.valueOf(this.f52022b.getId()), this.f52022b.messageOwner.reactions);
                    if (this.f52021a.f51702a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52023c.getMessagesController().getUser(Long.valueOf(this.f52021a.f51702a)));
                    } else {
                        TLRPC.Chat chat = this.f52023c.getMessagesController().getChat(Long.valueOf(-this.f52021a.f51702a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52023c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new n7(parentActivity, this.f52023c.getResourceProvider(), j3, 5, str2, new r5(this, j3, 0), 0L).show();
                } else {
                    this.f52027i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52021a.f51702a);
                    tL_messages_sendPaidReaction.msg_id = this.f52021a.f51703b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f52035q.f52085a).getClientUserId()) {
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
                    this.f52035q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52028j = true;
            this.f52022b.addPaidReactions((int) (-this.h), this.f52026g, c());
            u5 u5Var2 = this.f52035q;
            u5Var2.f52090g -= this.h;
            NotificationCenter.getInstance(u5Var2.f52085a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        c4 c4Var = this.f52033o;
        if (c4Var != null && (messageObject = this.f52022b) != null && messageObject.getId() == c4Var.f51185c) {
            this.f52033o.c();
        }
        u5 u5Var3 = this.f52035q;
        if (u5Var3.B == this) {
            u5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f52032n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f52035q.A(this.f52022b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f52035q.f52085a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
