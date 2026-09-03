package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import j7.f5;
import r5.c0;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(20);
    public final String f45224a;
    public final Bundle f45225b;
    public final Bundle f45226c;
    public final String d;
    public final String e;
    public final ResultReceiver f45227f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f45224a = type;
        this.f45225b = credentialData;
        this.f45226c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f45227f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.l(dest, 1, this.f45224a);
        f5.b(dest, 2, this.f45225b);
        f5.b(dest, 3, this.f45226c);
        f5.l(dest, 4, this.d);
        f5.l(dest, 5, this.e);
        f5.k(dest, 6, this.f45227f, i10);
        f5.r(dest, q10);
    }
}
