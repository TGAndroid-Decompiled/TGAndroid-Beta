package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class ro0 implements TextWatcher {
    public int f36400a = -1;
    public boolean f36401b;
    public int f36402c;
    public final wo0 d;

    public ro0(wo0 wo0Var) {
        this.d = wo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f38267f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f36401b = z10;
            this.f36400a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f36401b = false;
                this.f36400a = 3;
                this.f36402c = i10 - 1;
                return;
            }
            this.f36400a = 2;
        } else {
            this.f36400a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
