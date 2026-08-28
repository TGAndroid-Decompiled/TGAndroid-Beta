package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new q7.j(16);
    public int f47953a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return aa.d.l(this.f47953a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f47953a);
    }
}
