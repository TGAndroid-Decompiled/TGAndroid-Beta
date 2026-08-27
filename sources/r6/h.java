package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w0(26);

    public final String f46843a;

    public final Bundle f46844b;

    public final Bundle f46845c;
    public final String d;

    public final String f46846e;

    public final String f46847f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f46843a = type;
        this.f46844b = credentialRetrievalData;
        this.f46845c = candidateQueryData;
        this.d = requestMatcher;
        this.f46846e = requestType;
        this.f46847f = protocolType;
        boolean z10 = (gd.j.e(requestType) || gd.j.e(protocolType)) ? false : true;
        boolean z11 = !gd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z10 || z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
        i0.a.z(sb2, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(a9.p.n(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.l(dest, 1, this.f46843a);
        r8.b(dest, 2, this.f46844b);
        r8.b(dest, 3, this.f46845c);
        r8.l(dest, 4, this.d);
        r8.l(dest, 5, this.f46846e);
        r8.l(dest, 6, this.f46847f);
        r8.r(dest, iQ);
    }
}
