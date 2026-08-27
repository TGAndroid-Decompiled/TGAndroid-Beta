package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

public final class z21 extends org.telegram.ui.Components.yk0 {

    public final Context f45001c;
    public final boolean d;

    public final a31 f45002e;

    public z21(a31 a31Var, Context context, boolean z10) {
        this.f45002e = a31Var;
        this.f45001c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        a31 a31Var = this.f45002e;
        if (!z10) {
            return a31Var.h.size() + (a31Var.f36365e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = a31Var.f36366f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        return (!this.d && i10 == this.f45002e.f36365e) ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        boolean z11 = this.d;
        a31 a31Var = this.f45002e;
        TranslateController.Language language = null;
        if (z11) {
            if (i10 >= 0 && i10 < a31Var.f36366f.size()) {
                language = (TranslateController.Language) a31Var.f36366f.get(i10);
            }
            if (i10 == a31Var.f36366f.size() - 1) {
            }
        } else {
            int i12 = a31Var.f36365e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < a31Var.h.size()) {
                language = (TranslateController.Language) a31Var.h.get(i10);
                z10 = i10 == a31Var.h.size() - 1;
            }
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        q8Var.b(str, language.displayName, false, !z10);
        q8Var.setChecked(a31Var.f36368r.contains(language.code));
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View q8Var;
        Context context = this.f45001c;
        if (i10 == 0) {
            q8Var = new org.telegram.ui.Cells.q8(context);
        } else if (i10 != 2) {
            q8Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            q8Var = j4Var;
        }
        return new org.telegram.ui.Components.lk0(q8Var);
    }
}
