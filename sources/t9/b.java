package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(24);
    public final String f57640a;
    public final String f57641b;
    public final String f57642c;
    public final String d;
    public final a f57643e;
    public final String f57644f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f57640a = str;
        this.f57641b = str2;
        this.f57642c = str3;
        this.d = str4;
        this.f57643e = aVar;
        this.f57644f = str5;
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
        sb2.append(this.f57640a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f57641b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f57642c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f57643e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f57644f;
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f57640a);
        cc.l(parcel, 2, this.f57641b);
        cc.l(parcel, 3, this.f57642c);
        cc.l(parcel, 4, this.d);
        cc.k(parcel, 5, this.f57643e, i7);
        cc.l(parcel, 6, this.f57644f);
        cc.b(parcel, 7, this.h);
        cc.s(parcel, r10);
    }
}
