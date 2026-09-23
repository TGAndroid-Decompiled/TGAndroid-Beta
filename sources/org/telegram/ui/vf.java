package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vf implements View.OnClickListener {
    public final int f38378a;
    public final xn f38379b;
    public final int f38380c;
    public final ArrayList d;
    public final String e;
    public final String f38381f;
    public final Serializable h;
    public final TLRPC.InputPeer f38382n;
    public final int[] f38383r;
    public final boolean f38384s;
    public final uf v;
    public final Object f38385w;

    public vf(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, uf ufVar, int i11) {
        this.f38378a = i11;
        this.f38379b = xnVar;
        this.f38380c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38381f = str2;
        this.h = str3;
        this.f38382n = inputPeer;
        this.f38383r = iArr;
        this.f38385w = obj;
        this.f38384s = z10;
        this.v = ufVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38378a) {
            case 0:
                boolean z10 = this.f38384s;
                uf ufVar = this.v;
                xn.U0(this.f38379b, this.f38380c, this.d, this.e, this.f38381f, (String) this.h, this.f38382n, this.f38383r, (TL_iv.RichMessage) this.f38385w, z10, ufVar);
                return;
            case 1:
                boolean z11 = this.f38384s;
                uf ufVar2 = this.v;
                xn.d0(this.f38379b, this.f38380c, this.d, this.e, this.f38381f, (String) this.h, this.f38382n, this.f38383r, (CharSequence) this.f38385w, z11, ufVar2);
                return;
            default:
                boolean z12 = this.f38384s;
                uf ufVar3 = this.v;
                xn.x0(this.f38379b, this.f38380c, this.d, (String[]) this.h, this.e, this.f38381f, this.f38382n, this.f38383r, (CharSequence) this.f38385w, z12, ufVar3);
                return;
        }
    }

    public vf(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        this.f38378a = 2;
        this.f38379b = xnVar;
        this.f38380c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38381f = str2;
        this.f38382n = inputPeer;
        this.f38383r = iArr;
        this.f38385w = charSequence;
        this.f38384s = z10;
        this.v = ufVar;
    }
}
