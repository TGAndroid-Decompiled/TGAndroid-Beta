package tf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import k7.b6;
import kh.a2;
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
import org.telegram.messenger.u2;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.jb1;
import org.telegram.ui.k10;
import org.telegram.ui.oy;
import org.telegram.ui.yh;
import org.telegram.ui.zt0;
import org.telegram.ui.zx;
import ph.f6;
public abstract class z extends rl0 {
    public int A0;
    public v B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public String J;
    public boolean K;
    public int M;
    public String O;
    public int P;
    public int Q;
    public zx R;
    public final int S;
    public boolean T;
    public boolean U;
    public String W;
    public int X;
    public String Y;
    public int Z;
    public int f44891a0;
    public int f44892b0;
    public int f44894c0;
    public boolean d;
    public int f44895d0;
    public final Context e;
    public final int f44896e0;
    public o f44897f;
    public final f2.l f44898f0;
    public final s f44899g0;
    public o h;
    public jb1 f44900h0;
    public final long f44901i0;
    public long f44903k0;
    public View f44904l0;
    public f6 m0;
    public ArrayList f44906n0;
    public final oy f44907o0;
    public final int f44908p0;
    public ArrayList f44909q0;
    public zt0 f44910r;
    public final ArrayList f44911r0;
    public final ArrayList f44913s0;
    public String f44914t0;
    public a0.h f44915u0;
    public int v;
    public final ArrayList f44916v0;
    public int f44917w;
    public boolean f44918w0;
    public k10 f44920x0;
    public String f44921y;
    public int f44922y0;
    public int f44923z0;
    public w f44893c = w.All;
    public int f44905n = -1;
    public ArrayList f44912s = new ArrayList();
    public final ArrayList f44919x = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final HashSet I = new HashSet();
    public int L = 0;
    public int N = 0;
    public int V = -1;
    public boolean f44902j0 = false;

    public z(Context context, oy oyVar, int i10, int i11, f2.l lVar, boolean z4) {
        int i12 = UserConfig.selectedAccount;
        this.f44908p0 = i12;
        this.f44909q0 = new ArrayList();
        this.f44911r0 = new ArrayList();
        this.f44913s0 = new ArrayList();
        this.f44914t0 = null;
        this.f44915u0 = new a0.h();
        this.f44916v0 = new ArrayList();
        this.C0 = -1;
        this.D0 = true;
        this.E0 = true;
        this.f44898f0 = lVar;
        this.f44907o0 = oyVar;
        wn0 wn0Var = (wn0) this;
        s sVar = new s(wn0Var);
        this.f44899g0 = sVar;
        sVar.f44769a = new org.telegram.ui.Cells.f1(wn0Var, 22);
        sVar.f44781p = z4;
        this.e = context;
        this.S = i10;
        this.f44896e0 = i11;
        this.f44901i0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new j3.v(i12, i11, new r(this), 14));
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
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 1 && i10 != 4 && i10 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb;
        boolean z4 = this.K;
        ArrayList arrayList = this.f44911r0;
        ArrayList arrayList2 = this.f44913s0;
        String str = null;
        if (z4) {
            sb = null;
            while (arrayList2.size() > 0) {
                y yVar = (y) arrayList2.remove(0);
                this.f44909q0.remove(yVar);
                arrayList.remove(yVar);
                this.f44915u0.l(yVar.f44882c);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(yVar.f44882c);
                } else {
                    sb.append(", ");
                    sb.append(yVar.f44882c);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.f44909q0.clear();
            this.f44915u0.b();
            sb = new StringBuilder("1");
        }
        String str2 = this.J;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f44908p0).getStorageQueue().postRunnable(new f6(23, (wn0) this, sb));
    }

    public final boolean F(Object obj) {
        if (this.f44896e0 != 14) {
            return true;
        }
        boolean z4 = obj instanceof TLRPC.User;
        oy oyVar = this.f44907o0;
        if (z4) {
            if (((TLRPC.User) obj).bot) {
                return oyVar.f37122x2;
            }
            return oyVar.f37117w2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isChannel(chat)) {
                return oyVar.f37112v2;
            }
            if (ChatObject.isMegagroup(chat)) {
                if (oyVar.f37098s2 || oyVar.f37103t2) {
                    return true;
                }
                return false;
            } else if (oyVar.f37098s2 || oyVar.f37108u2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        zx zxVar;
        String str2;
        String str3;
        this.f44914t0 = str;
        ArrayList arrayList = this.f44913s0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f44911r0;
            arrayList2.clear();
            int size = this.f44909q0.size();
            for (int i10 = 0; i10 < size; i10++) {
                zx zxVar2 = this.R;
                if ((zxVar2 == null || zxVar2.a() != ((y) this.f44909q0.get(i10)).f44882c) && F(((y) this.f44909q0.get(i10)).f44880a)) {
                    arrayList2.add((y) this.f44909q0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f44909q0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar = (y) this.f44909q0.get(i11);
            if (yVar != null && yVar.f44880a != null && (((zxVar = this.R) == null || zxVar.a() != yVar.f44882c) && F(((y) this.f44909q0.get(i11)).f44880a))) {
                TLObject tLObject = yVar.f44880a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = ag.f.i(chat, this.f44908p0, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) yVar.f44880a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) yVar.f44880a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(yVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(wVar.f44874c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new mq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final jb1 I() {
        return this.f44900h0;
    }

    public final Object J(int i10) {
        int size;
        int i11;
        int size2;
        ArrayList arrayList;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList2 = this.f44919x;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList2.size()) {
                return arrayList2.get(i13);
            }
            i10 = yh.f(1, i10, arrayList2);
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            if (i10 > 0) {
                return arrayList3.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            if (this.K) {
                arrayList = this.f44913s0;
            } else {
                arrayList = this.f44911r0;
            }
            if (i10 > M && (i12 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((y) arrayList.get(i12)).f44880a;
                boolean z4 = tLObject instanceof TLRPC.User;
                int i14 = this.f44908p0;
                if (z4) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).f19331id));
                    if (user != null) {
                        return user;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f19184id))) != null) {
                    return chat;
                } else {
                    return tLObject;
                }
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.C;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = yh.f(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.B;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = yh.f(1, i10, arrayList5);
        }
        s sVar = this.f44899g0;
        ArrayList arrayList6 = sVar.e;
        ArrayList arrayList7 = sVar.d;
        ArrayList arrayList8 = sVar.f44775j;
        int size3 = this.f44912s.size();
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
        if (size5 > 3 && this.E0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.D0) {
            i15 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.H;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i15 + 1;
        }
        if (i10 >= 0 && i10 < size3) {
            return this.f44912s.get(i10);
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
        ArrayList arrayList10 = this.E;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.U && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size2 + i16);
        ArrayList arrayList11 = this.F;
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
        if (this.K) {
            arrayList = this.f44913s0;
        } else {
            arrayList = this.f44911r0;
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
        if (this.A0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f44919x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.G;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
            if (!this.K) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.C;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f44912s.size();
        int size2 = this.f44899g0.d.size();
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
        if (!this.K && !MediaDataController.getInstance(this.f44908p0).hints.isEmpty()) {
            if (this.f44896e0 != 14 || this.f44907o0.f37117w2) {
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
        if (this.K && this.G.isEmpty()) {
            ArrayList arrayList2 = this.f44919x;
            if (!arrayList2.isEmpty()) {
                i10 = yh.f(1, i10, arrayList2);
            }
            if (P()) {
                ?? M = M();
                if (this.K) {
                    arrayList = this.f44913s0;
                } else {
                    arrayList = this.f44911r0;
                }
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList.size()) {
                    i10 -= K();
                }
            }
            s sVar = this.f44899g0;
            ArrayList arrayList3 = sVar.e;
            ArrayList arrayList4 = sVar.d;
            int size3 = this.f44912s.size();
            int size4 = arrayList4.size();
            int size5 = sVar.f44775j.size();
            int i13 = 3;
            if (size5 > 3 && this.E0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.D0) {
                i13 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.H;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i13 + 1;
            }
            int size7 = this.B.size();
            if (size7 > 0) {
                if (i10 < 0 || i10 >= size7) {
                    i10 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (K() > 0 || !this.C.isEmpty() || !arrayList2.isEmpty())) {
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
                ArrayList arrayList6 = this.E;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i15 <= 0 || i15 >= size2) {
                    ArrayList arrayList7 = this.F;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f44893c != w.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        if (this.S != 2 && N()) {
            return true;
        }
        return false;
    }

    public final void Q() {
        if ((this.N != 0 && this.L != 0) || this.f44895d0 != this.f44891a0) {
            return;
        }
        zx zxVar = this.R;
        if (zxVar != null && zxVar.a() != 0 && !this.U) {
            V(this.f44895d0, this.W);
            return;
        }
        W(this.f44895d0, this.W);
    }

    public final void R(long j10, TLObject tLObject) {
        y yVar;
        String str;
        y yVar2 = (y) this.f44915u0.f(j10);
        if (yVar2 == null) {
            Object obj = new Object();
            this.f44915u0.k(obj, j10);
            yVar = obj;
        } else {
            this.f44909q0.remove(yVar2);
            yVar = yVar2;
        }
        this.f44909q0.add(0, yVar);
        yVar.f44882c = j10;
        yVar.f44880a = tLObject;
        yVar.f44881b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.J;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f44908p0).getStorageQueue().postRunnable(new n((wn0) this, j10, 1));
    }

    public final boolean S() {
        int i10 = this.f44896e0;
        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 1 && i10 != 11 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.f44899g0.e.size();
            if (this.D0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    public final void U(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: tf.z.U(int, java.lang.String):void");
    }

    public final void V(int i10, String str) {
        zx zxVar = this.R;
        if (zxVar != null && zxVar.a() != 0 && this.S != 0) {
            if (!TextUtils.isEmpty(this.W) || !TextUtils.isEmpty(str)) {
                int i11 = this.N;
                int i12 = this.f44908p0;
                if (i11 != 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.N, true);
                    this.N = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.E;
                if (isEmpty) {
                    this.f44914t0 = null;
                    this.F.clear();
                    arrayList.clear();
                    this.Q = 0;
                    this.W = null;
                    this.K = false;
                    l();
                } else if (this.f44896e0 != 15) {
                    long a2 = this.R.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f19293q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(a2);
                    if (str.equals(this.W) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.W = str;
                    int i13 = 1 + this.Q;
                    this.Q = i13;
                    this.N = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new u2(this, str, i13, i10, tL_messages_search, 1), 2);
                }
            }
        }
    }

    public final void W(int i10, String str) {
        boolean z4;
        boolean z10;
        boolean z11;
        if (this.S != 0 && (!TextUtils.isEmpty(this.W) || !TextUtils.isEmpty(str))) {
            int i11 = this.L;
            int i12 = this.f44908p0;
            boolean z12 = false;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.L, true);
                this.L = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.F;
            if (!isEmpty && this.R.a() == 0) {
                G(str);
                this.f44899g0.f(this.f44912s, this.f44913s0);
                if (this.f44896e0 == 15) {
                    int i13 = this.A0 - 1;
                    this.A0 = i13;
                    zx zxVar = this.R;
                    if (zxVar != null) {
                        if (i13 > 0) {
                            z12 = true;
                        }
                        zxVar.d(z12, true);
                        this.R.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i14 = this.f44893c.f44872a;
                    if ((i14 & 2) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z4;
                    if ((i14 & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z10;
                    if ((i14 & 8) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tL_messages_searchGlobal.users_only = z11;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.f19295q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.f44923z0;
                    if (!str.equals(this.W)) {
                        this.d = false;
                    }
                    if (str.equals(this.W) && this.X == this.f44893c.f44872a && !arrayList.isEmpty() && this.f44895d0 == this.f44891a0) {
                        MessageObject messageObject = (MessageObject) a2.i(1, arrayList);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = this.Z;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.W = str;
                    this.X = this.f44893c.f44872a;
                    int i15 = this.M + 1;
                    this.M = i15;
                    this.L = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new u2(this, str, i15, i10, tL_messages_searchGlobal, 2), 2);
                }
            } else {
                this.f44914t0 = null;
                arrayList.clear();
                this.E.clear();
                this.M = 0;
                this.W = null;
                this.X = 0;
                this.K = false;
                l();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        zx zxVar = this.R;
        if (zxVar != null && zxVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f44908p0).getTopicsController().getTopics(-this.R.a());
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
        if (this.A0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f44919x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = this.G;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
            if (!this.K) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.C;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f44912s.size();
        s sVar = this.f44899g0;
        int size2 = sVar.d.size();
        int i13 = i10 + size + size2;
        int size3 = sVar.e.size();
        if (size3 > 3 && this.D0) {
            size3 = 3;
        }
        int size4 = this.H.size() + size3;
        int size5 = sVar.f44775j.size();
        if (size5 > 3 && this.E0) {
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
        ArrayList arrayList5 = this.E;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i13 += size6 + 1 + (!this.U ? 1 : 0);
        }
        if (!this.U) {
            this.V = i13;
        }
        ArrayList arrayList6 = this.F;
        int size7 = arrayList6.size();
        if ((this.f44893c != w.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i12 = 1;
            }
            size7 = i12;
        }
        if (arrayList5.isEmpty() || this.U) {
            i11 = size7;
        }
        if (i11 != 0) {
            i13 += i11 + 1 + (!this.T ? 1 : 0);
        }
        if (this.U) {
            this.V = i13;
        }
        this.f44922y0 = i13;
        return i13;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: tf.z.j(int):int");
    }

    @Override
    public final void v(f2.l1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: tf.z.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        jb1 jb1Var;
        int i11 = this.f44896e0;
        boolean z10 = true;
        Context context = this.e;
        switch (i10) {
            case 0:
                h6 h6Var = new h6(context, null);
                if (i11 != 3) {
                    z10 = false;
                }
                h6Var.f21145i0 = z10;
                jb1Var = h6Var;
                break;
            case 1:
                jb1Var = new u3(context, null);
                break;
            case 2:
            case 9:
                jb1Var = new iu0(2, context, true);
                break;
            case 3:
                jb1Var = new oa(context);
                break;
            case 4:
                t00 t00Var = new t00(context, null);
                t00Var.setViewType(1);
                t00Var.setIsSingleCell(true);
                jb1Var = t00Var;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                textView.setTextColor(j6.w0(null, j6.G6, false));
                jb1Var = textView;
                break;
            case 6:
                jb1 jb1Var2 = new jb1(context, 13, null);
                jb1Var2.setSelectorDrawableColor(j6.w0(null, j6.f19996i6, false));
                jb1Var2.setTag(9);
                jb1Var2.setItemAnimator(null);
                jb1Var2.setLayoutAnimation(null);
                org.telegram.ui.k kVar = new org.telegram.ui.k(19);
                kVar.j1(0);
                jb1Var2.setLayoutManager(kVar);
                if (i11 == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jb1Var2.setAdapter(new t(this.f44908p0, this.e, null, false, z4));
                jb1Var2.setOnItemClickListener(new dg.n(this, 20));
                jb1Var2.setOnItemLongClickListener(new r(this));
                this.f44900h0 = jb1Var2;
                jb1Var = jb1Var2;
                break;
            case 7:
            default:
                jb1Var = new o8(16, context, false);
                break;
            case 8:
                jb1Var = new h6(context, null);
                break;
            case 10:
                p pVar = new p(this, 1);
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                p9 p9Var = new p9(context);
                p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                linearLayout.addView(p9Var, b6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i12 = j6.G6;
                textView2.setTextColor(j6.w0(null, i12, false));
                textView2.setTypeface(AndroidUtilities.bold());
                y3.r(R.string.SearchMessagesFilterEmptyTitle, textView2, 17);
                linearLayout.addView(textView2, b6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                linearLayout.f44870a = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(j6.w0(null, i12, false));
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView3.setGravity(17);
                linearLayout.addView(textView3, b6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView4.setTextSize(1, 14.0f);
                textView4.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i13 = j6.Oh;
                textView4.setTextColor(j6.w0(null, i13, false));
                int l1 = j6.l1(0.15f, j6.w0(null, i13, false));
                textView4.setBackground(j6.i0(6, 6, 6, 6, 0, l1, l1));
                textView4.setOnClickListener(new oh.n(pVar, 20));
                linearLayout.addView(textView4, b6.t(-2, -2, 1, 0, 0, 0, 38));
                this.B0 = linearLayout;
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.W));
                jb1Var = linearLayout;
                break;
        }
        if (i10 == 5) {
            jb1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            jb1Var.setLayoutParams(new f2.w0(-1, -2));
        }
        return new f2.l1(jb1Var);
    }
}
