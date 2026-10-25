package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class xs implements View.OnClickListener {
    public final ArrayList f45845a;
    public final boolean f45846b;
    public final bt f45847c;

    public xs(bt btVar, ArrayList arrayList, boolean z10) {
        this.f45847c = btVar;
        this.f45845a = arrayList;
        this.f45846b = z10;
    }

    @Override
    public final void onClick(View view) {
        ft ftVar = this.f45847c.f38155a;
        if (ftVar.f39466w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45845a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    dt dtVar = ftVar.f39456l;
                    if (dtVar != null) {
                        dtVar.L(ftVar.f39444a0, ftVar.f39453i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ftVar.f39462r).addRecentSticker(2, ftVar.f39446b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.f45846b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ftVar.W;
                    Object obj = ftVar.f39446b0;
                    String str = ftVar.Y;
                    dt dtVar2 = ftVar.f39456l;
                    if (dtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(ftVar.f39466w, dtVar2.a(), new a1.d(dtVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ftVar.f39462r).addRecentSticker(0, ftVar.f39446b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ftVar.f39456l.j(ftVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ftVar.f39456l.o(ftVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ftVar.f39456l.E(ftVar.W);
                }
            } else {
                dt dtVar3 = ftVar.f39456l;
                if (dtVar3 != null) {
                    TLRPC.Document document2 = ftVar.W;
                    String str2 = ftVar.Y;
                    boolean z10 = true;
                    Object obj2 = ftVar.f39446b0;
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
