package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class rr implements Runnable {
    public final int f49563a;
    public final ContactsActivity f49564b;

    public rr(ContactsActivity contactsActivity, int i7) {
        this.f49563a = i7;
        this.f49564b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f49563a) {
            case 0:
                ContactsActivity contactsActivity = this.f49564b;
                te.c cVar = contactsActivity.f41186a;
                if (contactsActivity.f41205r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                ur urVar = contactsActivity.f41188b;
                float f11 = cVar.f55505f;
                ArrayList arrayList = urVar.N;
                urVar.L = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                ur urVar2 = contactsActivity.f41188b;
                if (contactsActivity.f41205r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                urVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new rr(contactsActivity, 1));
                contactsActivity.f41194e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f41205r) {
                    cVar.f55504e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f49564b.f41194e0 = null;
                return;
        }
    }
}
