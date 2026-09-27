package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f39629a;
    public final xn f39630b;
    public final int f39631c;
    public final ArrayList d;
    public final String e;
    public final String f39632f;
    public final Serializable h;
    public final TLRPC.InputPeer f39633n;
    public final int[] f39634r;
    public final boolean f39635s;
    public final wf v;
    public final Object f39636w;

    public xf(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f39629a = i11;
        this.f39630b = xnVar;
        this.f39631c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39632f = str2;
        this.h = str3;
        this.f39633n = inputPeer;
        this.f39634r = iArr;
        this.f39636w = obj;
        this.f39635s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39629a) {
            case 0:
                boolean z10 = this.f39635s;
                wf wfVar = this.v;
                xn.Y(this.f39630b, this.f39631c, this.d, this.e, this.f39632f, (String) this.h, this.f39633n, this.f39634r, (TL_iv.RichMessage) this.f39636w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f39635s;
                wf wfVar2 = this.v;
                xn.w0(this.f39630b, this.f39631c, this.d, this.e, this.f39632f, (String) this.h, this.f39633n, this.f39634r, (CharSequence) this.f39636w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f39635s;
                wf wfVar3 = this.v;
                xn.W0(this.f39630b, this.f39631c, this.d, (String[]) this.h, this.e, this.f39632f, this.f39633n, this.f39634r, (CharSequence) this.f39636w, z12, wfVar3);
                return;
        }
    }

    public xf(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f39629a = 2;
        this.f39630b = xnVar;
        this.f39631c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39632f = str2;
        this.f39633n = inputPeer;
        this.f39634r = iArr;
        this.f39636w = charSequence;
        this.f39635s = z10;
        this.v = wfVar;
    }
}
