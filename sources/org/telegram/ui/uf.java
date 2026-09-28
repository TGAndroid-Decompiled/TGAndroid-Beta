package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class uf implements View.OnClickListener {
    public final int f38456a;
    public final wn f38457b;
    public final int f38458c;
    public final ArrayList d;
    public final String e;
    public final String f38459f;
    public final Serializable h;
    public final TLRPC.InputPeer f38460n;
    public final int[] f38461r;
    public final boolean f38462s;
    public final tf v;
    public final Object f38463w;

    public uf(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, tf tfVar, int i11) {
        this.f38456a = i11;
        this.f38457b = wnVar;
        this.f38458c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38459f = str2;
        this.h = str3;
        this.f38460n = inputPeer;
        this.f38461r = iArr;
        this.f38463w = obj;
        this.f38462s = z10;
        this.v = tfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38456a) {
            case 0:
                boolean z10 = this.f38462s;
                tf tfVar = this.v;
                wn.Y(this.f38457b, this.f38458c, this.d, this.e, this.f38459f, (String) this.h, this.f38460n, this.f38461r, (TL_iv.RichMessage) this.f38463w, z10, tfVar);
                return;
            case 1:
                boolean z11 = this.f38462s;
                tf tfVar2 = this.v;
                wn.w0(this.f38457b, this.f38458c, this.d, this.e, this.f38459f, (String) this.h, this.f38460n, this.f38461r, (CharSequence) this.f38463w, z11, tfVar2);
                return;
            default:
                boolean z12 = this.f38462s;
                tf tfVar3 = this.v;
                wn.W0(this.f38457b, this.f38458c, this.d, (String[]) this.h, this.e, this.f38459f, this.f38460n, this.f38461r, (CharSequence) this.f38463w, z12, tfVar3);
                return;
        }
    }

    public uf(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, tf tfVar) {
        this.f38456a = 2;
        this.f38457b = wnVar;
        this.f38458c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38459f = str2;
        this.f38460n = inputPeer;
        this.f38461r = iArr;
        this.f38463w = charSequence;
        this.f38462s = z10;
        this.v = tfVar;
    }
}
