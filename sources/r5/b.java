package r5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
import k7.l7;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 D = new a0(false);
    public static final b0 E = new b0(0);
    public static final s5.a F;
    public final a0 B;
    public b0 C;
    public final String f43343a;
    public final ArrayList f43344b;
    public final boolean f43345c;
    public final q5.i d;
    public final boolean e;
    public final s5.a f43346f;
    public final boolean h;
    public final double f43347n;
    public final boolean f43348r;
    public final boolean f43349s;
    public final boolean v;
    public final List f43350w;
    public final boolean f43351x;
    public final boolean f43352y;

    static {
        new s5.f(s5.f.V, s5.f.W, 10000L, null, l7.a("smallIconDrawableResId"), l7.a("stopLiveStreamDrawableResId"), l7.a("pauseDrawableResId"), l7.a("playDrawableResId"), l7.a("skipNextDrawableResId"), l7.a("skipPrevDrawableResId"), l7.a("forwardDrawableResId"), l7.a("forward10DrawableResId"), l7.a("forward30DrawableResId"), l7.a("rewindDrawableResId"), l7.a("rewind10DrawableResId"), l7.a("rewind30DrawableResId"), l7.a("disconnectDrawableResId"), l7.a("notificationImageSizeDimenResId"), l7.a("castingToDeviceStringResId"), l7.a("stopLiveStreamStringResId"), l7.a("pauseStringResId"), l7.a("playStringResId"), l7.a("skipNextStringResId"), l7.a("skipPrevStringResId"), l7.a("forwardStringResId"), l7.a("forward10StringResId"), l7.a("forward30StringResId"), l7.a("rewindStringResId"), l7.a("rewind10StringResId"), l7.a("rewind30StringResId"), l7.a("disconnectStringResId"), null, false, false);
        F = new s5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0(0);
    }

    public b(String str, ArrayList arrayList, boolean z4, q5.i iVar, boolean z10, s5.a aVar, boolean z11, double d, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, a0 a0Var, b0 b0Var) {
        int size;
        this.f43343a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f43344b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f43345c = z4;
        this.d = iVar == null ? new q5.i() : iVar;
        this.e = z10;
        this.f43346f = aVar;
        this.h = z11;
        this.f43347n = d;
        this.f43348r = z12;
        this.f43349s = z13;
        this.v = z14;
        this.f43350w = arrayList2;
        this.f43351x = z15;
        this.f43352y = z16;
        this.B = a0Var;
        this.C = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f43343a);
        f5.n(parcel, 3, DesugarCollections.unmodifiableList(this.f43344b));
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f43345c ? 1 : 0);
        f5.k(parcel, 5, this.d, i10);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.k(parcel, 7, this.f43346f, i10);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f5.s(parcel, 9, 8);
        parcel.writeDouble(this.f43347n);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.f43348r ? 1 : 0);
        f5.s(parcel, 11, 4);
        parcel.writeInt(this.f43349s ? 1 : 0);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        f5.n(parcel, 13, DesugarCollections.unmodifiableList(this.f43350w));
        f5.s(parcel, 14, 4);
        parcel.writeInt(this.f43351x ? 1 : 0);
        f5.s(parcel, 15, 4);
        parcel.writeInt(0);
        f5.s(parcel, 16, 4);
        parcel.writeInt(this.f43352y ? 1 : 0);
        f5.k(parcel, 17, this.B, i10);
        f5.k(parcel, 18, this.C, i10);
        f5.r(parcel, q10);
    }
}
