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
public final class sk0 extends org.telegram.ui.Components.ul0 {
    public final Context f36716c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rk0 f36717f;
    public final fg.d2 h;
    public final NotificationsCustomSettingsActivity f36718n;

    public sk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f36718n = notificationsCustomSettingsActivity;
        this.f36716c = context;
        fg.d2 d2Var = new fg.d2(true);
        this.h = d2Var;
        d2Var.f7979a = new iu(this, 25);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.d);
        fg.d2 d2Var = this.h;
        ArrayList arrayList = d2Var.e;
        if (e >= 0 && e < arrayList.size()) {
            return d2Var.e.get(e);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f36717f != null) {
            Utilities.searchQueue.cancelRunnable(this.f36717f);
            this.f36717f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            fg.d2 d2Var = this.h;
            int i10 = this.f36718n.f29983s;
            if (i10 != 1 && i10 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            d2Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        rk0 rk0Var = new rk0(this, str, 0);
        this.f36717f = rk0Var;
        dispatchQueue.postRunnable(rk0Var, 300L);
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            vk0 vk0Var = (vk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            bbVar.g(vk0Var, charSequence, z10);
            bbVar.setAddButtonVisible(false);
            return;
        }
        int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(e);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (e != arrayList.size() - 1) {
            z11 = true;
        }
        bbVar.d(tLObject, null, string, z11);
        bbVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View bbVar;
        if (i10 != 0) {
            bbVar = new org.telegram.ui.Cells.u3(this.f36716c, null);
            bbVar.setBackgroundColor(0);
            bbVar.setTag(-33024);
        } else {
            bbVar = new org.telegram.ui.Cells.bb(4, 0, this.f36716c, null, false, true);
        }
        return new s4.c1(bbVar);
    }
}
