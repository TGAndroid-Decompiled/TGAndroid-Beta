package w7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
public abstract class b0 {
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
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f1796b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f1797a, mediaDescriptionCompat.f1798b, mediaDescriptionCompat.f1799c, mediaDescriptionCompat.d, mediaDescriptionCompat.e, mediaDescriptionCompat.f1800f, mediaDescriptionCompat.h, mediaDescriptionCompat.f1801n), mediaBrowserCompat$MediaItem.f1795a);
            } else if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f1797a, mediaDescriptionCompat2.f1798b, mediaDescriptionCompat2.f1799c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.e, mediaDescriptionCompat2.f1800f, mediaDescriptionCompat2.h, mediaDescriptionCompat2.f1801n);
            }
        }
        return parcelable;
    }
}
