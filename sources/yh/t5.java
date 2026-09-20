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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class t5 {
    public final n5 f48069a;
    public final MessageObject f48070b;
    public final zn f48071c;
    public final pc d;
    public final jc e;
    public final ic f48072f;
    public final boolean f48073g;
    public long h;
    public long f48076k;
    public boolean f48077l;
    public boolean f48078m;
    public c4 f48080o;
    public final q5 f48081p;
    public final u5 f48082q;
    public boolean f48074i = false;
    public boolean f48075j = false;
    public Long f48079n = null;

    public t5(u5 u5Var, n5 n5Var, MessageObject messageObject, zn znVar, boolean z10) {
        this.f48082q = u5Var;
        q5 q5Var = new q5(this, 0);
        this.f48081p = q5Var;
        this.f48069a = n5Var;
        this.f48070b = messageObject;
        this.f48071c = znVar;
        Context t10 = u5.t(znVar);
        jc jcVar = new jc(t10, znVar.f40303ea);
        this.e = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        jcVar.f25336b.setText(d());
        nc ncVar = new nc(t10, znVar.f40303ea, true, false);
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f26616a = new q5(this, 1);
        ic icVar = new ic(t10, znVar.f40303ea);
        this.f48072f = icVar;
        icVar.f24988b = 5000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar.f40303ea));
        ncVar.addView(icVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = xc.a0(znVar).b(jcVar, -1);
        this.d = b10;
        b10.f27260r = false;
        if (z10) {
            b10.k(true);
            this.f48078m = true;
        }
        b10.v = q5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f48073g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u5 u5Var = this.f48082q;
        int i10 = u5Var.f48111a;
        AndroidUtilities.cancelRunOnUIThread(this.f48081p);
        this.f48075j = true;
        this.d.b();
        c4 c4Var = this.f48080o;
        if (c4Var != null) {
            c4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f48073g;
        long c10 = c();
        MessageObject messageObject = this.f48070b;
        messageObject.addPaidReactions(i11, z10, c10);
        u5Var.f48115g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u5Var.B == this) {
            u5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48081p);
        if (this.f48077l) {
            if (!this.f48074i && !this.f48075j) {
                u5 y3 = u5.y(this.f48082q.f48111a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48082q.f48111a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48082q.f48111a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f48075j = true;
                    this.f48070b.addPaidReactions((int) (-this.h), this.f48073g, c());
                    u5 u5Var = this.f48082q;
                    u5Var.f48115g = 0L;
                    NotificationCenter.getInstance(u5Var.f48111a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48082q.f48111a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f48070b.getDialogId()), Integer.valueOf(this.f48070b.getId()), this.f48070b.messageOwner.reactions);
                    if (this.f48069a.f47812a >= 0) {
                        str = UserObject.getForcedFirstName(this.f48071c.getMessagesController().getUser(Long.valueOf(this.f48069a.f47812a)));
                    } else {
                        TLRPC.Chat chat = this.f48071c.getMessagesController().getChat(Long.valueOf(-this.f48069a.f47812a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f48071c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f48071c.getResourceProvider(), j3, 5, str2, new r5(this, j3, 0), 0L).show();
                } else {
                    this.f48074i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f48069a.f47812a);
                    tL_messages_sendPaidReaction.msg_id = this.f48069a.f47813b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48082q.f48111a).getClientUserId()) {
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
                    this.f48082q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f48075j = true;
            this.f48070b.addPaidReactions((int) (-this.h), this.f48073g, c());
            u5 u5Var2 = this.f48082q;
            u5Var2.f48115g -= this.h;
            NotificationCenter.getInstance(u5Var2.f48111a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        c4 c4Var = this.f48080o;
        if (c4Var != null && (messageObject = this.f48070b) != null && messageObject.getId() == c4Var.f47297c) {
            this.f48080o.c();
        }
        u5 u5Var3 = this.f48082q;
        if (u5Var3.B == this) {
            u5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f48079n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48082q.A(this.f48070b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48082q.f48111a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
