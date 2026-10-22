package zh;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a3;
import org.telegram.ui.gq;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f52096a;
    public final c1 f52097b;
    public final p0 f52098c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f52099f;
    public long h;
    public int f52100n;
    public TLRPC.TL_exportedContactToken f52101r;
    public long f52102s;
    public TLRPC.ShareTheme v;
    public int f52103w;
    public boolean f52104x;
    public boolean f52105y;
    public int d = 0;
    public final o0 F = new Runnable(this) {
        public final r0 f52071b;

        {
            this.f52071b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f52071b.n();
                    return;
                default:
                    this.f52071b.m();
                    return;
            }
        }
    };
    public final o0 G = new Runnable(this) {
        public final r0 f52071b;

        {
            this.f52071b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f52071b.n();
                    return;
                default:
                    this.f52071b.m();
                    return;
            }
        }
    };

    public r0(int i10, c1 c1Var, p0 p0Var) {
        this.f52096a = i10;
        this.f52097b = c1Var;
        this.f52098c = p0Var;
    }

    public static LongSparseArray g(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] o(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f7;
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z11 = false;
        c1 c1Var = this.f52097b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = c1Var.f51916v1;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i10)).f20503id == tL_starGiftUnique.f20503id) {
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
                z0 z0Var = c1Var.F;
                if (z0Var.f52159a == 2 && z0Var.f52172q == i10) {
                    return;
                }
                c1Var.f51751e2 = true;
                c1Var.I.clear();
                Runnable runnable = c1Var.f51741d2;
                if (runnable != null) {
                    runnable.run();
                }
                c1Var.M7 = i10;
                if (c1Var.f51761f2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c1Var.O7 = f7;
                c1Var.P7 = 1.0f;
                c1Var.I0(c1Var.getWidth() / 2.0f, (c1Var.l() / 2.0f) + c1Var.m(), i10);
                c1Var.f51751e2 = false;
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
            c1Var.e(i12, arrayList, z11);
            return;
        }
        c1Var.d(c1.H9);
    }

    public final void b() {
        this.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
        int i10 = this.f52096a;
        LongSparseArray g10 = g(i10);
        long j10 = this.f52098c.f52078f;
        q0 q0Var = (q0) g10.get(j10);
        if (q0Var != null && q0Var.f52085b == 0) {
            g(i10).remove(j10);
        }
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        int i10 = this.f52096a;
        String string = MessagesController.getMainSettings(i10).getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = MessagesController.getMainSettings(i10).getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        p0 p0Var = this.f52098c;
        String str = p0Var.f52075a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !p0Var.d) {
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
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            p();
            return;
        }
        int i12 = NotificationCenter.userInfoDidLoad;
        p0 p0Var = this.f52098c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == p0Var.f52078f) {
                h(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f20280id) == p0Var.f52078f) {
            h(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        p0 p0Var = this.f52098c;
        if (p0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.f52096a).getInputPeer(p0Var.f52078f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    public final void f() {
        int i10 = this.f52096a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f52098c.f52078f;
        if (j10 > 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            if (user != null) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
                messagesController.loadUserInfo(user, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
        MessagesStorage.getInstance(i10).loadChatInfo(chat.f20279id, ChatObject.isChannel(chat), null, true, false);
    }

    public final void h(TLRPC.ShareTheme shareTheme) {
        long j10 = this.f52098c.f52078f;
        if (!this.E) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i10 = this.f52096a;
            q0 q0Var = (q0) g(i10).get(j10);
            if (q0Var != null) {
                TLRPC.ShareTheme shareTheme2 = q0Var.f52084a;
                byte[] o10 = o(shareTheme);
                byte[] o11 = o(shareTheme2);
                if (o10 != null && Arrays.equals(o10, o11)) {
                    g(i10).remove(j10);
                } else if (q0Var.f52085b != 0 && SystemClock.elapsedRealtime() - q0Var.f52085b >= 10000) {
                    g(i10).remove(j10);
                } else {
                    j(q0Var.f52084a);
                    return;
                }
            }
            if (!this.f52104x) {
                TLRPC.ShareTheme shareTheme3 = this.H;
                if (shareTheme3 == null) {
                    c1 c1Var = this.f52097b;
                    c1Var.setInstantTheme(true);
                    a(shareTheme);
                    c1Var.setInstantTheme(false);
                    return;
                }
                byte[] o12 = o(shareTheme);
                byte[] o13 = o(shareTheme3);
                if (o12 != null && Arrays.equals(o12, o13)) {
                    return;
                }
                a(shareTheme);
            }
        }
    }

    public final void i() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.f52104x = true;
        boolean z10 = false;
        this.f52105y = false;
        p0 p0Var = this.f52098c;
        if (!p0Var.f52079g) {
            return;
        }
        c1 c1Var = this.f52097b;
        TL_stars.TL_starGiftUnique themeGift = c1Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = c1Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (p0Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = c1Var.getThemeGiftSavedId();
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
            int themeBackdropIndex = c1Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != c1.H9) {
                z10 = true;
            }
            if (z10 && a.h == null) {
                b();
                this.f52105y = true;
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
        obj.f52084a = tL_shareThemeGift2;
        g(this.f52096a).put(p0Var.f52078f, obj);
        j(this.H);
        this.v = tL_shareThemeGift;
        o0 o0Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        AndroidUtilities.runOnUIThread(o0Var, 700L);
    }

    public final void j(TLRPC.ShareTheme shareTheme) {
        int i10 = this.f52096a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f52098c.f52078f;
        if (j10 > 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j10);
            if (userFull != null) {
                userFull.share_theme = shareTheme;
                MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j10);
        if (chatFull != null) {
            chatFull.share_theme = shareTheme;
            MessagesStorage.getInstance(i10).updateChatInfo(chatFull, false);
        }
    }

    public final void k() {
        this.E = true;
        int i10 = this.f52096a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        m();
        if (this.f52100n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f52100n, true);
            this.f52100n = 0;
        }
    }

    public final void l(boolean z10, boolean z11) {
        int i10 = this.f52100n;
        int i11 = this.f52096a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f52100n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new Object(), new gq(this, r6, z11, 1));
        this.f52100n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void m() {
        if (this.v != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e = e();
            tL_messages_setShareTheme.peer = e;
            tL_messages_setShareTheme.theme = this.v;
            this.v = null;
            if (e == null) {
                return;
            }
            int i10 = this.f52103w;
            int i11 = this.f52096a;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.f52103w, true);
            }
            LongSparseArray g10 = g(i11);
            p0 p0Var = this.f52098c;
            q0 q0Var = (q0) g10.get(p0Var.f52078f);
            long j10 = p0Var.f52078f;
            int i12 = this.f52096a;
            int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new Object(), new a3(this, r7, q0Var, i12, j10));
            this.f52103w = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void n() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        o0 o0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.f52096a;
        if (i10 == 1 && this.f52100n == 0 && (this.f52099f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f52099f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f52099f.expires - 5))) {
            l(false, true);
        }
        if (this.f52098c.d && ((this.f52101r == null || System.currentTimeMillis() / 1000 >= this.f52101r.expires) && SystemClock.elapsedRealtime() - this.f52102s >= 5000)) {
            this.f52102s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new g(this, 2));
        }
        AndroidUtilities.runOnUIThread(o0Var, 1000L);
    }

    public final void p() {
        long j10;
        int i10 = this.f52096a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        c1 c1Var = this.f52097b;
        c1Var.setFeeStars(j10);
        if (j10 > 0 && !this.e) {
            this.e = true;
            if (!this.f52098c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                c1Var.f51915v0 = true;
                c1Var.f51926w0 = false;
                c1Var.B0 = 1.0f;
                c1Var.D0 = 1.0f;
                c1Var.C0 = 1.0f;
                c1Var.F0 = true;
                c1Var.G0 = 1.0f;
                c1Var.f51958z2 = null;
                c1Var.A2 = -1;
                c1Var.u1(false);
                c1Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
                this.f52099f = c10;
                if (c10 != null) {
                    c1Var.setFreeLink(d(c10));
                }
                l(false, false);
            }
        }
    }
}
