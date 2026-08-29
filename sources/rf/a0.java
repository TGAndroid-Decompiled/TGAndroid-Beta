package rf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.n1;
import java.util.ArrayList;
import java.util.HashSet;
import nh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.t2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.fy;
import org.telegram.ui.ll0;
import org.telegram.ui.qx;
import org.telegram.ui.th;
import org.telegram.ui.wa1;
import org.telegram.ui.y00;
public abstract class a0 extends il0 {
    public w A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public String I;
    public boolean J;
    public int L;
    public String N;
    public int O;
    public int P;
    public qx Q;
    public final int R;
    public boolean S;
    public boolean T;
    public String V;
    public int W;
    public String X;
    public int Y;
    public int Z;
    public int f47138a0;
    public int f47139b0;
    public int f47141c0;
    public boolean d;
    public final int f47142d0;
    public final Context f47143e;
    public final f2.l f47144e0;
    public p f47145f;
    public final t f47146f0;
    public wa1 f47147g0;
    public p h;
    public final long f47148h0;
    public long f47150j0;
    public View f47151k0;
    public org.telegram.ui.web.y f47152l0;
    public ArrayList m0;
    public final fy f47154n0;
    public final int f47155o0;
    public ArrayList f47156p0;
    public final ArrayList f47157q0;
    public ll0 f47158r;
    public final ArrayList f47159r0;
    public String f47161s0;
    public a0.h f47162t0;
    public final ArrayList f47163u0;
    public int v;
    public boolean f47164v0;
    public int f47165w;
    public y00 f47166w0;
    public int f47168x0;
    public String f47169y;
    public int f47170y0;
    public int f47171z0;
    public x f47140c = x.All;
    public int f47153n = -1;
    public ArrayList f47160s = new ArrayList();
    public final ArrayList f47167x = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashSet H = new HashSet();
    public int K = 0;
    public int M = 0;
    public int U = -1;
    public boolean f47149i0 = false;

    public a0(Context context, fy fyVar, int i10, int i11, f2.l lVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.f47155o0 = i12;
        this.f47156p0 = new ArrayList();
        this.f47157q0 = new ArrayList();
        this.f47159r0 = new ArrayList();
        this.f47161s0 = null;
        this.f47162t0 = new a0.h();
        this.f47163u0 = new ArrayList();
        this.B0 = -1;
        this.C0 = true;
        this.D0 = true;
        this.f47144e0 = lVar;
        this.f47154n0 = fyVar;
        mn0 mn0Var = (mn0) this;
        t tVar = new t(mn0Var);
        this.f47146f0 = tVar;
        tVar.f47277a = new d6(mn0Var, 21);
        tVar.f47290p = z10;
        this.f47143e = context;
        this.R = i10;
        this.f47142d0 = i11;
        this.f47148h0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new j3.y(i12, i11, new s(this), 14));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str3 = split[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 1 && i10 != 4 && i10 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.J;
        ArrayList arrayList = this.f47157q0;
        ArrayList arrayList2 = this.f47159r0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                z zVar = (z) arrayList2.remove(0);
                this.f47156p0.remove(zVar);
                arrayList.remove(zVar);
                this.f47162t0.l(zVar.f47410c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(zVar.f47410c);
                } else {
                    sb2.append(", ");
                    sb2.append(zVar.f47410c);
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder("1");
            } else {
                sb2.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.f47156p0.clear();
            this.f47162t0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.I;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f47155o0).getStorageQueue().postRunnable(new org.telegram.ui.web.y(23, (mn0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.f47142d0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        fy fyVar = this.f47154n0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return fyVar.f38369w2;
            }
            return fyVar.f38364v2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isChannel(chat)) {
                return fyVar.f38360u2;
            }
            if (ChatObject.isMegagroup(chat)) {
                if (fyVar.f38345r2 || fyVar.f38351s2) {
                    return true;
                }
                return false;
            } else if (fyVar.f38345r2 || fyVar.f38356t2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        qx qxVar;
        String str2;
        String str3;
        this.f47161s0 = str;
        ArrayList arrayList = this.f47159r0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f47157q0;
            arrayList2.clear();
            int size = this.f47156p0.size();
            for (int i10 = 0; i10 < size; i10++) {
                qx qxVar2 = this.Q;
                if ((qxVar2 == null || qxVar2.a() != ((z) this.f47156p0.get(i10)).f47410c) && F(((z) this.f47156p0.get(i10)).f47408a)) {
                    arrayList2.add((z) this.f47156p0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f47156p0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            z zVar = (z) this.f47156p0.get(i11);
            if (zVar != null && zVar.f47408a != null && (((qxVar = this.Q) == null || qxVar.a() != zVar.f47410c) && F(((z) this.f47156p0.get(i11)).f47408a))) {
                TLObject tLObject = zVar.f47408a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = yf.d.i(chat, this.f47155o0, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) zVar.f47408a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) zVar.f47408a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(zVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(x xVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(xVar.f47401c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new iq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final wa1 I() {
        return this.f47147g0;
    }

    public final Object J(int i10) {
        int size;
        int i11;
        int size2;
        ArrayList arrayList;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList2 = this.f47167x;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList2.size()) {
                return arrayList2.get(i13);
            }
            i10 = th.e(1, i10, arrayList2);
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            if (i10 > 0) {
                return arrayList3.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            if (this.J) {
                arrayList = this.f47159r0;
            } else {
                arrayList = this.f47157q0;
            }
            if (i10 > M && (i12 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((z) arrayList.get(i12)).f47408a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.f47155o0;
                if (z10) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).f22539id));
                    if (user != null) {
                        return user;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f22392id))) != null) {
                    return chat;
                } else {
                    return tLObject;
                }
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = th.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.A;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = th.e(1, i10, arrayList5);
        }
        t tVar = this.f47146f0;
        ArrayList arrayList6 = tVar.f47280e;
        ArrayList arrayList7 = tVar.d;
        ArrayList arrayList8 = tVar.f47284j;
        int size3 = this.f47160s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i10 != 0) {
                i10--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i15 = 3;
        if (size5 > 3 && this.D0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.C0) {
            i15 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.G;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i15 + 1;
        }
        if (i10 >= 0 && i10 < size3) {
            return this.f47160s.get(i10);
        }
        int i17 = i10 - size3;
        if (i17 >= 0 && i17 < size4) {
            return arrayList7.get(i17);
        }
        int i18 = i17 - size4;
        if (i18 >= 0 && i18 < size5) {
            return arrayList8.get(i18);
        }
        int i19 = i18 - size5;
        if (i19 > 0 && i19 < size) {
            int i20 = i19 - 1;
            if (i20 >= 0 && i20 < arrayList9.size()) {
                return arrayList9.get(i20);
            }
            i11 = i20 - arrayList9.size();
            if (i11 >= 0 && i11 < arrayList6.size()) {
                return arrayList6.get(i11);
            }
        } else {
            i11 = i19 - size;
        }
        ArrayList arrayList10 = this.D;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.T && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size2 + i16);
        ArrayList arrayList11 = this.E;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 > 0 && i21 <= arrayList11.size()) {
            return arrayList11.get(i21 - 1);
        }
        return null;
    }

    public final int K() {
        ArrayList arrayList;
        int i10;
        if (this.J) {
            arrayList = this.f47159r0;
        } else {
            arrayList = this.f47157q0;
        }
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return (M() ? 1 : 0) + i10;
    }

    public final int L() {
        int i10 = 0;
        if (this.f47171z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f47167x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
            if (!this.J) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f47160s.size();
        int size2 = this.f47146f0.d.size();
        int i11 = i10 + size + size2;
        if (size + size2 > 0) {
            if (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i11 + 1;
            }
            return i11;
        }
        return i11;
    }

    public final boolean M() {
        if (!this.J && !MediaDataController.getInstance(this.f47155o0).hints.isEmpty()) {
            if (this.f47142d0 != 14 || this.f47154n0.f38364v2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean N() {
        if (S() && K() > 0) {
            return true;
        }
        return false;
    }

    public final boolean O(int i10) {
        int size;
        int i11;
        int i12;
        int size2;
        ArrayList arrayList;
        if (this.J && this.F.isEmpty()) {
            ArrayList arrayList2 = this.f47167x;
            if (!arrayList2.isEmpty()) {
                i10 = th.e(1, i10, arrayList2);
            }
            if (P()) {
                ?? M = M();
                if (this.J) {
                    arrayList = this.f47159r0;
                } else {
                    arrayList = this.f47157q0;
                }
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList.size()) {
                    i10 -= K();
                }
            }
            t tVar = this.f47146f0;
            ArrayList arrayList3 = tVar.f47280e;
            ArrayList arrayList4 = tVar.d;
            int size3 = this.f47160s.size();
            int size4 = arrayList4.size();
            int size5 = tVar.f47284j.size();
            int i13 = 3;
            if (size5 > 3 && this.D0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.C0) {
                i13 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.G;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i13 + 1;
            }
            int size7 = this.A.size();
            if (size7 > 0) {
                if (i10 < 0 || i10 >= size7) {
                    i10 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (K() > 0 || !this.B.isEmpty() || !arrayList2.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            if ((i10 < 0 || i10 >= size3) && (((i11 = i10 - size3) < 0 || i11 >= size4) && ((i12 = i11 - size4) <= 0 || i12 >= size5))) {
                int i14 = i12 - size5;
                if (i14 > 0 && i14 < size) {
                    return true;
                }
                int i15 = i14 - size;
                ArrayList arrayList6 = this.D;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i15 <= 0 || i15 >= size2) {
                    ArrayList arrayList7 = this.E;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f47140c != x.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        if (this.R != 2 && N()) {
            return true;
        }
        return false;
    }

    public final void Q() {
        if ((this.M != 0 && this.K != 0) || this.f47141c0 != this.Z) {
            return;
        }
        qx qxVar = this.Q;
        if (qxVar != null && qxVar.a() != 0 && !this.T) {
            V(this.f47141c0, this.V);
            return;
        }
        W(this.f47141c0, this.V);
    }

    public final void R(long j10, TLObject tLObject) {
        z zVar;
        String str;
        z zVar2 = (z) this.f47162t0.f(j10);
        if (zVar2 == null) {
            Object obj = new Object();
            this.f47162t0.k(obj, j10);
            zVar = obj;
        } else {
            this.f47156p0.remove(zVar2);
            zVar = zVar2;
        }
        this.f47156p0.add(0, zVar);
        zVar.f47410c = j10;
        zVar.f47408a = tLObject;
        zVar.f47409b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.I;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f47155o0).getStorageQueue().postRunnable(new o((mn0) this, j10, 1));
    }

    public final boolean S() {
        int i10 = this.f47142d0;
        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 1 && i10 != 11 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.f47146f0.f47280e.size();
            if (this.C0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    public final void U(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: rf.a0.U(int, java.lang.String):void");
    }

    public final void V(int i10, String str) {
        qx qxVar = this.Q;
        if (qxVar != null && qxVar.a() != 0 && this.R != 0) {
            if (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str)) {
                int i11 = this.M;
                int i12 = this.f47155o0;
                if (i11 != 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.M, true);
                    this.M = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.D;
                if (isEmpty) {
                    this.f47161s0 = null;
                    this.E.clear();
                    arrayList.clear();
                    this.P = 0;
                    this.V = null;
                    this.J = false;
                    l();
                } else if (this.f47142d0 != 15) {
                    long a2 = this.Q.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f22501q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(a2);
                    if (str.equals(this.V) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.V = str;
                    int i13 = 1 + this.P;
                    this.P = i13;
                    this.M = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new t2(this, str, i13, i10, tL_messages_search, 1), 2);
                }
            }
        }
    }

    public final void W(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.R != 0 && (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str))) {
            int i11 = this.K;
            int i12 = this.f47155o0;
            boolean z13 = false;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.K, true);
                this.K = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.E;
            if (!isEmpty && this.Q.a() == 0) {
                G(str);
                this.f47146f0.f(this.f47160s, this.f47159r0);
                if (this.f47142d0 == 15) {
                    int i13 = this.f47171z0 - 1;
                    this.f47171z0 = i13;
                    qx qxVar = this.Q;
                    if (qxVar != null) {
                        if (i13 > 0) {
                            z13 = true;
                        }
                        qxVar.d(z13, true);
                        this.Q.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i14 = this.f47140c.f47399a;
                    if ((i14 & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z10;
                    if ((i14 & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z11;
                    if ((i14 & 8) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    tL_messages_searchGlobal.users_only = z12;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.f22503q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.f47170y0;
                    if (!str.equals(this.V)) {
                        this.d = false;
                    }
                    if (str.equals(this.V) && this.W == this.f47140c.f47399a && !arrayList.isEmpty() && this.f47141c0 == this.Z) {
                        MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = this.Y;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.V = str;
                    this.W = this.f47140c.f47399a;
                    int i15 = this.L + 1;
                    this.L = i15;
                    this.K = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new t2(this, str, i15, i10, tL_messages_searchGlobal, 2), 2);
                }
            } else {
                this.f47161s0 = null;
                arrayList.clear();
                this.D.clear();
                this.L = 0;
                this.V = null;
                this.W = 0;
                this.J = false;
                l();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.B;
        arrayList.clear();
        qx qxVar = this.Q;
        if (qxVar != null && qxVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f47155o0).getTopicsController().getTopics(-this.Q.a());
                String trim = str.trim();
                for (int i10 = 0; i10 < topics.size(); i10++) {
                    if (topics.get(i10) != null && topics.get(i10).title.toLowerCase().contains(trim)) {
                        arrayList.add(topics.get(i10));
                        topics.get(i10).searchQuery = trim;
                    }
                }
            }
            l();
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11 = 0;
        int i12 = 3;
        if (this.f47171z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f47167x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
            if (!this.J) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f47160s.size();
        t tVar = this.f47146f0;
        int size2 = tVar.d.size();
        int i13 = i10 + size + size2;
        int size3 = tVar.f47280e.size();
        if (size3 > 3 && this.C0) {
            size3 = 3;
        }
        int size4 = this.G.size() + size3;
        int size5 = tVar.f47284j.size();
        if (size5 > 3 && this.D0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i13++;
        }
        if (size4 != 0) {
            i13 += size4 + 1;
        }
        if (size5 != 0) {
            i13 += size5;
        }
        ArrayList arrayList5 = this.D;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i13 += size6 + 1 + (!this.T ? 1 : 0);
        }
        if (!this.T) {
            this.U = i13;
        }
        ArrayList arrayList6 = this.E;
        int size7 = arrayList6.size();
        if ((this.f47140c != x.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i12 = 1;
            }
            size7 = i12;
        }
        if (arrayList5.isEmpty() || this.T) {
            i11 = size7;
        }
        if (i11 != 0) {
            i13 += i11 + 1 + (!this.S ? 1 : 0);
        }
        if (this.T) {
            this.U = i13;
        }
        this.f47168x0 = i13;
        return i13;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: rf.a0.j(int):int");
    }

    @Override
    public final void v(f2.n1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: rf.a0.v(f2.n1, int):void");
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        wa1 wa1Var;
        int i11 = this.f47142d0;
        boolean z11 = true;
        Context context = this.f47143e;
        switch (i10) {
            case 0:
                f6 f6Var = new f6(context, null);
                if (i11 != 3) {
                    z11 = false;
                }
                f6Var.f24327h0 = z11;
                wa1Var = f6Var;
                break;
            case 1:
                wa1Var = new s3(context, null);
                break;
            case 2:
            case 9:
                wa1Var = new au0(2, context, true);
                break;
            case 3:
                wa1Var = new ma(context);
                break;
            case 4:
                p00 p00Var = new p00(context, null);
                p00Var.setViewType(1);
                p00Var.setIsSingleCell(true);
                wa1Var = p00Var;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                textView.setTextColor(g6.w0(null, g6.G6, false));
                wa1Var = textView;
                break;
            case 6:
                wa1 wa1Var2 = new wa1(context, 13, null);
                wa1Var2.setSelectorDrawableColor(g6.w0(null, g6.f23152i6, false));
                wa1Var2.setTag(9);
                wa1Var2.setItemAnimator(null);
                wa1Var2.setLayoutAnimation(null);
                org.telegram.ui.k kVar = new org.telegram.ui.k(19);
                kVar.j1(0);
                wa1Var2.setLayoutManager(kVar);
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wa1Var2.setAdapter(new u(this.f47155o0, this.f47143e, null, false, z10));
                wa1Var2.setOnItemClickListener(new bg.o(this, 20));
                wa1Var2.setOnItemLongClickListener(new s(this));
                this.f47147g0 = wa1Var2;
                wa1Var = wa1Var2;
                break;
            case 7:
            default:
                wa1Var = new m8(16, context, false);
                break;
            case 8:
                wa1Var = new f6(context, null);
                break;
            case 10:
                q qVar = new q(this, 1);
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                t9 t9Var = new t9(context);
                t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                linearLayout.addView(t9Var, i7.f6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i12 = g6.G6;
                textView2.setTextColor(g6.w0(null, i12, false));
                textView2.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.b.i(R.string.SearchMessagesFilterEmptyTitle, textView2, 17);
                linearLayout.addView(textView2, i7.f6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                linearLayout.f47396a = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(g6.w0(null, i12, false));
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView3.setGravity(17);
                linearLayout.addView(textView3, i7.f6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView4.setTextSize(1, 14.0f);
                textView4.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i13 = g6.Oh;
                textView4.setTextColor(g6.w0(null, i13, false));
                int l1 = g6.l1(0.15f, g6.w0(null, i13, false));
                textView4.setBackground(g6.i0(6, 6, 6, 6, 0, l1, l1));
                textView4.setOnClickListener(new mh.n(qVar, 20));
                linearLayout.addView(textView4, i7.f6.t(-2, -2, 1, 0, 0, 0, 38));
                this.A0 = linearLayout;
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.V));
                wa1Var = linearLayout;
                break;
        }
        if (i10 == 5) {
            wa1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            wa1Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new n1(wa1Var);
    }
}
