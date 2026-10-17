package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rf implements View.OnClickListener {
    public final int f40717a;
    public final sn f40718b;
    public final int f40719c;
    public final ArrayList d;
    public final String e;
    public final String f40720f;
    public final Serializable h;
    public final TLRPC.InputPeer f40721n;
    public final int[] f40722r;
    public final boolean f40723s;
    public final qf v;
    public final Object f40724w;

    public rf(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, qf qfVar, int i11) {
        this.f40717a = i11;
        this.f40718b = snVar;
        this.f40719c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40720f = str2;
        this.h = str3;
        this.f40721n = inputPeer;
        this.f40722r = iArr;
        this.f40724w = obj;
        this.f40723s = z10;
        this.v = qfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40717a) {
            case 0:
                boolean z10 = this.f40723s;
                qf qfVar = this.v;
                sn.b0(this.f40718b, this.f40719c, this.d, this.e, this.f40720f, (String) this.h, this.f40721n, this.f40722r, (TL_iv.RichMessage) this.f40724w, z10, qfVar);
                return;
            case 1:
                boolean z11 = this.f40723s;
                qf qfVar2 = this.v;
                sn.d0(this.f40718b, this.f40719c, this.d, this.e, this.f40720f, (String) this.h, this.f40721n, this.f40722r, (CharSequence) this.f40724w, z11, qfVar2);
                return;
            default:
                boolean z12 = this.f40723s;
                qf qfVar3 = this.v;
                sn.t0(this.f40718b, this.f40719c, this.d, (String[]) this.h, this.e, this.f40720f, this.f40721n, this.f40722r, (CharSequence) this.f40724w, z12, qfVar3);
                return;
        }
    }

    public rf(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, qf qfVar) {
        this.f40717a = 2;
        this.f40718b = snVar;
        this.f40719c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40720f = str2;
        this.f40721n = inputPeer;
        this.f40722r = iArr;
        this.f40724w = charSequence;
        this.f40723s = z10;
        this.v = qfVar;
    }
}
