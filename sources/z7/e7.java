package z7;
public enum e7 implements b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f59753a;

    e7(int i7) {
        this.f59753a = i7;
    }

    @Override
    public final int zza() {
        return this.f59753a;
    }
}
