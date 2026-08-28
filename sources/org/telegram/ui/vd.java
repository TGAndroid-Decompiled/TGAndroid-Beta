package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class vd implements TextWatcher {
    public final fe f43445a;

    public vd(fe feVar) {
        this.f43445a = feVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        fe feVar = this.f43445a;
        jd jdVar = feVar.f38222e1;
        gh.o oVar = feVar.U0;
        if (feVar.R0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        feVar.T0 = parseLong;
        long j10 = feVar.J0.amount;
        boolean z10 = true;
        if (parseLong > j10) {
            feVar.T0 = j10;
            feVar.R0 = true;
            oVar.setText(Long.toString(j10));
            oVar.setSelection(oVar.getText().length());
            feVar.R0 = false;
        }
        if (feVar.T0 != feVar.J0.amount) {
            z10 = false;
        }
        feVar.S0 = z10;
        AndroidUtilities.cancelRunOnUIThread(jdVar);
        jdVar.run();
        feVar.S0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
