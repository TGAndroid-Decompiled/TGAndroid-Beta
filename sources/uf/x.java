package uf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.mz;
public final class x implements TextWatcher {
    public final c0 f45472a;

    public x(c0 c0Var) {
        this.f45472a = c0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        c0 c0Var = this.f45472a;
        ph.e1 e1Var = c0Var.f45269s;
        mz mzVar = c0Var.B;
        z zVar = c0Var.f45271x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (e1Var.getAdapter() != zVar) {
            currentTop = c0Var.getCurrentTop();
            mzVar.c();
            e1Var.setAdapter(zVar);
            zVar.l();
            if (currentTop > 0) {
                c0Var.v.h1(0, -currentTop);
            }
        }
        a0 a0Var = c0Var.f45272y;
        if (a0Var != null) {
            c0 c0Var2 = a0Var.f45240f;
            ph.e1 e1Var2 = c0Var2.f45269s;
            ArrayList arrayList = a0Var.d;
            arrayList.clear();
            a0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = p1.f(UserConfig.selectedAccount).f45417b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                o1 o1Var = (o1) arrayList2.get(i10);
                if (!p1.g(o1Var.f45408b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(o1Var.f45408b);
                    if (translitSafe2.startsWith(translitSafe) || y3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(o1Var);
                    }
                }
            }
            f2.o0 adapter = e1Var2.getAdapter();
            a0 a0Var2 = c0Var2.f45272y;
            if (adapter != a0Var2) {
                e1Var2.setAdapter(a0Var2);
            }
            a0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
