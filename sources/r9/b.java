package r9;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new m(2);
    public final String f47315a;
    public final String f47316b;
    public final String f47317c;
    public final String d;
    public final a e;
    public final String f47318f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f47315a = str;
        this.f47316b = str2;
        this.f47317c = str3;
        this.d = str4;
        this.e = aVar;
        this.f47318f = str5;
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
        sb2.append(this.f47315a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f47316b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f47317c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f47318f;
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f47315a);
        df.l(parcel, 2, this.f47316b);
        df.l(parcel, 3, this.f47317c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.l(parcel, 6, this.f47318f);
        df.b(parcel, 7, this.h);
        df.r(parcel, q5);
    }
}
