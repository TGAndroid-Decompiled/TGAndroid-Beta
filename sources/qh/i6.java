package qh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class i6 implements TextWatcher {
    public final k6 f45428a;

    public i6(k6 k6Var) {
        this.f45428a = k6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z4;
        String obj = editable.toString();
        k6 k6Var = this.f45428a;
        k6Var.f45581p0 = obj;
        if (!k6Var.W) {
            String str = k6Var.f45586u0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                k6Var.Z();
                String str3 = k6Var.f45581p0;
                if (str3 != null && str3.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                k6Var.f45585t0 = z4;
            }
            String str4 = k6Var.F0;
            String str5 = k6Var.f45581p0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                k6Var.Y();
                String str6 = k6Var.f45581p0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) k6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                k6Var.A0 = z10;
            }
            e6 e6Var = k6Var.f45588w0;
            AndroidUtilities.cancelRunOnUIThread(e6Var);
            AndroidUtilities.runOnUIThread(e6Var, 400L);
            e6 e6Var2 = k6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(e6Var2);
            AndroidUtilities.runOnUIThread(e6Var2, 400L);
        }
        k6Var.f45579n0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
