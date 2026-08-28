package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zs implements View.OnClickListener {
    public final ArrayList f45243a;
    public final boolean f45244b;
    public final dt f45245c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.f45245c = dtVar;
        this.f45243a = arrayList;
        this.f45244b = z10;
    }

    @Override
    public final void onClick(View view) {
        ht htVar = this.f45245c.f37593a;
        if (htVar.f38933w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45243a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ft ftVar = htVar.f38923l;
                    if (ftVar != null) {
                        ftVar.M(htVar.f38910a0, htVar.f38920i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(htVar.f38929r).addRecentSticker(2, htVar.f38912b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f45244b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = htVar.W;
                    Object obj = htVar.f38912b0;
                    String str = htVar.Y;
                    ft ftVar2 = htVar.f38923l;
                    if (ftVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.y4.L(htVar.f38933w, ftVar2.a(), new a1.d(ftVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(htVar.f38929r).addRecentSticker(0, htVar.f38912b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    htVar.f38923l.i(htVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    htVar.f38923l.n(htVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    htVar.f38923l.E(htVar.W);
                }
            } else {
                ft ftVar3 = htVar.f38923l;
                if (ftVar3 != null) {
                    TLRPC.Document document2 = htVar.W;
                    String str2 = htVar.Y;
                    boolean z10 = true;
                    Object obj2 = htVar.f38912b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ftVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            htVar.p();
        }
    }
}
