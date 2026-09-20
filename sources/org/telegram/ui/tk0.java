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
public final class tk0 extends org.telegram.ui.Components.ul0 {
    public final Context f37840c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sk0 f37841f;
    public final gg.c2 h;
    public final NotificationsCustomSettingsActivity f37842n;

    public tk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f37842n = notificationsCustomSettingsActivity;
        this.f37840c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9690a = new fu(this, 26);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        gg.c2 c2Var = this.h;
        ArrayList arrayList = c2Var.e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return c2Var.e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f37841f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37841f);
            this.f37841f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            gg.c2 c2Var = this.h;
            int i10 = this.f37842n.f31154s;
            if (i10 != 1 && i10 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            c2Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        sk0 sk0Var = new sk0(this, str, 0);
        this.f37841f = sk0Var;
        dispatchQueue.postRunnable(sk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            wk0 wk0Var = (wk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            abVar.g(wk0Var, charSequence, z10);
            abVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(f7);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f7 != arrayList.size() - 1) {
            z11 = true;
        }
        abVar.d(tLObject, null, string, z11);
        abVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View abVar;
        if (i10 != 0) {
            abVar = new org.telegram.ui.Cells.w3(this.f37840c, null);
            abVar.setBackgroundColor(0);
            abVar.setTag(-33024);
        } else {
            abVar = new org.telegram.ui.Cells.ab(4, 0, this.f37840c, null, false, true);
        }
        return new s4.c1(abVar);
    }
}
