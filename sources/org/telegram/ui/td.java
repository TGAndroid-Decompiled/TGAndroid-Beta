package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class td implements TextWatcher {
    public final de f42656a;

    public td(de deVar) {
        this.f42656a = deVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        de deVar = this.f42656a;
        id idVar = deVar.f37508e1;
        jh.m mVar = deVar.U0;
        if (deVar.R0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        deVar.T0 = parseLong;
        long j10 = deVar.J0.amount;
        boolean z10 = true;
        if (parseLong > j10) {
            deVar.T0 = j10;
            deVar.R0 = true;
            mVar.setText(Long.toString(j10));
            mVar.setSelection(mVar.getText().length());
            deVar.R0 = false;
        }
        if (deVar.T0 != deVar.J0.amount) {
            z10 = false;
        }
        deVar.S0 = z10;
        AndroidUtilities.cancelRunOnUIThread(idVar);
        idVar.run();
        deVar.S0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
