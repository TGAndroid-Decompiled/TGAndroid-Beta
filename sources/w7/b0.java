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
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f1793b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f1794a, mediaDescriptionCompat.f1795b, mediaDescriptionCompat.f1796c, mediaDescriptionCompat.d, mediaDescriptionCompat.e, mediaDescriptionCompat.f1797f, mediaDescriptionCompat.h, mediaDescriptionCompat.f1798n), mediaBrowserCompat$MediaItem.f1792a);
            } else if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f1794a, mediaDescriptionCompat2.f1795b, mediaDescriptionCompat2.f1796c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.e, mediaDescriptionCompat2.f1797f, mediaDescriptionCompat2.h, mediaDescriptionCompat2.f1798n);
            }
        }
        return parcelable;
    }
}
