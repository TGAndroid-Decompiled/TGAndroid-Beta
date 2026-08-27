package pf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import f2.o1;
import h7.z5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import lh.a8;
import lh.c5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.u2;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.gy;
import org.telegram.ui.mv;
import org.telegram.ui.ol0;
import org.telegram.ui.px;
import org.telegram.ui.rx;
import org.telegram.ui.ta1;
import org.telegram.ui.xs;
import org.telegram.ui.z00;
import org.telegram.ui.zh1;

public abstract class z extends yk0 {
    public v A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public String I;
    public boolean J;
    public int L;
    public String N;
    public int O;
    public int P;
    public rx Q;
    public final int R;
    public boolean S;
    public boolean T;
    public String V;
    public int W;
    public String X;
    public int Y;
    public int Z;

    public int f45979a0;

    public int f45980b0;

    public int f45982c0;
    public boolean d;

    public final int f45983d0;

    public final Context f45984e;

    public final f2.l f45985e0;

    public o f45986f;

    public final s f45987f0;

    public ta1 f45988g0;
    public o h;

    public final long f45989h0;

    public long f45991j0;

    public View f45992k0;

    public zh1 f45993l0;
    public ArrayList m0;

    public final gy f45995n0;

    public final int f45996o0;

    public ArrayList f45997p0;

    public final ArrayList f45998q0;

    public ol0 f45999r;

    public final ArrayList f46000r0;

    public String f46002s0;

    public a0.h f46003t0;

    public final ArrayList f46004u0;
    public int v;

    public boolean f46005v0;

    public int f46006w;

    public z00 f46007w0;

    public int f46009x0;

    public String f46010y;

    public int f46011y0;

    public int f46012z0;

    public w f45981c = w.All;

    public int f45994n = -1;

    public ArrayList f46001s = new ArrayList();

    public final ArrayList f46008x = new ArrayList();
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

    public boolean f45990i0 = false;

    public z(Context context, gy gyVar, int i10, int i11, f2.l lVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.f45996o0 = i12;
        this.f45997p0 = new ArrayList();
        this.f45998q0 = new ArrayList();
        this.f46000r0 = new ArrayList();
        this.f46002s0 = null;
        this.f46003t0 = new a0.h();
        this.f46004u0 = new ArrayList();
        this.B0 = -1;
        this.C0 = true;
        this.D0 = true;
        this.f45985e0 = lVar;
        this.f45995n0 = gyVar;
        cn0 cn0Var = (cn0) this;
        s sVar = new s(cn0Var);
        this.f45987f0 = sVar;
        sVar.f45836a = new o0.b(cn0Var, 12);
        sVar.f45849p = z10;
        this.f45984e = context;
        this.R = i10;
        this.f45983d0 = i11;
        this.f45989h0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new h3.z(i12, i11, new r(this), 14));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
        if (str2 != null && str != null) {
            String[] strArrSplit = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                String str3 = strArrSplit[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(strArrSplit[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 1 || i10 == 4 || i10 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.J;
        ArrayList arrayList = this.f45998q0;
        ArrayList arrayList2 = this.f46000r0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                y yVar = (y) arrayList2.remove(0);
                this.f45997p0.remove(yVar);
                arrayList.remove(yVar);
                this.f46003t0.l(yVar.f45969c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(yVar.f45969c);
                } else {
                    sb2.append(", ");
                    sb2.append(yVar.f45969c);
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
            this.f45997p0.clear();
            this.f46003t0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.I;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.f45996o0).getStorageQueue().postRunnable(new zh1(15, (cn0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.f45983d0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        gy gyVar = this.f45995n0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? gyVar.f38611w2 : gyVar.f38606v2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        if (ChatObject.isChannel(chat)) {
            return gyVar.f38602u2;
        }
        if (ChatObject.isMegagroup(chat)) {
            return gyVar.f38587r2 || gyVar.f38593s2;
        }
        return gyVar.f38587r2 || gyVar.f38598t2;
    }

    public final void G(String str) {
        rx rxVar;
        String userName;
        String str2;
        this.f46002s0 = str;
        ArrayList arrayList = this.f46000r0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f45998q0;
            arrayList2.clear();
            int size = this.f45997p0.size();
            for (int i10 = 0; i10 < size; i10++) {
                rx rxVar2 = this.Q;
                if ((rxVar2 == null || rxVar2.a() != ((y) this.f45997p0.get(i10)).f45969c) && F(((y) this.f45997p0.get(i10)).f45967a)) {
                    arrayList2.add((y) this.f45997p0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f45997p0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar = (y) this.f45997p0.get(i11);
            if (yVar != null && yVar.f45967a != null && (((rxVar = this.Q) == null || rxVar.a() != yVar.f45969c) && F(((y) this.f45997p0.get(i11)).f45967a))) {
                TLObject tLObject = yVar.f45967a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    userName = chat.monoforum ? wf.c.i(chat, this.f45996o0, false) : chat.title;
                    str2 = ((TLRPC.Chat) yVar.f45967a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    userName = UserObject.getUserName((TLRPC.User) tLObject);
                    str2 = ((TLRPC.User) yVar.f45967a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    userName = ((TLRPC.ChatInvite) tLObject).title;
                    str2 = null;
                } else {
                    userName = null;
                    str2 = null;
                }
                if ((userName != null && Y(userName.toLowerCase(), lowerCase)) || (str2 != null && Y(str2.toLowerCase(), lowerCase))) {
                    arrayList.add(yVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(wVar.f45960c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new cq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final ta1 I() {
        return this.f45988g0;
    }

    public final Object J(int i10) {
        int size;
        int i11;
        TLRPC.Chat chat;
        int i12;
        ArrayList arrayList = this.f46008x;
        if (!arrayList.isEmpty()) {
            if (i10 > 0 && (i12 = i10 - 1) < arrayList.size()) {
                return arrayList.get(i12);
            }
            i10 = pa.e(1, i10, arrayList);
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0) {
                return arrayList2.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            ArrayList arrayList3 = this.J ? this.f46000r0 : this.f45998q0;
            if (i10 > M && (i11 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((y) arrayList3.get(i11)).f45967a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.f45996o0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i13).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f22380id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.User) tLObject).f22527id));
                return user != null ? user : tLObject;
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = pa.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.A;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = pa.e(1, i10, arrayList5);
        }
        s sVar = this.f45987f0;
        ArrayList arrayList6 = sVar.f45839e;
        ArrayList arrayList7 = sVar.d;
        ArrayList arrayList8 = sVar.f45843j;
        int size2 = this.f46001s.size();
        int size3 = arrayList7.size();
        if (size2 + size3 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i10 == 0) {
                return null;
            }
            i10--;
        }
        int size4 = arrayList8.size();
        if (size4 > 3 && this.D0) {
            size4 = 3;
        }
        int size5 = arrayList6.size();
        int i14 = (size5 <= 3 || !this.C0) ? size5 : 3;
        boolean zIsEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.G;
        int size6 = (zIsEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i14 + 1;
        if (i10 >= 0 && i10 < size2) {
            return this.f46001s.get(i10);
        }
        int i16 = i10 - size2;
        if (i16 >= 0 && i16 < size3) {
            return arrayList7.get(i16);
        }
        int i17 = i16 - size3;
        if (i17 >= 0 && i17 < size4) {
            return arrayList8.get(i17);
        }
        int i18 = i17 - size4;
        if (i18 <= 0 || i18 >= size6) {
            size = i18 - size6;
        } else {
            int i19 = i18 - 1;
            if (i19 >= 0 && i19 < arrayList9.size()) {
                return arrayList9.get(i19);
            }
            size = i19 - arrayList9.size();
            if (size >= 0 && size < arrayList6.size()) {
                return arrayList6.get(size);
            }
        }
        ArrayList arrayList10 = this.D;
        int size7 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (size > 0 && size <= arrayList10.size()) {
            return arrayList10.get(size - 1);
        }
        if (!this.T && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = size - (size7 + i15);
        ArrayList arrayList11 = this.E;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 <= 0 || i20 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i20 - 1);
    }

    public final int K() {
        ArrayList arrayList = this.J ? this.f46000r0 : this.f45998q0;
        return (M() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int L() {
        if (this.f46012z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f46008x;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.J) {
                return size;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.f46001s.size();
        int size3 = this.f45987f0.d.size();
        int i10 = size + size2 + size3;
        if (size2 + size3 > 0) {
            return (K() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i10 : i10 + 1;
        }
        return i10;
    }

    public final boolean M() {
        if (this.J || MediaDataController.getInstance(this.f45996o0).hints.isEmpty()) {
            return false;
        }
        return this.f45983d0 != 14 || this.f45995n0.f38606v2;
    }

    public final boolean N() {
        return S() && K() > 0;
    }

    public final boolean O(int i10) {
        int size;
        int size2;
        int size3;
        int i11;
        boolean zIsEmpty;
        ArrayList arrayList;
        int size4;
        int size5;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList2;
        int size6;
        ArrayList arrayList3;
        if (this.J && this.F.isEmpty()) {
            ArrayList arrayList4 = this.f46008x;
            if (!arrayList4.isEmpty()) {
                i10 = pa.e(1, i10, arrayList4);
            }
            if (!P()) {
                s sVar = this.f45987f0;
                ArrayList arrayList5 = sVar.f45839e;
                ArrayList arrayList6 = sVar.d;
                size = this.f46001s.size();
                size2 = arrayList6.size();
                size3 = sVar.f45843j.size();
                if (size3 > 3) {
                    size3 = 3;
                }
                int size7 = arrayList5.size();
                if (size7 > 3) {
                }
                zIsEmpty = arrayList5.isEmpty();
                arrayList = this.G;
                if (zIsEmpty) {
                    size4 = arrayList.size() + i11 + 1;
                } else {
                    size4 = arrayList.size() + i11 + 1;
                }
                size5 = this.A.size();
                if (size5 <= 0) {
                    if (size + size2 > 0) {
                        if (i10 >= 0) {
                            i14 = i13 - size3;
                            if (i14 <= 0) {
                            }
                            i15 = i14 - size4;
                            arrayList2 = this.D;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i15 > 0) {
                                arrayList3 = this.E;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.f45981c == w.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    if (i10 >= 0) {
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i14 = i13 - size3;
                    if (i14 <= 0) {
                    }
                    i15 = i14 - size4;
                    arrayList2 = this.D;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i15 > 0) {
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.E;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.f45981c == w.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                if (i10 >= 0) {
                }
                i10 -= size5 + 1;
                if (size + size2 > 0) {
                    if (i10 >= 0) {
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i14 = i13 - size3;
                    if (i14 <= 0) {
                    }
                    i15 = i14 - size4;
                    arrayList2 = this.D;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i15 > 0) {
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.E;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.f45981c == w.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                if (i10 >= 0) {
                    i14 = i13 - size3;
                    if (i14 <= 0) {
                    }
                    i15 = i14 - size4;
                    arrayList2 = this.D;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i15 > 0) {
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.E;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.f45981c == w.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                i14 = i13 - size3;
                if (i14 <= 0) {
                }
                i15 = i14 - size4;
                arrayList2 = this.D;
                if (arrayList2.isEmpty()) {
                    size6 = 0;
                } else {
                    size6 = arrayList2.size() + 1;
                }
                if (i15 > 0) {
                    arrayList3 = this.E;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.f45981c == w.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                arrayList3 = this.E;
                if (!arrayList3.isEmpty()) {
                    arrayList3.size();
                }
                if (this.f45981c == w.All) {
                }
                arrayList3.isEmpty();
                return false;
            }
            ?? M = M();
            ArrayList arrayList7 = this.J ? this.f46000r0 : this.f45998q0;
            if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList7.size()) {
                i10 -= K();
                s sVar2 = this.f45987f0;
                ArrayList arrayList8 = sVar2.f45839e;
                ArrayList arrayList9 = sVar2.d;
                size = this.f46001s.size();
                size2 = arrayList9.size();
                size3 = sVar2.f45843j.size();
                if (size3 > 3 && this.D0) {
                    size3 = 3;
                }
                int size8 = arrayList8.size();
                i11 = (size8 > 3 || !this.C0) ? size8 : 3;
                zIsEmpty = arrayList8.isEmpty();
                arrayList = this.G;
                if (zIsEmpty || !arrayList.isEmpty()) {
                    size4 = arrayList.size() + i11 + 1;
                } else {
                    size4 = 0;
                }
                size5 = this.A.size();
                if (size5 <= 0) {
                    if (size + size2 > 0 || (K() <= 0 && this.B.isEmpty() && arrayList4.isEmpty())) {
                        if ((i10 >= 0 || i10 >= size) && (((i12 = i10 - size) < 0 || i12 >= size2) && ((i13 = i12 - size2) <= 0 || i13 >= size3))) {
                            i14 = i13 - size3;
                            if (i14 <= 0 && i14 < size4) {
                                return true;
                            }
                            i15 = i14 - size4;
                            arrayList2 = this.D;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i15 > 0 || i15 >= size6) {
                                arrayList3 = this.E;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.f45981c == w.All || this.d) {
                                    arrayList3.isEmpty();
                                    return false;
                                }
                            }
                        }
                    } else if (i10 != 0) {
                        i10--;
                        if (i10 >= 0) {
                            i14 = i13 - size3;
                            if (i14 <= 0) {
                            }
                            i15 = i14 - size4;
                            arrayList2 = this.D;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i15 > 0) {
                                arrayList3 = this.E;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.f45981c == w.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                } else if (i10 >= 0 || i10 >= size5) {
                    i10 -= size5 + 1;
                    if (size + size2 > 0) {
                        if (i10 >= 0) {
                            i14 = i13 - size3;
                            if (i14 <= 0) {
                            }
                            i15 = i14 - size4;
                            arrayList2 = this.D;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i15 > 0) {
                                arrayList3 = this.E;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.f45981c == w.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    if (i10 >= 0) {
                        i14 = i13 - size3;
                        if (i14 <= 0) {
                        }
                        i15 = i14 - size4;
                        arrayList2 = this.D;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i15 > 0) {
                            arrayList3 = this.E;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.f45981c == w.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i14 = i13 - size3;
                    if (i14 <= 0) {
                    }
                    i15 = i14 - size4;
                    arrayList2 = this.D;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i15 > 0) {
                        arrayList3 = this.E;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.f45981c == w.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.E;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.f45981c == w.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean P() {
        return this.R != 2 && N();
    }

    public final void Q() {
        if ((this.M == 0 || this.K == 0) && this.f45982c0 == this.Z) {
            rx rxVar = this.Q;
            if (rxVar == null || rxVar.a() == 0 || this.T) {
                W(this.f45982c0, this.V);
            } else {
                V(this.f45982c0, this.V);
            }
        }
    }

    public final void R(long j10, TLObject tLObject) {
        y yVar = (y) this.f46003t0.f(j10);
        if (yVar == null) {
            yVar = new y();
            this.f46003t0.k(yVar, j10);
        } else {
            this.f45997p0.remove(yVar);
        }
        this.f45997p0.add(0, yVar);
        yVar.f45969c = j10;
        yVar.f45967a = tLObject;
        yVar.f45968b = (int) (System.currentTimeMillis() / 1000);
        String str = this.I;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.f45996o0).getStorageQueue().postRunnable(new n((cn0) this, j10, 1));
    }

    public final boolean S() {
        int i10 = this.f45983d0;
        return (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 11 || i10 == 15) ? false : true;
    }

    public final void T() {
        int iL;
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && (iL = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(iL + 1, size);
            int size2 = this.f45987f0.f45839e.size();
            if (this.C0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(iL);
            }
        }
    }

    public final void U(int i10, String str) {
        String str2;
        if (str != null && str.equals(this.I) && (i10 == this.f46011y0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.I = str;
        this.f46011y0 = i10;
        if (this.f45986f != null) {
            Utilities.searchQueue.cancelRunnable(this.f45986f);
            this.f45986f = null;
        }
        o oVar = this.h;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
            this.h = null;
        }
        ol0 ol0Var = this.f45999r;
        if (ol0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ol0Var);
            this.f45999r = null;
        }
        if (this.f45994n >= 0) {
            ConnectionsManager.getInstance(this.f45996o0).cancelRequest(this.f45994n, true);
            this.f45994n = -1;
        }
        String strTrim = str != null ? str.trim() : null;
        G(strTrim);
        if (!TextUtils.equals(this.N, strTrim)) {
            this.N = strTrim;
            this.G.clear();
            if (this.O != 0) {
                ConnectionsManager.getInstance(this.f45996o0).cancelRequest(this.O, true);
                this.O = 0;
            }
            if (strTrim == null || strTrim.length() < 4 || (UserConfig.getInstance(this.f45996o0).isPremium() && MessagesController.getInstance(this.f45996o0).isSponsoredDisabled())) {
                this.N = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.N = strTrim;
                tL_contacts_getSponsoredPeers.f22425q = strTrim;
                this.O = ConnectionsManager.getInstance(this.f45996o0).sendRequest(tL_contacts_getSponsoredPeers, new cf.a(this, 21));
            }
        }
        if (TextUtils.isEmpty(strTrim)) {
            this.f46002s0 = null;
            this.f45987f0.f45852s = false;
            this.f46001s.clear();
            this.C.clear();
            this.F.clear();
            this.v = 0;
            this.f46006w = 0;
            this.f46010y = null;
            this.f46008x.clear();
            this.f45987f0.f(null, null);
            int i11 = this.f45983d0;
            if (i11 != 15) {
                s sVar = this.f45987f0;
                boolean z10 = i11 != 11;
                boolean z11 = i11 != 11;
                boolean z12 = i11 == 2 || i11 == 11;
                boolean z13 = i11 == 0;
                rx rxVar = this.Q;
                sVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, rxVar != null ? rxVar.a() : 0L, null);
            }
            this.J = false;
            this.Z = 0;
            this.f46012z0 = 0;
            this.C0 = true;
            this.D0 = true;
            rx rxVar2 = this.Q;
            if (rxVar2 != null) {
                rxVar2.d(false, true);
            }
            if (this.f45983d0 != 15) {
                X(null);
                W(0, null);
                V(0, null);
            }
            l();
            this.f46004u0.clear();
            this.f46005v0 = false;
            z00 z00Var = this.f46007w0;
            if (z00Var != null) {
                ((mv) z00Var).i(false, null, this.f46004u0, false);
                return;
            }
            return;
        }
        this.f45987f0.f(this.f46001s, this.f46000r0);
        this.v = 0;
        this.f46006w = 0;
        this.f46010y = null;
        this.f46008x.clear();
        if (this.R != 2 && strTrim.startsWith("#") && strTrim.length() == 1) {
            this.S = true;
            s sVar2 = this.f45987f0;
            if (sVar2.f45852s) {
                this.E.clear();
                this.F.clear();
                ArrayList arrayList = this.f45987f0.f45850q;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.F.add(((h1) arrayList.get(i12)).f45821a);
                }
                this.C0 = true;
                this.D0 = true;
                this.f46012z0 = 0;
                l();
                rx rxVar3 = this.Q;
                if (rxVar3 != null) {
                    rxVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(sVar2.f45846m).getStorageQueue().postRunnable(new g1(sVar2, 1));
            }
        } else {
            this.F.clear();
        }
        int i13 = this.Z + 1;
        this.Z = i13;
        this.f46012z0 = 3;
        this.C0 = true;
        this.D0 = true;
        l();
        rx rxVar4 = this.Q;
        if (rxVar4 != null) {
            rxVar4.d(true, false);
        }
        if (strTrim != null) {
            String strTrim2 = strTrim.trim();
            if (strTrim2.length() <= 1 || !(strTrim2.charAt(0) == '#' || strTrim2.charAt(0) == '$')) {
                str2 = null;
            } else {
                int iIndexOf = strTrim2.indexOf(64);
                String strSubstring = strTrim2.substring(1);
                if (iIndexOf >= 0) {
                    strTrim2.substring(iIndexOf + 1);
                }
                str2 = strSubstring;
            }
        } else {
            str2 = null;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        o oVar2 = new o(this, strTrim, i13, str, 2);
        this.f45986f = oVar2;
        dispatchQueue.postRunnable(oVar2, 300L);
        if (str2 != null) {
            this.f46012z0++;
            ol0 ol0Var2 = new ol0(this, i13, str2, 12);
            this.f45999r = ol0Var2;
            AndroidUtilities.runOnUIThread(ol0Var2, 300L);
        }
    }

    public final void V(int i10, String str) {
        rx rxVar = this.Q;
        if (rxVar == null || rxVar.a() == 0 || this.R == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.V) && TextUtils.isEmpty(str)) {
            return;
        }
        int i11 = this.M;
        int i12 = this.f45996o0;
        if (i11 != 0) {
            ConnectionsManager.getInstance(i12).cancelRequest(this.M, true);
            this.M = 0;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.D;
        if (zIsEmpty) {
            this.f46002s0 = null;
            this.E.clear();
            arrayList.clear();
            this.P = 0;
            this.V = null;
            this.J = false;
            l();
            return;
        }
        if (this.f45983d0 == 15) {
            return;
        }
        long jA = this.Q.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.f22489q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(jA);
        if (str.equals(this.V) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.V = str;
        int i13 = 1 + this.P;
        this.P = i13;
        this.M = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new u2(this, str, i13, i10, tL_messages_search, 1), 2);
    }

    public final void W(int i10, String str) {
        if (this.R != 0 && (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str))) {
            int i11 = this.K;
            int i12 = this.f45996o0;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.K, true);
                this.K = 0;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.E;
            if (zIsEmpty || this.Q.a() != 0) {
                this.f46002s0 = null;
                arrayList.clear();
                this.D.clear();
                this.L = 0;
                this.V = null;
                this.W = 0;
                this.J = false;
                l();
                return;
            }
            G(str);
            this.f45987f0.f(this.f46001s, this.f46000r0);
            if (this.f45983d0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i13 = this.f45981c.f45958a;
                tL_messages_searchGlobal.broadcasts_only = (i13 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i13 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i13 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.f22491q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.f46011y0;
                if (!str.equals(this.V)) {
                    this.d = false;
                }
                if (str.equals(this.V) && this.W == this.f45981c.f45958a && !arrayList.isEmpty() && this.f45982c0 == this.Z) {
                    MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.Y;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.V = str;
                this.W = this.f45981c.f45958a;
                int i14 = this.L + 1;
                this.L = i14;
                this.K = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new u2(this, str, i14, i10, tL_messages_searchGlobal, 2), 2);
                return;
            }
            int i15 = this.f46012z0 - 1;
            this.f46012z0 = i15;
            rx rxVar = this.Q;
            if (rxVar != null) {
                rxVar.d(i15 > 0, true);
                this.Q.c();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.B;
        arrayList.clear();
        rx rxVar = this.Q;
        if (rxVar == null || rxVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f45996o0).getTopicsController().getTopics(-this.Q.a());
            String strTrim = str.trim();
            for (int i10 = 0; i10 < topics.size(); i10++) {
                if (topics.get(i10) != null && topics.get(i10).title.toLowerCase().contains(strTrim)) {
                    arrayList.add(topics.get(i10));
                    topics.get(i10).searchQuery = strTrim;
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        if (this.f46012z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f46008x;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.J) {
                return size;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.f46001s.size();
        s sVar = this.f45987f0;
        int size3 = sVar.d.size();
        int i10 = size + size2 + size3;
        int size4 = sVar.f45839e.size();
        if (size4 > 3 && this.C0) {
            size4 = 3;
        }
        int size5 = this.G.size() + size4;
        int size6 = sVar.f45843j.size();
        if (size6 > 3 && this.D0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i10++;
        }
        if (size5 != 0) {
            i10 += size5 + 1;
        }
        if (size6 != 0) {
            i10 += size6;
        }
        ArrayList arrayList5 = this.D;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i10 += size7 + 1 + (!this.T ? 1 : 0);
        }
        if (!this.T) {
            this.U = i10;
        }
        ArrayList arrayList6 = this.E;
        int size8 = arrayList6.size();
        if ((this.f45981c != w.All || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i11 = (arrayList5.isEmpty() || this.T) ? size8 : 0;
        if (i11 != 0) {
            i10 += i11 + 1 + (!this.S ? 1 : 0);
        }
        if (this.T) {
            this.U = i10;
        }
        this.f46009x0 = i10;
        return i10;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: pf.z.j(int):int");
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList<TLRPC.TL_username> arrayList;
        String publicUsername;
        boolean z10;
        CharSequence charSequence;
        ?? spannableStringBuilder;
        CharSequence charSequence2;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        ?? r10;
        ?? Concat;
        boolean z11;
        ?? string;
        int i11;
        ?? Concat2;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer2;
        Object obj;
        boolean z12;
        String strSubstring;
        String strI;
        String str;
        String str2;
        int iIndexOfIgnoreCase;
        long peerDialogId;
        TLRPC.Chat chat2;
        String publicUsername2;
        int iK;
        int i12;
        String string2;
        SpannableStringBuilder spannableStringBuilder2;
        Runnable runnable;
        boolean z13;
        final int i13;
        char c10;
        String strI2;
        int iE = i10;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ArrayList arrayList2 = this.D;
        ArrayList arrayList3 = this.F;
        ArrayList arrayList4 = this.G;
        ArrayList arrayList5 = this.f46008x;
        ArrayList arrayList6 = this.B;
        s sVar = this.f45987f0;
        int i15 = this.f45996o0;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                ?? r11 = (e6) view;
                r11.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                long dialogId = r11.getDialogId();
                boolean zO = O(iE);
                Object objJ = J(iE);
                boolean z15 = objJ instanceof TLRPC.TL_sponsoredPeer;
                if (z15) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer3 = (TLRPC.TL_sponsoredPeer) objJ;
                    HashSet hashSet = this.H;
                    Iterator it = hashSet.iterator();
                    do {
                        if (!it.hasNext()) {
                            hashSet.add(tL_sponsoredPeer3.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer3.random_id;
                            ConnectionsManager.getInstance(i15).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                        peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer3.peer);
                        if (peerDialogId >= 0) {
                            user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                ArrayList<TLRPC.TL_username> arrayList7 = user.usernames;
                                publicUsername2 = DialogObject.getPublicUsername(user, this.X);
                                arrayList = arrayList7;
                                chat = null;
                            } else {
                                chat = null;
                                arrayList = null;
                                publicUsername2 = null;
                            }
                        } else {
                            chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                            if (chat2 != null) {
                                ArrayList<TLRPC.TL_username> arrayList8 = chat2.usernames;
                                publicUsername2 = DialogObject.getPublicUsername(chat2, this.X);
                                arrayList = arrayList8;
                                chat = chat2;
                                user = null;
                            } else {
                                chat = chat2;
                                user = null;
                                arrayList = null;
                                publicUsername2 = null;
                            }
                        }
                        publicUsername = publicUsername2;
                        objJ = objJ;
                        encryptedChat = null;
                    } while (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer3.random_id));
                    peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer3.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = user.usernames;
                            publicUsername2 = DialogObject.getPublicUsername(user, this.X);
                            arrayList = arrayList9;
                            chat = null;
                        } else {
                            chat = null;
                            arrayList = null;
                            publicUsername2 = null;
                        }
                    } else {
                        chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                        if (chat2 != null) {
                            ArrayList<TLRPC.TL_username> arrayList10 = chat2.usernames;
                            publicUsername2 = DialogObject.getPublicUsername(chat2, this.X);
                            arrayList = arrayList10;
                            chat = chat2;
                            user = null;
                        } else {
                            chat = chat2;
                            user = null;
                            arrayList = null;
                            publicUsername2 = null;
                        }
                    }
                    publicUsername = publicUsername2;
                    objJ = objJ;
                    encryptedChat = null;
                } else if (objJ instanceof TLRPC.User) {
                    user = (TLRPC.User) objJ;
                    ArrayList<TLRPC.TL_username> arrayList11 = user.usernames;
                    objJ = objJ;
                    encryptedChat = null;
                    publicUsername = DialogObject.getPublicUsername(user, this.X);
                    arrayList = arrayList11;
                    chat = null;
                } else if (objJ instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) objJ;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i15).getChat(Long.valueOf(chat3.f22380id));
                    if (chat4 == null) {
                        chat4 = chat3;
                    }
                    ArrayList<TLRPC.TL_username> arrayList12 = chat4.usernames;
                    objJ = objJ;
                    publicUsername = DialogObject.getPublicUsername(chat4, this.X);
                    encryptedChat = null;
                    arrayList = arrayList12;
                    chat = chat4;
                    user = null;
                } else {
                    if (objJ instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat2 = MessagesController.getInstance(i15).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) objJ).f22388id));
                        encryptedChat = encryptedChat2;
                        user = MessagesController.getInstance(i15).getUser(Long.valueOf(encryptedChat2.user_id));
                    } else {
                        encryptedChat = null;
                        user = null;
                    }
                    chat = null;
                    arrayList = null;
                    publicUsername = null;
                }
                if (!arrayList5.isEmpty()) {
                    iE = pa.e(1, iE, arrayList5);
                }
                if (P()) {
                    if (iE < K()) {
                        r11.I = iE != K() + (-1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iE -= K();
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    iE = pa.e(1, iE, arrayList6);
                }
                ArrayList arrayList13 = sVar.f45839e;
                ArrayList arrayList14 = sVar.f45843j;
                int i17 = iE;
                int size = this.f46001s.size();
                int size2 = sVar.d.size();
                int i18 = (size + size2 <= 0 || (K() <= 0 && arrayList6.isEmpty() && arrayList5.isEmpty())) ? i17 : i17 - 1;
                int size3 = arrayList14.size();
                if (size3 > 3 && this.D0) {
                    size3 = 3;
                }
                int i19 = (size3 <= 0 || !(arrayList14.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                int size4 = arrayList13.size();
                if (size4 > 3 && this.C0) {
                    size4 = 3;
                }
                int size5 = (arrayList13.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList4.size() + size4 + 1;
                if (!z10) {
                    r11.I = (i18 == (h() - K()) + (-1) || i18 == ((size + i19) + size2) + (-1) || i18 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                }
                if (i18 >= 0 && i18 < this.f46001s.size() && user == null) {
                    charSequence = (CharSequence) this.C.get(i18);
                    String publicUsername3 = UserObject.getPublicUsername(user);
                    if (charSequence == null || user == null || publicUsername3 == null || !charSequence.toString().startsWith("@".concat(publicUsername3))) {
                        spannableStringBuilder = charSequence;
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        charSequence2 = charSequence;
                        tL_sponsoredPeer = null;
                        r10 = spannableStringBuilder;
                    } else {
                        if (z10) {
                            strSubstring = this.f46002s0;
                        } else {
                            strSubstring = sVar.f45838c;
                        }
                        if (TextUtils.isEmpty(strSubstring)) {
                            charSequence2 = charSequence;
                        } else {
                            if (user != null) {
                                strI = ContactsController.formatName(user.first_name, user.last_name);
                            } else if (chat != null) {
                                strI = null;
                            } else if (chat.monoforum) {
                                strI = wf.c.i(chat, i15, false);
                            } else {
                                strI = chat.title;
                            }
                            if (strI != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(strI, strSubstring)) != -1) {
                                spannableStringBuilder = new SpannableStringBuilder(strI);
                                spannableStringBuilder.setSpan(new s00(g6.q6, null), iIndexOfIgnoreCase, strSubstring.length() + iIndexOfIgnoreCase, 33);
                            }
                            if (arrayList != null || arrayList.size() <= 1) {
                                charSequence2 = charSequence;
                            } else {
                                String strSubstring2 = strSubstring.startsWith("@") ? strSubstring.substring(1) : strSubstring;
                                int size6 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size6) {
                                        TLRPC.TL_username tL_username = arrayList.get(i20);
                                        i20++;
                                        TLRPC.TL_username tL_username2 = tL_username;
                                        charSequence2 = charSequence;
                                        if (tL_username2.active && tL_username2.username.startsWith(strSubstring2)) {
                                            str = tL_username2.username;
                                        } else {
                                            charSequence = charSequence2;
                                        }
                                    } else {
                                        charSequence2 = charSequence;
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    int size7 = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < size7) {
                                            TLRPC.TL_username tL_username3 = arrayList.get(i21);
                                            i21++;
                                            TLRPC.TL_username tL_username4 = tL_username3;
                                            String str3 = str;
                                            if (tL_username4.active && tL_username4.username.contains(strSubstring2)) {
                                                str2 = tL_username4.username;
                                            } else {
                                                str = str3;
                                            }
                                        } else {
                                            str2 = str;
                                        }
                                    }
                                } else {
                                    str2 = str;
                                }
                                if (str2 != null) {
                                    publicUsername = str2;
                                }
                            }
                            if (publicUsername == null && (user == null || zO)) {
                                if (strSubstring.startsWith("@")) {
                                    strSubstring = strSubstring.substring(1);
                                }
                                try {
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                    spannableStringBuilder3.append((CharSequence) "@");
                                    spannableStringBuilder3.append((CharSequence) publicUsername);
                                    int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                                    if (iIndexOfIgnoreCase2 != -1) {
                                        int length = strSubstring.length();
                                        if (iIndexOfIgnoreCase2 == 0) {
                                            length++;
                                        } else {
                                            iIndexOfIgnoreCase2++;
                                        }
                                        tL_sponsoredPeer = null;
                                        try {
                                            spannableStringBuilder3.setSpan(new s00(g6.q6, null), iIndexOfIgnoreCase2, length + iIndexOfIgnoreCase2, 33);
                                        } catch (Exception e9) {
                                            e = e9;
                                            FileLog.e(e);
                                            charSequence2 = publicUsername;
                                            r10 = spannableStringBuilder;
                                        }
                                    } else {
                                        tL_sponsoredPeer = null;
                                    }
                                    charSequence2 = spannableStringBuilder3;
                                    r10 = spannableStringBuilder;
                                } catch (Exception e10) {
                                    e = e10;
                                    tL_sponsoredPeer = null;
                                }
                                break;
                            }
                        }
                        tL_sponsoredPeer = null;
                        r10 = spannableStringBuilder;
                    }
                    r11.t(false, false);
                    if (user == null && user.f22527id == this.f45989h0 && this.f45983d0 != 16) {
                        Concat = tL_sponsoredPeer;
                        z11 = true;
                        string = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        Concat = charSequence2;
                        z11 = false;
                        string = r10;
                    }
                    if (chat != null || chat.participants_count == 0) {
                        if (user == null && user.bot && (i11 = user.bot_active_users) != 0) {
                            String pluralStringSpaced = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                            if (Concat instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) Concat).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced);
                            } else {
                                Concat2 = !TextUtils.isEmpty(Concat) ? TextUtils.concat(new CharSequence[]{Concat, ", ", pluralStringSpaced}) : pluralStringSpaced;
                            }
                        }
                        n6 n6Var = new n6(this, 11);
                        r11.f24296x0 = z10;
                        r11.f24298y0 = n6Var;
                        r11.setOnSponsoredOptionsClick(new a8(this, 14));
                        if (z15) {
                            tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) objJ;
                        } else {
                            tL_sponsoredPeer2 = tL_sponsoredPeer;
                        }
                        r11.setAd(tL_sponsoredPeer2);
                        if (user != null) {
                            obj = user;
                        } else {
                            obj = chat;
                        }
                        r11.u(obj, encryptedChat, string, Concat2, true, z11);
                        boolean zContains = this.Q.f42355a.E2.contains(Long.valueOf(r11.getDialogId()));
                        if (dialogId == r11.getDialogId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        r11.t(zContains, z12);
                        break;
                    } else {
                        String pluralStringSpaced2 = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                        if (Concat instanceof SpannableStringBuilder) {
                            ((SpannableStringBuilder) Concat).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced2);
                        } else {
                            Concat = !TextUtils.isEmpty(Concat) ? TextUtils.concat(new CharSequence[]{Concat, ", ", pluralStringSpaced2}) : pluralStringSpaced2;
                        }
                    }
                    Concat2 = Concat;
                    n6 n6Var2 = new n6(this, 11);
                    r11.f24296x0 = z10;
                    r11.f24298y0 = n6Var2;
                    r11.setOnSponsoredOptionsClick(new a8(this, 14));
                    if (z15) {
                        tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) objJ;
                    } else {
                        tL_sponsoredPeer2 = tL_sponsoredPeer;
                    }
                    r11.setAd(tL_sponsoredPeer2);
                    if (user != null) {
                        obj = user;
                    } else {
                        obj = chat;
                    }
                    r11.u(obj, encryptedChat, string, Concat2, true, z11);
                    boolean zContains2 = this.Q.f42355a.E2.contains(Long.valueOf(r11.getDialogId()));
                    if (dialogId == r11.getDialogId()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    r11.t(zContains2, z12);
                } else {
                    charSequence = null;
                }
                spannableStringBuilder = 0;
                if (charSequence != null) {
                    charSequence2 = charSequence;
                    tL_sponsoredPeer = null;
                    r10 = spannableStringBuilder;
                } else {
                    if (z10) {
                        strSubstring = this.f46002s0;
                    } else {
                        strSubstring = sVar.f45838c;
                    }
                    if (TextUtils.isEmpty(strSubstring)) {
                        if (user != null) {
                            strI = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (chat != null) {
                            strI = null;
                        } else if (chat.monoforum) {
                            strI = wf.c.i(chat, i15, false);
                        } else {
                            strI = chat.title;
                        }
                        if (strI != null) {
                            spannableStringBuilder = new SpannableStringBuilder(strI);
                            spannableStringBuilder.setSpan(new s00(g6.q6, null), iIndexOfIgnoreCase, strSubstring.length() + iIndexOfIgnoreCase, 33);
                        }
                        if (arrayList != null) {
                            charSequence2 = charSequence;
                        } else {
                            charSequence2 = charSequence;
                        }
                        if (publicUsername == null) {
                        }
                    } else {
                        charSequence2 = charSequence;
                    }
                    tL_sponsoredPeer = null;
                    r10 = spannableStringBuilder;
                }
                r11.t(false, false);
                if (user == null) {
                    Concat = charSequence2;
                    z11 = false;
                    string = r10;
                } else {
                    Concat = charSequence2;
                    z11 = false;
                    string = r10;
                }
                if (chat != null) {
                    if (user == null) {
                        Concat2 = Concat;
                    } else {
                        Concat2 = Concat;
                    }
                } else if (user == null) {
                    Concat2 = Concat;
                } else {
                    Concat2 = Concat;
                }
                n6 n6Var3 = new n6(this, 11);
                r11.f24296x0 = z10;
                r11.f24298y0 = n6Var3;
                r11.setOnSponsoredOptionsClick(new a8(this, 14));
                if (z15) {
                    tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) objJ;
                } else {
                    tL_sponsoredPeer2 = tL_sponsoredPeer;
                }
                r11.setAd(tL_sponsoredPeer2);
                if (user != null) {
                    obj = user;
                } else {
                    obj = chat;
                }
                r11.u(obj, encryptedChat, string, Concat2, true, z11);
                boolean zContains3 = this.Q.f42355a.E2.contains(Long.valueOf(r11.getDialogId()));
                if (dialogId == r11.getDialogId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r11.t(zContains3, z12);
                break;
            case 1:
                final s3 s3Var = (s3) view;
                if (!arrayList3.isEmpty()) {
                    String string3 = LocaleController.getString(R.string.Hashtags);
                    String string4 = LocaleController.getString(R.string.ClearButton);
                    final int i22 = z14 ? 1 : 0;
                    s3Var.c(string3, string4, new View.OnClickListener(this) {

                        public final z f45865b;

                        {
                            this.f45865b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i22) {
                                case 0:
                                    rx rxVar = this.f45865b.Q;
                                    if (rxVar != null) {
                                        rxVar.b();
                                    }
                                    break;
                                case 1:
                                    px pxVar = ((cn0) this.f45865b).G0;
                                    an0 an0Var = pxVar.f29758r0;
                                    cn0 cn0Var = pxVar.U;
                                    String str4 = cn0Var.f46010y;
                                    ArrayList arrayList15 = cn0Var.f46008x;
                                    int i23 = cn0Var.f46006w;
                                    int i24 = cn0Var.v;
                                    ArrayList arrayList16 = an0Var.K;
                                    if (!TextUtils.equals(str4, an0Var.U)) {
                                        an0Var.V();
                                        arrayList16.clear();
                                        arrayList16.addAll(arrayList15);
                                        an0Var.S = i24;
                                        an0Var.R = i24 > arrayList15.size();
                                        an0Var.V = i23;
                                        an0Var.U = str4;
                                        an0Var.N(true);
                                    }
                                    pxVar.m0 = true;
                                    pxVar.f29756p0.h1(0, 0);
                                    pxVar.R();
                                    e71 e71Var = pxVar.I;
                                    if (e71Var != null && e71Var.getCurrentTabId() != 1) {
                                        pxVar.I.d(1, 1);
                                    }
                                    an0Var.Y(pxVar.G0);
                                    break;
                                case 2:
                                    rx rxVar2 = this.f45865b.Q;
                                    if (rxVar2 != null) {
                                        rxVar2.b();
                                    }
                                    break;
                                default:
                                    rx rxVar3 = this.f45865b.Q;
                                    if (rxVar3 != null) {
                                        rxVar3.b();
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    if (arrayList5.isEmpty()) {
                        iK = iE;
                    } else if (iE == 0) {
                        s3Var.c(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) {

                            public final z f45865b;

                            {
                                this.f45865b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        rx rxVar = this.f45865b.Q;
                                        if (rxVar != null) {
                                            rxVar.b();
                                        }
                                        break;
                                    case 1:
                                        px pxVar = ((cn0) this.f45865b).G0;
                                        an0 an0Var = pxVar.f29758r0;
                                        cn0 cn0Var = pxVar.U;
                                        String str4 = cn0Var.f46010y;
                                        ArrayList arrayList15 = cn0Var.f46008x;
                                        int i23 = cn0Var.f46006w;
                                        int i24 = cn0Var.v;
                                        ArrayList arrayList16 = an0Var.K;
                                        if (!TextUtils.equals(str4, an0Var.U)) {
                                            an0Var.V();
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList15);
                                            an0Var.S = i24;
                                            an0Var.R = i24 > arrayList15.size();
                                            an0Var.V = i23;
                                            an0Var.U = str4;
                                            an0Var.N(true);
                                        }
                                        pxVar.m0 = true;
                                        pxVar.f29756p0.h1(0, 0);
                                        pxVar.R();
                                        e71 e71Var = pxVar.I;
                                        if (e71Var != null && e71Var.getCurrentTabId() != 1) {
                                            pxVar.I.d(1, 1);
                                        }
                                        an0Var.Y(pxVar.G0);
                                        break;
                                    case 2:
                                        rx rxVar2 = this.f45865b.Q;
                                        if (rxVar2 != null) {
                                            rxVar2.b();
                                        }
                                        break;
                                    default:
                                        rx rxVar3 = this.f45865b.Q;
                                        if (rxVar3 != null) {
                                            rxVar3.b();
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        iK = pa.e(1, iE, arrayList5);
                    }
                    ArrayList arrayList15 = sVar.f45839e;
                    ArrayList arrayList16 = sVar.f45843j;
                    boolean zP = P();
                    ArrayList arrayList17 = this.A;
                    if (zP || !arrayList6.isEmpty() || !arrayList17.isEmpty() || !arrayList5.isEmpty()) {
                        ?? M = M();
                        if (iK < M) {
                            s3Var.setText(LocaleController.getString(R.string.ChatHints));
                        } else if (iK == M && P()) {
                            if (!this.J) {
                                final int i23 = 2;
                                s3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) {

                                    public final z f45865b;

                                    {
                                        this.f45865b = this;
                                    }

                                    @Override
                                    public final void onClick(View view2) {
                                        switch (i23) {
                                            case 0:
                                                rx rxVar = this.f45865b.Q;
                                                if (rxVar != null) {
                                                    rxVar.b();
                                                }
                                                break;
                                            case 1:
                                                px pxVar = ((cn0) this.f45865b).G0;
                                                an0 an0Var = pxVar.f29758r0;
                                                cn0 cn0Var = pxVar.U;
                                                String str4 = cn0Var.f46010y;
                                                ArrayList arrayList18 = cn0Var.f46008x;
                                                int i24 = cn0Var.f46006w;
                                                int i25 = cn0Var.v;
                                                ArrayList arrayList19 = an0Var.K;
                                                if (!TextUtils.equals(str4, an0Var.U)) {
                                                    an0Var.V();
                                                    arrayList19.clear();
                                                    arrayList19.addAll(arrayList18);
                                                    an0Var.S = i25;
                                                    an0Var.R = i25 > arrayList18.size();
                                                    an0Var.V = i24;
                                                    an0Var.U = str4;
                                                    an0Var.N(true);
                                                }
                                                pxVar.m0 = true;
                                                pxVar.f29756p0.h1(0, 0);
                                                pxVar.R();
                                                e71 e71Var = pxVar.I;
                                                if (e71Var != null && e71Var.getCurrentTabId() != 1) {
                                                    pxVar.I.d(1, 1);
                                                }
                                                an0Var.Y(pxVar.G0);
                                                break;
                                            case 2:
                                                rx rxVar2 = this.f45865b.Q;
                                                if (rxVar2 != null) {
                                                    rxVar2.b();
                                                }
                                                break;
                                            default:
                                                rx rxVar3 = this.f45865b.Q;
                                                if (rxVar3 != null) {
                                                    rxVar3.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i24 = 3;
                                s3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) {

                                    public final z f45865b;

                                    {
                                        this.f45865b = this;
                                    }

                                    @Override
                                    public final void onClick(View view2) {
                                        switch (i24) {
                                            case 0:
                                                rx rxVar = this.f45865b.Q;
                                                if (rxVar != null) {
                                                    rxVar.b();
                                                }
                                                break;
                                            case 1:
                                                px pxVar = ((cn0) this.f45865b).G0;
                                                an0 an0Var = pxVar.f29758r0;
                                                cn0 cn0Var = pxVar.U;
                                                String str4 = cn0Var.f46010y;
                                                ArrayList arrayList18 = cn0Var.f46008x;
                                                int i25 = cn0Var.f46006w;
                                                int i26 = cn0Var.v;
                                                ArrayList arrayList19 = an0Var.K;
                                                if (!TextUtils.equals(str4, an0Var.U)) {
                                                    an0Var.V();
                                                    arrayList19.clear();
                                                    arrayList19.addAll(arrayList18);
                                                    an0Var.S = i26;
                                                    an0Var.R = i26 > arrayList18.size();
                                                    an0Var.V = i25;
                                                    an0Var.U = str4;
                                                    an0Var.N(true);
                                                }
                                                pxVar.m0 = true;
                                                pxVar.f29756p0.h1(0, 0);
                                                pxVar.R();
                                                e71 e71Var = pxVar.I;
                                                if (e71Var != null && e71Var.getCurrentTabId() != 1) {
                                                    pxVar.I.d(1, 1);
                                                }
                                                an0Var.Y(pxVar.G0);
                                                break;
                                            case 2:
                                                rx rxVar2 = this.f45865b.Q;
                                                if (rxVar2 != null) {
                                                    rxVar2.b();
                                                }
                                                break;
                                            default:
                                                rx rxVar3 = this.f45865b.Q;
                                                if (rxVar3 != null) {
                                                    rxVar3.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (iK == K() + (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) + (arrayList17.isEmpty() ? 0 : arrayList17.size() + 1) && !this.f46001s.isEmpty()) {
                            s3Var.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                        } else {
                            iK -= K();
                        }
                    }
                    int size8 = this.f46001s.size();
                    int size9 = sVar.d.size();
                    int size10 = arrayList16.size();
                    if (size10 > 3 && this.D0) {
                        size10 = 3;
                    }
                    int size11 = arrayList15.size();
                    if (size11 > 3 && this.C0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList15.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList4.size() + size11 + 1;
                    int size13 = arrayList2.isEmpty() ? 0 : arrayList2.size() + 1;
                    ArrayList arrayList18 = this.E;
                    if (!arrayList18.isEmpty()) {
                        arrayList18.size();
                    }
                    int i25 = size13;
                    if (this.f45981c != w.All || this.d) {
                        arrayList18.isEmpty();
                    }
                    if (arrayList6.isEmpty()) {
                        i12 = 1;
                        string2 = null;
                    } else {
                        string2 = iK == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i12 = 1;
                        iK = pa.e(1, iK, arrayList6);
                    }
                    if (!arrayList17.isEmpty()) {
                        if (iK == 0) {
                            string2 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        iK = pa.e(i12, iK, arrayList17);
                    }
                    if (string2 != null) {
                        spannableStringBuilder2 = null;
                        runnable = null;
                        z13 = false;
                    } else {
                        int i26 = iK - (size8 + size9);
                        if (i26 < 0 || i26 >= size10) {
                            int i27 = i26 - size10;
                            if (i27 < 0 || i27 >= size12) {
                                if (this.Q == null || i25 <= 0) {
                                    i13 = 1;
                                } else {
                                    i13 = 1;
                                    if (i27 - size12 <= 1) {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(i15).getChat(Long.valueOf(-this.Q.a()));
                                        int i28 = R.string.SearchMessagesIn;
                                        if (chat5 == null) {
                                            strI2 = "null";
                                            c10 = 0;
                                        } else {
                                            c10 = 0;
                                            strI2 = chat5.monoforum ? wf.c.i(chat5, i15, false) : chat5.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = strI2;
                                        string2 = LocaleController.formatString(i28, objArr);
                                    }
                                    z13 = false;
                                }
                                this.B0 = i27;
                                SpannableStringBuilder spannableStringBuilderH = H(this.f45981c);
                                Runnable runnable2 = new Runnable(this) {

                                    public final z f45877b;

                                    {
                                        this.f45877b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                z zVar = this.f45877b;
                                                boolean z16 = zVar.D0;
                                                zVar.D0 = !z16;
                                                s3Var.setRightText(LocaleController.getString(!z16 ? R.string.ShowMore : R.string.ShowLess));
                                                zVar.l();
                                                break;
                                            default:
                                                z zVar2 = this.f45877b;
                                                gy gyVar = zVar2.f45995n0;
                                                s3 s3Var2 = s3Var;
                                                b70 b70VarH = b70.H(gyVar, s3Var2);
                                                for (w wVar : w.values()) {
                                                    boolean z17 = wVar.f45958a == zVar2.f45981c.f45958a;
                                                    b70VarH.i(new cg.c(zVar2, z17, s3Var2, wVar, 26), LocaleController.getString(wVar.f45959b), z17);
                                                }
                                                b70VarH.V(5);
                                                b70VarH.Y = true;
                                                b70VarH.f26993t = false;
                                                b70VarH.f26992s = 0;
                                                b70VarH.Z();
                                                break;
                                        }
                                    }
                                };
                                string2 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable2;
                                spannableStringBuilder2 = spannableStringBuilderH;
                                z13 = false;
                            } else {
                                String string5 = LocaleController.getString(R.string.GlobalSearch);
                                if (sVar.f45839e.size() > 3) {
                                    z13 = this.C0;
                                    xs xsVar = new xs(this, arrayList15, i10, s3Var, 12);
                                    s3Var = s3Var;
                                    string2 = string5;
                                    runnable = xsVar;
                                    spannableStringBuilder2 = null;
                                } else {
                                    string2 = string5;
                                }
                            }
                            spannableStringBuilder2 = null;
                            runnable = null;
                            z13 = false;
                        } else {
                            string2 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList16.size() > 3) {
                                final int i29 = 0;
                                z13 = this.D0;
                                runnable = new Runnable(this) {

                                    public final z f45877b;

                                    {
                                        this.f45877b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                z zVar = this.f45877b;
                                                boolean z16 = zVar.D0;
                                                zVar.D0 = !z16;
                                                s3Var.setRightText(LocaleController.getString(!z16 ? R.string.ShowMore : R.string.ShowLess));
                                                zVar.l();
                                                break;
                                            default:
                                                z zVar2 = this.f45877b;
                                                gy gyVar = zVar2.f45995n0;
                                                s3 s3Var2 = s3Var;
                                                b70 b70VarH = b70.H(gyVar, s3Var2);
                                                for (w wVar : w.values()) {
                                                    boolean z17 = wVar.f45958a == zVar2.f45981c.f45958a;
                                                    b70VarH.i(new cg.c(zVar2, z17, s3Var2, wVar, 26), LocaleController.getString(wVar.f45959b), z17);
                                                }
                                                b70VarH.V(5);
                                                b70VarH.Y = true;
                                                b70VarH.f26993t = false;
                                                b70VarH.f26992s = 0;
                                                b70VarH.Z();
                                                break;
                                        }
                                    }
                                };
                                spannableStringBuilder2 = null;
                            }
                            spannableStringBuilder2 = null;
                            runnable = null;
                            z13 = false;
                        }
                    }
                    if (runnable == null) {
                        s3Var.setText(string2);
                    } else if (spannableStringBuilder2 == null) {
                        s3Var.c(string2, LocaleController.getString(z13 ? R.string.ShowMore : R.string.ShowLess), new eg.v(5, runnable));
                        s3Var.setRightTextMargin(16);
                    } else {
                        s3Var.c(string2, spannableStringBuilder2, new eg.v(6, runnable));
                        s3Var.setRightTextMargin(6);
                    }
                }
                break;
            case 2:
            case 9:
                p2 p2Var = (p2) view;
                p2Var.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                p2Var.f24907o2 = iE != h() - 1;
                MessageObject messageObject = (MessageObject) J(iE);
                p2Var.K = arrayList2.contains(messageObject);
                if (messageObject != null) {
                    p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                } else {
                    p2Var.W(0L, null, 0, false, false);
                }
                break;
            case 3:
                ((la) view).setTopic((TLRPC.TL_forumTopic) J(iE));
                break;
            case 5:
                i4 i4Var = (i4) view;
                i4Var.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                i4Var.setText((CharSequence) arrayList3.get(iE - 1));
                i4Var.setNeedDivider(iE != arrayList3.size());
                break;
            case 6:
                ((t) ((zk0) view).getAdapter()).l();
                break;
            case 7:
                String str4 = (String) J(iE);
                l8 l8Var = (l8) view;
                l8Var.e(-1, g6.f23251o6);
                l8Var.i(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, oe.b.c().b("+" + str4)), false);
                break;
            case 8:
                e6 e6Var = (e6) view;
                ContactsController.Contact contact = (ContactsController.Contact) J(iE);
                e6Var.u(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), y1.k(new StringBuilder("+"), contact.shortPhones.get(0), oe.b.c()), false, false);
                break;
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View s3Var;
        int i11 = this.f45983d0;
        int i12 = 16;
        c6 c6Var = null;
        Context context = this.f45984e;
        switch (i10) {
            case 0:
                e6 e6Var = new e6(context, null);
                e6Var.f24276h0 = i11 == 3;
                view = e6Var;
                s3Var = view;
                break;
            case 1:
                s3Var = new s3(context, null);
                break;
            case 2:
            case 9:
                s3Var = new rt0(2, context, true ? 1 : 0);
                break;
            case 3:
                s3Var = new la(context);
                break;
            case 4:
                h00 h00Var = new h00(context, null);
                h00Var.setViewType(1);
                h00Var.setIsSingleCell(true);
                s3Var = h00Var;
                break;
            case 5:
                i4 i4Var = new i4(context);
                i4Var.setGravity(16);
                i4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                i4Var.setTextSize(1, 17.0f);
                i4Var.setTextColor(g6.w0(null, g6.G6, false));
                s3Var = i4Var;
                break;
            case 6:
                ta1 ta1Var = new ta1(context, 13, c6Var);
                ta1Var.setSelectorDrawableColor(g6.w0(null, g6.f23144i6, false));
                ta1Var.setTag(9);
                ta1Var.setItemAnimator(null);
                ta1Var.setLayoutAnimation(null);
                org.telegram.ui.j jVar = new org.telegram.ui.j(19);
                jVar.j1(0);
                ta1Var.setLayoutManager(jVar);
                ta1Var.setAdapter(new t(this.f45996o0, this.f45984e, null, false, i11 == 3));
                ta1Var.setOnItemClickListener(new ag.p0(this, 18));
                ta1Var.setOnItemLongClickListener(new r(this));
                this.f45988g0 = ta1Var;
                view = ta1Var;
                s3Var = view;
                break;
            case 7:
            default:
                s3Var = new l8(16, context, false);
                break;
            case 8:
                s3Var = new e6(context, null);
                break;
            case 10:
                p pVar = new p(this, true ? 1 : 0);
                v vVar = new v(context);
                vVar.setOrientation(1);
                n9 n9Var = new n9(context);
                n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                vVar.addView(n9Var, z5.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i13 = g6.G6;
                textView.setTextColor(g6.w0(null, i13, false));
                textView.setTypeface(AndroidUtilities.bold());
                rl.i(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                vVar.addView(textView, z5.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                vVar.f45955a = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(g6.w0(null, i13, false));
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                vVar.addView(textView2, z5.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i14 = g6.Oh;
                textView3.setTextColor(g6.w0(null, i14, false));
                int iL1 = g6.l1(0.15f, g6.w0(null, i14, false));
                textView3.setBackground(g6.i0(6, 6, 6, 6, 0, iL1, iL1));
                textView3.setOnClickListener(new c5(pVar, i12));
                vVar.addView(textView3, z5.t(-2, -2, 1, 0, 0, 0, 38));
                this.A0 = vVar;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.V));
                s3Var = vVar;
                break;
        }
        if (i10 == 5) {
            s3Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            s3Var.setLayoutParams(new f2.y0(-1, -2));
        }
        return new lk0(s3Var);
    }
}
