package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class sr implements Runnable {
    public final int f52060a;
    public final ContactsActivity f52061b;

    public sr(ContactsActivity contactsActivity, int i7) {
        this.f52060a = i7;
        this.f52061b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f52060a) {
            case 0:
                ContactsActivity contactsActivity = this.f52061b;
                te.c cVar = contactsActivity.f42976a;
                if (contactsActivity.f42996r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                vr vrVar = contactsActivity.f42978b;
                float f11 = cVar.f57663f;
                ArrayList arrayList = vrVar.O;
                vrVar.M = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                vr vrVar2 = contactsActivity.f42978b;
                if (contactsActivity.f42996r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                vrVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.lr.h).withEndAction(new sr(contactsActivity, 1));
                contactsActivity.f42986f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f42996r) {
                    cVar.f57662e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f52061b.f42986f0 = null;
                return;
        }
    }
}
