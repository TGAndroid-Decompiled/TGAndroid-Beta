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
    public final String f46690a;
    public final ArrayList f46691b;
    public final boolean f46692c;
    public final q5.i d;
    public final boolean f46693e;
    public final s5.a f46694f;
    public final boolean h;
    public final double f46695n;
    public final boolean f46696r;
    public final boolean f46697s;
    public final boolean v;
    public final List f46698w;
    public final boolean f46699x;
    public final boolean f46700y;

    static {
        new s5.f(s5.f.V, s5.f.W, 10000L, null, m7.a("smallIconDrawableResId"), m7.a("stopLiveStreamDrawableResId"), m7.a("pauseDrawableResId"), m7.a("playDrawableResId"), m7.a("skipNextDrawableResId"), m7.a("skipPrevDrawableResId"), m7.a("forwardDrawableResId"), m7.a("forward10DrawableResId"), m7.a("forward30DrawableResId"), m7.a("rewindDrawableResId"), m7.a("rewind10DrawableResId"), m7.a("rewind30DrawableResId"), m7.a("disconnectDrawableResId"), m7.a("notificationImageSizeDimenResId"), m7.a("castingToDeviceStringResId"), m7.a("stopLiveStreamStringResId"), m7.a("pauseStringResId"), m7.a("playStringResId"), m7.a("skipNextStringResId"), m7.a("skipPrevStringResId"), m7.a("forwardStringResId"), m7.a("forward10StringResId"), m7.a("forward30StringResId"), m7.a("rewindStringResId"), m7.a("rewind10StringResId"), m7.a("rewind30StringResId"), m7.a("disconnectStringResId"), null, false, false);
        F = new s5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0(0);
    }

    public b(String str, ArrayList arrayList, boolean z4, q5.i iVar, boolean z10, s5.a aVar, boolean z11, double d, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, a0 a0Var, b0 b0Var) {
        int size;
        this.f46690a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f46691b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f46692c = z4;
        this.d = iVar == null ? new q5.i() : iVar;
        this.f46693e = z10;
        this.f46694f = aVar;
        this.h = z11;
        this.f46695n = d;
        this.f46696r = z12;
        this.f46697s = z13;
        this.v = z14;
        this.f46698w = arrayList2;
        this.f46699x = z15;
        this.f46700y = z16;
        this.B = a0Var;
        this.C = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f46690a);
        g5.n(parcel, 3, DesugarCollections.unmodifiableList(this.f46691b));
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f46692c ? 1 : 0);
        g5.k(parcel, 5, this.d, i10);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f46693e ? 1 : 0);
        g5.k(parcel, 7, this.f46694f, i10);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g5.s(parcel, 9, 8);
        parcel.writeDouble(this.f46695n);
        g5.s(parcel, 10, 4);
        parcel.writeInt(this.f46696r ? 1 : 0);
        g5.s(parcel, 11, 4);
        parcel.writeInt(this.f46697s ? 1 : 0);
        g5.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        g5.n(parcel, 13, DesugarCollections.unmodifiableList(this.f46698w));
        g5.s(parcel, 14, 4);
        parcel.writeInt(this.f46699x ? 1 : 0);
        g5.s(parcel, 15, 4);
        parcel.writeInt(0);
        g5.s(parcel, 16, 4);
        parcel.writeInt(this.f46700y ? 1 : 0);
        g5.k(parcel, 17, this.B, i10);
        g5.k(parcel, 18, this.C, i10);
        g5.r(parcel, q10);
    }
}
