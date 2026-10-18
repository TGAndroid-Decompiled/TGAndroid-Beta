package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rf implements View.OnClickListener {
    public final int f40708a;
    public final sn f40709b;
    public final int f40710c;
    public final ArrayList d;
    public final String e;
    public final String f40711f;
    public final Serializable h;
    public final TLRPC.InputPeer f40712n;
    public final int[] f40713r;
    public final boolean f40714s;
    public final qf v;
    public final Object f40715w;

    public rf(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, qf qfVar, int i11) {
        this.f40708a = i11;
        this.f40709b = snVar;
        this.f40710c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40711f = str2;
        this.h = str3;
        this.f40712n = inputPeer;
        this.f40713r = iArr;
        this.f40715w = obj;
        this.f40714s = z10;
        this.v = qfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40708a) {
            case 0:
                boolean z10 = this.f40714s;
                qf qfVar = this.v;
                sn.b0(this.f40709b, this.f40710c, this.d, this.e, this.f40711f, (String) this.h, this.f40712n, this.f40713r, (TL_iv.RichMessage) this.f40715w, z10, qfVar);
                return;
            case 1:
                boolean z11 = this.f40714s;
                qf qfVar2 = this.v;
                sn.d0(this.f40709b, this.f40710c, this.d, this.e, this.f40711f, (String) this.h, this.f40712n, this.f40713r, (CharSequence) this.f40715w, z11, qfVar2);
                return;
            default:
                boolean z12 = this.f40714s;
                qf qfVar3 = this.v;
                sn.t0(this.f40709b, this.f40710c, this.d, (String[]) this.h, this.e, this.f40711f, this.f40712n, this.f40713r, (CharSequence) this.f40715w, z12, qfVar3);
                return;
        }
    }

    public rf(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, qf qfVar) {
        this.f40708a = 2;
        this.f40709b = snVar;
        this.f40710c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40711f = str2;
        this.f40712n = inputPeer;
        this.f40713r = iArr;
        this.f40715w = charSequence;
        this.f40714s = z10;
        this.v = qfVar;
    }
}
