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
import yh.t3;
public final class i0 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f51738a;
    public final u0 f51739b;
    public final h0 f51740c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f51741f;
    public long h;
    public int f51742n;
    public TLRPC.TL_exportedContactToken f51743r;
    public long f51744s;
    public TLRPC.ShareTheme v;
    public int f51745w;
    public boolean f51746x;
    public boolean f51747y;
    public int d = 0;
    public final g0 F = new Runnable(this) {
        public final i0 f51731b;

        {
            this.f51731b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f51731b.j();
                    return;
                default:
                    this.f51731b.i();
                    return;
            }
        }
    };
    public final g0 G = new Runnable(this) {
        public final i0 f51731b;

        {
            this.f51731b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f51731b.j();
                    return;
                default:
                    this.f51731b.i();
                    return;
            }
        }
    };

    public i0(int i10, u0 u0Var, h0 h0Var) {
        this.f51738a = i10;
        this.f51739b = u0Var;
        this.f51740c = h0Var;
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f7;
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z11 = false;
        u0 u0Var = this.f51739b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = u0Var.f52061v1;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i10)).f20496id == tL_starGiftUnique.f20496id) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    arrayList2.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                r0 r0Var = u0Var.F;
                if (r0Var.f51805a == 2 && r0Var.f51818q == i10) {
                    return;
                }
                u0Var.f51896e2 = true;
                u0Var.I.clear();
                Runnable runnable = u0Var.f51886d2;
                if (runnable != null) {
                    runnable.run();
                }
                u0Var.M7 = i10;
                if (u0Var.f51906f2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.O7 = f7;
                u0Var.P7 = 1.0f;
                u0Var.I0(u0Var.getWidth() / 2.0f, (u0Var.l() / 2.0f) + u0Var.m(), i10);
                u0Var.f51896e2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) {
            TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
            int i11 = tL_shareThemeEmojiBackdrop.flags;
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            int i12 = tL_shareThemeEmojiBackdrop.backdrop_id;
            if ((i11 & 2) != 0) {
                arrayList = tL_shareThemeEmojiBackdrop.emojis;
            } else {
                arrayList = null;
            }
            u0Var.e(i12, arrayList, z11);
            return;
        }
        u0Var.d(u0.H9);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken b() {
        int i10 = this.f51738a;
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
        h0 h0Var = this.f51740c;
        String str = h0Var.f51733a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !h0Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    public final TLRPC.InputPeer d() {
        h0 h0Var = this.f51740c;
        if (h0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.f51738a).getInputPeer(h0Var.f51736f);
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
        ConnectionsManager.getInstance(this.f51738a).sendRequestTyped(tL_messages_getShareTheme, new Object(), new t3(this, 3));
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: zh.i0.f():void");
    }

    public final void g() {
        this.E = true;
        int i10 = this.f51738a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        i();
        if (this.f51742n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f51742n, true);
            this.f51742n = 0;
        }
    }

    public final void h(boolean z10, boolean z11) {
        int i10 = this.f51742n;
        int i11 = this.f51738a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f51742n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new Object(), new iq(this, r6, z11, 1));
        this.f51742n = sendRequestTyped;
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
            int i10 = this.f51745w;
            int i11 = this.f51738a;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.f51745w, true);
            }
            int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new Object(), new s1(8, this, r1));
            this.f51745w = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void j() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        g0 g0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(g0Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.f51738a;
        if (i10 == 1 && this.f51742n == 0 && (this.f51741f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f51741f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f51741f.expires - 5))) {
            h(false, true);
        }
        if (this.f51740c.d && ((this.f51743r == null || System.currentTimeMillis() / 1000 >= this.f51743r.expires) && SystemClock.elapsedRealtime() - this.f51744s >= 5000)) {
            this.f51744s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new g(this, 3));
        }
        AndroidUtilities.runOnUIThread(g0Var, 1000L);
    }

    public final void k() {
        long j10;
        int i10 = this.f51738a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        u0 u0Var = this.f51739b;
        u0Var.setFeeStars(j10);
        if (j10 > 0 && !this.e) {
            this.e = true;
            if (!this.f51740c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                u0Var.f52060v0 = true;
                u0Var.f52071w0 = false;
                u0Var.B0 = 1.0f;
                u0Var.D0 = 1.0f;
                u0Var.C0 = 1.0f;
                u0Var.F0 = true;
                u0Var.G0 = 1.0f;
                u0Var.f52103z2 = null;
                u0Var.A2 = -1;
                u0Var.u1(false);
                u0Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken b10 = b();
                this.f51741f = b10;
                if (b10 != null) {
                    u0Var.setFreeLink(c(b10));
                }
                h(false, false);
            }
        }
    }
}
