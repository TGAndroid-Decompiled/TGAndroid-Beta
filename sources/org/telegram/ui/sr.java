package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class sr implements Runnable {
    public final int f52142a;
    public final ContactsActivity f52143b;

    public sr(ContactsActivity contactsActivity, int i7) {
        this.f52142a = i7;
        this.f52143b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f52142a) {
            case 0:
                ContactsActivity contactsActivity = this.f52143b;
                te.c cVar = contactsActivity.f43096a;
                if (contactsActivity.f43116r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                vr vrVar = contactsActivity.f43098b;
                float f11 = cVar.f57785f;
                ArrayList arrayList = vrVar.O;
                vrVar.M = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.t4) arrayList.get(i10)).setLetterProgress(f11);
                }
                vr vrVar2 = contactsActivity.f43098b;
                if (contactsActivity.f43116r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                vrVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.kr.h).withEndAction(new sr(contactsActivity, 1));
                contactsActivity.f43106f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f43116r) {
                    cVar.f57784e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f52143b.f43106f0 = null;
                return;
        }
    }
}
