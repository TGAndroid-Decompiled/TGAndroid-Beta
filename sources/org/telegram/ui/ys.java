package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ys extends s4.s0 {
    public boolean f40308a;
    public boolean f40309b;
    public final ContactsActivity f40310c;

    public ys(ContactsActivity contactsActivity) {
        this.f40310c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f40310c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f23850r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f40309b = true;
            return;
        }
        this.f40309b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f40310c;
        int L0 = contactsActivity.f31038n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31050w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f40308a && (z10 || this.f40309b)) {
                contactsActivity.f31052x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f40308a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f31030f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f31047t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
