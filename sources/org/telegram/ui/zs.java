package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zs extends s4.t0 {
    public boolean f45058a;
    public boolean f45059b;
    public final ContactsActivity f45060c;

    public zs(ContactsActivity contactsActivity) {
        this.f45060c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f45060c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f30614r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f45059b = true;
            return;
        }
        this.f45059b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f45060c;
        int L0 = contactsActivity.f33708n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33720w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f45058a && (z10 || this.f45059b)) {
                contactsActivity.f33722x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f45058a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33700f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f33717t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
