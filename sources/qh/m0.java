package qh;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.is;
import org.telegram.messenger.rj;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s2;
import org.telegram.ui.nq;
import ph.h1;
public final class m0 implements vs {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean D;
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f45698a;
    public final x0 f45699b;
    public final k0 f45700c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f45701f;
    public long h;
    public int f45702n;
    public TLRPC.TL_exportedContactToken f45703r;
    public long f45704s;
    public TLRPC.ShareTheme f45705w;
    public int f45706x;
    public boolean f45707y;
    public int d = 0;
    public final j0 F = new Runnable(this) {
        public final m0 f45681b;

        {
            this.f45681b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f45681b.p();
                    return;
                default:
                    this.f45681b.o();
                    return;
            }
        }
    };
    public final j0 G = new Runnable(this) {
        public final m0 f45681b;

        {
            this.f45681b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f45681b.p();
                    return;
                default:
                    this.f45681b.o();
                    return;
            }
        }
    };

    public m0(int i10, x0 x0Var, k0 k0Var) {
        this.f45698a = i10;
        this.f45699b = x0Var;
        this.f45700c = k0Var;
    }

    public static LongSparseArray h(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f7;
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z11 = false;
        x0 x0Var = this.f45699b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = x0Var.f46017v1;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i10)).f20022id == tL_starGiftUnique.f20022id) {
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
                u0 u0Var = x0Var.F;
                if (u0Var.f45773a == 2 && u0Var.f45786q == i10) {
                    return;
                }
                x0Var.f45852e2 = true;
                x0Var.I.clear();
                Runnable runnable = x0Var.f45842d2;
                if (runnable != null) {
                    runnable.run();
                }
                x0Var.L7 = i10;
                if (x0Var.f45862f2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x0Var.N7 = f7;
                x0Var.O7 = 1.0f;
                x0Var.I0(x0Var.getWidth() / 2.0f, (x0Var.l() / 2.0f) + x0Var.m(), i10);
                x0Var.f45852e2 = false;
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
            x0Var.e(i12, arrayList, z11);
            return;
        }
        x0Var.d(x0.G9);
    }

    public final void b() {
        this.f45705w = null;
        org.telegram.messenger.i0.r(this.G);
        int i10 = this.f45698a;
        LongSparseArray h = h(i10);
        long j10 = this.f45700c.f45686f;
        l0 l0Var = (l0) h.get(j10);
        if (l0Var != null && l0Var.f45695b == 0) {
            h(i10).remove(j10);
        }
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        String string = f().getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = f().getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        k0 k0Var = this.f45700c;
        String str = k0Var.f45683a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !k0Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j10 = this.f45700c.f45686f;
        if (i10 == at.f14734k0) {
            r();
        } else if (i10 == at.E0) {
            if (((Long) objArr[0]).longValue() == j10) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == at.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f19795id) == j10) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        k0 k0Var = this.f45700c;
        if (k0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer i12 = wp.r1(this.f45698a).i1(k0Var.f45686f);
        if (i12 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return i12;
    }

    public final SharedPreferences f() {
        return wp.r1(this.f45698a).f7;
    }

    public final void g() {
        int i10 = this.f45698a;
        wp r12 = wp.r1(i10);
        long j10 = this.f45700c.f45686f;
        if (j10 > 0) {
            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
            if (Z1 != null) {
                at.f(i10).c(this, at.E0);
                r12.e3(Z1, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        if (L0 == null) {
            return;
        }
        at.f(i10).c(this, at.T);
        is.a0(i10).F0(L0.f19794id, w3.T(L0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j10 = this.f45700c.f45686f;
        if (!this.E) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i10 = this.f45698a;
            l0 l0Var = (l0) h(i10).get(j10);
            if (l0Var != null) {
                TLRPC.ShareTheme shareTheme2 = l0Var.f45694a;
                byte[] q6 = q(shareTheme);
                byte[] q10 = q(shareTheme2);
                if (q6 != null && Arrays.equals(q6, q10)) {
                    h(i10).remove(j10);
                } else if (l0Var.f45695b != 0 && SystemClock.elapsedRealtime() - l0Var.f45695b >= 10000) {
                    h(i10).remove(j10);
                } else {
                    k(l0Var.f45694a);
                    return;
                }
            }
            if (!this.f45707y) {
                TLRPC.ShareTheme shareTheme3 = this.H;
                if (shareTheme3 == null) {
                    x0 x0Var = this.f45699b;
                    x0Var.setInstantTheme(true);
                    a(shareTheme);
                    x0Var.setInstantTheme(false);
                    return;
                }
                byte[] q11 = q(shareTheme);
                byte[] q12 = q(shareTheme3);
                if (q11 != null && Arrays.equals(q11, q12)) {
                    return;
                }
                a(shareTheme);
            }
        }
    }

    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.f45707y = true;
        boolean z10 = false;
        this.D = false;
        k0 k0Var = this.f45700c;
        if (!k0Var.f45687g) {
            return;
        }
        x0 x0Var = this.f45699b;
        TL_stars.TL_starGiftUnique themeGift = x0Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = x0Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (k0Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = x0Var.getThemeGiftSavedId();
                TLRPC.InputPeer e = e();
                if (themeGiftSavedId != 0 && e != null) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat2.peer = e;
                    tL_inputSavedStarGiftChat2.saved_id = themeGiftSavedId;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftChat2;
                }
            }
            if (tL_inputSavedStarGiftChat == null) {
                b();
                return;
            }
            ?? tL_inputShareThemeGift = new TLRPC.TL_inputShareThemeGift();
            tL_inputShareThemeGift.stargift = tL_inputSavedStarGiftChat;
            tL_shareThemeGift2 = new TLRPC.TL_shareThemeGift();
            tL_shareThemeGift2.stargift = themeGift;
            tL_shareThemeGift = tL_inputShareThemeGift;
        } else {
            int themeBackdropIndex = x0Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != x0.G9) {
                z10 = true;
            }
            if (z10 && a.h == null) {
                b();
                this.D = true;
                return;
            } else if (!z10 && pickedEmoji.isEmpty()) {
                tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
            } else {
                ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                if (z10) {
                    tL_shareThemeEmojiBackdrop.flags = 1 | tL_shareThemeEmojiBackdrop.flags;
                    tL_shareThemeEmojiBackdrop.backdrop_id = a.h[themeBackdropIndex];
                }
                if (!pickedEmoji.isEmpty()) {
                    tL_shareThemeEmojiBackdrop.flags |= 2;
                    tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
                }
                tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
            }
        }
        if (tL_shareThemeGift2 == null) {
            tL_shareThemeGift2 = tL_shareThemeGift;
        }
        this.H = tL_shareThemeGift2;
        ?? obj = new Object();
        obj.f45694a = tL_shareThemeGift2;
        h(this.f45698a).put(k0Var.f45686f, obj);
        k(this.H);
        this.f45705w = tL_shareThemeGift;
        j0 j0Var = this.G;
        org.telegram.messenger.i0.r(j0Var);
        org.telegram.messenger.i0.h3(j0Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i10 = this.f45698a;
        wp r12 = wp.r1(i10);
        long j10 = this.f45700c.f45686f;
        if (j10 > 0) {
            TLRPC.UserFull a2 = r12.a2(j10);
            if (a2 != null) {
                a2.share_theme = shareTheme;
                is.a0(i10).j2(a2, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull M0 = r12.M0(-j10);
        if (M0 != null) {
            M0.share_theme = shareTheme;
            is.a0(i10).N1(M0, false);
        }
    }

    public final void l() {
        this.E = true;
        int i10 = this.f45698a;
        at.f(i10).n(this, at.f14734k0);
        at.f(i10).n(this, at.E0);
        at.f(i10).n(this, at.T);
        org.telegram.messenger.i0.r(this.F);
        org.telegram.messenger.i0.r(this.G);
        o();
        if (this.f45702n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f45702n, true);
            this.f45702n = 0;
        }
    }

    public final void m() {
        this.f45704s = SystemClock.elapsedRealtime();
        wp r12 = wp.r1(this.f45698a);
        h1 h1Var = new h1(this, 6);
        if (r12.X7) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = r12.Y7;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            h1Var.a(r12.Y7);
            return;
        }
        r12.X7 = true;
        r12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new rj(r12, h1Var, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z10, boolean z11) {
        int i10 = this.f45702n;
        int i11 = this.f45698a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f45702n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new a3.b(1), new nq(this, r6, z11, 1));
        this.f45702n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.f45705w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e = e();
            tL_messages_setShareTheme.peer = e;
            tL_messages_setShareTheme.theme = this.f45705w;
            this.f45705w = null;
            if (e == null) {
                return;
            }
            int i10 = this.f45706x;
            int i11 = this.f45698a;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.f45706x, true);
            }
            LongSparseArray h = h(i11);
            k0 k0Var = this.f45700c;
            l0 l0Var = (l0) h.get(k0Var.f45686f);
            long j10 = k0Var.f45686f;
            int i12 = this.f45698a;
            int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new a3.b(1), new s2(this, r7, l0Var, i12, j10));
            this.f45706x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        j0 j0Var = this.F;
        org.telegram.messenger.i0.r(j0Var);
        if (this.E) {
            return;
        }
        if (this.d == 1 && this.f45702n == 0 && (this.f45701f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f45701f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.f45698a).getCurrentTime() >= this.f45701f.expires - 5))) {
            n(false, true);
        }
        if (this.f45700c.d && ((this.f45703r == null || System.currentTimeMillis() / 1000 >= this.f45703r.expires) && SystemClock.elapsedRealtime() - this.f45704s >= 5000)) {
            m();
        }
        org.telegram.messenger.i0.h3(j0Var, 1000L);
    }

    public final void r() {
        long j10;
        int i10 = this.f45698a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i10).X;
        if (globalPrivacySettings == null) {
            i5.r(i10).B();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        x0 x0Var = this.f45699b;
        x0Var.setFeeStars(j10);
        if (j10 > 0 && !this.e) {
            this.e = true;
            if (!this.f45700c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                x0Var.f46016v0 = true;
                x0Var.f46027w0 = false;
                x0Var.B0 = 1.0f;
                x0Var.D0 = 1.0f;
                x0Var.C0 = 1.0f;
                x0Var.F0 = true;
                x0Var.G0 = 1.0f;
                x0Var.f46059z2 = null;
                x0Var.A2 = -1;
                x0Var.u1(false);
                x0Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
                this.f45701f = c10;
                if (c10 != null) {
                    x0Var.setFreeLink(d(c10));
                }
                n(false, false);
            }
        }
    }
}
