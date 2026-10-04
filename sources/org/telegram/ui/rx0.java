package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rx0 extends ClickableSpan {
    public final String f40304a;
    public final sx0 f40305b;

    public rx0(sx0 sx0Var, String str) {
        this.f40305b = sx0Var;
        this.f40304a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.rc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f40304a));
        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.f40305b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.f40305b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.rc();
        } else {
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a02.W(), resourceProvider);
            zbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            zbVar.f33472b.setText(string);
            b10 = a02.b(zbVar, 1500);
        }
        b10.j();
    }
}
