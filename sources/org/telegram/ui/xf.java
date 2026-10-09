package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f44015a;
    public final zn f44016b;
    public final int f44017c;
    public final ArrayList d;
    public final String f44018e;
    public final String f44019f;
    public final Serializable h;
    public final TLRPC.InputPeer f44020n;
    public final int[] f44021r;
    public final boolean f44022s;
    public final wf v;
    public final Object f44023w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f44015a = i11;
        this.f44016b = znVar;
        this.f44017c = i10;
        this.d = arrayList;
        this.f44018e = str;
        this.f44019f = str2;
        this.h = str3;
        this.f44020n = inputPeer;
        this.f44021r = iArr;
        this.f44023w = obj;
        this.f44022s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44015a) {
            case 0:
                boolean z10 = this.f44022s;
                wf wfVar = this.v;
                zn.b0(this.f44016b, this.f44017c, this.d, this.f44018e, this.f44019f, (String) this.h, this.f44020n, this.f44021r, (TL_iv.RichMessage) this.f44023w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f44022s;
                wf wfVar2 = this.v;
                zn.d0(this.f44016b, this.f44017c, this.d, this.f44018e, this.f44019f, (String) this.h, this.f44020n, this.f44021r, (CharSequence) this.f44023w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f44022s;
                wf wfVar3 = this.v;
                zn.t0(this.f44016b, this.f44017c, this.d, (String[]) this.h, this.f44018e, this.f44019f, this.f44020n, this.f44021r, (CharSequence) this.f44023w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f44015a = 2;
        this.f44016b = znVar;
        this.f44017c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f44018e = str;
        this.f44019f = str2;
        this.f44020n = inputPeer;
        this.f44021r = iArr;
        this.f44023w = charSequence;
        this.f44022s = z10;
        this.v = wfVar;
    }
}
