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
import org.telegram.ui.wn;
public final class r5 {
    public final m5 f48064a;
    public final MessageObject f48065b;
    public final wn f48066c;
    public final rc d;
    public final lc e;
    public final kc f48067f;
    public final boolean f48068g;
    public long h;
    public long f48071k;
    public boolean f48072l;
    public boolean f48073m;
    public b4 f48075o;
    public final p5 f48076p;
    public final s5 f48077q;
    public boolean f48069i = false;
    public boolean f48070j = false;
    public Long f48074n = null;

    public r5(s5 s5Var, m5 m5Var, MessageObject messageObject, wn wnVar, boolean z10) {
        this.f48077q = s5Var;
        p5 p5Var = new p5(this, 0);
        this.f48076p = p5Var;
        this.f48064a = m5Var;
        this.f48065b = messageObject;
        this.f48066c = wnVar;
        Context t10 = s5.t(wnVar);
        lc lcVar = new lc(t10, wnVar.f39562ea);
        this.e = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        lcVar.f25963b.setText(d());
        pc pcVar = new pc(t10, wnVar.f39562ea, true, false);
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f27306a = new p5(this, 1);
        kc kcVar = new kc(t10, wnVar.f39562ea);
        this.f48067f = kcVar;
        kcVar.f25738b = 5000L;
        kcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, wnVar.f39562ea));
        pcVar.addView(kcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(wnVar).b(lcVar, -1);
        this.d = b10;
        b10.f27954r = false;
        if (z10) {
            b10.k(true);
            this.f48073m = true;
        }
        b10.v = p5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f48068g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s5 s5Var = this.f48077q;
        int i10 = s5Var.f48119a;
        AndroidUtilities.cancelRunOnUIThread(this.f48076p);
        this.f48070j = true;
        this.d.b();
        b4 b4Var = this.f48075o;
        if (b4Var != null) {
            b4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f48068g;
        long c10 = c();
        MessageObject messageObject = this.f48065b;
        messageObject.addPaidReactions(i11, z10, c10);
        s5Var.f48123g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s5Var.B == this) {
            s5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48076p);
        if (this.f48072l) {
            if (!this.f48069i && !this.f48070j) {
                s5 y3 = s5.y(this.f48077q.f48119a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48077q.f48119a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48077q.f48119a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f48070j = true;
                    this.f48065b.addPaidReactions((int) (-this.h), this.f48068g, c());
                    s5 s5Var = this.f48077q;
                    s5Var.f48123g = 0L;
                    NotificationCenter.getInstance(s5Var.f48119a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48077q.f48119a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f48065b.getDialogId()), Integer.valueOf(this.f48065b.getId()), this.f48065b.messageOwner.reactions);
                    if (this.f48064a.f47835a >= 0) {
                        str = UserObject.getForcedFirstName(this.f48066c.getMessagesController().getUser(Long.valueOf(this.f48064a.f47835a)));
                    } else {
                        TLRPC.Chat chat = this.f48066c.getMessagesController().getChat(Long.valueOf(-this.f48064a.f47835a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f48066c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new l7(parentActivity, this.f48066c.getResourceProvider(), j3, 5, str2, new q5(this, j3, 0), 0L).show();
                } else {
                    this.f48069i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f48064a.f47835a);
                    tL_messages_sendPaidReaction.msg_id = this.f48064a.f47836b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48077q.f48119a).getClientUserId()) {
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
                    this.f48077q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f48070j = true;
            this.f48065b.addPaidReactions((int) (-this.h), this.f48068g, c());
            s5 s5Var2 = this.f48077q;
            s5Var2.f48123g -= this.h;
            NotificationCenter.getInstance(s5Var2.f48119a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        b4 b4Var = this.f48075o;
        if (b4Var != null && (messageObject = this.f48065b) != null && messageObject.getId() == b4Var.f47336c) {
            this.f48075o.c();
        }
        s5 s5Var3 = this.f48077q;
        if (s5Var3.B == this) {
            s5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f48074n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48077q.A(this.f48065b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48077q.f48119a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
