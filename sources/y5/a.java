package y5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import kh.a2;
import u6.p;
public final class a extends c6.a {
    public final int f47071a;
    public final int f47072b;
    public final PendingIntent f47073c;
    public final String d;
    public static final a e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new p(20);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f47071a = i10;
        this.f47072b = i11;
        this.f47073c = pendingIntent;
        this.d = str;
    }

    public static String g(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return a2.k(i10, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean e() {
        if (this.f47072b != 0 && this.f47073c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47072b == aVar.f47072b && b6.m.l(this.f47073c, aVar.f47073c) && b6.m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f47072b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47072b), this.f47073c, this.d});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.s(g(this.f47072b), "statusCode");
        bVar.s(this.f47073c, "resolution");
        bVar.s(this.d, "message");
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f47071a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f47072b);
        f5.k(parcel, 3, this.f47073c, i10);
        f5.l(parcel, 4, this.d);
        f5.r(parcel, q10);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
