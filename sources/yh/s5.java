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
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class s5 {
    public final n5 f47695a;
    public final MessageObject f47696b;
    public final xn f47697c;
    public final qc d;
    public final kc e;
    public final jc f47698f;
    public final boolean f47699g;
    public long h;
    public long f47702k;
    public boolean f47703l;
    public boolean f47704m;
    public c4 f47706o;
    public final q5 f47707p;
    public final t5 f47708q;
    public boolean f47700i = false;
    public boolean f47701j = false;
    public Long f47705n = null;

    public s5(t5 t5Var, n5 n5Var, MessageObject messageObject, xn xnVar, boolean z10) {
        this.f47708q = t5Var;
        q5 q5Var = new q5(this, 0);
        this.f47707p = q5Var;
        this.f47695a = n5Var;
        this.f47696b = messageObject;
        this.f47697c = xnVar;
        Context t10 = t5.t(xnVar);
        kc kcVar = new kc(t10, xnVar.f39370ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25578b.setText(d());
        oc ocVar = new oc(t10, xnVar.f39370ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f26716a = new q5(this, 1);
        jc jcVar = new jc(t10, xnVar.f39370ea);
        this.f47698f = jcVar;
        jcVar.f25246b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, xnVar.f39370ea));
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(xnVar).b(kcVar, -1);
        this.d = b10;
        b10.f27314r = false;
        if (z10) {
            b10.k(true);
            this.f47704m = true;
        }
        b10.v = q5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47699g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t5 t5Var = this.f47708q;
        int i10 = t5Var.f47732a;
        AndroidUtilities.cancelRunOnUIThread(this.f47707p);
        this.f47701j = true;
        this.d.b();
        c4 c4Var = this.f47706o;
        if (c4Var != null) {
            c4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47699g;
        long c10 = c();
        MessageObject messageObject = this.f47696b;
        messageObject.addPaidReactions(i11, z10, c10);
        t5Var.f47736g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t5Var.B == this) {
            t5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f47707p);
        if (this.f47703l) {
            if (!this.f47700i && !this.f47701j) {
                t5 y3 = t5.y(this.f47708q.f47732a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f47708q.f47732a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f47708q.f47732a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47701j = true;
                    this.f47696b.addPaidReactions((int) (-this.h), this.f47699g, c());
                    t5 t5Var = this.f47708q;
                    t5Var.f47736g = 0L;
                    NotificationCenter.getInstance(t5Var.f47732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f47708q.f47732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47696b.getDialogId()), Integer.valueOf(this.f47696b.getId()), this.f47696b.messageOwner.reactions);
                    if (this.f47695a.f47460a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47697c.getMessagesController().getUser(Long.valueOf(this.f47695a.f47460a)));
                    } else {
                        TLRPC.Chat chat = this.f47697c.getMessagesController().getChat(Long.valueOf(-this.f47695a.f47460a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47697c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f47697c.getResourceProvider(), j3, 5, str2, new r5(this, j3, 0), 0L).show();
                } else {
                    this.f47700i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47695a.f47460a);
                    tL_messages_sendPaidReaction.msg_id = this.f47695a.f47461b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f47708q.f47732a).getClientUserId()) {
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
                    this.f47708q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47701j = true;
            this.f47696b.addPaidReactions((int) (-this.h), this.f47699g, c());
            t5 t5Var2 = this.f47708q;
            t5Var2.f47736g -= this.h;
            NotificationCenter.getInstance(t5Var2.f47732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        c4 c4Var = this.f47706o;
        if (c4Var != null && (messageObject = this.f47696b) != null && messageObject.getId() == c4Var.f46946c) {
            this.f47706o.c();
        }
        t5 t5Var3 = this.f47708q;
        if (t5Var3.B == this) {
            t5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47705n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f47708q.A(this.f47696b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f47708q.f47732a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
