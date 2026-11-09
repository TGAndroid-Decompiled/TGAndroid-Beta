package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53785a;
    public final CharSequence f53786b;
    public final CharSequence f53787c;
    public final CharSequence d;
    public final Bitmap f53788e;
    public byte[] f53789f;
    public final Uri h;
    public final Bundle f53790n;
    public final Uri f53791r;
    public MediaDescription f53792s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53785a = str;
        this.f53786b = charSequence;
        this.f53787c = charSequence2;
        this.d = charSequence3;
        this.f53788e = bitmap;
        this.h = uri;
        this.f53790n = bundle;
        this.f53791r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53792s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53785a);
        builder.setTitle(this.f53786b);
        builder.setSubtitle(this.f53787c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53788e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53790n);
        builder.setMediaUri(this.f53791r);
        MediaDescription build = builder.build();
        this.f53792s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53786b) + ", " + ((Object) this.f53787c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
