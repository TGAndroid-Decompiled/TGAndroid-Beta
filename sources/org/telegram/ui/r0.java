package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class r0 extends w7.j0 {
    public final l4 f40534a;

    public r0(l4 l4Var) {
        this.f40534a = l4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f40534a.f38713h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.lk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f40534a.f38712g0, null));
        }
    }
}
