package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class to0 implements TextWatcher {
    public int f37842a = -1;
    public boolean f37843b;
    public int f37844c;
    public final yo0 d;

    public to0(yo0 yo0Var) {
        this.d = yo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.to0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f39957f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f37843b = z10;
            this.f37842a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f37843b = false;
                this.f37842a = 3;
                this.f37844c = i10 - 1;
                return;
            }
            this.f37842a = 2;
        } else {
            this.f37842a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
