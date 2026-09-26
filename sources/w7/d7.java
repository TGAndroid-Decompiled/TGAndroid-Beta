package w7;
public enum d7 implements b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f44912a;

    d7(int i10) {
        this.f44912a = i10;
    }

    @Override
    public final int zza() {
        return this.f44912a;
    }
}
