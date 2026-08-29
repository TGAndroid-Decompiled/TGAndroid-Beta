package w5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
import java.util.Arrays;
public final class a extends a6.a {
    public final int f49758a;
    public final int f49759b;
    public final PendingIntent f49760c;
    public final String d;
    public static final a f49757e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new s6.i(29);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f49758a = i10;
        this.f49759b = i11;
        this.f49760c = pendingIntent;
        this.d = str;
    }

    public static String d(int i10) {
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
                                return l1.l(i10, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean b() {
        if (this.f49759b != 0 && this.f49760c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f49759b == 0) {
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
        if (this.f49759b == aVar.f49759b && z5.l.l(this.f49760c, aVar.f49760c) && z5.l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49759b), this.f49760c, this.d});
    }

    public final String toString() {
        v5.n nVar = new v5.n(this);
        nVar.g(d(this.f49759b), "statusCode");
        nVar.g(this.f49760c, "resolution");
        nVar.g(this.d, "message");
        return nVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f49758a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f49759b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f49760c, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
