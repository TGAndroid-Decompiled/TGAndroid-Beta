package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f49994a;
    public final int f49995b;
    public final int f49996c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f49994a = fVar;
        this.f49995b = i10;
        this.f49996c = i11;
        this.d = i12;
    }

    public final void b(x8.c cVar) {
        f fVar = this.f49994a;
        int i10 = this.f49995b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f49996c;
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
        String valueOf = String.valueOf(this.f49994a);
        int i10 = this.f49995b;
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
        int i11 = this.f49996c;
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
        StringBuilder w9 = a1.g.w("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        w9.append(str2);
        w9.append(", appErrorCode=");
        w9.append(this.d);
        w9.append("]");
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f49994a, i10);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49995b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f49996c);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
