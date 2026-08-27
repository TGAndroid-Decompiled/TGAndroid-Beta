package y8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import w7.f;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new f(21);

    public int f49801a;

    public final boolean f49802b;

    public final String f49803c;
    public final String d;

    public final byte[] f49804e;

    public final boolean f49805f;

    public a() {
        this.f49801a = 0;
        this.f49802b = true;
        this.f49803c = null;
        this.d = null;
        this.f49804e = null;
        this.f49805f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f49801a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f49802b);
        sb2.append("' } ");
        String str = this.f49803c;
        if (str != null) {
            sb2.append("{ completionToken: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb2.append("{ accountName: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        byte[] bArr = this.f49804e;
        if (bArr != null) {
            sb2.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(b10));
                sb2.append(" ");
            }
            sb2.append("] } ");
        }
        sb2.append("{ contextOnly: '");
        sb2.append(this.f49805f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f49801a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(i11);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f49802b ? 1 : 0);
        r8.l(parcel, 3, this.f49803c);
        r8.l(parcel, 4, this.d);
        r8.c(parcel, 5, this.f49804e);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f49805f ? 1 : 0);
        r8.r(parcel, iQ);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f49801a = i10;
        this.f49802b = z10;
        this.f49803c = str;
        this.d = str2;
        this.f49804e = bArr;
        this.f49805f = z11;
    }
}
