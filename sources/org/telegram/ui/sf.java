package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sf implements View.OnClickListener {
    public final int f41495a;
    public final un f41496b;
    public final int f41497c;
    public final ArrayList d;
    public final String e;
    public final String f41498f;
    public final Serializable h;
    public final TLRPC.InputPeer f41499n;
    public final int[] f41500r;
    public final boolean f41501s;
    public final rf f41502w;
    public final Object f41503x;

    public sf(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, rf rfVar, int i11) {
        this.f41495a = i11;
        this.f41496b = unVar;
        this.f41497c = i10;
        this.d = arrayList;
        this.e = str;
        this.f41498f = str2;
        this.h = str3;
        this.f41499n = inputPeer;
        this.f41500r = iArr;
        this.f41503x = obj;
        this.f41501s = z10;
        this.f41502w = rfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41495a) {
            case 0:
                boolean z10 = this.f41501s;
                rf rfVar = this.f41502w;
                un.y1(this.f41496b, this.f41497c, this.d, this.e, this.f41498f, (String) this.h, this.f41499n, this.f41500r, (TL_iv.RichMessage) this.f41503x, z10, rfVar);
                return;
            case 1:
                boolean z11 = this.f41501s;
                rf rfVar2 = this.f41502w;
                un.k0(this.f41496b, this.f41497c, this.d, this.e, this.f41498f, (String) this.h, this.f41499n, this.f41500r, (CharSequence) this.f41503x, z11, rfVar2);
                return;
            default:
                boolean z12 = this.f41501s;
                rf rfVar3 = this.f41502w;
                un.M0(this.f41496b, this.f41497c, this.d, (String[]) this.h, this.e, this.f41498f, this.f41499n, this.f41500r, (CharSequence) this.f41503x, z12, rfVar3);
                return;
        }
    }

    public sf(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, rf rfVar) {
        this.f41495a = 2;
        this.f41496b = unVar;
        this.f41497c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f41498f = str2;
        this.f41499n = inputPeer;
        this.f41500r = iArr;
        this.f41503x = charSequence;
        this.f41501s = z10;
        this.f41502w = rfVar;
    }
}
