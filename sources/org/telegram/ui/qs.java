package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qs implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ok0, org.telegram.ui.Components.cl0, r0.n {
    public final ContactsActivity f36612a;

    public qs(ContactsActivity contactsActivity) {
        this.f36612a = contactsActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.f36612a;
        contactsActivity.f30725q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.f41806b;
    }

    @Override
    public void a() {
        this.f36612a.g0();
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f36612a;
        s4.h0 adapter = contactsActivity.f30713f.getAdapter();
        ws wsVar = contactsActivity.d;
        if (adapter == wsVar) {
            int S = wsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
            if (qcVar != null) {
                qcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.bb)) {
            contactsActivity.r0((org.telegram.ui.Cells.bb) view);
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.f36612a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.f30711d0;
        ArrayList arrayList = new ArrayList(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
