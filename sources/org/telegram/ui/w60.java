package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w60 implements Runnable {
    public final int f42392a;
    public final x60 f42393b;
    public final String f42394c;

    public w60(x60 x60Var, String str, int i10) {
        this.f42392a = i10;
        this.f42393b = x60Var;
        this.f42394c = str;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c3;
        Object obj;
        switch (this.f42392a) {
            case 0:
                x60 x60Var = this.f42393b;
                String str2 = this.f42394c;
                x60Var.getClass();
                AndroidUtilities.runOnUIThread(new w60(x60Var, str2, 1));
                return;
            case 1:
                x60 x60Var2 = this.f42393b;
                String str3 = this.f42394c;
                uf.k1 k1Var = x60Var2.f42981f;
                z60 z60Var = x60Var2.F;
                if (!z60Var.L && !z60Var.M) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                k1Var.g(str3, true, z4, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                w60 w60Var = new w60(x60Var2, str3, 2);
                x60Var2.h = w60Var;
                dispatchQueue.postRunnable(w60Var);
                return;
            default:
                x60 x60Var3 = this.f42393b;
                String str4 = this.f42394c;
                ArrayList arrayList2 = x60Var3.f42983r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new sq(x60Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                int i11 = 0;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i12 = i10 + 1;
                String[] strArr = new String[i12];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i13 = 0;
                while (i13 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i13);
                    boolean z10 = tLObject instanceof TLRPC.User;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        publicUsername = UserObject.getPublicUsername(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            publicUsername = ChatObject.getPublicUsername(chat);
                        }
                        arrayList = arrayList2;
                        i13++;
                        arrayList2 = arrayList;
                        i11 = 0;
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str);
                    if (str.equals(translitString2)) {
                        translitString2 = null;
                    }
                    char c10 = 0;
                    while (i11 < i12) {
                        String str5 = strArr[i11];
                        if (!str.startsWith(str5) && !org.telegram.messenger.y3.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.y3.w(" ", str5, translitString2)))) {
                            if (publicUsername != null && publicUsername.startsWith(str5)) {
                                c3 = 2;
                            } else {
                                c3 = c10;
                            }
                        } else {
                            c3 = 1;
                        }
                        if (c3 != 0) {
                            arrayList = arrayList2;
                            if (c3 == 1) {
                                if (z10) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                String k10 = yh.k("@", publicUsername);
                                arrayList4.add(AndroidUtilities.generateSearchName(k10, null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i13++;
                            arrayList2 = arrayList;
                            i11 = 0;
                        } else {
                            i11++;
                            arrayList2 = arrayList2;
                            c10 = c3;
                        }
                    }
                    arrayList = arrayList2;
                    i13++;
                    arrayList2 = arrayList;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new sq(x60Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
