package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class sr implements Runnable {
    public final int f49917a;
    public final ContactsActivity f49918b;

    public sr(ContactsActivity contactsActivity, int i7) {
        this.f49917a = i7;
        this.f49918b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f49917a) {
            case 0:
                ContactsActivity contactsActivity = this.f49918b;
                te.c cVar = contactsActivity.f41177a;
                if (contactsActivity.f41196r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                vr vrVar = contactsActivity.f41179b;
                float f11 = cVar.f55504f;
                ArrayList arrayList = vrVar.N;
                vrVar.L = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                vr vrVar2 = contactsActivity.f41179b;
                if (contactsActivity.f41196r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                vrVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.wq.h).withEndAction(new sr(contactsActivity, 1));
                contactsActivity.f41185e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f41196r) {
                    cVar.f55503e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f49918b.f41185e0 = null;
                return;
        }
    }
}
