package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f39448a;
    public final zn f39449b;
    public final int f39450c;
    public final ArrayList d;
    public final String e;
    public final String f39451f;
    public final Serializable h;
    public final TLRPC.InputPeer f39452n;
    public final int[] f39453r;
    public final boolean f39454s;
    public final wf v;
    public final Object f39455w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f39448a = i11;
        this.f39449b = znVar;
        this.f39450c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39451f = str2;
        this.h = str3;
        this.f39452n = inputPeer;
        this.f39453r = iArr;
        this.f39455w = obj;
        this.f39454s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39448a) {
            case 0:
                boolean z10 = this.f39454s;
                wf wfVar = this.v;
                zn.Y(this.f39449b, this.f39450c, this.d, this.e, this.f39451f, (String) this.h, this.f39452n, this.f39453r, (TL_iv.RichMessage) this.f39455w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f39454s;
                wf wfVar2 = this.v;
                zn.x0(this.f39449b, this.f39450c, this.d, this.e, this.f39451f, (String) this.h, this.f39452n, this.f39453r, (CharSequence) this.f39455w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f39454s;
                wf wfVar3 = this.v;
                zn.W0(this.f39449b, this.f39450c, this.d, (String[]) this.h, this.e, this.f39451f, this.f39452n, this.f39453r, (CharSequence) this.f39455w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f39448a = 2;
        this.f39449b = znVar;
        this.f39450c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39451f = str2;
        this.f39452n = inputPeer;
        this.f39453r = iArr;
        this.f39455w = charSequence;
        this.f39454s = z10;
        this.v = wfVar;
    }
}
