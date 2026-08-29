package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class yj0 extends org.telegram.ui.Components.il0 {
    public final Context f44896c;
    public ArrayList d = new ArrayList();
    public ArrayList f44897e = new ArrayList();
    public xj0 f44898f;
    public final rf.k1 h;
    public final NotificationsCustomSettingsActivity f44899n;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f44899n = notificationsCustomSettingsActivity;
        this.f44896c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.h = k1Var;
        k1Var.f47277a = new xt(this, 25);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e10 = th.e(1, i10, this.d);
        rf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.f47280e;
        if (e10 >= 0 && e10 < arrayList.size()) {
            return k1Var.f47280e.get(e10);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f44898f != null) {
            Utilities.searchQueue.cancelRunnable(this.f44898f);
            this.f44898f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f44897e.clear();
            this.h.f(null, null);
            rf.k1 k1Var = this.h;
            int i10 = this.f44899n.f35617s;
            if (i10 != 1 && i10 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            k1Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        xj0 xj0Var = new xj0(this, str, 0);
        this.f44898f = xj0Var;
        dispatchQueue.postRunnable(xj0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f47280e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            bk0 bk0Var = (bk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.f44897e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            saVar.g(bk0Var, charSequence, z10);
            saVar.setAddButtonVisible(false);
            return;
        }
        int e10 = th.e(1, i10, this.d);
        ArrayList arrayList = this.h.f47280e;
        TLObject tLObject = (TLObject) arrayList.get(e10);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (e10 != arrayList.size() - 1) {
            z11 = true;
        }
        saVar.d(tLObject, null, string, z11);
        saVar.setAddButtonVisible(true);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View saVar;
        if (i10 != 0) {
            saVar = new org.telegram.ui.Cells.s3(this.f44896c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.f44896c, null, false, true);
        }
        return new f2.n1(saVar);
    }
}
