package w7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
public abstract class a0 {
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
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f776b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f777a, mediaDescriptionCompat.f778b, mediaDescriptionCompat.f779c, mediaDescriptionCompat.d, mediaDescriptionCompat.f780e, mediaDescriptionCompat.f781f, mediaDescriptionCompat.h, mediaDescriptionCompat.f782n), mediaBrowserCompat$MediaItem.f775a);
            } else if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f777a, mediaDescriptionCompat2.f778b, mediaDescriptionCompat2.f779c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.f780e, mediaDescriptionCompat2.f781f, mediaDescriptionCompat2.h, mediaDescriptionCompat2.f782n);
            }
        }
        return parcelable;
    }
}
