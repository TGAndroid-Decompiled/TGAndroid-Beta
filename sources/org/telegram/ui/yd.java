package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextWatcher {
    public final ie f43466a;

    public yd(ie ieVar) {
        this.f43466a = ieVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ie ieVar = this.f43466a;
        nd ndVar = ieVar.f37942i1;
        ai.t tVar = ieVar.Y0;
        if (ieVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        ieVar.X0 = parseLong;
        long j10 = ieVar.N0.amount;
        int i10 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            ieVar.X0 = j10;
            ieVar.V0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            ieVar.V0 = false;
        }
        if (ieVar.X0 != ieVar.N0.amount) {
            z10 = false;
        }
        ieVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(ndVar);
        ndVar.run();
        ieVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
