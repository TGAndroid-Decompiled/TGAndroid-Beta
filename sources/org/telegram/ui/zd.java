package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class zd implements TextWatcher {
    public final je f40447a;

    public zd(je jeVar) {
        this.f40447a = jeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        je jeVar = this.f40447a;
        md mdVar = jeVar.f34761i1;
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
        boolean z10 = true;
        if (parseLong > j3) {
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
