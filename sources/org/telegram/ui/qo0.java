package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class qo0 implements TextWatcher {
    public int f41201a = -1;
    public boolean f41202b;
    public int f41203c;
    public final vo0 d;

    public qo0(vo0 vo0Var) {
        this.d = vo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f42971f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f41202b = z10;
            this.f41201a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f41202b = false;
                this.f41201a = 3;
                this.f41203c = i10 - 1;
                return;
            }
            this.f41201a = 2;
        } else {
            this.f41201a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
