package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uf implements View.OnLongClickListener {
    public final int f37963a;
    public final bo f37964b;

    public uf(bo boVar, int i10) {
        this.f37963a = i10;
        this.f37964b = boVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37963a) {
            case 0:
                bo boVar = this.f37964b;
                MessageObject messageObject3 = boVar.f32276d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.f32293ea).k(false).j();
                }
                return true;
            case 1:
                return bo.R0(this.f37964b);
            default:
                bo boVar2 = this.f37964b;
                int i10 = boVar2.nb;
                if (i10 == 1 && (messageObject2 = boVar2.p5) != null) {
                    boVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (boVar2.f32301f5 != null && i10 == 2 && (messageObject = boVar2.f32398n5) != null) {
                    boVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
