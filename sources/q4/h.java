package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f55795a;
    public final CharSequence f55796b;
    public final CharSequence f55797c;
    public final CharSequence d;
    public final Bitmap f55798e;
    public byte[] f55799f;
    public final Uri h;
    public final Bundle f55800n;
    public final Uri f55801r;
    public MediaDescription f55802s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55795a = str;
        this.f55796b = charSequence;
        this.f55797c = charSequence2;
        this.d = charSequence3;
        this.f55798e = bitmap;
        this.h = uri;
        this.f55800n = bundle;
        this.f55801r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f55802s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f55795a);
        builder.setTitle(this.f55796b);
        builder.setSubtitle(this.f55797c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f55798e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f55800n);
        builder.setMediaUri(this.f55801r);
        MediaDescription build = builder.build();
        this.f55802s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f55796b) + ", " + ((Object) this.f55797c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
