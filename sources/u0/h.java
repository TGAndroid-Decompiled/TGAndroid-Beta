package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import r5.c0;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new c0(11);
    public int f44979a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return android.support.v4.media.a.m(this.f44979a, "}", sb);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f44979a);
    }
}
