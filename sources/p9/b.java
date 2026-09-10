package p9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(4);
    public final String f39868a;
    public final String f39869b;
    public final String f39870c;
    public final String d;
    public final a e;
    public final String f39871f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f39868a = str;
        this.f39869b = str2;
        this.f39870c = str3;
        this.d = str4;
        this.e = aVar;
        this.f39871f = str5;
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
        sb2.append(this.f39868a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f39869b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f39870c);
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
        String str2 = this.f39871f;
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
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f39868a);
        e0.l(parcel, 2, this.f39869b);
        e0.l(parcel, 3, this.f39870c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f39871f);
        e0.b(parcel, 7, this.h);
        e0.r(parcel, q6);
    }
}
