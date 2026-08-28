package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import g7.p8;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new o5.p(16);
    public final String f46077a;
    public final Bundle f46078b;
    public final Bundle f46079c;
    public final String d;
    public final String f46080e;
    public final ResultReceiver f46081f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f46077a = type;
        this.f46078b = credentialData;
        this.f46079c = candidateQueryData;
        this.d = str;
        this.f46080e = str2;
        this.f46081f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.l(dest, 1, this.f46077a);
        p8.b(dest, 2, this.f46078b);
        p8.b(dest, 3, this.f46079c);
        p8.l(dest, 4, this.d);
        p8.l(dest, 5, this.f46080e);
        p8.k(dest, 6, this.f46081f, i9);
        p8.r(dest, q10);
    }
}
