package p4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new n8.g(9);
    public final String f53151a;
    public final CharSequence f53152b;
    public final CharSequence f53153c;
    public final CharSequence d;
    public final Bitmap f53154e;
    public byte[] f53155f;
    public final Uri h;
    public final Bundle f53156n;
    public final Uri f53157r;
    public MediaDescription f53158s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53151a = str;
        this.f53152b = charSequence;
        this.f53153c = charSequence2;
        this.d = charSequence3;
        this.f53154e = bitmap;
        this.h = uri;
        this.f53156n = bundle;
        this.f53157r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53158s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53151a);
        builder.setTitle(this.f53152b);
        builder.setSubtitle(this.f53153c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53154e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53156n);
        builder.setMediaUri(this.f53157r);
        MediaDescription build = builder.build();
        this.f53158s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53152b) + ", " + ((Object) this.f53153c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        a().writeToParcel(parcel, i3);
    }
}
