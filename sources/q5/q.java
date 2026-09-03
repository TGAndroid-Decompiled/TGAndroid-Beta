package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject B;
    public int C;
    public boolean E;
    public c F;
    public u G;
    public j H;
    public n I;
    public boolean J;
    public MediaInfo f42876a;
    public long f42877b;
    public int f42878c;
    public double d;
    public int e;
    public int f42879f;
    public long h;
    public long f42880n;
    public double f42881r;
    public boolean f42882s;
    public long[] v;
    public int f42883w;
    public int f42884x;
    public String f42885y;
    public final ArrayList D = new ArrayList();
    public final SparseArray K = new SparseArray();

    static {
        b6.m.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z4, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z10, c cVar, u uVar, j jVar, n nVar) {
        this.f42876a = mediaInfo;
        this.f42877b = j10;
        this.f42878c = i10;
        this.d = d;
        this.e = i11;
        this.f42879f = i12;
        this.h = j11;
        this.f42880n = j12;
        this.f42881r = d10;
        this.f42882s = z4;
        this.v = jArr;
        this.f42883w = i13;
        this.f42884x = i14;
        this.f42885y = str;
        if (str != null) {
            try {
                this.B = new JSONObject(this.f42885y);
            } catch (JSONException unused) {
                this.B = null;
                this.f42885y = null;
            }
        } else {
            this.B = null;
        }
        this.C = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            f(arrayList);
        }
        this.E = z10;
        this.F = cVar;
        this.G = uVar;
        this.H = jVar;
        this.I = nVar;
        boolean z11 = false;
        if (nVar != null && nVar.f42868s) {
            z11 = true;
        }
        this.J = z11;
    }

    public final int e(int r35, org.json.JSONObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: q5.q.e(int, org.json.JSONObject):int");
    }

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.B != null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (qVar.B != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z4 == z10 && this.f42877b == qVar.f42877b && this.f42878c == qVar.f42878c && this.d == qVar.d && this.e == qVar.e && this.f42879f == qVar.f42879f && this.h == qVar.h && this.f42881r == qVar.f42881r && this.f42882s == qVar.f42882s && this.f42883w == qVar.f42883w && this.f42884x == qVar.f42884x && this.C == qVar.C && Arrays.equals(this.v, qVar.v) && u5.a.d(Long.valueOf(this.f42880n), Long.valueOf(qVar.f42880n)) && u5.a.d(this.D, qVar.D) && u5.a.d(this.f42876a, qVar.f42876a) && (((jSONObject = this.B) == null || (jSONObject2 = qVar.B) == null || i6.c.a(jSONObject, jSONObject2)) && this.E == qVar.E && u5.a.d(this.F, qVar.F) && u5.a.d(this.G, qVar.G) && u5.a.d(this.H, qVar.H) && b6.m.l(this.I, qVar.I) && this.J == qVar.J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(List list) {
        ArrayList arrayList = this.D;
        arrayList.clear();
        SparseArray sparseArray = this.K;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.f42870b, Integer.valueOf(i10));
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42876a, Long.valueOf(this.f42877b), Integer.valueOf(this.f42878c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f42879f), Long.valueOf(this.h), Long.valueOf(this.f42880n), Double.valueOf(this.f42881r), Boolean.valueOf(this.f42882s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f42883w), Integer.valueOf(this.f42884x), String.valueOf(this.B), Integer.valueOf(this.C), this.D, Boolean.valueOf(this.E), this.F, this.G, this.H, this.I});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.B;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f42885y = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42876a, i10);
        long j10 = this.f42877b;
        f5.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.f42878c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f42879f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        f5.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f42880n;
        f5.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f42881r;
        f5.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z4 = this.f42882s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.j(parcel, 12, this.v);
        int i14 = this.f42883w;
        f5.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f42884x;
        f5.s(parcel, 14, 4);
        parcel.writeInt(i15);
        f5.l(parcel, 15, this.f42885y);
        int i16 = this.C;
        f5.s(parcel, 16, 4);
        parcel.writeInt(i16);
        f5.p(parcel, 17, this.D);
        boolean z10 = this.E;
        f5.s(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.k(parcel, 19, this.F, i10);
        f5.k(parcel, 20, this.G, i10);
        f5.k(parcel, 21, this.H, i10);
        f5.k(parcel, 22, this.I, i10);
        f5.r(parcel, q10);
    }
}
