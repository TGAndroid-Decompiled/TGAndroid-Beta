package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i7.x6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import o6.w0;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final q5.a E;
    public final a0 A;
    public b0 B;
    public final String f45611a;
    public final ArrayList f45612b;
    public final boolean f45613c;
    public final o5.i d;
    public final boolean f45614e;
    public final q5.a f45615f;
    public final boolean h;
    public final double f45616n;
    public final boolean f45617r;
    public final boolean f45618s;
    public final boolean v;
    public final List f45619w;
    public final boolean f45620x;
    public final boolean f45621y;
    public static final a0 C = new a0(false);
    public static final b0 D = new b0(0);

    static {
        new q5.f(q5.f.U, q5.f.V, 10000L, null, x6.a("smallIconDrawableResId"), x6.a("stopLiveStreamDrawableResId"), x6.a("pauseDrawableResId"), x6.a("playDrawableResId"), x6.a("skipNextDrawableResId"), x6.a("skipPrevDrawableResId"), x6.a("forwardDrawableResId"), x6.a("forward10DrawableResId"), x6.a("forward30DrawableResId"), x6.a("rewindDrawableResId"), x6.a("rewind10DrawableResId"), x6.a("rewind30DrawableResId"), x6.a("disconnectDrawableResId"), x6.a("notificationImageSizeDimenResId"), x6.a("castingToDeviceStringResId"), x6.a("stopLiveStreamStringResId"), x6.a("pauseStringResId"), x6.a("playStringResId"), x6.a("skipNextStringResId"), x6.a("skipPrevStringResId"), x6.a("forwardStringResId"), x6.a("forward10StringResId"), x6.a("forward30StringResId"), x6.a("rewindStringResId"), x6.a("rewind10StringResId"), x6.a("rewind30StringResId"), x6.a("disconnectStringResId"), null, false, false);
        E = new q5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new w0(9);
    }

    public b(String str, ArrayList arrayList, boolean z10, o5.i iVar, boolean z11, q5.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        int size;
        this.f45611a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f45612b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f45613c = z10;
        this.d = iVar == null ? new o5.i() : iVar;
        this.f45614e = z11;
        this.f45615f = aVar;
        this.h = z12;
        this.f45616n = d;
        this.f45617r = z13;
        this.f45618s = z14;
        this.v = z15;
        this.f45619w = arrayList2;
        this.f45620x = z16;
        this.f45621y = z17;
        this.A = a0Var;
        this.B = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f45611a);
        com.google.android.gms.internal.cast.o.n(parcel, 3, DesugarCollections.unmodifiableList(this.f45612b));
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f45613c ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.f45614e ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f45615f, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 9, 8);
        parcel.writeDouble(this.f45616n);
        com.google.android.gms.internal.cast.o.s(parcel, 10, 4);
        parcel.writeInt(this.f45617r ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(this.f45618s ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        com.google.android.gms.internal.cast.o.n(parcel, 13, DesugarCollections.unmodifiableList(this.f45619w));
        com.google.android.gms.internal.cast.o.s(parcel, 14, 4);
        parcel.writeInt(this.f45620x ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 15, 4);
        parcel.writeInt(0);
        com.google.android.gms.internal.cast.o.s(parcel, 16, 4);
        parcel.writeInt(this.f45621y ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 17, this.A, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 18, this.B, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
