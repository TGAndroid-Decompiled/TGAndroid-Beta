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
public final class x60 implements Runnable {
    public final int f39848a;
    public final y60 f39849b;
    public final String f39850c;

    public x60(y60 y60Var, String str, int i10) {
        this.f39848a = i10;
        this.f39849b = y60Var;
        this.f39850c = str;
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
        switch (this.f39848a) {
            case 0:
                y60 y60Var = this.f39849b;
                String str2 = this.f39850c;
                y60Var.getClass();
                AndroidUtilities.runOnUIThread(new x60(y60Var, str2, 1));
                return;
            case 1:
                y60 y60Var2 = this.f39849b;
                String str3 = this.f39850c;
                tf.j1 j1Var = y60Var2.f40158f;
                a70 a70Var = y60Var2.F;
                if (!a70Var.L && !a70Var.M) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                j1Var.g(str3, true, z4, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                x60 x60Var = new x60(y60Var2, str3, 2);
                y60Var2.h = x60Var;
                dispatchQueue.postRunnable(x60Var);
                return;
            default:
                y60 y60Var3 = this.f39849b;
                String str4 = this.f39850c;
                ArrayList arrayList2 = y60Var3.f40160r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new tq(y60Var3, new ArrayList(), new ArrayList(), 10));
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
                                String e = vh.w2.e("@", publicUsername);
                                arrayList4.add(AndroidUtilities.generateSearchName(e, null, "@" + str5));
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
                AndroidUtilities.runOnUIThread(new tq(y60Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
