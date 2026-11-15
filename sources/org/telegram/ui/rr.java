package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class rr implements Runnable {
    public final int f51007a;
    public final ContactsActivity f51008b;

    public rr(ContactsActivity contactsActivity, int i7) {
        this.f51007a = i7;
        this.f51008b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f51007a) {
            case 0:
                ContactsActivity contactsActivity = this.f51008b;
                te.c cVar = contactsActivity.f42532a;
                if (contactsActivity.f42552r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                vr vrVar = contactsActivity.f42534b;
                float f11 = cVar.f57087f;
                ArrayList arrayList = vrVar.O;
                vrVar.M = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                vr vrVar2 = contactsActivity.f42534b;
                if (contactsActivity.f42552r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                vrVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new rr(contactsActivity, 1));
                contactsActivity.f42542f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f42552r) {
                    cVar.f57086e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f51008b.f42542f0 = null;
                return;
        }
    }
}
