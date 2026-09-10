package xh;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class u5 {
    public final p5 f46140a;
    public final MessageObject f46141b;
    public final eo f46142c;
    public final pc d;
    public final jc e;
    public final ic f46143f;
    public final boolean f46144g;
    public long h;
    public long f46147k;
    public boolean f46148l;
    public boolean f46149m;
    public b4 f46151o;
    public final s5 f46152p;
    public final v5 f46153q;
    public boolean f46145i = false;
    public boolean f46146j = false;
    public Long f46150n = null;

    public u5(v5 v5Var, p5 p5Var, MessageObject messageObject, eo eoVar, boolean z10) {
        this.f46153q = v5Var;
        s5 s5Var = new s5(this, 0);
        this.f46152p = s5Var;
        this.f46140a = p5Var;
        this.f46141b = messageObject;
        this.f46142c = eoVar;
        Context t10 = v5.t(eoVar);
        jc jcVar = new jc(t10, eoVar.f32316ea);
        this.e = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        jcVar.f24342b.setText(d());
        nc ncVar = new nc(t10, eoVar.f32316ea, true, false);
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f25483a = new s5(this, 1);
        ic icVar = new ic(t10, eoVar.f32316ea);
        this.f46143f = icVar;
        icVar.f23985b = 5000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, eoVar.f32316ea));
        ncVar.addView(icVar, w7.a6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = wc.a0(eoVar).b(jcVar, -1);
        this.d = b10;
        b10.f26089r = false;
        if (z10) {
            b10.k(true);
            this.f46149m = true;
        }
        b10.v = s5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f46144g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        v5 v5Var = this.f46153q;
        int i10 = v5Var.f46176a;
        AndroidUtilities.cancelRunOnUIThread(this.f46152p);
        this.f46146j = true;
        this.d.b();
        b4 b4Var = this.f46151o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f46144g;
        long c10 = c();
        MessageObject messageObject = this.f46141b;
        messageObject.addPaidReactions(i11, z10, c10);
        v5Var.f46180g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (v5Var.B == this) {
            v5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f46152p);
        if (this.f46148l) {
            if (!this.f46145i && !this.f46146j) {
                v5 y3 = v5.y(this.f46153q.f46176a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f46153q.f46176a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f46153q.f46176a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f46146j = true;
                    this.f46141b.addPaidReactions((int) (-this.h), this.f46144g, c());
                    v5 v5Var = this.f46153q;
                    v5Var.f46180g = 0L;
                    NotificationCenter.getInstance(v5Var.f46176a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f46153q.f46176a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f46141b.getDialogId()), Integer.valueOf(this.f46141b.getId()), this.f46141b.messageOwner.reactions);
                    if (this.f46140a.f45877a >= 0) {
                        str = UserObject.getForcedFirstName(this.f46142c.getMessagesController().getUser(Long.valueOf(this.f46140a.f45877a)));
                    } else {
                        TLRPC.Chat chat = this.f46142c.getMessagesController().getChat(Long.valueOf(-this.f46140a.f45877a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f46142c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new o7(parentActivity, this.f46142c.getResourceProvider(), j3, 5, str2, new t5(this, j3, 0), 0L).show();
                } else {
                    this.f46145i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f46140a.f45877a);
                    tL_messages_sendPaidReaction.msg_id = this.f46140a.f45878b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f46153q.f46176a).getClientUserId()) {
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
                    this.f46153q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new org.telegram.messenger.voip.h(this, messagesController, j3, 5));
                }
            }
        } else {
            this.f46146j = true;
            this.f46141b.addPaidReactions((int) (-this.h), this.f46144g, c());
            v5 v5Var2 = this.f46153q;
            v5Var2.f46180g -= this.h;
            NotificationCenter.getInstance(v5Var2.f46176a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f46151o;
        if (b4Var != null && (messageObject = this.f46141b) != null && messageObject.getId() == b4Var.f45268c) {
            this.f46151o.c();
        }
        v5 v5Var3 = this.f46153q;
        if (v5Var3.B == this) {
            v5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f46150n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f46153q.A(this.f46141b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f46153q.f46176a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
