package u0;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new s6.i(19);
    public int f48951a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return w.l(this.f48951a, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f48951a);
    }
}
