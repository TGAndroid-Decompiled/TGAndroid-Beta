package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rs extends f2.d1 {
    public boolean f42483a;
    public boolean f42484b;
    public final ContactsActivity f42485c;

    public rs(ContactsActivity contactsActivity) {
        this.f42485c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            ContactsActivity contactsActivity = this.f42485c;
            if ((contactsActivity.B && contactsActivity.A) || contactsActivity.V.f30664r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f42484b = true;
            return;
        }
        this.f42484b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        ig.e eVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f42485c;
        int L0 = contactsActivity.f35428n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i11 = childAt.getTop();
        } else {
            i11 = 0;
        }
        if (contactsActivity.f35440w != null && !contactsActivity.B) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f42483a && (z10 || this.f42484b)) {
                contactsActivity.f35441x = !z10;
                ContactsActivity.d0(contactsActivity);
            }
            this.f42483a = true;
        }
        contactsActivity.U.b((L0 != 0 || i11 < contactsActivity.f35420f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f35431p0) != null) {
            eVar.f(i9, i10);
            contactsActivity.f0();
        }
        ContactsActivity.c0(contactsActivity);
    }
}
