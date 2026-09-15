package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xx0 extends ClickableSpan {
    public final String f39690a;
    public final yx0 f39691b;

    public xx0(yx0 yx0Var, String str) {
        this.f39691b = yx0Var;
        this.f39690a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.oc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f39690a));
        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this.f39691b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.e6 resourceProvider = this.f39691b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.oc();
        } else {
            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), resourceProvider);
            wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            wbVar.f29682b.setText(string);
            b10 = a02.b(wbVar, 1500);
        }
        b10.j();
    }
}
