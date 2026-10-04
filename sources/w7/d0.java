package w7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
public abstract class d0 {
    public static Parcelable a(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) b(parcelable);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) b((Parcelable) creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static Object b(Parcelable parcelable) {
        if (Build.VERSION.SDK_INT < 23) {
            if (parcelable instanceof MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f1950b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f1951a, mediaDescriptionCompat.f1952b, mediaDescriptionCompat.f1953c, mediaDescriptionCompat.d, mediaDescriptionCompat.f1954e, mediaDescriptionCompat.f1955f, mediaDescriptionCompat.h, mediaDescriptionCompat.f1956n), mediaBrowserCompat$MediaItem.f1949a);
            } else if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f1951a, mediaDescriptionCompat2.f1952b, mediaDescriptionCompat2.f1953c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.f1954e, mediaDescriptionCompat2.f1955f, mediaDescriptionCompat2.h, mediaDescriptionCompat2.f1956n);
            }
        }
        return parcelable;
    }
}
