package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ys implements View.OnClickListener {
    public final ArrayList f43463a;
    public final boolean f43464b;
    public final ct f43465c;

    public ys(ct ctVar, ArrayList arrayList, boolean z10) {
        this.f43465c = ctVar;
        this.f43463a = arrayList;
        this.f43464b = z10;
    }

    @Override
    public final void onClick(View view) {
        gt gtVar = this.f43465c.f35970a;
        if (gtVar.f37313w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f43463a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    et etVar = gtVar.f37303l;
                    if (etVar != null) {
                        etVar.M(gtVar.f37291a0, gtVar.f37300i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(gtVar.f37309r).addRecentSticker(2, gtVar.f37293b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.f43464b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = gtVar.W;
                    Object obj = gtVar.f37293b0;
                    String str = gtVar.Y;
                    et etVar2 = gtVar.f37303l;
                    if (etVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.f5.K(gtVar.f37313w, etVar2.a(), new a1.d(etVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(gtVar.f37309r).addRecentSticker(0, gtVar.f37293b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    gtVar.f37303l.i(gtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    gtVar.f37303l.n(gtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    gtVar.f37303l.F(gtVar.W);
                }
            } else {
                et etVar3 = gtVar.f37303l;
                if (etVar3 != null) {
                    TLRPC.Document document2 = gtVar.W;
                    String str2 = gtVar.Y;
                    boolean z10 = true;
                    Object obj2 = gtVar.f37293b0;
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
