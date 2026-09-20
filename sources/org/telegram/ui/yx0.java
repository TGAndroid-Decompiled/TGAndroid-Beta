package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yx0 extends ClickableSpan {
    public final String f40034a;
    public final zx0 f40035b;

    public yx0(zx0 zx0Var, String str) {
        this.f40035b = zx0Var;
        this.f40034a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.pc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f40034a));
        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this.f40035b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.f40035b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.pc();
        } else {
            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), resourceProvider);
            xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            xbVar.f30222b.setText(string);
            b10 = a02.b(xbVar, 1500);
        }
        b10.j();
    }
}
