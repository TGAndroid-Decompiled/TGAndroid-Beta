package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import w7.i;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new i(12);
    public final String f49089a;
    public final String f49090b;
    public final String f49091c;
    public final String d;
    public final a f49092e;
    public final String f49093f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f49089a = str;
        this.f49090b = str2;
        this.f49091c = str3;
        this.d = str4;
        this.f49092e = aVar;
        this.f49093f = str5;
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = Bundle.EMPTY;
        }
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader != null) {
            this.h.setClassLoader(classLoader);
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionImpl { { actionType: '");
        sb2.append(this.f49089a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f49090b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f49091c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f49092e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f49093f;
        if (str2 != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        Bundle bundle = this.h;
        if (!bundle.isEmpty()) {
            sb2.append("{ ");
            sb2.append(bundle);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f49089a);
        p8.l(parcel, 2, this.f49090b);
        p8.l(parcel, 3, this.f49091c);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.f49092e, i9);
        p8.l(parcel, 6, this.f49093f);
        p8.b(parcel, 7, this.h);
        p8.r(parcel, q10);
    }
}
