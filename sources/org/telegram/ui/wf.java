package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f42370a;
    public final co f42371b;
    public final int f42372c;
    public final ArrayList d;
    public final String f42373e;
    public final String f42374f;
    public final Serializable h;
    public final TLRPC.InputPeer f42375n;
    public final int[] f42376r;
    public final boolean f42377s;
    public final vf v;
    public final Object f42378w;

    public wf(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f42370a = i11;
        this.f42371b = coVar;
        this.f42372c = i10;
        this.d = arrayList;
        this.f42373e = str;
        this.f42374f = str2;
        this.h = str3;
        this.f42375n = inputPeer;
        this.f42376r = iArr;
        this.f42378w = obj;
        this.f42377s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42370a) {
            case 0:
                boolean z10 = this.f42377s;
                vf vfVar = this.v;
                co.U0(this.f42371b, this.f42372c, this.d, this.f42373e, this.f42374f, (String) this.h, this.f42375n, this.f42376r, (TL_iv.RichMessage) this.f42378w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f42377s;
                vf vfVar2 = this.v;
                co.c0(this.f42371b, this.f42372c, this.d, this.f42373e, this.f42374f, (String) this.h, this.f42375n, this.f42376r, (CharSequence) this.f42378w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f42377s;
                vf vfVar3 = this.v;
                co.w0(this.f42371b, this.f42372c, this.d, (String[]) this.h, this.f42373e, this.f42374f, this.f42375n, this.f42376r, (CharSequence) this.f42378w, z12, vfVar3);
                return;
        }
    }

    public wf(co coVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f42370a = 2;
        this.f42371b = coVar;
        this.f42372c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f42373e = str;
        this.f42374f = str2;
        this.f42375n = inputPeer;
        this.f42376r = iArr;
        this.f42378w = charSequence;
        this.f42377s = z10;
        this.v = vfVar;
    }
}
