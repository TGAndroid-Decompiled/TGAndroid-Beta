package s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import o6.w0;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new w0(28);
    public final String f47648a;
    public final Bundle f47649b;
    public final Bundle f47650c;
    public final String d;
    public final String f47651e;
    public final ResultReceiver f47652f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f47648a = type;
        this.f47649b = credentialData;
        this.f47650c = candidateQueryData;
        this.d = str;
        this.f47651e = str2;
        this.f47652f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.l(dest, 1, this.f47648a);
        com.google.android.gms.internal.cast.o.b(dest, 2, this.f47649b);
        com.google.android.gms.internal.cast.o.b(dest, 3, this.f47650c);
        com.google.android.gms.internal.cast.o.l(dest, 4, this.d);
        com.google.android.gms.internal.cast.o.l(dest, 5, this.f47651e);
        com.google.android.gms.internal.cast.o.k(dest, 6, this.f47652f, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
