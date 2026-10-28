package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zs implements View.OnClickListener {
    public final ArrayList f46352a;
    public final boolean f46353b;
    public final dt f46354c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.f46354c = dtVar;
        this.f46352a = arrayList;
        this.f46353b = z10;
    }

    @Override
    public final void onClick(View view) {
        ht htVar = this.f46354c.f38675a;
        if (htVar.f39984w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f46352a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ft ftVar = htVar.f39974l;
                    if (ftVar != null) {
                        ftVar.L(htVar.f39962a0, htVar.f39971i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(htVar.f39980r).addRecentSticker(2, htVar.f39964b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f46353b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = htVar.W;
                    Object obj = htVar.f39964b0;
                    String str = htVar.Y;
                    ft ftVar2 = htVar.f39974l;
                    if (ftVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(htVar.f39984w, ftVar2.a(), new a1.d(ftVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(htVar.f39980r).addRecentSticker(0, htVar.f39964b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    htVar.f39974l.j(htVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    htVar.f39974l.o(htVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    htVar.f39974l.E(htVar.W);
                }
            } else {
                ft ftVar3 = htVar.f39974l;
                if (ftVar3 != null) {
                    TLRPC.Document document2 = htVar.W;
                    String str2 = htVar.Y;
                    boolean z10 = true;
                    Object obj2 = htVar.f39964b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ftVar3.m(document2, str2, obj2, z10, 0, 0);
                }
            }
            htVar.n();
        }
    }
}
