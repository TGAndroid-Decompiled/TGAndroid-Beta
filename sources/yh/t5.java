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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class t5 {
    public final n5 f48090a;
    public final MessageObject f48091b;
    public final zn f48092c;
    public final pc d;
    public final jc e;
    public final ic f48093f;
    public final boolean f48094g;
    public long h;
    public long f48097k;
    public boolean f48098l;
    public boolean f48099m;
    public c4 f48101o;
    public final q5 f48102p;
    public final u5 f48103q;
    public boolean f48095i = false;
    public boolean f48096j = false;
    public Long f48100n = null;

    public t5(u5 u5Var, n5 n5Var, MessageObject messageObject, zn znVar, boolean z10) {
        this.f48103q = u5Var;
        q5 q5Var = new q5(this, 0);
        this.f48102p = q5Var;
        this.f48090a = n5Var;
        this.f48091b = messageObject;
        this.f48092c = znVar;
        Context t10 = u5.t(znVar);
        jc jcVar = new jc(t10, znVar.f40324ea);
        this.e = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        jcVar.f25351b.setText(d());
        nc ncVar = new nc(t10, znVar.f40324ea, true, false);
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f26720a = new q5(this, 1);
        ic icVar = new ic(t10, znVar.f40324ea);
        this.f48093f = icVar;
        icVar.f25078b = 5000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar.f40324ea));
        ncVar.addView(icVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = xc.a0(znVar).b(jcVar, -1);
        this.d = b10;
        b10.f27319r = false;
        if (z10) {
            b10.k(true);
            this.f48099m = true;
        }
        b10.v = q5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f48094g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u5 u5Var = this.f48103q;
        int i10 = u5Var.f48132a;
        AndroidUtilities.cancelRunOnUIThread(this.f48102p);
        this.f48096j = true;
        this.d.b();
        c4 c4Var = this.f48101o;
        if (c4Var != null) {
            c4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f48094g;
        long c10 = c();
        MessageObject messageObject = this.f48091b;
        messageObject.addPaidReactions(i11, z10, c10);
        u5Var.f48136g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u5Var.B == this) {
            u5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48102p);
        if (this.f48098l) {
            if (!this.f48095i && !this.f48096j) {
                u5 y3 = u5.y(this.f48103q.f48132a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48103q.f48132a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48103q.f48132a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f48096j = true;
                    this.f48091b.addPaidReactions((int) (-this.h), this.f48094g, c());
                    u5 u5Var = this.f48103q;
                    u5Var.f48136g = 0L;
                    NotificationCenter.getInstance(u5Var.f48132a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48103q.f48132a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f48091b.getDialogId()), Integer.valueOf(this.f48091b.getId()), this.f48091b.messageOwner.reactions);
                    if (this.f48090a.f47833a >= 0) {
                        str = UserObject.getForcedFirstName(this.f48092c.getMessagesController().getUser(Long.valueOf(this.f48090a.f47833a)));
                    } else {
                        TLRPC.Chat chat = this.f48092c.getMessagesController().getChat(Long.valueOf(-this.f48090a.f47833a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f48092c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f48092c.getResourceProvider(), j3, 5, str2, new r5(this, j3, 0), 0L).show();
                } else {
                    this.f48095i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f48090a.f47833a);
                    tL_messages_sendPaidReaction.msg_id = this.f48090a.f47834b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48103q.f48132a).getClientUserId()) {
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
                    this.f48103q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f48096j = true;
            this.f48091b.addPaidReactions((int) (-this.h), this.f48094g, c());
            u5 u5Var2 = this.f48103q;
            u5Var2.f48136g -= this.h;
            NotificationCenter.getInstance(u5Var2.f48132a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        c4 c4Var = this.f48101o;
        if (c4Var != null && (messageObject = this.f48091b) != null && messageObject.getId() == c4Var.f47318c) {
            this.f48101o.c();
        }
        u5 u5Var3 = this.f48103q;
        if (u5Var3.B == this) {
            u5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f48100n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48103q.A(this.f48091b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48103q.f48132a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
