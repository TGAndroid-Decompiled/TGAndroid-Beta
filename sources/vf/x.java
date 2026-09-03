package vf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.oz;
import org.telegram.ui.c81;
public final class x implements TextWatcher {
    public final c0 f49269a;

    public x(c0 c0Var) {
        this.f49269a = c0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        c0 c0Var = this.f49269a;
        c81 c81Var = c0Var.f49046s;
        oz ozVar = c0Var.B;
        z zVar = c0Var.f49048x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (c81Var.getAdapter() != zVar) {
            currentTop = c0Var.getCurrentTop();
            ozVar.c();
            c81Var.setAdapter(zVar);
            zVar.l();
            if (currentTop > 0) {
                c0Var.v.h1(0, -currentTop);
            }
        }
        a0 a0Var = c0Var.f49049y;
        if (a0Var != null) {
            c0 c0Var2 = a0Var.f49014f;
            c81 c81Var2 = c0Var2.f49046s;
            ArrayList arrayList = a0Var.d;
            arrayList.clear();
            a0Var.f49013e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = p1.f(UserConfig.selectedAccount).f49208b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                o1 o1Var = (o1) arrayList2.get(i10);
                if (!p1.g(o1Var.f49197b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(o1Var.f49197b);
                    if (translitSafe2.startsWith(translitSafe) || y3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(o1Var);
                    }
                }
            }
            f2.p0 adapter = c81Var2.getAdapter();
            a0 a0Var2 = c0Var2.f49049y;
            if (adapter != a0Var2) {
                c81Var2.setAdapter(a0Var2);
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
