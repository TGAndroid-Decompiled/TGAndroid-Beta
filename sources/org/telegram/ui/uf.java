package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class uf implements View.OnClickListener {
    public final int f38454a;
    public final wn f38455b;
    public final int f38456c;
    public final ArrayList d;
    public final String e;
    public final String f38457f;
    public final Serializable h;
    public final TLRPC.InputPeer f38458n;
    public final int[] f38459r;
    public final boolean f38460s;
    public final tf v;
    public final Object f38461w;

    public uf(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, tf tfVar, int i11) {
        this.f38454a = i11;
        this.f38455b = wnVar;
        this.f38456c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38457f = str2;
        this.h = str3;
        this.f38458n = inputPeer;
        this.f38459r = iArr;
        this.f38461w = obj;
        this.f38460s = z10;
        this.v = tfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38454a) {
            case 0:
                boolean z10 = this.f38460s;
                tf tfVar = this.v;
                wn.Y(this.f38455b, this.f38456c, this.d, this.e, this.f38457f, (String) this.h, this.f38458n, this.f38459r, (TL_iv.RichMessage) this.f38461w, z10, tfVar);
                return;
            case 1:
                boolean z11 = this.f38460s;
                tf tfVar2 = this.v;
                wn.w0(this.f38455b, this.f38456c, this.d, this.e, this.f38457f, (String) this.h, this.f38458n, this.f38459r, (CharSequence) this.f38461w, z11, tfVar2);
                return;
            default:
                boolean z12 = this.f38460s;
                tf tfVar3 = this.v;
                wn.W0(this.f38455b, this.f38456c, this.d, (String[]) this.h, this.e, this.f38457f, this.f38458n, this.f38459r, (CharSequence) this.f38461w, z12, tfVar3);
                return;
        }
    }

    public uf(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, tf tfVar) {
        this.f38454a = 2;
        this.f38455b = wnVar;
        this.f38456c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38457f = str2;
        this.f38458n = inputPeer;
        this.f38459r = iArr;
        this.f38461w = charSequence;
        this.f38460s = z10;
        this.v = tfVar;
    }
}
