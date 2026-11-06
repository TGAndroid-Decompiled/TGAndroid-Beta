package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53679a;
    public final CharSequence f53680b;
    public final CharSequence f53681c;
    public final CharSequence d;
    public final Bitmap f53682e;
    public byte[] f53683f;
    public final Uri h;
    public final Bundle f53684n;
    public final Uri f53685r;
    public MediaDescription f53686s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53679a = str;
        this.f53680b = charSequence;
        this.f53681c = charSequence2;
        this.d = charSequence3;
        this.f53682e = bitmap;
        this.h = uri;
        this.f53684n = bundle;
        this.f53685r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53686s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53679a);
        builder.setTitle(this.f53680b);
        builder.setSubtitle(this.f53681c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53682e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53684n);
        builder.setMediaUri(this.f53685r);
        MediaDescription build = builder.build();
        this.f53686s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53680b) + ", " + ((Object) this.f53681c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
