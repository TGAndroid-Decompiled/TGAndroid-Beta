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
import org.telegram.ui.zn;
public final class s5 {
    public final n5 f48002a;
    public final MessageObject f48003b;
    public final zn f48004c;
    public final qc d;
    public final kc e;
    public final jc f48005f;
    public final boolean f48006g;
    public long h;
    public long f48009k;
    public boolean f48010l;
    public boolean f48011m;
    public c4 f48013o;
    public final q5 f48014p;
    public final t5 f48015q;
    public boolean f48007i = false;
    public boolean f48008j = false;
    public Long f48012n = null;

    public s5(t5 t5Var, n5 n5Var, MessageObject messageObject, zn znVar, boolean z10) {
        this.f48015q = t5Var;
        q5 q5Var = new q5(this, 0);
        this.f48014p = q5Var;
        this.f48002a = n5Var;
        this.f48003b = messageObject;
        this.f48004c = znVar;
        Context t10 = t5.t(znVar);
        kc kcVar = new kc(t10, znVar.f40261ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f25679b.setText(d());
        oc ocVar = new oc(t10, znVar.f40261ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f26906a = new q5(this, 1);
        jc jcVar = new jc(t10, znVar.f40261ea);
        this.f48005f = jcVar;
        jcVar.f25289b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar.f40261ea));
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(znVar).b(kcVar, -1);
        this.d = b10;
        b10.f27558r = false;
        if (z10) {
            b10.k(true);
            this.f48011m = true;
        }
        b10.v = q5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f48006g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t5 t5Var = this.f48015q;
        int i10 = t5Var.f48042a;
        AndroidUtilities.cancelRunOnUIThread(this.f48014p);
        this.f48008j = true;
        this.d.b();
        c4 c4Var = this.f48013o;
        if (c4Var != null) {
            c4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f48006g;
        long c10 = c();
        MessageObject messageObject = this.f48003b;
        messageObject.addPaidReactions(i11, z10, c10);
        t5Var.f48046g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t5Var.B == this) {
            t5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f48014p);
        if (this.f48010l) {
            if (!this.f48007i && !this.f48008j) {
                t5 y3 = t5.y(this.f48015q.f48042a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f48015q.f48042a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f48015q.f48042a);
                long j3 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j3) {
                    this.f48008j = true;
                    this.f48003b.addPaidReactions((int) (-this.h), this.f48006g, c());
                    t5 t5Var = this.f48015q;
                    t5Var.f48046g = 0L;
                    NotificationCenter.getInstance(t5Var.f48042a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f48015q.f48042a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f48003b.getDialogId()), Integer.valueOf(this.f48003b.getId()), this.f48003b.messageOwner.reactions);
                    if (this.f48002a.f47768a >= 0) {
                        str = UserObject.getForcedFirstName(this.f48004c.getMessagesController().getUser(Long.valueOf(this.f48002a.f47768a)));
                    } else {
                        TLRPC.Chat chat = this.f48004c.getMessagesController().getChat(Long.valueOf(-this.f48002a.f47768a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f48004c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new k7(parentActivity, this.f48004c.getResourceProvider(), j3, 5, str2, new r5(this, j3, 0), 0L).show();
                } else {
                    this.f48007i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f48002a.f47768a);
                    tL_messages_sendPaidReaction.msg_id = this.f48002a.f47769b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f48015q.f48042a).getClientUserId()) {
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
                    this.f48015q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
                }
            }
        } else {
            this.f48008j = true;
            this.f48003b.addPaidReactions((int) (-this.h), this.f48006g, c());
            t5 t5Var2 = this.f48015q;
            t5Var2.f48046g -= this.h;
            NotificationCenter.getInstance(t5Var2.f48042a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        c4 c4Var = this.f48013o;
        if (c4Var != null && (messageObject = this.f48003b) != null && messageObject.getId() == c4Var.f47254c) {
            this.f48013o.c();
        }
        t5 t5Var3 = this.f48015q;
        if (t5Var3.B == this) {
            t5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f48012n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f48015q.A(this.f48003b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f48015q.f48042a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
