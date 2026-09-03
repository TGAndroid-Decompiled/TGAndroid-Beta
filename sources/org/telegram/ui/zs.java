package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zs extends f2.z0 {
    public boolean f40867a;
    public boolean f40868b;
    public final ContactsActivity f40869c;

    public zs(ContactsActivity contactsActivity) {
        this.f40869c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f40869c;
            if ((contactsActivity.C && contactsActivity.B) || contactsActivity.W.f24117r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f40868b = true;
            return;
        }
        this.f40868b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ng.e eVar;
        boolean z4;
        ContactsActivity contactsActivity = this.f40869c;
        int L0 = contactsActivity.f31525n.L0();
        boolean z10 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31537w != null && !contactsActivity.C) {
            if (i11 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i11 != 0 && this.f40867a && (z4 || this.f40868b)) {
                contactsActivity.f31539x = !z4;
                ContactsActivity.e0(contactsActivity);
            }
            this.f40867a = true;
        }
        contactsActivity.V.b((L0 != 0 || i12 < contactsActivity.f31517f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f31529q0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
