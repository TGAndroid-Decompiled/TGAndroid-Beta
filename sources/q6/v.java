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
import org.telegram.ui.ai;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new l4.j(27);
    public final y f42997a;
    public final b0 f42998b;
    public final byte[] f42999c;
    public final List d;
    public final Double e;
    public final List f43000f;
    public final m h;
    public final Integer f43001n;
    public final h0 f43002r;
    public final e f43003s;
    public final f v;
    public final String f43004w;
    public final ResultReceiver f43005x;

    public v(String str) {
        try {
            v e = e(new JSONObject(str));
            this.f42997a = e.f42997a;
            this.f42998b = e.f42998b;
            this.f42999c = e.f42999c;
            this.d = e.d;
            this.e = e.e;
            this.f43000f = e.f43000f;
            this.h = e.h;
            this.f43001n = e.f43001n;
            this.f43002r = e.f43002r;
            this.f43003s = e.f43003s;
            this.v = e.v;
            this.f43004w = str;
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
        List list3 = vVar.f43000f;
        if (b6.m.l(this.f42997a, vVar.f42997a) && b6.m.l(this.f42998b, vVar.f42998b) && Arrays.equals(this.f42999c, vVar.f42999c) && b6.m.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f43000f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && b6.m.l(this.h, vVar.h) && b6.m.l(this.f43001n, vVar.f43001n) && b6.m.l(this.f43002r, vVar.f43002r) && b6.m.l(this.f43003s, vVar.f43003s) && b6.m.l(this.v, vVar.v) && b6.m.l(this.f43004w, vVar.f43004w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42997a, this.f42998b, Integer.valueOf(Arrays.hashCode(this.f42999c)), this.d, this.e, this.f43000f, this.h, this.f43001n, this.f43002r, this.f43003s, this.v, this.f43004w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42997a);
        String valueOf2 = String.valueOf(this.f42998b);
        String c3 = i6.b.c(this.f42999c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f43000f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f43002r);
        String valueOf7 = String.valueOf(this.f43003s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder l10 = ai.l("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        ai.w(l10, c3, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        l10.append(this.e);
        l10.append(", \n excludeList=");
        l10.append(valueOf4);
        l10.append(", \n authenticatorSelection=");
        l10.append(valueOf5);
        l10.append(", \n requestId=");
        l10.append(this.f43001n);
        l10.append(", \n tokenBinding=");
        l10.append(valueOf6);
        l10.append(", \n attestationConveyancePreference=");
        l10.append(valueOf7);
        l10.append(", \n authenticationExtensions=");
        l10.append(valueOf8);
        l10.append("}");
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42997a, i10);
        f5.k(parcel, 3, this.f42998b, i10);
        f5.c(parcel, 4, this.f42999c);
        f5.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            f5.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        f5.p(parcel, 7, this.f43000f);
        f5.k(parcel, 8, this.h, i10);
        f5.i(parcel, 9, this.f43001n);
        f5.k(parcel, 10, this.f43002r, i10);
        e eVar = this.f43003s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f42926a;
        }
        f5.l(parcel, 11, str);
        f5.k(parcel, 12, this.v, i10);
        f5.l(parcel, 13, this.f43004w);
        f5.k(parcel, 14, this.f43005x, i10);
        f5.r(parcel, q10);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f43005x = resultReceiver;
        if (str2 != null) {
            try {
                v e = e(new JSONObject(str2));
                this.f42997a = e.f42997a;
                this.f42998b = e.f42998b;
                this.f42999c = e.f42999c;
                this.d = e.d;
                this.e = e.e;
                this.f43000f = e.f43000f;
                this.h = e.h;
                this.f43001n = e.f43001n;
                this.f43002r = e.f43002r;
                this.f43003s = e.f43003s;
                this.v = e.v;
                this.f43004w = str2;
                return;
            } catch (JSONException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        b6.m.h(yVar);
        this.f42997a = yVar;
        b6.m.h(b0Var);
        this.f42998b = b0Var;
        b6.m.h(bArr);
        this.f42999c = bArr;
        b6.m.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f43000f = arrayList2;
        this.h = mVar;
        this.f43001n = num;
        this.f43002r = h0Var;
        if (str != null) {
            try {
                this.f43003s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f43003s = null;
        }
        this.v = fVar;
        this.f43004w = null;
    }
}
