package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class yf implements View.OnClickListener {
    public final int f39869a;
    public final bo f39870b;
    public final int f39871c;
    public final ArrayList d;
    public final String e;
    public final String f39872f;
    public final Serializable h;
    public final TLRPC.InputPeer f39873n;
    public final int[] f39874r;
    public final boolean f39875s;
    public final xf v;
    public final Object f39876w;

    public yf(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, xf xfVar, int i11) {
        this.f39869a = i11;
        this.f39870b = boVar;
        this.f39871c = i10;
        this.d = arrayList;
        this.e = str;
        this.f39872f = str2;
        this.h = str3;
        this.f39873n = inputPeer;
        this.f39874r = iArr;
        this.f39876w = obj;
        this.f39875s = z10;
        this.v = xfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39869a) {
            case 0:
                boolean z10 = this.f39875s;
                xf xfVar = this.v;
                bo.U0(this.f39870b, this.f39871c, this.d, this.e, this.f39872f, (String) this.h, this.f39873n, this.f39874r, (TL_iv.RichMessage) this.f39876w, z10, xfVar);
                return;
            case 1:
                boolean z11 = this.f39875s;
                xf xfVar2 = this.v;
                bo.c0(this.f39870b, this.f39871c, this.d, this.e, this.f39872f, (String) this.h, this.f39873n, this.f39874r, (CharSequence) this.f39876w, z11, xfVar2);
                return;
            default:
                boolean z12 = this.f39875s;
                xf xfVar3 = this.v;
                bo.w0(this.f39870b, this.f39871c, this.d, (String[]) this.h, this.e, this.f39872f, this.f39873n, this.f39874r, (CharSequence) this.f39876w, z12, xfVar3);
                return;
        }
    }

    public yf(bo boVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, xf xfVar) {
        this.f39869a = 2;
        this.f39870b = boVar;
        this.f39871c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f39872f = str2;
        this.f39873n = inputPeer;
        this.f39874r = iArr;
        this.f39876w = charSequence;
        this.f39875s = z10;
        this.v = xfVar;
    }
}
