package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vf implements View.OnClickListener {
    public final int f41725a;
    public final yn f41726b;
    public final int f41727c;
    public final ArrayList d;
    public final String f41728e;
    public final String f41729f;
    public final Serializable h;
    public final TLRPC.InputPeer f41730n;
    public final int[] f41731r;
    public final boolean f41732s;
    public final uf v;
    public final Object f41733w;

    public vf(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, uf ufVar, int i11) {
        this.f41725a = i11;
        this.f41726b = ynVar;
        this.f41727c = i10;
        this.d = arrayList;
        this.f41728e = str;
        this.f41729f = str2;
        this.h = str3;
        this.f41730n = inputPeer;
        this.f41731r = iArr;
        this.f41733w = obj;
        this.f41732s = z10;
        this.v = ufVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41725a) {
            case 0:
                boolean z10 = this.f41732s;
                uf ufVar = this.v;
                yn.S0(this.f41726b, this.f41727c, this.d, this.f41728e, this.f41729f, (String) this.h, this.f41730n, this.f41731r, (TL_iv.RichMessage) this.f41733w, z10, ufVar);
                return;
            case 1:
                boolean z11 = this.f41732s;
                uf ufVar2 = this.v;
                yn.f0(this.f41726b, this.f41727c, this.d, this.f41728e, this.f41729f, (String) this.h, this.f41730n, this.f41731r, (CharSequence) this.f41733w, z11, ufVar2);
                return;
            default:
                boolean z12 = this.f41732s;
                uf ufVar3 = this.v;
                yn.x0(this.f41726b, this.f41727c, this.d, (String[]) this.h, this.f41728e, this.f41729f, this.f41730n, this.f41731r, (CharSequence) this.f41733w, z12, ufVar3);
                return;
        }
    }

    public vf(yn ynVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        this.f41725a = 2;
        this.f41726b = ynVar;
        this.f41727c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f41728e = str;
        this.f41729f = str2;
        this.f41730n = inputPeer;
        this.f41731r = iArr;
        this.f41733w = charSequence;
        this.f41732s = z10;
        this.v = ufVar;
    }
}
