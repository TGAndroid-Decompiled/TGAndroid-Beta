package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f44013a;
    public final zn f44014b;
    public final int f44015c;
    public final ArrayList d;
    public final String f44016e;
    public final String f44017f;
    public final Serializable h;
    public final TLRPC.InputPeer f44018n;
    public final int[] f44019r;
    public final boolean f44020s;
    public final wf v;
    public final Object f44021w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f44013a = i11;
        this.f44014b = znVar;
        this.f44015c = i10;
        this.d = arrayList;
        this.f44016e = str;
        this.f44017f = str2;
        this.h = str3;
        this.f44018n = inputPeer;
        this.f44019r = iArr;
        this.f44021w = obj;
        this.f44020s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44013a) {
            case 0:
                boolean z10 = this.f44020s;
                wf wfVar = this.v;
                zn.b0(this.f44014b, this.f44015c, this.d, this.f44016e, this.f44017f, (String) this.h, this.f44018n, this.f44019r, (TL_iv.RichMessage) this.f44021w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f44020s;
                wf wfVar2 = this.v;
                zn.d0(this.f44014b, this.f44015c, this.d, this.f44016e, this.f44017f, (String) this.h, this.f44018n, this.f44019r, (CharSequence) this.f44021w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f44020s;
                wf wfVar3 = this.v;
                zn.t0(this.f44014b, this.f44015c, this.d, (String[]) this.h, this.f44016e, this.f44017f, this.f44018n, this.f44019r, (CharSequence) this.f44021w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f44013a = 2;
        this.f44014b = znVar;
        this.f44015c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f44016e = str;
        this.f44017f = str2;
        this.f44018n = inputPeer;
        this.f44019r = iArr;
        this.f44021w = charSequence;
        this.f44020s = z10;
        this.v = wfVar;
    }
}
