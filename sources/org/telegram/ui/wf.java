package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f43790a;
    public final zn f43791b;
    public final int f43792c;
    public final ArrayList d;
    public final String f43793e;
    public final String f43794f;
    public final Serializable h;
    public final TLRPC.InputPeer f43795n;
    public final int[] f43796r;
    public final boolean f43797s;
    public final vf v;
    public final Object f43798w;

    public wf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f43790a = i11;
        this.f43791b = znVar;
        this.f43792c = i10;
        this.d = arrayList;
        this.f43793e = str;
        this.f43794f = str2;
        this.h = str3;
        this.f43795n = inputPeer;
        this.f43796r = iArr;
        this.f43798w = obj;
        this.f43797s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43790a) {
            case 0:
                boolean z10 = this.f43797s;
                vf vfVar = this.v;
                zn.b0(this.f43791b, this.f43792c, this.d, this.f43793e, this.f43794f, (String) this.h, this.f43795n, this.f43796r, (TL_iv.RichMessage) this.f43798w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f43797s;
                vf vfVar2 = this.v;
                zn.d0(this.f43791b, this.f43792c, this.d, this.f43793e, this.f43794f, (String) this.h, this.f43795n, this.f43796r, (CharSequence) this.f43798w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f43797s;
                vf vfVar3 = this.v;
                zn.t0(this.f43791b, this.f43792c, this.d, (String[]) this.h, this.f43793e, this.f43794f, this.f43795n, this.f43796r, (CharSequence) this.f43798w, z12, vfVar3);
                return;
        }
    }

    public wf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f43790a = 2;
        this.f43791b = znVar;
        this.f43792c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f43793e = str;
        this.f43794f = str2;
        this.f43795n = inputPeer;
        this.f43796r = iArr;
        this.f43798w = charSequence;
        this.f43797s = z10;
        this.v = vfVar;
    }
}
