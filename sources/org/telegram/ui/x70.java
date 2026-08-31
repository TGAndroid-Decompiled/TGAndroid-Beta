package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class x70 implements Runnable {
    public final int f42989a;
    public final y70 f42990b;
    public final String f42991c;

    public x70(y70 y70Var, String str, int i10) {
        this.f42989a = i10;
        this.f42990b = y70Var;
        this.f42991c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42989a) {
            case 0:
                Utilities.searchQueue.postRunnable(new x70(this.f42990b, this.f42991c, 1));
                return;
            default:
                y70 y70Var = this.f42990b;
                String str = this.f42991c;
                z70 z70Var = y70Var.f43572b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    z70Var.getClass();
                    AndroidUtilities.runOnUIThread(new sq(z70Var, arrayList, arrayList2, 12));
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
                for (int i12 = 0; i12 < z70Var.f43862n.f36140w.size(); i12++) {
                    ContactsController.Contact contact = (ContactsController.Contact) z70Var.f43862n.f36140w.get(i12);
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
                AndroidUtilities.runOnUIThread(new sq(z70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
