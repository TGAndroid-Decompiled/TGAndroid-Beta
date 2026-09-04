package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f49592a;
    public final int f49593b;
    public final int f49594c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f49592a = fVar;
        this.f49593b = i10;
        this.f49594c = i11;
        this.d = i12;
    }

    public final void b(x8.c cVar) {
        f fVar = this.f49592a;
        int i10 = this.f49593b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f49594c;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
                        return;
                    }
                    cVar.onOutputClosed(fVar, i12, i11);
                    return;
                }
                cVar.onInputClosed(fVar, i12, i11);
                return;
            }
            cVar.onChannelClosed(fVar, i12, i11);
            return;
        }
        cVar.onChannelOpened(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f49592a);
        int i10 = this.f49593b;
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
        int i11 = this.f49594c;
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
        StringBuilder w10 = a4.a.w("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        w10.append(str2);
        w10.append(", appErrorCode=");
        w10.append(this.d);
        w10.append("]");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f49592a, i10);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49593b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f49594c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
