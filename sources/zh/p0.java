package zh;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.iq;
import yh.u3;
public final class p0 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f52076a;
    public final b1 f52077b;
    public final o0 f52078c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f52079f;
    public long h;
    public int f52080n;
    public TLRPC.TL_exportedContactToken f52081r;
    public long f52082s;
    public TLRPC.ShareTheme v;
    public int f52083w;
    public boolean f52084x;
    public boolean f52085y;
    public int d = 0;
    public final n0 F = new Runnable(this) {
        public final p0 f52070b;

        {
            this.f52070b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f52070b.j();
                    return;
                default:
                    this.f52070b.i();
                    return;
            }
        }
    };
    public final n0 G = new Runnable(this) {
        public final p0 f52070b;

        {
            this.f52070b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f52070b.j();
                    return;
                default:
                    this.f52070b.i();
                    return;
            }
        }
    };

    public p0(int i10, b1 b1Var, o0 o0Var) {
        this.f52076a = i10;
        this.f52077b = b1Var;
        this.f52078c = o0Var;
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        float f7;
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        int i10 = -1;
        int i11 = 0;
        b1 b1Var = this.f52077b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = b1Var.f51875v1;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i12)).f20496id == tL_starGiftUnique.f20496id) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i10 < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                y0 y0Var = b1Var.F;
                if (y0Var.f52145a == 2 && y0Var.f52151j == i10) {
                    return;
                }
                b1Var.f51719e2 = true;
                b1Var.I.clear();
                Runnable runnable = b1Var.f51709d2;
                if (runnable != null) {
                    runnable.run();
                }
                b1Var.f51881v7 = i10;
                if (b1Var.f51729f2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b1Var.f51901x7 = f7;
                b1Var.f51910y7 = 1.0f;
                b1Var.E0(b1Var.getWidth() / 2.0f, (b1Var.l() / 2.0f) + b1Var.m(), i10);
                b1Var.f51719e2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeBackdrop) {
            int i13 = ((TLRPC.TL_shareThemeBackdrop) shareTheme).backdrop_id;
            b1Var.getClass();
            if (a.h != null) {
                while (true) {
                    int[] iArr = a.h;
                    if (i11 >= iArr.length) {
                        break;
                    } else if (iArr[i11] == i13) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (i10 < 0) {
                i10 = b1.f51669q9;
            }
            b1Var.c(i10);
        } else if (shareTheme instanceof TLRPC.TL_shareThemeEmoji) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_shareThemeEmoji) shareTheme).emojis;
            int size = arrayList3.size();
            while (i11 < size) {
                TLRPC.Reaction reaction = arrayList3.get(i11);
                i11++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                    arrayList2.add(Long.valueOf(((TLRPC.TL_reactionCustomEmoji) reaction2).document_id));
                }
            }
            if (arrayList2.isEmpty()) {
                b1Var.c(b1.f51669q9);
            } else {
                b1Var.d(arrayList2);
            }
        } else {
            b1Var.c(b1.f51669q9);
        }
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken b() {
        int i10 = this.f52076a;
        String string = MessagesController.getMainSettings(i10).getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = MessagesController.getMainSettings(i10).getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String c(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        o0 o0Var = this.f52078c;
        String str = o0Var.f52071a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !o0Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    public final TLRPC.InputPeer d() {
        o0 o0Var = this.f52078c;
        if (o0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.f52076a).getInputPeer(o0Var.f52074f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            k();
        }
    }

    public final void e() {
        TLRPC.TL_messages_getShareTheme tL_messages_getShareTheme = new TLRPC.TL_messages_getShareTheme();
        TLRPC.InputPeer d = d();
        tL_messages_getShareTheme.peer = d;
        if (d == null) {
            return;
        }
        ConnectionsManager.getInstance(this.f52076a).sendRequestTyped(tL_messages_getShareTheme, new Object(), new u3(this, 3));
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: zh.p0.f():void");
    }

    public final void g() {
        this.E = true;
        int i10 = this.f52076a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        i();
        if (this.f52080n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f52080n, true);
            this.f52080n = 0;
        }
    }

    public final void h(boolean z10, boolean z11) {
        int i10 = this.f52080n;
        int i11 = this.f52076a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f52080n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new Object(), new iq(this, r6, z11, 1));
        this.f52080n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void i() {
        if (this.v != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer d = d();
            tL_messages_setShareTheme.peer = d;
            tL_messages_setShareTheme.theme = this.v;
            this.v = null;
            if (d == null) {
                return;
            }
            int i10 = this.f52083w;
            int i11 = this.f52076a;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.f52083w, true);
            }
            int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new Object(), new s1(8, this, r1));
            this.f52083w = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void j() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        n0 n0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(n0Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.f52076a;
        if (i10 == 1 && this.f52080n == 0 && (this.f52079f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f52079f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f52079f.expires - 5))) {
            h(false, true);
        }
        if (this.f52078c.d && ((this.f52081r == null || System.currentTimeMillis() / 1000 >= this.f52081r.expires) && SystemClock.elapsedRealtime() - this.f52082s >= 5000)) {
            this.f52082s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new m(this, 3));
        }
        AndroidUtilities.runOnUIThread(n0Var, 1000L);
    }

    public final void k() {
        long j10;
        int i10 = this.f52076a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        b1 b1Var = this.f52077b;
        b1Var.setFeeStars(j10);
        if (j10 > 0 && !this.e) {
            this.e = true;
            if (!this.f52078c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                b1Var.f51874v0 = true;
                b1Var.f51884w0 = false;
                b1Var.B0 = 1.0f;
                b1Var.D0 = 1.0f;
                b1Var.C0 = 1.0f;
                b1Var.F0 = true;
                b1Var.G0 = 1.0f;
                b1Var.f51914z2 = null;
                b1Var.A2 = -1;
                b1Var.n1(false);
                b1Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken b10 = b();
                this.f52079f = b10;
                if (b10 != null) {
                    b1Var.setFreeLink(c(b10));
                }
                h(false, false);
            }
        }
    }
}
