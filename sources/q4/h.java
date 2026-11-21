package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f55836a;
    public final CharSequence f55837b;
    public final CharSequence f55838c;
    public final CharSequence d;
    public final Bitmap f55839e;
    public byte[] f55840f;
    public final Uri h;
    public final Bundle f55841n;
    public final Uri f55842r;
    public MediaDescription f55843s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55836a = str;
        this.f55837b = charSequence;
        this.f55838c = charSequence2;
        this.d = charSequence3;
        this.f55839e = bitmap;
        this.h = uri;
        this.f55841n = bundle;
        this.f55842r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f55843s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f55836a);
        builder.setTitle(this.f55837b);
        builder.setSubtitle(this.f55838c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f55839e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f55841n);
        builder.setMediaUri(this.f55842r);
        MediaDescription build = builder.build();
        this.f55843s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f55837b) + ", " + ((Object) this.f55838c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
