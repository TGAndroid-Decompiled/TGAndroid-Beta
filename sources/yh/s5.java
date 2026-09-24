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
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class s5 {
    public final m5 f47989a;
    public final MessageObject f47990b;
    public final wn f47991c;
    public final qc d;
    public final kc e;
    public final jc f47992f;
    public final boolean f47993g;
    public long h;
    public long f47996k;
    public boolean f47997l;
    public boolean f47998m;
    public b4 f48000o;
    public final p5 f48001p;
    public final t5 f48002q;
    public boolean f47994i = false;
    public boolean f47995j = false;
    public Long f47999n = null;

    public s5(t5 t5Var, m5 m5Var, MessageObject messageObject, wn wnVar, boolean z10) {
        this.f48002q = t5Var;
        p5 p5Var = new p5(this, 0);
        this.f48001p = p5Var;
        this.f47989a = m5Var;
        this.f47990b = messageObject;
        this.f47991c = wnVar;
        Context t10 = t5.t(wnVar);
        kc kcVar = new kc(t10, wnVar.f39454ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25728b.setText(d());
        oc ocVar = new oc(t10, wnVar.f39454ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27017a = new p5(this, 1);
        jc jcVar = new jc(t10, wnVar.f39454ea);
        this.f47992f = jcVar;
        jcVar.f25359b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, wnVar.f39454ea));
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(wnVar).b(kcVar, -1);
        this.d = b10;
        b10.f27579r = false;
        if (z10) {
            b10.k(true);
            this.f47998m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47993g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t5 t5Var = this.f48002q;
        int i10 = t5Var.f48028a;
        AndroidUtilities.cancelRunOnUIThread(this.f48001p);
        this.f47995j = true;
        this.d.b();
        b4 b4Var = this.f48000o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47993g;
        long c10 = c();
        MessageObject messageObject = this.f47990b;
        messageObject.addPaidReactions(i11, z10, c10);
        t5Var.f48032g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t5Var.B == this) {
            t5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48001p);
        if (this.f47997l) {
            if (!this.f47994i && !this.f47995j) {
                t5 y3 = t5.y(this.f48002q.f48028a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48002q.f48028a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48002q.f48028a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47995j = true;
                    this.f47990b.addPaidReactions((int) (-this.h), this.f47993g, c());
                    t5 t5Var = this.f48002q;
                    t5Var.f48032g = 0L;
                    NotificationCenter.getInstance(t5Var.f48028a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48002q.f48028a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47990b.getDialogId()), Integer.valueOf(this.f47990b.getId()), this.f47990b.messageOwner.reactions);
                    if (this.f47989a.f47716a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47991c.getMessagesController().getUser(Long.valueOf(this.f47989a.f47716a)));
                    } else {
                        TLRPC.Chat chat = this.f47991c.getMessagesController().getChat(Long.valueOf(-this.f47989a.f47716a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47991c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f47991c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f47994i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47989a.f47716a);
                    tL_messages_sendPaidReaction.msg_id = this.f47989a.f47717b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48002q.f48028a).getClientUserId()) {
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
                    this.f48002q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47995j = true;
            this.f47990b.addPaidReactions((int) (-this.h), this.f47993g, c());
            t5 t5Var2 = this.f48002q;
            t5Var2.f48032g -= this.h;
            NotificationCenter.getInstance(t5Var2.f48028a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f48000o;
        if (b4Var != null && (messageObject = this.f47990b) != null && messageObject.getId() == b4Var.f47217c) {
            this.f48000o.c();
        }
        t5 t5Var3 = this.f48002q;
        if (t5Var3.B == this) {
            t5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47999n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48002q.A(this.f47990b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48002q.f48028a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
