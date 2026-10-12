package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.io;
public final class a implements View.OnClickListener {
    public final int f46435a;
    public final f f46436b;

    public a(f fVar, int i10) {
        this.f46435a = i10;
        this.f46436b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46435a;
        f fVar = this.f46436b;
        switch (i10) {
            case 0:
                l2.f fVar2 = fVar.f46456k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.f46455j0.keySet());
                    io ioVar = (io) fVar2.f14503b;
                    ArrayList arrayList2 = ioVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = ioVar.L0;
                    if (i11 >= 0) {
                        ioVar.f26029r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.f fVar3 = fVar.f46456k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f46455j0.keySet());
                    io ioVar2 = (io) fVar3.f14503b;
                    ArrayList arrayList4 = ioVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = ioVar2.L0;
                    if (i12 >= 0) {
                        ioVar2.f26029r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f46455j0;
                hashMap.clear();
                fVar.f46453h0.b();
                fVar.f46449d0.N(true);
                fVar.f46450e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f46445r0;
                fVar.T(view);
                return;
        }
    }
}
