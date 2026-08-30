package ph;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class k6 implements TextWatcher {
    public final m6 f41860a;

    public k6(m6 m6Var) {
        this.f41860a = m6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z4;
        String obj = editable.toString();
        m6 m6Var = this.f41860a;
        m6Var.f41953p0 = obj;
        if (!m6Var.W) {
            String str = m6Var.f41958u0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                m6Var.Z();
                String str3 = m6Var.f41953p0;
                if (str3 != null && str3.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m6Var.f41957t0 = z4;
            }
            String str4 = m6Var.F0;
            String str5 = m6Var.f41953p0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                m6Var.Y();
                String str6 = m6Var.f41953p0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.g3) m6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                m6Var.A0 = z10;
            }
            g6 g6Var = m6Var.f41960w0;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var, 400L);
            g6 g6Var2 = m6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(g6Var2);
            AndroidUtilities.runOnUIThread(g6Var2, 400L);
        }
        m6Var.f41951n0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
