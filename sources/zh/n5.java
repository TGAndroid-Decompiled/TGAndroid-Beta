package zh;

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
import di.ta;
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
import org.telegram.messenger.dg;
import org.telegram.messenger.eg;
import org.telegram.messenger.mg;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b31;
import org.telegram.ui.fo;
import org.telegram.ui.ib0;
import org.telegram.ui.kj1;
import org.telegram.ui.q01;
public final class n5 {
    public static volatile n5[][] S = (n5[][]) Array.newInstance(n5.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public m5 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public j5 N;
    public final int f50865a;
    public final boolean f50866b;
    public long f50867c;
    public boolean d;
    public boolean e;
    public long f50869g;
    public boolean h;
    public boolean f50870i;
    public ArrayList f50871j;
    public boolean f50872k;
    public boolean f50873l;
    public ArrayList f50874m;
    public boolean f50875n;
    public boolean f50876o;
    public ArrayList f50877p;
    public String f50883w;
    public boolean f50884x;
    public boolean f50885y;
    public TL_stars.StarsAmount f50868f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f50878q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f50879r = new boolean[3];
    public final String[] f50880s = new String[3];
    public final boolean[] f50881t = new boolean[3];
    public final boolean[] f50882u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f50886z = new ArrayList();
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

    public n5(int i10, boolean z10) {
        this.f50865a = i10;
        this.f50866b = z10;
    }

    public static org.telegram.ui.ActionBar.c6 I() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static n5 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, ag.a aVar) {
        if (aVar == null || x(i10, aVar.f631a).s().f632b >= aVar.f632b) {
            return true;
        }
        return false;
    }

    public static void a(n5 n5Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = n5Var.I;
        ArrayList arrayList2 = n5Var.J;
        int i10 = n5Var.f50865a;
        ArrayList arrayList3 = n5Var.H;
        n5Var.C = false;
        n5Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.s6(18)), new bi.s6(19)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.s6(20)));
            n5Var.F = tL_starGifts.hash;
            n5Var.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            n5Var.c0(n5Var.F, n5Var.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = n5Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            n5Var.G = currentTimeMillis;
            n5Var.c0(i11, currentTimeMillis, arrayList3);
        }
    }

    public static void b(n5 n5Var, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = n5Var.f50865a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        n5Var.E = true;
        ArrayList arrayList4 = n5Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = n5Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.s6(15)), new bi.s6(16)));
        ArrayList arrayList6 = n5Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new bi.s6(17)));
        n5Var.F = num.intValue();
        n5Var.G = l4.longValue();
        n5Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        n5Var.V();
    }

    public static void e(String str) {
        zc X;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = zc.a0(R);
        } else {
            X = zc.X();
        }
        i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f19002id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var != null && m2Var.getContext() != null) {
            return m2Var.getContext();
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

    public static n5 w(int i10) {
        return y(i10, false);
    }

    public static n5 x(int i10, ag.b bVar) {
        boolean z10;
        if (bVar == ag.b.f634b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i10, z10);
    }

    public static n5 y(int i10, boolean z10) {
        n5 n5Var;
        n5 n5Var2 = S[z10 ? 1 : 0][i10];
        if (n5Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i10]) {
                try {
                    n5Var = S[z10 ? 1 : 0][i10];
                    if (n5Var == null) {
                        n5[] n5VarArr = S[z10 ? 1 : 0];
                        n5 n5Var3 = new n5(i10, z10);
                        n5VarArr[i10] = n5Var3;
                        n5Var = n5Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n5Var;
        }
        return n5Var2;
    }

    public final long A(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l4;
        m5 m5Var = this.B;
        if (m5Var != null && m5Var.f50824a.equals(h5.b(messageObject)) && (l4 = this.B.f50834n) != null) {
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
        Long paidReactionsDialogId = MessagesController.getInstance(this.f50865a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(h5 h5Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l4;
        m5 m5Var = this.B;
        if (m5Var != null && m5Var.f50824a.equals(h5Var) && (l4 = this.B.f50834n) != null) {
            return l4.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f50865a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f50865a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new bi.r7(1, callback));
    }

    public final long D(int i10, long j10) {
        m5 m5Var = this.B;
        if (m5Var != null) {
            h5 h5Var = m5Var.f50824a;
            if (h5Var.f50629a == j10 && h5Var.f50630b == i10 && m5Var.f50832l) {
                return m5Var.h;
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

    public final e5 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        e5 e5Var = (e5) longSparseArray.get(j10);
        if (e5Var == null && z10) {
            e5 e5Var2 = new e5(this.f50865a, j10);
            longSparseArray.put(j10, e5Var2);
            return e5Var2;
        }
        return e5Var;
    }

    public final f5 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        f5 f5Var = (f5) longSparseArray.get(j10);
        if (f5Var == null && z10) {
            f5 f5Var2 = new f5(this.f50865a, j10, true);
            longSparseArray.put(j10, f5Var2);
            return f5Var2;
        }
        return f5Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context != null) {
            if (!this.e) {
                r(new bi.b8(this, callback, starGift, j10, 25));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f50865a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f50866b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = fi.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_getPaymentForm, new kj1(10, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f19141id == j10) {
                    return starGift;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j10, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.f50865a).sendRequest(getstargiftupgradepreview, new bi.l1(this, j10, callback, 5));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f50865a).sendRequest(getsavedstargift, new bi.f3(this, a2Var, inputSavedStarGift, callback, 18));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        if (this.e && !this.f50878q[i10].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void P() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void Q(long j10) {
        f5 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        e5 e5Var = (e5) this.K.get(j10);
        if (e5Var != null) {
            e5Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f19064id;
        f5 G = G(j10, false);
        if (G != null && G.f50512n != userFull.stargifts_count) {
            G.i(false);
        }
        e5 e5Var = (e5) this.K.get(j10);
        if (e5Var != null) {
            e5Var.g();
        }
    }

    public final void S() {
        if (this.f50884x) {
            return;
        }
        this.v.clear();
        this.f50883w = null;
        this.f50884x = false;
        this.f50885y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f50881t;
            if (!zArr[i10]) {
                this.f50878q[i10].clear();
                this.f50880s[i10] = null;
                zArr[i10] = false;
                this.f50882u[i10] = false;
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
                int i10 = this.f50865a;
                if (!z10) {
                    rg.b0 b0Var = new rg.b0(this, 29);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.Wallet.q6(messagesStorage, arrayList3, arrayList2, arrayList, b0Var, 10));
                    return;
                }
                int i11 = this.F;
                ji.p1 p1Var = new ji.p1(this, 27);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new bi.z7(p1Var, 27));
            }
        }
    }

    public final void W() {
        if (!this.f50866b && !this.f50884x && !this.f50885y) {
            this.f50884x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f50883w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_getStarsSubscriptions, new p4(this, 1));
        }
    }

    public final void X(int i10) {
        boolean z10;
        boolean[] zArr = this.f50881t;
        if (!zArr[i10] && !this.f50882u[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f50866b;
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
            String str = this.f50880s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_getStarsTransactions, new bi.u7(this, i10, 9));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r40, org.telegram.tgnet.TLRPC.InputInvoice r41, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r42, java.lang.Runnable r43, org.telegram.messenger.Utilities.Callback r44) {
        throw new UnsupportedOperationException("Method not decompiled: zh.n5.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.c6 I = I();
            if (context != null) {
                final long j10 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final n5 n5Var = n5.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.c6 c6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                zc X;
                                String str5;
                                long j12;
                                ib0 ib0Var;
                                n5 n5Var2 = n5.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j13 = j11;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = zc.a0(R);
                                } else {
                                    X = zc.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new m4(n5Var2, tL_payments_paymentResult, 0));
                                    TLRPC.Updates updates = tL_payments_paymentResult.updates;
                                    TLRPC.Update update = updates.update;
                                    if (update instanceof TL_update.TL_updateChannel) {
                                        j12 = -((TL_update.TL_updateChannel) update).channel_id;
                                    } else {
                                        j12 = 0;
                                    }
                                    if (updates.updates != null) {
                                        for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                            if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                                j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                            }
                                        }
                                    }
                                    callback23.run(Long.valueOf(j12), Boolean.TRUE);
                                    if (j12 == 0) {
                                        X.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j13, str6)), R.raw.stars_send).j();
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null && (ib0Var = launchActivity.f31849x0) != null) {
                                        ib0Var.c(true);
                                    }
                                    n5Var2.T(true);
                                    n5Var2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(n5Var2.f50865a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        n5.e0(context3, c6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    e7 e7Var = new e7(context3, c6Var2, j13, 1, chatInvite3.title, new org.telegram.ui.Wallet.q6(n5Var2, zArr, str7, chatInvite3, callback23), 0L);
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
                                    i2.d.s(i12, new Object[]{str5}, X, i11, 36);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j10;
        String str;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.c6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j10 = DialogObject.getPeerDialogId(peer);
                } else {
                    j10 = messageObject.getDialogId();
                }
                if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f50865a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j10 = user.f19063id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f50865a).getUser(Long.valueOf(j12)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f50865a).getChat(Long.valueOf(-j12));
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
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final n5 n5Var = n5.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: zh.b5.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i10 = this.f50865a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j10);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
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
                this.R.put(Integer.valueOf(id2), new s4(this, hashSet, runnable, 0));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f50865a);
        messagesStorage.getStorageQueue().postRunnable(new eg(messagesStorage, j10, arrayList, i10));
    }

    public final void d(org.telegram.messenger.MessageObject r15) {
        throw new UnsupportedOperationException("Method not decompiled: zh.n5.d(org.telegram.messenger.MessageObject):void");
    }

    public final m5 d0(final MessageObject messageObject, final fo foVar, final long j10, boolean z10, boolean z11, final Long l4) {
        long j11;
        n5 n5Var;
        boolean z12;
        String str;
        h5 b10 = h5.b(messageObject);
        int i10 = this.f50865a;
        n5 y3 = y(i10, false);
        Context t10 = t(foVar);
        if (t10 == null) {
            return null;
        }
        String str2 = "";
        if (z11 && y3.e && y3.q(false, false, null).amount <= 0) {
            long a2 = foVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(foVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = foVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new e7(t10, foVar.getResourceProvider(), j10, 5, str2, new Runnable(this) {
                public final n5 f51111b;

                {
                    this.f51111b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f51111b.d0(messageObject, foVar, j10, true, true, l4);
                            return;
                        default:
                            this.f51111b.d0(messageObject, foVar, j10, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        m5 m5Var = this.B;
        if (m5Var != null && m5Var.f50824a.equals(b10)) {
            j11 = 0;
            n5Var = this;
        } else {
            m5 m5Var2 = this.B;
            if (m5Var2 != null) {
                m5Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            n5Var = this;
            m5 m5Var3 = new m5(n5Var, b10, messageObject, foVar, z10);
            n5Var.B = m5Var3;
            m5Var3.f50834n = l4;
        }
        if (n5Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            n5Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            n5Var.B = new m5(n5Var, b10, messageObject, foVar, z10);
        }
        final long j12 = n5Var.B.h + j10;
        if (z11 && y3.e && y3.q(false, false, null).amount < j12) {
            n5Var.B.a();
            long a10 = foVar.a();
            if (a10 >= j11) {
                str = UserObject.getForcedFirstName(foVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = foVar.getMessagesController().getChat(Long.valueOf(-a10));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new e7(t10, foVar.getResourceProvider(), j12, 5, str, new Runnable(n5Var) {
                public final n5 f51111b;

                {
                    this.f51111b = n5Var;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f51111b.d0(messageObject, foVar, j12, true, true, l4);
                            return;
                        default:
                            this.f51111b.d0(messageObject, foVar, j12, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        m5 m5Var4 = n5Var.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        k5 k5Var = m5Var4.f50836p;
        n5 n5Var2 = m5Var4.f50837q;
        int i11 = n5Var2.f50865a;
        mc mcVar = m5Var4.e;
        MessageObject messageObject2 = m5Var4.f50825b;
        if (!m5Var4.f50829i && !m5Var4.f50830j) {
            m5Var4.h += j10;
            System.currentTimeMillis();
            mcVar.f27067c.a();
            mcVar.f27067c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) m5Var4.h, new Object[0])), true, true);
            if (m5Var4.f50833m) {
                m5Var4.f50827f.f26719b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(k5Var);
                AndroidUtilities.runOnUIThread(k5Var, 5000L);
            }
            if (z12) {
                m5Var4.f50832l = true;
                messageObject2.addPaidReactions((int) j10, true, m5Var4.c());
                n5Var2.f50869g += j10;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                m5Var4.f50832l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    m5Var4.f50831k--;
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                m5Var4.f50831k += j10;
            }
            mcVar.f27066b.setText(m5Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        m5 m5Var5 = n5Var.B;
        m5Var5.f50834n = l4;
        return m5Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i10 = this.f50865a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
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
            JSONObject q6 = fi.k3.q(I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new bi.e5(this, callback2, tL_inputInvoiceStars, 25));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.f4327b = "inapp";
            obj.f4326a = tL_starsTopupOption.store_product;
            c5.s a2 = obj.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 21));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i10 = (dialogId > 0L ? 1 : (dialogId == 0L ? 0 : -1));
            int i11 = this.f50865a;
            if (i10 >= 0) {
                MessagesController.getInstance(i11).loadFullUser(MessagesController.getInstance(i11).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i11).loadFullChat(-dialogId, 0, true);
            }
            zc.a0(LaunchActivity.U()).Q(R.raw.error, 36, p7.R0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.f(this, callback2, j10, tLObject, tL_textWithEntities));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f50865a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f50865a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = fi.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q(n5.this, tLObject2, tL_error, callback2, tL_inputInvoicePremiumGiftStars, context2, I, name, j10, tLObject, tL_textWithEntities));
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.e) {
            r(new bi.b8(this, launchActivity, j10, str, 27));
        } else {
            h0(launchActivity, j10, str);
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.f(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 12));
                return;
            }
            String name = DialogObject.getName(this.f50865a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f50865a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f50866b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject q6 = fi.k3.q(I, false);
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
            long j11 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_sendStarsForm, new k4(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new e7(launchActivity, null, j10, 4, str, new b31(24), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sc J = zc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new b31(23));
        J.f28805j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final yh.l4 l4Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        n5 n5Var = n5.this;
                        boolean z12 = n5Var.e;
                        yh.l4 l4Var2 = l4Var;
                        if (!z12) {
                            n5.e("NO_BALANCE");
                            l4Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        n5Var.i(starGift, z10, z11, j10, tL_textWithEntities, l4Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f50865a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f50865a).getInputPeer(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f19141id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = fi.k3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final n5 n5Var = n5.this;
                    final yh.l4 l4Var2 = l4Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
                    final String str = name;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j11 = j10;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final yh.l4 l4Var3 = l4Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                n5.e(str2);
                                l4Var3.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            final long j12 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j12 += tL_labeledPrice.amount;
                            }
                            final n5 n5Var2 = n5.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(n5Var2.f50865a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final n5 n5Var3 = n5.this;
                                    final yh.l4 l4Var4 = l4Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                                    final long j14 = j12;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j15 = j13;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            zc X;
                                            int i11;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            ib0 ib0Var;
                                            String str6;
                                            n5 n5Var4 = n5.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            yh.l4 l4Var5 = l4Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.c6 c6Var4 = c6Var3;
                                            long j16 = j14;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = zc.a0(R);
                                            } else {
                                                X = zc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(n5Var4.f50865a).starsPurchaseAvailable()) {
                                                        l4Var5.run(Boolean.FALSE, null);
                                                        n5.e0(context6, c6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    e7 e7Var = new e7(context6, c6Var4, j16, 6, str7, new ta(n5Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, l4Var5), 0L);
                                                    e7Var.setOnDismissListener(new fi.d0(l4Var5, zArr, 17));
                                                    e7Var.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    l4Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    l4Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    l4Var5.run(Boolean.FALSE, null);
                                                    int i12 = R.raw.error;
                                                    int i13 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    i2.d.s(i13, new Object[]{str6}, X, i12, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new m4(n5Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            n5Var4.D = false;
                                            n5Var4.E = true;
                                            n5Var4.G = 0L;
                                            n5Var4.V();
                                            n5Var4.Q(j17);
                                            n5Var4.T(true);
                                            l4Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(n5Var4.f50865a).contains(j17)) {
                                                i11 = 0;
                                                MessagesController.getInstance(n5Var4.f50865a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
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
                                            if (j17 < 0) {
                                                long j18 = -j17;
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(n5Var4.f50865a).getChatFull(j18);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(n5Var4.f50865a).putChatFull(chatFull);
                                                }
                                                if (R instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) R;
                                                    if (profileActivity.a() == j17) {
                                                        q01 q01Var = profileActivity.O;
                                                        if (q01Var != null) {
                                                            q01Var.w1(true);
                                                            profileActivity.O.Z0(14);
                                                            profileActivity.G4(false);
                                                        }
                                                        zc a02 = zc.a0(R);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                        if (spannableStringBuilder == null) {
                                                            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j16, str5));
                                                        }
                                                        a02.s(document, string, spannableStringBuilder).k(false);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j18);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new org.telegram.messenger.voip.f(profileActivity2, starGift5, spannableStringBuilder, j16, str5, 13));
                                                R.presentFragment(profileActivity2);
                                            } else if ((R instanceof fo) && ((fo) R).a() == j17) {
                                                zc a03 = zc.a0(R);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]));
                                                }
                                                a03.s(document2, string2, spannableStringBuilder).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(n5Var4.f50865a);
                                                int i15 = NotificationCenter.closeProfileActivity;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, bool);
                                                NotificationCenter.getInstance(n5Var4.f50865a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                fo W9 = fo.W9(j17);
                                                W9.whenFullyVisible(new bi.b8(W9, starGift5, spannableStringBuilder, j16, 26));
                                                R.presentFragment(W9);
                                            }
                                            MessagesController.getInstance(n5Var4.f50865a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.G1;
                                            if (launchActivity != null && (ib0Var = launchActivity.f31849x0) != null) {
                                                ib0Var.c(true);
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

    public final void i0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f50865a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new mg(n5.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f50866b) {
            return false;
        }
        if (ei.i.C0()) {
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
            org.telegram.ui.ActionBar.c6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                a5 a5Var = new a5(this, j10, i11, zArr, callback2, context2, I, chatInvite, str);
                m mVar = new m(this, zArr, callback2);
                org.telegram.ui.ActionBar.e3 i12 = sk.i(1, context2, I, false);
                LinearLayout e = sk.e(context2, 1);
                e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new r6(context2, 40, 0), w7.z5.d(-1.0f, -1));
                z9 z9Var = new z9(context2);
                z9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                k9Var.A = true;
                k9Var.f26290n = 0;
                k9Var.f26289m = false;
                k9.a(str3, null, null, k9Var.f26293q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    z9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", k9Var, chatInvite);
                } else {
                    z9Var.setImageDrawable(k9Var);
                }
                frameLayout.addView(z9Var, w7.z5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i13 = org.telegram.ui.ActionBar.g6.f19672h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i13, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.z5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.z5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                d7 d7Var = new d7(context2, i11, I);
                w7.b6.a(d7Var);
                d7Var.setOnClickListener(new z5(d7Var, 1));
                frameLayout.addView(d7Var, w7.z5.a(-2.0f, 0.0f, 0.0f, -8.0f, 0.0f, -2, 53));
                e.addView(frameLayout, w7.z5.q(-1, 117, 7));
                TextView f7 = org.telegram.messenger.g0.f(context2, 1, 20.0f);
                f7.setTypeface(AndroidUtilities.bold());
                int i14 = org.telegram.ui.ActionBar.g6.f19707j5;
                f7.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, I));
                sk.m(R.string.StarsSubscribeTitle, f7, 17);
                TextView i15 = com.google.android.gms.internal.play_billing.k3.i(e, f7, w7.z5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                i15.setTextSize(1, 14.0f);
                i15.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i16 = tL_starsSubscriptionPricing.period;
                if (i16 == 2592000) {
                    i10 = i13;
                    i15.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i13;
                    if (i16 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    i15.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, str2)));
                }
                i15.setMaxWidth(di.d4.a(i15.getText(), i15.getPaint()));
                i15.setGravity(17);
                e.addView(i15, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView f10 = org.telegram.messenger.g0.f(context2, 1, 14.0f);
                    f10.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, I));
                    f10.setText(Emoji.replaceEmoji(chatInvite.about, f10.getPaint().getFontMetricsInt(), false));
                    f10.setGravity(17);
                    e.addView(f10, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                di.d dVar = new di.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                e.addView(dVar, w7.z5.n(-1, 48));
                da0 da0Var = new da0(context2, I);
                da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new ei.a(context2, 11)));
                da0Var.setGravity(17);
                da0Var.setTextSize(1, 13.0f);
                da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, I));
                da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, I));
                e.addView(da0Var, w7.z5.t(-1, -2, 49, 14, 14, 14, 6));
                i12.customView = e;
                dVar.setOnClickListener(new yg.e(a5Var, i12, dVar, 8));
                i12.setOnDismissListener(new bi.t4(mVar, 14));
                i12.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i10, I));
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    i12.makeAttached(U);
                }
                i12.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f50868f.equals(starsAmount);
        int i10 = this.f50865a;
        if (!equals) {
            this.f50868f = starsAmount;
            this.f50869g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f50869g != 0) {
            this.f50869g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.f50865a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f18999id = id2;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
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
                tL_inputPhoto.f18935id = photo.f18940id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f18979id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f18928id = document.f18922id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f18977id = tL_inputDocument;
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
                AndroidUtilities.runOnUIThread(new dg(n5.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                f5 f5Var = (f5) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < f5Var.f50510l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f5Var.f50510l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f19141id == j10) {
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
        if (((!this.e || System.currentTimeMillis() - this.f50867c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f50866b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f50865a).sendRequest(tL_payments_getStarsStatus, new kj1(11, this, runnable));
        }
        if (z10 && this.f50869g > 0) {
            ag.a m10 = ag.a.m(this.f50868f);
            return ag.a.g(Math.max(0L, m10.a() - this.f50869g), m10.f631a).o();
        }
        return this.f50868f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final ag.a s() {
        ag.b bVar;
        ag.a l4 = ag.a.l(p());
        if (l4 == null) {
            if (this.f50866b) {
                bVar = ag.b.f634b;
            } else {
                bVar = ag.b.f633a;
            }
            return ag.a.i(0L, bVar);
        }
        return l4;
    }

    public final ArrayList u() {
        if (!this.f50872k && !this.f50873l) {
            this.f50872k = true;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new p4(this, 3));
            return this.f50874m;
        }
        return this.f50874m;
    }

    public final ArrayList v() {
        if (!this.f50875n && !this.f50876o) {
            this.f50875n = true;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new p4(this, 4));
            return this.f50877p;
        }
        return this.f50877p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f50870i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f50865a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new p4(this, 2));
            return this.f50871j;
        }
        return this.f50871j;
    }
}
