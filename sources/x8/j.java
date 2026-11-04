package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new w8.b(5);
    public boolean f58550a;
    public boolean f58551b;
    public c f58552c;
    public boolean d;
    public m f58553e;
    public ArrayList f58554f;
    public l h;
    public n f58555n;
    public boolean f58556r;
    public String f58557s;
    public Bundle f58558w;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        boolean z10 = this.f58550a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f58551b;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.l(parcel, 3, this.f58552c, i3);
        boolean z12 = this.d;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        j8.a.l(parcel, 5, this.f58553e, i3);
        j8.a.i(parcel, 6, this.f58554f);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.l(parcel, 8, this.f58555n, i3);
        boolean z13 = this.f58556r;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        j8.a.m(parcel, 10, this.f58557s);
        j8.a.c(parcel, 11, this.f58558w);
        j8.a.t(parcel, s6);
    }
}
