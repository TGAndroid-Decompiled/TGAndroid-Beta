package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(23);
    public int f42258a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return a4.a.n(this.f42258a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f42258a);
    }
}
