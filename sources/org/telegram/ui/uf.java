package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class uf implements View.OnClickListener {
    public final int f38455a;
    public final wn f38456b;
    public final int f38457c;
    public final ArrayList d;
    public final String e;
    public final String f38458f;
    public final Serializable h;
    public final TLRPC.InputPeer f38459n;
    public final int[] f38460r;
    public final boolean f38461s;
    public final tf v;
    public final Object f38462w;

    public uf(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, tf tfVar, int i11) {
        this.f38455a = i11;
        this.f38456b = wnVar;
        this.f38457c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38458f = str2;
        this.h = str3;
        this.f38459n = inputPeer;
        this.f38460r = iArr;
        this.f38462w = obj;
        this.f38461s = z10;
        this.v = tfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38455a) {
            case 0:
                boolean z10 = this.f38461s;
                tf tfVar = this.v;
                wn.Y(this.f38456b, this.f38457c, this.d, this.e, this.f38458f, (String) this.h, this.f38459n, this.f38460r, (TL_iv.RichMessage) this.f38462w, z10, tfVar);
                return;
            case 1:
                boolean z11 = this.f38461s;
                tf tfVar2 = this.v;
                wn.w0(this.f38456b, this.f38457c, this.d, this.e, this.f38458f, (String) this.h, this.f38459n, this.f38460r, (CharSequence) this.f38462w, z11, tfVar2);
                return;
            default:
                boolean z12 = this.f38461s;
                tf tfVar3 = this.v;
                wn.W0(this.f38456b, this.f38457c, this.d, (String[]) this.h, this.e, this.f38458f, this.f38459n, this.f38460r, (CharSequence) this.f38462w, z12, tfVar3);
                return;
        }
    }

    public uf(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, tf tfVar) {
        this.f38455a = 2;
        this.f38456b = wnVar;
        this.f38457c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38458f = str2;
        this.f38459n = inputPeer;
        this.f38460r = iArr;
        this.f38462w = charSequence;
        this.f38461s = z10;
        this.v = tfVar;
    }
}
