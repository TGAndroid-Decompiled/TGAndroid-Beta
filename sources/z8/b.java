package z8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new k(24);
    public final String f50789a;
    public final String f50790b;
    public final String f50791c;
    public final String d;
    public final a f50792e;
    public final String f50793f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f50789a = str;
        this.f50790b = str2;
        this.f50791c = str3;
        this.d = str4;
        this.f50792e = aVar;
        this.f50793f = str5;
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
        sb2.append(this.f50789a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f50790b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f50791c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f50792e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f50793f;
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
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f50789a);
        o.l(parcel, 2, this.f50790b);
        o.l(parcel, 3, this.f50791c);
        o.l(parcel, 4, this.d);
        o.k(parcel, 5, this.f50792e, i10);
        o.l(parcel, 6, this.f50793f);
        o.b(parcel, 7, this.h);
        o.r(parcel, q6);
    }
}
