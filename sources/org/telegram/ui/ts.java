package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ts implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.ol0, r0.n {
    public final ContactsActivity f40955a;

    public ts(ContactsActivity contactsActivity) {
        this.f40955a = contactsActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.f40955a;
        contactsActivity.f33702q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.f45608b;
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f40955a;
        s4.h0 adapter = contactsActivity.f33690f.getAdapter();
        ys ysVar = contactsActivity.d;
        if (adapter == ysVar) {
            int S = ysVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30330w;
            if (rcVar != null) {
                rcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.za)) {
            contactsActivity.r0((org.telegram.ui.Cells.za) view);
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
    public void e() {
        this.f40955a.g0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.f40955a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.f33687d0;
        ArrayList arrayList = new ArrayList(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
