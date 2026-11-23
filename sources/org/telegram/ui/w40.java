package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 implements Runnable {
    public final int f52972a;
    public final x40 f52973b;
    public final String f52974c;

    public w40(x40 x40Var, String str, int i7) {
        this.f52972a = i7;
        this.f52973b = x40Var;
        this.f52974c = str;
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
        switch (this.f52972a) {
            case 0:
                x40 x40Var = this.f52973b;
                String str2 = this.f52974c;
                x40Var.getClass();
                org.telegram.messenger.g0.g3(new w40(x40Var, str2, 1));
                return;
            case 1:
                x40 x40Var2 = this.f52973b;
                String str3 = this.f52974c;
                jg.z1 z1Var = x40Var2.f53602f;
                z40 z40Var = x40Var2.J;
                if (!z40Var.P && !z40Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z1Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                org.telegram.messenger.q5 q5Var = Utilities.f22812g;
                w40 w40Var = new w40(x40Var2, str3, 2);
                x40Var2.h = w40Var;
                q5Var.c(w40Var);
                return;
            default:
                x40 x40Var3 = this.f52973b;
                String str4 = this.f52974c;
                ArrayList arrayList2 = x40Var3.f53604r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.g3(new up(x40Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                boolean z12 = true;
                ?? r62 = 0;
                String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
                T0 = (lowerCase.equals(T0) || T0.isEmpty()) ? null : null;
                if (T0 != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                int i10 = i7 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (T0 != null) {
                    strArr[1] = T0;
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
                        K = org.telegram.messenger.p10.o(user);
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
                    String T02 = org.telegram.messenger.hd.E0().T0(str, z12, r62);
                    if (str.equals(T02)) {
                        T02 = null;
                    }
                    char c11 = r62;
                    for (int i12 = r62; i12 < i10; i12++) {
                        String str5 = strArr[i12];
                        if (!str.startsWith(str5) && !i5.c.B(" ", str5, str) && (T02 == null || (!T02.startsWith(str5) && !i5.c.B(" ", str5, T02)))) {
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
