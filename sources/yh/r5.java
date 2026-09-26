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
    public final m5 f47955a;
    public final MessageObject f47956b;
    public final wn f47957c;
    public final qc d;
    public final kc e;
    public final jc f47958f;
    public final boolean f47959g;
    public long h;
    public long f47962k;
    public boolean f47963l;
    public boolean f47964m;
    public b4 f47966o;
    public final p5 f47967p;
    public final s5 f47968q;
    public boolean f47960i = false;
    public boolean f47961j = false;
    public Long f47965n = null;

    public r5(s5 s5Var, m5 m5Var, MessageObject messageObject, wn wnVar, boolean z10) {
        this.f47968q = s5Var;
        p5 p5Var = new p5(this, 0);
        this.f47967p = p5Var;
        this.f47955a = m5Var;
        this.f47956b = messageObject;
        this.f47957c = wnVar;
        Context t10 = s5.t(wnVar);
        kc kcVar = new kc(t10, wnVar.f39468ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25695b.setText(d());
        oc ocVar = new oc(t10, wnVar.f39468ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27028a = new p5(this, 1);
        jc jcVar = new jc(t10, wnVar.f39468ea);
        this.f47958f = jcVar;
        jcVar.f25374b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, wnVar.f39468ea));
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(wnVar).b(kcVar, -1);
        this.d = b10;
        b10.f27643r = false;
        if (z10) {
            b10.k(true);
            this.f47964m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f47959g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f47968q;
        int i10 = s5Var.f48010a;
        AndroidUtilities.cancelRunOnUIThread(this.f47967p);
        this.f47961j = true;
        this.d.b();
        b4 b4Var = this.f47966o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f47959g;
        long c10 = c();
        MessageObject messageObject = this.f47956b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f48014g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f47967p);
        if (this.f47963l) {
            if (!this.f47960i && !this.f47961j) {
                s5 y3 = s5.y(this.f47968q.f48010a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f47968q.f48010a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f47968q.f48010a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f47961j = true;
                    this.f47956b.addPaidReactions((int) (-this.h), this.f47959g, c());
                    s5 s5Var = this.f47968q;
                    s5Var.f48014g = 0L;
                    NotificationCenter.getInstance(s5Var.f48010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f47968q.f48010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f47956b.getDialogId()), Integer.valueOf(this.f47956b.getId()), this.f47956b.messageOwner.reactions);
                    if (this.f47955a.f47726a >= 0) {
                        str = UserObject.getForcedFirstName(this.f47957c.getMessagesController().getUser(Long.valueOf(this.f47955a.f47726a)));
                    } else {
                        TLRPC.Chat chat = this.f47957c.getMessagesController().getChat(Long.valueOf(-this.f47955a.f47726a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f47957c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f47957c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f47960i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f47955a.f47726a);
                    tL_messages_sendPaidReaction.msg_id = this.f47955a.f47727b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f47968q.f48010a).getClientUserId()) {
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
                    this.f47968q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f47961j = true;
            this.f47956b.addPaidReactions((int) (-this.h), this.f47959g, c());
            s5 s5Var2 = this.f47968q;
            s5Var2.f48014g -= this.h;
            NotificationCenter.getInstance(s5Var2.f48010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f47966o;
        if (b4Var != null && (messageObject = this.f47956b) != null && messageObject.getId() == b4Var.f47227c) {
            this.f47966o.c();
        }
        s5 s5Var3 = this.f47968q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f47965n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f47968q.A(this.f47956b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f47968q.f48010a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
