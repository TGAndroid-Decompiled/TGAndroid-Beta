package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vs extends s4.s0 {
    public boolean f38805a;
    public boolean f38806b;
    public final ContactsActivity f38807c;

    public vs(ContactsActivity contactsActivity) {
        this.f38807c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f38807c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f23161r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f38806b = true;
            return;
        }
        this.f38806b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f38807c;
        int L0 = contactsActivity.f31037n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31049w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f38805a && (z10 || this.f38806b)) {
                contactsActivity.f31051x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f38805a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f31029f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f31046t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
