package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new d(1);
    public final g f52786a;
    public final int f52787b;
    public final int f52788c;
    public final int d;

    public f(g gVar, int i10, int i11, int i12) {
        this.f52786a = gVar;
        this.f52787b = i10;
        this.f52788c = i11;
        this.d = i12;
    }

    public final void b(y8.c cVar) {
        g gVar = this.f52786a;
        int i10 = this.f52787b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f52788c;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
                        return;
                    }
                    cVar.onOutputClosed(gVar, i12, i11);
                    return;
                }
                cVar.onInputClosed(gVar, i12, i11);
                return;
            }
            cVar.onChannelClosed(gVar, i12, i11);
            return;
        }
        cVar.onChannelOpened(gVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f52786a);
        int i10 = this.f52787b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = Integer.toString(i10);
                    } else {
                        str = "OUTPUT_CLOSED";
                    }
                } else {
                    str = "INPUT_CLOSED";
                }
            } else {
                str = "CHANNEL_CLOSED";
            }
        } else {
            str = "CHANNEL_OPENED";
        }
        int i11 = this.f52788c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        str2 = Integer.toString(i11);
                    } else {
                        str2 = "CLOSE_REASON_LOCAL_CLOSE";
                    }
                } else {
                    str2 = "CLOSE_REASON_REMOTE_CLOSE";
                }
            } else {
                str2 = "CLOSE_REASON_DISCONNECTED";
            }
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        StringBuilder w10 = a1.g.w("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        w10.append(str2);
        w10.append(", appErrorCode=");
        w10.append(this.d);
        w10.append("]");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f52786a, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52787b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f52788c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
