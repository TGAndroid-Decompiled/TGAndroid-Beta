package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import w7.f;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new f(20);

    public final String f49806a;

    public final String f49807b;

    public final String f49808c;
    public final String d;

    public final a f49809e;

    public final String f49810f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f49806a = str;
        this.f49807b = str2;
        this.f49808c = str3;
        this.d = str4;
        this.f49809e = aVar;
        this.f49810f = str5;
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = Bundle.EMPTY;
        }
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader != null) {
            this.h.setClassLoader(classLoader);
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new a7.c(sb2.toString());
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionImpl { { actionType: '");
        sb2.append(this.f49806a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f49807b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f49808c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f49809e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f49810f;
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
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f49806a);
        r8.l(parcel, 2, this.f49807b);
        r8.l(parcel, 3, this.f49808c);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.f49809e, i10);
        r8.l(parcel, 6, this.f49810f);
        r8.b(parcel, 7, this.h);
        r8.r(parcel, iQ);
    }
}
