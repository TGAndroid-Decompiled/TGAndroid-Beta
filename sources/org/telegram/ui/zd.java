package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class zd implements TextWatcher {
    public final je f44639a;

    public zd(je jeVar) {
        this.f44639a = jeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        je jeVar = this.f44639a;
        md mdVar = jeVar.f39003i1;
        fi.o oVar = jeVar.Y0;
        if (jeVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        jeVar.X0 = parseLong;
        long j3 = jeVar.N0.amount;
        int i10 = (parseLong > j3 ? 1 : (parseLong == j3 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            jeVar.X0 = j3;
            jeVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            jeVar.V0 = false;
        }
        if (jeVar.X0 != jeVar.N0.amount) {
            z10 = false;
        }
        jeVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(mdVar);
        mdVar.run();
        jeVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
