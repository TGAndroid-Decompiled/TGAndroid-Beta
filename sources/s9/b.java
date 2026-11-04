package s9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q8.i;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(9);
    public final String f54683a;
    public final String f54684b;
    public final String f54685c;
    public final String d;
    public final a f54686e;
    public final String f54687f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f54683a = str;
        this.f54684b = str2;
        this.f54685c = str3;
        this.d = str4;
        this.f54686e = aVar;
        this.f54687f = str5;
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
        sb2.append(this.f54683a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f54684b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f54685c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f54686e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f54687f;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f54683a);
        j8.a.m(parcel, 2, this.f54684b);
        j8.a.m(parcel, 3, this.f54685c);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.f54686e, i3);
        j8.a.m(parcel, 6, this.f54687f);
        j8.a.c(parcel, 7, this.h);
        j8.a.t(parcel, s6);
    }
}
