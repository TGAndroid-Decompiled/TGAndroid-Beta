package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class vo0 implements TextWatcher {
    public int f40742a = -1;
    public boolean f40743b;
    public int f40744c;
    public final ap0 d;

    public vo0(ap0 ap0Var) {
        this.d = ap0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f34020f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f40743b = z10;
            this.f40742a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f40743b = false;
                this.f40742a = 3;
                this.f40744c = i10 - 1;
                return;
            }
            this.f40742a = 2;
        } else {
            this.f40742a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
