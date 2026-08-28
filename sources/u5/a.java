package u5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j3.r0;
import java.util.Arrays;
public final class a extends y5.a {
    public final int f48099a;
    public final int f48100b;
    public final PendingIntent f48101c;
    public final String d;
    public static final a f48098e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new q7.j(17);

    public a(int i9, int i10, PendingIntent pendingIntent, String str) {
        this.f48099a = i9;
        this.f48100b = i10;
        this.f48101c = pendingIntent;
        this.d = str;
    }

    public static String d(int i9) {
        if (i9 != 99) {
            if (i9 != 1500) {
                switch (i9) {
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
                        switch (i9) {
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
                                return r0.m(i9, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean b() {
        if (this.f48100b != 0 && this.f48101c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f48100b == 0) {
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
        if (this.f48100b == aVar.f48100b && x5.l.l(this.f48101c, aVar.f48101c) && x5.l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48100b), this.f48101c, this.d});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        eVar.c(d(this.f48100b), "statusCode");
        eVar.c(this.f48101c, "resolution");
        eVar.c(this.d, "message");
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48099a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48100b);
        p8.k(parcel, 3, this.f48101c, i9);
        p8.l(parcel, 4, this.d);
        p8.r(parcel, q10);
    }

    public a(int i9) {
        this(1, i9, null, null);
    }

    public a(int i9, PendingIntent pendingIntent) {
        this(1, i9, pendingIntent, null);
    }
}
