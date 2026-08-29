package s6;

import a4.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.ui.th;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final String f47655a;
    public final Bundle f47656b;
    public final Bundle f47657c;
    public final String d;
    public final String f47658e;
    public final String f47659f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f47655a = type;
        this.f47656b = credentialRetrievalData;
        this.f47657c = candidateQueryData;
        this.d = requestMatcher;
        this.f47658e = requestType;
        this.f47659f = protocolType;
        boolean z11 = true;
        if (!hd.j.e(requestType) && !hd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!hd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? false : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            th.w(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(w.o(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.l(dest, 1, this.f47655a);
        com.google.android.gms.internal.cast.o.b(dest, 2, this.f47656b);
        com.google.android.gms.internal.cast.o.b(dest, 3, this.f47657c);
        com.google.android.gms.internal.cast.o.l(dest, 4, this.d);
        com.google.android.gms.internal.cast.o.l(dest, 5, this.f47658e);
        com.google.android.gms.internal.cast.o.l(dest, 6, this.f47659f);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
