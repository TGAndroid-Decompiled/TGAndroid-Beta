package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zs extends s4.s0 {
    public boolean f43882a;
    public boolean f43883b;
    public final ContactsActivity f43884c;

    public zs(ContactsActivity contactsActivity) {
        this.f43884c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f43884c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f26252r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f43883b = true;
            return;
        }
        this.f43883b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f43884c;
        int L0 = contactsActivity.f33705n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33717w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f43882a && (z10 || this.f43883b)) {
                contactsActivity.f33719x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f43882a = true;
        }
        ((le.b) contactsActivity.Y.f5869c).a((L0 != 0 || i12 < contactsActivity.f33697f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f33714t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
