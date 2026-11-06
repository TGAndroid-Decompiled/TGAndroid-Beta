package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(24);
    public final String f55369a;
    public final String f55370b;
    public final String f55371c;
    public final String d;
    public final a f55372e;
    public final String f55373f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f55369a = str;
        this.f55370b = str2;
        this.f55371c = str3;
        this.d = str4;
        this.f55372e = aVar;
        this.f55373f = str5;
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
        sb2.append(this.f55369a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f55370b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f55371c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f55372e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f55373f;
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f55369a);
        xb.l(parcel, 2, this.f55370b);
        xb.l(parcel, 3, this.f55371c);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f55372e, i7);
        xb.l(parcel, 6, this.f55373f);
        xb.b(parcel, 7, this.h);
        xb.s(parcel, r10);
    }
}
