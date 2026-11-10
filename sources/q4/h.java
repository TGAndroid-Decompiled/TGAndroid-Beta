package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53784a;
    public final CharSequence f53785b;
    public final CharSequence f53786c;
    public final CharSequence d;
    public final Bitmap f53787e;
    public byte[] f53788f;
    public final Uri h;
    public final Bundle f53789n;
    public final Uri f53790r;
    public MediaDescription f53791s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53784a = str;
        this.f53785b = charSequence;
        this.f53786c = charSequence2;
        this.d = charSequence3;
        this.f53787e = bitmap;
        this.h = uri;
        this.f53789n = bundle;
        this.f53790r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53791s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53784a);
        builder.setTitle(this.f53785b);
        builder.setSubtitle(this.f53786c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53787e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53789n);
        builder.setMediaUri(this.f53790r);
        MediaDescription build = builder.build();
        this.f53791s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53785b) + ", " + ((Object) this.f53786c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
