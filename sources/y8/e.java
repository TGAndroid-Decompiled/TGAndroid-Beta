package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f54219a;
    public final int f54220b;
    public final int f54221c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f54219a = fVar;
        this.f54220b = i10;
        this.f54221c = i11;
        this.d = i12;
    }

    public final void b(x8.a aVar) {
        f fVar = this.f54219a;
        int i10 = this.f54220b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
                        return;
                    }
                    aVar.a(fVar);
                    return;
                }
                aVar.c(fVar);
                return;
            }
            aVar.d(fVar);
            return;
        }
        aVar.b(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f54219a);
        int i10 = this.f54220b;
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
        int i11 = this.f54221c;
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
        StringBuilder v = a1.g.v("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        v.append(str2);
        v.append(", appErrorCode=");
        v.append(this.d);
        v.append("]");
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.f54219a, i10);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54220b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.f54221c);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
