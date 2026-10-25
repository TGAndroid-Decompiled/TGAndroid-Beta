package x7;
public enum e7 implements b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f51446a;

    e7(int i10) {
        this.f51446a = i10;
    }

    @Override
    public final int zza() {
        return this.f51446a;
    }
}
