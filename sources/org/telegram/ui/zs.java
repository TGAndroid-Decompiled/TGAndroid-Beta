package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zs implements View.OnClickListener {
    public final ArrayList f45309a;
    public final boolean f45310b;
    public final dt f45311c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.f45311c = dtVar;
        this.f45309a = arrayList;
        this.f45310b = z10;
    }

    @Override
    public final void onClick(View view) {
        ht htVar = this.f45311c.f37629a;
        if (htVar.f39042w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45309a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ft ftVar = htVar.f39032l;
                    if (ftVar != null) {
                        ftVar.M(htVar.f39019a0, htVar.f39029i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(htVar.f39038r).addRecentSticker(2, htVar.f39021b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f45310b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = htVar.W;
                    Object obj = htVar.f39021b0;
                    String str = htVar.Y;
                    ft ftVar2 = htVar.f39032l;
                    if (ftVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.c5.L(htVar.f39042w, ftVar2.a(), new a1.d(ftVar2, document, str, obj, 11));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(htVar.f39038r).addRecentSticker(0, htVar.f39021b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    htVar.f39032l.i(htVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    htVar.f39032l.n(htVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    htVar.f39032l.D(htVar.W);
                }
            } else {
                ft ftVar3 = htVar.f39032l;
                if (ftVar3 != null) {
                    TLRPC.Document document2 = htVar.W;
                    String str2 = htVar.Y;
                    boolean z10 = true;
                    Object obj2 = htVar.f39021b0;
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
