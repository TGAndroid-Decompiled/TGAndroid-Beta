package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ys extends f2.a1 {
    public boolean f43691a;
    public boolean f43692b;
    public final ContactsActivity f43693c;

    public ys(ContactsActivity contactsActivity) {
        this.f43693c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f43693c;
            if ((contactsActivity.C && contactsActivity.B) || contactsActivity.W.f26132r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f43692b = true;
            return;
        }
        this.f43692b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        og.e eVar;
        boolean z4;
        ContactsActivity contactsActivity = this.f43693c;
        int L0 = contactsActivity.f34068n.L0();
        boolean z10 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f34080w != null && !contactsActivity.C) {
            if (i11 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i11 != 0 && this.f43691a && (z4 || this.f43692b)) {
                contactsActivity.f34082x = !z4;
                ContactsActivity.e0(contactsActivity);
            }
            this.f43691a = true;
        }
        contactsActivity.V.b((L0 != 0 || i12 < contactsActivity.f34060f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f34072q0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
