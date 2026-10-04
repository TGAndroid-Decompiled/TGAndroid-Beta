package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vf implements View.OnClickListener {
    public final int f41732a;
    public final yn f41733b;
    public final int f41734c;
    public final ArrayList d;
    public final String f41735e;
    public final String f41736f;
    public final Serializable h;
    public final TLRPC.InputPeer f41737n;
    public final int[] f41738r;
    public final boolean f41739s;
    public final uf v;
    public final Object f41740w;

    public vf(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, uf ufVar, int i11) {
        this.f41732a = i11;
        this.f41733b = ynVar;
        this.f41734c = i10;
        this.d = arrayList;
        this.f41735e = str;
        this.f41736f = str2;
        this.h = str3;
        this.f41737n = inputPeer;
        this.f41738r = iArr;
        this.f41740w = obj;
        this.f41739s = z10;
        this.v = ufVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41732a) {
            case 0:
                boolean z10 = this.f41739s;
                uf ufVar = this.v;
                yn.S0(this.f41733b, this.f41734c, this.d, this.f41735e, this.f41736f, (String) this.h, this.f41737n, this.f41738r, (TL_iv.RichMessage) this.f41740w, z10, ufVar);
                return;
            case 1:
                boolean z11 = this.f41739s;
                uf ufVar2 = this.v;
                yn.f0(this.f41733b, this.f41734c, this.d, this.f41735e, this.f41736f, (String) this.h, this.f41737n, this.f41738r, (CharSequence) this.f41740w, z11, ufVar2);
                return;
            default:
                boolean z12 = this.f41739s;
                uf ufVar3 = this.v;
                yn.x0(this.f41733b, this.f41734c, this.d, (String[]) this.h, this.f41735e, this.f41736f, this.f41737n, this.f41738r, (CharSequence) this.f41740w, z12, ufVar3);
                return;
        }
    }

    public vf(yn ynVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        this.f41732a = 2;
        this.f41733b = ynVar;
        this.f41734c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f41735e = str;
        this.f41736f = str2;
        this.f41737n = inputPeer;
        this.f41738r = iArr;
        this.f41740w = charSequence;
        this.f41739s = z10;
        this.v = ufVar;
    }
}
