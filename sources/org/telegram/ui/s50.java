package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s50 implements Runnable {
    public final int f41377a;
    public final t50 f41378b;
    public final String f41379c;

    public s50(t50 t50Var, String str, int i10) {
        this.f41377a = i10;
        this.f41378b = t50Var;
        this.f41379c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        String str;
        String K;
        ArrayList arrayList;
        boolean z11;
        char c10;
        Object obj;
        switch (this.f41377a) {
            case 0:
                t50 t50Var = this.f41378b;
                String str2 = this.f41379c;
                t50Var.getClass();
                org.telegram.messenger.i0.g3(new s50(t50Var, str2, 1));
                return;
            case 1:
                t50 t50Var2 = this.f41378b;
                String str3 = this.f41379c;
                zf.m1 m1Var = t50Var2.f41731f;
                v50 v50Var = t50Var2.I;
                if (!v50Var.O && !v50Var.P) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                m1Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                org.telegram.messenger.r5 r5Var = Utilities.f14522g;
                s50 s50Var = new s50(t50Var2, str3, 2);
                t50Var2.h = s50Var;
                r5Var.c(s50Var);
                return;
            default:
                t50 t50Var3 = this.f41378b;
                String str4 = this.f41379c;
                ArrayList arrayList2 = t50Var3.f41733r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.i0.g3(new qq(t50Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                boolean z12 = true;
                ?? r62 = 0;
                String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                R0 = (lowerCase.equals(R0) || R0.isEmpty()) ? null : null;
                if (R0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i11 = i10 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (R0 != null) {
                    strArr[1] = R0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i12);
                    boolean z13 = tLObject instanceof TLRPC.User;
                    if (z13) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.h20.n(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.w3.K(chat, r62);
                        }
                        arrayList = arrayList2;
                        z11 = z12;
                        i12++;
                        z12 = z11;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    String R02 = org.telegram.messenger.cd.D0().R0(str, z12, r62);
                    if (str.equals(R02)) {
                        R02 = null;
                    }
                    char c11 = r62;
                    for (int i13 = r62; i13 < i11; i13++) {
                        String str5 = strArr[i13];
                        if (!str.startsWith(str5) && !sc.e.y(" ", str5, str) && (R02 == null || (!R02.startsWith(str5) && !sc.e.y(" ", str5, R02)))) {
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
                                    arrayList4.add(org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.i0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                arrayList4.add(org.telegram.messenger.i0.r0(sc.e.h("@", K), null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i12++;
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
                    i12++;
                    z12 = z11;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.i0.g3(new qq(t50Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
