package y5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class a extends c6.a {
    public final int f50757a;
    public final int f50758b;
    public final PendingIntent f50759c;
    public final String d;
    public static final a f50756e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new p(20);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f50757a = i10;
        this.f50758b = i11;
        this.f50759c = pendingIntent;
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
                                return l.d.k(i10, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean e() {
        if (this.f50758b != 0 && this.f50759c != null) {
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
        if (this.f50758b == aVar.f50758b && b6.m.l(this.f50759c, aVar.f50759c) && b6.m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f50758b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50758b), this.f50759c, this.d});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(g(this.f50758b), "statusCode");
        bVar.r(this.f50759c, "resolution");
        bVar.r(this.d, "message");
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f50757a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f50758b);
        g5.k(parcel, 3, this.f50759c, i10);
        g5.l(parcel, 4, this.d);
        g5.r(parcel, q10);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
