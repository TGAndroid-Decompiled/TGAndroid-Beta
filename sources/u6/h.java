package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;
import r5.c0;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(22);
    public final String f45230a;
    public final Bundle f45231b;
    public final Bundle f45232c;
    public final String d;
    public final String e;
    public final String f45233f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z4;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f45230a = type;
        this.f45231b = credentialRetrievalData;
        this.f45232c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f45233f = protocolType;
        boolean z10 = true;
        if (!jd.j.e(requestType) && !jd.j.e(protocolType)) {
            z4 = true;
        } else {
            z4 = false;
        }
        z10 = (!jd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? false : false;
        if (!z4 && !z10) {
            StringBuilder sb = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            ai.w(sb, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(android.support.v4.media.a.p(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.l(dest, 1, this.f45230a);
        f5.b(dest, 2, this.f45231b);
        f5.b(dest, 3, this.f45232c);
        f5.l(dest, 4, this.d);
        f5.l(dest, 5, this.e);
        f5.l(dest, 6, this.f45233f);
        f5.r(dest, q10);
    }
}
