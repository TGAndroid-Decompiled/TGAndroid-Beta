package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ys implements View.OnClickListener {
    public final ArrayList f43473a;
    public final boolean f43474b;
    public final ct f43475c;

    public ys(ct ctVar, ArrayList arrayList, boolean z10) {
        this.f43475c = ctVar;
        this.f43473a = arrayList;
        this.f43474b = z10;
    }

    @Override
    public final void onClick(View view) {
        gt gtVar = this.f43475c.f35984a;
        if (gtVar.f37332w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f43473a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    et etVar = gtVar.f37322l;
                    if (etVar != null) {
                        etVar.M(gtVar.f37310a0, gtVar.f37319i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(gtVar.f37328r).addRecentSticker(2, gtVar.f37312b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.f43474b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = gtVar.W;
                    Object obj = gtVar.f37312b0;
                    String str = gtVar.Y;
                    et etVar2 = gtVar.f37322l;
                    if (etVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.f5.K(gtVar.f37332w, etVar2.a(), new a1.d(etVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(gtVar.f37328r).addRecentSticker(0, gtVar.f37312b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    gtVar.f37322l.i(gtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    gtVar.f37322l.n(gtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    gtVar.f37322l.F(gtVar.W);
                }
            } else {
                et etVar3 = gtVar.f37322l;
                if (etVar3 != null) {
                    TLRPC.Document document2 = gtVar.W;
                    String str2 = gtVar.Y;
                    boolean z10 = true;
                    Object obj2 = gtVar.f37312b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    etVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            gtVar.p();
        }
    }
}
