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
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class s5 {
    public final m5 f51963a;
    public final MessageObject f51964b;
    public final yn f51965c;
    public final rc d;
    public final lc f51966e;
    public final kc f51967f;
    public final boolean f51968g;
    public long h;
    public long f51971k;
    public boolean f51972l;
    public boolean f51973m;
    public b4 f51975o;
    public final p5 f51976p;
    public final t5 f51977q;
    public boolean f51969i = false;
    public boolean f51970j = false;
    public Long f51974n = null;

    public s5(t5 t5Var, m5 m5Var, MessageObject messageObject, yn ynVar, boolean z10) {
        this.f51977q = t5Var;
        p5 p5Var = new p5(this, 0);
        this.f51976p = p5Var;
        this.f51963a = m5Var;
        this.f51964b = messageObject;
        this.f51965c = ynVar;
        Context t10 = t5.t(ynVar);
        lc lcVar = new lc(t10, ynVar.f43299ca);
        this.f51966e = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        lcVar.f28329b.setText(d());
        pc pcVar = new pc(t10, ynVar.f43299ca, true, false);
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29594a = new p5(this, 1);
        kc kcVar = new kc(t10, ynVar.f43299ca);
        this.f51967f = kcVar;
        kcVar.f28063b = 5000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, ynVar.f43299ca));
        pcVar.addView(kcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(ynVar).b(lcVar, -1);
        this.d = b10;
        b10.f30346r = false;
        if (z10) {
            b10.k(true);
            this.f51973m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f51968g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t5 t5Var = this.f51977q;
        int i10 = t5Var.f52010a;
        AndroidUtilities.cancelRunOnUIThread(this.f51976p);
        this.f51970j = true;
        this.d.b();
        b4 b4Var = this.f51975o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f51968g;
        long c10 = c();
        MessageObject messageObject = this.f51964b;
        messageObject.addPaidReactions(i11, z10, c10);
        t5Var.f52015g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t5Var.B == this) {
            t5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f51976p);
        if (this.f51972l) {
            if (!this.f51969i && !this.f51970j) {
                t5 y3 = t5.y(this.f51977q.f52010a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f51977q.f52010a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f51977q.f52010a);
                long j3 = this.h;
                if (y3.f52013e && y3.q(false, false, null).amount < j3) {
                    this.f51970j = true;
                    this.f51964b.addPaidReactions((int) (-this.h), this.f51968g, c());
                    t5 t5Var = this.f51977q;
                    t5Var.f52015g = 0L;
                    NotificationCenter.getInstance(t5Var.f52010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f51977q.f52010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f51964b.getDialogId()), Integer.valueOf(this.f51964b.getId()), this.f51964b.messageOwner.reactions);
                    if (this.f51963a.f51630a >= 0) {
                        str = UserObject.getForcedFirstName(this.f51965c.getMessagesController().getUser(Long.valueOf(this.f51963a.f51630a)));
                    } else {
                        TLRPC.Chat chat = this.f51965c.getMessagesController().getChat(Long.valueOf(-this.f51963a.f51630a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f51965c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new m7(parentActivity, this.f51965c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f51969i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f51963a.f51630a);
                    tL_messages_sendPaidReaction.msg_id = this.f51963a.f51631b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f51977q.f52010a).getClientUserId()) {
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
                    this.f51977q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f51970j = true;
            this.f51964b.addPaidReactions((int) (-this.h), this.f51968g, c());
            t5 t5Var2 = this.f51977q;
            t5Var2.f52015g -= this.h;
            NotificationCenter.getInstance(t5Var2.f52010a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f51975o;
        if (b4Var != null && (messageObject = this.f51964b) != null && messageObject.getId() == b4Var.f51120c) {
            this.f51975o.c();
        }
        t5 t5Var3 = this.f51977q;
        if (t5Var3.B == this) {
            t5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f51974n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f51977q.A(this.f51964b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f51977q.f52010a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
