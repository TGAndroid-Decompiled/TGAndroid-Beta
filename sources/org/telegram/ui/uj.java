package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uj extends org.telegram.ui.Components.wo {
    public final eo f42527v0;

    public uj(eo eoVar, Context context, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, eoVar2, z10, c6Var);
        this.f42527v0 = eoVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        eo eoVar = this.f42527v0;
        if (!eoVar.Pa && !eoVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.m2) eoVar).inBubbleMode;
            if (!z10 && eoVar.f37302j0 != null && !eoVar.f37416s3) {
                if (!eoVar.K9() || eoVar.f37281h4) {
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
        eo eoVar = this.f42527v0;
        TLRPC.User user = eoVar.f37253f;
        if (user != null && user.linked_community_id != 0) {
            eoVar.showDialog(new fi.k0(eoVar, eoVar.f37253f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = eoVar.f37241e;
        if (chat != null && chat.linked_community_id != 0) {
            eoVar.showDialog(new fi.k0(eoVar, eoVar.f37241e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        eo eoVar = this.f42527v0;
        if (eoVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        eoVar.qa(str);
    }

    @Override
    public final boolean p() {
        if (this.f42527v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
