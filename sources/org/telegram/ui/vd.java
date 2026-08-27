package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

public final class vd implements TextWatcher {

    public final fe f43430a;

    public vd(fe feVar) {
        this.f43430a = feVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        fe feVar = this.f43430a;
        jd jdVar = feVar.f38084e1;
        hh.o oVar = feVar.U0;
        if (feVar.R0) {
            return;
        }
        long j10 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        feVar.T0 = j10;
        long j11 = feVar.J0.amount;
        if (j10 > j11) {
            feVar.T0 = j11;
            feVar.R0 = true;
            oVar.setText(Long.toString(j11));
            oVar.setSelection(oVar.getText().length());
            feVar.R0 = false;
        }
        feVar.S0 = feVar.T0 == feVar.J0.amount;
        AndroidUtilities.cancelRunOnUIThread(jdVar);
        jdVar.run();
        feVar.S0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
