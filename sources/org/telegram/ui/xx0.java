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
    public final String f44158a;
    public final yx0 f44159b;

    public xx0(yx0 yx0Var, String str) {
        this.f44159b = yx0Var;
        this.f44158a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.tc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f44158a));
        org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(this.f44159b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.e6 resourceProvider = this.f44159b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.tc();
        } else {
            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), resourceProvider);
            bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            bcVar.f24967b.setText(string);
            b10 = a02.b(bcVar, 1500);
        }
        b10.j();
    }
}
