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
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
public final class r5 {
    public final l5 f52544a;
    public final MessageObject f52545b;
    public final co f52546c;
    public final qc d;
    public final kc f52547e;
    public final jc f52548f;
    public final boolean f52549g;
    public long h;
    public long f52552k;
    public boolean f52553l;
    public boolean f52554m;
    public a4 f52556o;
    public final o5 f52557p;
    public final s5 f52558q;
    public boolean f52550i = false;
    public boolean f52551j = false;
    public Long f52555n = null;

    public r5(s5 s5Var, l5 l5Var, MessageObject messageObject, co coVar, boolean z10) {
        this.f52558q = s5Var;
        o5 o5Var = new o5(this, 0);
        this.f52557p = o5Var;
        this.f52544a = l5Var;
        this.f52545b = messageObject;
        this.f52546c = coVar;
        Context t10 = s5.t(coVar);
        kc kcVar = new kc(t10, coVar.f35275ea);
        this.f52547e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27825b.setText(d());
        oc ocVar = new oc(t10, coVar.f35275ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29057a = new o5(this, 1);
        jc jcVar = new jc(t10, coVar.f35275ea);
        this.f52548f = jcVar;
        jcVar.f27456b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, coVar.f35275ea));
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(coVar).b(kcVar, -1);
        this.d = b10;
        b10.f29715r = false;
        if (z10) {
            b10.k(true);
            this.f52554m = true;
        }
        b10.v = o5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52549g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f52558q;
        int i10 = s5Var.f52598a;
        AndroidUtilities.cancelRunOnUIThread(this.f52557p);
        this.f52551j = true;
        this.d.b();
        a4 a4Var = this.f52556o;
        if (a4Var != null) {
            a4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f52549g;
        long c10 = c();
        MessageObject messageObject = this.f52545b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f52603g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f52557p);
        if (this.f52553l) {
            if (!this.f52550i && !this.f52551j) {
                s5 y3 = s5.y(this.f52558q.f52598a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f52558q.f52598a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f52558q.f52598a);
                long j3 = this.h;
                if (y3.f52601e && y3.q(false, false, null).amount < j3) {
                    this.f52551j = true;
                    this.f52545b.addPaidReactions((int) (-this.h), this.f52549g, c());
                    s5 s5Var = this.f52558q;
                    s5Var.f52603g = 0L;
                    NotificationCenter.getInstance(s5Var.f52598a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f52558q.f52598a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52545b.getDialogId()), Integer.valueOf(this.f52545b.getId()), this.f52545b.messageOwner.reactions);
                    if (this.f52544a.f52245a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52546c.getMessagesController().getUser(Long.valueOf(this.f52544a.f52245a)));
                    } else {
                        TLRPC.Chat chat = this.f52546c.getMessagesController().getChat(Long.valueOf(-this.f52544a.f52245a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52546c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new k7(parentActivity, this.f52546c.getResourceProvider(), j3, 5, str2, new p5(this, j3, 0), 0L).show();
                } else {
                    this.f52550i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52544a.f52245a);
                    tL_messages_sendPaidReaction.msg_id = this.f52544a.f52246b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f52558q.f52598a).getClientUserId()) {
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
                    this.f52558q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bi.l1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52551j = true;
            this.f52545b.addPaidReactions((int) (-this.h), this.f52549g, c());
            s5 s5Var2 = this.f52558q;
            s5Var2.f52603g -= this.h;
            NotificationCenter.getInstance(s5Var2.f52598a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        a4 a4Var = this.f52556o;
        if (a4Var != null && (messageObject = this.f52545b) != null && messageObject.getId() == a4Var.f51712c) {
            this.f52556o.c();
        }
        s5 s5Var3 = this.f52558q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f52555n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f52558q.A(this.f52545b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f52558q.f52598a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
