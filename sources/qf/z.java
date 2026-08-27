package qf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.az;
import org.telegram.ui.a60;

public final class z implements TextWatcher {

    public final e0 f46503a;

    public z(e0 e0Var) {
        this.f46503a = e0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e0 e0Var = this.f46503a;
        a60 a60Var = e0Var.f46280s;
        az azVar = e0Var.A;
        b0 b0Var = e0Var.f46282x;
        String string = editable.toString();
        if (string.isEmpty()) {
            if (a60Var.getAdapter() != b0Var) {
                int currentTop = e0Var.getCurrentTop();
                azVar.c();
                a60Var.setAdapter(b0Var);
                b0Var.l();
                if (currentTop > 0) {
                    e0Var.v.h1(0, -currentTop);
                }
            }
        } else if (azVar != null) {
            azVar.setText(LocaleController.getString(R.string.NoResult));
        }
        c0 c0Var = e0Var.f46283y;
        if (c0Var != null) {
            e0 e0Var2 = c0Var.f46257f;
            a60 a60Var2 = e0Var2.f46280s;
            ArrayList arrayList = c0Var.d;
            arrayList.clear();
            c0Var.f46256e = string;
            String strTranslitSafe = AndroidUtilities.translitSafe(string);
            if (strTranslitSafe.startsWith("/")) {
                strTranslitSafe = strTranslitSafe.substring(1);
            }
            ArrayList arrayList2 = q1.f(UserConfig.selectedAccount).f46434b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                p1 p1Var = (p1) arrayList2.get(i10);
                if (!q1.g(p1Var.f46419b)) {
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(p1Var.f46419b);
                    if (strTranslitSafe2.startsWith(strTranslitSafe) || y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                        arrayList.add(p1Var);
                    }
                }
            }
            f2.q0 adapter = a60Var2.getAdapter();
            c0 c0Var2 = e0Var2.f46283y;
            if (adapter != c0Var2) {
                a60Var2.setAdapter(c0Var2);
            }
            c0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
