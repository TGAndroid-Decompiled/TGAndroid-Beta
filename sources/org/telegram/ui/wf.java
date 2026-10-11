package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f43756a;
    public final zn f43757b;
    public final int f43758c;
    public final ArrayList d;
    public final String f43759e;
    public final String f43760f;
    public final Serializable h;
    public final TLRPC.InputPeer f43761n;
    public final int[] f43762r;
    public final boolean f43763s;
    public final vf v;
    public final Object f43764w;

    public wf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f43756a = i11;
        this.f43757b = znVar;
        this.f43758c = i10;
        this.d = arrayList;
        this.f43759e = str;
        this.f43760f = str2;
        this.h = str3;
        this.f43761n = inputPeer;
        this.f43762r = iArr;
        this.f43764w = obj;
        this.f43763s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43756a) {
            case 0:
                boolean z10 = this.f43763s;
                vf vfVar = this.v;
                zn.b0(this.f43757b, this.f43758c, this.d, this.f43759e, this.f43760f, (String) this.h, this.f43761n, this.f43762r, (TL_iv.RichMessage) this.f43764w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f43763s;
                vf vfVar2 = this.v;
                zn.d0(this.f43757b, this.f43758c, this.d, this.f43759e, this.f43760f, (String) this.h, this.f43761n, this.f43762r, (CharSequence) this.f43764w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f43763s;
                vf vfVar3 = this.v;
                zn.t0(this.f43757b, this.f43758c, this.d, (String[]) this.h, this.f43759e, this.f43760f, this.f43761n, this.f43762r, (CharSequence) this.f43764w, z12, vfVar3);
                return;
        }
    }

    public wf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f43756a = 2;
        this.f43757b = znVar;
        this.f43758c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f43759e = str;
        this.f43760f = str2;
        this.f43761n = inputPeer;
        this.f43762r = iArr;
        this.f43764w = charSequence;
        this.f43763s = z10;
        this.v = vfVar;
    }
}
