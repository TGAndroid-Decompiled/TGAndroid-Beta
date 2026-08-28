package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tw0 extends ClickableSpan {
    public final String f43078a;
    public final uw0 f43079b;

    public tw0(uw0 uw0Var, String str) {
        this.f43079b = uw0Var;
        this.f43078a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.gc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f43078a));
        org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(this.f43079b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.b6 resourceProvider = this.f43079b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.gc();
        } else {
            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), resourceProvider);
            obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            obVar.f31343b.setText(string);
            b10 = a02.b(obVar, 1500);
        }
        b10.j();
    }
}
