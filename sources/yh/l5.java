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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class l5 {
    public final g5 f52835a;
    public final MessageObject f52836b;
    public final zn f52837c;
    public final tc d;
    public final nc f52838e;
    public final mc f52839f;
    public final boolean f52840g;
    public long h;
    public long f52843k;
    public boolean f52844l;
    public boolean f52845m;
    public w3 f52847o;
    public final j5 f52848p;
    public final m5 f52849q;
    public boolean f52841i = false;
    public boolean f52842j = false;
    public Long f52846n = null;

    public l5(m5 m5Var, g5 g5Var, MessageObject messageObject, zn znVar, boolean z10) {
        this.f52849q = m5Var;
        j5 j5Var = new j5(this, 0);
        this.f52848p = j5Var;
        this.f52835a = g5Var;
        this.f52836b = messageObject;
        this.f52837c = znVar;
        Context t10 = m5.t(znVar);
        nc ncVar = new nc(t10, znVar.f44763ea);
        this.f52838e = ncVar;
        ncVar.c(R.raw.stars_topup, new String[0]);
        ncVar.f29140b.setText(d());
        rc rcVar = new rc(t10, znVar.f44763ea, true, false);
        rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        rcVar.f30421a = new j5(this, 1);
        mc mcVar = new mc(t10, znVar.f44763ea);
        this.f52839f = mcVar;
        mcVar.f28806b = 5000L;
        mcVar.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, znVar.f44763ea));
        rcVar.addView(mcVar, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        rcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ncVar.setButton(rcVar);
        tc b10 = ad.a0(znVar).b(ncVar, -1);
        this.d = b10;
        b10.f31138r = false;
        if (z10) {
            b10.k(true);
            this.f52845m = true;
        }
        b10.v = j5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f52840g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        m5 m5Var = this.f52849q;
        int i10 = m5Var.f52880a;
        AndroidUtilities.cancelRunOnUIThread(this.f52848p);
        this.f52842j = true;
        this.d.b();
        w3 w3Var = this.f52847o;
        if (w3Var != null) {
            w3Var.c();
        }
        boolean z10 = this.f52840g;
        long c10 = c();
        MessageObject messageObject = this.f52836b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        m5Var.f52885g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (m5Var.B == this) {
            m5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f52848p);
        if (this.f52844l) {
            if (!this.f52841i && !this.f52842j) {
                m5 y3 = m5.y(this.f52849q.f52880a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f52849q.f52880a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f52849q.f52880a);
                long j3 = this.h;
                if (y3.f52883e && y3.q(false, false, null).amount < j3) {
                    this.f52842j = true;
                    this.f52836b.addPaidReactions((int) (-this.h), this.f52840g, c());
                    m5 m5Var = this.f52849q;
                    m5Var.f52885g = 0L;
                    NotificationCenter.getInstance(m5Var.f52880a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f52849q.f52880a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f52836b.getDialogId()), Integer.valueOf(this.f52836b.getId()), this.f52836b.messageOwner.reactions);
                    if (this.f52835a.f52584a >= 0) {
                        str = UserObject.getForcedFirstName(this.f52837c.getMessagesController().getUser(Long.valueOf(this.f52835a.f52584a)));
                    } else {
                        TLRPC.Chat chat = this.f52837c.getMessagesController().getChat(Long.valueOf(-this.f52835a.f52584a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f52837c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new e7(parentActivity, this.f52837c.getResourceProvider(), j3, 5, str2, new k5(this, j3, 0), 0L).show();
                } else {
                    this.f52841i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f52835a.f52584a);
                    tL_messages_sendPaidReaction.msg_id = this.f52835a.f52585b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f52849q.f52880a).getClientUserId()) {
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
                    this.f52849q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f52842j = true;
            this.f52836b.addPaidReactions((int) (-this.h), this.f52840g, c());
            m5 m5Var2 = this.f52849q;
            m5Var2.f52885g -= this.h;
            NotificationCenter.getInstance(m5Var2.f52880a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        w3 w3Var = this.f52847o;
        if (w3Var != null && (messageObject = this.f52836b) != null && messageObject.getId() == w3Var.f53333c) {
            this.f52847o.c();
        }
        m5 m5Var3 = this.f52849q;
        if (m5Var3.B == this) {
            m5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f52846n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f52849q.A(this.f52836b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f52849q.f52880a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
