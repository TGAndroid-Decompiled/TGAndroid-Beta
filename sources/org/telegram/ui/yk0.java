package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class yk0 implements TextWatcher {
    public int f52344a = -1;
    public boolean f52345b;
    public int f52346c;
    public final dl0 d;

    public yk0(dl0 dl0Var) {
        this.d = dl0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yk0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f44750f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f52345b = z10;
            this.f52344a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i3) == '/' && i3 > 0) {
                this.f52345b = false;
                this.f52344a = 3;
                this.f52346c = i3 - 1;
                return;
            }
            this.f52344a = 2;
        } else {
            this.f52344a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
