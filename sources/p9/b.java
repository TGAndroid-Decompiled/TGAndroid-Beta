package p9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(4);
    public final String f44361a;
    public final String f44362b;
    public final String f44363c;
    public final String d;
    public final a f44364e;
    public final String f44365f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f44361a = str;
        this.f44362b = str2;
        this.f44363c = str3;
        this.d = str4;
        this.f44364e = aVar;
        this.f44365f = str5;
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
        sb2.append(this.f44361a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f44362b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f44363c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f44364e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f44365f;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44361a);
        g0.l(parcel, 2, this.f44362b);
        g0.l(parcel, 3, this.f44363c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f44364e, i10);
        g0.l(parcel, 6, this.f44365f);
        g0.b(parcel, 7, this.h);
        g0.r(parcel, q6);
    }
}
