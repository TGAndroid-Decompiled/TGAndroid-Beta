package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j3.r0;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new o5.p(18);
    public final String f46084a;
    public final Bundle f46085b;
    public final Bundle f46086c;
    public final String d;
    public final String f46087e;
    public final String f46088f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f46084a = type;
        this.f46085b = credentialRetrievalData;
        this.f46086c = candidateQueryData;
        this.d = requestMatcher;
        this.f46087e = requestType;
        this.f46088f = protocolType;
        boolean z11 = true;
        if (!fd.j.e(requestType) && !fd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!fd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? false : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            r0.A(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(aa.d.p(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.l(dest, 1, this.f46084a);
        p8.b(dest, 2, this.f46085b);
        p8.b(dest, 3, this.f46086c);
        p8.l(dest, 4, this.d);
        p8.l(dest, 5, this.f46087e);
        p8.l(dest, 6, this.f46088f);
        p8.r(dest, q10);
    }
}
