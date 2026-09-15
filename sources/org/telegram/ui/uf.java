package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uf implements View.OnLongClickListener {
    public final int f37991a;
    public final bo f37992b;

    public uf(bo boVar, int i10) {
        this.f37991a = i10;
        this.f37992b = boVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37991a) {
            case 0:
                bo boVar = this.f37992b;
                MessageObject messageObject3 = boVar.f32280d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.f32297ea).k(false).j();
                }
                return true;
            case 1:
                return bo.R0(this.f37992b);
            default:
                bo boVar2 = this.f37992b;
                int i10 = boVar2.f32419ob;
                if (i10 == 1 && (messageObject2 = boVar2.p5) != null) {
                    boVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (boVar2.f32305f5 != null && i10 == 2 && (messageObject = boVar2.f32403n5) != null) {
                    boVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
