package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rs extends s4.r0 {
    public boolean f41217a;
    public boolean f41218b;
    public final ContactsActivity f41219c;

    public rs(ContactsActivity contactsActivity) {
        this.f41219c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f41219c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f27258r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f41218b = true;
            return;
        }
        this.f41218b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f41219c;
        int L0 = contactsActivity.f33395n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33407w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f41217a && (z10 || this.f41218b)) {
                contactsActivity.f33409x = !z10;
                ContactsActivity.d0(contactsActivity);
            }
            this.f41217a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33387f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f33404t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.f0();
        }
        ContactsActivity.c0(contactsActivity);
    }
}
