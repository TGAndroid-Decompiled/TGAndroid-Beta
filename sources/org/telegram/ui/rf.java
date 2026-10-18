package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rf implements View.OnClickListener {
    public final int f40742a;
    public final sn f40743b;
    public final int f40744c;
    public final ArrayList d;
    public final String e;
    public final String f40745f;
    public final Serializable h;
    public final TLRPC.InputPeer f40746n;
    public final int[] f40747r;
    public final boolean f40748s;
    public final qf v;
    public final Object f40749w;

    public rf(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, qf qfVar, int i11) {
        this.f40742a = i11;
        this.f40743b = snVar;
        this.f40744c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40745f = str2;
        this.h = str3;
        this.f40746n = inputPeer;
        this.f40747r = iArr;
        this.f40749w = obj;
        this.f40748s = z10;
        this.v = qfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40742a) {
            case 0:
                boolean z10 = this.f40748s;
                qf qfVar = this.v;
                sn.b0(this.f40743b, this.f40744c, this.d, this.e, this.f40745f, (String) this.h, this.f40746n, this.f40747r, (TL_iv.RichMessage) this.f40749w, z10, qfVar);
                return;
            case 1:
                boolean z11 = this.f40748s;
                qf qfVar2 = this.v;
                sn.d0(this.f40743b, this.f40744c, this.d, this.e, this.f40745f, (String) this.h, this.f40746n, this.f40747r, (CharSequence) this.f40749w, z11, qfVar2);
                return;
            default:
                boolean z12 = this.f40748s;
                qf qfVar3 = this.v;
                sn.t0(this.f40743b, this.f40744c, this.d, (String[]) this.h, this.e, this.f40745f, this.f40746n, this.f40747r, (CharSequence) this.f40749w, z12, qfVar3);
                return;
        }
    }

    public rf(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, qf qfVar) {
        this.f40742a = 2;
        this.f40743b = snVar;
        this.f40744c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40745f = str2;
        this.f40746n = inputPeer;
        this.f40747r = iArr;
        this.f40749w = charSequence;
        this.f40748s = z10;
        this.v = qfVar;
    }
}
