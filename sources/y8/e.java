package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f50474a;
    public final int f50475b;
    public final int f50476c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f50474a = fVar;
        this.f50475b = i10;
        this.f50476c = i11;
        this.d = i12;
    }

    public final void b(x8.c cVar) {
        f fVar = this.f50474a;
        int i10 = this.f50475b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f50476c;
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
        String valueOf = String.valueOf(this.f50474a);
        int i10 = this.f50475b;
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
        int i11 = this.f50476c;
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 2, this.f50474a, i10);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50475b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f50476c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.g0.r(parcel, q6);
    }
}
