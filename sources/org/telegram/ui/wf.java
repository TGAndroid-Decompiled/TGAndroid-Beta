package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f39182a;
    public final bo f39183b;
    public final int f39184c;
    public final ArrayList d;
    public final String e;
    public final String f39185f;
    public final Serializable h;
    public final TLRPC.InputPeer f39186n;
    public final int[] f39187r;
    public final boolean f39188s;
    public final vf v;
    public final Object f39189w;

    public wf(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f39182a = i11;
        this.f39183b = boVar;
        this.f39184c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39185f = str2;
        this.h = str3;
        this.f39186n = inputPeer;
        this.f39187r = iArr;
        this.f39189w = obj;
        this.f39188s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39182a) {
            case 0:
                boolean z10 = this.f39188s;
                vf vfVar = this.v;
                bo.U0(this.f39183b, this.f39184c, this.d, this.e, this.f39185f, (String) this.h, this.f39186n, this.f39187r, (TL_iv.RichMessage) this.f39189w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f39188s;
                vf vfVar2 = this.v;
                bo.c0(this.f39183b, this.f39184c, this.d, this.e, this.f39185f, (String) this.h, this.f39186n, this.f39187r, (CharSequence) this.f39189w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f39188s;
                vf vfVar3 = this.v;
                bo.w0(this.f39183b, this.f39184c, this.d, (String[]) this.h, this.e, this.f39185f, this.f39186n, this.f39187r, (CharSequence) this.f39189w, z12, vfVar3);
                return;
        }
    }

    public wf(bo boVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f39182a = 2;
        this.f39183b = boVar;
        this.f39184c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39185f = str2;
        this.f39186n = inputPeer;
        this.f39187r = iArr;
        this.f39189w = charSequence;
        this.f39188s = z10;
        this.v = vfVar;
    }
}
