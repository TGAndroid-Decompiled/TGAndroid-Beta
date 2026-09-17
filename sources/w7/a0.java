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
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f764b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f765a, mediaDescriptionCompat.f766b, mediaDescriptionCompat.f767c, mediaDescriptionCompat.d, mediaDescriptionCompat.f768e, mediaDescriptionCompat.f769f, mediaDescriptionCompat.h, mediaDescriptionCompat.f770n), mediaBrowserCompat$MediaItem.f763a);
            } else if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f765a, mediaDescriptionCompat2.f766b, mediaDescriptionCompat2.f767c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.f768e, mediaDescriptionCompat2.f769f, mediaDescriptionCompat2.h, mediaDescriptionCompat2.f770n);
            }
        }
        return parcelable;
    }
}
