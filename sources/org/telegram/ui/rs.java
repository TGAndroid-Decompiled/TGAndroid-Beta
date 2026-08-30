package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class rs implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0, org.telegram.ui.Components.kl0, r0.o {
    public final ContactsActivity f38110a;

    public rs(ContactsActivity contactsActivity) {
        this.f38110a = contactsActivity;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.f38110a;
        contactsActivity.f31552n0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.f43129b;
    }

    @Override
    public void d() {
        this.f38110a.g0();
    }

    @Override
    public boolean f(int i10, View view) {
        ContactsActivity contactsActivity = this.f38110a;
        f2.o0 adapter = contactsActivity.f31543f.getAdapter();
        ws wsVar = contactsActivity.d;
        if (adapter == wsVar) {
            int S = wsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
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
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ContactsActivity contactsActivity = this.f38110a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.f31536a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
