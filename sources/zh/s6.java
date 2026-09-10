package zh;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 extends TLObject {
    public final TL_stories.StoryItem f48872a;
    public int f48873b;

    public s6(TL_stories.StoryItem storyItem) {
        int i10;
        int i11;
        this.f48873b = 0;
        this.f48872a = storyItem;
        boolean z10 = storyItem.translated;
        this.f48873b = z10 ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i12 = (z10 ? 1 : 0) + i10;
        this.f48873b = i12;
        if (storyItem.translatedText != null) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i12 + i11;
        this.f48873b = i13;
        this.f48873b = i13 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f48873b = readInt32;
        if ((readInt32 & 1) == 0) {
            z11 = false;
        }
        TL_stories.StoryItem storyItem = this.f48872a;
        storyItem.translated = z11;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z10);
        }
        if ((this.f48873b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f48873b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f48873b);
        int i10 = this.f48873b & 2;
        TL_stories.StoryItem storyItem = this.f48872a;
        if (i10 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f48873b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f48873b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
