package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sf implements View.OnClickListener {
    public final int f38165a;
    public final zn f38166b;
    public final int f38167c;
    public final ArrayList d;
    public final String e;
    public final String f38168f;
    public final Serializable h;
    public final TLRPC.InputPeer f38169n;
    public final int[] f38170r;
    public final boolean f38171s;
    public final rf v;
    public final Object f38172w;

    public sf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z4, rf rfVar, int i11) {
        this.f38165a = i11;
        this.f38166b = znVar;
        this.f38167c = i10;
        this.d = arrayList;
        this.e = str;
        this.f38168f = str2;
        this.h = str3;
        this.f38169n = inputPeer;
        this.f38170r = iArr;
        this.f38172w = obj;
        this.f38171s = z4;
        this.v = rfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38165a) {
            case 0:
                boolean z4 = this.f38171s;
                rf rfVar = this.v;
                zn.U0(this.f38166b, this.f38167c, this.d, this.e, this.f38168f, (String) this.h, this.f38169n, this.f38170r, (TL_iv.RichMessage) this.f38172w, z4, rfVar);
                return;
            case 1:
                boolean z10 = this.f38171s;
                rf rfVar2 = this.v;
                zn.c0(this.f38166b, this.f38167c, this.d, this.e, this.f38168f, (String) this.h, this.f38169n, this.f38170r, (CharSequence) this.f38172w, z10, rfVar2);
                return;
            default:
                boolean z11 = this.f38171s;
                rf rfVar3 = this.v;
                zn.x0(this.f38166b, this.f38167c, this.d, (String[]) this.h, this.e, this.f38168f, this.f38169n, this.f38170r, (CharSequence) this.f38172w, z11, rfVar3);
                return;
        }
    }

    public sf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, rf rfVar) {
        this.f38165a = 2;
        this.f38166b = znVar;
        this.f38167c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f38168f = str2;
        this.f38169n = inputPeer;
        this.f38170r = iArr;
        this.f38172w = charSequence;
        this.f38171s = z4;
        this.v = rfVar;
    }
}
