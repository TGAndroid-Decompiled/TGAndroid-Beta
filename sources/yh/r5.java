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
public final class r5 {
    public final m5 f48004a;
    public final MessageObject f48005b;
    public final xn f48006c;
    public final qc d;
    public final kc e;
    public final jc f48007f;
    public final boolean f48008g;
    public long h;
    public long f48011k;
    public boolean f48012l;
    public boolean f48013m;
    public b4 f48015o;
    public final p5 f48016p;
    public final s5 f48017q;
    public boolean f48009i = false;
    public boolean f48010j = false;
    public Long f48014n = null;

    public r5(s5 s5Var, m5 m5Var, MessageObject messageObject, xn xnVar, boolean z10) {
        this.f48017q = s5Var;
        p5 p5Var = new p5(this, 0);
        this.f48016p = p5Var;
        this.f48004a = m5Var;
        this.f48005b = messageObject;
        this.f48006c = xnVar;
        Context t10 = s5.t(xnVar);
        kc kcVar = new kc(t10, xnVar.f39750ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25700b.setText(d());
        oc ocVar = new oc(t10, xnVar.f39750ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27063a = new p5(this, 1);
        jc jcVar = new jc(t10, xnVar.f39750ea);
        this.f48007f = jcVar;
        jcVar.f25444b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, xnVar.f39750ea));
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(xnVar).b(kcVar, -1);
        this.d = b10;
        b10.f27699r = false;
        if (z10) {
            b10.k(true);
            this.f48013m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f48008g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f48017q;
        int i10 = s5Var.f48056a;
        AndroidUtilities.cancelRunOnUIThread(this.f48016p);
        this.f48010j = true;
        this.d.b();
        b4 b4Var = this.f48015o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f48008g;
        long c10 = c();
        MessageObject messageObject = this.f48005b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f48060g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48016p);
        if (this.f48012l) {
            if (!this.f48009i && !this.f48010j) {
                s5 y3 = s5.y(this.f48017q.f48056a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48017q.f48056a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48017q.f48056a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f48010j = true;
                    this.f48005b.addPaidReactions((int) (-this.h), this.f48008g, c());
                    s5 s5Var = this.f48017q;
                    s5Var.f48060g = 0L;
                    NotificationCenter.getInstance(s5Var.f48056a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48017q.f48056a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f48005b.getDialogId()), Integer.valueOf(this.f48005b.getId()), this.f48005b.messageOwner.reactions);
                    if (this.f48004a.f47792a >= 0) {
                        str = UserObject.getForcedFirstName(this.f48006c.getMessagesController().getUser(Long.valueOf(this.f48004a.f47792a)));
                    } else {
                        TLRPC.Chat chat = this.f48006c.getMessagesController().getChat(Long.valueOf(-this.f48004a.f47792a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f48006c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new k7(parentActivity, this.f48006c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f48009i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f48004a.f47792a);
                    tL_messages_sendPaidReaction.msg_id = this.f48004a.f47793b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48017q.f48056a).getClientUserId()) {
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
                    this.f48017q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f48010j = true;
            this.f48005b.addPaidReactions((int) (-this.h), this.f48008g, c());
            s5 s5Var2 = this.f48017q;
            s5Var2.f48060g -= this.h;
            NotificationCenter.getInstance(s5Var2.f48056a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f48015o;
        if (b4Var != null && (messageObject = this.f48005b) != null && messageObject.getId() == b4Var.f47278c) {
            this.f48015o.c();
        }
        s5 s5Var3 = this.f48017q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f48014n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48017q.A(this.f48005b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48017q.f48056a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
