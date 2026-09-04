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
    public final String f43233a;
    public final zx0 f43234b;

    public yx0(zx0 zx0Var, String str) {
        this.f43234b = zx0Var;
        this.f43233a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f43233a));
        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.f43234b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.f43234b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.qc();
        } else {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.f32876b.setText(string);
            b10 = a02.b(ybVar, 1500);
        }
        b10.j();
    }
}
