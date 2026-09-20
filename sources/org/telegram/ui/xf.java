package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f39546a;
    public final zn f39547b;
    public final int f39548c;
    public final ArrayList d;
    public final String e;
    public final String f39549f;
    public final Serializable h;
    public final TLRPC.InputPeer f39550n;
    public final int[] f39551r;
    public final boolean f39552s;
    public final wf v;
    public final Object f39553w;

    public xf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f39546a = i11;
        this.f39547b = znVar;
        this.f39548c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39549f = str2;
        this.h = str3;
        this.f39550n = inputPeer;
        this.f39551r = iArr;
        this.f39553w = obj;
        this.f39552s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39546a) {
            case 0:
                boolean z10 = this.f39552s;
                wf wfVar = this.v;
                zn.Y(this.f39547b, this.f39548c, this.d, this.e, this.f39549f, (String) this.h, this.f39550n, this.f39551r, (TL_iv.RichMessage) this.f39553w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f39552s;
                wf wfVar2 = this.v;
                zn.x0(this.f39547b, this.f39548c, this.d, this.e, this.f39549f, (String) this.h, this.f39550n, this.f39551r, (CharSequence) this.f39553w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f39552s;
                wf wfVar3 = this.v;
                zn.W0(this.f39547b, this.f39548c, this.d, (String[]) this.h, this.e, this.f39549f, this.f39550n, this.f39551r, (CharSequence) this.f39553w, z12, wfVar3);
                return;
        }
    }

    public xf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f39546a = 2;
        this.f39547b = znVar;
        this.f39548c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39549f = str2;
        this.f39550n = inputPeer;
        this.f39551r = iArr;
        this.f39553w = charSequence;
        this.f39552s = z10;
        this.v = wfVar;
    }
}
