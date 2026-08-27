package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import w7.f;
import y5.l;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new f(3);

    public final int f49363a;

    public final Uri f49364b;

    public final int f49365c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f49363a = i10;
        this.f49364b = uri;
        this.f49365c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f49364b, aVar.f49364b) && this.f49365c == aVar.f49365c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49364b, Integer.valueOf(this.f49365c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.f49364b.toString();
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("Image ", this.f49365c, "x", this.d, " ");
        sbP.append(string);
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49363a);
        r8.k(parcel, 2, this.f49364b, i10);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49365c);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.r(parcel, iQ);
    }

    public a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
