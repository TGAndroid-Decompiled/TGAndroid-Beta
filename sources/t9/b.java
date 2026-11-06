package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(24);
    public final String f55345a;
    public final String f55346b;
    public final String f55347c;
    public final String d;
    public final a f55348e;
    public final String f55349f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f55345a = str;
        this.f55346b = str2;
        this.f55347c = str3;
        this.d = str4;
        this.f55348e = aVar;
        this.f55349f = str5;
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
        sb2.append(this.f55345a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f55346b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f55347c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f55348e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f55349f;
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
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f55345a);
        wb.l(parcel, 2, this.f55346b);
        wb.l(parcel, 3, this.f55347c);
        wb.l(parcel, 4, this.d);
        wb.k(parcel, 5, this.f55348e, i7);
        wb.l(parcel, 6, this.f55349f);
        wb.b(parcel, 7, this.h);
        wb.s(parcel, r10);
    }
}
