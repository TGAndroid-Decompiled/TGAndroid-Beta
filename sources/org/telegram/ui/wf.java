package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wf implements View.OnClickListener {
    public final int f42343a;
    public final co f42344b;
    public final int f42345c;
    public final ArrayList d;
    public final String f42346e;
    public final String f42347f;
    public final Serializable h;
    public final TLRPC.InputPeer f42348n;
    public final int[] f42349r;
    public final boolean f42350s;
    public final vf v;
    public final Object f42351w;

    public wf(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, vf vfVar, int i11) {
        this.f42343a = i11;
        this.f42344b = coVar;
        this.f42345c = i10;
        this.d = arrayList;
        this.f42346e = str;
        this.f42347f = str2;
        this.h = str3;
        this.f42348n = inputPeer;
        this.f42349r = iArr;
        this.f42351w = obj;
        this.f42350s = z10;
        this.v = vfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42343a) {
            case 0:
                boolean z10 = this.f42350s;
                vf vfVar = this.v;
                co.U0(this.f42344b, this.f42345c, this.d, this.f42346e, this.f42347f, (String) this.h, this.f42348n, this.f42349r, (TL_iv.RichMessage) this.f42351w, z10, vfVar);
                return;
            case 1:
                boolean z11 = this.f42350s;
                vf vfVar2 = this.v;
                co.c0(this.f42344b, this.f42345c, this.d, this.f42346e, this.f42347f, (String) this.h, this.f42348n, this.f42349r, (CharSequence) this.f42351w, z11, vfVar2);
                return;
            default:
                boolean z12 = this.f42350s;
                vf vfVar3 = this.v;
                co.w0(this.f42344b, this.f42345c, this.d, (String[]) this.h, this.f42346e, this.f42347f, this.f42348n, this.f42349r, (CharSequence) this.f42351w, z12, vfVar3);
                return;
        }
    }

    public wf(co coVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        this.f42343a = 2;
        this.f42344b = coVar;
        this.f42345c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f42346e = str;
        this.f42347f = str2;
        this.f42348n = inputPeer;
        this.f42349r = iArr;
        this.f42351w = charSequence;
        this.f42350s = z10;
        this.v = vfVar;
    }
}
