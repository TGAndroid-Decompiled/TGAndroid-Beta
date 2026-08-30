package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.yh;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new l4.j(27);
    public final y f42967a;
    public final b0 f42968b;
    public final byte[] f42969c;
    public final List d;
    public final Double e;
    public final List f42970f;
    public final m h;
    public final Integer f42971n;
    public final h0 f42972r;
    public final e f42973s;
    public final f v;
    public final String f42974w;
    public final ResultReceiver f42975x;

    public v(String str) {
        try {
            v e = e(new JSONObject(str));
            this.f42967a = e.f42967a;
            this.f42968b = e.f42968b;
            this.f42969c = e.f42969c;
            this.d = e.d;
            this.e = e.e;
            this.f42970f = e.f42970f;
            this.h = e.h;
            this.f42971n = e.f42971n;
            this.f42972r = e.f42972r;
            this.f42973s = e.f42973s;
            this.v = e.v;
            this.f42974w = str;
        } catch (JSONException e6) {
            throw new IllegalArgumentException(e6);
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
        List list3 = vVar.f42970f;
        if (b6.m.l(this.f42967a, vVar.f42967a) && b6.m.l(this.f42968b, vVar.f42968b) && Arrays.equals(this.f42969c, vVar.f42969c) && b6.m.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f42970f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && b6.m.l(this.h, vVar.h) && b6.m.l(this.f42971n, vVar.f42971n) && b6.m.l(this.f42972r, vVar.f42972r) && b6.m.l(this.f42973s, vVar.f42973s) && b6.m.l(this.v, vVar.v) && b6.m.l(this.f42974w, vVar.f42974w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42967a, this.f42968b, Integer.valueOf(Arrays.hashCode(this.f42969c)), this.d, this.e, this.f42970f, this.h, this.f42971n, this.f42972r, this.f42973s, this.v, this.f42974w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42967a);
        String valueOf2 = String.valueOf(this.f42968b);
        String c3 = i6.b.c(this.f42969c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f42970f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f42972r);
        String valueOf7 = String.valueOf(this.f42973s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder m9 = yh.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        yh.x(m9, c3, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m9.append(this.e);
        m9.append(", \n excludeList=");
        m9.append(valueOf4);
        m9.append(", \n authenticatorSelection=");
        m9.append(valueOf5);
        m9.append(", \n requestId=");
        m9.append(this.f42971n);
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
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42967a, i10);
        f5.k(parcel, 3, this.f42968b, i10);
        f5.c(parcel, 4, this.f42969c);
        f5.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            f5.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        f5.p(parcel, 7, this.f42970f);
        f5.k(parcel, 8, this.h, i10);
        f5.i(parcel, 9, this.f42971n);
        f5.k(parcel, 10, this.f42972r, i10);
        e eVar = this.f42973s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f42896a;
        }
        f5.l(parcel, 11, str);
        f5.k(parcel, 12, this.v, i10);
        f5.l(parcel, 13, this.f42974w);
        f5.k(parcel, 14, this.f42975x, i10);
        f5.r(parcel, q10);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f42975x = resultReceiver;
        if (str2 != null) {
            try {
                v e = e(new JSONObject(str2));
                this.f42967a = e.f42967a;
                this.f42968b = e.f42968b;
                this.f42969c = e.f42969c;
                this.d = e.d;
                this.e = e.e;
                this.f42970f = e.f42970f;
                this.h = e.h;
                this.f42971n = e.f42971n;
                this.f42972r = e.f42972r;
                this.f42973s = e.f42973s;
                this.v = e.v;
                this.f42974w = str2;
                return;
            } catch (JSONException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        b6.m.h(yVar);
        this.f42967a = yVar;
        b6.m.h(b0Var);
        this.f42968b = b0Var;
        b6.m.h(bArr);
        this.f42969c = bArr;
        b6.m.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f42970f = arrayList2;
        this.h = mVar;
        this.f42971n = num;
        this.f42972r = h0Var;
        if (str != null) {
            try {
                this.f42973s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f42973s = null;
        }
        this.v = fVar;
        this.f42974w = null;
    }
}
