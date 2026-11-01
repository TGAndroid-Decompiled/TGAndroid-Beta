package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sf implements View.OnClickListener {
    public final int f41355a;
    public final un f41356b;
    public final int f41357c;
    public final ArrayList d;
    public final String e;
    public final String f41358f;
    public final Serializable h;
    public final TLRPC.InputPeer f41359n;
    public final int[] f41360r;
    public final boolean f41361s;
    public final rf f41362w;
    public final Object f41363x;

    public sf(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, rf rfVar, int i11) {
        this.f41355a = i11;
        this.f41356b = unVar;
        this.f41357c = i10;
        this.d = arrayList;
        this.e = str;
        this.f41358f = str2;
        this.h = str3;
        this.f41359n = inputPeer;
        this.f41360r = iArr;
        this.f41363x = obj;
        this.f41361s = z10;
        this.f41362w = rfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41355a) {
            case 0:
                boolean z10 = this.f41361s;
                rf rfVar = this.f41362w;
                un.S0(this.f41356b, this.f41357c, this.d, this.e, this.f41358f, (String) this.h, this.f41359n, this.f41360r, (TL_iv.RichMessage) this.f41363x, z10, rfVar);
                return;
            case 1:
                boolean z11 = this.f41361s;
                rf rfVar2 = this.f41362w;
                un.o0(this.f41356b, this.f41357c, this.d, this.e, this.f41358f, (String) this.h, this.f41359n, this.f41360r, (CharSequence) this.f41363x, z11, rfVar2);
                return;
            default:
                boolean z12 = this.f41361s;
                rf rfVar3 = this.f41362w;
                un.h0(this.f41356b, this.f41357c, this.d, (String[]) this.h, this.e, this.f41358f, this.f41359n, this.f41360r, (CharSequence) this.f41363x, z12, rfVar3);
                return;
        }
    }

    public sf(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, rf rfVar) {
        this.f41355a = 2;
        this.f41356b = unVar;
        this.f41357c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f41358f = str2;
        this.f41359n = inputPeer;
        this.f41360r = iArr;
        this.f41363x = charSequence;
        this.f41361s = z10;
        this.f41362w = rfVar;
    }
}
