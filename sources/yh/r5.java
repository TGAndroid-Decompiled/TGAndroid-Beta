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
import org.telegram.ui.wn;
public final class r5 {
    public final m5 f47956a;
    public final MessageObject f47957b;
    public final wn f47958c;
    public final qc d;
    public final kc e;
    public final jc f47959f;
    public final boolean f47960g;
    public long h;
    public long f47963k;
    public boolean f47964l;
    public boolean f47965m;
    public b4 f47967o;
    public final p5 f47968p;
    public final s5 f47969q;
    public boolean f47961i = false;
    public boolean f47962j = false;
    public Long f47966n = null;

    public r5(s5 s5Var, m5 m5Var, MessageObject messageObject, wn wnVar, boolean z10) {
        this.f47969q = s5Var;
        p5 p5Var = new p5(this, 0);
        this.f47968p = p5Var;
        this.f47956a = m5Var;
        this.f47957b = messageObject;
        this.f47958c = wnVar;
        Context t10 = s5.t(wnVar);
        kc kcVar = new kc(t10, wnVar.f39469ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25746b.setText(d());
        oc ocVar = new oc(t10, wnVar.f39469ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27021a = new p5(this, 1);
        jc jcVar = new jc(t10, wnVar.f39469ea);
        this.f47959f = jcVar;
        jcVar.f25384b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, wnVar.f39469ea));
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(wnVar).b(kcVar, -1);
        this.d = b10;
        b10.f27585r = false;
        if (z10) {
            b10.k(true);
            this.f47965m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47960g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f47969q;
        int i10 = s5Var.f48011a;
        AndroidUtilities.cancelRunOnUIThread(this.f47968p);
        this.f47962j = true;
        this.d.b();
        b4 b4Var = this.f47967o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47960g;
        long c10 = c();
        MessageObject messageObject = this.f47957b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f48015g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f47968p);
        if (this.f47964l) {
            if (!this.f47961i && !this.f47962j) {
                s5 y3 = s5.y(this.f47969q.f48011a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f47969q.f48011a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f47969q.f48011a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47962j = true;
                    this.f47957b.addPaidReactions((int) (-this.h), this.f47960g, c());
                    s5 s5Var = this.f47969q;
                    s5Var.f48015g = 0L;
                    NotificationCenter.getInstance(s5Var.f48011a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f47969q.f48011a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47957b.getDialogId()), Integer.valueOf(this.f47957b.getId()), this.f47957b.messageOwner.reactions);
                    if (this.f47956a.f47727a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47958c.getMessagesController().getUser(Long.valueOf(this.f47956a.f47727a)));
                    } else {
                        TLRPC.Chat chat = this.f47958c.getMessagesController().getChat(Long.valueOf(-this.f47956a.f47727a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47958c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f47958c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f47961i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47956a.f47727a);
                    tL_messages_sendPaidReaction.msg_id = this.f47956a.f47728b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f47969q.f48011a).getClientUserId()) {
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
                    this.f47969q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47962j = true;
            this.f47957b.addPaidReactions((int) (-this.h), this.f47960g, c());
            s5 s5Var2 = this.f47969q;
            s5Var2.f48015g -= this.h;
            NotificationCenter.getInstance(s5Var2.f48011a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f47967o;
        if (b4Var != null && (messageObject = this.f47957b) != null && messageObject.getId() == b4Var.f47228c) {
            this.f47967o.c();
        }
        s5 s5Var3 = this.f47969q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47966n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f47969q.A(this.f47957b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f47969q.f48011a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
