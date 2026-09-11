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
    public final l5 f52512a;
    public final MessageObject f52513b;
    public final co f52514c;
    public final qc d;
    public final kc f52515e;
    public final jc f52516f;
    public final boolean f52517g;
    public long h;
    public long f52520k;
    public boolean f52521l;
    public boolean f52522m;
    public a4 f52524o;
    public final o5 f52525p;
    public final s5 f52526q;
    public boolean f52518i = false;
    public boolean f52519j = false;
    public Long f52523n = null;

    public r5(s5 s5Var, l5 l5Var, MessageObject messageObject, co coVar, boolean z10) {
        this.f52526q = s5Var;
        o5 o5Var = new o5(this, 0);
        this.f52525p = o5Var;
        this.f52512a = l5Var;
        this.f52513b = messageObject;
        this.f52514c = coVar;
        Context t10 = s5.t(coVar);
        kc kcVar = new kc(t10, coVar.f35247ea);
        this.f52515e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27797b.setText(d());
        oc ocVar = new oc(t10, coVar.f35247ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29029a = new o5(this, 1);
        jc jcVar = new jc(t10, coVar.f35247ea);
        this.f52516f = jcVar;
        jcVar.f27428b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, coVar.f35247ea));
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(coVar).b(kcVar, -1);
        this.d = b10;
        b10.f29687r = false;
        if (z10) {
            b10.k(true);
            this.f52522m = true;
        }
        b10.v = o5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52517g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f52526q;
        int i10 = s5Var.f52566a;
        AndroidUtilities.cancelRunOnUIThread(this.f52525p);
        this.f52519j = true;
        this.d.b();
        a4 a4Var = this.f52524o;
        if (a4Var != null) {
            a4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f52517g;
        long c10 = c();
        MessageObject messageObject = this.f52513b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f52571g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f52525p);
        if (this.f52521l) {
            if (!this.f52518i && !this.f52519j) {
                s5 y3 = s5.y(this.f52526q.f52566a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f52526q.f52566a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f52526q.f52566a);
                long j3 = this.h;
                if (y3.f52569e && y3.q(false, false, null).amount < j3) {
                    this.f52519j = true;
                    this.f52513b.addPaidReactions((int) (-this.h), this.f52517g, c());
                    s5 s5Var = this.f52526q;
                    s5Var.f52571g = 0L;
                    NotificationCenter.getInstance(s5Var.f52566a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f52526q.f52566a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52513b.getDialogId()), Integer.valueOf(this.f52513b.getId()), this.f52513b.messageOwner.reactions);
                    if (this.f52512a.f52213a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52514c.getMessagesController().getUser(Long.valueOf(this.f52512a.f52213a)));
                    } else {
                        TLRPC.Chat chat = this.f52514c.getMessagesController().getChat(Long.valueOf(-this.f52512a.f52213a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52514c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new k7(parentActivity, this.f52514c.getResourceProvider(), j3, 5, str2, new p5(this, j3, 0), 0L).show();
                } else {
                    this.f52518i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52512a.f52213a);
                    tL_messages_sendPaidReaction.msg_id = this.f52512a.f52214b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f52526q.f52566a).getClientUserId()) {
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
                    this.f52526q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bi.l1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52519j = true;
            this.f52513b.addPaidReactions((int) (-this.h), this.f52517g, c());
            s5 s5Var2 = this.f52526q;
            s5Var2.f52571g -= this.h;
            NotificationCenter.getInstance(s5Var2.f52566a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        a4 a4Var = this.f52524o;
        if (a4Var != null && (messageObject = this.f52513b) != null && messageObject.getId() == a4Var.f51680c) {
            this.f52524o.c();
        }
        s5 s5Var3 = this.f52526q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f52523n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f52526q.A(this.f52513b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f52526q.f52566a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
