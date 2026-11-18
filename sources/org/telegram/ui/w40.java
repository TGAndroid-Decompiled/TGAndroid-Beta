package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 implements Runnable {
    public final int f52932a;
    public final x40 f52933b;
    public final String f52934c;

    public w40(x40 x40Var, String str, int i7) {
        this.f52932a = i7;
        this.f52933b = x40Var;
        this.f52934c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        String str;
        String K;
        ArrayList arrayList;
        boolean z11;
        char c10;
        Object obj;
        switch (this.f52932a) {
            case 0:
                x40 x40Var = this.f52933b;
                String str2 = this.f52934c;
                x40Var.getClass();
                org.telegram.messenger.g0.g3(new w40(x40Var, str2, 1));
                return;
            case 1:
                x40 x40Var2 = this.f52933b;
                String str3 = this.f52934c;
                jg.z1 z1Var = x40Var2.f53606f;
                z40 z40Var = x40Var2.J;
                if (!z40Var.P && !z40Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z1Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                org.telegram.messenger.q5 q5Var = Utilities.f22784g;
                w40 w40Var = new w40(x40Var2, str3, 2);
                x40Var2.h = w40Var;
                q5Var.c(w40Var);
                return;
            default:
                x40 x40Var3 = this.f52933b;
                String str4 = this.f52934c;
                ArrayList arrayList2 = x40Var3.f53608r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.g3(new up(x40Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                boolean z12 = true;
                ?? r62 = 0;
                String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.isEmpty()) ? null : null;
                if (S0 != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                int i10 = i7 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i11);
                    boolean z13 = tLObject instanceof TLRPC.User;
                    if (z13) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.o10.o(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.v3.K(chat, r62);
                        }
                        arrayList = arrayList2;
                        z11 = z12;
                        i11++;
                        z12 = z11;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    String S02 = org.telegram.messenger.gd.E0().S0(str, z12, r62);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c11 = r62;
                    for (int i12 = r62; i12 < i10; i12++) {
                        String str5 = strArr[i12];
                        if (!str.startsWith(str5) && !i5.c.B(" ", str5, str) && (S02 == null || (!S02.startsWith(str5) && !i5.c.B(" ", str5, S02)))) {
                            if (K != null && K.startsWith(str5)) {
                                c11 = 2;
                            }
                            c10 = c11;
                        } else {
                            c10 = 1;
                        }
                        if (c10 != 0) {
                            arrayList = arrayList2;
                            z11 = true;
                            if (c10 == 1) {
                                if (z13) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                arrayList4.add(org.telegram.messenger.g0.r0(p5.c.k("@", K), null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i11++;
                            z12 = z11;
                            arrayList2 = arrayList;
                            r62 = 0;
                        } else {
                            char c12 = c10;
                            z12 = true;
                            arrayList2 = arrayList2;
                            c11 = c12;
                        }
                    }
                    arrayList = arrayList2;
                    z11 = z12;
                    i11++;
                    z12 = z11;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.g0.g3(new up(x40Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
