package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import h7.r8;
import n6.w0;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new w0(24);

    public final String f46836a;

    public final Bundle f46837b;

    public final Bundle f46838c;
    public final String d;

    public final String f46839e;

    public final ResultReceiver f46840f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f46836a = type;
        this.f46837b = credentialData;
        this.f46838c = candidateQueryData;
        this.d = str;
        this.f46839e = str2;
        this.f46840f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.l(dest, 1, this.f46836a);
        r8.b(dest, 2, this.f46837b);
        r8.b(dest, 3, this.f46838c);
        r8.l(dest, 4, this.d);
        r8.l(dest, 5, this.f46839e);
        r8.k(dest, 6, this.f46840f, i10);
        r8.r(dest, iQ);
    }
}
