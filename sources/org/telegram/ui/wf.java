package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f39179a;
    public final bo f39180b;
    public final int f39181c;
    public final ArrayList d;
    public final String e;
    public final String f39182f;
    public final Serializable h;
    public final TLRPC.InputPeer f39183n;
    public final int[] f39184r;
    public final boolean f39185s;
    public final vf v;
    public final Object f39186w;

    public wf(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f39179a = i11;
        this.f39180b = boVar;
        this.f39181c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39182f = str2;
        this.h = str3;
        this.f39183n = inputPeer;
        this.f39184r = iArr;
        this.f39186w = obj;
        this.f39185s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39179a) {
            case 0:
                boolean z10 = this.f39185s;
                vf vfVar = this.v;
                bo.U0(this.f39180b, this.f39181c, this.d, this.e, this.f39182f, (String) this.h, this.f39183n, this.f39184r, (TL_iv.RichMessage) this.f39186w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f39185s;
                vf vfVar2 = this.v;
                bo.c0(this.f39180b, this.f39181c, this.d, this.e, this.f39182f, (String) this.h, this.f39183n, this.f39184r, (CharSequence) this.f39186w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f39185s;
                vf vfVar3 = this.v;
                bo.w0(this.f39180b, this.f39181c, this.d, (String[]) this.h, this.e, this.f39182f, this.f39183n, this.f39184r, (CharSequence) this.f39186w, z12, vfVar3);
                return;
        }
    }

    public wf(bo boVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f39179a = 2;
        this.f39180b = boVar;
        this.f39181c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39182f = str2;
        this.f39183n = inputPeer;
        this.f39184r = iArr;
        this.f39186w = charSequence;
        this.f39185s = z10;
        this.v = vfVar;
    }
}
