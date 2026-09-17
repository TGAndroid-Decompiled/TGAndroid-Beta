package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f42344a;
    public final co f42345b;
    public final int f42346c;
    public final ArrayList d;
    public final String f42347e;
    public final String f42348f;
    public final Serializable h;
    public final TLRPC.InputPeer f42349n;
    public final int[] f42350r;
    public final boolean f42351s;
    public final vf v;
    public final Object f42352w;

    public wf(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f42344a = i11;
        this.f42345b = coVar;
        this.f42346c = i10;
        this.d = arrayList;
        this.f42347e = str;
        this.f42348f = str2;
        this.h = str3;
        this.f42349n = inputPeer;
        this.f42350r = iArr;
        this.f42352w = obj;
        this.f42351s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42344a) {
            case 0:
                boolean z10 = this.f42351s;
                vf vfVar = this.v;
                co.U0(this.f42345b, this.f42346c, this.d, this.f42347e, this.f42348f, (String) this.h, this.f42349n, this.f42350r, (TL_iv.RichMessage) this.f42352w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f42351s;
                vf vfVar2 = this.v;
                co.c0(this.f42345b, this.f42346c, this.d, this.f42347e, this.f42348f, (String) this.h, this.f42349n, this.f42350r, (CharSequence) this.f42352w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f42351s;
                vf vfVar3 = this.v;
                co.w0(this.f42345b, this.f42346c, this.d, (String[]) this.h, this.f42347e, this.f42348f, this.f42349n, this.f42350r, (CharSequence) this.f42352w, z12, vfVar3);
                return;
        }
    }

    public wf(co coVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f42344a = 2;
        this.f42345b = coVar;
        this.f42346c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f42347e = str;
        this.f42348f = str2;
        this.f42349n = inputPeer;
        this.f42350r = iArr;
        this.f42352w = charSequence;
        this.f42351s = z10;
        this.v = vfVar;
    }
}
