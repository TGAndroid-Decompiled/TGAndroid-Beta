package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dq;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.im;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.sq;
import org.telegram.messenger.vp;
import org.telegram.messenger.x00;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ix0;
import org.telegram.ui.mb;
import org.telegram.ui.ul0;
import org.telegram.ui.un;
import org.telegram.ui.w90;
public final class e6 {
    public static volatile e6[][] S = (e6[][]) Array.newInstance(e6.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public c6 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z5 N;
    public final int f46849a;
    public final boolean f46850b;
    public long f46851c;
    public boolean d;
    public boolean e;
    public long f46853g;
    public boolean h;
    public boolean f46854i;
    public ArrayList f46855j;
    public boolean f46856k;
    public boolean f46857l;
    public ArrayList f46858m;
    public boolean f46859n;
    public boolean f46860o;
    public ArrayList f46861p;
    public String f46867w;
    public boolean f46868x;
    public boolean f46869y;
    public TL_stars.StarsAmount f46852f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f46862q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f46863r = new boolean[3];
    public final String[] f46864s = new String[3];
    public final boolean[] f46865t = new boolean[3];
    public final boolean[] f46866u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f46870z = new ArrayList();
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

    public e6(int i10, boolean z10) {
        this.f46849a = i10;
        this.f46850b = z10;
    }

    public static org.telegram.ui.ActionBar.p6 I() {
        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static e6 L(int i10) {
        return y(i10, true);
    }

    public static boolean T(int i10, sf.a aVar) {
        if (aVar == null || x(i10, aVar.f48254a).s().f48255b >= aVar.f48255b) {
            return true;
        }
        return false;
    }

    public static void a(e6 e6Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = e6Var.I;
        ArrayList arrayList2 = e6Var.J;
        int i10 = e6Var.f46849a;
        ArrayList arrayList3 = e6Var.H;
        e6Var.C = false;
        e6Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            vp.r1(i10).V3(tL_starGifts.users, false);
            vp.r1(i10).P3(tL_starGifts.chats, false);
            hs.a0(i10).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.t6(17)), new bi.t6(18)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(19)));
            e6Var.F = tL_starGifts.hash;
            e6Var.G = System.currentTimeMillis();
            zs.f(i10).k(zs.F3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i11 = e6Var.F;
            long j10 = e6Var.G;
            hs a02 = hs.a0(i10);
            a02.f15938a.c(new org.telegram.ui.z(i11, 6, j10, a02, arrayList4));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i12 = e6Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            e6Var.G = currentTimeMillis;
            hs a03 = hs.a0(i10);
            a03.f15938a.c(new org.telegram.ui.z(i12, 6, currentTimeMillis, a03, arrayList3));
        }
    }

    public static void b(e6 e6Var, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = e6Var.f46849a;
        vp.r1(i10).V3(arrayList2, true);
        vp.r1(i10).P3(arrayList3, true);
        e6Var.E = true;
        ArrayList arrayList4 = e6Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = e6Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.t6(14)), new bi.t6(15)));
        ArrayList arrayList6 = e6Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new bi.t6(16)));
        e6Var.F = num.intValue();
        e6Var.G = l4.longValue();
        e6Var.C = false;
        zs.f(i10).k(zs.F3, new Object[0]);
        e6Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = cd.L0(2131745078, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131745079, null);
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
    }

    public static void e(String str) {
        cc X;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            X = cc.a0(Q);
        } else {
            X = cc.X();
        }
        X.Q(2131624011, 36, cd.a0(null, null, 2131743903, str)).j();
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f19881id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != null && k2Var.getContext() != null) {
            return k2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.I1;
        }
        if (org.telegram.messenger.w0.f19025b != null) {
            return org.telegram.messenger.w0.f19025b;
        }
        return null;
    }

    public static e6 w(int i10) {
        return y(i10, false);
    }

    public static e6 x(int i10, sf.b bVar) {
        boolean z10;
        if (bVar == sf.b.f48257b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i10, z10);
    }

    public static e6 y(int i10, boolean z10) {
        e6 e6Var;
        e6 e6Var2 = S[z10 ? 1 : 0][i10];
        if (e6Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i10]) {
                try {
                    e6Var = S[z10 ? 1 : 0][i10];
                    if (e6Var == null) {
                        e6[] e6VarArr = S[z10 ? 1 : 0];
                        e6 e6Var3 = new e6(i10, z10);
                        e6VarArr[i10] = e6Var3;
                        e6Var = e6Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e6Var;
        }
        return e6Var2;
    }

    public final long A(jj jjVar) {
        Long A1;
        Long l4;
        c6 c6Var = this.B;
        if (c6Var != null && c6Var.f46716a.equals(x5.b(jjVar)) && (l4 = this.B.f46726n) != null) {
            return l4.longValue();
        }
        if (jjVar == null) {
            A1 = null;
        } else {
            A1 = jjVar.A1();
        }
        if (A1 != null) {
            return A1.longValue();
        }
        Long x12 = vp.r1(this.f46849a).x1();
        if (x12 != null) {
            return x12.longValue();
        }
        return 0L;
    }

    public final long B(x5 x5Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l4;
        c6 c6Var = this.B;
        if (c6Var != null && c6Var.f46716a.equals(x5Var) && (l4 = this.B.f46726n) != null) {
            return l4.longValue();
        }
        Long l10 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l10 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l10 = Long.valueOf(org.telegram.messenger.o5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l10 != null) {
            return l10.longValue();
        }
        Long x12 = vp.r1(this.f46849a).x1();
        if (x12 != null) {
            return x12.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, q20 q20Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f46849a;
        getpaidmessagesrevenue.user_id = vp.r1(i10).n1(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = vp.r1(i10).i1(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new m5(q20Var, 0));
    }

    public final long D(int i10, long j10) {
        c6 c6Var = this.B;
        if (c6Var != null) {
            x5 x5Var = c6Var.f46716a;
            if (x5Var.f47691a == j10 && x5Var.f47692b == i10 && c6Var.f46724l) {
                return c6Var.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(jj jjVar) {
        TLRPC.Message message;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            if ((message.isThreadMessage || jjVar.k3()) && jjVar.f16337k.fwd_from != null) {
                return D(jjVar.f16337k.fwd_from.saved_from_msg_id, jjVar.Z0());
            }
            return D(jjVar.f1(), jj.B0(jjVar.f16337k));
        }
        return 0L;
    }

    public final u5 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        u5 u5Var = (u5) longSparseArray.get(j10);
        if (u5Var == null && z10) {
            u5 u5Var2 = new u5(this.f46849a, j10);
            longSparseArray.put(j10, u5Var2);
            return u5Var2;
        }
        return u5Var;
    }

    public final v5 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        v5 v5Var = (v5) longSparseArray.get(j10);
        if (v5Var == null && z10) {
            v5 v5Var2 = new v5(this.f46849a, j10, true);
            longSparseArray.put(j10, v5Var2);
            return v5Var2;
        }
        return v5Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, q20 q20Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.f19025b;
        }
        org.telegram.ui.ActionBar.p6 I = I();
        if (starGift != null && context != null) {
            if (!this.e) {
                r(new ag.a3(this, q20Var, starGift, j10, 19));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = vp.r1(this.f46849a).i1(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f46850b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_getPaymentForm, new ul0(29, this, q20Var));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        U();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f20021id == j10) {
                    return starGift;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j10, q20 q20Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            q20Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.f46849a).sendRequest(getstargiftupgradepreview, new mg.x(this, j10, q20Var, 5));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, q20 q20Var) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.f19025b, null);
        x1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f46849a).sendRequest(getsavedstargift, new mb((Object) this, x1Var, (Object) inputSavedStarGift, q20Var, 15));
    }

    public final boolean N(int i10) {
        if (this.e && !this.f46862q[i10].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void O() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void P(long j10) {
        v5 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        u5 u5Var = (u5) this.K.get(j10);
        if (u5Var != null) {
            u5Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j10 = userFull.f19943id;
            v5 G = G(j10, false);
            if (G != null && G.f47584n != userFull.stargifts_count) {
                G.j(false);
            }
            u5 u5Var = (u5) this.K.get(j10);
            if (u5Var != null) {
                u5Var.g();
            }
        }
    }

    public final void R() {
        if (this.f46868x) {
            return;
        }
        this.v.clear();
        this.f46867w = null;
        this.f46868x = false;
        this.f46869y = false;
        V();
    }

    public final void S(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f46865t;
            if (!zArr[i10]) {
                this.f46862q[i10].clear();
                this.f46864s[i10] = null;
                zArr[i10] = false;
                this.f46866u[i10] = false;
                if (z10) {
                    W(i10);
                }
            }
        }
    }

    public final void U() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i10 = this.f46849a;
                if (!z10) {
                    d0 d0Var = new d0(this, 4);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    hs a02 = hs.a0(i10);
                    a02.f15938a.c(new r4(a02, arrayList3, arrayList2, arrayList, d0Var, 2));
                    return;
                }
                int i11 = this.F;
                ph.h1 h1Var = new ph.h1(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new ag.c(h1Var, 16));
            }
        }
    }

    public final void V() {
        if (!this.f46850b && !this.f46868x && !this.f46869y) {
            this.f46868x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f46867w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_getStarsSubscriptions, new g5(this, 1));
        }
    }

    public final void W(int i10) {
        boolean z10;
        boolean[] zArr = this.f46865t;
        if (!zArr[i10] && !this.f46866u[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f46850b;
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
            String str = this.f46864s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_getStarsTransactions, new org.telegram.messenger.voip.g0(this, i10, 6));
        }
    }

    public final void X(org.telegram.messenger.jj r37, org.telegram.tgnet.TLRPC.InputInvoice r38, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r39, java.lang.Runnable r40, org.telegram.messenger.q20 r41) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e6.X(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.q20):void");
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, j20 j20Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = org.telegram.messenger.w0.f19025b;
            org.telegram.ui.ActionBar.p6 I = I();
            if (context != null) {
                long j10 = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_sendStarsForm, new im(this, j20Var, j10, str2, context, I, chatInvite, str));
            }
        }
    }

    public final void Z(final jj jjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final q20 q20Var) {
        long j10;
        String str;
        TLRPC.User Z1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = org.telegram.messenger.w0.f19025b;
            final org.telegram.ui.ActionBar.p6 I = I();
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
            if (jjVar != null) {
                TLRPC.Message message = jjVar.f16337k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j10 = org.telegram.messenger.o5.o(peer);
                } else {
                    j10 = jj.B0(message);
                }
                if (j10 < 0 && jjVar.Z0() > 0 && (Z1 = vp.r1(this.f46849a).Z1(Long.valueOf(jjVar.Z0()))) != null && Z1.bot) {
                    j10 = Z1.f19942id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = h20.p(vp.r1(this.f46849a).Z1(Long.valueOf(j12)));
            } else {
                TLRPC.Chat L0 = vp.r1(this.f46849a).L0(Long.valueOf(-j12));
                if (L0 == null) {
                    str = "";
                } else {
                    str = L0.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final e6 e6Var = e6.this;
                    final q20 q20Var2 = q20Var;
                    final jj jjVar2 = jjVar;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.p6 p6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: rh.w4.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void a0(long j10, long j11, boolean z10) {
        int i10 = this.f46849a;
        x00 x00Var = vp.r1(i10).f18891r7;
        TLRPC.TL_forumTopic f7 = x00Var.f(j10, j11);
        if (f7 != null) {
            f7.nopaid_messages_exception = z10;
            a0.h hVar = x00Var.f19171a;
            if (((ArrayList) hVar.f(j10)) != null) {
                x00Var.getMessagesStorage().C1(x00Var.getConnectionsManager().getCurrentTime(), -j10, (List) hVar.f(j10), true);
            }
            zs.f(i10).k(zs.N3, Long.valueOf(j11));
        }
    }

    public final rh.c6 b0(final org.telegram.messenger.jj r21, final org.telegram.ui.un r22, final long r23, boolean r25, boolean r26, final java.lang.Long r27) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e6.b0(org.telegram.messenger.jj, org.telegram.ui.un, long, boolean, boolean, java.lang.Long):rh.c6");
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int f12 = ((jj) obj).f1();
            hashSet.add(Integer.valueOf(f12));
            if (this.Q.remove(Integer.valueOf(f12))) {
                this.R.put(Integer.valueOf(f12), new l5(this, hashSet, runnable, 1));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void d(org.telegram.messenger.jj r15) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e6.d(org.telegram.messenger.jj):void");
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            jj jjVar = (jj) list.get(0);
            long B0 = jj.B0(jjVar.f16337k);
            int i10 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i11 = this.f46849a;
            if (i10 >= 0) {
                vp.r1(i11).U2(vp.r1(i11).Z1(Long.valueOf(B0)), 0, true, null);
            } else {
                vp.r1(i11).T2(0, -B0, true);
            }
            cc.a0(LaunchActivity.T()).Q(2131624011, 36, h8.S0(TextUtils.concat(cd.G((int) jjVar.f16337k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", cd.G((int) jjVar.f16337k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.e) {
            r(new ag.a3(this, launchActivity, j10, str, 21));
        } else {
            f0(launchActivity, j10, str);
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, j20 j20Var, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i10 = this.f46849a;
        if (vp.r1(i10).f18831k7) {
            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (((org.telegram.messenger.j0) vp.r1(i10).f18957y7.f17837h0.f11587b).f16204c && inputPeer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((org.telegram.messenger.v2.b() || !org.telegram.messenger.u1.i().k()) && !z10) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new ag.p0(this, j20Var, tL_inputInvoiceStars, 20));
        } else if (!org.telegram.messenger.u1.i().k()) {
            j20Var.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            c5.a aVar = new c5.a();
            aVar.f3732c = "inapp";
            aVar.f3731b = tL_starsTopupOption.store_product;
            c5.p a2 = aVar.a();
            org.telegram.messenger.f8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.u1.i().o(Arrays.asList(a2), new a1.d(j20Var, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 19));
        }
    }

    public final void f0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new x7(launchActivity, null, j10, 4, str, new r5.a(5), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        wb K = cc.a0(T2).K(2131624224, cd.L0(2131744982, null), cd.L0(2131744981, null), new r5.a(4));
        K.f32135j = 5000;
        K.k(true);
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final j20 j20Var) {
        int i10;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.f19025b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.p6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.g(this, j20Var, j10, tLObject, tL_textWithEntities));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String l4 = org.telegram.messenger.o5.l(this.f46849a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = vp.r1(this.f46849a).n1(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final e6 e6Var = e6.this;
                    final j20 j20Var2 = j20Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.p6 p6Var = I;
                    final String str = l4;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            j20 j20Var3 = j20Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                e6.e(str2);
                                j20Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i11 = 0;
                            long j12 = 0;
                            while (i11 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                                i11++;
                                j12 += tL_labeledPrice.amount;
                            }
                            e6 e6Var2 = e6.this;
                            ConnectionsManager.getInstance(e6Var2.f46849a).sendRequest(tL_payments_sendStarsForm, new a5(e6Var2, j20Var3, context3, p6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f46849a;
        togglenopaidmessagesexception.user_id = vp.r1(i10).n1(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = vp.r1(i10).i1(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.i0.g3(new sq(e6.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, j20 j20Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.f19025b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.p6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.g(this, j20Var, tL_payments_paymentFormStarGift, starGift, j10, 14));
                return;
            }
            String l4 = org.telegram.messenger.o5.l(this.f46849a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = vp.r1(this.f46849a).i1(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f46850b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
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
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_sendStarsForm, new a5(this, j20Var, context2, I, j11, l4, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, j20 j20Var) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = org.telegram.messenger.w0.f19025b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.p6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = d20.f15147s0;
                boolean[] zArr = {false};
                r5 r5Var = new r5(this, j10, i10, zArr, j20Var, context2, I, chatInvite, str);
                o oVar = new o(this, zArr, j20Var);
                org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context2, I, false);
                LinearLayout f7 = org.telegram.messenger.m5.f(context2, 1);
                f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new o7(context2, 40, 0, 0), w7.b6.c(-1.0f, -1));
                g9 g9Var = new g9(context2);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(80.0f));
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                r8Var.A = true;
                r8Var.f29869n = 0;
                r8Var.f29868m = false;
                org.telegram.ui.Components.r8.a(str3, null, null, r8Var.f29872q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    g9Var.j(ic.i(org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(80.0f), false, null, false), chatInvite.photo), "80_80", r8Var, chatInvite);
                } else {
                    g9Var.setImageDrawable(r8Var);
                }
                frameLayout.addView(g9Var, w7.b6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232750);
                int i11 = org.telegram.ui.ActionBar.t6.f21001h5;
                org.telegram.ui.ActionBar.a7.y(frameLayout, drawable, i11, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232749);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.b6.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.i0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.i0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.b6.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.i0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.i0.L(26.0f));
                w7 w7Var = new w7(i10, context2, I);
                w7.e6.a(w7Var);
                w7Var.setOnClickListener(new d7(w7Var, 0));
                frameLayout.addView(w7Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f7.addView(frameLayout, w7.b6.r(-1, 117, 7));
                TextView g10 = org.telegram.messenger.m5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.i0.o());
                int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
                z20.p(g10, i12, I, null, 2131745030);
                g10.setGravity(17);
                TextView f10 = z20.f(f7, g10, w7.b6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f10.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(f10, i12, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                if (i13 == 2592000) {
                    f10.setText(org.telegram.messenger.i0.W2(cd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i13 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f10.setText(org.telegram.messenger.i0.W2(cd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                f10.setMaxWidth(vh.p2.a(f10.getText(), f10.getPaint()));
                f10.setGravity(17);
                f7.addView(f10, w7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, i12, I);
                    textView.setText(org.telegram.messenger.k6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f7.addView(textView, w7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                vh.d dVar = new vh.d(context2, I, true);
                dVar.i(cd.L0(2131745039, null), false, true);
                f7.addView(dVar, w7.b6.o(-1, 48));
                p80 p80Var = new p80(context2, I);
                p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131745038, null), new ph.p0(context2, 8)));
                p80Var.setGravity(17);
                p80Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.B6, I);
                org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, I);
                f7.addView(p80Var, w7.b6.t(-1, -2, 49, 14, 14, 14, 6));
                k10.N = f7;
                dVar.setOnClickListener(new e7(r5Var, k10, dVar, 0));
                k10.setOnDismissListener(new ag.x(oVar, 12));
                k10.Q(i11);
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.i0.Q1() && T2 != null && !org.telegram.messenger.i0.u1(T2)) {
                    k10.a0(T2);
                }
                k10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final ph.u3 u3Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.f19025b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.p6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        e6 e6Var = e6.this;
                        boolean z12 = e6Var.e;
                        ph.u3 u3Var2 = u3Var;
                        if (!z12) {
                            e6.e("NO_BALANCE");
                            u3Var2.a(Boolean.FALSE, null);
                            return;
                        }
                        e6Var.i(starGift, z10, z11, j10, tL_textWithEntities, u3Var2);
                    }
                });
                return;
            }
            final String l4 = org.telegram.messenger.o5.l(this.f46849a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = vp.r1(this.f46849a).i1(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f20021id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final e6 e6Var = e6.this;
                    final ph.u3 u3Var2 = u3Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.p6 p6Var = I;
                    final String str = l4;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j11 = j10;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final ph.u3 u3Var3 = u3Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                e6.e(str2);
                                u3Var3.a(Boolean.FALSE, null);
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
                            final e6 e6Var2 = e6.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e6Var2.f46849a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final e6 e6Var3 = e6.this;
                                    final ph.u3 u3Var4 = u3Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                                    final long j14 = j12;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j15 = j13;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            cc X;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            w90 w90Var;
                                            ?? r11;
                                            String str6;
                                            e6 e6Var4 = e6.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            ph.u3 u3Var5 = u3Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.p6 p6Var4 = p6Var3;
                                            long j16 = j14;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                X = cc.a0(Q);
                                            } else {
                                                X = cc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (vp.r1(e6Var4.f46849a).f18831k7) {
                                                        u3Var5.a(Boolean.FALSE, null);
                                                        e6.c0(context6, p6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    x7 x7Var = new x7(context6, p6Var4, j16, 6, str7, new f5(e6Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, u3Var5), 0L);
                                                    x7Var.setOnDismissListener(new mg.g(15, u3Var5, zArr));
                                                    x7Var.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    u3Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    u3Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    u3Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    X.Q(2131624011, 36, cd.a0(null, null, 2131743903, str6)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new b5(e6Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                            e6Var4.D = false;
                                            e6Var4.E = true;
                                            e6Var4.G = 0L;
                                            e6Var4.U();
                                            e6Var4.P(j17);
                                            e6Var4.S(true);
                                            u3Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.w1 b10 = org.telegram.messenger.y1.a(e6Var4.f46849a).b();
                                            if (b10 != null && b10.a(j17)) {
                                                vp.r1(e6Var4.f46849a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i11 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i11;
                                                spannableStringBuilder = org.telegram.messenger.i0.W2(cd.H(',', "Gift2SentRemainsLimit", Math.max(0, i11)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j17 < 0) {
                                                long j18 = -j17;
                                                TLRPC.ChatFull M0 = vp.r1(e6Var4.f46849a).M0(j18);
                                                if (M0 != null) {
                                                    M0.stargifts_count++;
                                                    M0.flags2 |= 262144;
                                                    vp.r1(e6Var4.f46849a).O3(M0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j17) {
                                                        ix0 ix0Var = profileActivity.N;
                                                        if (ix0Var != null) {
                                                            ix0Var.K1(true);
                                                            profileActivity.N.f1(14);
                                                            r11 = 0;
                                                            profileActivity.T4(false);
                                                        } else {
                                                            r11 = 0;
                                                        }
                                                        cc a02 = cc.a0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String L0 = cd.L0(2131745127, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r11] = str5;
                                                            spannableStringBuilder = org.telegram.messenger.i0.W2(cd.G((int) j16, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        a02.s(document, L0, spannableStringBuilder).k(r11);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j18);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new org.telegram.messenger.voip.g(profileActivity2, starGift5, spannableStringBuilder, j16, str5, 15));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof un) && ((un) Q).a() == j17) {
                                                cc a03 = cc.a0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String L02 = cd.L0(2131745127, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = org.telegram.messenger.i0.W2(cd.G((int) j16, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                a03.s(document2, L02, spannableStringBuilder).k(true);
                                            } else {
                                                zs f7 = zs.f(e6Var4.f46849a);
                                                int i12 = zs.v;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                f7.k(i12, valueOf, bool);
                                                zs.f(e6Var4.f46849a).k(zs.f19697u, Long.valueOf(j17), bool);
                                                un ha = un.ha(j17);
                                                ha.whenFullyVisible(new ag.a3(ha, starGift5, spannableStringBuilder, j16, 20));
                                                Q.presentFragment(ha);
                                            }
                                            vp.r1(e6Var4.f46849a).f7.edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.I1;
                                            if (launchActivity != null && (w90Var = launchActivity.f33391x0) != null) {
                                                w90Var.c(true);
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

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f46852f.equals(starsAmount);
        int i10 = zs.y3;
        int i11 = this.f46849a;
        if (!equals) {
            this.f46852f = starsAmount;
            this.f46853g = 0L;
            zs.f(i11).k(i10, new Object[0]);
        } else if (this.f46853g != 0) {
            this.f46853g = 0L;
            zs.f(i11).k(i10, new Object[0]);
        }
    }

    public final boolean j() {
        if (this.f46850b) {
            org.telegram.messenger.w0.u();
            if (!org.telegram.messenger.v2.a()) {
                org.telegram.messenger.w0.r();
                TL_stars.StarsAmount p5 = p();
                if (p5.nanos == 0 && p5.amount == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void j0(final jj jjVar, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (jjVar == null) {
            runnable.run();
            return;
        }
        final long B0 = jj.B0(jjVar.f16337k);
        final int f12 = jjVar.f1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) jjVar.f16337k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.f46849a;
        tL_messages_editMessage.peer = vp.r1(i10).i1(B0);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = jjVar.f16337k.date;
        tL_messages_editMessage.f19877id = f12;
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
                tL_inputPhoto.f19812id = photo.f19817id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f19856id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f19805id = document.f19799id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f19854id = tL_inputDocument;
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
                org.telegram.messenger.i0.g3(new dq(e6.this, tLObject, runnable, tL_error, z10, B0, f12, jjVar, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                v5 v5Var = (v5) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < v5Var.f47582l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v5Var.f47582l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f20021id == j10) {
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
        return q(null, true, false);
    }

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z10, boolean z11) {
        if (((!this.e || System.currentTimeMillis() - this.f46851c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f46850b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f46849a).sendRequest(tL_payments_getStarsStatus, new h5(0, this, runnable));
        }
        if (z10 && this.f46853g > 0) {
            sf.a m10 = sf.a.m(this.f46852f);
            return sf.a.g(Math.max(0L, m10.a() - this.f46853g), m10.f48254a).o();
        }
        return this.f46852f;
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final sf.a s() {
        sf.b bVar;
        sf.a l4 = sf.a.l(p());
        if (l4 == null) {
            if (this.f46850b) {
                bVar = sf.b.f48257b;
            } else {
                bVar = sf.b.f48256a;
            }
            return sf.a.i(0L, bVar);
        }
        return l4;
    }

    public final ArrayList u() {
        if (!this.f46856k && !this.f46857l) {
            this.f46856k = true;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new g5(this, 3));
            return this.f46858m;
        }
        return this.f46858m;
    }

    public final ArrayList v() {
        if (!this.f46859n && !this.f46860o) {
            this.f46859n = true;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new g5(this, 4));
            return this.f46861p;
        }
        return this.f46861p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f46854i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f46849a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new g5(this, 2));
            return this.f46855j;
        }
        return this.f46855j;
    }
}
