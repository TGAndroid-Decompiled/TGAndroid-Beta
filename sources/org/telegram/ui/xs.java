package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class xs implements View.OnClickListener {
    public final ArrayList f45848a;
    public final boolean f45849b;
    public final bt f45850c;

    public xs(bt btVar, ArrayList arrayList, boolean z10) {
        this.f45850c = btVar;
        this.f45848a = arrayList;
        this.f45849b = z10;
    }

    @Override
    public final void onClick(View view) {
        ft ftVar = this.f45850c.f38158a;
        if (ftVar.f39469w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45848a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    dt dtVar = ftVar.f39459l;
                    if (dtVar != null) {
                        dtVar.L(ftVar.f39447a0, ftVar.f39456i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ftVar.f39465r).addRecentSticker(2, ftVar.f39449b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.f45849b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ftVar.W;
                    Object obj = ftVar.f39449b0;
                    String str = ftVar.Y;
                    dt dtVar2 = ftVar.f39459l;
                    if (dtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(ftVar.f39469w, dtVar2.a(), new a1.d(dtVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ftVar.f39465r).addRecentSticker(0, ftVar.f39449b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ftVar.f39459l.j(ftVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ftVar.f39459l.o(ftVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ftVar.f39459l.E(ftVar.W);
                }
            } else {
                dt dtVar3 = ftVar.f39459l;
                if (dtVar3 != null) {
                    TLRPC.Document document2 = ftVar.W;
                    String str2 = ftVar.Y;
                    boolean z10 = true;
                    Object obj2 = ftVar.f39449b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    dtVar3.m(document2, str2, obj2, z10, 0, 0);
                }
            }
            ftVar.n();
        }
    }
}
