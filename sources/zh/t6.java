package zh;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class t6 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new s6(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(hc.b.j(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        s6 s6Var = new s6(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(s6Var.getObjectSize());
            s6Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
