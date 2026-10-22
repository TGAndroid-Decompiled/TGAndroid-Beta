package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class zn0 implements TextWatcher {
    public int f43785a = -1;
    public boolean f43786b;
    public int f43787c;
    public final eo0 d;

    public zn0(eo0 eo0Var) {
        this.d = eo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36715f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f43786b = z10;
            this.f43785a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f43786b = false;
                this.f43785a = 3;
                this.f43787c = i10 - 1;
                return;
            }
            this.f43785a = 2;
        } else {
            this.f43785a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
