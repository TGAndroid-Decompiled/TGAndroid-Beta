package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p7.n;
public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator<i> CREATOR = new n(20);
    public int f49809a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return a1.g.p(sb2, this.f49809a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f49809a);
    }
}
