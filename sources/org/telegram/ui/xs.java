package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class xs implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ok0, org.telegram.ui.Components.cl0, r0.n {
    public final ContactsActivity f39693a;

    public xs(ContactsActivity contactsActivity) {
        this.f39693a = contactsActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.f39693a;
        contactsActivity.f30768q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.f41876b;
    }

    @Override
    public void a() {
        this.f39693a.g0();
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f39693a;
        s4.h0 adapter = contactsActivity.f30756f.getAdapter();
        ct ctVar = contactsActivity.d;
        if (adapter == ctVar) {
            int S = ctVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
            if (ocVar != null) {
                ocVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.ab)) {
            contactsActivity.r0((org.telegram.ui.Cells.ab) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.h6)) {
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ContactsActivity contactsActivity = this.f39693a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.f30754d0;
        ArrayList arrayList = new ArrayList(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
