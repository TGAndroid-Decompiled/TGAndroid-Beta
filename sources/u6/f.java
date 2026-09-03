package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import j7.g5;
import r5.c0;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(20);
    public final String f48453a;
    public final Bundle f48454b;
    public final Bundle f48455c;
    public final String d;
    public final String f48456e;
    public final ResultReceiver f48457f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f48453a = type;
        this.f48454b = credentialData;
        this.f48455c = candidateQueryData;
        this.d = str;
        this.f48456e = str2;
        this.f48457f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.l(dest, 1, this.f48453a);
        g5.b(dest, 2, this.f48454b);
        g5.b(dest, 3, this.f48455c);
        g5.l(dest, 4, this.d);
        g5.l(dest, 5, this.f48456e);
        g5.k(dest, 6, this.f48457f, i10);
        g5.r(dest, q10);
    }
}
