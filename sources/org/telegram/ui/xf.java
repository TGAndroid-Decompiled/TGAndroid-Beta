package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f44059a;
    public final zn f44060b;
    public final int f44061c;
    public final ArrayList d;
    public final String f44062e;
    public final String f44063f;
    public final Serializable h;
    public final TLRPC.InputPeer f44064n;
    public final int[] f44065r;
    public final boolean f44066s;
    public final wf v;
    public final Object f44067w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f44059a = i11;
        this.f44060b = znVar;
        this.f44061c = i10;
        this.d = arrayList;
        this.f44062e = str;
        this.f44063f = str2;
        this.h = str3;
        this.f44064n = inputPeer;
        this.f44065r = iArr;
        this.f44067w = obj;
        this.f44066s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44059a) {
            case 0:
                boolean z10 = this.f44066s;
                wf wfVar = this.v;
                zn.b0(this.f44060b, this.f44061c, this.d, this.f44062e, this.f44063f, (String) this.h, this.f44064n, this.f44065r, (TL_iv.RichMessage) this.f44067w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f44066s;
                wf wfVar2 = this.v;
                zn.d0(this.f44060b, this.f44061c, this.d, this.f44062e, this.f44063f, (String) this.h, this.f44064n, this.f44065r, (CharSequence) this.f44067w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f44066s;
                wf wfVar3 = this.v;
                zn.t0(this.f44060b, this.f44061c, this.d, (String[]) this.h, this.f44062e, this.f44063f, this.f44064n, this.f44065r, (CharSequence) this.f44067w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f44059a = 2;
        this.f44060b = znVar;
        this.f44061c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f44062e = str;
        this.f44063f = str2;
        this.f44064n = inputPeer;
        this.f44065r = iArr;
        this.f44067w = charSequence;
        this.f44066s = z10;
        this.v = wfVar;
    }
}
