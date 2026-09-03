package r5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
import k7.m7;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 D = new a0(false);
    public static final b0 E = new b0(0);
    public static final s5.a F;
    public final a0 B;
    public b0 C;
    public final String f46721a;
    public final ArrayList f46722b;
    public final boolean f46723c;
    public final q5.i d;
    public final boolean f46724e;
    public final s5.a f46725f;
    public final boolean h;
    public final double f46726n;
    public final boolean f46727r;
    public final boolean f46728s;
    public final boolean v;
    public final List f46729w;
    public final boolean f46730x;
    public final boolean f46731y;

    static {
        new s5.f(s5.f.V, s5.f.W, 10000L, null, m7.a("smallIconDrawableResId"), m7.a("stopLiveStreamDrawableResId"), m7.a("pauseDrawableResId"), m7.a("playDrawableResId"), m7.a("skipNextDrawableResId"), m7.a("skipPrevDrawableResId"), m7.a("forwardDrawableResId"), m7.a("forward10DrawableResId"), m7.a("forward30DrawableResId"), m7.a("rewindDrawableResId"), m7.a("rewind10DrawableResId"), m7.a("rewind30DrawableResId"), m7.a("disconnectDrawableResId"), m7.a("notificationImageSizeDimenResId"), m7.a("castingToDeviceStringResId"), m7.a("stopLiveStreamStringResId"), m7.a("pauseStringResId"), m7.a("playStringResId"), m7.a("skipNextStringResId"), m7.a("skipPrevStringResId"), m7.a("forwardStringResId"), m7.a("forward10StringResId"), m7.a("forward30StringResId"), m7.a("rewindStringResId"), m7.a("rewind10StringResId"), m7.a("rewind30StringResId"), m7.a("disconnectStringResId"), null, false, false);
        F = new s5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0(0);
    }

    public b(String str, ArrayList arrayList, boolean z4, q5.i iVar, boolean z10, s5.a aVar, boolean z11, double d, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, a0 a0Var, b0 b0Var) {
        int size;
        this.f46721a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f46722b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f46723c = z4;
        this.d = iVar == null ? new q5.i() : iVar;
        this.f46724e = z10;
        this.f46725f = aVar;
        this.h = z11;
        this.f46726n = d;
        this.f46727r = z12;
        this.f46728s = z13;
        this.v = z14;
        this.f46729w = arrayList2;
        this.f46730x = z15;
        this.f46731y = z16;
        this.B = a0Var;
        this.C = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f46721a);
        g5.n(parcel, 3, DesugarCollections.unmodifiableList(this.f46722b));
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f46723c ? 1 : 0);
        g5.k(parcel, 5, this.d, i10);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f46724e ? 1 : 0);
        g5.k(parcel, 7, this.f46725f, i10);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g5.s(parcel, 9, 8);
        parcel.writeDouble(this.f46726n);
        g5.s(parcel, 10, 4);
        parcel.writeInt(this.f46727r ? 1 : 0);
        g5.s(parcel, 11, 4);
        parcel.writeInt(this.f46728s ? 1 : 0);
        g5.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        g5.n(parcel, 13, DesugarCollections.unmodifiableList(this.f46729w));
        g5.s(parcel, 14, 4);
        parcel.writeInt(this.f46730x ? 1 : 0);
        g5.s(parcel, 15, 4);
        parcel.writeInt(0);
        g5.s(parcel, 16, 4);
        parcel.writeInt(this.f46731y ? 1 : 0);
        g5.k(parcel, 17, this.B, i10);
        g5.k(parcel, 18, this.C, i10);
        g5.r(parcel, q10);
    }
}
