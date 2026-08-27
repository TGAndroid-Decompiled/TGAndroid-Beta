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

    public final String f43024a;

    public final uw0 f43025b;

    public tw0(uw0 uw0Var, String str) {
        this.f43025b = uw0Var;
        this.f43024a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ec ecVarB;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f43024a));
        org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(this.f43025b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.f43025b.d.getResourceProvider();
        mcVarA0.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(mcVarA0.W(), resourceProvider);
            mbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            mbVar.f30639b.setText(string);
            ecVarB = mcVarA0.b(mbVar, 1500);
        } else {
            ecVarB = new org.telegram.ui.Components.eb();
        }
        ecVarB.j();
    }
}
