package u0;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import q4.x;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new x(26);
    public int f56174a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return p0.n(this.f56174a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f56174a);
    }
}
