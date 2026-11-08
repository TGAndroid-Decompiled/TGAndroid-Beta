package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t40 implements Runnable {
    public final int f49909a;
    public final u40 f49910b;
    public final String f49911c;

    public t40(u40 u40Var, String str, int i7) {
        this.f49909a = i7;
        this.f49910b = u40Var;
        this.f49911c = str;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7;
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        switch (this.f49909a) {
            case 0:
                u40 u40Var = this.f49910b;
                String str2 = this.f49911c;
                u40Var.getClass();
                org.telegram.messenger.g0.h3(new t40(u40Var, str2, 1));
                return;
            case 1:
                u40 u40Var2 = this.f49910b;
                String str3 = this.f49911c;
                jg.z1 z1Var = u40Var2.f50206f;
                w40 w40Var = u40Var2.I;
                if (!w40Var.O && !w40Var.P) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                z1Var.g(str3, true, z9, true, false, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.f21338g;
                t40 t40Var = new t40(u40Var2, str3, 2);
                u40Var2.h = t40Var;
                p5Var.c(t40Var);
                return;
            default:
                u40 u40Var3 = this.f49910b;
                String str4 = this.f49911c;
                ArrayList arrayList2 = u40Var3.f50208r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.h3(new rp(u40Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                boolean z11 = true;
                ?? r62 = 0;
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                    boolean z12 = tLObject instanceof TLRPC.User;
                    if (z12) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.t10.n(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.t3.K(chat, r62);
                        }
                        arrayList = arrayList2;
                        z10 = z11;
                        i11++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    String S02 = org.telegram.messenger.id.E0().S0(str, z11, r62);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c11 = r62;
                    for (int i12 = r62; i12 < i10; i12++) {
                        String str5 = strArr[i12];
                        if (!str.startsWith(str5) && !jg.g.A(" ", str5, str) && (S02 == null || (!S02.startsWith(str5) && !jg.g.A(" ", str5, S02)))) {
                            if (K != null && K.startsWith(str5)) {
                                c11 = 2;
                            }
                            c10 = c11;
                        } else {
                            c10 = 1;
                        }
                        if (c10 != 0) {
                            arrayList = arrayList2;
                            z10 = true;
                            if (c10 == 1) {
                                if (z12) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                arrayList4.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i11++;
                            z11 = z10;
                            arrayList2 = arrayList;
                            r62 = 0;
                        } else {
                            char c12 = c10;
                            z11 = true;
                            arrayList2 = arrayList2;
                            c11 = c12;
                        }
                    }
                    arrayList = arrayList2;
                    z10 = z11;
                    i11++;
                    z11 = z10;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.g0.h3(new rp(u40Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
