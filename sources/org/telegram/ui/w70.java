package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class w70 implements Runnable {
    public final int f39357a;
    public final x70 f39358b;
    public final String f39359c;

    public w70(x70 x70Var, String str, int i10) {
        this.f39357a = i10;
        this.f39358b = x70Var;
        this.f39359c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39357a) {
            case 0:
                Utilities.searchQueue.postRunnable(new w70(this.f39358b, this.f39359c, 1));
                return;
            default:
                x70 x70Var = this.f39358b;
                String str = this.f39359c;
                y70 y70Var = x70Var.f39871b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    y70Var.getClass();
                    AndroidUtilities.runOnUIThread(new rq(y70Var, arrayList, arrayList2, 12));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i11 = i10 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i12 = 0; i12 < y70Var.f40442n.f33223w.size(); i12++) {
                    ContactsController.Contact contact = (ContactsController.Contact) y70Var.f40442n.f33223w.get(i12);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i13 = 0;
                    boolean z4 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str2 = strArr[i13];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.y3.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.y3.w(" ", str2, translitString2)))) {
                                z4 = true;
                            }
                            if (z4) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new rq(y70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
