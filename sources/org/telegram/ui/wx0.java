package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wx0 extends ClickableSpan {
    public final String f43885a;
    public final xx0 f43886b;

    public wx0(xx0 xx0Var, String str) {
        this.f43886b = xx0Var;
        this.f43885a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.sc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f43885a));
        org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(this.f43886b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.f43886b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.sc();
        } else {
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), resourceProvider);
            acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            acVar.f24488b.setText(string);
            b10 = a02.b(acVar, 1500);
        }
        b10.j();
    }
}
