package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wi extends org.telegram.ui.Components.jn {
    public final cn A0;

    public wi(cn cnVar, Context context, cn cnVar2, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, cnVar2, z9, h6Var);
        this.A0 = cnVar;
    }

    @Override
    public final boolean a() {
        boolean z9;
        cn cnVar = this.A0;
        if (!cnVar.kb && !cnVar.isInPreviewMode()) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
            if (!z9 && cnVar.f44540j0 != null && !cnVar.G3) {
                if (!cnVar.ea() || cnVar.f44693v4) {
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
        TLRPC.User user = cnVar.f44487f;
        if (user != null && user.linked_community_id != 0) {
            cnVar.showDialog(new ii.d0(cnVar, cnVar.f44487f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = cnVar.f44473e;
        if (chat != null && chat.linked_community_id != 0) {
            cnVar.showDialog(new ii.d0(cnVar, cnVar.f44473e.linked_community_id, null, null));
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
        if (this.A0.f44492f4 == 3) {
            return true;
        }
        return false;
    }
}
