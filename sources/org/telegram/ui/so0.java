package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class so0 implements TextWatcher {
    public int f41967a = -1;
    public boolean f41968b;
    public int f41969c;
    public final xo0 d;

    public so0(xo0 xo0Var) {
        this.d = xo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.so0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f44099f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f41968b = z10;
            this.f41967a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f41968b = false;
                this.f41967a = 3;
                this.f41969c = i10 - 1;
                return;
            }
            this.f41967a = 2;
        } else {
            this.f41967a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
