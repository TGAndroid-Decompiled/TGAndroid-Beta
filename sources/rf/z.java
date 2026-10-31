package rf;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLRPC;
public abstract class z {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z10) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        boolean z11 = false;
        TLRPC.PhotoSize w9 = b8.w(arrayList, 100, false, null, false);
        TLRPC.PhotoSize w10 = b8.w(arrayList, 1000, false, null, false);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z10;
        tL_userProfilePhoto.photo_id = photo.f19817id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        if (arrayList2 != null && arrayList2.size() > 0) {
            z11 = true;
        }
        tL_userProfilePhoto.has_video = z11;
        if (w9 != null) {
            user.photo.photo_small = w9.location;
        }
        if (w10 != null) {
            user.photo.photo_big = w10.location;
        }
    }

    public static void b(int i10, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, 100, false, null, false);
        TLRPC.PhotoSize w10 = b8.w(photo.sizes, 1000, false, null, false);
        TLRPC.PhotoSize w11 = b8.w(photo2.sizes, 100, false, null, false);
        TLRPC.PhotoSize w12 = b8.w(photo2.sizes, 1000, false, null, false);
        if (w11 != null && w9 != null) {
            b8.G(i10);
            File K = b8.K(w11, null, true, true);
            b8.G(i10);
            b8.K(w9, null, true, true).renameTo(K);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w9.location.volume_id);
            sb2.append("_");
            String p5 = a1.g.p(sb2, w9.location.local_id, "@50_50");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w11.location.volume_id);
            sb3.append("_");
            hc.D().S(p5, a1.g.p(sb3, w11.location.local_id, "@50_50"), ic.i(w9, photo));
        }
        if (w12 != null && w10 != null) {
            b8.G(i10);
            File K2 = b8.K(w12, null, true, true);
            b8.G(i10);
            b8.K(w10, null, true, true).renameTo(K2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w10.location.volume_id);
            sb4.append("_");
            String p9 = a1.g.p(sb4, w10.location.local_id, "@150_150");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(w12.location.volume_id);
            sb5.append("_");
            hc.D().S(p9, a1.g.p(sb5, w12.location.local_id, "@150_150"), ic.i(w10, photo));
        }
    }
}
