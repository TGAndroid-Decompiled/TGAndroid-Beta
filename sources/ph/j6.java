package ph;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class j6 implements TextWatcher {
    public final l6 f41819a;

    public j6(l6 l6Var) {
        this.f41819a = l6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z4;
        String obj = editable.toString();
        l6 l6Var = this.f41819a;
        l6Var.f41960p0 = obj;
        if (!l6Var.W) {
            String str = l6Var.f41965u0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                l6Var.Z();
                String str3 = l6Var.f41960p0;
                if (str3 != null && str3.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l6Var.f41964t0 = z4;
            }
            String str4 = l6Var.F0;
            String str5 = l6Var.f41960p0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                l6Var.Y();
                String str6 = l6Var.f41960p0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.g3) l6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                l6Var.A0 = z10;
            }
            f6 f6Var = l6Var.f41967w0;
            AndroidUtilities.cancelRunOnUIThread(f6Var);
            AndroidUtilities.runOnUIThread(f6Var, 400L);
            f6 f6Var2 = l6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(f6Var2);
            AndroidUtilities.runOnUIThread(f6Var2, 400L);
        }
        l6Var.f41958n0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
