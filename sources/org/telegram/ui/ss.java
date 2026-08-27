package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ss extends f2.b1 {

    public boolean f42687a;

    public boolean f42688b;

    public final ContactsActivity f42689c;

    public ss(ContactsActivity contactsActivity) {
        this.f42689c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.f42688b = false;
            return;
        }
        ContactsActivity contactsActivity = this.f42689c;
        if ((contactsActivity.B && contactsActivity.A) || contactsActivity.V.f31468r.isFocused()) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.f42688b = true;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        ContactsActivity contactsActivity = this.f42689c;
        int iL0 = contactsActivity.f35431n.L0();
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (contactsActivity.f35443w != null && !contactsActivity.B) {
            boolean z10 = i11 > 0;
            if (i11 != 0 && this.f42687a && (z10 || this.f42688b)) {
                contactsActivity.f35444x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f42687a = true;
        }
        contactsActivity.U.b(iL0 != 0 || top < contactsActivity.f35423f.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f35434p0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
