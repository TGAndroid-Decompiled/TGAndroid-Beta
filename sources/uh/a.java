package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m.h;
import org.telegram.ui.Components.io;
public final class a implements View.OnClickListener {
    public final int f46434a;
    public final f f46435b;

    public a(f fVar, int i10) {
        this.f46434a = i10;
        this.f46435b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46434a;
        f fVar = this.f46435b;
        switch (i10) {
            case 0:
                h hVar = fVar.f46455k0;
                if (hVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f46454j0.keySet());
                    io ioVar = (io) hVar.f14848b;
                    ArrayList arrayList2 = ioVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = ioVar.L0;
                    if (i11 >= 0) {
                        ioVar.f25692r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                h hVar2 = fVar.f46455k0;
                if (hVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f46454j0.keySet());
                    io ioVar2 = (io) hVar2.f14848b;
                    ArrayList arrayList4 = ioVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = ioVar2.L0;
                    if (i12 >= 0) {
                        ioVar2.f25692r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f46454j0;
                hashMap.clear();
                fVar.f46452h0.b();
                fVar.f46448d0.N(true);
                fVar.f46449e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f46444r0;
                fVar.T(view);
                return;
        }
    }
}
