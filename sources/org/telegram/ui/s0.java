package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class s0 extends h7.j0 {

    public final m4 f42380a;

    public s0(m4 m4Var) {
        this.f42380a = m4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f42380a.f40335d0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(this.f42380a.f40334c0, null));
        }
    }
}
