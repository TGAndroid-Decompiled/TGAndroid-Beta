package u0;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import r6.l;

public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new l(17);

    public int f48247a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return p.k(this.f48247a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f48247a);
    }
}
