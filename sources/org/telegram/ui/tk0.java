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
public final class tk0 extends org.telegram.ui.Components.kl0 {
    public final Context f40787c;
    public ArrayList d = new ArrayList();
    public ArrayList f40788e = new ArrayList();
    public sk0 f40789f;
    public final hg.b2 h;
    public final NotificationsCustomSettingsActivity f40790n;

    public tk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f40790n = notificationsCustomSettingsActivity;
        this.f40787c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.h = b2Var;
        b2Var.f10979a = new iu(this, 25);
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
        hg.b2 b2Var = this.h;
        ArrayList arrayList = b2Var.f10982e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return b2Var.f10982e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f40789f != null) {
            Utilities.searchQueue.cancelRunnable(this.f40789f);
            this.f40789f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f40788e.clear();
            this.h.f(null, null);
            hg.b2 b2Var = this.h;
            int i10 = this.f40790n.f33480s;
            if (i10 != 1 && i10 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        sk0 sk0Var = new sk0(this, str, 0);
        this.f40789f = sk0Var;
        dispatchQueue.postRunnable(sk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f10982e;
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
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            wk0 wk0Var = (wk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.f40788e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            zaVar.g(wk0Var, charSequence, z10);
            zaVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.f10982e;
        TLObject tLObject = (TLObject) arrayList.get(f7);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f7 != arrayList.size() - 1) {
            z11 = true;
        }
        zaVar.e(tLObject, null, string, z11);
        zaVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zaVar;
        if (i10 != 0) {
            zaVar = new org.telegram.ui.Cells.u3(this.f40787c, null);
            zaVar.setBackgroundColor(0);
            zaVar.setTag(-33024);
        } else {
            zaVar = new org.telegram.ui.Cells.za(4, 0, this.f40787c, null, false, true);
        }
        return new s4.c1(zaVar);
    }
}
