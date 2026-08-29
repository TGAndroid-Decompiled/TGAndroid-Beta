package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sw0 extends ClickableSpan {
    public final String f42475a;
    public final tw0 f42476b;

    public sw0(tw0 tw0Var, String str) {
        this.f42476b = tw0Var;
        this.f42475a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.mc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f42475a));
        org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(this.f42476b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.f42476b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.mc();
        } else {
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), resourceProvider);
            ubVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ubVar.f33185b.setText(string);
            b10 = a02.b(ubVar, 1500);
        }
        b10.j();
    }
}
