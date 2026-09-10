package zh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b5 {
    public int f48308a;
    public String f48309b;
    public TLRPC.Photo f48310c;
    public TLRPC.Document d;

    public static b5 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f48308a = tL_storyAlbum.album_id;
        obj.f48309b = tL_storyAlbum.title;
        obj.f48310c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
