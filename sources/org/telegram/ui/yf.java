package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class yf implements View.OnClickListener {
    public final int f39874a;
    public final bo f39875b;
    public final int f39876c;
    public final ArrayList d;
    public final String e;
    public final String f39877f;
    public final Serializable h;
    public final TLRPC.InputPeer f39878n;
    public final int[] f39879r;
    public final boolean f39880s;
    public final xf v;
    public final Object f39881w;

    public yf(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, xf xfVar, int i11) {
        this.f39874a = i11;
        this.f39875b = boVar;
        this.f39876c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39877f = str2;
        this.h = str3;
        this.f39878n = inputPeer;
        this.f39879r = iArr;
        this.f39881w = obj;
        this.f39880s = z10;
        this.v = xfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39874a) {
            case 0:
                boolean z10 = this.f39880s;
                xf xfVar = this.v;
                bo.U0(this.f39875b, this.f39876c, this.d, this.e, this.f39877f, (String) this.h, this.f39878n, this.f39879r, (TL_iv.RichMessage) this.f39881w, z10, xfVar);
                return;
            case 1:
                boolean z11 = this.f39880s;
                xf xfVar2 = this.v;
                bo.c0(this.f39875b, this.f39876c, this.d, this.e, this.f39877f, (String) this.h, this.f39878n, this.f39879r, (CharSequence) this.f39881w, z11, xfVar2);
                return;
            default:
                boolean z12 = this.f39880s;
                xf xfVar3 = this.v;
                bo.w0(this.f39875b, this.f39876c, this.d, (String[]) this.h, this.e, this.f39877f, this.f39878n, this.f39879r, (CharSequence) this.f39881w, z12, xfVar3);
                return;
        }
    }

    public yf(bo boVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, xf xfVar) {
        this.f39874a = 2;
        this.f39875b = boVar;
        this.f39876c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39877f = str2;
        this.f39878n = inputPeer;
        this.f39879r = iArr;
        this.f39881w = charSequence;
        this.f39880s = z10;
        this.v = xfVar;
    }
}
