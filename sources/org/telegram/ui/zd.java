package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class zd implements TextWatcher {
    public final ke f46263a;

    public zd(ke keVar) {
        this.f46263a = keVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ke keVar = this.f46263a;
        qd qdVar = keVar.f40895f1;
        bi.t tVar = keVar.O0;
        if (keVar.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        keVar.N0 = parseLong;
        long j10 = keVar.D0.amount;
        int i10 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            keVar.N0 = j10;
            keVar.L0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            keVar.L0 = false;
        }
        if (keVar.N0 != keVar.D0.amount) {
            z10 = false;
        }
        keVar.M0 = z10;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        keVar.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
