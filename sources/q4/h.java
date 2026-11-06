package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53655a;
    public final CharSequence f53656b;
    public final CharSequence f53657c;
    public final CharSequence d;
    public final Bitmap f53658e;
    public byte[] f53659f;
    public final Uri h;
    public final Bundle f53660n;
    public final Uri f53661r;
    public MediaDescription f53662s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53655a = str;
        this.f53656b = charSequence;
        this.f53657c = charSequence2;
        this.d = charSequence3;
        this.f53658e = bitmap;
        this.h = uri;
        this.f53660n = bundle;
        this.f53661r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53662s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53655a);
        builder.setTitle(this.f53656b);
        builder.setSubtitle(this.f53657c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53658e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53660n);
        builder.setMediaUri(this.f53661r);
        MediaDescription build = builder.build();
        this.f53662s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53656b) + ", " + ((Object) this.f53657c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
