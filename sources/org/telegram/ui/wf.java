package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class wf implements View.OnLongClickListener {
    public final int f39022a;
    public final bo f39023b;

    public wf(bo boVar, int i10) {
        this.f39022a = i10;
        this.f39023b = boVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39022a) {
            case 0:
                bo boVar = this.f39023b;
                MessageObject messageObject3 = boVar.f32258d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.f32275ea).k(false).j();
                }
                return true;
            case 1:
                return bo.R0(this.f39023b);
            default:
                bo boVar2 = this.f39023b;
                int i10 = boVar2.f32397ob;
                if (i10 == 1 && (messageObject2 = boVar2.p5) != null) {
                    boVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (boVar2.f32283f5 != null && i10 == 2 && (messageObject = boVar2.f32381n5) != null) {
                    boVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
