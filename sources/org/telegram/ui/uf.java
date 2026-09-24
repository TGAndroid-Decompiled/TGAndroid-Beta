package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class uf implements View.OnClickListener {
    public final int f38436a;
    public final wn f38437b;
    public final int f38438c;
    public final ArrayList d;
    public final String e;
    public final String f38439f;
    public final Serializable h;
    public final TLRPC.InputPeer f38440n;
    public final int[] f38441r;
    public final boolean f38442s;
    public final tf v;
    public final Object f38443w;

    public uf(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, tf tfVar, int i11) {
        this.f38436a = i11;
        this.f38437b = wnVar;
        this.f38438c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38439f = str2;
        this.h = str3;
        this.f38440n = inputPeer;
        this.f38441r = iArr;
        this.f38443w = obj;
        this.f38442s = z10;
        this.v = tfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38436a) {
            case 0:
                boolean z10 = this.f38442s;
                tf tfVar = this.v;
                wn.Y(this.f38437b, this.f38438c, this.d, this.e, this.f38439f, (String) this.h, this.f38440n, this.f38441r, (TL_iv.RichMessage) this.f38443w, z10, tfVar);
                return;
            case 1:
                boolean z11 = this.f38442s;
                tf tfVar2 = this.v;
                wn.w0(this.f38437b, this.f38438c, this.d, this.e, this.f38439f, (String) this.h, this.f38440n, this.f38441r, (CharSequence) this.f38443w, z11, tfVar2);
                return;
            default:
                boolean z12 = this.f38442s;
                tf tfVar3 = this.v;
                wn.W0(this.f38437b, this.f38438c, this.d, (String[]) this.h, this.e, this.f38439f, this.f38440n, this.f38441r, (CharSequence) this.f38443w, z12, tfVar3);
                return;
        }
    }

    public uf(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, tf tfVar) {
        this.f38436a = 2;
        this.f38437b = wnVar;
        this.f38438c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38439f = str2;
        this.f38440n = inputPeer;
        this.f38441r = iArr;
        this.f38443w = charSequence;
        this.f38442s = z10;
        this.v = tfVar;
    }
}
