package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53772a;
    public final CharSequence f53773b;
    public final CharSequence f53774c;
    public final CharSequence d;
    public final Bitmap f53775e;
    public byte[] f53776f;
    public final Uri h;
    public final Bundle f53777n;
    public final Uri f53778r;
    public MediaDescription f53779s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53772a = str;
        this.f53773b = charSequence;
        this.f53774c = charSequence2;
        this.d = charSequence3;
        this.f53775e = bitmap;
        this.h = uri;
        this.f53777n = bundle;
        this.f53778r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53779s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53772a);
        builder.setTitle(this.f53773b);
        builder.setSubtitle(this.f53774c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53775e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53777n);
        builder.setMediaUri(this.f53778r);
        MediaDescription build = builder.build();
        this.f53779s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53773b) + ", " + ((Object) this.f53774c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
