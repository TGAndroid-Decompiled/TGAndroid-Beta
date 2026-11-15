package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f55221a;
    public final CharSequence f55222b;
    public final CharSequence f55223c;
    public final CharSequence d;
    public final Bitmap f55224e;
    public byte[] f55225f;
    public final Uri h;
    public final Bundle f55226n;
    public final Uri f55227r;
    public MediaDescription f55228s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55221a = str;
        this.f55222b = charSequence;
        this.f55223c = charSequence2;
        this.d = charSequence3;
        this.f55224e = bitmap;
        this.h = uri;
        this.f55226n = bundle;
        this.f55227r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f55228s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f55221a);
        builder.setTitle(this.f55222b);
        builder.setSubtitle(this.f55223c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f55224e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f55226n);
        builder.setMediaUri(this.f55227r);
        MediaDescription build = builder.build();
        this.f55228s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f55222b) + ", " + ((Object) this.f55223c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
