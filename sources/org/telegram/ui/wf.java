package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f42371a;
    public final co f42372b;
    public final int f42373c;
    public final ArrayList d;
    public final String f42374e;
    public final String f42375f;
    public final Serializable h;
    public final TLRPC.InputPeer f42376n;
    public final int[] f42377r;
    public final boolean f42378s;
    public final vf v;
    public final Object f42379w;

    public wf(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f42371a = i11;
        this.f42372b = coVar;
        this.f42373c = i10;
        this.d = arrayList;
        this.f42374e = str;
        this.f42375f = str2;
        this.h = str3;
        this.f42376n = inputPeer;
        this.f42377r = iArr;
        this.f42379w = obj;
        this.f42378s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42371a) {
            case 0:
                boolean z10 = this.f42378s;
                vf vfVar = this.v;
                co.U0(this.f42372b, this.f42373c, this.d, this.f42374e, this.f42375f, (String) this.h, this.f42376n, this.f42377r, (TL_iv.RichMessage) this.f42379w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f42378s;
                vf vfVar2 = this.v;
                co.c0(this.f42372b, this.f42373c, this.d, this.f42374e, this.f42375f, (String) this.h, this.f42376n, this.f42377r, (CharSequence) this.f42379w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f42378s;
                vf vfVar3 = this.v;
                co.w0(this.f42372b, this.f42373c, this.d, (String[]) this.h, this.f42374e, this.f42375f, this.f42376n, this.f42377r, (CharSequence) this.f42379w, z12, vfVar3);
                return;
        }
    }

    public wf(co coVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f42371a = 2;
        this.f42372b = coVar;
        this.f42373c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f42374e = str;
        this.f42375f = str2;
        this.f42376n = inputPeer;
        this.f42377r = iArr;
        this.f42379w = charSequence;
        this.f42378s = z10;
        this.v = vfVar;
    }
}
