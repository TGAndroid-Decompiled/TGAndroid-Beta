package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f39570a;
    public final zn f39571b;
    public final int f39572c;
    public final ArrayList d;
    public final String e;
    public final String f39573f;
    public final Serializable h;
    public final TLRPC.InputPeer f39574n;
    public final int[] f39575r;
    public final boolean f39576s;
    public final wf v;
    public final Object f39577w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f39570a = i11;
        this.f39571b = znVar;
        this.f39572c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39573f = str2;
        this.h = str3;
        this.f39574n = inputPeer;
        this.f39575r = iArr;
        this.f39577w = obj;
        this.f39576s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39570a) {
            case 0:
                boolean z10 = this.f39576s;
                wf wfVar = this.v;
                zn.Y(this.f39571b, this.f39572c, this.d, this.e, this.f39573f, (String) this.h, this.f39574n, this.f39575r, (TL_iv.RichMessage) this.f39577w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f39576s;
                wf wfVar2 = this.v;
                zn.x0(this.f39571b, this.f39572c, this.d, this.e, this.f39573f, (String) this.h, this.f39574n, this.f39575r, (CharSequence) this.f39577w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f39576s;
                wf wfVar3 = this.v;
                zn.W0(this.f39571b, this.f39572c, this.d, (String[]) this.h, this.e, this.f39573f, this.f39574n, this.f39575r, (CharSequence) this.f39577w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f39570a = 2;
        this.f39571b = znVar;
        this.f39572c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39573f = str2;
        this.f39574n = inputPeer;
        this.f39575r = iArr;
        this.f39577w = charSequence;
        this.f39576s = z10;
        this.v = wfVar;
    }
}
