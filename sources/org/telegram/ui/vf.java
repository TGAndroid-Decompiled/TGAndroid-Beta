package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vf implements View.OnClickListener {
    public final int f41737a;
    public final yn f41738b;
    public final int f41739c;
    public final ArrayList d;
    public final String f41740e;
    public final String f41741f;
    public final Serializable h;
    public final TLRPC.InputPeer f41742n;
    public final int[] f41743r;
    public final boolean f41744s;
    public final uf v;
    public final Object f41745w;

    public vf(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, uf ufVar, int i11) {
        this.f41737a = i11;
        this.f41738b = ynVar;
        this.f41739c = i10;
        this.d = arrayList;
        this.f41740e = str;
        this.f41741f = str2;
        this.h = str3;
        this.f41742n = inputPeer;
        this.f41743r = iArr;
        this.f41745w = obj;
        this.f41744s = z10;
        this.v = ufVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41737a) {
            case 0:
                boolean z10 = this.f41744s;
                uf ufVar = this.v;
                yn.S0(this.f41738b, this.f41739c, this.d, this.f41740e, this.f41741f, (String) this.h, this.f41742n, this.f41743r, (TL_iv.RichMessage) this.f41745w, z10, ufVar);
                return;
            case 1:
                boolean z11 = this.f41744s;
                uf ufVar2 = this.v;
                yn.f0(this.f41738b, this.f41739c, this.d, this.f41740e, this.f41741f, (String) this.h, this.f41742n, this.f41743r, (CharSequence) this.f41745w, z11, ufVar2);
                return;
            default:
                boolean z12 = this.f41744s;
                uf ufVar3 = this.v;
                yn.x0(this.f41738b, this.f41739c, this.d, (String[]) this.h, this.f41740e, this.f41741f, this.f41742n, this.f41743r, (CharSequence) this.f41745w, z12, ufVar3);
                return;
        }
    }

    public vf(yn ynVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        this.f41737a = 2;
        this.f41738b = ynVar;
        this.f41739c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f41740e = str;
        this.f41741f = str2;
        this.f41742n = inputPeer;
        this.f41743r = iArr;
        this.f41745w = charSequence;
        this.f41744s = z10;
        this.v = ufVar;
    }
}
