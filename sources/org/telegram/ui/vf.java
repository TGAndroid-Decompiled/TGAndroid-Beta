package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vf implements View.OnClickListener {
    public final int f41724a;
    public final yn f41725b;
    public final int f41726c;
    public final ArrayList d;
    public final String f41727e;
    public final String f41728f;
    public final Serializable h;
    public final TLRPC.InputPeer f41729n;
    public final int[] f41730r;
    public final boolean f41731s;
    public final uf v;
    public final Object f41732w;

    public vf(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, uf ufVar, int i11) {
        this.f41724a = i11;
        this.f41725b = ynVar;
        this.f41726c = i10;
        this.d = arrayList;
        this.f41727e = str;
        this.f41728f = str2;
        this.h = str3;
        this.f41729n = inputPeer;
        this.f41730r = iArr;
        this.f41732w = obj;
        this.f41731s = z10;
        this.v = ufVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41724a) {
            case 0:
                boolean z10 = this.f41731s;
                uf ufVar = this.v;
                yn.S0(this.f41725b, this.f41726c, this.d, this.f41727e, this.f41728f, (String) this.h, this.f41729n, this.f41730r, (TL_iv.RichMessage) this.f41732w, z10, ufVar);
                return;
            case 1:
                boolean z11 = this.f41731s;
                uf ufVar2 = this.v;
                yn.f0(this.f41725b, this.f41726c, this.d, this.f41727e, this.f41728f, (String) this.h, this.f41729n, this.f41730r, (CharSequence) this.f41732w, z11, ufVar2);
                return;
            default:
                boolean z12 = this.f41731s;
                uf ufVar3 = this.v;
                yn.x0(this.f41725b, this.f41726c, this.d, (String[]) this.h, this.f41727e, this.f41728f, this.f41729n, this.f41730r, (CharSequence) this.f41732w, z12, ufVar3);
                return;
        }
    }

    public vf(yn ynVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        this.f41724a = 2;
        this.f41725b = ynVar;
        this.f41726c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f41727e = str;
        this.f41728f = str2;
        this.f41729n = inputPeer;
        this.f41730r = iArr;
        this.f41732w = charSequence;
        this.f41731s = z10;
        this.v = ufVar;
    }
}
