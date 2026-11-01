package th;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 {
    public int f49694a;
    public String f49695b;
    public TLRPC.Photo f49696c;
    public TLRPC.Document d;

    public static y4 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f49694a = tL_storyAlbum.album_id;
        obj.f49695b = tL_storyAlbum.title;
        obj.f49696c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
