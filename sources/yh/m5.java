package yh;

import ai.o8;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.ua;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ag;
import org.telegram.messenger.bg;
import org.telegram.messenger.bi;
import org.telegram.messenger.jg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.ej1;
import org.telegram.ui.k01;
import org.telegram.ui.t21;
import org.telegram.ui.zn;
public final class m5 {
    public static volatile m5[][] S = (m5[][]) Array.newInstance(m5.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public l5 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public i5 N;
    public final int f52880a;
    public final boolean f52881b;
    public long f52882c;
    public boolean d;
    public boolean f52883e;
    public long f52885g;
    public boolean h;
    public boolean f52886i;
    public ArrayList f52887j;
    public boolean f52888k;
    public boolean f52889l;
    public ArrayList f52890m;
    public boolean f52891n;
    public boolean f52892o;
    public ArrayList f52893p;
    public String f52899w;
    public boolean f52900x;
    public boolean f52901y;
    public TL_stars.StarsAmount f52884f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f52894q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f52895r = new boolean[3];
    public final String[] f52896s = new String[3];
    public final boolean[] f52897t = new boolean[3];
    public final boolean[] f52898u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f52902z = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final LongSparseArray K = new LongSparseArray();
    public final LongSparseArray L = new LongSparseArray();
    public final ConcurrentHashMap M = new ConcurrentHashMap();
    public final ConcurrentHashMap O = new ConcurrentHashMap();
    public final ConcurrentHashMap P = new ConcurrentHashMap();
    public final Set Q = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap R = new ConcurrentHashMap();

    static {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                T[i10][i11] = new Object();
            }
        }
    }

    public m5(int i10, boolean z10) {
        this.f52880a = i10;
        this.f52881b = z10;
    }

    public static org.telegram.ui.ActionBar.e6 I() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static m5 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, zf.a aVar) {
        if (aVar == null || x(i10, aVar.f54441a).s().f54442b >= aVar.f54442b) {
            return true;
        }
        return false;
    }

    public static void a(m5 m5Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = m5Var.I;
        ArrayList arrayList2 = m5Var.J;
        int i10 = m5Var.f52880a;
        ArrayList arrayList3 = m5Var.H;
        m5Var.C = false;
        m5Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.h7(18)), new ai.h7(19)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.h7(20)));
            m5Var.F = tL_starGifts.hash;
            m5Var.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            m5Var.c0(m5Var.F, m5Var.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = m5Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            m5Var.G = currentTimeMillis;
            m5Var.c0(i11, currentTimeMillis, arrayList3);
        }
    }

    public static void b(m5 m5Var, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = m5Var.f52880a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        m5Var.E = true;
        ArrayList arrayList4 = m5Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = m5Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.h7(15)), new ai.h7(16)));
        ArrayList arrayList6 = m5Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new ai.h7(17)));
        m5Var.F = num.intValue();
        m5Var.G = l4.longValue();
        m5Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        m5Var.V();
    }

    public static void e(String str) {
        ad X;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = ad.a0(R);
        } else {
            X = ad.X();
        }
        hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i10 = savedStarGift.flags;
        if ((i10 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i10 & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
                if (cls.isInstance(starGiftAttribute)) {
                    return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList m(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f20124id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getContext() != null) {
            return n2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.G1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static m5 w(int i10) {
        return y(i10, false);
    }

    public static m5 x(int i10, zf.b bVar) {
        boolean z10;
        if (bVar == zf.b.f54444b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i10, z10);
    }

    public static m5 y(int i10, boolean z10) {
        m5 m5Var;
        m5 m5Var2 = S[z10 ? 1 : 0][i10];
        if (m5Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i10]) {
                try {
                    m5Var = S[z10 ? 1 : 0][i10];
                    if (m5Var == null) {
                        m5[] m5VarArr = S[z10 ? 1 : 0];
                        m5 m5Var3 = new m5(i10, z10);
                        m5VarArr[i10] = m5Var3;
                        m5Var = m5Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m5Var;
        }
        return m5Var2;
    }

    public final long A(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l4;
        l5 l5Var = this.B;
        if (l5Var != null && l5Var.f52835a.equals(g5.b(messageObject)) && (l4 = this.B.f52846n) != null) {
            return l4.longValue();
        }
        if (messageObject == null) {
            myPaidReactionPeer = null;
        } else {
            myPaidReactionPeer = messageObject.getMyPaidReactionPeer();
        }
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f52880a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(g5 g5Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l4;
        l5 l5Var = this.B;
        if (l5Var != null && l5Var.f52835a.equals(g5Var) && (l4 = this.B.f52846n) != null) {
            return l4.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f52880a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f52880a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j10);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new ai.g8(1, callback));
    }

    public final long D(int i10, long j3) {
        l5 l5Var = this.B;
        if (l5Var != null) {
            g5 g5Var = l5Var.f52835a;
            if (g5Var.f52584a == j3 && g5Var.f52585b == i10 && l5Var.f52844l) {
                return l5Var.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            if ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) {
                return D(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId());
            }
            return D(messageObject.getId(), messageObject.getDialogId());
        }
        return 0L;
    }

    public final d5 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        d5 d5Var = (d5) longSparseArray.get(j3);
        if (d5Var == null && z10) {
            d5 d5Var2 = new d5(this.f52880a, j3);
            longSparseArray.put(j3, d5Var2);
            return d5Var2;
        }
        return d5Var;
    }

    public final e5 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        e5 e5Var = (e5) longSparseArray.get(j3);
        if (e5Var == null && z10) {
            e5 e5Var2 = new e5(this.f52880a, j3, true);
            longSparseArray.put(j3, e5Var2);
            return e5Var2;
        }
        return e5Var;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context != null) {
            if (!this.f52883e) {
                r(new o31(this, callback, starGift, j3, 14));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f52880a).getInputPeer(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f52881b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = ei.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_getPaymentForm, new ej1(10, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j3) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f20265id == j3) {
                    return starGift;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j3, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.f52880a).sendRequest(getstargiftupgradepreview, new ai.u1(this, j3, callback, 5));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f52880a).sendRequest(getsavedstargift, new ai.q3(this, b2Var, inputSavedStarGift, callback, 18));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        if (this.f52883e && !this.f52894q[i10].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void P() {
        this.f52883e = false;
        p();
        this.f52883e = true;
    }

    public final void Q(long j3) {
        e5 G = G(j3, false);
        if (G != null) {
            G.i(false);
        }
        d5 d5Var = (d5) this.K.get(j3);
        if (d5Var != null) {
            d5Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j3 = userFull.f20186id;
        e5 G = G(j3, false);
        if (G != null && G.f52444n != userFull.stargifts_count) {
            G.i(false);
        }
        d5 d5Var = (d5) this.K.get(j3);
        if (d5Var != null) {
            d5Var.g();
        }
    }

    public final void S() {
        if (this.f52900x) {
            return;
        }
        this.v.clear();
        this.f52899w = null;
        this.f52900x = false;
        this.f52901y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f52897t;
            if (!zArr[i10]) {
                this.f52894q[i10].clear();
                this.f52896s[i10] = null;
                zArr[i10] = false;
                this.f52898u[i10] = false;
                if (z10) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i10 = this.f52880a;
                if (!z10) {
                    r5.d dVar = new r5.d(this, 23);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.Wallet.q6(messagesStorage, arrayList3, arrayList2, arrayList, dVar, 10));
                    return;
                }
                int i11 = this.F;
                ii.q1 q1Var = new ii.q1(this, 27);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new o8(q1Var, 27));
            }
        }
    }

    public final void W() {
        if (!this.f52881b && !this.f52900x && !this.f52901y) {
            this.f52900x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f52899w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_getStarsSubscriptions, new p4(this, 1));
        }
    }

    public final void X(int i10) {
        boolean z10;
        boolean[] zArr = this.f52897t;
        if (!zArr[i10] && !this.f52898u[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f52881b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i10 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = this.f52896s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_getStarsTransactions, new ai.j8(this, i10, 9));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r40, org.telegram.tgnet.TLRPC.InputInvoice r41, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r42, java.lang.Runnable r43, org.telegram.messenger.Utilities.Callback r44) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m5.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.e6 I = I();
            if (context != null) {
                final long j3 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final m5 m5Var = m5.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j10 = j3;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.e6 e6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ad X;
                                String str5;
                                long j11;
                                eb0 eb0Var;
                                m5 m5Var2 = m5.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j12 = j10;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = ad.a0(R);
                                } else {
                                    X = ad.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new m4(m5Var2, tL_payments_paymentResult, 0));
                                    TLRPC.Updates updates = tL_payments_paymentResult.updates;
                                    TLRPC.Update update = updates.update;
                                    if (update instanceof TL_update.TL_updateChannel) {
                                        j11 = -((TL_update.TL_updateChannel) update).channel_id;
                                    } else {
                                        j11 = 0;
                                    }
                                    if (updates.updates != null) {
                                        for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                            if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                                j11 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                            }
                                        }
                                    }
                                    callback23.run(Long.valueOf(j11), Boolean.TRUE);
                                    if (j11 == 0) {
                                        X.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j12, str6)), R.raw.stars_send).j();
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null && (eb0Var = launchActivity.f33821x0) != null) {
                                        eb0Var.c(true);
                                    }
                                    m5Var2.T(true);
                                    m5Var2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(m5Var2.f52880a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        m5.e0(context3, e6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    e7 e7Var = new e7(context3, e6Var2, j12, 1, chatInvite3.title, new org.telegram.ui.Wallet.q6(m5Var2, zArr, str7, chatInvite3, callback23), 0L);
                                    e7Var.setOnDismissListener(new n4(callback23, zArr, 0));
                                    e7Var.show();
                                } else {
                                    callback23.run(0L, Boolean.FALSE);
                                    int i11 = R.raw.error;
                                    int i12 = R.string.UnknownErrorCode;
                                    if (tL_error2 != null) {
                                        str5 = tL_error2.text;
                                    } else {
                                        str5 = "FAILED_SEND_STARS";
                                    }
                                    hg.c.q(i12, new Object[]{str5}, X, i11, 36);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j3;
        String str;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.e6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j3 = DialogObject.getPeerDialogId(peer);
                } else {
                    j3 = messageObject.getDialogId();
                }
                if (j3 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f52880a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j3 = user.f20185id;
                }
            } else {
                j3 = tL_payments_paymentFormStars.bot_id;
            }
            final long j11 = j3;
            if (j11 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f52880a).getUser(Long.valueOf(j11)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f52880a).getChat(Long.valueOf(-j11));
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final m5 m5Var = m5.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j12 = j10;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j13 = j11;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: yh.a5.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j3, long j10, boolean z10) {
        int i10 = this.f52880a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, j10);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j3);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j10));
        }
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new tg.q(this, hashSet, runnable, 21));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j3, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f52880a);
        messagesStorage.getStorageQueue().postRunnable(new bg(messagesStorage, j3, arrayList, i10));
    }

    public final void d(org.telegram.messenger.MessageObject r15) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m5.d(org.telegram.messenger.MessageObject):void");
    }

    public final l5 d0(final MessageObject messageObject, final zn znVar, final long j3, boolean z10, boolean z11, final Long l4) {
        long j10;
        m5 m5Var;
        boolean z12;
        String str;
        g5 b10 = g5.b(messageObject);
        int i10 = this.f52880a;
        m5 y3 = y(i10, false);
        Context t10 = t(znVar);
        if (t10 == null) {
            return null;
        }
        String str2 = "";
        if (z11 && y3.f52883e && y3.q(false, false, null).amount <= 0) {
            long a2 = znVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new e7(t10, znVar.getResourceProvider(), j3, 5, str2, new Runnable(this) {
                public final m5 f53128b;

                {
                    this.f53128b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f53128b.d0(messageObject, znVar, j3, true, true, l4);
                            return;
                        default:
                            this.f53128b.d0(messageObject, znVar, j3, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        l5 l5Var = this.B;
        if (l5Var != null && l5Var.f52835a.equals(b10)) {
            j10 = 0;
            m5Var = this;
        } else {
            l5 l5Var2 = this.B;
            if (l5Var2 != null) {
                l5Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j10 = 0;
            m5Var = this;
            l5 l5Var3 = new l5(m5Var, b10, messageObject, znVar, z10);
            m5Var.B = l5Var3;
            l5Var3.f52846n = l4;
        }
        if (m5Var.B.h + j3 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            m5Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            m5Var.B = new l5(m5Var, b10, messageObject, znVar, z10);
        }
        final long j11 = m5Var.B.h + j3;
        if (z11 && y3.f52883e && y3.q(false, false, null).amount < j11) {
            m5Var.B.a();
            long a10 = znVar.a();
            if (a10 >= j10) {
                str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-a10));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new e7(t10, znVar.getResourceProvider(), j11, 5, str, new Runnable(m5Var) {
                public final m5 f53128b;

                {
                    this.f53128b = m5Var;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f53128b.d0(messageObject, znVar, j11, true, true, l4);
                            return;
                        default:
                            this.f53128b.d0(messageObject, znVar, j11, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        l5 l5Var4 = m5Var.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        j5 j5Var = l5Var4.f52848p;
        m5 m5Var2 = l5Var4.f52849q;
        int i11 = m5Var2.f52880a;
        nc ncVar = l5Var4.f52838e;
        MessageObject messageObject2 = l5Var4.f52836b;
        if (!l5Var4.f52841i && !l5Var4.f52842j) {
            l5Var4.h += j3;
            System.currentTimeMillis();
            ncVar.f29141c.a();
            ncVar.f29141c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) l5Var4.h, new Object[0])), true, true);
            if (l5Var4.f52845m) {
                l5Var4.f52839f.f28806b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(j5Var);
                AndroidUtilities.runOnUIThread(j5Var, 5000L);
            }
            if (z12) {
                l5Var4.f52844l = true;
                messageObject2.addPaidReactions((int) j3, true, l5Var4.c());
                m5Var2.f52885g += j3;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                l5Var4.f52844l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    l5Var4.f52843k--;
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                l5Var4.f52843k += j3;
            }
            ncVar.f29140b.setText(l5Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        l5 l5Var5 = m5Var.B;
        l5Var5.f52846n = l4;
        return l5Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i10 = this.f52880a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R != null && R.getContext() != null) {
                e0(R.getContext(), R.getResourceProvider());
                return;
            } else {
                e0(activity, null);
                return;
            }
        }
        if (AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) && !z10) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = ei.k3.q(I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new ai.t5(this, callback2, tL_inputInvoiceStars, 25));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            c5.a aVar = new c5.a();
            aVar.f4199c = "inapp";
            aVar.f4198b = tL_starsTopupOption.store_product;
            c5.r a2 = aVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 21));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i10 = (dialogId > 0L ? 1 : (dialogId == 0L ? 0 : -1));
            int i11 = this.f52880a;
            if (i10 >= 0) {
                MessagesController.getInstance(i11).loadFullUser(MessagesController.getInstance(i11).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i11).loadFullChat(-dialogId, 0, true);
            }
            ad.a0(LaunchActivity.U()).Q(R.raw.error, 36, p7.R0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f52883e) {
                r(new org.telegram.messenger.voip.f(this, callback2, j3, tLObject, tL_textWithEntities));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f52880a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f52880a).getInputUser(j3);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = ei.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p(m5.this, tLObject2, tL_error, callback2, tL_inputInvoicePremiumGiftStars, context2, I, name, j3, tLObject, tL_textWithEntities));
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j3, String str) {
        if (!this.f52883e) {
            r(new o31(this, launchActivity, j3, str, 16));
        } else {
            h0(launchActivity, j3, str);
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f52883e) {
                r(new org.telegram.messenger.voip.f(this, callback2, tL_payments_paymentFormStarGift, starGift, j3, 12));
                return;
            }
            String name = DialogObject.getName(this.f52880a, j3);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f52880a).getInputPeer(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f52881b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject q6 = ei.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_sendStarsForm, new k4(this, callback2, context2, I, j10, name, tL_payments_paymentFormStarGift, starGift, j3));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new e7(launchActivity, null, j3, 4, str, new t21(23), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        tc J = ad.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new t21(22));
        J.f31130j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final xh.n4 n4Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f52883e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        m5 m5Var = m5.this;
                        boolean z12 = m5Var.f52883e;
                        xh.n4 n4Var2 = n4Var;
                        if (!z12) {
                            m5.e("NO_BALANCE");
                            n4Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        m5Var.i(starGift, z10, z11, j3, tL_textWithEntities, n4Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f52880a, j3);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f52880a).getInputPeer(j3);
            tL_inputInvoiceStarGift.gift_id = starGift.f20265id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = ei.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final m5 m5Var = m5.this;
                    final xh.n4 n4Var2 = n4Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = name;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j10 = j3;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final xh.n4 n4Var3 = n4Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                m5.e(str2);
                                n4Var3.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            final long j11 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j11 += tL_labeledPrice.amount;
                            }
                            final m5 m5Var2 = m5.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m5Var2.f52880a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j12 = j10;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final m5 m5Var3 = m5.this;
                                    final xh.n4 n4Var4 = n4Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                    final long j13 = j11;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j14 = j12;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ad X;
                                            int i11;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            eb0 eb0Var;
                                            String str6;
                                            m5 m5Var4 = m5.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            xh.n4 n4Var5 = n4Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
                                            long j15 = j13;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j16 = j14;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = ad.a0(R);
                                            } else {
                                                X = ad.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(m5Var4.f52880a).starsPurchaseAvailable()) {
                                                        n4Var5.run(Boolean.FALSE, null);
                                                        m5.e0(context6, e6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    e7 e7Var = new e7(context6, e6Var4, j15, 6, str7, new ua(m5Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, n4Var5), 0L);
                                                    e7Var.setOnDismissListener(new ei.e0(n4Var5, zArr, 17));
                                                    e7Var.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    n4Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    n4Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    n4Var5.run(Boolean.FALSE, null);
                                                    int i12 = R.raw.error;
                                                    int i13 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    hg.c.q(i13, new Object[]{str6}, X, i12, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new m4(m5Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            m5Var4.D = false;
                                            m5Var4.E = true;
                                            m5Var4.G = 0L;
                                            m5Var4.V();
                                            m5Var4.Q(j16);
                                            m5Var4.T(true);
                                            n4Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(m5Var4.f52880a).contains(j16)) {
                                                i11 = 0;
                                                MessagesController.getInstance(m5Var4.f52880a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            } else {
                                                i11 = 0;
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i14 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i14;
                                                str5 = str7;
                                                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i11, i14)));
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j16 < 0) {
                                                long j17 = -j16;
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(m5Var4.f52880a).getChatFull(j17);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(m5Var4.f52880a).putChatFull(chatFull);
                                                }
                                                if (R instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) R;
                                                    if (profileActivity.a() == j16) {
                                                        k01 k01Var = profileActivity.O;
                                                        if (k01Var != null) {
                                                            k01Var.v1(true);
                                                            profileActivity.O.Y0(14);
                                                            profileActivity.G4(false);
                                                        }
                                                        ad a02 = ad.a0(R);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                        if (spannableStringBuilder == null) {
                                                            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str5));
                                                        }
                                                        a02.s(document, string, spannableStringBuilder).k(false);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j17);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new org.telegram.messenger.voip.f(profileActivity2, starGift5, spannableStringBuilder, j15, str5, 13));
                                                R.presentFragment(profileActivity2);
                                            } else if ((R instanceof zn) && ((zn) R).a() == j16) {
                                                ad a03 = ad.a0(R);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j15, new Object[0]));
                                                }
                                                a03.s(document2, string2, spannableStringBuilder).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(m5Var4.f52880a);
                                                int i15 = NotificationCenter.closeProfileActivity;
                                                Long valueOf = Long.valueOf(j16);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, bool);
                                                NotificationCenter.getInstance(m5Var4.f52880a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j16), bool);
                                                zn W9 = zn.W9(j16);
                                                W9.whenFullyVisible(new o31(W9, starGift5, spannableStringBuilder, j15, 15));
                                                R.presentFragment(W9);
                                            }
                                            MessagesController.getInstance(m5Var4.f52880a).getMainSettings().edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.G1;
                                            if (launchActivity != null && (eb0Var = launchActivity.f33821x0) != null) {
                                                eb0Var.c(true);
                                            }
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public final void i0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f52880a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new jg(m5.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f52881b) {
            return false;
        }
        if (di.i.C0()) {
            return true;
        }
        TL_stars.StarsAmount p5 = p();
        if (p5.nanos == 0 && p5.amount == 0) {
            return false;
        }
        return true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i10;
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.e6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                z4 z4Var = new z4(this, j3, i11, zArr, callback2, context2, I, chatInvite, str);
                u2.p0 p0Var = new u2.p0(this, zArr, callback2);
                org.telegram.ui.ActionBar.f3 i12 = bi.i(1, context2, I, false);
                LinearLayout e7 = bi.e(context2, 1);
                e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new r6(context2, 40, 0), w7.x5.d(-1.0f, -1));
                y9 y9Var = new y9(context2);
                y9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                j9Var.A = true;
                j9Var.f27650n = 0;
                j9Var.f27649m = false;
                j9.a(str3, null, null, j9Var.f27653q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    y9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", j9Var, chatInvite);
                } else {
                    y9Var.setImageDrawable(j9Var);
                }
                frameLayout.addView(y9Var, w7.x5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i13 = org.telegram.ui.ActionBar.i6.f20868h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i13, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.x5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.x5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                d7 d7Var = new d7(context2, i11, I);
                w7.z5.a(d7Var);
                d7Var.setOnClickListener(new z5(d7Var, 1));
                frameLayout.addView(d7Var, w7.x5.a(-2.0f, 0.0f, 0.0f, -8.0f, 0.0f, -2, 53));
                e7.addView(frameLayout, w7.x5.q(-1, 117, 7));
                TextView f7 = org.telegram.messenger.q.f(context2, 1, 20.0f);
                f7.setTypeface(AndroidUtilities.bold());
                int i14 = org.telegram.ui.ActionBar.i6.f20905j5;
                f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, I));
                bi.m(R.string.StarsSubscribeTitle, f7, 17);
                TextView h = com.google.android.gms.internal.vision.e2.h(e7, f7, w7.x5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                h.setTextSize(1, 14.0f);
                h.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i15 = tL_starsSubscriptionPricing.period;
                if (i15 == 2592000) {
                    i10 = i13;
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i13;
                    if (i15 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, str2)));
                }
                h.setMaxWidth(ci.d4.a(h.getText(), h.getPaint()));
                h.setGravity(17);
                e7.addView(h, w7.x5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView f10 = org.telegram.messenger.q.f(context2, 1, 14.0f);
                    f10.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, I));
                    f10.setText(Emoji.replaceEmoji(chatInvite.about, f10.getPaint().getFontMetricsInt(), false));
                    f10.setGravity(17);
                    e7.addView(f10, w7.x5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                ci.d dVar = new ci.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                e7.addView(dVar, w7.x5.n(-1, 48));
                ea0 ea0Var = new ea0(context2, I);
                ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new di.a(context2, 11)));
                ea0Var.setGravity(17);
                ea0Var.setTextSize(1, 13.0f);
                ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, I));
                ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, I));
                e7.addView(ea0Var, w7.x5.t(-1, -2, 49, 14, 14, 14, 6));
                i12.customView = e7;
                dVar.setOnClickListener(new xg.e(z4Var, i12, dVar, 8));
                i12.setOnDismissListener(new ai.g5(p0Var, 14));
                i12.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i10, I));
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    i12.makeAttached(U);
                }
                i12.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f52884f.equals(starsAmount);
        int i10 = this.f52880a;
        if (!equals) {
            this.f52884f = starsAmount;
            this.f52885g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f52885g != 0) {
            this.f52885g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j3, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.f52880a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f20121id = id2;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j3;
        int i12 = 0;
        while (i12 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i12);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                tL_inputPhoto.f20057id = photo.f20062id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f20101id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f20050id = document.f20044id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f20099id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i12++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new ag(m5.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                e5 e5Var = (e5) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < e5Var.f52442l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) e5Var.f52442l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f20265id == j3) {
                        return savedStarGift;
                    }
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.f52883e || System.currentTimeMillis() - this.f52882c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f52881b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f52880a).sendRequest(tL_payments_getStarsStatus, new ej1(11, this, runnable));
        }
        if (z10 && this.f52885g > 0) {
            zf.a m10 = zf.a.m(this.f52884f);
            return zf.a.g(Math.max(0L, m10.a() - this.f52885g), m10.f54441a).o();
        }
        return this.f52884f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final zf.a s() {
        zf.b bVar;
        zf.a l4 = zf.a.l(p());
        if (l4 == null) {
            if (this.f52881b) {
                bVar = zf.b.f54444b;
            } else {
                bVar = zf.b.f54443a;
            }
            return zf.a.i(0L, bVar);
        }
        return l4;
    }

    public final ArrayList u() {
        if (!this.f52888k && !this.f52889l) {
            this.f52888k = true;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new p4(this, 3));
            return this.f52890m;
        }
        return this.f52890m;
    }

    public final ArrayList v() {
        if (!this.f52891n && !this.f52892o) {
            this.f52891n = true;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new p4(this, 4));
            return this.f52893p;
        }
        return this.f52893p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f52886i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f52880a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new p4(this, 2));
            return this.f52887j;
        }
        return this.f52887j;
    }
}
