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
    public final l5 f52543a;
    public final MessageObject f52544b;
    public final co f52545c;
    public final qc d;
    public final kc f52546e;
    public final jc f52547f;
    public final boolean f52548g;
    public long h;
    public long f52551k;
    public boolean f52552l;
    public boolean f52553m;
    public a4 f52555o;
    public final o5 f52556p;
    public final s5 f52557q;
    public boolean f52549i = false;
    public boolean f52550j = false;
    public Long f52554n = null;

    public r5(s5 s5Var, l5 l5Var, MessageObject messageObject, co coVar, boolean z10) {
        this.f52557q = s5Var;
        o5 o5Var = new o5(this, 0);
        this.f52556p = o5Var;
        this.f52543a = l5Var;
        this.f52544b = messageObject;
        this.f52545c = coVar;
        Context t10 = s5.t(coVar);
        kc kcVar = new kc(t10, coVar.f35274ea);
        this.f52546e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27824b.setText(d());
        oc ocVar = new oc(t10, coVar.f35274ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29056a = new o5(this, 1);
        jc jcVar = new jc(t10, coVar.f35274ea);
        this.f52547f = jcVar;
        jcVar.f27455b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, coVar.f35274ea));
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(coVar).b(kcVar, -1);
        this.d = b10;
        b10.f29714r = false;
        if (z10) {
            b10.k(true);
            this.f52553m = true;
        }
        b10.v = o5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52548g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f52557q;
        int i10 = s5Var.f52597a;
        AndroidUtilities.cancelRunOnUIThread(this.f52556p);
        this.f52550j = true;
        this.d.b();
        a4 a4Var = this.f52555o;
        if (a4Var != null) {
            a4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f52548g;
        long c10 = c();
        MessageObject messageObject = this.f52544b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f52602g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f52556p);
        if (this.f52552l) {
            if (!this.f52549i && !this.f52550j) {
                s5 y3 = s5.y(this.f52557q.f52597a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f52557q.f52597a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f52557q.f52597a);
                long j3 = this.h;
                if (y3.f52600e && y3.q(false, false, null).amount < j3) {
                    this.f52550j = true;
                    this.f52544b.addPaidReactions((int) (-this.h), this.f52548g, c());
                    s5 s5Var = this.f52557q;
                    s5Var.f52602g = 0L;
                    NotificationCenter.getInstance(s5Var.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f52557q.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52544b.getDialogId()), Integer.valueOf(this.f52544b.getId()), this.f52544b.messageOwner.reactions);
                    if (this.f52543a.f52244a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52545c.getMessagesController().getUser(Long.valueOf(this.f52543a.f52244a)));
                    } else {
                        TLRPC.Chat chat = this.f52545c.getMessagesController().getChat(Long.valueOf(-this.f52543a.f52244a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52545c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new k7(parentActivity, this.f52545c.getResourceProvider(), j3, 5, str2, new p5(this, j3, 0), 0L).show();
                } else {
                    this.f52549i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52543a.f52244a);
                    tL_messages_sendPaidReaction.msg_id = this.f52543a.f52245b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f52557q.f52597a).getClientUserId()) {
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
                    this.f52557q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bi.l1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52550j = true;
            this.f52544b.addPaidReactions((int) (-this.h), this.f52548g, c());
            s5 s5Var2 = this.f52557q;
            s5Var2.f52602g -= this.h;
            NotificationCenter.getInstance(s5Var2.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        a4 a4Var = this.f52555o;
        if (a4Var != null && (messageObject = this.f52544b) != null && messageObject.getId() == a4Var.f51711c) {
            this.f52555o.c();
        }
        s5 s5Var3 = this.f52557q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f52554n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f52557q.A(this.f52544b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f52557q.f52597a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
