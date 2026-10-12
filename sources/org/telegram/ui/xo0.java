package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class xo0 implements TextWatcher {
    public int f41907a = -1;
    public boolean f41908b;
    public int f41909c;
    public final cp0 d;

    public xo0(cp0 cp0Var) {
        this.d = cp0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f35008f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f41908b = z10;
            this.f41907a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f41908b = false;
                this.f41907a = 3;
                this.f41909c = i10 - 1;
                return;
            }
            this.f41907a = 2;
        } else {
            this.f41907a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
