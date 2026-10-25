package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import q7.m;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new m(21);
    public int f49228a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return a1.g.n(this.f49228a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f49228a);
    }
}
