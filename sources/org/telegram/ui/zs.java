package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zs implements View.OnClickListener {
    public final ArrayList f44196a;
    public final boolean f44197b;
    public final dt f44198c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.f44198c = dtVar;
        this.f44196a = arrayList;
        this.f44197b = z10;
    }

    @Override
    public final void onClick(View view) {
        ht htVar = this.f44198c.f36729a;
        if (htVar.f37955w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f44196a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ft ftVar = htVar.f37945l;
                    if (ftVar != null) {
                        ftVar.M(htVar.f37933a0, htVar.f37942i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(htVar.f37951r).addRecentSticker(2, htVar.f37935b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.f44197b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = htVar.W;
                    Object obj = htVar.f37935b0;
                    String str = htVar.Y;
                    ft ftVar2 = htVar.f37945l;
                    if (ftVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.f5.L(htVar.f37955w, ftVar2.a(), new a1.d(ftVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(htVar.f37951r).addRecentSticker(0, htVar.f37935b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    htVar.f37945l.i(htVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    htVar.f37945l.n(htVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    htVar.f37945l.F(htVar.W);
                }
            } else {
                ft ftVar3 = htVar.f37945l;
                if (ftVar3 != null) {
                    TLRPC.Document document2 = htVar.W;
                    String str2 = htVar.Y;
                    boolean z10 = true;
                    Object obj2 = htVar.f37935b0;
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
