package q4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(24);
    public final String f53680a;
    public final CharSequence f53681b;
    public final CharSequence f53682c;
    public final CharSequence d;
    public final Bitmap f53683e;
    public byte[] f53684f;
    public final Uri h;
    public final Bundle f53685n;
    public final Uri f53686r;
    public MediaDescription f53687s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f53680a = str;
        this.f53681b = charSequence;
        this.f53682c = charSequence2;
        this.d = charSequence3;
        this.f53683e = bitmap;
        this.h = uri;
        this.f53685n = bundle;
        this.f53686r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f53687s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f53680a);
        builder.setTitle(this.f53681b);
        builder.setSubtitle(this.f53682c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f53683e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f53685n);
        builder.setMediaUri(this.f53686r);
        MediaDescription build = builder.build();
        this.f53687s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f53681b) + ", " + ((Object) this.f53682c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        a().writeToParcel(parcel, i7);
    }
}
