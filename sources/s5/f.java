package s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.l0;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kf.k0;
import r5.c0;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final l0 V;
    public static final int[] W;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final p S;
    public final boolean T;
    public final boolean U;
    public final ArrayList f44126a;
    public final int[] f44127b;
    public final long f44128c;
    public final String d;
    public final int e;
    public final int f44129f;
    public final int h;
    public final int f44130n;
    public final int f44131r;
    public final int f44132s;
    public final int v;
    public final int f44133w;
    public final int f44134x;
    public final int f44135y;

    static {
        e0 e0Var = g0.f3042b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(k0.j(i10, "at index "));
            }
        }
        V = g0.r(2, objArr);
        W = new int[]{0, 1};
        CREATOR = new c0(2);
    }

    public f(List list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z4, boolean z10) {
        p aVar;
        this.f44126a = new ArrayList(list);
        this.f44127b = Arrays.copyOf(iArr, iArr.length);
        this.f44128c = j10;
        this.d = str;
        this.e = i10;
        this.f44129f = i11;
        this.h = i12;
        this.f44130n = i13;
        this.f44131r = i14;
        this.f44132s = i15;
        this.v = i16;
        this.f44133w = i17;
        this.f44134x = i18;
        this.f44135y = i19;
        this.B = i20;
        this.C = i21;
        this.D = i22;
        this.E = i23;
        this.F = i24;
        this.G = i25;
        this.H = i26;
        this.I = i27;
        this.J = i28;
        this.K = i29;
        this.L = i30;
        this.M = i31;
        this.N = i32;
        this.O = i33;
        this.P = i34;
        this.Q = i35;
        this.R = i36;
        this.T = z4;
        this.U = z10;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof p) {
                aVar = (p) queryLocalInterface;
            } else {
                aVar = new a7.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
            }
        }
        this.S = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q10 = f5.q(parcel, 20293);
        f5.n(parcel, 2, this.f44126a);
        int[] iArr = this.f44127b;
        f5.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.f44128c);
        f5.l(parcel, 5, this.d);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.e);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.f44129f);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.f44130n);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.f44131r);
        f5.s(parcel, 11, 4);
        parcel.writeInt(this.f44132s);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        f5.s(parcel, 13, 4);
        parcel.writeInt(this.f44133w);
        f5.s(parcel, 14, 4);
        parcel.writeInt(this.f44134x);
        f5.s(parcel, 15, 4);
        parcel.writeInt(this.f44135y);
        f5.s(parcel, 16, 4);
        parcel.writeInt(this.B);
        f5.s(parcel, 17, 4);
        parcel.writeInt(this.C);
        f5.s(parcel, 18, 4);
        parcel.writeInt(this.D);
        f5.s(parcel, 19, 4);
        parcel.writeInt(this.E);
        f5.s(parcel, 20, 4);
        parcel.writeInt(this.F);
        f5.s(parcel, 21, 4);
        parcel.writeInt(this.G);
        f5.s(parcel, 22, 4);
        parcel.writeInt(this.H);
        f5.s(parcel, 23, 4);
        parcel.writeInt(this.I);
        f5.s(parcel, 24, 4);
        parcel.writeInt(this.J);
        f5.s(parcel, 25, 4);
        parcel.writeInt(this.K);
        f5.s(parcel, 26, 4);
        parcel.writeInt(this.L);
        f5.s(parcel, 27, 4);
        parcel.writeInt(this.M);
        f5.s(parcel, 28, 4);
        parcel.writeInt(this.N);
        f5.s(parcel, 29, 4);
        parcel.writeInt(this.O);
        f5.s(parcel, 30, 4);
        parcel.writeInt(this.P);
        f5.s(parcel, 31, 4);
        parcel.writeInt(this.Q);
        f5.s(parcel, 32, 4);
        parcel.writeInt(this.R);
        p pVar = this.S;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f123b;
        }
        f5.f(parcel, 33, iBinder);
        f5.s(parcel, 34, 4);
        parcel.writeInt(this.T ? 1 : 0);
        f5.s(parcel, 35, 4);
        parcel.writeInt(this.U ? 1 : 0);
        f5.r(parcel, q10);
    }
}
