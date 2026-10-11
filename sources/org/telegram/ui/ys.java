package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ys extends s4.t0 {
    public boolean f44489a;
    public boolean f44490b;
    public final ContactsActivity f44491c;

    public ys(ContactsActivity contactsActivity) {
        this.f44491c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f44491c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f30964r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f44490b = true;
            return;
        }
        this.f44490b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f44491c;
        int L0 = contactsActivity.f33736n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33748w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f44489a && (z10 || this.f44490b)) {
                contactsActivity.f33750x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f44489a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33728f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f33745t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
