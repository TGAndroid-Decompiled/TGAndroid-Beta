package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class uf implements View.OnClickListener {
    public final int f38545a;
    public final wn f38546b;
    public final int f38547c;
    public final ArrayList d;
    public final String e;
    public final String f38548f;
    public final Serializable h;
    public final TLRPC.InputPeer f38549n;
    public final int[] f38550r;
    public final boolean f38551s;
    public final tf v;
    public final Object f38552w;

    public uf(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, tf tfVar, int i11) {
        this.f38545a = i11;
        this.f38546b = wnVar;
        this.f38547c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38548f = str2;
        this.h = str3;
        this.f38549n = inputPeer;
        this.f38550r = iArr;
        this.f38552w = obj;
        this.f38551s = z10;
        this.v = tfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38545a) {
            case 0:
                boolean z10 = this.f38551s;
                tf tfVar = this.v;
                wn.Y(this.f38546b, this.f38547c, this.d, this.e, this.f38548f, (String) this.h, this.f38549n, this.f38550r, (TL_iv.RichMessage) this.f38552w, z10, tfVar);
                return;
            case 1:
                boolean z11 = this.f38551s;
                tf tfVar2 = this.v;
                wn.w0(this.f38546b, this.f38547c, this.d, this.e, this.f38548f, (String) this.h, this.f38549n, this.f38550r, (CharSequence) this.f38552w, z11, tfVar2);
                return;
            default:
                boolean z12 = this.f38551s;
                tf tfVar3 = this.v;
                wn.W0(this.f38546b, this.f38547c, this.d, (String[]) this.h, this.e, this.f38548f, this.f38549n, this.f38550r, (CharSequence) this.f38552w, z12, tfVar3);
                return;
        }
    }

    public uf(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, tf tfVar) {
        this.f38545a = 2;
        this.f38546b = wnVar;
        this.f38547c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38548f = str2;
        this.f38549n = inputPeer;
        this.f38550r = iArr;
        this.f38552w = charSequence;
        this.f38551s = z10;
        this.v = tfVar;
    }
}
