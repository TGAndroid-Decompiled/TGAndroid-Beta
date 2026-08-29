package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class wn0 implements TextWatcher {
    public int f44337a = -1;
    public boolean f44338b;
    public int f44339c;
    public final bo0 d;

    public wn0(bo0 bo0Var) {
        this.d = bo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36849f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f44338b = z10;
            this.f44337a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f44338b = false;
                this.f44337a = 3;
                this.f44339c = i10 - 1;
                return;
            }
            this.f44337a = 2;
        } else {
            this.f44337a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
