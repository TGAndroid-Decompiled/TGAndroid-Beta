package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class r70 implements Runnable {
    public final int f43044a;
    public final s70 f43045b;
    public final String f43046c;

    public r70(s70 s70Var, String str, int i10) {
        this.f43044a = i10;
        this.f43045b = s70Var;
        this.f43046c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43044a) {
            case 0:
                Utilities.searchQueue.postRunnable(new r70(this.f43045b, this.f43046c, 1));
                return;
            default:
                s70 s70Var = this.f43045b;
                String str = this.f43046c;
                t70 t70Var = s70Var.f43378b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    t70Var.getClass();
                    AndroidUtilities.runOnUIThread(new nq(t70Var, arrayList, arrayList2, 12));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                    translitString = null;
                }
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
                while (i13 < t70Var.f43694n.v.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) t70Var.f43694n.v.get(i13);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i14 = i11;
                    int i15 = i14;
                    while (true) {
                        if (i14 < i12) {
                            String str2 = strArr[i14];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.vh.u(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.vh.u(" ", str2, translitString2)))) {
                                i15 = 1;
                            }
                            if (i15 != 0) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            } else {
                                i14++;
                            }
                        }
                    }
                    i13++;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new nq(t70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
