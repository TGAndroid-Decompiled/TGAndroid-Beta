package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qs extends s4.r0 {
    public boolean f40489a;
    public boolean f40490b;
    public final ContactsActivity f40491c;

    public qs(ContactsActivity contactsActivity) {
        this.f40491c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f40491c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f27712r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f40490b = true;
            return;
        }
        this.f40490b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f40491c;
        int L0 = contactsActivity.f33079n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33091w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f40489a && (z10 || this.f40490b)) {
                contactsActivity.f33093x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f40489a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33071f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f33088t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
