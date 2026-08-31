package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ss implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.zk0, org.telegram.ui.Components.ll0, r0.o {
    public final ContactsActivity f41360a;

    public ss(ContactsActivity contactsActivity) {
        this.f41360a = contactsActivity;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.f41360a;
        contactsActivity.f34069n0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.f46451b;
    }

    @Override
    public void d() {
        this.f41360a.g0();
    }

    @Override
    public boolean f(int i10, View view) {
        ContactsActivity contactsActivity = this.f41360a;
        f2.p0 adapter = contactsActivity.f34060f.getAdapter();
        xs xsVar = contactsActivity.d;
        if (adapter == xsVar) {
            int S = xsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27737w;
            if (icVar != null) {
                icVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z4 = contactsActivity.H;
        if (!z4 && !contactsActivity.I && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.r0((org.telegram.ui.Cells.va) view);
            return true;
        } else if (!z4 && !contactsActivity.I && (view instanceof org.telegram.ui.Cells.h6)) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.getUser() != null && h6Var.getUser().contact) {
                contactsActivity.r0(h6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ContactsActivity contactsActivity = this.f41360a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.f34052a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
