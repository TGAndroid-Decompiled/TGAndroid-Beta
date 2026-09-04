package x7;
public enum d7 implements a0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    
    public final int f48958a;

    d7(int i10) {
        this.f48958a = i10;
    }

    @Override
    public final int zza() {
        return this.f48958a;
    }
}
