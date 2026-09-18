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
public final class u5 {
    public final p5 f47887a;
    public final MessageObject f47888b;
    public final bo f47889c;
    public final oc d;
    public final ic e;
    public final hc f47890f;
    public final boolean f47891g;
    public long h;
    public long f47894k;
    public boolean f47895l;
    public boolean f47896m;
    public e4 f47898o;
    public final s5 f47899p;
    public final v5 f47900q;
    public boolean f47892i = false;
    public boolean f47893j = false;
    public Long f47897n = null;

    public u5(v5 v5Var, p5 p5Var, MessageObject messageObject, bo boVar, boolean z10) {
        this.f47900q = v5Var;
        s5 s5Var = new s5(this, 0);
        this.f47899p = s5Var;
        this.f47887a = p5Var;
        this.f47888b = messageObject;
        this.f47889c = boVar;
        Context t10 = v5.t(boVar);
        ic icVar = new ic(t10, boVar.f32279ea);
        this.e = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        icVar.f24926b.setText(d());
        mc mcVar = new mc(t10, boVar.f32279ea, true, false);
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f26125a = new s5(this, 1);
        hc hcVar = new hc(t10, boVar.f32279ea);
        this.f47890f = hcVar;
        hcVar.f24626b = 5000L;
        hcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, boVar.f32279ea));
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(boVar).b(icVar, -1);
        this.d = b10;
        b10.f26713r = false;
        if (z10) {
            b10.k(true);
            this.f47896m = true;
        }
        b10.v = s5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47891g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        v5 v5Var = this.f47900q;
        int i10 = v5Var.f47923a;
        AndroidUtilities.cancelRunOnUIThread(this.f47899p);
        this.f47893j = true;
        this.d.b();
        e4 e4Var = this.f47898o;
        if (e4Var != null) {
            e4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47891g;
        long c10 = c();
        MessageObject messageObject = this.f47888b;
        messageObject.addPaidReactions(i11, z10, c10);
        v5Var.f47927g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (v5Var.B == this) {
            v5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f47899p);
        if (this.f47895l) {
            if (!this.f47892i && !this.f47893j) {
                v5 y3 = v5.y(this.f47900q.f47923a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f47900q.f47923a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f47900q.f47923a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47893j = true;
                    this.f47888b.addPaidReactions((int) (-this.h), this.f47891g, c());
                    v5 v5Var = this.f47900q;
                    v5Var.f47927g = 0L;
                    NotificationCenter.getInstance(v5Var.f47923a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f47900q.f47923a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47888b.getDialogId()), Integer.valueOf(this.f47888b.getId()), this.f47888b.messageOwner.reactions);
                    if (this.f47887a.f47656a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47889c.getMessagesController().getUser(Long.valueOf(this.f47887a.f47656a)));
                    } else {
                        TLRPC.Chat chat = this.f47889c.getMessagesController().getChat(Long.valueOf(-this.f47887a.f47656a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47889c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new n7(parentActivity, this.f47889c.getResourceProvider(), j3, 5, str2, new t5(this, j3, 0), 0L).show();
                } else {
                    this.f47892i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47887a.f47656a);
                    tL_messages_sendPaidReaction.msg_id = this.f47887a.f47657b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f47900q.f47923a).getClientUserId()) {
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
                    this.f47900q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47893j = true;
            this.f47888b.addPaidReactions((int) (-this.h), this.f47891g, c());
            v5 v5Var2 = this.f47900q;
            v5Var2.f47927g -= this.h;
            NotificationCenter.getInstance(v5Var2.f47923a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        e4 e4Var = this.f47898o;
        if (e4Var != null && (messageObject = this.f47888b) != null && messageObject.getId() == e4Var.f47138c) {
            this.f47898o.c();
        }
        v5 v5Var3 = this.f47900q;
        if (v5Var3.B == this) {
            v5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47897n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f47900q.A(this.f47888b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f47900q.f47923a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
