package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zx0 extends ClickableSpan {
    public final String f39462a;
    public final ay0 f39463b;

    public zx0(ay0 ay0Var, String str) {
        this.f39463b = ay0Var;
        this.f39462a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.pc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f39462a));
        org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(this.f39463b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.f39463b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.pc();
        } else {
            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), resourceProvider);
            xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            xbVar.f29000b.setText(string);
            b10 = a02.b(xbVar, 1500);
        }
        b10.j();
    }
}
