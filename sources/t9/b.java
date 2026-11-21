package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(24);
    public final String f57671a;
    public final String f57672b;
    public final String f57673c;
    public final String d;
    public final a f57674e;
    public final String f57675f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f57671a = str;
        this.f57672b = str2;
        this.f57673c = str3;
        this.d = str4;
        this.f57674e = aVar;
        this.f57675f = str5;
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
        sb2.append(this.f57671a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f57672b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f57673c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f57674e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f57675f;
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57671a);
        bc.l(parcel, 2, this.f57672b);
        bc.l(parcel, 3, this.f57673c);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.f57674e, i7);
        bc.l(parcel, 6, this.f57675f);
        bc.b(parcel, 7, this.h);
        bc.s(parcel, r10);
    }
}
