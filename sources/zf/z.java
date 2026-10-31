package zf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c7;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.wd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ay;
import org.telegram.ui.mx;
import org.telegram.ui.q00;
import org.telegram.ui.u71;
import org.telegram.ui.w71;
import w7.b6;
public abstract class z extends sk0 {
    public q00 A0;
    public int B0;
    public int C0;
    public String D;
    public int D0;
    public u71 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public mx U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int f55682a0;
    public String f55683b0;
    public int f55685c0;
    public boolean d;
    public int f55686d0;
    public final Context e;
    public int f55687e0;
    public n f55688f;
    public int f55689f0;
    public int f55690g0;
    public n h;
    public final int f55691h0;
    public final s4.j f55692i0;
    public final t f55693j0;
    public w71 f55694k0;
    public final long f55695l0;
    public long f55697n0;
    public View f55698o0;
    public yh.o f55699p0;
    public ArrayList f55700q0;
    public org.telegram.ui.Wallet.x0 f55701r;
    public final ay f55702r0;
    public final int f55704s0;
    public ArrayList f55705t0;
    public final ArrayList f55706u0;
    public final ArrayList f55707v0;
    public int f55708w;
    public String f55709w0;
    public int f55710x;
    public a0.h f55711x0;
    public final ArrayList f55713y0;
    public boolean f55714z0;
    public w f55684c = w.All;
    public int f55696n = -1;
    public ArrayList f55703s = new ArrayList();
    public final ArrayList f55712y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final HashSet L = new HashSet();
    public int O = 0;
    public int Q = 0;
    public int Y = -1;
    public boolean m0 = false;

    public z(Context context, ay ayVar, int i10, int i11, s4.j jVar, boolean z10) {
        int i12 = d20.f15147s0;
        this.f55704s0 = i12;
        this.f55705t0 = new ArrayList();
        this.f55706u0 = new ArrayList();
        this.f55707v0 = new ArrayList();
        this.f55709w0 = null;
        this.f55711x0 = new a0.h();
        this.f55713y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.f55692i0 = jVar;
        this.f55702r0 = ayVar;
        zm0 zm0Var = (zm0) this;
        t tVar = new t(zm0Var);
        this.f55693j0 = tVar;
        tVar.f55575a = new s9.g(zm0Var);
        tVar.f55587p = z10;
        this.e = context;
        this.V = i10;
        this.f55691h0 = i11;
        this.f55695l0 = d20.i(i12).e();
        if (i11 != 15) {
            hs.a0(i12).f15938a.c(new i2.u(i12, i11, new q(this), 17));
        }
        ui.b0(i12).M0(true);
    }

    public static boolean X(String str, String str2) {
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
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 1 && i10 != 4 && i10 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.N;
        ArrayList arrayList = this.f55706u0;
        ArrayList arrayList2 = this.f55707v0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                y yVar = (y) arrayList2.remove(0);
                this.f55705t0.remove(yVar);
                arrayList.remove(yVar);
                this.f55711x0.l(yVar.f55680c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(yVar.f55680c);
                } else {
                    sb2.append(", ");
                    sb2.append(yVar.f55680c);
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
            this.f55705t0.clear();
            this.f55711x0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        f();
        boolean z11 = this.N;
        int i10 = this.f55704s0;
        if (!z11) {
            hs.a0(i10).f15938a.c(new wd(i10, 14));
        } else {
            hs.a0(i10).f15938a.c(new yh.o(5, (zm0) this, sb2));
        }
    }

    public final boolean F(Object obj) {
        if (this.f55691h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        ay ayVar = this.f55702r0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return ayVar.A2;
            }
            return ayVar.f35902z2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (w3.T(chat)) {
                return ayVar.f35899y2;
            }
            if (w3.n0(chat)) {
                if (ayVar.f35882v2 || ayVar.f35888w2) {
                    return true;
                }
                return false;
            } else if (ayVar.f35882v2 || ayVar.f35894x2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        mx mxVar;
        String str2;
        String str3;
        this.f55709w0 = str;
        ArrayList arrayList = this.f55707v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f55706u0;
            arrayList2.clear();
            int size = this.f55705t0.size();
            for (int i10 = 0; i10 < size; i10++) {
                mx mxVar2 = this.U;
                if ((mxVar2 == null || mxVar2.a() != ((y) this.f55705t0.get(i10)).f55680c) && F(((y) this.f55705t0.get(i10)).f55678a)) {
                    arrayList2.add((y) this.f55705t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f55705t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar = (y) this.f55705t0.get(i11);
            if (yVar != null && yVar.f55678a != null && (((mxVar = this.U) == null || mxVar.a() != yVar.f55680c) && F(((y) this.f55705t0.get(i11)).f55678a))) {
                TLObject tLObject = yVar.f55678a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = gg.e.i(this.f55704s0, chat, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) yVar.f55678a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = h20.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) yVar.f55678a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(yVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(wVar.f55642c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new dq(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i10) {
        int size;
        int i11;
        int size2;
        ArrayList arrayList;
        int i12;
        TLRPC.Chat L0;
        int i13;
        ArrayList arrayList2 = this.f55712y;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList2.size()) {
                return arrayList2.get(i13);
            }
            i10 = sc.e.e(1, i10, arrayList2);
        }
        ArrayList arrayList3 = this.J;
        if (!arrayList3.isEmpty()) {
            if (i10 > 0) {
                return arrayList3.get(i10 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.N) {
                arrayList = this.f55707v0;
            } else {
                arrayList = this.f55706u0;
            }
            if (i10 > L && (i12 = (i10 - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((y) arrayList.get(i12)).f55678a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.f55704s0;
                if (z10) {
                    TLRPC.User Z1 = vp.r1(i14).Z1(Long.valueOf(((TLRPC.User) tLObject).f19942id));
                    if (Z1 != null) {
                        return Z1;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (L0 = vp.r1(i14).L0(Long.valueOf(((TLRPC.Chat) tLObject).f19793id))) != null) {
                    return L0;
                } else {
                    return tLObject;
                }
            }
            i10 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = sc.e.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = sc.e.e(1, i10, arrayList5);
        }
        t tVar = this.f55693j0;
        ArrayList arrayList6 = tVar.e;
        ArrayList arrayList7 = tVar.d;
        ArrayList arrayList8 = tVar.f55581j;
        int size3 = this.f55703s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i10 != 0) {
                i10--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i15 = 3;
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.G0) {
            i15 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.K;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i15 + 1;
        }
        if (i10 >= 0 && i10 < size3) {
            return this.f55703s.get(i10);
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
        ArrayList arrayList10 = this.H;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size2 + i16);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 > 0 && i21 <= arrayList11.size()) {
            return arrayList11.get(i21 - 1);
        }
        return null;
    }

    public final int J() {
        ArrayList arrayList;
        int i10;
        if (this.N) {
            arrayList = this.f55707v0;
        } else {
            arrayList = this.f55706u0;
        }
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return (L() ? 1 : 0) + i10;
    }

    public final int K() {
        int i10 = 0;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f55712y;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (O()) {
            i10 += J();
            if (!this.N) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f55703s.size();
        int size2 = this.f55693j0.d.size();
        int i11 = i10 + size + size2;
        if (size + size2 > 0) {
            if (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i11 + 1;
            }
            return i11;
        }
        return i11;
    }

    public final boolean L() {
        if (!this.N && !ui.b0(this.f55704s0).f18325i1.isEmpty()) {
            if (this.f55691h0 != 14 || this.f55702r0.f35902z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean M() {
        if (R() && J() > 0) {
            return true;
        }
        return false;
    }

    public final boolean N(int i10) {
        int size;
        int i11;
        int i12;
        int size2;
        ArrayList arrayList;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList2 = this.f55712y;
            if (!arrayList2.isEmpty()) {
                i10 = sc.e.e(1, i10, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.N) {
                    arrayList = this.f55707v0;
                } else {
                    arrayList = this.f55706u0;
                }
                if (i10 <= L || (i10 - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i10 -= J();
                }
            }
            t tVar = this.f55693j0;
            ArrayList arrayList3 = tVar.e;
            ArrayList arrayList4 = tVar.d;
            int size3 = this.f55703s.size();
            int size4 = arrayList4.size();
            int size5 = tVar.f55581j.size();
            int i13 = 3;
            if (size5 > 3 && this.H0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.G0) {
                i13 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i13 + 1;
            }
            int size7 = this.E.size();
            if (size7 > 0) {
                if (i10 < 0 || i10 >= size7) {
                    i10 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList2.isEmpty())) {
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
                ArrayList arrayList6 = this.H;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i15 <= 0 || i15 >= size2) {
                    ArrayList arrayList7 = this.I;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f55684c != w.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        if (this.V != 2 && M()) {
            return true;
        }
        return false;
    }

    public final void P() {
        if ((this.Q != 0 && this.O != 0) || this.f55690g0 != this.f55686d0) {
            return;
        }
        mx mxVar = this.U;
        if (mxVar != null && mxVar.a() != 0 && !this.X) {
            U(this.f55690g0, this.Z);
            return;
        }
        V(this.f55690g0, this.Z);
    }

    public final void Q(long j10, TLObject tLObject) {
        y yVar;
        String str;
        y yVar2 = (y) this.f55711x0.f(j10);
        if (yVar2 == null) {
            Object obj = new Object();
            this.f55711x0.k(obj, j10);
            yVar = obj;
        } else {
            this.f55705t0.remove(yVar2);
            yVar = yVar2;
        }
        this.f55705t0.add(0, yVar);
        yVar.f55680c = j10;
        yVar.f55678a = tLObject;
        yVar.f55679b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        f();
        int i10 = this.f55704s0;
        hs.a0(i10).f15938a.c(new org.telegram.ui.web.l(i10, j10, 3));
    }

    public final boolean R() {
        int i10 = this.f55691h0;
        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 1 && i10 != 11 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.f55693j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    public final void T(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: zf.z.T(int, java.lang.String):void");
    }

    public final void U(int i10, String str) {
        mx mxVar = this.U;
        if (mxVar != null && mxVar.a() != 0 && this.V != 0) {
            if (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str)) {
                int i11 = this.Q;
                int i12 = this.f55704s0;
                if (i11 != 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
                    this.Q = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.H;
                if (isEmpty) {
                    this.f55709w0 = null;
                    this.I.clear();
                    arrayList.clear();
                    this.T = 0;
                    this.Z = null;
                    this.N = false;
                    f();
                } else if (this.f55691h0 != 15) {
                    long a2 = this.U.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f19904q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = vp.r1(i12).i1(a2);
                    if (str.equals(this.Z) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.Z = str;
                    int i13 = 1 + this.T;
                    this.T = i13;
                    this.Q = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new c7(i13, i10, 1, this, str, tL_messages_search), 2);
                }
            }
        }
    }

    public final void V(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i11 = this.O;
            int i12 = this.f55704s0;
            boolean z13 = false;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (!isEmpty && this.U.a() == 0) {
                G(str);
                this.f55693j0.f(this.f55703s, this.f55707v0);
                if (this.f55691h0 == 15) {
                    int i13 = this.D0 - 1;
                    this.D0 = i13;
                    mx mxVar = this.U;
                    if (mxVar != null) {
                        if (i13 > 0) {
                            z13 = true;
                        }
                        mxVar.d(z13, true);
                        this.U.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i14 = this.f55684c.f55640a;
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
                    tL_messages_searchGlobal.f19906q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.C0;
                    if (!str.equals(this.Z)) {
                        this.d = false;
                    }
                    if (str.equals(this.Z) && this.f55682a0 == this.f55684c.f55640a && !arrayList.isEmpty() && this.f55690g0 == this.f55686d0) {
                        jj jjVar = (jj) i0.a.g(1, arrayList);
                        tL_messages_searchGlobal.offset_id = jjVar.f1();
                        tL_messages_searchGlobal.offset_rate = this.f55685c0;
                        tL_messages_searchGlobal.offset_peer = vp.r1(i12).i1(jj.C1(jjVar.f16337k.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.Z = str;
                    this.f55682a0 = this.f55684c.f55640a;
                    int i15 = this.P + 1;
                    this.P = i15;
                    this.O = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new c7(i15, i10, 2, this, str, tL_messages_searchGlobal), 2);
                }
            } else {
                this.f55709w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.f55682a0 = 0;
                this.N = false;
                f();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        mx mxVar = this.U;
        if (mxVar != null && mxVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList l4 = vp.r1(this.f55704s0).f18891r7.l(-this.U.a());
                String trim = str.trim();
                for (int i10 = 0; i10 < l4.size(); i10++) {
                    if (l4.get(i10) != null && ((TLRPC.TL_forumTopic) l4.get(i10)).title.toLowerCase().contains(trim)) {
                        arrayList.add((TLRPC.TL_forumTopic) l4.get(i10));
                        ((TLRPC.TL_forumTopic) l4.get(i10)).searchQuery = trim;
                    }
                }
            }
            f();
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11 = 0;
        int i12 = 3;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f55712y;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (O()) {
            i10 += J();
            if (!this.N) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f55703s.size();
        t tVar = this.f55693j0;
        int size2 = tVar.d.size();
        int i13 = i10 + size + size2;
        int size3 = tVar.e.size();
        if (size3 > 3 && this.G0) {
            size3 = 3;
        }
        int size4 = this.K.size() + size3;
        int size5 = tVar.f55581j.size();
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i13++;
        }
        if (size4 != 0) {
            i13 += size4 + 1;
        }
        if (size5 != 0) {
            i13 += size5;
        }
        ArrayList arrayList5 = this.H;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i13 += size6 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i13;
        }
        ArrayList arrayList6 = this.I;
        int size7 = arrayList6.size();
        if ((this.f55684c != w.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i12 = 1;
            }
            size7 = i12;
        }
        if (arrayList5.isEmpty() || this.X) {
            i11 = size7;
        }
        if (i11 != 0) {
            i13 += i11 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i13;
        }
        this.B0 = i13;
        return i13;
    }

    @Override
    public final long c(int i10) {
        return i10;
    }

    @Override
    public final int d(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: zf.z.d(int):int");
    }

    @Override
    public final void t(s4.c1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: zf.z.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        u71 u71Var;
        int i11 = this.f55691h0;
        boolean z11 = false;
        Context context = this.e;
        switch (i10) {
            case 0:
                k6 k6Var = new k6(context, null);
                if (i11 == 3) {
                    z11 = true;
                }
                k6Var.f22135l0 = z11;
                u71Var = k6Var;
                break;
            case 1:
                u71Var = new z3(context, null);
                break;
            case 2:
            case 9:
                u71Var = new kt0(2, context, true);
                break;
            case 3:
                u71Var = new ja(context);
                break;
            case 4:
                zz zzVar = new zz(context, null);
                zzVar.setViewType(1);
                zzVar.setIsSingleCell(true);
                u71Var = zzVar;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                a7.V(textView, t6.G6, null);
                u71Var = textView;
                break;
            case 6:
                w71 w71Var = new w71(13, context, null);
                a7.m(w71Var, 20, t6.f21020i6, null);
                w71Var.setTag(9);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(20);
                fVar.j1(0);
                w71Var.setLayoutManager(fVar);
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w71Var.setAdapter(new u(this.f55704s0, this.e, null, false, z10));
                w71Var.setOnItemClickListener(new ag.y0(this, 25));
                w71Var.setOnItemLongClickListener(new q(this));
                this.f55694k0 = w71Var;
                u71Var = w71Var;
                break;
            case 7:
            default:
                u71Var = new p8(16, context, false);
                break;
            case 8:
                u71Var = new k6(context, null);
                break;
            case 10:
                r rVar = new r(this, 1);
                u71 u71Var2 = new u71(context, 25);
                u71Var2.setOrientation(1);
                g9 g9Var = new g9(context);
                g9Var.setImageDrawable(new bi0(2131624317, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
                u71Var2.addView(g9Var, b6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i12 = t6.G6;
                a7.V(textView2, i12, null);
                textView2.setTypeface(org.telegram.messenger.i0.o());
                textView2.setText(cd.L0(2131745766, null));
                textView2.setGravity(17);
                u71Var2.addView(textView2, b6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                u71Var2.f42064b = textView3;
                textView3.setTextSize(1, 14.0f);
                a7.V(textView3, i12, null);
                textView3.setText(cd.a0(null, null, 2131745767, ""));
                textView3.setGravity(17);
                u71Var2.addView(textView3, b6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
                sc.e.u(textView4, 1, 14.0f, null, 2131745768);
                int i13 = t6.Ci;
                a7.V(textView4, i13, null);
                int r12 = t6.r1(0.15f, t6.v0(i13));
                org.telegram.ui.Cells.y k02 = t6.k0(6, 6, 6, 6, 0, r12, r12);
                w6 L = a7.L(0.15f, i13);
                textView4.setBackground(k02);
                a7.k(textView4, k02, null, L, null);
                textView4.setOnClickListener(new f(rVar, 1));
                u71Var2.addView(textView4, b6.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = u71Var2;
                textView3.setText(cd.a0(null, null, 2131745767, this.Z));
                u71Var = u71Var2;
                break;
        }
        if (i10 == 5) {
            u71Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(86.0f)));
        } else {
            u71Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.c1(u71Var);
    }
}
