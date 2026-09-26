package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vs extends s4.s0 {
    public boolean f38803a;
    public boolean f38804b;
    public final ContactsActivity f38805c;

    public vs(ContactsActivity contactsActivity) {
        this.f38805c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f38805c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f23475r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f38804b = true;
            return;
        }
        this.f38804b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f38805c;
        int L0 = contactsActivity.f31035n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31047w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f38803a && (z10 || this.f38804b)) {
                contactsActivity.f31049x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f38803a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f31027f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f31044t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
