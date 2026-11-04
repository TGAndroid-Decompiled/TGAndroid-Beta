package z7;
public enum c7 implements z {
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
    
    public final int f59823a;

    c7(int i3) {
        this.f59823a = i3;
    }

    @Override
    public final int zza() {
        return this.f59823a;
    }
}
