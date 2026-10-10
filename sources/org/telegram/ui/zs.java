package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zs extends s4.t0 {
    public boolean f45102a;
    public boolean f45103b;
    public final ContactsActivity f45104c;

    public zs(ContactsActivity contactsActivity) {
        this.f45104c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f45104c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f30958r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f45103b = true;
            return;
        }
        this.f45103b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f45104c;
        int L0 = contactsActivity.f33746n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33758w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f45102a && (z10 || this.f45103b)) {
                contactsActivity.f33760x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f45102a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33738f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f33755t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
