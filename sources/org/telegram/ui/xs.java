package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xs extends s4.s0 {
    public boolean f39651a;
    public boolean f39652b;
    public final ContactsActivity f39653c;

    public xs(ContactsActivity contactsActivity) {
        this.f39653c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f39653c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22890r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f39652b = true;
            return;
        }
        this.f39652b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f39653c;
        int L0 = contactsActivity.f30721n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f30733w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f39651a && (z10 || this.f39652b)) {
                contactsActivity.f30735x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f39651a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30713f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f30730t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
