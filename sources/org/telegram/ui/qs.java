package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qs extends f2.a1 {
    public boolean f41768a;
    public boolean f41769b;
    public final ContactsActivity f41770c;

    public qs(ContactsActivity contactsActivity) {
        this.f41770c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f41770c;
            if ((contactsActivity.B && contactsActivity.A) || contactsActivity.V.f34546r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f41769b = true;
            return;
        }
        this.f41769b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        lg.e eVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f41770c;
        int L0 = contactsActivity.f35495n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f35507w != null && !contactsActivity.B) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f41768a && (z10 || this.f41769b)) {
                contactsActivity.f35508x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f41768a = true;
        }
        contactsActivity.U.b((L0 != 0 || i12 < contactsActivity.f35487f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f35498p0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
