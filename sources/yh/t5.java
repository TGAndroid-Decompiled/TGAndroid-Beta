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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class t5 {
    public final o5 f47764a;
    public final MessageObject f47765b;
    public final bo f47766c;
    public final oc d;
    public final ic e;
    public final hc f47767f;
    public final boolean f47768g;
    public long h;
    public long f47771k;
    public boolean f47772l;
    public boolean f47773m;
    public d4 f47775o;
    public final r5 f47776p;
    public final u5 f47777q;
    public boolean f47769i = false;
    public boolean f47770j = false;
    public Long f47774n = null;

    public t5(u5 u5Var, o5 o5Var, MessageObject messageObject, bo boVar, boolean z10) {
        this.f47777q = u5Var;
        r5 r5Var = new r5(this, 0);
        this.f47776p = r5Var;
        this.f47764a = o5Var;
        this.f47765b = messageObject;
        this.f47766c = boVar;
        Context t10 = u5.t(boVar);
        ic icVar = new ic(t10, boVar.f32293ea);
        this.e = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        icVar.f24998b.setText(d());
        mc mcVar = new mc(t10, boVar.f32293ea, true, false);
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f26136a = new r5(this, 1);
        hc hcVar = new hc(t10, boVar.f32293ea);
        this.f47767f = hcVar;
        hcVar.f24662b = 5000L;
        hcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, boVar.f32293ea));
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(boVar).b(icVar, -1);
        this.d = b10;
        b10.f26759r = false;
        if (z10) {
            b10.k(true);
            this.f47773m = true;
        }
        b10.v = r5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47768g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u5 u5Var = this.f47777q;
        int i10 = u5Var.f47801a;
        AndroidUtilities.cancelRunOnUIThread(this.f47776p);
        this.f47770j = true;
        this.d.b();
        d4 d4Var = this.f47775o;
        if (d4Var != null) {
            d4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47768g;
        long c10 = c();
        MessageObject messageObject = this.f47765b;
        messageObject.addPaidReactions(i11, z10, c10);
        u5Var.f47805g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u5Var.B == this) {
            u5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f47776p);
        if (this.f47772l) {
            if (!this.f47769i && !this.f47770j) {
                u5 y3 = u5.y(this.f47777q.f47801a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f47777q.f47801a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f47777q.f47801a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47770j = true;
                    this.f47765b.addPaidReactions((int) (-this.h), this.f47768g, c());
                    u5 u5Var = this.f47777q;
                    u5Var.f47805g = 0L;
                    NotificationCenter.getInstance(u5Var.f47801a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f47777q.f47801a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47765b.getDialogId()), Integer.valueOf(this.f47765b.getId()), this.f47765b.messageOwner.reactions);
                    if (this.f47764a.f47537a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47766c.getMessagesController().getUser(Long.valueOf(this.f47764a.f47537a)));
                    } else {
                        TLRPC.Chat chat = this.f47766c.getMessagesController().getChat(Long.valueOf(-this.f47764a.f47537a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47766c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new m7(parentActivity, this.f47766c.getResourceProvider(), j3, 5, str2, new s5(this, j3, 0), 0L).show();
                } else {
                    this.f47769i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47764a.f47537a);
                    tL_messages_sendPaidReaction.msg_id = this.f47764a.f47538b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f47777q.f47801a).getClientUserId()) {
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
                    this.f47777q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47770j = true;
            this.f47765b.addPaidReactions((int) (-this.h), this.f47768g, c());
            u5 u5Var2 = this.f47777q;
            u5Var2.f47805g -= this.h;
            NotificationCenter.getInstance(u5Var2.f47801a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        d4 d4Var = this.f47775o;
        if (d4Var != null && (messageObject = this.f47765b) != null && messageObject.getId() == d4Var.f47010c) {
            this.f47775o.c();
        }
        u5 u5Var3 = this.f47777q;
        if (u5Var3.B == this) {
            u5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47774n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f47777q.A(this.f47765b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f47777q.f47801a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
