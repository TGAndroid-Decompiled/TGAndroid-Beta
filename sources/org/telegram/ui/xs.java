package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xs extends f2.z0 {
    public boolean f40299a;
    public boolean f40300b;
    public final ContactsActivity f40301c;

    public xs(ContactsActivity contactsActivity) {
        this.f40301c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f40301c;
            if ((contactsActivity.C && contactsActivity.B) || contactsActivity.W.f23815r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f40300b = true;
            return;
        }
        this.f40300b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ng.e eVar;
        boolean z4;
        ContactsActivity contactsActivity = this.f40301c;
        int L0 = contactsActivity.f31551n.L0();
        boolean z10 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31563w != null && !contactsActivity.C) {
            if (i11 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i11 != 0 && this.f40299a && (z4 || this.f40300b)) {
                contactsActivity.f31565x = !z4;
                ContactsActivity.e0(contactsActivity);
            }
            this.f40299a = true;
        }
        contactsActivity.V.b((L0 != 0 || i12 < contactsActivity.f31543f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f31555q0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
