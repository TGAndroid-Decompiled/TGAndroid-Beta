package q5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.ai;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f42809a;
    public final String f42810b;
    public final List f42811c;
    public final String d;
    public final Uri e;
    public final String f42812f;
    public final String h;
    public final Boolean f42813n;
    public final Boolean f42814r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f42809a = str;
        this.f42810b = str2;
        this.f42811c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f42812f = str4;
        this.h = str5;
        this.f42813n = bool;
        this.f42814r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (u5.a.d(this.f42809a, dVar.f42809a) && u5.a.d(this.f42810b, dVar.f42810b) && u5.a.d(this.f42811c, dVar.f42811c) && u5.a.d(this.d, dVar.d) && u5.a.d(this.e, dVar.e) && u5.a.d(this.f42812f, dVar.f42812f) && u5.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42809a, this.f42810b, this.f42811c, this.d, this.e, this.f42812f});
    }

    public final String toString() {
        int size;
        List list = this.f42811c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder l10 = ai.l("applicationId: ", this.f42809a, ", name: ", this.f42810b, ", namespaces.count: ");
        l10.append(size);
        l10.append(", senderAppIdentifier: ");
        l10.append(this.d);
        l10.append(", senderAppLaunchUrl: ");
        ai.w(l10, valueOf, ", iconUrl: ", this.f42812f, ", type: ");
        l10.append(this.h);
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42809a);
        f5.l(parcel, 3, this.f42810b);
        f5.n(parcel, 5, DesugarCollections.unmodifiableList(this.f42811c));
        f5.l(parcel, 6, this.d);
        f5.k(parcel, 7, this.e, i10);
        f5.l(parcel, 8, this.f42812f);
        f5.l(parcel, 9, this.h);
        f5.a(parcel, 10, this.f42813n);
        f5.a(parcel, 11, this.f42814r);
        f5.r(parcel, q10);
    }
}
