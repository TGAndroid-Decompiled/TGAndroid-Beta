package q5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.yh;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f44529a;
    public final String f44530b;
    public final List f44531c;
    public final String d;
    public final Uri f44532e;
    public final String f44533f;
    public final String h;
    public final Boolean f44534n;
    public final Boolean f44535r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f44529a = str;
        this.f44530b = str2;
        this.f44531c = arrayList;
        this.d = str3;
        this.f44532e = uri;
        this.f44533f = str4;
        this.h = str5;
        this.f44534n = bool;
        this.f44535r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (u5.a.d(this.f44529a, dVar.f44529a) && u5.a.d(this.f44530b, dVar.f44530b) && u5.a.d(this.f44531c, dVar.f44531c) && u5.a.d(this.d, dVar.d) && u5.a.d(this.f44532e, dVar.f44532e) && u5.a.d(this.f44533f, dVar.f44533f) && u5.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44529a, this.f44530b, this.f44531c, this.d, this.f44532e, this.f44533f});
    }

    public final String toString() {
        int size;
        List list = this.f44531c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f44532e);
        StringBuilder m9 = yh.m("applicationId: ", this.f44529a, ", name: ", this.f44530b, ", namespaces.count: ");
        m9.append(size);
        m9.append(", senderAppIdentifier: ");
        m9.append(this.d);
        m9.append(", senderAppLaunchUrl: ");
        yh.w(m9, valueOf, ", iconUrl: ", this.f44533f, ", type: ");
        m9.append(this.h);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44529a);
        g5.l(parcel, 3, this.f44530b);
        g5.n(parcel, 5, DesugarCollections.unmodifiableList(this.f44531c));
        g5.l(parcel, 6, this.d);
        g5.k(parcel, 7, this.f44532e, i10);
        g5.l(parcel, 8, this.f44533f);
        g5.l(parcel, 9, this.h);
        g5.a(parcel, 10, this.f44534n);
        g5.a(parcel, 11, this.f44535r);
        g5.r(parcel, q10);
    }
}
