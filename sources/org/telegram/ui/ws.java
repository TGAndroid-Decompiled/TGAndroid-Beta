package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ws implements View.OnClickListener {
    public final ArrayList f42941a;
    public final boolean f42942b;
    public final at f42943c;

    public ws(at atVar, ArrayList arrayList, boolean z10) {
        this.f42943c = atVar;
        this.f42941a = arrayList;
        this.f42942b = z10;
    }

    @Override
    public final void onClick(View view) {
        et etVar = this.f42943c.f35409a;
        if (etVar.f36790w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f42941a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ct ctVar = etVar.f36780l;
                    if (ctVar != null) {
                        ctVar.M(etVar.f36768a0, etVar.f36777i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(etVar.f36786r).addRecentSticker(2, etVar.f36770b0, etVar.W, (int) (System.currentTimeMillis() / 1000), this.f42942b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = etVar.W;
                    Object obj = etVar.f36770b0;
                    String str = etVar.Y;
                    ct ctVar2 = etVar.f36780l;
                    if (ctVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.f5.K(etVar.f36790w, ctVar2.a(), new a1.d(ctVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(etVar.f36786r).addRecentSticker(0, etVar.f36770b0, etVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    etVar.f36780l.i(etVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    etVar.f36780l.n(etVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    etVar.f36780l.F(etVar.W);
                }
            } else {
                ct ctVar3 = etVar.f36780l;
                if (ctVar3 != null) {
                    TLRPC.Document document2 = etVar.W;
                    String str2 = etVar.Y;
                    boolean z10 = true;
                    Object obj2 = etVar.f36770b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ctVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            etVar.p();
        }
    }
}
