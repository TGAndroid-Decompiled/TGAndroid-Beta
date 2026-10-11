package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ss implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.tl0, org.telegram.ui.Components.hm0, r0.n {
    public final ContactsActivity f41882a;

    public ss(ContactsActivity contactsActivity) {
        this.f41882a = contactsActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        ContactsActivity contactsActivity = this.f41882a;
        contactsActivity.f33774q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.k1.f46900b;
    }

    @Override
    public void a() {
        this.f41882a.g0();
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f41882a;
        s4.i0 adapter = contactsActivity.f33762f.getAdapter();
        xs xsVar = contactsActivity.d;
        if (adapter == xsVar) {
            int S = xsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30825w;
            if (scVar != null) {
                scVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.xa)) {
            contactsActivity.r0((org.telegram.ui.Cells.xa) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.i6)) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.getUser() != null && i6Var.getUser().contact) {
                contactsActivity.r0(i6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ContactsActivity contactsActivity = this.f41882a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.f33759d0;
        ArrayList arrayList = new ArrayList(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
