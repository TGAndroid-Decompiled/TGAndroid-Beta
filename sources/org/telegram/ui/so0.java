package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class so0 implements TextWatcher {
    public int f37458a = -1;
    public boolean f37459b;
    public int f37460c;
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
            if (TextUtils.indexOf((CharSequence) this.d.f39676f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f37459b = z10;
            this.f37458a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f37459b = false;
                this.f37458a = 3;
                this.f37460c = i10 - 1;
                return;
            }
            this.f37458a = 2;
        } else {
            this.f37458a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
