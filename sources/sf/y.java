package sf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.hz;
import org.telegram.ui.i71;
public final class y implements TextWatcher {
    public final d0 f48007a;

    public y(d0 d0Var) {
        this.f48007a = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        d0 d0Var = this.f48007a;
        i71 i71Var = d0Var.f47776s;
        hz hzVar = d0Var.A;
        a0 a0Var = d0Var.f47778x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (hzVar != null) {
                hzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (i71Var.getAdapter() != a0Var) {
            currentTop = d0Var.getCurrentTop();
            hzVar.c();
            i71Var.setAdapter(a0Var);
            a0Var.l();
            if (currentTop > 0) {
                d0Var.v.h1(0, -currentTop);
            }
        }
        b0 b0Var = d0Var.f47779y;
        if (b0Var != null) {
            d0 d0Var2 = b0Var.f47753f;
            i71 i71Var2 = d0Var2.f47776s;
            ArrayList arrayList = b0Var.d;
            arrayList.clear();
            b0Var.f47752e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = s1.f(UserConfig.selectedAccount).f47949b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                r1 r1Var = (r1) arrayList2.get(i10);
                if (!s1.g(r1Var.f47936b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(r1Var.f47936b);
                    if (translitSafe2.startsWith(translitSafe) || x3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(r1Var);
                    }
                }
            }
            f2.p0 adapter = i71Var2.getAdapter();
            b0 b0Var2 = d0Var2.f47779y;
            if (adapter != b0Var2) {
                i71Var2.setAdapter(b0Var2);
            }
            b0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
