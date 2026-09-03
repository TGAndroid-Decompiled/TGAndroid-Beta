package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s0 extends k7.x5 {
    public final n4 f38081a;

    public s0(n4 n4Var) {
        this.f38081a = n4Var;
    }

    @Override
    public final void a(boolean z4) {
        if (z4) {
            this.f38081a.f36363e0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.f38081a.f36362d0, null));
        }
    }
}
