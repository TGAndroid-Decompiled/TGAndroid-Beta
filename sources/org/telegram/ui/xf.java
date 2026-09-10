package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xf implements View.OnClickListener {
    public final int f38704a;
    public final eo f38705b;
    public final int f38706c;
    public final ArrayList d;
    public final String e;
    public final String f38707f;
    public final Serializable h;
    public final TLRPC.InputPeer f38708n;
    public final int[] f38709r;
    public final boolean f38710s;
    public final wf v;
    public final Object f38711w;

    public xf(eo eoVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, wf wfVar, int i11) {
        this.f38704a = i11;
        this.f38705b = eoVar;
        this.f38706c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38707f = str2;
        this.h = str3;
        this.f38708n = inputPeer;
        this.f38709r = iArr;
        this.f38711w = obj;
        this.f38710s = z10;
        this.v = wfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38704a) {
            case 0:
                boolean z10 = this.f38710s;
                wf wfVar = this.v;
                eo.U0(this.f38705b, this.f38706c, this.d, this.e, this.f38707f, (String) this.h, this.f38708n, this.f38709r, (TL_iv.RichMessage) this.f38711w, z10, wfVar);
                return;
            case 1:
                boolean z11 = this.f38710s;
                wf wfVar2 = this.v;
                eo.c0(this.f38705b, this.f38706c, this.d, this.e, this.f38707f, (String) this.h, this.f38708n, this.f38709r, (CharSequence) this.f38711w, z11, wfVar2);
                return;
            default:
                boolean z12 = this.f38710s;
                wf wfVar3 = this.v;
                eo.w0(this.f38705b, this.f38706c, this.d, (String[]) this.h, this.e, this.f38707f, this.f38708n, this.f38709r, (CharSequence) this.f38711w, z12, wfVar3);
                return;
        }
    }

    public xf(eo eoVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, wf wfVar) {
        this.f38704a = 2;
        this.f38705b = eoVar;
        this.f38706c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38707f = str2;
        this.f38708n = inputPeer;
        this.f38709r = iArr;
        this.f38711w = charSequence;
        this.f38710s = z10;
        this.v = wfVar;
    }
}
