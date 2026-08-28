package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class xn0 implements TextWatcher {
    public int f44551a = -1;
    public boolean f44552b;
    public int f44553c;
    public final co0 d;

    public xn0(co0 co0Var) {
        this.d = co0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f37256f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f44552b = z10;
            this.f44551a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i9) == '/' && i9 > 0) {
                this.f44552b = false;
                this.f44551a = 3;
                this.f44553c = i9 - 1;
                return;
            }
            this.f44551a = 2;
        } else {
            this.f44551a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
