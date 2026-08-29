package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s0 extends i7.b6 {
    public final m4 f42240a;

    public s0(m4 m4Var) {
        this.f42240a = m4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f42240a.f40392d0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(this.f42240a.f40391c0, null));
        }
    }
}
