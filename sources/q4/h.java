package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f55918a;
    public final CharSequence f55919b;
    public final CharSequence f55920c;
    public final CharSequence d;
    public final Bitmap f55921e;
    public byte[] f55922f;
    public final Uri h;
    public final Bundle f55923n;
    public final Uri f55924r;
    public MediaDescription f55925s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55918a = str;
        this.f55919b = charSequence;
        this.f55920c = charSequence2;
        this.d = charSequence3;
        this.f55921e = bitmap;
        this.h = uri;
        this.f55923n = bundle;
        this.f55924r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f55925s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f55918a);
        builder.setTitle(this.f55919b);
        builder.setSubtitle(this.f55920c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f55921e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f55923n);
        builder.setMediaUri(this.f55924r);
        MediaDescription build = builder.build();
        this.f55925s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f55919b) + ", " + ((Object) this.f55920c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
