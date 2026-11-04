package y7;
public enum e7 implements b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f59078a;

    e7(int i3) {
        this.f59078a = i3;
    }

    @Override
    public final int zza() {
        return this.f59078a;
    }
}
