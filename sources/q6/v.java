package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.yh;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new l4.j(27);
    public final y f44763a;
    public final b0 f44764b;
    public final byte[] f44765c;
    public final List d;
    public final Double f44766e;
    public final List f44767f;
    public final m h;
    public final Integer f44768n;
    public final h0 f44769r;
    public final e f44770s;
    public final f v;
    public final String f44771w;
    public final ResultReceiver f44772x;

    public v(String str) {
        try {
            v e6 = e(new JSONObject(str));
            this.f44763a = e6.f44763a;
            this.f44764b = e6.f44764b;
            this.f44765c = e6.f44765c;
            this.d = e6.d;
            this.f44766e = e6.f44766e;
            this.f44767f = e6.f44767f;
            this.h = e6.h;
            this.f44768n = e6.f44768n;
            this.f44769r = e6.f44769r;
            this.f44770s = e6.f44770s;
            this.v = e6.v;
            this.f44771w = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static q6.v e(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: q6.v.e(org.json.JSONObject):q6.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f44767f;
        if (b6.m.l(this.f44763a, vVar.f44763a) && b6.m.l(this.f44764b, vVar.f44764b) && Arrays.equals(this.f44765c, vVar.f44765c) && b6.m.l(this.f44766e, vVar.f44766e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f44767f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && b6.m.l(this.h, vVar.h) && b6.m.l(this.f44768n, vVar.f44768n) && b6.m.l(this.f44769r, vVar.f44769r) && b6.m.l(this.f44770s, vVar.f44770s) && b6.m.l(this.v, vVar.v) && b6.m.l(this.f44771w, vVar.f44771w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44763a, this.f44764b, Integer.valueOf(Arrays.hashCode(this.f44765c)), this.d, this.f44766e, this.f44767f, this.h, this.f44768n, this.f44769r, this.f44770s, this.v, this.f44771w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44763a);
        String valueOf2 = String.valueOf(this.f44764b);
        String c3 = i6.b.c(this.f44765c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f44767f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f44769r);
        String valueOf7 = String.valueOf(this.f44770s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder m9 = yh.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        yh.w(m9, c3, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m9.append(this.f44766e);
        m9.append(", \n excludeList=");
        m9.append(valueOf4);
        m9.append(", \n authenticatorSelection=");
        m9.append(valueOf5);
        m9.append(", \n requestId=");
        m9.append(this.f44768n);
        m9.append(", \n tokenBinding=");
        m9.append(valueOf6);
        m9.append(", \n attestationConveyancePreference=");
        m9.append(valueOf7);
        m9.append(", \n authenticationExtensions=");
        m9.append(valueOf8);
        m9.append("}");
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44763a, i10);
        g5.k(parcel, 3, this.f44764b, i10);
        g5.c(parcel, 4, this.f44765c);
        g5.p(parcel, 5, this.d);
        Double d = this.f44766e;
        if (d != null) {
            g5.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        g5.p(parcel, 7, this.f44767f);
        g5.k(parcel, 8, this.h, i10);
        g5.i(parcel, 9, this.f44768n);
        g5.k(parcel, 10, this.f44769r, i10);
        e eVar = this.f44770s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f44687a;
        }
        g5.l(parcel, 11, str);
        g5.k(parcel, 12, this.v, i10);
        g5.l(parcel, 13, this.f44771w);
        g5.k(parcel, 14, this.f44772x, i10);
        g5.r(parcel, q10);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f44772x = resultReceiver;
        if (str2 != null) {
            try {
                v e6 = e(new JSONObject(str2));
                this.f44763a = e6.f44763a;
                this.f44764b = e6.f44764b;
                this.f44765c = e6.f44765c;
                this.d = e6.d;
                this.f44766e = e6.f44766e;
                this.f44767f = e6.f44767f;
                this.h = e6.h;
                this.f44768n = e6.f44768n;
                this.f44769r = e6.f44769r;
                this.f44770s = e6.f44770s;
                this.v = e6.v;
                this.f44771w = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        b6.m.h(yVar);
        this.f44763a = yVar;
        b6.m.h(b0Var);
        this.f44764b = b0Var;
        b6.m.h(bArr);
        this.f44765c = bArr;
        b6.m.h(arrayList);
        this.d = arrayList;
        this.f44766e = d;
        this.f44767f = arrayList2;
        this.h = mVar;
        this.f44768n = num;
        this.f44769r = h0Var;
        if (str != null) {
            try {
                this.f44770s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f44770s = null;
        }
        this.v = fVar;
        this.f44771w = null;
    }
}
