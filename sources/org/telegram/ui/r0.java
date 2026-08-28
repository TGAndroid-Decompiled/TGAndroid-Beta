package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class r0 extends g7.a6 {
    public final l4 f42236a;

    public r0(l4 l4Var) {
        this.f42236a = l4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f42236a.f40014d0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(this.f42236a.f40013c0, null));
        }
    }
}
