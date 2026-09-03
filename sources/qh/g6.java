package qh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class g6 implements TextWatcher {
    public final i6 f45361a;

    public g6(i6 i6Var) {
        this.f45361a = i6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z4;
        String obj = editable.toString();
        i6 i6Var = this.f45361a;
        i6Var.f45480p0 = obj;
        if (!i6Var.W) {
            String str = i6Var.f45485u0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                i6Var.Z();
                String str3 = i6Var.f45480p0;
                if (str3 != null && str3.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i6Var.f45484t0 = z4;
            }
            String str4 = i6Var.F0;
            String str5 = i6Var.f45480p0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                i6Var.Y();
                String str6 = i6Var.f45480p0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) i6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                i6Var.A0 = z10;
            }
            c6 c6Var = i6Var.f45487w0;
            AndroidUtilities.cancelRunOnUIThread(c6Var);
            AndroidUtilities.runOnUIThread(c6Var, 400L);
            c6 c6Var2 = i6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(c6Var2);
            AndroidUtilities.runOnUIThread(c6Var2, 400L);
        }
        i6Var.f45478n0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
