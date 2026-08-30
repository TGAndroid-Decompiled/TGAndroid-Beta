package q5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.yh;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f42779a;
    public final String f42780b;
    public final List f42781c;
    public final String d;
    public final Uri e;
    public final String f42782f;
    public final String h;
    public final Boolean f42783n;
    public final Boolean f42784r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f42779a = str;
        this.f42780b = str2;
        this.f42781c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f42782f = str4;
        this.h = str5;
        this.f42783n = bool;
        this.f42784r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (u5.a.d(this.f42779a, dVar.f42779a) && u5.a.d(this.f42780b, dVar.f42780b) && u5.a.d(this.f42781c, dVar.f42781c) && u5.a.d(this.d, dVar.d) && u5.a.d(this.e, dVar.e) && u5.a.d(this.f42782f, dVar.f42782f) && u5.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42779a, this.f42780b, this.f42781c, this.d, this.e, this.f42782f});
    }

    public final String toString() {
        int size;
        List list = this.f42781c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder m9 = yh.m("applicationId: ", this.f42779a, ", name: ", this.f42780b, ", namespaces.count: ");
        m9.append(size);
        m9.append(", senderAppIdentifier: ");
        m9.append(this.d);
        m9.append(", senderAppLaunchUrl: ");
        yh.x(m9, valueOf, ", iconUrl: ", this.f42782f, ", type: ");
        m9.append(this.h);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42779a);
        f5.l(parcel, 3, this.f42780b);
        f5.n(parcel, 5, DesugarCollections.unmodifiableList(this.f42781c));
        f5.l(parcel, 6, this.d);
        f5.k(parcel, 7, this.e, i10);
        f5.l(parcel, 8, this.f42782f);
        f5.l(parcel, 9, this.h);
        f5.a(parcel, 10, this.f42783n);
        f5.a(parcel, 11, this.f42784r);
        f5.r(parcel, q10);
    }
}
