package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wi extends org.telegram.ui.Components.kn {
    public final cn A0;

    public wi(cn cnVar, Context context, cn cnVar2, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, cnVar2, z9, g6Var);
        this.A0 = cnVar;
    }

    @Override
    public final boolean a() {
        boolean z9;
        cn cnVar = this.A0;
        if (!cnVar.kb && !cnVar.isInPreviewMode()) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
            if (!z9 && cnVar.f44499j0 != null && !cnVar.G3) {
                if (!cnVar.ea() || cnVar.f44652v4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        cn cnVar = this.A0;
        TLRPC.User user = cnVar.f44446f;
        if (user != null && user.linked_community_id != 0) {
            cnVar.showDialog(new ii.d0(cnVar, cnVar.f44446f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = cnVar.f44432e;
        if (chat != null && chat.linked_community_id != 0) {
            cnVar.showDialog(new ii.d0(cnVar, cnVar.f44432e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        cn cnVar = this.A0;
        if (cnVar.da()) {
            str = "";
        } else {
            str = null;
        }
        cnVar.Na(str);
    }

    @Override
    public final boolean o() {
        if (this.A0.f44451f4 == 3) {
            return true;
        }
        return false;
    }
}
