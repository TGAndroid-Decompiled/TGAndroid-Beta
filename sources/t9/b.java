package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(24);
    public final String f57056a;
    public final String f57057b;
    public final String f57058c;
    public final String d;
    public final a f57059e;
    public final String f57060f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f57056a = str;
        this.f57057b = str2;
        this.f57058c = str3;
        this.d = str4;
        this.f57059e = aVar;
        this.f57060f = str5;
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
        sb2.append(this.f57056a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f57057b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f57058c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f57059e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f57060f;
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f57056a);
        yb.l(parcel, 2, this.f57057b);
        yb.l(parcel, 3, this.f57058c);
        yb.l(parcel, 4, this.d);
        yb.k(parcel, 5, this.f57059e, i7);
        yb.l(parcel, 6, this.f57060f);
        yb.b(parcel, 7, this.h);
        yb.s(parcel, r10);
    }
}
