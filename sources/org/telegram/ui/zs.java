package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zs implements View.OnClickListener {
    public final ArrayList f44200a;
    public final boolean f44201b;
    public final dt f44202c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.f44202c = dtVar;
        this.f44200a = arrayList;
        this.f44201b = z10;
    }

    @Override
    public final void onClick(View view) {
        ht htVar = this.f44202c.f36721a;
        if (htVar.f38006w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f44200a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ft ftVar = htVar.f37996l;
                    if (ftVar != null) {
                        ftVar.M(htVar.f37984a0, htVar.f37993i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(htVar.f38002r).addRecentSticker(2, htVar.f37986b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f44201b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = htVar.W;
                    Object obj = htVar.f37986b0;
                    String str = htVar.Y;
                    ft ftVar2 = htVar.f37996l;
                    if (ftVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.d5.K(htVar.f38006w, ftVar2.a(), new a1.d(ftVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(htVar.f38002r).addRecentSticker(0, htVar.f37986b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    htVar.f37996l.i(htVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    htVar.f37996l.n(htVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    htVar.f37996l.F(htVar.W);
                }
            } else {
                ft ftVar3 = htVar.f37996l;
                if (ftVar3 != null) {
                    TLRPC.Document document2 = htVar.W;
                    String str2 = htVar.Y;
                    boolean z10 = true;
                    Object obj2 = htVar.f37986b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ftVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            htVar.n();
        }
    }
}
